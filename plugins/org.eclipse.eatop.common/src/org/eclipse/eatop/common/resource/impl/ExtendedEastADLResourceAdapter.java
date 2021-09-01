/**
 * <copyright>
 * 
 * Copyright (c) 2014 itemis and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *     itemis - Initial API and implementation
 *     itemis - Bug 444145 - Incorporate changes of Sphinx triming context information from proxy URIs when serializing proxyfied cross-document references
 * 
 * </copyright>
 */
package org.eclipse.eatop.common.resource.impl;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.eatop.common.internal.messages.Messages;
import org.eclipse.eatop.common.preferences.IEastADLPreferences;
import org.eclipse.eatop.common.resource.EastADLURIFactory;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.sphinx.emf.resource.ExtendedResource;
import org.eclipse.sphinx.emf.resource.ExtendedResourceAdapter;

/**
 * {@link Adapter}-based implementation of {@link ExtendedResource} for EastADL.
 */
public class ExtendedEastADLResourceAdapter extends ExtendedResourceAdapter {

	public static String DESTINATION_TYPE_KEY = "type"; //$NON-NLS-1$

	/*
	 * @see org.eclipse.sphinx.emf.resource.ExtendedResourceAdapter#getURI(org.eclipse.emf.ecore.EObject,
	 * org.eclipse.emf.ecore.EStructuralFeature, org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public URI getURI(EObject oldOwner, EStructuralFeature oldOwnerContainingFeature, EObject eObject) {
		// we get URI using old Owner and old feature only if the given eObject is detached from its owner i.e erased
		if (oldOwner != null && oldOwnerContainingFeature != null && eObject.eContainer() == null) {
			return EastADLURIFactory.getURI(oldOwner, oldOwnerContainingFeature, eObject);
		}
		return EastADLURIFactory.getURI(eObject);
	}

	/*
	 * @see org.eclipse.sphinx.emf.resource.ExtendedResourceAdapter#getProblemHandlingOptions()
	 */
	@Override
	public Map<Object, Object> getProblemHandlingOptions() {
		if (problemHandlingOptions == null) {
			problemHandlingOptions = new HashMap<Object, Object>();
			// Set problem handling options according to preferences
			if (IEastADLPreferences.LIMIT_PROBLEM_INDICATION_ON_LOAD.get()) {
				problemHandlingOptions.put(OPTION_MAX_PROBLEM_MARKER_COUNT, IEastADLPreferences.MAX_PROBLEM_REPORTED_ON_LOAD.get());
			} else {
				problemHandlingOptions.put(OPTION_MAX_PROBLEM_MARKER_COUNT, OPTION_MAX_PROBLEM_MARKER_COUNT_UNLIMITED);
			}
			problemHandlingOptions.put(OPTION_XML_VALIDITY_PROBLEM_SEVERITY, IEastADLPreferences.XSD_VALIDATION_SEVERITY_LEVEL.get());
			problemHandlingOptions.put(OPTION_XML_WELLFORMEDNESS_PROBLEM_FORMAT_STRING, Messages.EAData00001);
			problemHandlingOptions.put(OPTION_XML_VALIDITY_PROBLEM_FORMAT_STRING, Messages.EAData00002);
		}
		return problemHandlingOptions;
	}

	/*
	 * @see org.eclipse.sphinx.emf.resource.ExtendedResourceAdapter#validateURI(java.lang.String)
	 */
	@Override
	public Diagnostic validateURI(String uri) {
		Diagnostic diagnostic = super.validateURI(uri);
		if (diagnostic != Diagnostic.OK_INSTANCE) {
			return diagnostic;
		}

		return EastADLURIFactory.validateURI(uri);
	}

	@Override
	public URI createURI(String uriLiteral, EClass eClass) {
		URI uri = EastADLURIFactory.createEastADLURI(uriLiteral, eClass.getName());
		// Removes unnecessary resource URI in front of the URI
		return uri.trimSegments(uri.segmentCount());
	}

	/*
	 * @see org.eclipse.sphinx.emf.resource.ExtendedResourceAdapter#getHREF(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public URI getHREF(EObject eObject) {
		return URI.createURI(EastADLURIFactory.getAbsoluteQualifiedName(eObject));
	}
}
