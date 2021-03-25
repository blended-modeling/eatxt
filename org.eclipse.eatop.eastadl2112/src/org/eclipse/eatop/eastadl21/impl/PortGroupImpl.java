/**
 */
package org.eclipse.eatop.eastadl21.impl;

import java.util.Collection;

import org.eclipse.eatop.eastadl21.Eastadl21Package;
import org.eclipse.eatop.eastadl21.FunctionPort;
import org.eclipse.eatop.eastadl21.PortGroup;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eatop.eastadl21.impl.PortGroupImpl#getPortGroup <em>Port Group</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.impl.PortGroupImpl#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortGroupImpl extends EAElementImpl implements PortGroup {
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
	 * The cached value of the '{@link #getPort() <em>Port</em>}' reference list.
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
	protected PortGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eastadl21Package.Literals.PORT_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PortGroup> getPortGroup() {
		if (portGroup == null) {
			portGroup = new EObjectContainmentEList<PortGroup>(PortGroup.class, this, Eastadl21Package.PORT_GROUP__PORT_GROUP);
		}
		return portGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FunctionPort> getPort() {
		if (port == null) {
			port = new EObjectResolvingEList<FunctionPort>(FunctionPort.class, this, Eastadl21Package.PORT_GROUP__PORT);
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
			case Eastadl21Package.PORT_GROUP__PORT_GROUP:
				return ((InternalEList<?>)getPortGroup()).basicRemove(otherEnd, msgs);
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
			case Eastadl21Package.PORT_GROUP__PORT_GROUP:
				return getPortGroup();
			case Eastadl21Package.PORT_GROUP__PORT:
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
			case Eastadl21Package.PORT_GROUP__PORT_GROUP:
				getPortGroup().clear();
				getPortGroup().addAll((Collection<? extends PortGroup>)newValue);
				return;
			case Eastadl21Package.PORT_GROUP__PORT:
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
			case Eastadl21Package.PORT_GROUP__PORT_GROUP:
				getPortGroup().clear();
				return;
			case Eastadl21Package.PORT_GROUP__PORT:
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
			case Eastadl21Package.PORT_GROUP__PORT_GROUP:
				return portGroup != null && !portGroup.isEmpty();
			case Eastadl21Package.PORT_GROUP__PORT:
				return port != null && !port.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PortGroupImpl
