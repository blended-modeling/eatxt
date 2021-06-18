/**
 */
package eastadl22_alpha.impl;

import eastadl22_alpha.Eastadl22_alphaPackage;
import eastadl22_alpha.FunctionConnector_port;
import eastadl22_alpha.FunctionPort;
import eastadl22_alpha.FunctionPrototype;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Connector port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eastadl22_alpha.impl.FunctionConnector_portImpl#getFunctionPrototype <em>Function Prototype</em>}</li>
 *   <li>{@link eastadl22_alpha.impl.FunctionConnector_portImpl#getFunctionPort <em>Function Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionConnector_portImpl extends MinimalEObjectImpl.Container implements FunctionConnector_port {
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
		return Eastadl22_alphaPackage.Literals.FUNCTION_CONNECTOR_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionPrototype getFunctionPrototype() {
		if (functionPrototype != null && functionPrototype.eIsProxy()) {
			InternalEObject oldFunctionPrototype = (InternalEObject)functionPrototype;
			functionPrototype = (FunctionPrototype)eResolveProxy(oldFunctionPrototype);
			if (functionPrototype != oldFunctionPrototype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Eastadl22_alphaPackage.FUNCTION_CONNECTOR_PORT__FUNCTION_PROTOTYPE, oldFunctionPrototype, functionPrototype));
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
	public void setFunctionPrototype(FunctionPrototype newFunctionPrototype) {
		FunctionPrototype oldFunctionPrototype = functionPrototype;
		functionPrototype = newFunctionPrototype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eastadl22_alphaPackage.FUNCTION_CONNECTOR_PORT__FUNCTION_PROTOTYPE, oldFunctionPrototype, functionPrototype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionPort getFunctionPort() {
		if (functionPort != null && functionPort.eIsProxy()) {
			InternalEObject oldFunctionPort = (InternalEObject)functionPort;
			functionPort = (FunctionPort)eResolveProxy(oldFunctionPort);
			if (functionPort != oldFunctionPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Eastadl22_alphaPackage.FUNCTION_CONNECTOR_PORT__FUNCTION_PORT, oldFunctionPort, functionPort));
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
	public void setFunctionPort(FunctionPort newFunctionPort) {
		FunctionPort oldFunctionPort = functionPort;
		functionPort = newFunctionPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eastadl22_alphaPackage.FUNCTION_CONNECTOR_PORT__FUNCTION_PORT, oldFunctionPort, functionPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Eastadl22_alphaPackage.FUNCTION_CONNECTOR_PORT__FUNCTION_PROTOTYPE:
				if (resolve) return getFunctionPrototype();
				return basicGetFunctionPrototype();
			case Eastadl22_alphaPackage.FUNCTION_CONNECTOR_PORT__FUNCTION_PORT:
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
			case Eastadl22_alphaPackage.FUNCTION_CONNECTOR_PORT__FUNCTION_PROTOTYPE:
				setFunctionPrototype((FunctionPrototype)newValue);
				return;
			case Eastadl22_alphaPackage.FUNCTION_CONNECTOR_PORT__FUNCTION_PORT:
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
			case Eastadl22_alphaPackage.FUNCTION_CONNECTOR_PORT__FUNCTION_PROTOTYPE:
				setFunctionPrototype((FunctionPrototype)null);
				return;
			case Eastadl22_alphaPackage.FUNCTION_CONNECTOR_PORT__FUNCTION_PORT:
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
			case Eastadl22_alphaPackage.FUNCTION_CONNECTOR_PORT__FUNCTION_PROTOTYPE:
				return functionPrototype != null;
			case Eastadl22_alphaPackage.FUNCTION_CONNECTOR_PORT__FUNCTION_PORT:
				return functionPort != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionConnector_portImpl
