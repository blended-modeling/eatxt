/**
 */
package org.eclipse.eatop.eastadl21.impl;

import org.eclipse.eatop.eastadl21.Eastadl21Package;
import org.eclipse.eatop.eastadl21.HardwareComponentPrototype;
import org.eclipse.eatop.eastadl21.HardwarePort;
import org.eclipse.eatop.eastadl21.HardwarePortConnector_port;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sphinx.emf.ecore.ExtendedEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware Port Connector port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eatop.eastadl21.impl.HardwarePortConnector_portImpl#getHardwarePort <em>Hardware Port</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.impl.HardwarePortConnector_portImpl#getHardwareComponentPrototype <em>Hardware Component Prototype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HardwarePortConnector_portImpl extends ExtendedEObjectImpl implements HardwarePortConnector_port {
	/**
	 * The cached value of the '{@link #getHardwarePort() <em>Hardware Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwarePort()
	 * @generated
	 * @ordered
	 */
	protected HardwarePort hardwarePort;

	/**
	 * The cached value of the '{@link #getHardwareComponentPrototype() <em>Hardware Component Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareComponentPrototype()
	 * @generated
	 * @ordered
	 */
	protected HardwareComponentPrototype hardwareComponentPrototype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwarePortConnector_portImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eastadl21Package.Literals.HARDWARE_PORT_CONNECTOR_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HardwarePort getHardwarePort() {
		if (hardwarePort != null && hardwarePort.eIsProxy()) {
			InternalEObject oldHardwarePort = (InternalEObject)hardwarePort;
			hardwarePort = (HardwarePort)eResolveProxy(oldHardwarePort);
			if (hardwarePort != oldHardwarePort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Eastadl21Package.HARDWARE_PORT_CONNECTOR_PORT__HARDWARE_PORT, oldHardwarePort, hardwarePort));
			}
		}
		return hardwarePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwarePort basicGetHardwarePort() {
		return hardwarePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHardwarePort(HardwarePort newHardwarePort) {
		HardwarePort oldHardwarePort = hardwarePort;
		hardwarePort = newHardwarePort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eastadl21Package.HARDWARE_PORT_CONNECTOR_PORT__HARDWARE_PORT, oldHardwarePort, hardwarePort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HardwareComponentPrototype getHardwareComponentPrototype() {
		if (hardwareComponentPrototype != null && hardwareComponentPrototype.eIsProxy()) {
			InternalEObject oldHardwareComponentPrototype = (InternalEObject)hardwareComponentPrototype;
			hardwareComponentPrototype = (HardwareComponentPrototype)eResolveProxy(oldHardwareComponentPrototype);
			if (hardwareComponentPrototype != oldHardwareComponentPrototype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Eastadl21Package.HARDWARE_PORT_CONNECTOR_PORT__HARDWARE_COMPONENT_PROTOTYPE, oldHardwareComponentPrototype, hardwareComponentPrototype));
			}
		}
		return hardwareComponentPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareComponentPrototype basicGetHardwareComponentPrototype() {
		return hardwareComponentPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHardwareComponentPrototype(HardwareComponentPrototype newHardwareComponentPrototype) {
		HardwareComponentPrototype oldHardwareComponentPrototype = hardwareComponentPrototype;
		hardwareComponentPrototype = newHardwareComponentPrototype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eastadl21Package.HARDWARE_PORT_CONNECTOR_PORT__HARDWARE_COMPONENT_PROTOTYPE, oldHardwareComponentPrototype, hardwareComponentPrototype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Eastadl21Package.HARDWARE_PORT_CONNECTOR_PORT__HARDWARE_PORT:
				if (resolve) return getHardwarePort();
				return basicGetHardwarePort();
			case Eastadl21Package.HARDWARE_PORT_CONNECTOR_PORT__HARDWARE_COMPONENT_PROTOTYPE:
				if (resolve) return getHardwareComponentPrototype();
				return basicGetHardwareComponentPrototype();
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
			case Eastadl21Package.HARDWARE_PORT_CONNECTOR_PORT__HARDWARE_PORT:
				setHardwarePort((HardwarePort)newValue);
				return;
			case Eastadl21Package.HARDWARE_PORT_CONNECTOR_PORT__HARDWARE_COMPONENT_PROTOTYPE:
				setHardwareComponentPrototype((HardwareComponentPrototype)newValue);
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
			case Eastadl21Package.HARDWARE_PORT_CONNECTOR_PORT__HARDWARE_PORT:
				setHardwarePort((HardwarePort)null);
				return;
			case Eastadl21Package.HARDWARE_PORT_CONNECTOR_PORT__HARDWARE_COMPONENT_PROTOTYPE:
				setHardwareComponentPrototype((HardwareComponentPrototype)null);
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
			case Eastadl21Package.HARDWARE_PORT_CONNECTOR_PORT__HARDWARE_PORT:
				return hardwarePort != null;
			case Eastadl21Package.HARDWARE_PORT_CONNECTOR_PORT__HARDWARE_COMPONENT_PROTOTYPE:
				return hardwareComponentPrototype != null;
		}
		return super.eIsSet(featureID);
	}

} //HardwarePortConnector_portImpl
