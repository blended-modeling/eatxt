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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.sphinx.emf.resource.ExtendedResource;
import org.eclipse.sphinx.emf.resource.ExtendedResourceAdapterFactory;
import org.eclipse.sphinx.emf.serialization.internal.XMLPersistenceMappingHelperImpl;

@SuppressWarnings("restriction")
public class EastADLXMLHelperImpl extends XMLPersistenceMappingHelperImpl implements XMLHelper {

	protected ExtendedResource extendedResource;

	/**
	 * Instantiates a new XMLHelper and sets its resource to given parameter value.
	 * 
	 * @param resource
	 *            The resource about which this helper will provide info.
	 */
	public EastADLXMLHelperImpl(XMLResource resource) {
		super(resource);
		setResource(resource);
		extendedResource = ExtendedResourceAdapterFactory.INSTANCE.adapt(resource);
	}

	@Override
	public String getHREF(EObject obj) {
		URI objectURI;

		if (!obj.eIsProxy()) {
			Resource otherResource = obj.eResource();
			if (otherResource == null) {
				if (resource != null && resource.getID(obj) != null) {
					if (extendedResource != null) {
						objectURI = extendedResource.getHREF(obj);
					} else {
						objectURI = getHREF(resource, obj);
					}
				} else {
					objectURI = handleDanglingHREF(obj);
					if (objectURI == null) {
						return null;
					}
				}
			} else {
				if (extendedResource != null) {
					objectURI = extendedResource.getHREF(obj);
				} else {
					objectURI = getHREF(otherResource, obj);
				}
			}
		} else {
			if (extendedResource != null) {
				objectURI = extendedResource.getHREF(obj);
				objectURI = extendedResource.trimProxyContextInfo(objectURI);
			} else {
				objectURI = ((InternalEObject) obj).eProxyURI();
			}
		}

		objectURI = deresolve(objectURI);

		return objectURI.toString();
	}
}
