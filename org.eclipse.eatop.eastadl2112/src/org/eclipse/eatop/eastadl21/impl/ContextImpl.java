/**
 */
package org.eclipse.eatop.eastadl21.impl;

import java.util.Collection;

import org.eclipse.eatop.eastadl21.Context;
import org.eclipse.eatop.eastadl21.Eastadl21Package;
import org.eclipse.eatop.eastadl21.Relationship;
import org.eclipse.eatop.eastadl21.TraceableSpecification;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eatop.eastadl21.impl.ContextImpl#getTraceableSpecification <em>Traceable Specification</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.impl.ContextImpl#getOwnedRelationship <em>Owned Relationship</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ContextImpl extends EAPackageableElementImpl implements Context {
	/**
	 * The cached value of the '{@link #getTraceableSpecification() <em>Traceable Specification</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceableSpecification()
	 * @generated
	 * @ordered
	 */
	protected EList<TraceableSpecification> traceableSpecification;

	/**
	 * The cached value of the '{@link #getOwnedRelationship() <em>Owned Relationship</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> ownedRelationship;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eastadl21Package.Literals.CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TraceableSpecification> getTraceableSpecification() {
		if (traceableSpecification == null) {
			traceableSpecification = new EObjectResolvingEList<TraceableSpecification>(TraceableSpecification.class, this, Eastadl21Package.CONTEXT__TRACEABLE_SPECIFICATION);
		}
		return traceableSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relationship> getOwnedRelationship() {
		if (ownedRelationship == null) {
			ownedRelationship = new EObjectContainmentEList<Relationship>(Relationship.class, this, Eastadl21Package.CONTEXT__OWNED_RELATIONSHIP);
		}
		return ownedRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Eastadl21Package.CONTEXT__OWNED_RELATIONSHIP:
				return ((InternalEList<?>)getOwnedRelationship()).basicRemove(otherEnd, msgs);
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
			case Eastadl21Package.CONTEXT__TRACEABLE_SPECIFICATION:
				return getTraceableSpecification();
			case Eastadl21Package.CONTEXT__OWNED_RELATIONSHIP:
				return getOwnedRelationship();
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
			case Eastadl21Package.CONTEXT__TRACEABLE_SPECIFICATION:
				getTraceableSpecification().clear();
				getTraceableSpecification().addAll((Collection<? extends TraceableSpecification>)newValue);
				return;
			case Eastadl21Package.CONTEXT__OWNED_RELATIONSHIP:
				getOwnedRelationship().clear();
				getOwnedRelationship().addAll((Collection<? extends Relationship>)newValue);
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
			case Eastadl21Package.CONTEXT__TRACEABLE_SPECIFICATION:
				getTraceableSpecification().clear();
				return;
			case Eastadl21Package.CONTEXT__OWNED_RELATIONSHIP:
				getOwnedRelationship().clear();
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
			case Eastadl21Package.CONTEXT__TRACEABLE_SPECIFICATION:
				return traceableSpecification != null && !traceableSpecification.isEmpty();
			case Eastadl21Package.CONTEXT__OWNED_RELATIONSHIP:
				return ownedRelationship != null && !ownedRelationship.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContextImpl
