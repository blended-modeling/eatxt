/**
 */
package org.eclipse.eatop.eastadl21.impl;

import java.util.Collection;

import org.eclipse.eatop.eastadl21.EAPackage;
import org.eclipse.eatop.eastadl21.EAXML;
import org.eclipse.eatop.eastadl21.Eastadl21Package;

import org.eclipse.eatop.geastadl.ginfrastructure.gelements.GEAPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.sphinx.emf.ecore.ExtendedEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EAXML</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eatop.eastadl21.impl.EAXMLImpl#getGTopLevelPackage <em>GTop Level Package</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.impl.EAXMLImpl#getTopLevelPackage <em>Top Level Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EAXMLImpl extends ExtendedEObjectImpl implements EAXML {
	/**
	 * The cached value of the '{@link #getTopLevelPackage() <em>Top Level Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopLevelPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<EAPackage> topLevelPackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EAXMLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eastadl21Package.Literals.EAXML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GEAPackage> getGTopLevelPackage() {
		// TODO: implement this method to return the 'GTop Level Package' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EAPackage> getTopLevelPackage() {
		if (topLevelPackage == null) {
			topLevelPackage = new EObjectContainmentEList<EAPackage>(EAPackage.class, this, Eastadl21Package.EAXML__TOP_LEVEL_PACKAGE);
		}
		return topLevelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Eastadl21Package.EAXML__TOP_LEVEL_PACKAGE:
				return ((InternalEList<?>)getTopLevelPackage()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Eastadl21Package.EAXML__GTOP_LEVEL_PACKAGE:
				return getGTopLevelPackage();
			case Eastadl21Package.EAXML__TOP_LEVEL_PACKAGE:
				return getTopLevelPackage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Eastadl21Package.EAXML__GTOP_LEVEL_PACKAGE:
				getGTopLevelPackage().clear();
				getGTopLevelPackage().addAll((Collection<? extends GEAPackage>)newValue);
				return;
			case Eastadl21Package.EAXML__TOP_LEVEL_PACKAGE:
				getTopLevelPackage().clear();
				getTopLevelPackage().addAll((Collection<? extends EAPackage>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Eastadl21Package.EAXML__GTOP_LEVEL_PACKAGE:
				getGTopLevelPackage().clear();
				return;
			case Eastadl21Package.EAXML__TOP_LEVEL_PACKAGE:
				getTopLevelPackage().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Eastadl21Package.EAXML__GTOP_LEVEL_PACKAGE:
				return !getGTopLevelPackage().isEmpty();
			case Eastadl21Package.EAXML__TOP_LEVEL_PACKAGE:
				return topLevelPackage != null && !topLevelPackage.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EAXMLImpl
