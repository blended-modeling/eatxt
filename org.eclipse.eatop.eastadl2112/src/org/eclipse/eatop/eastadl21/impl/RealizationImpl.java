/**
 */
package org.eclipse.eatop.eastadl21.impl;

import java.util.Collection;

import org.eclipse.eatop.eastadl21.Eastadl21Package;
import org.eclipse.eatop.eastadl21.Realization;
import org.eclipse.eatop.eastadl21.Realization_realized;
import org.eclipse.eatop.eastadl21.Realization_realizedBy;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eatop.eastadl21.impl.RealizationImpl#getRealized <em>Realized</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.impl.RealizationImpl#getRealizedBy <em>Realized By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RealizationImpl extends RelationshipImpl implements Realization {
	/**
	 * The cached value of the '{@link #getRealized() <em>Realized</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealized()
	 * @generated
	 * @ordered
	 */
	protected EList<Realization_realized> realized;

	/**
	 * The cached value of the '{@link #getRealizedBy() <em>Realized By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Realization_realizedBy> realizedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eastadl21Package.Literals.REALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Realization_realized> getRealized() {
		if (realized == null) {
			realized = new EObjectContainmentEList<Realization_realized>(Realization_realized.class, this, Eastadl21Package.REALIZATION__REALIZED);
		}
		return realized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Realization_realizedBy> getRealizedBy() {
		if (realizedBy == null) {
			realizedBy = new EObjectContainmentEList<Realization_realizedBy>(Realization_realizedBy.class, this, Eastadl21Package.REALIZATION__REALIZED_BY);
		}
		return realizedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Eastadl21Package.REALIZATION__REALIZED:
				return ((InternalEList<?>)getRealized()).basicRemove(otherEnd, msgs);
			case Eastadl21Package.REALIZATION__REALIZED_BY:
				return ((InternalEList<?>)getRealizedBy()).basicRemove(otherEnd, msgs);
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
			case Eastadl21Package.REALIZATION__REALIZED:
				return getRealized();
			case Eastadl21Package.REALIZATION__REALIZED_BY:
				return getRealizedBy();
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
			case Eastadl21Package.REALIZATION__REALIZED:
				getRealized().clear();
				getRealized().addAll((Collection<? extends Realization_realized>)newValue);
				return;
			case Eastadl21Package.REALIZATION__REALIZED_BY:
				getRealizedBy().clear();
				getRealizedBy().addAll((Collection<? extends Realization_realizedBy>)newValue);
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
			case Eastadl21Package.REALIZATION__REALIZED:
				getRealized().clear();
				return;
			case Eastadl21Package.REALIZATION__REALIZED_BY:
				getRealizedBy().clear();
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
			case Eastadl21Package.REALIZATION__REALIZED:
				return realized != null && !realized.isEmpty();
			case Eastadl21Package.REALIZATION__REALIZED_BY:
				return realizedBy != null && !realizedBy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RealizationImpl
