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
package org.eclipse.eatop.serialization;

import org.eclipse.eatop.serialization.internal.EastADLXMLHelperImpl;
import org.eclipse.eatop.serialization.internal.EastADLXMLLoadImpl;
import org.eclipse.eatop.serialization.internal.EastADLXMLSaveImpl;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLLoad;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.XMLSave;

/**
 * Utility class to instantiate classes that specialize the serialization process.
 */
public class SerializationFactory {
	/**
	 * Returns an XMLLoadImpl which can handle EAST-ADL resources.
	 * 
	 * @param basePackage
	 *            The package which contains the root element. It is required as it provides a reference to a factory
	 *            used to instantiate Identifiers regardless of the East-ADL version.
	 * @param resource
	 *            The resource to handle, to which a helper will be associated.
	 * @return A EastADLXMLLoadImpl.
	 */
	public static XMLLoad createXMLLoad(EPackage basePackage, XMLResource resource) {
		return new EastADLXMLLoadImpl(createXMLHelper(resource), basePackage);
	}

	/**
	 * Creates a new XMLSaveImpl which can handle East-ADL resources.
	 * 
	 * @param resource
	 *            The resource to handle.
	 * @return A EastADLXMLSaveImpl.
	 */
	public static XMLSave createXMLSave(XMLResource resource) {
		return new EastADLXMLSaveImpl(createXMLHelper(resource));
	}

	/**
	 * Creates an XMLHelper associated with given resource.
	 * 
	 * @param resource
	 *            The resource the XMLHelper acts on.
	 * @return A SpecializedXMLHelper instance.
	 */
	public static XMLHelper createXMLHelper(XMLResource resource) {
		return new EastADLXMLHelperImpl(resource);
	}
}
