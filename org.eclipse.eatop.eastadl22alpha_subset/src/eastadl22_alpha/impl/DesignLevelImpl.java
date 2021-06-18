/**
 */
package eastadl22_alpha.impl;

import eastadl22_alpha.Allocation;
import eastadl22_alpha.DesignFunctionPrototype;
import eastadl22_alpha.DesignLevel;
import eastadl22_alpha.Eastadl22_alphaPackage;
import eastadl22_alpha.HardwareComponentPrototype;

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
 * An implementation of the model object '<em><b>Design Level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eastadl22_alpha.impl.DesignLevelImpl#getAllocation <em>Allocation</em>}</li>
 *   <li>{@link eastadl22_alpha.impl.DesignLevelImpl#getFunctionalDesignArchitecture <em>Functional Design Architecture</em>}</li>
 *   <li>{@link eastadl22_alpha.impl.DesignLevelImpl#getHardwareDesignArchitecture <em>Hardware Design Architecture</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DesignLevelImpl extends ContextImpl implements DesignLevel {
	/**
	 * The cached value of the '{@link #getAllocation() <em>Allocation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocation()
	 * @generated
	 * @ordered
	 */
	protected EList<Allocation> allocation;

	/**
	 * The cached value of the '{@link #getFunctionalDesignArchitecture() <em>Functional Design Architecture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalDesignArchitecture()
	 * @generated
	 * @ordered
	 */
	protected DesignFunctionPrototype functionalDesignArchitecture;

	/**
	 * The cached value of the '{@link #getHardwareDesignArchitecture() <em>Hardware Design Architecture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareDesignArchitecture()
	 * @generated
	 * @ordered
	 */
	protected HardwareComponentPrototype hardwareDesignArchitecture;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DesignLevelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eastadl22_alphaPackage.Literals.DESIGN_LEVEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Allocation> getAllocation() {
		if (allocation == null) {
			allocation = new EObjectContainmentEList<Allocation>(Allocation.class, this, Eastadl22_alphaPackage.DESIGN_LEVEL__ALLOCATION);
		}
		return allocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignFunctionPrototype getFunctionalDesignArchitecture() {
		return functionalDesignArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunctionalDesignArchitecture(DesignFunctionPrototype newFunctionalDesignArchitecture, NotificationChain msgs) {
		DesignFunctionPrototype oldFunctionalDesignArchitecture = functionalDesignArchitecture;
		functionalDesignArchitecture = newFunctionalDesignArchitecture;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Eastadl22_alphaPackage.DESIGN_LEVEL__FUNCTIONAL_DESIGN_ARCHITECTURE, oldFunctionalDesignArchitecture, newFunctionalDesignArchitecture);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionalDesignArchitecture(DesignFunctionPrototype newFunctionalDesignArchitecture) {
		if (newFunctionalDesignArchitecture != functionalDesignArchitecture) {
			NotificationChain msgs = null;
			if (functionalDesignArchitecture != null)
				msgs = ((InternalEObject)functionalDesignArchitecture).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Eastadl22_alphaPackage.DESIGN_LEVEL__FUNCTIONAL_DESIGN_ARCHITECTURE, null, msgs);
			if (newFunctionalDesignArchitecture != null)
				msgs = ((InternalEObject)newFunctionalDesignArchitecture).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Eastadl22_alphaPackage.DESIGN_LEVEL__FUNCTIONAL_DESIGN_ARCHITECTURE, null, msgs);
			msgs = basicSetFunctionalDesignArchitecture(newFunctionalDesignArchitecture, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eastadl22_alphaPackage.DESIGN_LEVEL__FUNCTIONAL_DESIGN_ARCHITECTURE, newFunctionalDesignArchitecture, newFunctionalDesignArchitecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareComponentPrototype getHardwareDesignArchitecture() {
		return hardwareDesignArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHardwareDesignArchitecture(HardwareComponentPrototype newHardwareDesignArchitecture, NotificationChain msgs) {
		HardwareComponentPrototype oldHardwareDesignArchitecture = hardwareDesignArchitecture;
		hardwareDesignArchitecture = newHardwareDesignArchitecture;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Eastadl22_alphaPackage.DESIGN_LEVEL__HARDWARE_DESIGN_ARCHITECTURE, oldHardwareDesignArchitecture, newHardwareDesignArchitecture);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHardwareDesignArchitecture(HardwareComponentPrototype newHardwareDesignArchitecture) {
		if (newHardwareDesignArchitecture != hardwareDesignArchitecture) {
			NotificationChain msgs = null;
			if (hardwareDesignArchitecture != null)
				msgs = ((InternalEObject)hardwareDesignArchitecture).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Eastadl22_alphaPackage.DESIGN_LEVEL__HARDWARE_DESIGN_ARCHITECTURE, null, msgs);
			if (newHardwareDesignArchitecture != null)
				msgs = ((InternalEObject)newHardwareDesignArchitecture).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Eastadl22_alphaPackage.DESIGN_LEVEL__HARDWARE_DESIGN_ARCHITECTURE, null, msgs);
			msgs = basicSetHardwareDesignArchitecture(newHardwareDesignArchitecture, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eastadl22_alphaPackage.DESIGN_LEVEL__HARDWARE_DESIGN_ARCHITECTURE, newHardwareDesignArchitecture, newHardwareDesignArchitecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Eastadl22_alphaPackage.DESIGN_LEVEL__ALLOCATION:
				return ((InternalEList<?>)getAllocation()).basicRemove(otherEnd, msgs);
			case Eastadl22_alphaPackage.DESIGN_LEVEL__FUNCTIONAL_DESIGN_ARCHITECTURE:
				return basicSetFunctionalDesignArchitecture(null, msgs);
			case Eastadl22_alphaPackage.DESIGN_LEVEL__HARDWARE_DESIGN_ARCHITECTURE:
				return basicSetHardwareDesignArchitecture(null, msgs);
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
			case Eastadl22_alphaPackage.DESIGN_LEVEL__ALLOCATION:
				return getAllocation();
			case Eastadl22_alphaPackage.DESIGN_LEVEL__FUNCTIONAL_DESIGN_ARCHITECTURE:
				return getFunctionalDesignArchitecture();
			case Eastadl22_alphaPackage.DESIGN_LEVEL__HARDWARE_DESIGN_ARCHITECTURE:
				return getHardwareDesignArchitecture();
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
			case Eastadl22_alphaPackage.DESIGN_LEVEL__ALLOCATION:
				getAllocation().clear();
				getAllocation().addAll((Collection<? extends Allocation>)newValue);
				return;
			case Eastadl22_alphaPackage.DESIGN_LEVEL__FUNCTIONAL_DESIGN_ARCHITECTURE:
				setFunctionalDesignArchitecture((DesignFunctionPrototype)newValue);
				return;
			case Eastadl22_alphaPackage.DESIGN_LEVEL__HARDWARE_DESIGN_ARCHITECTURE:
				setHardwareDesignArchitecture((HardwareComponentPrototype)newValue);
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
			case Eastadl22_alphaPackage.DESIGN_LEVEL__ALLOCATION:
				getAllocation().clear();
				return;
			case Eastadl22_alphaPackage.DESIGN_LEVEL__FUNCTIONAL_DESIGN_ARCHITECTURE:
				setFunctionalDesignArchitecture((DesignFunctionPrototype)null);
				return;
			case Eastadl22_alphaPackage.DESIGN_LEVEL__HARDWARE_DESIGN_ARCHITECTURE:
				setHardwareDesignArchitecture((HardwareComponentPrototype)null);
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
			case Eastadl22_alphaPackage.DESIGN_LEVEL__ALLOCATION:
				return allocation != null && !allocation.isEmpty();
			case Eastadl22_alphaPackage.DESIGN_LEVEL__FUNCTIONAL_DESIGN_ARCHITECTURE:
				return functionalDesignArchitecture != null;
			case Eastadl22_alphaPackage.DESIGN_LEVEL__HARDWARE_DESIGN_ARCHITECTURE:
				return hardwareDesignArchitecture != null;
		}
		return super.eIsSet(featureID);
	}

} //DesignLevelImpl
