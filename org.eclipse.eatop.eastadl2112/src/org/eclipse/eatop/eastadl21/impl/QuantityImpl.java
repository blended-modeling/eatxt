/**
 */
package org.eclipse.eatop.eastadl21.impl;

import org.eclipse.eatop.eastadl21.Eastadl21Package;
import org.eclipse.eatop.eastadl21.Quantity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eatop.eastadl21.impl.QuantityImpl#getAmountOfSubstanceExp <em>Amount Of Substance Exp</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.impl.QuantityImpl#getElectricCurrentExp <em>Electric Current Exp</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.impl.QuantityImpl#getLengthExp <em>Length Exp</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.impl.QuantityImpl#getLuminousIntensityExp <em>Luminous Intensity Exp</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.impl.QuantityImpl#getMassExp <em>Mass Exp</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.impl.QuantityImpl#getThermodynamicTemperatureExp <em>Thermodynamic Temperature Exp</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.impl.QuantityImpl#getTimeExp <em>Time Exp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuantityImpl extends EAPackageableElementImpl implements Quantity {
	/**
	 * The default value of the '{@link #getAmountOfSubstanceExp() <em>Amount Of Substance Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountOfSubstanceExp()
	 * @generated
	 * @ordered
	 */
	protected static final Integer AMOUNT_OF_SUBSTANCE_EXP_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getAmountOfSubstanceExp() <em>Amount Of Substance Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountOfSubstanceExp()
	 * @generated
	 * @ordered
	 */
	protected Integer amountOfSubstanceExp = AMOUNT_OF_SUBSTANCE_EXP_EDEFAULT;

	/**
	 * This is true if the Amount Of Substance Exp attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean amountOfSubstanceExpESet;

	/**
	 * The default value of the '{@link #getElectricCurrentExp() <em>Electric Current Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectricCurrentExp()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ELECTRIC_CURRENT_EXP_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getElectricCurrentExp() <em>Electric Current Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectricCurrentExp()
	 * @generated
	 * @ordered
	 */
	protected Integer electricCurrentExp = ELECTRIC_CURRENT_EXP_EDEFAULT;

	/**
	 * This is true if the Electric Current Exp attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean electricCurrentExpESet;

	/**
	 * The default value of the '{@link #getLengthExp() <em>Length Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLengthExp()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LENGTH_EXP_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getLengthExp() <em>Length Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLengthExp()
	 * @generated
	 * @ordered
	 */
	protected Integer lengthExp = LENGTH_EXP_EDEFAULT;

	/**
	 * This is true if the Length Exp attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lengthExpESet;

	/**
	 * The default value of the '{@link #getLuminousIntensityExp() <em>Luminous Intensity Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuminousIntensityExp()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LUMINOUS_INTENSITY_EXP_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getLuminousIntensityExp() <em>Luminous Intensity Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuminousIntensityExp()
	 * @generated
	 * @ordered
	 */
	protected Integer luminousIntensityExp = LUMINOUS_INTENSITY_EXP_EDEFAULT;

	/**
	 * This is true if the Luminous Intensity Exp attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean luminousIntensityExpESet;

	/**
	 * The default value of the '{@link #getMassExp() <em>Mass Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMassExp()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MASS_EXP_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getMassExp() <em>Mass Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMassExp()
	 * @generated
	 * @ordered
	 */
	protected Integer massExp = MASS_EXP_EDEFAULT;

	/**
	 * This is true if the Mass Exp attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean massExpESet;

	/**
	 * The default value of the '{@link #getThermodynamicTemperatureExp() <em>Thermodynamic Temperature Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermodynamicTemperatureExp()
	 * @generated
	 * @ordered
	 */
	protected static final Integer THERMODYNAMIC_TEMPERATURE_EXP_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getThermodynamicTemperatureExp() <em>Thermodynamic Temperature Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermodynamicTemperatureExp()
	 * @generated
	 * @ordered
	 */
	protected Integer thermodynamicTemperatureExp = THERMODYNAMIC_TEMPERATURE_EXP_EDEFAULT;

	/**
	 * This is true if the Thermodynamic Temperature Exp attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean thermodynamicTemperatureExpESet;

	/**
	 * The default value of the '{@link #getTimeExp() <em>Time Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeExp()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TIME_EXP_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getTimeExp() <em>Time Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeExp()
	 * @generated
	 * @ordered
	 */
	protected Integer timeExp = TIME_EXP_EDEFAULT;

	/**
	 * This is true if the Time Exp attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean timeExpESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuantityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eastadl21Package.Literals.QUANTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAmountOfSubstanceExp() {
		return amountOfSubstanceExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmountOfSubstanceExp(Integer newAmountOfSubstanceExp) {
		Integer oldAmountOfSubstanceExp = amountOfSubstanceExp;
		amountOfSubstanceExp = newAmountOfSubstanceExp;
		boolean oldAmountOfSubstanceExpESet = amountOfSubstanceExpESet;
		amountOfSubstanceExpESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eastadl21Package.QUANTITY__AMOUNT_OF_SUBSTANCE_EXP, oldAmountOfSubstanceExp, amountOfSubstanceExp, !oldAmountOfSubstanceExpESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAmountOfSubstanceExp() {
		Integer oldAmountOfSubstanceExp = amountOfSubstanceExp;
		boolean oldAmountOfSubstanceExpESet = amountOfSubstanceExpESet;
		amountOfSubstanceExp = AMOUNT_OF_SUBSTANCE_EXP_EDEFAULT;
		amountOfSubstanceExpESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Eastadl21Package.QUANTITY__AMOUNT_OF_SUBSTANCE_EXP, oldAmountOfSubstanceExp, AMOUNT_OF_SUBSTANCE_EXP_EDEFAULT, oldAmountOfSubstanceExpESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAmountOfSubstanceExp() {
		return amountOfSubstanceExpESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getElectricCurrentExp() {
		return electricCurrentExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElectricCurrentExp(Integer newElectricCurrentExp) {
		Integer oldElectricCurrentExp = electricCurrentExp;
		electricCurrentExp = newElectricCurrentExp;
		boolean oldElectricCurrentExpESet = electricCurrentExpESet;
		electricCurrentExpESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eastadl21Package.QUANTITY__ELECTRIC_CURRENT_EXP, oldElectricCurrentExp, electricCurrentExp, !oldElectricCurrentExpESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetElectricCurrentExp() {
		Integer oldElectricCurrentExp = electricCurrentExp;
		boolean oldElectricCurrentExpESet = electricCurrentExpESet;
		electricCurrentExp = ELECTRIC_CURRENT_EXP_EDEFAULT;
		electricCurrentExpESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Eastadl21Package.QUANTITY__ELECTRIC_CURRENT_EXP, oldElectricCurrentExp, ELECTRIC_CURRENT_EXP_EDEFAULT, oldElectricCurrentExpESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetElectricCurrentExp() {
		return electricCurrentExpESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLengthExp() {
		return lengthExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLengthExp(Integer newLengthExp) {
		Integer oldLengthExp = lengthExp;
		lengthExp = newLengthExp;
		boolean oldLengthExpESet = lengthExpESet;
		lengthExpESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eastadl21Package.QUANTITY__LENGTH_EXP, oldLengthExp, lengthExp, !oldLengthExpESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLengthExp() {
		Integer oldLengthExp = lengthExp;
		boolean oldLengthExpESet = lengthExpESet;
		lengthExp = LENGTH_EXP_EDEFAULT;
		lengthExpESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Eastadl21Package.QUANTITY__LENGTH_EXP, oldLengthExp, LENGTH_EXP_EDEFAULT, oldLengthExpESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetLengthExp() {
		return lengthExpESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLuminousIntensityExp() {
		return luminousIntensityExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLuminousIntensityExp(Integer newLuminousIntensityExp) {
		Integer oldLuminousIntensityExp = luminousIntensityExp;
		luminousIntensityExp = newLuminousIntensityExp;
		boolean oldLuminousIntensityExpESet = luminousIntensityExpESet;
		luminousIntensityExpESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eastadl21Package.QUANTITY__LUMINOUS_INTENSITY_EXP, oldLuminousIntensityExp, luminousIntensityExp, !oldLuminousIntensityExpESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLuminousIntensityExp() {
		Integer oldLuminousIntensityExp = luminousIntensityExp;
		boolean oldLuminousIntensityExpESet = luminousIntensityExpESet;
		luminousIntensityExp = LUMINOUS_INTENSITY_EXP_EDEFAULT;
		luminousIntensityExpESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Eastadl21Package.QUANTITY__LUMINOUS_INTENSITY_EXP, oldLuminousIntensityExp, LUMINOUS_INTENSITY_EXP_EDEFAULT, oldLuminousIntensityExpESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetLuminousIntensityExp() {
		return luminousIntensityExpESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMassExp() {
		return massExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMassExp(Integer newMassExp) {
		Integer oldMassExp = massExp;
		massExp = newMassExp;
		boolean oldMassExpESet = massExpESet;
		massExpESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eastadl21Package.QUANTITY__MASS_EXP, oldMassExp, massExp, !oldMassExpESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMassExp() {
		Integer oldMassExp = massExp;
		boolean oldMassExpESet = massExpESet;
		massExp = MASS_EXP_EDEFAULT;
		massExpESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Eastadl21Package.QUANTITY__MASS_EXP, oldMassExp, MASS_EXP_EDEFAULT, oldMassExpESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMassExp() {
		return massExpESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getThermodynamicTemperatureExp() {
		return thermodynamicTemperatureExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThermodynamicTemperatureExp(Integer newThermodynamicTemperatureExp) {
		Integer oldThermodynamicTemperatureExp = thermodynamicTemperatureExp;
		thermodynamicTemperatureExp = newThermodynamicTemperatureExp;
		boolean oldThermodynamicTemperatureExpESet = thermodynamicTemperatureExpESet;
		thermodynamicTemperatureExpESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eastadl21Package.QUANTITY__THERMODYNAMIC_TEMPERATURE_EXP, oldThermodynamicTemperatureExp, thermodynamicTemperatureExp, !oldThermodynamicTemperatureExpESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetThermodynamicTemperatureExp() {
		Integer oldThermodynamicTemperatureExp = thermodynamicTemperatureExp;
		boolean oldThermodynamicTemperatureExpESet = thermodynamicTemperatureExpESet;
		thermodynamicTemperatureExp = THERMODYNAMIC_TEMPERATURE_EXP_EDEFAULT;
		thermodynamicTemperatureExpESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Eastadl21Package.QUANTITY__THERMODYNAMIC_TEMPERATURE_EXP, oldThermodynamicTemperatureExp, THERMODYNAMIC_TEMPERATURE_EXP_EDEFAULT, oldThermodynamicTemperatureExpESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetThermodynamicTemperatureExp() {
		return thermodynamicTemperatureExpESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTimeExp() {
		return timeExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeExp(Integer newTimeExp) {
		Integer oldTimeExp = timeExp;
		timeExp = newTimeExp;
		boolean oldTimeExpESet = timeExpESet;
		timeExpESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eastadl21Package.QUANTITY__TIME_EXP, oldTimeExp, timeExp, !oldTimeExpESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTimeExp() {
		Integer oldTimeExp = timeExp;
		boolean oldTimeExpESet = timeExpESet;
		timeExp = TIME_EXP_EDEFAULT;
		timeExpESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Eastadl21Package.QUANTITY__TIME_EXP, oldTimeExp, TIME_EXP_EDEFAULT, oldTimeExpESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTimeExp() {
		return timeExpESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Eastadl21Package.QUANTITY__AMOUNT_OF_SUBSTANCE_EXP:
				return getAmountOfSubstanceExp();
			case Eastadl21Package.QUANTITY__ELECTRIC_CURRENT_EXP:
				return getElectricCurrentExp();
			case Eastadl21Package.QUANTITY__LENGTH_EXP:
				return getLengthExp();
			case Eastadl21Package.QUANTITY__LUMINOUS_INTENSITY_EXP:
				return getLuminousIntensityExp();
			case Eastadl21Package.QUANTITY__MASS_EXP:
				return getMassExp();
			case Eastadl21Package.QUANTITY__THERMODYNAMIC_TEMPERATURE_EXP:
				return getThermodynamicTemperatureExp();
			case Eastadl21Package.QUANTITY__TIME_EXP:
				return getTimeExp();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Eastadl21Package.QUANTITY__AMOUNT_OF_SUBSTANCE_EXP:
				setAmountOfSubstanceExp((Integer)newValue);
				return;
			case Eastadl21Package.QUANTITY__ELECTRIC_CURRENT_EXP:
				setElectricCurrentExp((Integer)newValue);
				return;
			case Eastadl21Package.QUANTITY__LENGTH_EXP:
				setLengthExp((Integer)newValue);
				return;
			case Eastadl21Package.QUANTITY__LUMINOUS_INTENSITY_EXP:
				setLuminousIntensityExp((Integer)newValue);
				return;
			case Eastadl21Package.QUANTITY__MASS_EXP:
				setMassExp((Integer)newValue);
				return;
			case Eastadl21Package.QUANTITY__THERMODYNAMIC_TEMPERATURE_EXP:
				setThermodynamicTemperatureExp((Integer)newValue);
				return;
			case Eastadl21Package.QUANTITY__TIME_EXP:
				setTimeExp((Integer)newValue);
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
			case Eastadl21Package.QUANTITY__AMOUNT_OF_SUBSTANCE_EXP:
				unsetAmountOfSubstanceExp();
				return;
			case Eastadl21Package.QUANTITY__ELECTRIC_CURRENT_EXP:
				unsetElectricCurrentExp();
				return;
			case Eastadl21Package.QUANTITY__LENGTH_EXP:
				unsetLengthExp();
				return;
			case Eastadl21Package.QUANTITY__LUMINOUS_INTENSITY_EXP:
				unsetLuminousIntensityExp();
				return;
			case Eastadl21Package.QUANTITY__MASS_EXP:
				unsetMassExp();
				return;
			case Eastadl21Package.QUANTITY__THERMODYNAMIC_TEMPERATURE_EXP:
				unsetThermodynamicTemperatureExp();
				return;
			case Eastadl21Package.QUANTITY__TIME_EXP:
				unsetTimeExp();
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
			case Eastadl21Package.QUANTITY__AMOUNT_OF_SUBSTANCE_EXP:
				return isSetAmountOfSubstanceExp();
			case Eastadl21Package.QUANTITY__ELECTRIC_CURRENT_EXP:
				return isSetElectricCurrentExp();
			case Eastadl21Package.QUANTITY__LENGTH_EXP:
				return isSetLengthExp();
			case Eastadl21Package.QUANTITY__LUMINOUS_INTENSITY_EXP:
				return isSetLuminousIntensityExp();
			case Eastadl21Package.QUANTITY__MASS_EXP:
				return isSetMassExp();
			case Eastadl21Package.QUANTITY__THERMODYNAMIC_TEMPERATURE_EXP:
				return isSetThermodynamicTemperatureExp();
			case Eastadl21Package.QUANTITY__TIME_EXP:
				return isSetTimeExp();
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
		result.append(" (amountOfSubstanceExp: ");
		if (amountOfSubstanceExpESet) result.append(amountOfSubstanceExp); else result.append("<unset>");
		result.append(", electricCurrentExp: ");
		if (electricCurrentExpESet) result.append(electricCurrentExp); else result.append("<unset>");
		result.append(", lengthExp: ");
		if (lengthExpESet) result.append(lengthExp); else result.append("<unset>");
		result.append(", luminousIntensityExp: ");
		if (luminousIntensityExpESet) result.append(luminousIntensityExp); else result.append("<unset>");
		result.append(", massExp: ");
		if (massExpESet) result.append(massExp); else result.append("<unset>");
		result.append(", thermodynamicTemperatureExp: ");
		if (thermodynamicTemperatureExpESet) result.append(thermodynamicTemperatureExp); else result.append("<unset>");
		result.append(", timeExp: ");
		if (timeExpESet) result.append(timeExp); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //QuantityImpl
