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
package org.eclipse.eatop.geastadl.ginfrastructure.gelements;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>GEA Package</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.eatop.geastadl.ginfrastructure.gelements.GEAPackage#getGElement <em>GElement</em>}</li>
 *   <li>{@link org.eclipse.eatop.geastadl.ginfrastructure.gelements.GEAPackage#getGSubPackage <em>GSub Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.eatop.geastadl.ginfrastructure.gelements.GelementsPackage#getGEAPackage()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface GEAPackage extends GIdentifiable {
	/*
	 * TODO Modify model code generation of geastadl so that e.g. getGElement will be generated as gGetElement
	 */

	/**
	 * Returns the value of the '<em><b>GElement</b></em>' containment reference list. The list contents are of type
	 * {@link org.eclipse.eatop.geastadl.ginfrastructure.gelements.GEAPackageableElement}. It is bidirectional and its opposite is '
	 * {@link org.eclipse.eatop.geastadl.ginfrastructure.gelements.GEAPackageableElement#getGEAPackage_element
	 * <em>GEA Package element</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GElement</em>' containment reference list isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>GElement</em>' containment reference list.
	 * @see org.eclipse.eatop.geastadl.ginfrastructure.gelements.GelementsPackage#getGEAPackage_GElement()
	 * @see org.eclipse.eatop.geastadl.ginfrastructure.gelements.GEAPackageableElement#getGEAPackage_element
	 * @model opposite="gEAPackage_element" containment="true"
	 */
	EList<GEAPackageableElement> gGetElement();

	/**
	 * Returns the value of the '<em><b>GSub Package</b></em>' containment reference list. The list contents are of type
	 * {@link org.eclipse.eatop.geastadl.ginfrastructure.gelements.GEAPackage}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GSub Package</em>' containment reference list isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>GSub Package</em>' containment reference list.
	 * @see org.eclipse.eatop.geastadl.ginfrastructure.gelements.GelementsPackage#getGEAPackage_GSubPackage()
	 * @model containment="true"
	 */
	EList<GEAPackage> gGetSubPackage();

} // GEAPackage
