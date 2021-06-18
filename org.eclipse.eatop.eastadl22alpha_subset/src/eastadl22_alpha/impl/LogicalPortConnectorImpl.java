/**
 */
package eastadl22_alpha.impl;

import eastadl22_alpha.AllocationTarget;
import eastadl22_alpha.Comment;
import eastadl22_alpha.EAElement;
import eastadl22_alpha.Eastadl22_alphaPackage;
import eastadl22_alpha.HardwareBusKind;
import eastadl22_alpha.HardwarePortConnector_port;
import eastadl22_alpha.Identifiable;
import eastadl22_alpha.LogicalPortConnector;
import eastadl22_alpha.PortConnector;
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
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Port Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eastadl22_alpha.impl.LogicalPortConnectorImpl#getGShortName <em>GShort Name</em>}</li>
 *   <li>{@link eastadl22_alpha.impl.LogicalPortConnectorImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link eastadl22_alpha.impl.LogicalPortConnectorImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link eastadl22_alpha.impl.LogicalPortConnectorImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link eastadl22_alpha.impl.LogicalPortConnectorImpl#getName <em>Name</em>}</li>
 *   <li>{@link eastadl22_alpha.impl.LogicalPortConnectorImpl#getOwnedComment <em>Owned Comment</em>}</li>
 *   <li>{@link eastadl22_alpha.impl.LogicalPortConnectorImpl#getPort <em>Port</em>}</li>
 *   <li>{@link eastadl22_alpha.impl.LogicalPortConnectorImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link eastadl22_alpha.impl.LogicalPortConnectorImpl#getBusSpeed <em>Bus Speed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicalPortConnectorImpl extends EAConnectorImpl implements LogicalPortConnector {
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
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final HardwareBusKind KIND_EDEFAULT = HardwareBusKind.TIME_TRIGGERED;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected HardwareBusKind kind = KIND_EDEFAULT;

	/**
	 * This is true if the Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kindESet;

	/**
	 * The default value of the '{@link #getBusSpeed() <em>Bus Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final Double BUS_SPEED_EDEFAULT = new Double(0.0);

	/**
	 * The cached value of the '{@link #getBusSpeed() <em>Bus Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusSpeed()
	 * @generated
	 * @ordered
	 */
	protected Double busSpeed = BUS_SPEED_EDEFAULT;

	/**
	 * This is true if the Bus Speed attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean busSpeedESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalPortConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eastadl22_alphaPackage.Literals.LOGICAL_PORT_CONNECTOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__SHORT_NAME, oldShortName, shortName, !oldShortNameESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__SHORT_NAME, oldShortName, SHORT_NAME_EDEFAULT, oldShortNameESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__CATEGORY, oldCategory, category, !oldCategoryESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__CATEGORY, oldCategory, CATEGORY_EDEFAULT, oldCategoryESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__UUID, oldUuid, uuid, !oldUuidESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__UUID, oldUuid, UUID_EDEFAULT, oldUuidESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__NAME, oldName, name, !oldNameESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__NAME, oldName, NAME_EDEFAULT, oldNameESet));
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
			ownedComment = new EObjectContainmentEList<Comment>(Comment.class, this, Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__OWNED_COMMENT);
		}
		return ownedComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwarePortConnector_port> getPort() {
		if (port == null) {
			port = new EObjectContainmentEList<HardwarePortConnector_port>(HardwarePortConnector_port.class, this, Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__PORT);
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareBusKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(HardwareBusKind newKind) {
		HardwareBusKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		boolean oldKindESet = kindESet;
		kindESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__KIND, oldKind, kind, !oldKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetKind() {
		HardwareBusKind oldKind = kind;
		boolean oldKindESet = kindESet;
		kind = KIND_EDEFAULT;
		kindESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__KIND, oldKind, KIND_EDEFAULT, oldKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetKind() {
		return kindESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getBusSpeed() {
		return busSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusSpeed(Double newBusSpeed) {
		Double oldBusSpeed = busSpeed;
		busSpeed = newBusSpeed;
		boolean oldBusSpeedESet = busSpeedESet;
		busSpeedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__BUS_SPEED, oldBusSpeed, busSpeed, !oldBusSpeedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBusSpeed() {
		Double oldBusSpeed = busSpeed;
		boolean oldBusSpeedESet = busSpeedESet;
		busSpeed = BUS_SPEED_EDEFAULT;
		busSpeedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__BUS_SPEED, oldBusSpeed, BUS_SPEED_EDEFAULT, oldBusSpeedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBusSpeed() {
		return busSpeedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__OWNED_COMMENT:
				return ((InternalEList<?>)getOwnedComment()).basicRemove(otherEnd, msgs);
			case Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__PORT:
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
			case Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__GSHORT_NAME:
				return getGShortName();
			case Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__SHORT_NAME:
				return getShortName();
			case Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__CATEGORY:
				return getCategory();
			case Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__UUID:
				return getUuid();
			case Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__NAME:
				return getName();
			case Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__OWNED_COMMENT:
				return getOwnedComment();
			case Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__PORT:
				return getPort();
			case Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__KIND:
				return getKind();
			case Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__BUS_SPEED:
				return getBusSpeed();
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
			case Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__GSHORT_NAME:
				setGShortName((String)newValue);
				return;
			case Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__SHORT_NAME:
				setShortName((String)newValue);
				return;
			case Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__CATEGORY:
				setCategory((String)newValue);
				return;
			case Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__UUID:
				setUuid((String)newValue);
				return;
			case Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__NAME:
				setName((String)newValue);
				return;
			case Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__OWNED_COMMENT:
				getOwnedComment().clear();
				getOwnedComment().addAll((Collection<? extends Comment>)newValue);
				return;
			case Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__PORT:
				getPort().clear();
				getPort().addAll((Collection<? extends HardwarePortConnector_port>)newValue);
				return;
			case Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__KIND:
				setKind((HardwareBusKind)newValue);
				return;
			case Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__BUS_SPEED:
				setBusSpeed((Double)newValue);
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
			case Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__GSHORT_NAME:
				unsetGShortName();
				return;
			case Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__SHORT_NAME:
				unsetShortName();
				return;
			case Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__CATEGORY:
				unsetCategory();
				return;
			case Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__UUID:
				unsetUuid();
				return;
			case Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__NAME:
				unsetName();
				return;
			case Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__OWNED_COMMENT:
				getOwnedComment().clear();
				return;
			case Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__PORT:
				getPort().clear();
				return;
			case Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__KIND:
				unsetKind();
				return;
			case Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__BUS_SPEED:
				unsetBusSpeed();
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
			case Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__GSHORT_NAME:
				return isSetGShortName();
			case Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__SHORT_NAME:
				return isSetShortName();
			case Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__CATEGORY:
				return isSetCategory();
			case Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__UUID:
				return isSetUuid();
			case Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__NAME:
				return isSetName();
			case Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__PORT:
				return port != null && !port.isEmpty();
			case Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__KIND:
				return isSetKind();
			case Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__BUS_SPEED:
				return isSetBusSpeed();
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
				case Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__GSHORT_NAME: return GelementsPackage.GREFERRABLE__GSHORT_NAME;
				default: return -1;
			}
		}
		if (baseClass == Referrable.class) {
			switch (derivedFeatureID) {
				case Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__SHORT_NAME: return Eastadl22_alphaPackage.REFERRABLE__SHORT_NAME;
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
				case Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__CATEGORY: return Eastadl22_alphaPackage.IDENTIFIABLE__CATEGORY;
				case Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__UUID: return Eastadl22_alphaPackage.IDENTIFIABLE__UUID;
				default: return -1;
			}
		}
		if (baseClass == EAElement.class) {
			switch (derivedFeatureID) {
				case Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__NAME: return Eastadl22_alphaPackage.EA_ELEMENT__NAME;
				case Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__OWNED_COMMENT: return Eastadl22_alphaPackage.EA_ELEMENT__OWNED_COMMENT;
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
				case Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__PORT: return Eastadl22_alphaPackage.PORT_CONNECTOR__PORT;
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
				case GelementsPackage.GREFERRABLE__GSHORT_NAME: return Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__GSHORT_NAME;
				default: return -1;
			}
		}
		if (baseClass == Referrable.class) {
			switch (baseFeatureID) {
				case Eastadl22_alphaPackage.REFERRABLE__SHORT_NAME: return Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__SHORT_NAME;
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
				case Eastadl22_alphaPackage.IDENTIFIABLE__CATEGORY: return Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__CATEGORY;
				case Eastadl22_alphaPackage.IDENTIFIABLE__UUID: return Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__UUID;
				default: return -1;
			}
		}
		if (baseClass == EAElement.class) {
			switch (baseFeatureID) {
				case Eastadl22_alphaPackage.EA_ELEMENT__NAME: return Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__NAME;
				case Eastadl22_alphaPackage.EA_ELEMENT__OWNED_COMMENT: return Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__OWNED_COMMENT;
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
				case Eastadl22_alphaPackage.PORT_CONNECTOR__PORT: return Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR__PORT;
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
		result.append(", kind: ");
		if (kindESet) result.append(kind); else result.append("<unset>");
		result.append(", busSpeed: ");
		if (busSpeedESet) result.append(busSpeed); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //LogicalPortConnectorImpl
