/**
 */
package eastadl22_alpha.impl;

import eastadl22_alpha.Context;
import eastadl22_alpha.Eastadl22_alphaPackage;
import eastadl22_alpha.Relationship;
import eastadl22_alpha.TraceableSpecification;

import java.util.Collection;

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
 *   <li>{@link eastadl22_alpha.impl.ContextImpl#getTraceableSpecification <em>Traceable Specification</em>}</li>
 *   <li>{@link eastadl22_alpha.impl.ContextImpl#getOwnedRelationship <em>Owned Relationship</em>}</li>
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
		return Eastadl22_alphaPackage.Literals.CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TraceableSpecification> getTraceableSpecification() {
		if (traceableSpecification == null) {
			traceableSpecification = new EObjectResolvingEList<TraceableSpecification>(TraceableSpecification.class, this, Eastadl22_alphaPackage.CONTEXT__TRACEABLE_SPECIFICATION);
		}
		return traceableSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getOwnedRelationship() {
		if (ownedRelationship == null) {
			ownedRelationship = new EObjectContainmentEList<Relationship>(Relationship.class, this, Eastadl22_alphaPackage.CONTEXT__OWNED_RELATIONSHIP);
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
			case Eastadl22_alphaPackage.CONTEXT__OWNED_RELATIONSHIP:
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
			case Eastadl22_alphaPackage.CONTEXT__TRACEABLE_SPECIFICATION:
				return getTraceableSpecification();
			case Eastadl22_alphaPackage.CONTEXT__OWNED_RELATIONSHIP:
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
			case Eastadl22_alphaPackage.CONTEXT__TRACEABLE_SPECIFICATION:
				getTraceableSpecification().clear();
				getTraceableSpecification().addAll((Collection<? extends TraceableSpecification>)newValue);
				return;
			case Eastadl22_alphaPackage.CONTEXT__OWNED_RELATIONSHIP:
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
			case Eastadl22_alphaPackage.CONTEXT__TRACEABLE_SPECIFICATION:
				getTraceableSpecification().clear();
				return;
			case Eastadl22_alphaPackage.CONTEXT__OWNED_RELATIONSHIP:
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
			case Eastadl22_alphaPackage.CONTEXT__TRACEABLE_SPECIFICATION:
				return traceableSpecification != null && !traceableSpecification.isEmpty();
			case Eastadl22_alphaPackage.CONTEXT__OWNED_RELATIONSHIP:
				return ownedRelationship != null && !ownedRelationship.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContextImpl
