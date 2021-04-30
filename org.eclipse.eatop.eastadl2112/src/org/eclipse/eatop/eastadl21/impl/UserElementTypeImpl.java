/**
 */
package org.eclipse.eatop.eastadl21.impl;

import java.util.Collection;

import org.eclipse.eatop.eastadl21.Eastadl21Package;
import org.eclipse.eatop.eastadl21.UserAttributeDefinition;
import org.eclipse.eatop.eastadl21.UserElementType;

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
 * An implementation of the model object '<em><b>User Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eatop.eastadl21.impl.UserElementTypeImpl#getValidFor <em>Valid For</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.impl.UserElementTypeImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.impl.UserElementTypeImpl#getUaDefinition <em>Ua Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserElementTypeImpl extends EAPackageableElementImpl implements UserElementType {
	/**
	 * The default value of the '{@link #getValidFor() <em>Valid For</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFor()
	 * @generated
	 * @ordered
	 */
	protected static final String VALID_FOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidFor() <em>Valid For</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFor()
	 * @generated
	 * @ordered
	 */
	protected String validFor = VALID_FOR_EDEFAULT;

	/**
	 * This is true if the Valid For attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean validForESet;

	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected String key = KEY_EDEFAULT;

	/**
	 * This is true if the Key attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean keyESet;

	/**
	 * The cached value of the '{@link #getUaDefinition() <em>Ua Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUaDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<UserAttributeDefinition> uaDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eastadl21Package.Literals.USER_ELEMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValidFor() {
		return validFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidFor(String newValidFor) {
		String oldValidFor = validFor;
		validFor = newValidFor;
		boolean oldValidForESet = validForESet;
		validForESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eastadl21Package.USER_ELEMENT_TYPE__VALID_FOR, oldValidFor, validFor, !oldValidForESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetValidFor() {
		String oldValidFor = validFor;
		boolean oldValidForESet = validForESet;
		validFor = VALID_FOR_EDEFAULT;
		validForESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Eastadl21Package.USER_ELEMENT_TYPE__VALID_FOR, oldValidFor, VALID_FOR_EDEFAULT, oldValidForESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetValidFor() {
		return validForESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKey(String newKey) {
		String oldKey = key;
		key = newKey;
		boolean oldKeyESet = keyESet;
		keyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eastadl21Package.USER_ELEMENT_TYPE__KEY, oldKey, key, !oldKeyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetKey() {
		String oldKey = key;
		boolean oldKeyESet = keyESet;
		key = KEY_EDEFAULT;
		keyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Eastadl21Package.USER_ELEMENT_TYPE__KEY, oldKey, KEY_EDEFAULT, oldKeyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetKey() {
		return keyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UserAttributeDefinition> getUaDefinition() {
		if (uaDefinition == null) {
			uaDefinition = new EObjectContainmentEList<UserAttributeDefinition>(UserAttributeDefinition.class, this, Eastadl21Package.USER_ELEMENT_TYPE__UA_DEFINITION);
		}
		return uaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Eastadl21Package.USER_ELEMENT_TYPE__UA_DEFINITION:
				return ((InternalEList<?>)getUaDefinition()).basicRemove(otherEnd, msgs);
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
			case Eastadl21Package.USER_ELEMENT_TYPE__VALID_FOR:
				return getValidFor();
			case Eastadl21Package.USER_ELEMENT_TYPE__KEY:
				return getKey();
			case Eastadl21Package.USER_ELEMENT_TYPE__UA_DEFINITION:
				return getUaDefinition();
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
			case Eastadl21Package.USER_ELEMENT_TYPE__VALID_FOR:
				setValidFor((String)newValue);
				return;
			case Eastadl21Package.USER_ELEMENT_TYPE__KEY:
				setKey((String)newValue);
				return;
			case Eastadl21Package.USER_ELEMENT_TYPE__UA_DEFINITION:
				getUaDefinition().clear();
				getUaDefinition().addAll((Collection<? extends UserAttributeDefinition>)newValue);
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
			case Eastadl21Package.USER_ELEMENT_TYPE__VALID_FOR:
				unsetValidFor();
				return;
			case Eastadl21Package.USER_ELEMENT_TYPE__KEY:
				unsetKey();
				return;
			case Eastadl21Package.USER_ELEMENT_TYPE__UA_DEFINITION:
				getUaDefinition().clear();
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
			case Eastadl21Package.USER_ELEMENT_TYPE__VALID_FOR:
				return isSetValidFor();
			case Eastadl21Package.USER_ELEMENT_TYPE__KEY:
				return isSetKey();
			case Eastadl21Package.USER_ELEMENT_TYPE__UA_DEFINITION:
				return uaDefinition != null && !uaDefinition.isEmpty();
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
		result.append(" (validFor: ");
		if (validForESet) result.append(validFor); else result.append("<unset>");
		result.append(", key: ");
		if (keyESet) result.append(key); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //UserElementTypeImpl
