/**
 */
package eastadl22_alpha.impl;

import eastadl22_alpha.Eastadl22_alphaPackage;
import eastadl22_alpha.Identifiable;
import eastadl22_alpha.Realization_realizedBy;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Realization realized By</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eastadl22_alpha.impl.Realization_realizedByImpl#getIdentifiable_target <em>Identifiable target</em>}</li>
 *   <li>{@link eastadl22_alpha.impl.Realization_realizedByImpl#getIdentifiable_context <em>Identifiable context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Realization_realizedByImpl extends MinimalEObjectImpl.Container implements Realization_realizedBy {
	/**
	 * The cached value of the '{@link #getIdentifiable_target() <em>Identifiable target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiable_target()
	 * @generated
	 * @ordered
	 */
	protected Identifiable identifiable_target;

	/**
	 * The cached value of the '{@link #getIdentifiable_context() <em>Identifiable context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiable_context()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifiable> identifiable_context;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Realization_realizedByImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eastadl22_alphaPackage.Literals.REALIZATION_REALIZED_BY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifiable getIdentifiable_target() {
		if (identifiable_target != null && identifiable_target.eIsProxy()) {
			InternalEObject oldIdentifiable_target = (InternalEObject)identifiable_target;
			identifiable_target = (Identifiable)eResolveProxy(oldIdentifiable_target);
			if (identifiable_target != oldIdentifiable_target) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Eastadl22_alphaPackage.REALIZATION_REALIZED_BY__IDENTIFIABLE_TARGET, oldIdentifiable_target, identifiable_target));
			}
		}
		return identifiable_target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifiable basicGetIdentifiable_target() {
		return identifiable_target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifiable_target(Identifiable newIdentifiable_target) {
		Identifiable oldIdentifiable_target = identifiable_target;
		identifiable_target = newIdentifiable_target;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eastadl22_alphaPackage.REALIZATION_REALIZED_BY__IDENTIFIABLE_TARGET, oldIdentifiable_target, identifiable_target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifiable> getIdentifiable_context() {
		if (identifiable_context == null) {
			identifiable_context = new EObjectResolvingEList<Identifiable>(Identifiable.class, this, Eastadl22_alphaPackage.REALIZATION_REALIZED_BY__IDENTIFIABLE_CONTEXT);
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
			case Eastadl22_alphaPackage.REALIZATION_REALIZED_BY__IDENTIFIABLE_TARGET:
				if (resolve) return getIdentifiable_target();
				return basicGetIdentifiable_target();
			case Eastadl22_alphaPackage.REALIZATION_REALIZED_BY__IDENTIFIABLE_CONTEXT:
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
			case Eastadl22_alphaPackage.REALIZATION_REALIZED_BY__IDENTIFIABLE_TARGET:
				setIdentifiable_target((Identifiable)newValue);
				return;
			case Eastadl22_alphaPackage.REALIZATION_REALIZED_BY__IDENTIFIABLE_CONTEXT:
				getIdentifiable_context().clear();
				getIdentifiable_context().addAll((Collection<? extends Identifiable>)newValue);
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
			case Eastadl22_alphaPackage.REALIZATION_REALIZED_BY__IDENTIFIABLE_TARGET:
				setIdentifiable_target((Identifiable)null);
				return;
			case Eastadl22_alphaPackage.REALIZATION_REALIZED_BY__IDENTIFIABLE_CONTEXT:
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
			case Eastadl22_alphaPackage.REALIZATION_REALIZED_BY__IDENTIFIABLE_TARGET:
				return identifiable_target != null;
			case Eastadl22_alphaPackage.REALIZATION_REALIZED_BY__IDENTIFIABLE_CONTEXT:
				return identifiable_context != null && !identifiable_context.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Realization_realizedByImpl
