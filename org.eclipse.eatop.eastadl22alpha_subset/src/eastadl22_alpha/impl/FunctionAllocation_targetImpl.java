/**
 */
package eastadl22_alpha.impl;

import eastadl22_alpha.AllocationTarget;
import eastadl22_alpha.Eastadl22_alphaPackage;
import eastadl22_alpha.FunctionAllocation_target;

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
 * An implementation of the model object '<em><b>Function Allocation target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eastadl22_alpha.impl.FunctionAllocation_targetImpl#getAllocationTarget_context <em>Allocation Target context</em>}</li>
 *   <li>{@link eastadl22_alpha.impl.FunctionAllocation_targetImpl#getAllocationTarget <em>Allocation Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionAllocation_targetImpl extends MinimalEObjectImpl.Container implements FunctionAllocation_target {
	/**
	 * The cached value of the '{@link #getAllocationTarget_context() <em>Allocation Target context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationTarget_context()
	 * @generated
	 * @ordered
	 */
	protected EList<AllocationTarget> allocationTarget_context;

	/**
	 * The cached value of the '{@link #getAllocationTarget() <em>Allocation Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationTarget()
	 * @generated
	 * @ordered
	 */
	protected AllocationTarget allocationTarget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionAllocation_targetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eastadl22_alphaPackage.Literals.FUNCTION_ALLOCATION_TARGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AllocationTarget> getAllocationTarget_context() {
		if (allocationTarget_context == null) {
			allocationTarget_context = new EObjectResolvingEList<AllocationTarget>(AllocationTarget.class, this, Eastadl22_alphaPackage.FUNCTION_ALLOCATION_TARGET__ALLOCATION_TARGET_CONTEXT);
		}
		return allocationTarget_context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationTarget getAllocationTarget() {
		if (allocationTarget != null && allocationTarget.eIsProxy()) {
			InternalEObject oldAllocationTarget = (InternalEObject)allocationTarget;
			allocationTarget = (AllocationTarget)eResolveProxy(oldAllocationTarget);
			if (allocationTarget != oldAllocationTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Eastadl22_alphaPackage.FUNCTION_ALLOCATION_TARGET__ALLOCATION_TARGET, oldAllocationTarget, allocationTarget));
			}
		}
		return allocationTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationTarget basicGetAllocationTarget() {
		return allocationTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllocationTarget(AllocationTarget newAllocationTarget) {
		AllocationTarget oldAllocationTarget = allocationTarget;
		allocationTarget = newAllocationTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eastadl22_alphaPackage.FUNCTION_ALLOCATION_TARGET__ALLOCATION_TARGET, oldAllocationTarget, allocationTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Eastadl22_alphaPackage.FUNCTION_ALLOCATION_TARGET__ALLOCATION_TARGET_CONTEXT:
				return getAllocationTarget_context();
			case Eastadl22_alphaPackage.FUNCTION_ALLOCATION_TARGET__ALLOCATION_TARGET:
				if (resolve) return getAllocationTarget();
				return basicGetAllocationTarget();
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
			case Eastadl22_alphaPackage.FUNCTION_ALLOCATION_TARGET__ALLOCATION_TARGET_CONTEXT:
				getAllocationTarget_context().clear();
				getAllocationTarget_context().addAll((Collection<? extends AllocationTarget>)newValue);
				return;
			case Eastadl22_alphaPackage.FUNCTION_ALLOCATION_TARGET__ALLOCATION_TARGET:
				setAllocationTarget((AllocationTarget)newValue);
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
			case Eastadl22_alphaPackage.FUNCTION_ALLOCATION_TARGET__ALLOCATION_TARGET_CONTEXT:
				getAllocationTarget_context().clear();
				return;
			case Eastadl22_alphaPackage.FUNCTION_ALLOCATION_TARGET__ALLOCATION_TARGET:
				setAllocationTarget((AllocationTarget)null);
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
			case Eastadl22_alphaPackage.FUNCTION_ALLOCATION_TARGET__ALLOCATION_TARGET_CONTEXT:
				return allocationTarget_context != null && !allocationTarget_context.isEmpty();
			case Eastadl22_alphaPackage.FUNCTION_ALLOCATION_TARGET__ALLOCATION_TARGET:
				return allocationTarget != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionAllocation_targetImpl
