/**
 * Copyright (c) 2007-2013 IBM Corporation, Geensoft, itemis and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *   Geensoft - Binary resource support, release descriptor support
 *   itemis - Refactored to provide code copied from Eclipse under EPL
 */
package org.artop.eel.common.resource;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Internal;
import org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl;
import org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl.EObjectOutputStream;

public class ExtendedEObjectOutputStream extends EObjectOutputStream {

	/**
	 * A boolean flag that indicate if transient proxies should be checked or not when saving EObjects.
	 */
	protected boolean shouldCheckTransientProxy = false;

	/**
	 * Creates a new EObjectOutputStream with given outputStream and save options.
	 * 
	 * @param outputStream
	 *            an output stream.
	 * @param options
	 *            A map of options used to control the save process independently of the model.
	 * @throws IOException
	 */
	public ExtendedEObjectOutputStream(OutputStream outputStream, Map<?, ?> options) throws IOException {
		this(outputStream, options, options != null && options.containsKey(BinaryResourceImpl.OPTION_VERSION) ? (Version) options
				.get(BinaryResourceImpl.OPTION_VERSION) : Version.VERSION_1_0);
	}

	/**
	 * Creates a new EObjectOutputStream with given outputStream, save options and version.
	 * 
	 * @param outputStream
	 *            an output stream.
	 * @param options
	 *            A map of options used to control the save process independently of the model.
	 * @param version
	 *            the version to be used for the serialization.
	 * @throws IOException
	 */
	public ExtendedEObjectOutputStream(OutputStream outputStream, Map<?, ?> options, Version version) throws IOException {
		this(outputStream, options, version, version.ordinal() > 0 ? getStyle(options) : STYLE_BINARY_FLOATING_POINT);
	}

	/**
	 * Creates a new EObjectOutputStream with given outputStream, save options, version and style.
	 * 
	 * @param outputStream
	 *            an output stream.
	 * @param options
	 *            A map of options used to control the save process independently of the model.
	 * @param version
	 *            the version to be used for the serialization.
	 * @param style
	 *            the style to be used for the serialization.
	 * @throws IOException
	 */
	public ExtendedEObjectOutputStream(OutputStream outputStream, Map<?, ?> options, Version version, int style) throws IOException {
		this(outputStream, options, version, style,
				options != null && options.containsKey(IBinaryResource.OPTION_CHECK_TRANSIENT_PROXY) ? (Boolean) options
						.get(IBinaryResource.OPTION_CHECK_TRANSIENT_PROXY) : false);
	}

	/**
	 * Creates a new EObjectOutputStream with given outputStream, save options, version, style and a boolean flag that
	 * indicate if transient proxies should be checked or not when saving EObjects.
	 * 
	 * @param outputStream
	 *            an output stream.
	 * @param options
	 *            A map of options used to control the save process independently of the model.
	 * @param version
	 *            the version to be used for the serialization.
	 * @param style
	 *            the style to be used for the serialization.
	 * @param shouldCheckTransientProxy
	 *            a boolean flag that indicate if transient proxies should be checked or not when saving EObjects
	 * @throws IOException
	 */
	public ExtendedEObjectOutputStream(OutputStream outputStream, Map<?, ?> options, Version version, int style, boolean shouldCheckTransientProxy)
			throws IOException {
		super(outputStream, options, version, style);

		this.shouldCheckTransientProxy = shouldCheckTransientProxy;
	}

	/*
	 * Copied from EObjectOutputStream#saveEObject(org.eclipse.emf.ecore.InternalEObject,
	 * org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl.EObjectOutputStream.Check) to handle abstract destination.
	 * @see org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl.EObjectOutputStream#saveEObject(org.eclipse.emf.ecore
	 * .InternalEObject, org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl.EObjectOutputStream.Check)
	 */
	@Override
	public void saveEObject(InternalEObject internalEObject, Check check) throws IOException {
		if (internalEObject == null) {
			writeCompressedInt(-1);
		} else {
			Integer id = eObjectIDMap.get(internalEObject);
			if (id == null) {
				int idValue = eObjectIDMap.size();
				writeCompressedInt(idValue);
				eObjectIDMap.put(internalEObject, idValue);
				EClass eClass = internalEObject.eClass();
				EClassData eClassData = writeEClass(eClass);

				handleAdvancedFeatures(internalEObject, check);

				boolean checkIsTransientProxy = false;
				switch (check) {
				case DIRECT_RESOURCE: {
					Internal resource = internalEObject.eDirectResource();
					if (resource != null) {
						writeCompressedInt(-1);
						writeURI(resource.getURI(), resource.getURIFragment(internalEObject));

						if (!shouldCheckTransientProxy || (style & STYLE_PROXY_ATTRIBUTES) == 0) {
							return;
						}
						checkIsTransientProxy = true;
					} else if (internalEObject.eIsProxy()) {
						writeCompressedInt(-1);
						writeURI(internalEObject.eProxyURI());

						if (!shouldCheckTransientProxy || (style & STYLE_PROXY_ATTRIBUTES) == 0) {
							return;
						}
						checkIsTransientProxy = true;
					}
					break;
				}
				case RESOURCE: {
					Resource resource = internalEObject.eResource();
					if (resource != this.resource && resource != null) {
						writeCompressedInt(-1);
						writeURI(resource.getURI(), resource.getURIFragment(internalEObject));

						if (!shouldCheckTransientProxy || (style & STYLE_PROXY_ATTRIBUTES) == 0) {
							return;
						}
						checkIsTransientProxy = true;
					} else if (internalEObject.eIsProxy()) {
						writeCompressedInt(-1);
						writeURI(internalEObject.eProxyURI());

						if (!shouldCheckTransientProxy || (style & STYLE_PROXY_ATTRIBUTES) == 0) {
							return;
						}
						checkIsTransientProxy = true;
					}
					break;
				}
				case NOTHING:
				case CONTAINER: {
					break;
				}
				}
				EStructuralFeatureData[] eStructuralFeatureData = eClassData.eStructuralFeatureData;
				for (int i = 0, length = eStructuralFeatureData.length; i < length; ++i) {
					EStructuralFeatureData structuralFeatureData = eStructuralFeatureData[i];
					if (!structuralFeatureData.isTransient
							&& (structuralFeatureData.kind != FeatureKind.EOBJECT_CONTAINER_PROXY_RESOLVING || check == Check.CONTAINER)) {
						if (!shouldCheckTransientProxy) {
							saveFeatureValue(internalEObject, i, structuralFeatureData);
						} else {
							if (!checkIsTransientProxy || !structuralFeatureData.isProxyTransient) {
								saveFeatureValue(internalEObject, i, structuralFeatureData);
							}
						}
					}
				}
				writeCompressedInt(0);
			} else {
				writeCompressedInt(id);
			}
		}
	}

	/**
	 * Advanced features handling. Subclasses should override this method to provide concrete implementation. <br>
	 */
	protected void handleAdvancedFeatures(InternalEObject internalEObject, Check check) throws IOException {
		// Do nothing by default.
	}
}
