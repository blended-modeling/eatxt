/**
 */
package org.eclipse.eatop.eastadl21.impl;

import org.eclipse.eatop.eastadl21.Eastadl21Package;
import org.eclipse.eatop.eastadl21.Node;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eatop.eastadl21.impl.NodeImpl#getExecutionRate <em>Execution Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends HardwareComponentTypeImpl implements Node {
	/**
	 * The default value of the '{@link #getExecutionRate() <em>Execution Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionRate()
	 * @generated
	 * @ordered
	 */
	protected static final Double EXECUTION_RATE_EDEFAULT = new Double(0.0);

	/**
	 * The cached value of the '{@link #getExecutionRate() <em>Execution Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionRate()
	 * @generated
	 * @ordered
	 */
	protected Double executionRate = EXECUTION_RATE_EDEFAULT;

	/**
	 * This is true if the Execution Rate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean executionRateESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eastadl21Package.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getExecutionRate() {
		return executionRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExecutionRate(Double newExecutionRate) {
		Double oldExecutionRate = executionRate;
		executionRate = newExecutionRate;
		boolean oldExecutionRateESet = executionRateESet;
		executionRateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eastadl21Package.NODE__EXECUTION_RATE, oldExecutionRate, executionRate, !oldExecutionRateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetExecutionRate() {
		Double oldExecutionRate = executionRate;
		boolean oldExecutionRateESet = executionRateESet;
		executionRate = EXECUTION_RATE_EDEFAULT;
		executionRateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Eastadl21Package.NODE__EXECUTION_RATE, oldExecutionRate, EXECUTION_RATE_EDEFAULT, oldExecutionRateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetExecutionRate() {
		return executionRateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Eastadl21Package.NODE__EXECUTION_RATE:
				return getExecutionRate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Eastadl21Package.NODE__EXECUTION_RATE:
				setExecutionRate((Double)newValue);
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
			case Eastadl21Package.NODE__EXECUTION_RATE:
				unsetExecutionRate();
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
			case Eastadl21Package.NODE__EXECUTION_RATE:
				return isSetExecutionRate();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (executionRate: ");
		if (executionRateESet) result.append(executionRate); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //NodeImpl
