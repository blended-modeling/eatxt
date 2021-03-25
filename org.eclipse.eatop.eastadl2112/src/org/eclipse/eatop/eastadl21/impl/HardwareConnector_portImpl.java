/**
 */
package org.eclipse.eatop.eastadl21.impl;

import org.eclipse.eatop.eastadl21.Eastadl21Package;
import org.eclipse.eatop.eastadl21.HardwareComponentPrototype;
import org.eclipse.eatop.eastadl21.HardwareConnector_port;
import org.eclipse.eatop.eastadl21.HardwarePin;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sphinx.emf.ecore.ExtendedEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware Connector port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eatop.eastadl21.impl.HardwareConnector_portImpl#getHardwarePin <em>Hardware Pin</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.impl.HardwareConnector_portImpl#getHardwareComponentPrototype <em>Hardware Component Prototype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HardwareConnector_portImpl extends ExtendedEObjectImpl implements HardwareConnector_port {
	/**
	 * The cached value of the '{@link #getHardwarePin() <em>Hardware Pin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwarePin()
	 * @generated
	 * @ordered
	 */
	protected HardwarePin hardwarePin;

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
	protected HardwareConnector_portImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eastadl21Package.Literals.HARDWARE_CONNECTOR_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HardwarePin getHardwarePin() {
		if (hardwarePin != null && hardwarePin.eIsProxy()) {
			InternalEObject oldHardwarePin = (InternalEObject)hardwarePin;
			hardwarePin = (HardwarePin)eResolveProxy(oldHardwarePin);
			if (hardwarePin != oldHardwarePin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Eastadl21Package.HARDWARE_CONNECTOR_PORT__HARDWARE_PIN, oldHardwarePin, hardwarePin));
			}
		}
		return hardwarePin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwarePin basicGetHardwarePin() {
		return hardwarePin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHardwarePin(HardwarePin newHardwarePin) {
		HardwarePin oldHardwarePin = hardwarePin;
		hardwarePin = newHardwarePin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eastadl21Package.HARDWARE_CONNECTOR_PORT__HARDWARE_PIN, oldHardwarePin, hardwarePin));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Eastadl21Package.HARDWARE_CONNECTOR_PORT__HARDWARE_COMPONENT_PROTOTYPE, oldHardwareComponentPrototype, hardwareComponentPrototype));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Eastadl21Package.HARDWARE_CONNECTOR_PORT__HARDWARE_COMPONENT_PROTOTYPE, oldHardwareComponentPrototype, hardwareComponentPrototype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Eastadl21Package.HARDWARE_CONNECTOR_PORT__HARDWARE_PIN:
				if (resolve) return getHardwarePin();
				return basicGetHardwarePin();
			case Eastadl21Package.HARDWARE_CONNECTOR_PORT__HARDWARE_COMPONENT_PROTOTYPE:
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
			case Eastadl21Package.HARDWARE_CONNECTOR_PORT__HARDWARE_PIN:
				setHardwarePin((HardwarePin)newValue);
				return;
			case Eastadl21Package.HARDWARE_CONNECTOR_PORT__HARDWARE_COMPONENT_PROTOTYPE:
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
			case Eastadl21Package.HARDWARE_CONNECTOR_PORT__HARDWARE_PIN:
				setHardwarePin((HardwarePin)null);
				return;
			case Eastadl21Package.HARDWARE_CONNECTOR_PORT__HARDWARE_COMPONENT_PROTOTYPE:
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
			case Eastadl21Package.HARDWARE_CONNECTOR_PORT__HARDWARE_PIN:
				return hardwarePin != null;
			case Eastadl21Package.HARDWARE_CONNECTOR_PORT__HARDWARE_COMPONENT_PROTOTYPE:
				return hardwareComponentPrototype != null;
		}
		return super.eIsSet(featureID);
	}

} //HardwareConnector_portImpl
