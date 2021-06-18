/**
 */
package eastadl22_alpha.impl;

import eastadl22_alpha.EAValue;
import eastadl22_alpha.Eastadl22_alphaPackage;
import eastadl22_alpha.Identifiable;
import eastadl22_alpha.UserAttributedElement;
import eastadl22_alpha.UserElementType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Attributed Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eastadl22_alpha.impl.UserAttributedElementImpl#getUaValue <em>Ua Value</em>}</li>
 *   <li>{@link eastadl22_alpha.impl.UserAttributedElementImpl#getUaType <em>Ua Type</em>}</li>
 *   <li>{@link eastadl22_alpha.impl.UserAttributedElementImpl#getAttributedElement <em>Attributed Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserAttributedElementImpl extends EAPackageableElementImpl implements UserAttributedElement {
	/**
	 * The cached value of the '{@link #getUaValue() <em>Ua Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUaValue()
	 * @generated
	 * @ordered
	 */
	protected EList<EAValue> uaValue;

	/**
	 * The cached value of the '{@link #getUaType() <em>Ua Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUaType()
	 * @generated
	 * @ordered
	 */
	protected EList<UserElementType> uaType;

	/**
	 * The cached value of the '{@link #getAttributedElement() <em>Attributed Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributedElement()
	 * @generated
	 * @ordered
	 */
	protected Identifiable attributedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserAttributedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eastadl22_alphaPackage.Literals.USER_ATTRIBUTED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAValue> getUaValue() {
		if (uaValue == null) {
			uaValue = new EObjectContainmentEList<EAValue>(EAValue.class, this, Eastadl22_alphaPackage.USER_ATTRIBUTED_ELEMENT__UA_VALUE);
		}
		return uaValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserElementType> getUaType() {
		if (uaType == null) {
			uaType = new EObjectResolvingEList<UserElementType>(UserElementType.class, this, Eastadl22_alphaPackage.USER_ATTRIBUTED_ELEMENT__UA_TYPE);
		}
		return uaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifiable getAttributedElement() {
		if (attributedElement != null && attributedElement.eIsProxy()) {
			InternalEObject oldAttributedElement = (InternalEObject)attributedElement;
			attributedElement = (Identifiable)eResolveProxy(oldAttributedElement);
			if (attributedElement != oldAttributedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Eastadl22_alphaPackage.USER_ATTRIBUTED_ELEMENT__ATTRIBUTED_ELEMENT, oldAttributedElement, attributedElement));
			}
		}
		return attributedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifiable basicGetAttributedElement() {
		return attributedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributedElement(Identifiable newAttributedElement) {
		Identifiable oldAttributedElement = attributedElement;
		attributedElement = newAttributedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eastadl22_alphaPackage.USER_ATTRIBUTED_ELEMENT__ATTRIBUTED_ELEMENT, oldAttributedElement, attributedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Eastadl22_alphaPackage.USER_ATTRIBUTED_ELEMENT__UA_VALUE:
				return ((InternalEList<?>)getUaValue()).basicRemove(otherEnd, msgs);
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
			case Eastadl22_alphaPackage.USER_ATTRIBUTED_ELEMENT__UA_VALUE:
				return getUaValue();
			case Eastadl22_alphaPackage.USER_ATTRIBUTED_ELEMENT__UA_TYPE:
				return getUaType();
			case Eastadl22_alphaPackage.USER_ATTRIBUTED_ELEMENT__ATTRIBUTED_ELEMENT:
				if (resolve) return getAttributedElement();
				return basicGetAttributedElement();
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
			case Eastadl22_alphaPackage.USER_ATTRIBUTED_ELEMENT__UA_VALUE:
				getUaValue().clear();
				getUaValue().addAll((Collection<? extends EAValue>)newValue);
				return;
			case Eastadl22_alphaPackage.USER_ATTRIBUTED_ELEMENT__UA_TYPE:
				getUaType().clear();
				getUaType().addAll((Collection<? extends UserElementType>)newValue);
				return;
			case Eastadl22_alphaPackage.USER_ATTRIBUTED_ELEMENT__ATTRIBUTED_ELEMENT:
				setAttributedElement((Identifiable)newValue);
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
			case Eastadl22_alphaPackage.USER_ATTRIBUTED_ELEMENT__UA_VALUE:
				getUaValue().clear();
				return;
			case Eastadl22_alphaPackage.USER_ATTRIBUTED_ELEMENT__UA_TYPE:
				getUaType().clear();
				return;
			case Eastadl22_alphaPackage.USER_ATTRIBUTED_ELEMENT__ATTRIBUTED_ELEMENT:
				setAttributedElement((Identifiable)null);
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
			case Eastadl22_alphaPackage.USER_ATTRIBUTED_ELEMENT__UA_VALUE:
				return uaValue != null && !uaValue.isEmpty();
			case Eastadl22_alphaPackage.USER_ATTRIBUTED_ELEMENT__UA_TYPE:
				return uaType != null && !uaType.isEmpty();
			case Eastadl22_alphaPackage.USER_ATTRIBUTED_ELEMENT__ATTRIBUTED_ELEMENT:
				return attributedElement != null;
		}
		return super.eIsSet(featureID);
	}

} //UserAttributedElementImpl
