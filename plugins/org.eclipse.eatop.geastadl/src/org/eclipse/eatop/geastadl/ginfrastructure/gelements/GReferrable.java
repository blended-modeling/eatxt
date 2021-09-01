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
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>GReferrable</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.eatop.geastadl.ginfrastructure.gelements.GReferrable#getGShortName <em>GShort Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.eatop.geastadl.ginfrastructure.gelements.GelementsPackage#getGReferrable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface GReferrable extends EObject {

	/*
	 * TODO Modify model code generation of geastadl so that e.g. getGShortName will be generated as gGetShortName
	 */

	/**
	 * Returns the value of the '<em><b>GShort Name</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GShort Name</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>GShort Name</em>' attribute.
	 * @see #gIsSetShortName()
	 * @see #gUnsetShortName()
	 * @see #gSetShortName(String)
	 * @see org.eclipse.eatop.geastadl.ginfrastructure.gelements.GelementsPackage#getGReferrable_GShortName()
	 * @model unsettable="true" dataType="geastadl.ginfrastructure.gprimitivetypes.Identifier" required="true"
	 *        transient="true" volatile="true" derived="true"
	 */
	default String gGetShortName() {
		return null;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.eatop.geastadl.ginfrastructure.gelements.GReferrable#gGetShortName
	 * <em>GShort Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>GShort Name</em>' attribute.
	 * @see #gIsSetShortName()
	 * @see #gUnsetShortName()
	 * @see #gGetShortName()
	 */
	default void gSetShortName(String value) {

	}

	/**
	 * Unsets the value of the '{@link org.eclipse.eatop.geastadl.ginfrastructure.gelements.GReferrable#gGetShortName
	 * <em>GShort Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #gIsSetShortName()
	 * @see #gGetShortName()
	 * @see #gSetShortName(String)
	 */
	default void gUnsetShortName() {

	}

	/**
	 * Returns whether the value of the
	 * '{@link org.eclipse.eatop.geastadl.ginfrastructure.gelements.GReferrable#gGetShortName <em>GShort Name</em>}'
	 * attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return whether the value of the '<em>GShort Name</em>' attribute is set.
	 * @see #gUnsetShortName()
	 * @see #gGetShortName()
	 * @see #gSetShortName(String)
	 */
	default boolean gIsSetShortName() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	default boolean isSetGShortName() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	default void unsetGShortName() {

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	default void setGShortName(String newGShortName) {

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	default String getGShortName() {
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	default GEAPackage getGEAPackage_element() {
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	default void setGEAPackage_element(GEAPackage newGEAPackage_element) {

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	default EList<GEAPackageableElement> getGElement() {
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	default EList<GEAPackage> getGSubPackage() {
		return null;
	}

} // GReferrable
