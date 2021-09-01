/**
 * <copyright>
 * 
 * Copyright (c) 2014 Continental AG, itemis and others.
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 
 * which accompanies this distribution, and is
 * available at http://www.eclipse.org/org/documents/epl-v10.php
 * 
 * Contributors: 
 *     Continental AG - Initial API and implementation
 *     itemis - Bug 444145 - Incorporate changes of Sphinx triming context information from proxy URIs when serializing proxyfied cross-document references
 * 
 * </copyright>
 */
package org.eclipse.eatop.common.resource.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.Platform;
import org.eclipse.eatop.common.metamodel.EastADLMetaModelVersionData;
import org.eclipse.eatop.common.metamodel.EastADLReleaseDescriptor;
import org.eclipse.eatop.common.preferences.IEastADLPreferenceConstants;
import org.eclipse.eatop.common.preferences.IEastADLPreferences;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.sphinx.emf.metamodel.IMetaModelDescriptor;
import org.eclipse.sphinx.emf.resource.BasicMigrationExtendedMetaData;
import org.eclipse.sphinx.emf.resource.ExtendedResource;
import org.eclipse.sphinx.emf.resource.ResourceHandlerRegistry;
import org.eclipse.sphinx.emf.resource.SchemaLocationURIHandler;
import org.eclipse.sphinx.emf.util.EcoreResourceUtil;

/**
 * An abstract {@link Resource.Factory} implementation providing common, i.e., release-independent logic for creating
 * {@link EastADLXMLResourceImpl EAST-ADL resource}s. To be subclassed and complemented by clients which need to provide
 * a {@link Resource.Factory resource factory} for some specific {@link EastADLReleaseDescriptor EAST-ADL release}.
 */
public abstract class EastADLResourceFactoryImpl extends ResourceFactoryImpl {

	/**
	 * The {@link EastADLReleaseDescriptor EAST-ADL release} this {@link Resource.Factory resource factory} is dedicated
	 * to.
	 */
	protected EastADLReleaseDescriptor eastadlRelease;

	/**
	 * The {@link ExtendedMetaData} instance to be used on {@link XMLResource resources} created with this
	 * {@link Resource.Factory resource factory}.
	 */
	protected ExtendedMetaData extendedMetaData;

	protected Map<String, String> schemaLocationCatalog;

	protected SchemaLocationURIHandler schemaLocationURIHandler;

	protected static Map<String, IMetaModelDescriptor> systemIdToResourceVersionDescriptorCache = new HashMap<String, IMetaModelDescriptor>();

	/**
	 * Constructor.
	 * 
	 * @param eastadlRelease
	 *            The {@link EastADLReleaseDescriptor EAST-ADL release} this {@link Resource.Factory resource factory}
	 *            is dedicated to.
	 */
	protected EastADLResourceFactoryImpl(EastADLReleaseDescriptor eastadlRelease) {
		Assert.isNotNull(eastadlRelease);
		Assert.isNotNull(eastadlRelease.getRootEPackage());

		this.eastadlRelease = eastadlRelease;

		extendedMetaData = createExtendedMetaData();

		schemaLocationCatalog = createSchemaLocationCatalog();

		schemaLocationURIHandler = createSchemaLocationURIHandler();
		initSchemaLocationBaseURIs();
	}

	/**
	 * Creates the {@link SchemaLocationURIHandler} instance. This method can be overridden by tool vendors.
	 * 
	 * @return An instantiated {@link SchemaLocationURIHandler}.
	 */
	protected SchemaLocationURIHandler createSchemaLocationURIHandler() {
		return new SchemaLocationURIHandler(schemaLocationCatalog) {
			@Override
			public URI resolve(URI uri) {
				// Handling of wrong schemaLocation attribute value in import declaration for xml.xsd in
				// /org.eclipse.eatop.eastadl21/model/eastadl_2-1-12.xsd
				// only location hint but not namespace plus location hint must be specified
				String lastSegment = uri.lastSegment();
				if (lastSegment != null && lastSegment.endsWith("%20xml.xsd")) { //$NON-NLS-1$
					uri = URI.createURI("xml.xsd"); //$NON-NLS-1$
				}
				return super.resolve(uri);
			};
		};
	}

	/**
	 * Creates and initializes an {@link ExtendedMetaData} instance to be used on {@link XMLResource resources} created
	 * with this {@link Resource.Factory resource factory}.
	 * 
	 * @return The newly created and initialized {@link ExtendedMetaData} instance.
	 */
	protected ExtendedMetaData createExtendedMetaData() {
		// Create and initialize migration-enabled extended meta data enabling EAST-ADL resources whose version is not
		// the same but compatible with that of current EAST-ADL metamodel implementation to be loaded
		BasicMigrationExtendedMetaData extendedMetaData = new BasicMigrationExtendedMetaData(new EPackageRegistryImpl(EPackage.Registry.INSTANCE)) {
			@Override
			public String getNamespace(EPackage ePackage) {
				// Is given EPackage an EPackage of an EAST-ADL metamodel?
				String uri = ePackage.getNsURI();
				if (uri != null && uri.startsWith(EastADLReleaseDescriptor.BASE_NAMESPACE)) {
					// Suppress individual sub EPackage namespaces; always use namespace of current EAST-ADL release
					return eastadlRelease.getNamespace();
				} else {
					return super.getNamespace(ePackage);
				}
			}

		};
		extendedMetaData.putPackage(eastadlRelease.getNamespace(), eastadlRelease.getRootEPackage());
		for (java.net.URI compatibleNamespaceURI : eastadlRelease.getCompatibleNamespaceURIs()) {
			extendedMetaData.putPackage(compatibleNamespaceURI.toString(), eastadlRelease.getRootEPackage());
		}
		return extendedMetaData;
	}

	protected Map<String, String> createSchemaLocationCatalog() {
		Map<String, String> schemaLocationCatalog = new HashMap<String, String>();

		Collection<IMetaModelDescriptor> compatibleDescriptors = eastadlRelease.getCompatibleResourceVersionDescriptors();

		for (IMetaModelDescriptor descriptor : compatibleDescriptors) {
			EastADLReleaseDescriptor eastadlDescriptor = (EastADLReleaseDescriptor) descriptor;
			schemaLocationCatalog.put(descriptor.getNamespace(), getSchemaLocation(eastadlDescriptor));
		}

		return schemaLocationCatalog;
	}

	protected abstract void initSchemaLocationBaseURIs();

	/**
	 * Initializes given {@link XMLResource resource}.
	 * 
	 * @param resource
	 *            The {@link XMLResource resource} to act upon.
	 */
	public void initResource(XMLResource resource) {
		initDefaultOptions(resource);
		installResourceHandler(resource);
	}

	/**
	 * Initializes default {@link XMLResource#getDefaultLoadOptions() load} and
	 * {@link XMLResource#getDefaultSaveOptions() save} options of given {@link XMLResource resource}.
	 * 
	 * @param resource
	 *            The {@link XMLResource resource} to act upon.
	 */
	protected void initDefaultOptions(XMLResource resource) {
		resource.getDefaultLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);
		resource.getDefaultSaveOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);

		resource.getDefaultLoadOptions().put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
		resource.getDefaultSaveOptions().put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);

		resource.getDefaultLoadOptions().put(XMLResource.OPTION_USE_LEXICAL_HANDLER, Boolean.TRUE);
		resource.getDefaultSaveOptions().put(XMLResource.OPTION_ENCODING, "UTF-8"); //$NON-NLS-1$
		resource.getDefaultSaveOptions().put(XMLResource.OPTION_SAVE_TYPE_INFORMATION, Boolean.FALSE);

		IMetaModelDescriptor resourceVersionDescriptor = getResourceVersionDescriptor(resource);
		resource.getDefaultLoadOptions().put(ExtendedResource.OPTION_RESOURCE_VERSION_DESCRIPTOR, resourceVersionDescriptor);

		resource.getDefaultSaveOptions().put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
		resource.getDefaultSaveOptions().put(ExtendedResource.OPTION_SCHEMA_LOCATION_CATALOG, schemaLocationCatalog);
		resource.getDefaultLoadOptions().put(XMLResource.OPTION_URI_HANDLER, schemaLocationURIHandler);
		resource.getDefaultSaveOptions().put(XMLResource.OPTION_URI_HANDLER, schemaLocationURIHandler);

		resource.getDefaultLoadOptions().put(
				ExtendedResource.OPTION_ENABLE_SCHEMA_VALIDATION,
				Platform.isRunning() ? IEastADLPreferences.XSD_VALIDATION_ON_LOAD.get()
						: IEastADLPreferenceConstants.PREF_XSD_VALIDATION_ON_LOAD_DEFAULT);

		// Performance enhancement
		resource.getDefaultLoadOptions().put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);

		resource.getDefaultLoadOptions().put(XMLResource.OPTION_SUPPRESS_DOCUMENT_ROOT, Boolean.TRUE);

		// Configure not to augment contextAwareURI since EAST-ADL extends the advanced ExtendEObjectImpl
		resource.getDefaultLoadOptions().put(ExtendedResource.OPTION_USE_CONTEXT_AWARE_PROXY_URIS, Boolean.FALSE);
	}

	/**
	 * Returns a {@link IMetaModelDescriptor descriptor} describing the version of specified {@link Resource resource}.
	 * This is done by retrieving the resource's {@link EcoreResourceUtil#readModelNamespace(Resource) model namespace}
	 * and testing if it matches either the {@link #eastadlRelease EAST-ADL release} behind this
	 * {@link EastADLResourceFactoryImpl resource factory} or one of its
	 * {@link IMetaModelDescriptor#getCompatibleResourceVersionDescriptors() compatible resource version descriptor}s.
	 * 
	 * @param resource
	 *            The {@link Resource resource} whose version descriptor is to be retrieved.
	 * @return The resource's {@link IMetaModelDescriptor version descriptor} or <code>null</code> if no such could be
	 *         determined.
	 * @see EcoreResourceUtil#readModelNamespace(Resource)
	 * @see IMetaModelDescriptor#getCompatibleResourceVersionDescriptors()
	 */

	public IMetaModelDescriptor getResourceVersionDescriptor(Resource resource) {
		Assert.isNotNull(resource);

		String modelNamespace = EcoreResourceUtil.readModelNamespace(resource);

		if (modelNamespace == null) {
			return null;
		}

		List<EastADLReleaseDescriptor> applicableDescriptors = new ArrayList<EastADLReleaseDescriptor>();

		Collection<IMetaModelDescriptor> compatibleDescriptors = eastadlRelease.getCompatibleResourceVersionDescriptors();

		for (IMetaModelDescriptor descriptor : compatibleDescriptors) {
			EastADLReleaseDescriptor eastadlDescriptor = (EastADLReleaseDescriptor) descriptor;
			if (eastadlDescriptor.getNamespace().equals(modelNamespace)) {
				applicableDescriptors.add(eastadlDescriptor);
			}
		}

		if (applicableDescriptors.size() == 1) {
			// namespace based lookup already resulted in a unique result
			return applicableDescriptors.get(0);
		} else if (applicableDescriptors.size() == 0) {
			return null;
		} else {
			// disambiguate multiple namespace matches based on schema location
			Map<String, String> schemaLocationEntries = EcoreResourceUtil.readSchemaLocationEntries(resource);
			String schemaLocation = schemaLocationEntries.get(modelNamespace);

			if (schemaLocation == null) {
				// return latest revision if there is no schema location
				return applicableDescriptors.get(applicableDescriptors.size() - 1);
			}

			IMetaModelDescriptor releaseDescriptorCache = systemIdToResourceVersionDescriptorCache.get(schemaLocation);
			if (releaseDescriptorCache != null) {
				return releaseDescriptorCache;
			}

			for (EastADLReleaseDescriptor eastadlDescriptor : applicableDescriptors) {
				if (getSchemaLocation(eastadlDescriptor).equals(schemaLocation)) {
					systemIdToResourceVersionDescriptorCache.put(schemaLocation, eastadlDescriptor);
					return eastadlDescriptor;
				}
			}
		}

		return null;
	}

	/**
	 * Installs a {@link ResourceHandler resource handler} for current EAST-ADL release on specified {@link XMLResource
	 * resource}. This is required to support the EAST-ADL Extender.
	 * 
	 * @param resource
	 *            The XMLResource for which the {@link ResourceHandler resource handler} is to be installed.
	 */
	protected void installResourceHandler(XMLResource resource) {
		XMLResource.ResourceHandler resourceHandler = ResourceHandlerRegistry.INSTANCE.getHandler(eastadlRelease.getRootEPackage().getNsURI());
		if (resourceHandler != null) {
			resource.getDefaultLoadOptions().put(XMLResource.OPTION_RESOURCE_HANDLER, resourceHandler);
			resource.getDefaultSaveOptions().put(XMLResource.OPTION_RESOURCE_HANDLER, resourceHandler);
		}
	}

	@SuppressWarnings("nls")
	private static String getSchemaLocation(EastADLReleaseDescriptor eastadlDescriptor) {
		EastADLMetaModelVersionData versionData = eastadlDescriptor.getEastADLVersionData();
		return "eastadl_" + versionData.getMajor() + "-" + versionData.getMinor() + "-" + versionData.getRevision() + ".xsd";
	}
}
