/**
 */
package eastadl22_alpha.impl;

import eastadl22_alpha.Eastadl22_alphaPackage;
import eastadl22_alpha.HardwareComponentPrototype;
import eastadl22_alpha.HardwareComponentType;
import eastadl22_alpha.HardwareConnector;
import eastadl22_alpha.HardwarePin;
import eastadl22_alpha.HardwarePort;
import eastadl22_alpha.PortConnector;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware Component Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eastadl22_alpha.impl.HardwareComponentTypeImpl#getPin <em>Pin</em>}</li>
 *   <li>{@link eastadl22_alpha.impl.HardwareComponentTypeImpl#getPart <em>Part</em>}</li>
 *   <li>{@link eastadl22_alpha.impl.HardwareComponentTypeImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link eastadl22_alpha.impl.HardwareComponentTypeImpl#getPort <em>Port</em>}</li>
 *   <li>{@link eastadl22_alpha.impl.HardwareComponentTypeImpl#getPortConnector <em>Port Connector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HardwareComponentTypeImpl extends ContextImpl implements HardwareComponentType {
	/**
	 * The cached value of the '{@link #getPin() <em>Pin</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwarePin> pin;

	/**
	 * The cached value of the '{@link #getPart() <em>Part</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPart()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwareComponentPrototype> part;

	/**
	 * The cached value of the '{@link #getConnector() <em>Connector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnector()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwareConnector> connector;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwarePort> port;

	/**
	 * The cached value of the '{@link #getPortConnector() <em>Port Connector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortConnector()
	 * @generated
	 * @ordered
	 */
	protected EList<PortConnector> portConnector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwareComponentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eastadl22_alphaPackage.Literals.HARDWARE_COMPONENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwarePin> getPin() {
		if (pin == null) {
			pin = new EObjectContainmentEList<HardwarePin>(HardwarePin.class, this, Eastadl22_alphaPackage.HARDWARE_COMPONENT_TYPE__PIN);
		}
		return pin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwareComponentPrototype> getPart() {
		if (part == null) {
			part = new EObjectContainmentEList<HardwareComponentPrototype>(HardwareComponentPrototype.class, this, Eastadl22_alphaPackage.HARDWARE_COMPONENT_TYPE__PART);
		}
		return part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwareConnector> getConnector() {
		if (connector == null) {
			connector = new EObjectContainmentEList<HardwareConnector>(HardwareConnector.class, this, Eastadl22_alphaPackage.HARDWARE_COMPONENT_TYPE__CONNECTOR);
		}
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwarePort> getPort() {
		if (port == null) {
			port = new EObjectContainmentEList<HardwarePort>(HardwarePort.class, this, Eastadl22_alphaPackage.HARDWARE_COMPONENT_TYPE__PORT);
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortConnector> getPortConnector() {
		if (portConnector == null) {
			portConnector = new EObjectContainmentEList<PortConnector>(PortConnector.class, this, Eastadl22_alphaPackage.HARDWARE_COMPONENT_TYPE__PORT_CONNECTOR);
		}
		return portConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Eastadl22_alphaPackage.HARDWARE_COMPONENT_TYPE__PIN:
				return ((InternalEList<?>)getPin()).basicRemove(otherEnd, msgs);
			case Eastadl22_alphaPackage.HARDWARE_COMPONENT_TYPE__PART:
				return ((InternalEList<?>)getPart()).basicRemove(otherEnd, msgs);
			case Eastadl22_alphaPackage.HARDWARE_COMPONENT_TYPE__CONNECTOR:
				return ((InternalEList<?>)getConnector()).basicRemove(otherEnd, msgs);
			case Eastadl22_alphaPackage.HARDWARE_COMPONENT_TYPE__PORT:
				return ((InternalEList<?>)getPort()).basicRemove(otherEnd, msgs);
			case Eastadl22_alphaPackage.HARDWARE_COMPONENT_TYPE__PORT_CONNECTOR:
				return ((InternalEList<?>)getPortConnector()).basicRemove(otherEnd, msgs);
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
			case Eastadl22_alphaPackage.HARDWARE_COMPONENT_TYPE__PIN:
				return getPin();
			case Eastadl22_alphaPackage.HARDWARE_COMPONENT_TYPE__PART:
				return getPart();
			case Eastadl22_alphaPackage.HARDWARE_COMPONENT_TYPE__CONNECTOR:
				return getConnector();
			case Eastadl22_alphaPackage.HARDWARE_COMPONENT_TYPE__PORT:
				return getPort();
			case Eastadl22_alphaPackage.HARDWARE_COMPONENT_TYPE__PORT_CONNECTOR:
				return getPortConnector();
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
			case Eastadl22_alphaPackage.HARDWARE_COMPONENT_TYPE__PIN:
				getPin().clear();
				getPin().addAll((Collection<? extends HardwarePin>)newValue);
				return;
			case Eastadl22_alphaPackage.HARDWARE_COMPONENT_TYPE__PART:
				getPart().clear();
				getPart().addAll((Collection<? extends HardwareComponentPrototype>)newValue);
				return;
			case Eastadl22_alphaPackage.HARDWARE_COMPONENT_TYPE__CONNECTOR:
				getConnector().clear();
				getConnector().addAll((Collection<? extends HardwareConnector>)newValue);
				return;
			case Eastadl22_alphaPackage.HARDWARE_COMPONENT_TYPE__PORT:
				getPort().clear();
				getPort().addAll((Collection<? extends HardwarePort>)newValue);
				return;
			case Eastadl22_alphaPackage.HARDWARE_COMPONENT_TYPE__PORT_CONNECTOR:
				getPortConnector().clear();
				getPortConnector().addAll((Collection<? extends PortConnector>)newValue);
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
			case Eastadl22_alphaPackage.HARDWARE_COMPONENT_TYPE__PIN:
				getPin().clear();
				return;
			case Eastadl22_alphaPackage.HARDWARE_COMPONENT_TYPE__PART:
				getPart().clear();
				return;
			case Eastadl22_alphaPackage.HARDWARE_COMPONENT_TYPE__CONNECTOR:
				getConnector().clear();
				return;
			case Eastadl22_alphaPackage.HARDWARE_COMPONENT_TYPE__PORT:
				getPort().clear();
				return;
			case Eastadl22_alphaPackage.HARDWARE_COMPONENT_TYPE__PORT_CONNECTOR:
				getPortConnector().clear();
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
			case Eastadl22_alphaPackage.HARDWARE_COMPONENT_TYPE__PIN:
				return pin != null && !pin.isEmpty();
			case Eastadl22_alphaPackage.HARDWARE_COMPONENT_TYPE__PART:
				return part != null && !part.isEmpty();
			case Eastadl22_alphaPackage.HARDWARE_COMPONENT_TYPE__CONNECTOR:
				return connector != null && !connector.isEmpty();
			case Eastadl22_alphaPackage.HARDWARE_COMPONENT_TYPE__PORT:
				return port != null && !port.isEmpty();
			case Eastadl22_alphaPackage.HARDWARE_COMPONENT_TYPE__PORT_CONNECTOR:
				return portConnector != null && !portConnector.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HardwareComponentTypeImpl
