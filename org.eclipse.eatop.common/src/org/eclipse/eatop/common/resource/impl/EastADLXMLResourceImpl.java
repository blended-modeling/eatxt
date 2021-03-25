/**
 * <copyright>
 * 
 * Copyright (c) 2014 Continenetal AG, itemis and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *     Continenetal AG - Initial API and implementation
 *     itemis - Adjust eatop.common based on the new serialization resources
 * 
 * </copyright>
 */
package org.eclipse.eatop.common.resource.impl;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.artop.eel.common.resource.ExtendedEObjectInputStream;
import org.artop.eel.common.resource.ExtendedEObjectOutputStream;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.eatop.common.internal.Activator;
import org.eclipse.eatop.common.internal.UUID;
import org.eclipse.eatop.common.internal.messages.Messages;
import org.eclipse.eatop.common.preferences.IEastADLPreferences;
import org.eclipse.eatop.common.resource.EastADLURIFactory;
import org.eclipse.eatop.common.util.EastADLObjectUtil;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl;
import org.eclipse.emf.ecore.xmi.XMLLoad;
import org.eclipse.emf.ecore.xmi.XMLSave;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.osgi.util.NLS;
import org.eclipse.sphinx.emf.resource.ExtendedResource;
import org.eclipse.sphinx.emf.serialization.XMLPersistenceMappingResourceImpl;

/**
 * A Resource containing a XML representation of an EastADL model.
 */
public class EastADLXMLResourceImpl extends XMLPersistenceMappingResourceImpl {

	/**
	 * An option which set on the resource during parsing and used in the EastADLResourceHandler. The value
	 * <code>Boolean.TRUE</code> is to force iteration on the resource.
	 */
	public static final String OPTION_APPLY_RESOURCE_HANDLER = "APPLY_RESOURCE_HANDLER"; //$NON-NLS-1$

	/**
	 * {@link Adapter} providing EastADL-specific implementation of {@link ExtendedResource extended resource} services.
	 * 
	 * @see ExtendedResource
	 */
	protected ExtendedEastADLResourceAdapter extendedResource;

	/**
	 * Creates an EastADLXMLResourceImpl with the given URI.
	 * 
	 * @param uri
	 *            The URI defining the location of the EastADLXMLResourceImpl.
	 */
	public EastADLXMLResourceImpl(URI uri) {
		super(uri);

		// Install adapter providing EastADL-specific implementation of extended resource services
		extendedResource = new ExtendedEastADLResourceAdapter();
		eAdapters().add(extendedResource);
	}

	@Override
	public EObject getEObject(String uriFragment) {
		if (getContents().size() > 0) {
			return EastADLURIFactory.getEObject(getContents().get(0), uriFragment);
		}
		return null;
	}

	@Override
	public String getURIFragment(EObject object) {
		return EastADLURIFactory.getURIFragment(object);
	}

	@Override
	protected void unloaded(InternalEObject internalEObject) {
		// Delegate to implementation provided by extended resource for enabling memory-optimized unloading
		extendedResource.unloaded(internalEObject);
	}

	private Map<UUID, UUID> uuids = new HashMap<UUID, UUID>();

	protected boolean isUuidSyncingEnabled() {
		if (Platform.isRunning()) {
			return IEastADLPreferences.SYNC_UUIDS.get();
		}
		return false;
	}

	/**
	 * Returns the number of users of this identifiable UUID in this resource.
	 * 
	 * @param uuid
	 *            The UUID for which the number of users is to be retrieved.
	 * @return The number of users of the specified UUID.
	 * @generated
	 */
	public synchronized int getUuidUseCount(UUID uuid) {
		UUID repr = uuids.get(uuid);
		return repr == null ? 0 : repr.getUseCount();
	}

	/**
	 * Increases the usage counter of the given UUID.
	 * 
	 * @param uuid
	 *            The UUID for which the usage counter is to be increased.
	 */
	public synchronized void incrUuidUseCount(UUID uuid) {
		if (uuid.getData() != null) { // don't care about degenerated mode
			UUID repr = uuids.get(uuid);
			if (repr == null) {
				uuids.put(uuid, repr = uuid);
			}
			repr.incrUseCount();
		}
	}

	/**
	 * Decreases the usage counter of the given UUID.
	 * 
	 * @param uuid
	 *            The UUID for which the usage counter is to be decreased.
	 */
	public synchronized void decrUuidUseCount(UUID uuid) {
		if (uuid.getData() != null) { // don't care about degenerated mode
			UUID repr = uuids.get(uuid);
			if (repr != null) {
				repr.decrUseCount();
				if (repr.getUseCount() == 0) {
					uuids.remove(repr);
				}
			}
		}
	}

	public void syncUUIDs() {
		uuids.clear();
		for (TreeIterator<EObject> iterator = getAllContents(); iterator.hasNext();) {
			EObject object = iterator.next();
			if (object.eClass().getName().startsWith("ML")) { //$NON-NLS-1$
				iterator.prune();

			}
		}
	}

	/**
	 * Loads the inputStream from a binary resource. Currently (EMF 2.6), the only supported option is:
	 * 
	 * @see BinaryResourceImpl#OPTION_BUFFER_CAPACITY
	 * @param binaryFile
	 *            The binary file to be loaded.
	 * @param options
	 *            The options for the binary resource.
	 * @throws IOException
	 *             Any IOException raised when the binary resource loads the input stream.
	 */
	protected void loadFromBinaryFile(File binaryFile, Map<?, ?> options) throws IOException {
		InputStream inputStream = new FileInputStream(binaryFile);
		int bufferCapacity = BinaryResourceImpl.getBufferCapacity(options);
		if (bufferCapacity > 0) {
			inputStream = new BufferedInputStream(inputStream, bufferCapacity);
		}

		ExtendedEObjectInputStream eObjectInputStream = new ExtendedEObjectInputStream(inputStream, options) {

			@Override
			protected void preLoadFeatureValues(InternalEObject internalEObject, Map<String, String> destValues) throws IOException {
				// Setting the dest values shall be done after the object is fully loaded because when a reference is
				// set it's previously set dest will be cleared.
				int size = readCompressedInt();
				for (int i = 0; i < size; i++) {
					String key = readString();
					String dest = readString();
					destValues.put(key, dest);
				}
			}

			@Override
			protected void postLoadFeatureValues(InternalEObject internalEObject, Map<String, String> destValues) throws IOException {
				if (destValues != null) {
					for (String key : destValues.keySet()) {
						EastADLObjectUtil.setDest(internalEObject, key, destValues.get(key));
					}
				}
			}
		};
		eObjectInputStream.loadResource(this);
	}

	/**
	 * Gets the binary file associated with given xml file.
	 * 
	 * @param xmlFile
	 *            The xml file.
	 * @return As specified above.
	 */
	public static File getBinaryFile(File xmlFile) {
		return getBinaryPath(xmlFile).toFile();
	}

	/**
	 * Gets the path of the binary file associated with given xml file.
	 * 
	 * @param xmlFile
	 *            The xml file.
	 * @return As specified above.
	 */
	private static IPath getBinaryPath(File xmlFile) {
		// FIXME Change this and store in the project so that clean in builders destroy the cache
		return Platform.getStateLocation(Activator.getDefault().getBundle()).append(new Path(xmlFile.getAbsolutePath()).addFileExtension("arbin")); //$NON-NLS-1$
	}

	/**
	 * Returns true if and only if the binary version of given xml file has a timestamp older than given xml file
	 * timestamp.
	 * 
	 * @param xmlFile
	 *            A non null file.
	 * @return As specified above.
	 */
	protected static boolean isBinaryResourceAsOldAs(File xmlFile) {
		long xmlStamp = xmlFile.lastModified();
		long binaryStamp = getBinaryPath(xmlFile).toFile().lastModified();
		return xmlStamp != IResource.NULL_STAMP && binaryStamp >= xmlStamp;
	}

	/**
	 * Gets the file that corresponds to the uri of this resource.
	 * 
	 * @return As specifed above.
	 */
	protected File getXMLFile() {
		File xmlFile = null;
		URI convertedURI = uri;
		if (!uri.isFile() && uri.scheme() != null && uri.scheme().matches("[A-Z]")) { //$NON-NLS-1$
			convertedURI = URI.createFileURI(uri.toString());
		}
		convertedURI = CommonPlugin.asLocalURI(uri);
		if (convertedURI.isFile()) {
			xmlFile = new File(convertedURI.toFileString());
		}
		return xmlFile;
	}

	/*
	 * @see org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl#doLoad(java.io.InputStream , java.util.Map)
	 */
	@Override
	public void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {

		boolean hasLoadedFromBinaryResource = false;

		XMLLoad xmlLoad = createXMLLoad();

		if (options == null) {
			options = Collections.EMPTY_MAP;
		}

		ResourceHandler handler = (ResourceHandler) options.get(OPTION_RESOURCE_HANDLER);
		if (handler != null) {
			handler.preLoad(this, inputStream, options);
		}

		if (useBinaryResources()) {
			File xmlFile = getXMLFile();
			if (isBinaryResourceAsOldAs(xmlFile)) {
				loadFromBinaryFile(getBinaryFile(xmlFile), options);
				hasLoadedFromBinaryResource = true;
			}
		}

		if (!hasLoadedFromBinaryResource) {
			xmlLoad.load(this, inputStream, options);
			xmlLoad = null;

			// Paradoxically, when loading from XML, save to binary.
			// This supports the use case of an imported project with many existing files will not be changed.
			if (useBinaryResources()) {
				saveToBinaryResource(options);
			}
		}

		if (handler != null) {
			handler.postLoad(this, inputStream, options);
		}

		EditingDomain editingDomain = TransactionUtil.getEditingDomain(this);
		if (editingDomain != null && !editingDomain.isReadOnly(this) && isUuidSyncingEnabled()) {
			syncUUIDs();
		}
	}

	/*
	 * @see org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl#doSave(java.io.OutputStream , java.util.Map)
	 */
	@Override
	public void doSave(OutputStream outputStream, Map<?, ?> options) throws IOException {
		XMLSave xmlSave = createXMLSave();

		if (options == null) {
			options = Collections.EMPTY_MAP;
		}

		ResourceHandler handler = (ResourceHandler) options.get(OPTION_RESOURCE_HANDLER);

		if (handler != null) {
			handler.preSave(this, outputStream, options);
		}

		xmlSave.save(this, outputStream, options);

		// Saving as binary resource is now enclosed between preSave and postSave action
		if (useBinaryResources()) {
			saveToBinaryResource(options);
		}

		if (handler != null) {
			handler.postSave(this, outputStream, options);
		}

		EditingDomain editingDomain = TransactionUtil.getEditingDomain(this);
		if (editingDomain != null && !editingDomain.isReadOnly(this) && isUuidSyncingEnabled()) {
			syncUUIDs();
		}
	}

	/**
	 * Saves current resource content to a binary file.
	 * 
	 * @param options
	 *            A map that may define the buffer capacity.
	 * @throws IOException
	 *             Any IOException raised when saving.
	 * @since 3.0
	 */
	protected void saveToBinaryResource(Map<?, ?> options) throws IOException {
		File xmlFile = getXMLFile();
		File binaryFile = getBinaryFile(xmlFile);
		File parentFile = binaryFile.getParentFile();
		if (!parentFile.exists()) {
			parentFile.mkdirs();
		}
		OutputStream outputStream = new FileOutputStream(binaryFile);

		boolean buffer = true;
		int bufferCapacity = BinaryResourceImpl.getBufferCapacity(options);
		if (bufferCapacity > 0) {
			outputStream = new BufferedOutputStream(outputStream, bufferCapacity);
		} else {
			buffer = false;
		}

		try {
			ExtendedEObjectOutputStream eObjectOutputStream = new ExtendedEObjectOutputStream(outputStream, options) {

				@Override
				protected void handleAdvancedFeatures(InternalEObject internalEObject, Check check) throws IOException {
					Map<String, String> eObjectAbstractDests = EastADLObjectUtil.getEObjectAbstractDests(internalEObject);
					if (eObjectAbstractDests != null) {
						Set<Entry<String, String>> entrySet = eObjectAbstractDests.entrySet();
						int size = entrySet.size();
						writeCompressedInt(size);
						for (Entry<String, String> entry : entrySet) {
							writeString(entry.getKey());
							writeString(entry.getValue());
						}
					} else {
						writeCompressedInt(0);
					}
				}
			};
			eObjectOutputStream.saveResource(this);
		} finally {
			if (buffer) {
				outputStream.flush();
			}
			outputStream.close();
		}
	}

	@Override
	protected void doUnload() {
		super.doUnload();
		uuids.clear();
	}

	/**
	 * Recursively deletes the content of given directory.
	 * 
	 * @param dir
	 *            The directory the content of which must be deleted.
	 * @param monitor
	 *            The progress monitor.
	 */
	private static void deleteDirectoryContent(File dir, IProgressMonitor monitor) {
		try {
			final int mult = 1000;
			String taskName = NLS.bind(Messages.clearing_binaryResources, dir.toString());
			if (dir.isDirectory()) {
				File[] listFiles = dir.listFiles();
				monitor.beginTask(taskName, listFiles.length * mult);
				for (File f : listFiles) {
					if (!f.isDirectory()) {
						f.delete();
						monitor.worked(mult);
					}
				}
				for (File f : listFiles) {
					if (f.isDirectory()) {
						deleteDirectoryContent(f, new SubProgressMonitor(monitor, mult - 1));
						f.delete();
						monitor.worked(1);
					}
				}
			} else {
				monitor.beginTask(taskName, 1);
				monitor.worked(1);
			}
		} finally {
			monitor.done();
		}

	}

	public static void clearCache(IProgressMonitor monitor) {
		if (monitor == null) {
			monitor = new NullProgressMonitor();
		}

		IPath stateLocation = Platform.getStateLocation(Activator.getDefault().getBundle());
		deleteDirectoryContent(stateLocation.toFile(), monitor);
	}

	protected boolean useBinaryResources() {
		// preferences cannot be accessed in standalone mode
		if (!Platform.isRunning()) {
			return false;
		}
		return IEastADLPreferences.PREF_USE_BINARY_RESOURCE.get();
	}
}
