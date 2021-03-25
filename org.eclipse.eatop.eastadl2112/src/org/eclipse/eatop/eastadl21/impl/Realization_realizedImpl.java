/**
 */
package org.eclipse.eatop.eastadl21.impl;

import java.util.Collection;

import org.eclipse.eatop.eastadl21.EAElement;
import org.eclipse.eatop.eastadl21.Eastadl21Package;
import org.eclipse.eatop.eastadl21.Realization_realized;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.sphinx.emf.ecore.ExtendedEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Realization realized</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eatop.eastadl21.impl.Realization_realizedImpl#getIdentifiable_target <em>Identifiable target</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.impl.Realization_realizedImpl#getIdentifiable_context <em>Identifiable context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Realization_realizedImpl extends ExtendedEObjectImpl implements Realization_realized {
	/**
	 * The cached value of the '{@link #getIdentifiable_target() <em>Identifiable target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiable_target()
	 * @generated
	 * @ordered
	 */
	protected EAElement identifiable_target;

	/**
	 * The cached value of the '{@link #getIdentifiable_context() <em>Identifiable context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiable_context()
	 * @generated
	 * @ordered
	 */
	protected EList<EAElement> identifiable_context;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Realization_realizedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eastadl21Package.Literals.REALIZATION_REALIZED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAElement getIdentifiable_target() {
		if (identifiable_target != null && identifiable_target.eIsProxy()) {
			InternalEObject oldIdentifiable_target = (InternalEObject)identifiable_target;
			identifiable_target = (EAElement)eResolveProxy(oldIdentifiable_target);
			if (identifiable_target != oldIdentifiable_target) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Eastadl21Package.REALIZATION_REALIZED__IDENTIFIABLE_TARGET, oldIdentifiable_target, identifiable_target));
			}
		}
		return identifiable_target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAElement basicGetIdentifiable_target() {
		return identifiable_target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifiable_target(EAElement newIdentifiable_target) {
		EAElement oldIdentifiable_target = identifiable_target;
		identifiable_target = newIdentifiable_target;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eastadl21Package.REALIZATION_REALIZED__IDENTIFIABLE_TARGET, oldIdentifiable_target, identifiable_target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EAElement> getIdentifiable_context() {
		if (identifiable_context == null) {
			identifiable_context = new EObjectResolvingEList<EAElement>(EAElement.class, this, Eastadl21Package.REALIZATION_REALIZED__IDENTIFIABLE_CONTEXT);
		}
		return identifiable_context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Eastadl21Package.REALIZATION_REALIZED__IDENTIFIABLE_TARGET:
				if (resolve) return getIdentifiable_target();
				return basicGetIdentifiable_target();
			case Eastadl21Package.REALIZATION_REALIZED__IDENTIFIABLE_CONTEXT:
				return getIdentifiable_context();
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
			case Eastadl21Package.REALIZATION_REALIZED__IDENTIFIABLE_TARGET:
				setIdentifiable_target((EAElement)newValue);
				return;
			case Eastadl21Package.REALIZATION_REALIZED__IDENTIFIABLE_CONTEXT:
				getIdentifiable_context().clear();
				getIdentifiable_context().addAll((Collection<? extends EAElement>)newValue);
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
			case Eastadl21Package.REALIZATION_REALIZED__IDENTIFIABLE_TARGET:
				setIdentifiable_target((EAElement)null);
				return;
			case Eastadl21Package.REALIZATION_REALIZED__IDENTIFIABLE_CONTEXT:
				getIdentifiable_context().clear();
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
			case Eastadl21Package.REALIZATION_REALIZED__IDENTIFIABLE_TARGET:
				return identifiable_target != null;
			case Eastadl21Package.REALIZATION_REALIZED__IDENTIFIABLE_CONTEXT:
				return identifiable_context != null && !identifiable_context.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Realization_realizedImpl
