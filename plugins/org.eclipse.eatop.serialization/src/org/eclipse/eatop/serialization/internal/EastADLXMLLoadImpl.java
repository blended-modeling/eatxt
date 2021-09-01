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
 *  
 * </copyright>
 * 
 */
package org.eclipse.eatop.serialization.internal;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.xml.sax.helpers.DefaultHandler;

/**
 * An XMLLoadImpl that is specially designed to load EAST-ADL resources.
 */
public class EastADLXMLLoadImpl extends ExtendedXMLPersistenceMappingLoadImpl {

	/**
	 * The package that will be associated with the target namespace.
	 */
	protected EPackage basePackage = null;

	/**
	 * Instantiates this class as an XMLLoadImpl with given helper and keeps track of the base package on which the
	 * XMLLoad will act.
	 * 
	 * @param helper
	 *            The helper that provides info during the deserialization process, typically annotations.
	 * @param ePackage
	 *            The basePackage to use.
	 */
	public EastADLXMLLoadImpl(XMLHelper helper, EPackage ePackage) {
		super(helper);
		basePackage = ePackage;
	}

	/*
	 * @see org.eclipse.sphinx.emf.resource.ExtendedXMLLoadImpl#makeDefaultHandler()
	 */
	@Override
	protected DefaultHandler makeDefaultHandler() {
		ExtendedXMLPersistenceMappingHandler handler = new ExtendedXMLPersistenceMappingHandler(resource, helper, options);
		return handler;
	}
}
