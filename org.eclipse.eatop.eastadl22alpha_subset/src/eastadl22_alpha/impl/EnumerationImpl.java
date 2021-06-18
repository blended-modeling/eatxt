/**
 */
package eastadl22_alpha.impl;

import eastadl22_alpha.Eastadl22_alphaPackage;
import eastadl22_alpha.Enumeration;
import eastadl22_alpha.EnumerationLiteral;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eastadl22_alpha.impl.EnumerationImpl#getIsMultiValued <em>Is Multi Valued</em>}</li>
 *   <li>{@link eastadl22_alpha.impl.EnumerationImpl#getLiteral <em>Literal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumerationImpl extends EADatatypeImpl implements Enumeration {
	/**
	 * The default value of the '{@link #getIsMultiValued() <em>Is Multi Valued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMultiValued()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_MULTI_VALUED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsMultiValued() <em>Is Multi Valued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMultiValued()
	 * @generated
	 * @ordered
	 */
	protected Boolean isMultiValued = IS_MULTI_VALUED_EDEFAULT;

	/**
	 * This is true if the Is Multi Valued attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isMultiValuedESet;

	/**
	 * The cached value of the '{@link #getLiteral() <em>Literal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiteral()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumerationLiteral> literal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eastadl22_alphaPackage.Literals.ENUMERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsMultiValued() {
		return isMultiValued;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMultiValued(Boolean newIsMultiValued) {
		Boolean oldIsMultiValued = isMultiValued;
		isMultiValued = newIsMultiValued;
		boolean oldIsMultiValuedESet = isMultiValuedESet;
		isMultiValuedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eastadl22_alphaPackage.ENUMERATION__IS_MULTI_VALUED, oldIsMultiValued, isMultiValued, !oldIsMultiValuedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsMultiValued() {
		Boolean oldIsMultiValued = isMultiValued;
		boolean oldIsMultiValuedESet = isMultiValuedESet;
		isMultiValued = IS_MULTI_VALUED_EDEFAULT;
		isMultiValuedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Eastadl22_alphaPackage.ENUMERATION__IS_MULTI_VALUED, oldIsMultiValued, IS_MULTI_VALUED_EDEFAULT, oldIsMultiValuedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsMultiValued() {
		return isMultiValuedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumerationLiteral> getLiteral() {
		if (literal == null) {
			literal = new EObjectContainmentEList<EnumerationLiteral>(EnumerationLiteral.class, this, Eastadl22_alphaPackage.ENUMERATION__LITERAL);
		}
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Eastadl22_alphaPackage.ENUMERATION__LITERAL:
				return ((InternalEList<?>)getLiteral()).basicRemove(otherEnd, msgs);
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
			case Eastadl22_alphaPackage.ENUMERATION__IS_MULTI_VALUED:
				return getIsMultiValued();
			case Eastadl22_alphaPackage.ENUMERATION__LITERAL:
				return getLiteral();
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
			case Eastadl22_alphaPackage.ENUMERATION__IS_MULTI_VALUED:
				setIsMultiValued((Boolean)newValue);
				return;
			case Eastadl22_alphaPackage.ENUMERATION__LITERAL:
				getLiteral().clear();
				getLiteral().addAll((Collection<? extends EnumerationLiteral>)newValue);
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
			case Eastadl22_alphaPackage.ENUMERATION__IS_MULTI_VALUED:
				unsetIsMultiValued();
				return;
			case Eastadl22_alphaPackage.ENUMERATION__LITERAL:
				getLiteral().clear();
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
			case Eastadl22_alphaPackage.ENUMERATION__IS_MULTI_VALUED:
				return isSetIsMultiValued();
			case Eastadl22_alphaPackage.ENUMERATION__LITERAL:
				return literal != null && !literal.isEmpty();
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
		result.append(" (isMultiValued: ");
		if (isMultiValuedESet) result.append(isMultiValued); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //EnumerationImpl
