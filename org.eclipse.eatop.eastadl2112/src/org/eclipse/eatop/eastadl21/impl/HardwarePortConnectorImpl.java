/**
 */
package org.eclipse.eatop.eastadl21.impl;

import java.util.Collection;

import org.eclipse.eatop.eastadl21.AllocationTarget;
import org.eclipse.eatop.eastadl21.Comment;
import org.eclipse.eatop.eastadl21.EAElement;
import org.eclipse.eatop.eastadl21.Eastadl21Package;
import org.eclipse.eatop.eastadl21.HardwareConnector;
import org.eclipse.eatop.eastadl21.HardwarePortConnector;
import org.eclipse.eatop.eastadl21.HardwarePortConnector_port;
import org.eclipse.eatop.eastadl21.Identifiable;
import org.eclipse.eatop.eastadl21.PortConnector;
import org.eclipse.eatop.eastadl21.Referrable;

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
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware Port Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eatop.eastadl21.impl.HardwarePortConnectorImpl#getGShortName <em>GShort Name</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.impl.HardwarePortConnectorImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.impl.HardwarePortConnectorImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.impl.HardwarePortConnectorImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.impl.HardwarePortConnectorImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.impl.HardwarePortConnectorImpl#getOwnedComment <em>Owned Comment</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.impl.HardwarePortConnectorImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.impl.HardwarePortConnectorImpl#getConnector <em>Connector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HardwarePortConnectorImpl extends EAConnectorImpl implements HardwarePortConnector {
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
	 * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwarePortConnector_port> port;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwarePortConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eastadl21Package.Literals.HARDWARE_PORT_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
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
	@Override
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
	@Override
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
	@Override
	public String getShortName() {
		return shortName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShortName(String newShortName) {
		String oldShortName = shortName;
		shortName = newShortName;
		boolean oldShortNameESet = shortNameESet;
		shortNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eastadl21Package.HARDWARE_PORT_CONNECTOR__SHORT_NAME, oldShortName, shortName, !oldShortNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetShortName() {
		String oldShortName = shortName;
		boolean oldShortNameESet = shortNameESet;
		shortName = SHORT_NAME_EDEFAULT;
		shortNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Eastadl21Package.HARDWARE_PORT_CONNECTOR__SHORT_NAME, oldShortName, SHORT_NAME_EDEFAULT, oldShortNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetShortName() {
		return shortNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategory(String newCategory) {
		String oldCategory = category;
		category = newCategory;
		boolean oldCategoryESet = categoryESet;
		categoryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eastadl21Package.HARDWARE_PORT_CONNECTOR__CATEGORY, oldCategory, category, !oldCategoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetCategory() {
		String oldCategory = category;
		boolean oldCategoryESet = categoryESet;
		category = CATEGORY_EDEFAULT;
		categoryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Eastadl21Package.HARDWARE_PORT_CONNECTOR__CATEGORY, oldCategory, CATEGORY_EDEFAULT, oldCategoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetCategory() {
		return categoryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUuid() {
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUuid(String newUuid) {
		String oldUuid = uuid;
		uuid = newUuid;
		boolean oldUuidESet = uuidESet;
		uuidESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eastadl21Package.HARDWARE_PORT_CONNECTOR__UUID, oldUuid, uuid, !oldUuidESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetUuid() {
		String oldUuid = uuid;
		boolean oldUuidESet = uuidESet;
		uuid = UUID_EDEFAULT;
		uuidESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Eastadl21Package.HARDWARE_PORT_CONNECTOR__UUID, oldUuid, UUID_EDEFAULT, oldUuidESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetUuid() {
		return uuidESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		boolean oldNameESet = nameESet;
		nameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eastadl21Package.HARDWARE_PORT_CONNECTOR__NAME, oldName, name, !oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetName() {
		String oldName = name;
		boolean oldNameESet = nameESet;
		name = NAME_EDEFAULT;
		nameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Eastadl21Package.HARDWARE_PORT_CONNECTOR__NAME, oldName, NAME_EDEFAULT, oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetName() {
		return nameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getOwnedComment() {
		if (ownedComment == null) {
			ownedComment = new EObjectContainmentEList<Comment>(Comment.class, this, Eastadl21Package.HARDWARE_PORT_CONNECTOR__OWNED_COMMENT);
		}
		return ownedComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HardwarePortConnector_port> getPort() {
		if (port == null) {
			port = new EObjectContainmentEList<HardwarePortConnector_port>(HardwarePortConnector_port.class, this, Eastadl21Package.HARDWARE_PORT_CONNECTOR__PORT);
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HardwareConnector> getConnector() {
		if (connector == null) {
			connector = new EObjectContainmentEList<HardwareConnector>(HardwareConnector.class, this, Eastadl21Package.HARDWARE_PORT_CONNECTOR__CONNECTOR);
		}
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Eastadl21Package.HARDWARE_PORT_CONNECTOR__OWNED_COMMENT:
				return ((InternalEList<?>)getOwnedComment()).basicRemove(otherEnd, msgs);
			case Eastadl21Package.HARDWARE_PORT_CONNECTOR__PORT:
				return ((InternalEList<?>)getPort()).basicRemove(otherEnd, msgs);
			case Eastadl21Package.HARDWARE_PORT_CONNECTOR__CONNECTOR:
				return ((InternalEList<?>)getConnector()).basicRemove(otherEnd, msgs);
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
			case Eastadl21Package.HARDWARE_PORT_CONNECTOR__GSHORT_NAME:
				return getGShortName();
			case Eastadl21Package.HARDWARE_PORT_CONNECTOR__SHORT_NAME:
				return getShortName();
			case Eastadl21Package.HARDWARE_PORT_CONNECTOR__CATEGORY:
				return getCategory();
			case Eastadl21Package.HARDWARE_PORT_CONNECTOR__UUID:
				return getUuid();
			case Eastadl21Package.HARDWARE_PORT_CONNECTOR__NAME:
				return getName();
			case Eastadl21Package.HARDWARE_PORT_CONNECTOR__OWNED_COMMENT:
				return getOwnedComment();
			case Eastadl21Package.HARDWARE_PORT_CONNECTOR__PORT:
				return getPort();
			case Eastadl21Package.HARDWARE_PORT_CONNECTOR__CONNECTOR:
				return getConnector();
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
			case Eastadl21Package.HARDWARE_PORT_CONNECTOR__GSHORT_NAME:
				setGShortName((String)newValue);
				return;
			case Eastadl21Package.HARDWARE_PORT_CONNECTOR__SHORT_NAME:
				setShortName((String)newValue);
				return;
			case Eastadl21Package.HARDWARE_PORT_CONNECTOR__CATEGORY:
				setCategory((String)newValue);
				return;
			case Eastadl21Package.HARDWARE_PORT_CONNECTOR__UUID:
				setUuid((String)newValue);
				return;
			case Eastadl21Package.HARDWARE_PORT_CONNECTOR__NAME:
				setName((String)newValue);
				return;
			case Eastadl21Package.HARDWARE_PORT_CONNECTOR__OWNED_COMMENT:
				getOwnedComment().clear();
				getOwnedComment().addAll((Collection<? extends Comment>)newValue);
				return;
			case Eastadl21Package.HARDWARE_PORT_CONNECTOR__PORT:
				getPort().clear();
				getPort().addAll((Collection<? extends HardwarePortConnector_port>)newValue);
				return;
			case Eastadl21Package.HARDWARE_PORT_CONNECTOR__CONNECTOR:
				getConnector().clear();
				getConnector().addAll((Collection<? extends HardwareConnector>)newValue);
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
			case Eastadl21Package.HARDWARE_PORT_CONNECTOR__GSHORT_NAME:
				unsetGShortName();
				return;
			case Eastadl21Package.HARDWARE_PORT_CONNECTOR__SHORT_NAME:
				unsetShortName();
				return;
			case Eastadl21Package.HARDWARE_PORT_CONNECTOR__CATEGORY:
				unsetCategory();
				return;
			case Eastadl21Package.HARDWARE_PORT_CONNECTOR__UUID:
				unsetUuid();
				return;
			case Eastadl21Package.HARDWARE_PORT_CONNECTOR__NAME:
				unsetName();
				return;
			case Eastadl21Package.HARDWARE_PORT_CONNECTOR__OWNED_COMMENT:
				getOwnedComment().clear();
				return;
			case Eastadl21Package.HARDWARE_PORT_CONNECTOR__PORT:
				getPort().clear();
				return;
			case Eastadl21Package.HARDWARE_PORT_CONNECTOR__CONNECTOR:
				getConnector().clear();
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
			case Eastadl21Package.HARDWARE_PORT_CONNECTOR__GSHORT_NAME:
				return isSetGShortName();
			case Eastadl21Package.HARDWARE_PORT_CONNECTOR__SHORT_NAME:
				return isSetShortName();
			case Eastadl21Package.HARDWARE_PORT_CONNECTOR__CATEGORY:
				return isSetCategory();
			case Eastadl21Package.HARDWARE_PORT_CONNECTOR__UUID:
				return isSetUuid();
			case Eastadl21Package.HARDWARE_PORT_CONNECTOR__NAME:
				return isSetName();
			case Eastadl21Package.HARDWARE_PORT_CONNECTOR__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case Eastadl21Package.HARDWARE_PORT_CONNECTOR__PORT:
				return port != null && !port.isEmpty();
			case Eastadl21Package.HARDWARE_PORT_CONNECTOR__CONNECTOR:
				return connector != null && !connector.isEmpty();
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
				case Eastadl21Package.HARDWARE_PORT_CONNECTOR__GSHORT_NAME: return GelementsPackage.GREFERRABLE__GSHORT_NAME;
				default: return -1;
			}
		}
		if (baseClass == Referrable.class) {
			switch (derivedFeatureID) {
				case Eastadl21Package.HARDWARE_PORT_CONNECTOR__SHORT_NAME: return Eastadl21Package.REFERRABLE__SHORT_NAME;
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
				case Eastadl21Package.HARDWARE_PORT_CONNECTOR__CATEGORY: return Eastadl21Package.IDENTIFIABLE__CATEGORY;
				case Eastadl21Package.HARDWARE_PORT_CONNECTOR__UUID: return Eastadl21Package.IDENTIFIABLE__UUID;
				default: return -1;
			}
		}
		if (baseClass == EAElement.class) {
			switch (derivedFeatureID) {
				case Eastadl21Package.HARDWARE_PORT_CONNECTOR__NAME: return Eastadl21Package.EA_ELEMENT__NAME;
				case Eastadl21Package.HARDWARE_PORT_CONNECTOR__OWNED_COMMENT: return Eastadl21Package.EA_ELEMENT__OWNED_COMMENT;
				default: return -1;
			}
		}
		if (baseClass == AllocationTarget.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PortConnector.class) {
			switch (derivedFeatureID) {
				case Eastadl21Package.HARDWARE_PORT_CONNECTOR__PORT: return Eastadl21Package.PORT_CONNECTOR__PORT;
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
				case GelementsPackage.GREFERRABLE__GSHORT_NAME: return Eastadl21Package.HARDWARE_PORT_CONNECTOR__GSHORT_NAME;
				default: return -1;
			}
		}
		if (baseClass == Referrable.class) {
			switch (baseFeatureID) {
				case Eastadl21Package.REFERRABLE__SHORT_NAME: return Eastadl21Package.HARDWARE_PORT_CONNECTOR__SHORT_NAME;
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
				case Eastadl21Package.IDENTIFIABLE__CATEGORY: return Eastadl21Package.HARDWARE_PORT_CONNECTOR__CATEGORY;
				case Eastadl21Package.IDENTIFIABLE__UUID: return Eastadl21Package.HARDWARE_PORT_CONNECTOR__UUID;
				default: return -1;
			}
		}
		if (baseClass == EAElement.class) {
			switch (baseFeatureID) {
				case Eastadl21Package.EA_ELEMENT__NAME: return Eastadl21Package.HARDWARE_PORT_CONNECTOR__NAME;
				case Eastadl21Package.EA_ELEMENT__OWNED_COMMENT: return Eastadl21Package.HARDWARE_PORT_CONNECTOR__OWNED_COMMENT;
				default: return -1;
			}
		}
		if (baseClass == AllocationTarget.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PortConnector.class) {
			switch (baseFeatureID) {
				case Eastadl21Package.PORT_CONNECTOR__PORT: return Eastadl21Package.HARDWARE_PORT_CONNECTOR__PORT;
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
		result.append(')');
		return result.toString();
	}

} //HardwarePortConnectorImpl
