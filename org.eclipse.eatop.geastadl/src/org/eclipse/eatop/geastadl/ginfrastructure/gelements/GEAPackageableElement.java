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

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>GEA Packageable Element</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.eatop.geastadl.ginfrastructure.gelements.GEAPackageableElement#getGEAPackage_element <em>GEA Package element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.eatop.geastadl.ginfrastructure.gelements.GelementsPackage#getGEAPackageableElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface GEAPackageableElement extends GIdentifiable {

	/*
	 * TODO Modify model code generation of geastadl so that e.g. getGEAPackage_element will be generated as
	 * gGetEAPackage_element
	 */

	/**
	 * Returns the value of the '<em><b>GEA Package element</b></em>' container reference. It is bidirectional and its
	 * opposite is '{@link org.eclipse.eatop.geastadl.ginfrastructure.gelements.GEAPackage#getGElement <em>GElement</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GEA Package element</em>' container reference isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>GEA Package element</em>' container reference.
	 * @see #gSetEAPackage_element(GEAPackage)
	 * @see org.eclipse.eatop.geastadl.ginfrastructure.gelements.GelementsPackage#getGEAPackageableElement_GEAPackage_element()
	 * @see org.eclipse.eatop.geastadl.ginfrastructure.gelements.GEAPackage#getGElement
	 * @model opposite="gElement" transient="false"
	 */
	GEAPackage gGetEAPackage_element();

	/**
	 * Sets the value of the '{@link org.eclipse.eatop.geastadl.ginfrastructure.gelements.GEAPackageableElement#gGetEAPackage_element
	 * <em>GEA Package element</em>}' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>GEA Package element</em>' container reference.
	 * @see #gGetEAPackage_element()
	 */
	void gSetEAPackage_element(GEAPackage value);

} // GEAPackageableElement
