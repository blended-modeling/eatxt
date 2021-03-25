/**
 * <copyright>
 *  
 * Copyright (c) 2014 Continental AG and others.
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 
 * which accompanies this distribution, and is
 * available at http://www.eclipse.org/org/documents/epl-v10.php
 *  
 * Contributors: 
 *     Continental AG - Initial API and implementation
 *  
 * </copyright>
 * 
 */
package org.eclipse.eatop.geastadl.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 */
public class GEastadlFactory extends EFactoryImpl implements EFactory {
	public static final GEastadlFactory eINSTANCE = new GEastadlFactory();

	/**
	 * Returns the value of the '<em><b>EPackage</b></em>' reference.
	 */
	@Override
	public EPackage getEPackage() {
		if (ePackage == null) {
			ePackage = GEastadlPackage.eINSTANCE;
		}
		return ePackage;
	}

	/**
	 * <!-- begin-user-doc --> Creates a new instance of the class and returns it. Ask the package the list of its
	 * classifiers. Given these classifiers, ask their packages what their factories are.
	 * 
	 * @param eClass
	 *            the class of the new instance.
	 * @return a new instance of the class. <!-- end-user-doc -->
	 */
	@Override
	public EObject create(EClass eClass) {
		EObject result = null;

		if (eClass.eContainer() instanceof EPackage) {
			result = ((EPackage) eClass.eContainer()).getEFactoryInstance().create(eClass);
		}

		return result;
	}
}
