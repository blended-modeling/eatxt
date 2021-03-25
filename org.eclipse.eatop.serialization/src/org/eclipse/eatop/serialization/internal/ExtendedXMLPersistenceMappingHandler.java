/**
 * <copyright>
 *  
 * Copyright (c) 2014 itemis and others.
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 
 * which accompanies this distribution, and is
 * available at http://www.eclipse.org/org/documents/epl-v10.php
 *  
 * Contributors: 
 *     itemis - Initial API and implementation
 *     itemis - Bug 444145 - Incorporate changes of Sphinx triming context information from proxy URIs when serializing proxyfied cross-document references
 *  
 * </copyright>
 * 
 */
package org.eclipse.eatop.serialization.internal;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.sphinx.emf.metamodel.IMetaModelDescriptor;
import org.eclipse.sphinx.emf.resource.ExtendedResource;
import org.eclipse.sphinx.emf.resource.ExtendedResourceAdapterFactory;
import org.eclipse.sphinx.emf.resource.ExtendedResourceConstants;
import org.eclipse.sphinx.emf.serialization.internal.XMLPersistenceMappingHandler;
import org.eclipse.sphinx.emf.util.EcoreResourceUtil;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

@SuppressWarnings("restriction")
public class ExtendedXMLPersistenceMappingHandler extends XMLPersistenceMappingHandler {

	protected static final String EXTENDED_TYPE_ATTRIB = "TYPE"; //$NON-NLS-1$
	protected ExtendedResource extendedResource;

	protected IMetaModelDescriptor resourceVersion = null;

	public ExtendedXMLPersistenceMappingHandler(XMLResource xmlResource, XMLHelper helper, Map<?, ?> options) {
		super(xmlResource, helper, options);

		extendedResource = ExtendedResourceAdapterFactory.INSTANCE.adapt(xmlResource);

		Object value = options.get(ExtendedResource.OPTION_RESOURCE_VERSION_DESCRIPTOR);
		if (value instanceof IMetaModelDescriptor) {
			resourceVersion = (IMetaModelDescriptor) value;
		}
	}

	// === The following methods are copied from ExtendedSAXXMLHandler

	/*
	 * @see org.eclipse.emf.ecore.xmi.impl.XMLHandler#resolveEntity(java.lang.String, java.lang.String)
	 */
	@Override
	public InputSource resolveEntity(String publicId, String systemId) throws SAXException {
		try {
			// Try to resolve entity as is; this will work out in case that entity has already been resolved by
			// underlying XML parser or is resolvable against resource under load and actually exists at the resolved
			// location
			return super.resolveEntity(publicId, systemId);
		} catch (SAXException ex) {
			// Try to resolve only the last segment of system id in case there is any
			String lastSegment = URI.createURI(systemId).lastSegment();
			if (lastSegment != null) {
				try {
					URI uri = URI.createURI(lastSegment);
					uri = helper.resolve(uri, resourceURI);
					InputStream inputStream;
					inputStream = getURIConverter().createInputStream(uri, null);
					InputSource result = new InputSource(inputStream);
					result.setPublicId(publicId);
					result.setSystemId(systemId);
					return result;
				} catch (Exception ex1) {
					// Ignore exception
				}
			}

			// Try to resolve by relying on resource namespace instead of system id
			String resourceNamespace = null;
			if (resourceVersion != null) {
				resourceNamespace = resourceVersion.getNamespace();
			} else {
				resourceNamespace = EcoreResourceUtil.readModelNamespace(xmlResource);
			}
			if (resourceNamespace != null) {
				try {
					URI uri = URI.createURI(resourceNamespace);
					uri = helper.resolve(uri, resourceURI);
					InputStream inputStream;
					inputStream = getURIConverter().createInputStream(uri, null);
					InputSource result = new InputSource(inputStream);
					result.setPublicId(publicId);
					result.setSystemId(systemId);
					return result;
				} catch (Exception ex1) {
					// Ignore exception (rather than throwing a SAXException and aborting the load process)
				}
			}

			// Ignore exception (rather than re-throwing SAXException and aborting the load process)
			return null;
		}
	}

	/*
	 * Overridden to enable use of workspace-aware URIConverter
	 * @see org.eclipse.emf.ecore.xmi.impl.XMLHandler#getURIConverter()
	 */
	@Override
	protected URIConverter getURIConverter() {
		return EcoreResourceUtil.getURIConverter(resourceSet);
	}

	/*
	 * Overridden to make sure that parsing may be continued even in case of fatal errors (typically XML well-formedness
	 * problems or I/O errors) if the underlying SAX parser has been configured to operate that way. In case that Apache
	 * Xerces parser is used the parser feature http://apache.org/xml/features/continue-after-fatal-error needs to be
	 * set to true for this purpose.
	 * @see org.eclipse.emf.ecore.xmi.impl.XMLHandler#fatalError(org.xml.sax.SAXParseException)
	 */
	@Override
	public void fatalError(SAXParseException e) throws SAXException {
		try {
			super.fatalError(e);
		} catch (SAXException ex) {
			// Ignore exception
		}
	}

	@Override
	protected void processTopObject(EObject object) {
		if (object != null) {
			if (deferredExtent != null) {
				deferredExtent.add(object);
			} else {
				extent.addUnique(object);
			}

			if (extendedMetaData != null && !mixedTargets.isEmpty()) {
				FeatureMap featureMap = mixedTargets.pop();
				EStructuralFeature target = null;

				EList<EAttribute> allAttributes = object.eClass().getEAllAttributes();
				for (Object element : allAttributes) {
					EAttribute attribute = (EAttribute) element;
					if (ExtendedResourceConstants.OUTER_CONTENT_ATTRIBUTE_NAME.equals(attribute.getName())) {
						target = attribute;
						break;
					}
				}

				if (target == null) {
					target = extendedMetaData.getMixedFeature(object.eClass());
				}

				if (target != null) {
					FeatureMap otherFeatureMap = (FeatureMap) object.eGet(target);
					for (FeatureMap.Entry entry : new ArrayList<FeatureMap.Entry>(featureMap)) {
						// Ignore a whitespace only text entry at the beginning.
						//
						if (entry.getEStructuralFeature() != XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__TEXT
								|| !"".equals(XMLTypeUtil.normalize(entry.getValue().toString(), true))) { //$NON-NLS-1$
							otherFeatureMap.add(entry.getEStructuralFeature(), entry.getValue());
						}
					}
				}
				text = null;
			}
		}

		processObject(object);
	}

	// Copied from ExtendedSAXXMLHandler
	@Override
	protected void handleProxy(InternalEObject proxy, String uriLiteral) {
		URI proxyURI;
		if (oldStyleProxyURIs) {
			uriLiteral = uriLiteral.startsWith(ExtendedResource.URI_SEGMENT_SEPARATOR) ? uriLiteral : ExtendedResource.URI_SEGMENT_SEPARATOR
					+ uriLiteral;
			proxyURI = URI.createURI(uriLiteral);
			proxy.eSetProxyURI(proxyURI);
		} else {
			if (extendedResource != null) {
				proxyURI = extendedResource.createURI(uriLiteral, proxy.eClass());
			} else {
				proxyURI = URI.createURI(uriLiteral);
			}

			if (uriHandler != null) {
				proxyURI = uriHandler.resolve(proxyURI);
			} else if (resolve
					&& proxyURI.isRelative()
					&& proxyURI.hasRelativePath()
					&& (extendedMetaData == null ? !packageRegistry.containsKey(proxyURI.trimFragment().toString()) : extendedMetaData
							.getPackage(proxyURI.trimFragment().toString()) == null)) {
				proxyURI = helper.resolve(proxyURI, resourceURI);
			}

			proxy.eSetProxyURI(proxyURI);
		}

		// Test for a same document reference that would usually be handled as an IDREF
		if (proxyURI.trimFragment().equals(resourceURI)) {
			sameDocumentProxies.add(proxy);
		}

		if (extendedResource != null) {
			extendedResource.augmentToContextAwareProxy(proxy);
		}
	}

}
