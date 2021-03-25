/**
 */
package org.eclipse.eatop.eastadl21.util;

import java.util.Map;

import org.eclipse.eatop.eastadl21.Eastadl21Package;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Eastadl21XMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Eastadl21XMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		Eastadl21Package.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Eastadl21ResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new Eastadl21ResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Eastadl21ResourceFactoryImpl());
		}
		return registrations;
	}

} //Eastadl21XMLProcessor
