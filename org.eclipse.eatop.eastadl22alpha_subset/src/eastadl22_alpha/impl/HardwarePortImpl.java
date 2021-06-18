/**
 */
package eastadl22_alpha.impl;

import eastadl22_alpha.AllocationTarget;
import eastadl22_alpha.Comment;
import eastadl22_alpha.EAElement;
import eastadl22_alpha.Eastadl22_alphaPackage;
import eastadl22_alpha.HardwarePin;
import eastadl22_alpha.HardwarePort;
import eastadl22_alpha.Identifiable;
import eastadl22_alpha.Referrable;

import java.util.Collection;

import org.eclipse.eatop.geastadl.ginfrastructure.gelements.GIdentifiable;
import org.eclipse.eatop.geastadl.ginfrastructure.gelements.GReferrable;
import org.eclipse.eatop.geastadl.ginfrastructure.gelements.GelementsPackage;

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
 * An implementation of the model object '<em><b>Hardware Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eastadl22_alpha.impl.HardwarePortImpl#getGShortName <em>GShort Name</em>}</li>
 *   <li>{@link eastadl22_alpha.impl.HardwarePortImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link eastadl22_alpha.impl.HardwarePortImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link eastadl22_alpha.impl.HardwarePortImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link eastadl22_alpha.impl.HardwarePortImpl#getName <em>Name</em>}</li>
 *   <li>{@link eastadl22_alpha.impl.HardwarePortImpl#getOwnedComment <em>Owned Comment</em>}</li>
 *   <li>{@link eastadl22_alpha.impl.HardwarePortImpl#getIsShield <em>Is Shield</em>}</li>
 *   <li>{@link eastadl22_alpha.impl.HardwarePortImpl#getContainedPin <em>Contained Pin</em>}</li>
 *   <li>{@link eastadl22_alpha.impl.HardwarePortImpl#getContainedPort <em>Contained Port</em>}</li>
 *   <li>{@link eastadl22_alpha.impl.HardwarePortImpl#getReferencedPin <em>Referenced Pin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HardwarePortImpl extends EAPortImpl implements HardwarePort {
	/**
	 * The default value of the '{@link #getGShortName() <em>GShort Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGShortName()
	 * @generated
	 * @ordered
	 */
	protected static final String GSHORT_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected String shortName = SHORT_NAME_EDEFAULT;

	/**
	 * This is true if the Short Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean shortNameESet;

	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected String category = CATEGORY_EDEFAULT;

	/**
	 * This is true if the Category attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categoryESet;

	/**
	 * The default value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected static final String UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected String uuid = UUID_EDEFAULT;

	/**
	 * This is true if the Uuid attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean uuidESet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * This is true if the Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nameESet;

	/**
	 * The cached value of the '{@link #getOwnedComment() <em>Owned Comment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedComment()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> ownedComment;

	/**
	 * The default value of the '{@link #getIsShield() <em>Is Shield</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsShield()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_SHIELD_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsShield() <em>Is Shield</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsShield()
	 * @generated
	 * @ordered
	 */
	protected Boolean isShield = IS_SHIELD_EDEFAULT;

	/**
	 * This is true if the Is Shield attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isShieldESet;

	/**
	 * The cached value of the '{@link #getContainedPin() <em>Contained Pin</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedPin()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwarePin> containedPin;

	/**
	 * The cached value of the '{@link #getContainedPort() <em>Contained Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedPort()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwarePort> containedPort;

	/**
	 * The cached value of the '{@link #getReferencedPin() <em>Referenced Pin</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedPin()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwarePin> referencedPin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwarePortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eastadl22_alphaPackage.Literals.HARDWARE_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGShortName() {
		// TODO: implement this method to return the 'GShort Name' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGShortName(String newGShortName) {
		// TODO: implement this method to set the 'GShort Name' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGShortName() {
		// TODO: implement this method to unset the 'GShort Name' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGShortName() {
		// TODO: implement this method to return whether the 'GShort Name' attribute is set
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShortName() {
		return shortName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortName(String newShortName) {
		String oldShortName = shortName;
		shortName = newShortName;
		boolean oldShortNameESet = shortNameESet;
		shortNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eastadl22_alphaPackage.HARDWARE_PORT__SHORT_NAME, oldShortName, shortName, !oldShortNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShortName() {
		String oldShortName = shortName;
		boolean oldShortNameESet = shortNameESet;
		shortName = SHORT_NAME_EDEFAULT;
		shortNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Eastadl22_alphaPackage.HARDWARE_PORT__SHORT_NAME, oldShortName, SHORT_NAME_EDEFAULT, oldShortNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShortName() {
		return shortNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(String newCategory) {
		String oldCategory = category;
		category = newCategory;
		boolean oldCategoryESet = categoryESet;
		categoryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eastadl22_alphaPackage.HARDWARE_PORT__CATEGORY, oldCategory, category, !oldCategoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategory() {
		String oldCategory = category;
		boolean oldCategoryESet = categoryESet;
		category = CATEGORY_EDEFAULT;
		categoryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Eastadl22_alphaPackage.HARDWARE_PORT__CATEGORY, oldCategory, CATEGORY_EDEFAULT, oldCategoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCategory() {
		return categoryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUuid() {
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUuid(String newUuid) {
		String oldUuid = uuid;
		uuid = newUuid;
		boolean oldUuidESet = uuidESet;
		uuidESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eastadl22_alphaPackage.HARDWARE_PORT__UUID, oldUuid, uuid, !oldUuidESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUuid() {
		String oldUuid = uuid;
		boolean oldUuidESet = uuidESet;
		uuid = UUID_EDEFAULT;
		uuidESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Eastadl22_alphaPackage.HARDWARE_PORT__UUID, oldUuid, UUID_EDEFAULT, oldUuidESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUuid() {
		return uuidESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		boolean oldNameESet = nameESet;
		nameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eastadl22_alphaPackage.HARDWARE_PORT__NAME, oldName, name, !oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		String oldName = name;
		boolean oldNameESet = nameESet;
		name = NAME_EDEFAULT;
		nameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Eastadl22_alphaPackage.HARDWARE_PORT__NAME, oldName, NAME_EDEFAULT, oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return nameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comment> getOwnedComment() {
		if (ownedComment == null) {
			ownedComment = new EObjectContainmentEList<Comment>(Comment.class, this, Eastadl22_alphaPackage.HARDWARE_PORT__OWNED_COMMENT);
		}
		return ownedComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsShield() {
		return isShield;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsShield(Boolean newIsShield) {
		Boolean oldIsShield = isShield;
		isShield = newIsShield;
		boolean oldIsShieldESet = isShieldESet;
		isShieldESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eastadl22_alphaPackage.HARDWARE_PORT__IS_SHIELD, oldIsShield, isShield, !oldIsShieldESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsShield() {
		Boolean oldIsShield = isShield;
		boolean oldIsShieldESet = isShieldESet;
		isShield = IS_SHIELD_EDEFAULT;
		isShieldESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Eastadl22_alphaPackage.HARDWARE_PORT__IS_SHIELD, oldIsShield, IS_SHIELD_EDEFAULT, oldIsShieldESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsShield() {
		return isShieldESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwarePin> getContainedPin() {
		if (containedPin == null) {
			containedPin = new EObjectContainmentEList<HardwarePin>(HardwarePin.class, this, Eastadl22_alphaPackage.HARDWARE_PORT__CONTAINED_PIN);
		}
		return containedPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwarePort> getContainedPort() {
		if (containedPort == null) {
			containedPort = new EObjectContainmentEList<HardwarePort>(HardwarePort.class, this, Eastadl22_alphaPackage.HARDWARE_PORT__CONTAINED_PORT);
		}
		return containedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwarePin> getReferencedPin() {
		if (referencedPin == null) {
			referencedPin = new EObjectResolvingEList<HardwarePin>(HardwarePin.class, this, Eastadl22_alphaPackage.HARDWARE_PORT__REFERENCED_PIN);
		}
		return referencedPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Eastadl22_alphaPackage.HARDWARE_PORT__OWNED_COMMENT:
				return ((InternalEList<?>)getOwnedComment()).basicRemove(otherEnd, msgs);
			case Eastadl22_alphaPackage.HARDWARE_PORT__CONTAINED_PIN:
				return ((InternalEList<?>)getContainedPin()).basicRemove(otherEnd, msgs);
			case Eastadl22_alphaPackage.HARDWARE_PORT__CONTAINED_PORT:
				return ((InternalEList<?>)getContainedPort()).basicRemove(otherEnd, msgs);
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
			case Eastadl22_alphaPackage.HARDWARE_PORT__GSHORT_NAME:
				return getGShortName();
			case Eastadl22_alphaPackage.HARDWARE_PORT__SHORT_NAME:
				return getShortName();
			case Eastadl22_alphaPackage.HARDWARE_PORT__CATEGORY:
				return getCategory();
			case Eastadl22_alphaPackage.HARDWARE_PORT__UUID:
				return getUuid();
			case Eastadl22_alphaPackage.HARDWARE_PORT__NAME:
				return getName();
			case Eastadl22_alphaPackage.HARDWARE_PORT__OWNED_COMMENT:
				return getOwnedComment();
			case Eastadl22_alphaPackage.HARDWARE_PORT__IS_SHIELD:
				return getIsShield();
			case Eastadl22_alphaPackage.HARDWARE_PORT__CONTAINED_PIN:
				return getContainedPin();
			case Eastadl22_alphaPackage.HARDWARE_PORT__CONTAINED_PORT:
				return getContainedPort();
			case Eastadl22_alphaPackage.HARDWARE_PORT__REFERENCED_PIN:
				return getReferencedPin();
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
			case Eastadl22_alphaPackage.HARDWARE_PORT__GSHORT_NAME:
				setGShortName((String)newValue);
				return;
			case Eastadl22_alphaPackage.HARDWARE_PORT__SHORT_NAME:
				setShortName((String)newValue);
				return;
			case Eastadl22_alphaPackage.HARDWARE_PORT__CATEGORY:
				setCategory((String)newValue);
				return;
			case Eastadl22_alphaPackage.HARDWARE_PORT__UUID:
				setUuid((String)newValue);
				return;
			case Eastadl22_alphaPackage.HARDWARE_PORT__NAME:
				setName((String)newValue);
				return;
			case Eastadl22_alphaPackage.HARDWARE_PORT__OWNED_COMMENT:
				getOwnedComment().clear();
				getOwnedComment().addAll((Collection<? extends Comment>)newValue);
				return;
			case Eastadl22_alphaPackage.HARDWARE_PORT__IS_SHIELD:
				setIsShield((Boolean)newValue);
				return;
			case Eastadl22_alphaPackage.HARDWARE_PORT__CONTAINED_PIN:
				getContainedPin().clear();
				getContainedPin().addAll((Collection<? extends HardwarePin>)newValue);
				return;
			case Eastadl22_alphaPackage.HARDWARE_PORT__CONTAINED_PORT:
				getContainedPort().clear();
				getContainedPort().addAll((Collection<? extends HardwarePort>)newValue);
				return;
			case Eastadl22_alphaPackage.HARDWARE_PORT__REFERENCED_PIN:
				getReferencedPin().clear();
				getReferencedPin().addAll((Collection<? extends HardwarePin>)newValue);
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
			case Eastadl22_alphaPackage.HARDWARE_PORT__GSHORT_NAME:
				unsetGShortName();
				return;
			case Eastadl22_alphaPackage.HARDWARE_PORT__SHORT_NAME:
				unsetShortName();
				return;
			case Eastadl22_alphaPackage.HARDWARE_PORT__CATEGORY:
				unsetCategory();
				return;
			case Eastadl22_alphaPackage.HARDWARE_PORT__UUID:
				unsetUuid();
				return;
			case Eastadl22_alphaPackage.HARDWARE_PORT__NAME:
				unsetName();
				return;
			case Eastadl22_alphaPackage.HARDWARE_PORT__OWNED_COMMENT:
				getOwnedComment().clear();
				return;
			case Eastadl22_alphaPackage.HARDWARE_PORT__IS_SHIELD:
				unsetIsShield();
				return;
			case Eastadl22_alphaPackage.HARDWARE_PORT__CONTAINED_PIN:
				getContainedPin().clear();
				return;
			case Eastadl22_alphaPackage.HARDWARE_PORT__CONTAINED_PORT:
				getContainedPort().clear();
				return;
			case Eastadl22_alphaPackage.HARDWARE_PORT__REFERENCED_PIN:
				getReferencedPin().clear();
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
			case Eastadl22_alphaPackage.HARDWARE_PORT__GSHORT_NAME:
				return isSetGShortName();
			case Eastadl22_alphaPackage.HARDWARE_PORT__SHORT_NAME:
				return isSetShortName();
			case Eastadl22_alphaPackage.HARDWARE_PORT__CATEGORY:
				return isSetCategory();
			case Eastadl22_alphaPackage.HARDWARE_PORT__UUID:
				return isSetUuid();
			case Eastadl22_alphaPackage.HARDWARE_PORT__NAME:
				return isSetName();
			case Eastadl22_alphaPackage.HARDWARE_PORT__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case Eastadl22_alphaPackage.HARDWARE_PORT__IS_SHIELD:
				return isSetIsShield();
			case Eastadl22_alphaPackage.HARDWARE_PORT__CONTAINED_PIN:
				return containedPin != null && !containedPin.isEmpty();
			case Eastadl22_alphaPackage.HARDWARE_PORT__CONTAINED_PORT:
				return containedPort != null && !containedPort.isEmpty();
			case Eastadl22_alphaPackage.HARDWARE_PORT__REFERENCED_PIN:
				return referencedPin != null && !referencedPin.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == GReferrable.class) {
			switch (derivedFeatureID) {
				case Eastadl22_alphaPackage.HARDWARE_PORT__GSHORT_NAME: return GelementsPackage.GREFERRABLE__GSHORT_NAME;
				default: return -1;
			}
		}
		if (baseClass == Referrable.class) {
			switch (derivedFeatureID) {
				case Eastadl22_alphaPackage.HARDWARE_PORT__SHORT_NAME: return Eastadl22_alphaPackage.REFERRABLE__SHORT_NAME;
				default: return -1;
			}
		}
		if (baseClass == GIdentifiable.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Identifiable.class) {
			switch (derivedFeatureID) {
				case Eastadl22_alphaPackage.HARDWARE_PORT__CATEGORY: return Eastadl22_alphaPackage.IDENTIFIABLE__CATEGORY;
				case Eastadl22_alphaPackage.HARDWARE_PORT__UUID: return Eastadl22_alphaPackage.IDENTIFIABLE__UUID;
				default: return -1;
			}
		}
		if (baseClass == EAElement.class) {
			switch (derivedFeatureID) {
				case Eastadl22_alphaPackage.HARDWARE_PORT__NAME: return Eastadl22_alphaPackage.EA_ELEMENT__NAME;
				case Eastadl22_alphaPackage.HARDWARE_PORT__OWNED_COMMENT: return Eastadl22_alphaPackage.EA_ELEMENT__OWNED_COMMENT;
				default: return -1;
			}
		}
		if (baseClass == AllocationTarget.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == GReferrable.class) {
			switch (baseFeatureID) {
				case GelementsPackage.GREFERRABLE__GSHORT_NAME: return Eastadl22_alphaPackage.HARDWARE_PORT__GSHORT_NAME;
				default: return -1;
			}
		}
		if (baseClass == Referrable.class) {
			switch (baseFeatureID) {
				case Eastadl22_alphaPackage.REFERRABLE__SHORT_NAME: return Eastadl22_alphaPackage.HARDWARE_PORT__SHORT_NAME;
				default: return -1;
			}
		}
		if (baseClass == GIdentifiable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Identifiable.class) {
			switch (baseFeatureID) {
				case Eastadl22_alphaPackage.IDENTIFIABLE__CATEGORY: return Eastadl22_alphaPackage.HARDWARE_PORT__CATEGORY;
				case Eastadl22_alphaPackage.IDENTIFIABLE__UUID: return Eastadl22_alphaPackage.HARDWARE_PORT__UUID;
				default: return -1;
			}
		}
		if (baseClass == EAElement.class) {
			switch (baseFeatureID) {
				case Eastadl22_alphaPackage.EA_ELEMENT__NAME: return Eastadl22_alphaPackage.HARDWARE_PORT__NAME;
				case Eastadl22_alphaPackage.EA_ELEMENT__OWNED_COMMENT: return Eastadl22_alphaPackage.HARDWARE_PORT__OWNED_COMMENT;
				default: return -1;
			}
		}
		if (baseClass == AllocationTarget.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (shortName: ");
		if (shortNameESet) result.append(shortName); else result.append("<unset>");
		result.append(", category: ");
		if (categoryESet) result.append(category); else result.append("<unset>");
		result.append(", uuid: ");
		if (uuidESet) result.append(uuid); else result.append("<unset>");
		result.append(", name: ");
		if (nameESet) result.append(name); else result.append("<unset>");
		result.append(", isShield: ");
		if (isShieldESet) result.append(isShield); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //HardwarePortImpl
