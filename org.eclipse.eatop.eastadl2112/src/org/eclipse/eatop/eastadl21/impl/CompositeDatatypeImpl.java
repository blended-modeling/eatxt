/**
 */
package org.eclipse.eatop.eastadl21.impl;

import java.util.Collection;

import org.eclipse.eatop.eastadl21.CompositeDatatype;
import org.eclipse.eatop.eastadl21.EADatatypePrototype;
import org.eclipse.eatop.eastadl21.Eastadl21Package;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Datatype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eatop.eastadl21.impl.CompositeDatatypeImpl#getDatatypePrototype <em>Datatype Prototype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeDatatypeImpl extends EADatatypeImpl implements CompositeDatatype {
	/**
	 * The cached value of the '{@link #getDatatypePrototype() <em>Datatype Prototype</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatypePrototype()
	 * @generated
	 * @ordered
	 */
	protected EList<EADatatypePrototype> datatypePrototype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeDatatypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eastadl21Package.Literals.COMPOSITE_DATATYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EADatatypePrototype> getDatatypePrototype() {
		if (datatypePrototype == null) {
			datatypePrototype = new EObjectContainmentEList<EADatatypePrototype>(EADatatypePrototype.class, this, Eastadl21Package.COMPOSITE_DATATYPE__DATATYPE_PROTOTYPE);
		}
		return datatypePrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Eastadl21Package.COMPOSITE_DATATYPE__DATATYPE_PROTOTYPE:
				return ((InternalEList<?>)getDatatypePrototype()).basicRemove(otherEnd, msgs);
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
			case Eastadl21Package.COMPOSITE_DATATYPE__DATATYPE_PROTOTYPE:
				return getDatatypePrototype();
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
			case Eastadl21Package.COMPOSITE_DATATYPE__DATATYPE_PROTOTYPE:
				getDatatypePrototype().clear();
				getDatatypePrototype().addAll((Collection<? extends EADatatypePrototype>)newValue);
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
			case Eastadl21Package.COMPOSITE_DATATYPE__DATATYPE_PROTOTYPE:
				getDatatypePrototype().clear();
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
			case Eastadl21Package.COMPOSITE_DATATYPE__DATATYPE_PROTOTYPE:
				return datatypePrototype != null && !datatypePrototype.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompositeDatatypeImpl
