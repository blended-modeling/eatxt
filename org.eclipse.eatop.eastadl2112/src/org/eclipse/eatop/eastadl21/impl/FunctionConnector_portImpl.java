/**
 */
package org.eclipse.eatop.eastadl21.impl;

import org.eclipse.eatop.eastadl21.Eastadl21Package;
import org.eclipse.eatop.eastadl21.FunctionConnector_port;
import org.eclipse.eatop.eastadl21.FunctionPort;
import org.eclipse.eatop.eastadl21.FunctionPrototype;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sphinx.emf.ecore.ExtendedEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Connector port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eatop.eastadl21.impl.FunctionConnector_portImpl#getFunctionPrototype <em>Function Prototype</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.impl.FunctionConnector_portImpl#getFunctionPort <em>Function Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionConnector_portImpl extends ExtendedEObjectImpl implements FunctionConnector_port {
	/**
	 * The cached value of the '{@link #getFunctionPrototype() <em>Function Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionPrototype()
	 * @generated
	 * @ordered
	 */
	protected FunctionPrototype functionPrototype;

	/**
	 * The cached value of the '{@link #getFunctionPort() <em>Function Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionPort()
	 * @generated
	 * @ordered
	 */
	protected FunctionPort functionPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionConnector_portImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eastadl21Package.Literals.FUNCTION_CONNECTOR_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionPrototype getFunctionPrototype() {
		if (functionPrototype != null && functionPrototype.eIsProxy()) {
			InternalEObject oldFunctionPrototype = (InternalEObject)functionPrototype;
			functionPrototype = (FunctionPrototype)eResolveProxy(oldFunctionPrototype);
			if (functionPrototype != oldFunctionPrototype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Eastadl21Package.FUNCTION_CONNECTOR_PORT__FUNCTION_PROTOTYPE, oldFunctionPrototype, functionPrototype));
			}
		}
		return functionPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionPrototype basicGetFunctionPrototype() {
		return functionPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFunctionPrototype(FunctionPrototype newFunctionPrototype) {
		FunctionPrototype oldFunctionPrototype = functionPrototype;
		functionPrototype = newFunctionPrototype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eastadl21Package.FUNCTION_CONNECTOR_PORT__FUNCTION_PROTOTYPE, oldFunctionPrototype, functionPrototype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionPort getFunctionPort() {
		if (functionPort != null && functionPort.eIsProxy()) {
			InternalEObject oldFunctionPort = (InternalEObject)functionPort;
			functionPort = (FunctionPort)eResolveProxy(oldFunctionPort);
			if (functionPort != oldFunctionPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Eastadl21Package.FUNCTION_CONNECTOR_PORT__FUNCTION_PORT, oldFunctionPort, functionPort));
			}
		}
		return functionPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionPort basicGetFunctionPort() {
		return functionPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFunctionPort(FunctionPort newFunctionPort) {
		FunctionPort oldFunctionPort = functionPort;
		functionPort = newFunctionPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eastadl21Package.FUNCTION_CONNECTOR_PORT__FUNCTION_PORT, oldFunctionPort, functionPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Eastadl21Package.FUNCTION_CONNECTOR_PORT__FUNCTION_PROTOTYPE:
				if (resolve) return getFunctionPrototype();
				return basicGetFunctionPrototype();
			case Eastadl21Package.FUNCTION_CONNECTOR_PORT__FUNCTION_PORT:
				if (resolve) return getFunctionPort();
				return basicGetFunctionPort();
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
			case Eastadl21Package.FUNCTION_CONNECTOR_PORT__FUNCTION_PROTOTYPE:
				setFunctionPrototype((FunctionPrototype)newValue);
				return;
			case Eastadl21Package.FUNCTION_CONNECTOR_PORT__FUNCTION_PORT:
				setFunctionPort((FunctionPort)newValue);
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
			case Eastadl21Package.FUNCTION_CONNECTOR_PORT__FUNCTION_PROTOTYPE:
				setFunctionPrototype((FunctionPrototype)null);
				return;
			case Eastadl21Package.FUNCTION_CONNECTOR_PORT__FUNCTION_PORT:
				setFunctionPort((FunctionPort)null);
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
			case Eastadl21Package.FUNCTION_CONNECTOR_PORT__FUNCTION_PROTOTYPE:
				return functionPrototype != null;
			case Eastadl21Package.FUNCTION_CONNECTOR_PORT__FUNCTION_PORT:
				return functionPort != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionConnector_portImpl
