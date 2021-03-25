/**
 */
package org.eclipse.eatop.eastadl21.impl;

import java.util.Collection;

import org.eclipse.eatop.eastadl21.Eastadl21Package;
import org.eclipse.eatop.eastadl21.FunctionConnector;
import org.eclipse.eatop.eastadl21.FunctionPort;
import org.eclipse.eatop.eastadl21.FunctionType;
import org.eclipse.eatop.eastadl21.PortGroup;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eatop.eastadl21.impl.FunctionTypeImpl#getIsElementary <em>Is Elementary</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.impl.FunctionTypeImpl#getPortGroup <em>Port Group</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.impl.FunctionTypeImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.impl.FunctionTypeImpl#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FunctionTypeImpl extends ContextImpl implements FunctionType {
	/**
	 * The default value of the '{@link #getIsElementary() <em>Is Elementary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsElementary()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ELEMENTARY_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsElementary() <em>Is Elementary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsElementary()
	 * @generated
	 * @ordered
	 */
	protected Boolean isElementary = IS_ELEMENTARY_EDEFAULT;

	/**
	 * This is true if the Is Elementary attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isElementaryESet;

	/**
	 * The cached value of the '{@link #getPortGroup() <em>Port Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<PortGroup> portGroup;

	/**
	 * The cached value of the '{@link #getConnector() <em>Connector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnector()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionConnector> connector;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionPort> port;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eastadl21Package.Literals.FUNCTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsElementary() {
		return isElementary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsElementary(Boolean newIsElementary) {
		Boolean oldIsElementary = isElementary;
		isElementary = newIsElementary;
		boolean oldIsElementaryESet = isElementaryESet;
		isElementaryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eastadl21Package.FUNCTION_TYPE__IS_ELEMENTARY, oldIsElementary, isElementary, !oldIsElementaryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIsElementary() {
		Boolean oldIsElementary = isElementary;
		boolean oldIsElementaryESet = isElementaryESet;
		isElementary = IS_ELEMENTARY_EDEFAULT;
		isElementaryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Eastadl21Package.FUNCTION_TYPE__IS_ELEMENTARY, oldIsElementary, IS_ELEMENTARY_EDEFAULT, oldIsElementaryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIsElementary() {
		return isElementaryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PortGroup> getPortGroup() {
		if (portGroup == null) {
			portGroup = new EObjectContainmentEList<PortGroup>(PortGroup.class, this, Eastadl21Package.FUNCTION_TYPE__PORT_GROUP);
		}
		return portGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FunctionConnector> getConnector() {
		if (connector == null) {
			connector = new EObjectContainmentEList<FunctionConnector>(FunctionConnector.class, this, Eastadl21Package.FUNCTION_TYPE__CONNECTOR);
		}
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FunctionPort> getPort() {
		if (port == null) {
			port = new EObjectContainmentEList<FunctionPort>(FunctionPort.class, this, Eastadl21Package.FUNCTION_TYPE__PORT);
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Eastadl21Package.FUNCTION_TYPE__PORT_GROUP:
				return ((InternalEList<?>)getPortGroup()).basicRemove(otherEnd, msgs);
			case Eastadl21Package.FUNCTION_TYPE__CONNECTOR:
				return ((InternalEList<?>)getConnector()).basicRemove(otherEnd, msgs);
			case Eastadl21Package.FUNCTION_TYPE__PORT:
				return ((InternalEList<?>)getPort()).basicRemove(otherEnd, msgs);
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
			case Eastadl21Package.FUNCTION_TYPE__IS_ELEMENTARY:
				return getIsElementary();
			case Eastadl21Package.FUNCTION_TYPE__PORT_GROUP:
				return getPortGroup();
			case Eastadl21Package.FUNCTION_TYPE__CONNECTOR:
				return getConnector();
			case Eastadl21Package.FUNCTION_TYPE__PORT:
				return getPort();
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
			case Eastadl21Package.FUNCTION_TYPE__IS_ELEMENTARY:
				setIsElementary((Boolean)newValue);
				return;
			case Eastadl21Package.FUNCTION_TYPE__PORT_GROUP:
				getPortGroup().clear();
				getPortGroup().addAll((Collection<? extends PortGroup>)newValue);
				return;
			case Eastadl21Package.FUNCTION_TYPE__CONNECTOR:
				getConnector().clear();
				getConnector().addAll((Collection<? extends FunctionConnector>)newValue);
				return;
			case Eastadl21Package.FUNCTION_TYPE__PORT:
				getPort().clear();
				getPort().addAll((Collection<? extends FunctionPort>)newValue);
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
			case Eastadl21Package.FUNCTION_TYPE__IS_ELEMENTARY:
				unsetIsElementary();
				return;
			case Eastadl21Package.FUNCTION_TYPE__PORT_GROUP:
				getPortGroup().clear();
				return;
			case Eastadl21Package.FUNCTION_TYPE__CONNECTOR:
				getConnector().clear();
				return;
			case Eastadl21Package.FUNCTION_TYPE__PORT:
				getPort().clear();
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
			case Eastadl21Package.FUNCTION_TYPE__IS_ELEMENTARY:
				return isSetIsElementary();
			case Eastadl21Package.FUNCTION_TYPE__PORT_GROUP:
				return portGroup != null && !portGroup.isEmpty();
			case Eastadl21Package.FUNCTION_TYPE__CONNECTOR:
				return connector != null && !connector.isEmpty();
			case Eastadl21Package.FUNCTION_TYPE__PORT:
				return port != null && !port.isEmpty();
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
		result.append(" (isElementary: ");
		if (isElementaryESet) result.append(isElementary); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //FunctionTypeImpl
