/**
 */
package eastadl22_alpha;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Quantity describes a physical dimension by exponents of the available attributes.
 * 
 * Some examples of Quantity are:
 * name = "Length" and lengthExp = "1"
 * 
 * name = "Angle" and all attribues = 0, i.e. angle is without dimension.
 * 
 * name = "Acceleration" and lengthExp = 1 and timeExp =-2.
 * 
 * Semantics:
 * The Quantity describes a physical dimension for use in numerical datatypes and expressions to facilitate dimension consistency and control.
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Infrastructure.Datatypes.Quantity</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eastadl22_alpha.Quantity#getAmountOfSubstanceExp <em>Amount Of Substance Exp</em>}</li>
 *   <li>{@link eastadl22_alpha.Quantity#getElectricCurrentExp <em>Electric Current Exp</em>}</li>
 *   <li>{@link eastadl22_alpha.Quantity#getLengthExp <em>Length Exp</em>}</li>
 *   <li>{@link eastadl22_alpha.Quantity#getLuminousIntensityExp <em>Luminous Intensity Exp</em>}</li>
 *   <li>{@link eastadl22_alpha.Quantity#getMassExp <em>Mass Exp</em>}</li>
 *   <li>{@link eastadl22_alpha.Quantity#getThermodynamicTemperatureExp <em>Thermodynamic Temperature Exp</em>}</li>
 *   <li>{@link eastadl22_alpha.Quantity#getTimeExp <em>Time Exp</em>}</li>
 * </ul>
 *
 * @see eastadl22_alpha.Eastadl22_alphaPackage#getQuantity()
 * @model annotation="MetaData guid='{9A214F41-622B-474d-9FD8-133338E36FBF}' id='265' EA\040name='Quantity'"
 *        extendedMetaData="name='QUANTITY' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='QUANTITYS'"
 * @generated
 */
public interface Quantity extends EAPackageableElement {
	/**
	 * Returns the value of the '<em><b>Amount Of Substance Exp</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Of Substance Exp</em>' attribute.
	 * @see #isSetAmountOfSubstanceExp()
	 * @see #unsetAmountOfSubstanceExp()
	 * @see #setAmountOfSubstanceExp(Integer)
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getQuantity_AmountOfSubstanceExp()
	 * @model default="0" unsettable="true" dataType="eastadl22_alpha.Integer" required="true"
	 *        annotation="MetaData guid='{FD6D780D-6692-4852-9446-3B1F9BF25F25}' id='191' EA\040name='amountOfSubstanceExp'"
	 *        extendedMetaData="name='AMOUNT-OF-SUBSTANCE-EXP' kind='element'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='AMOUNT-OF-SUBSTANCE-EXPS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	Integer getAmountOfSubstanceExp();

	/**
	 * Sets the value of the '{@link eastadl22_alpha.Quantity#getAmountOfSubstanceExp <em>Amount Of Substance Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Of Substance Exp</em>' attribute.
	 * @see #isSetAmountOfSubstanceExp()
	 * @see #unsetAmountOfSubstanceExp()
	 * @see #getAmountOfSubstanceExp()
	 * @generated
	 */
	void setAmountOfSubstanceExp(Integer value);

	/**
	 * Unsets the value of the '{@link eastadl22_alpha.Quantity#getAmountOfSubstanceExp <em>Amount Of Substance Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAmountOfSubstanceExp()
	 * @see #getAmountOfSubstanceExp()
	 * @see #setAmountOfSubstanceExp(Integer)
	 * @generated
	 */
	void unsetAmountOfSubstanceExp();

	/**
	 * Returns whether the value of the '{@link eastadl22_alpha.Quantity#getAmountOfSubstanceExp <em>Amount Of Substance Exp</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Amount Of Substance Exp</em>' attribute is set.
	 * @see #unsetAmountOfSubstanceExp()
	 * @see #getAmountOfSubstanceExp()
	 * @see #setAmountOfSubstanceExp(Integer)
	 * @generated
	 */
	boolean isSetAmountOfSubstanceExp();

	/**
	 * Returns the value of the '<em><b>Electric Current Exp</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electric Current Exp</em>' attribute.
	 * @see #isSetElectricCurrentExp()
	 * @see #unsetElectricCurrentExp()
	 * @see #setElectricCurrentExp(Integer)
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getQuantity_ElectricCurrentExp()
	 * @model default="0" unsettable="true" dataType="eastadl22_alpha.Integer" required="true"
	 *        annotation="MetaData guid='{60D49918-E376-4522-A81F-E0A05F76AF50}' id='192' EA\040name='electricCurrentExp'"
	 *        extendedMetaData="name='ELECTRIC-CURRENT-EXP' kind='element'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='ELECTRIC-CURRENT-EXPS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	Integer getElectricCurrentExp();

	/**
	 * Sets the value of the '{@link eastadl22_alpha.Quantity#getElectricCurrentExp <em>Electric Current Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Electric Current Exp</em>' attribute.
	 * @see #isSetElectricCurrentExp()
	 * @see #unsetElectricCurrentExp()
	 * @see #getElectricCurrentExp()
	 * @generated
	 */
	void setElectricCurrentExp(Integer value);

	/**
	 * Unsets the value of the '{@link eastadl22_alpha.Quantity#getElectricCurrentExp <em>Electric Current Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetElectricCurrentExp()
	 * @see #getElectricCurrentExp()
	 * @see #setElectricCurrentExp(Integer)
	 * @generated
	 */
	void unsetElectricCurrentExp();

	/**
	 * Returns whether the value of the '{@link eastadl22_alpha.Quantity#getElectricCurrentExp <em>Electric Current Exp</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Electric Current Exp</em>' attribute is set.
	 * @see #unsetElectricCurrentExp()
	 * @see #getElectricCurrentExp()
	 * @see #setElectricCurrentExp(Integer)
	 * @generated
	 */
	boolean isSetElectricCurrentExp();

	/**
	 * Returns the value of the '<em><b>Length Exp</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length Exp</em>' attribute.
	 * @see #isSetLengthExp()
	 * @see #unsetLengthExp()
	 * @see #setLengthExp(Integer)
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getQuantity_LengthExp()
	 * @model default="0" unsettable="true" dataType="eastadl22_alpha.Integer" required="true"
	 *        annotation="MetaData guid='{C1D4278D-D4FE-4b67-A5FA-2F79D2BE7DCA}' id='193' EA\040name='lengthExp'"
	 *        extendedMetaData="name='LENGTH-EXP' kind='element'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='LENGTH-EXPS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	Integer getLengthExp();

	/**
	 * Sets the value of the '{@link eastadl22_alpha.Quantity#getLengthExp <em>Length Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length Exp</em>' attribute.
	 * @see #isSetLengthExp()
	 * @see #unsetLengthExp()
	 * @see #getLengthExp()
	 * @generated
	 */
	void setLengthExp(Integer value);

	/**
	 * Unsets the value of the '{@link eastadl22_alpha.Quantity#getLengthExp <em>Length Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLengthExp()
	 * @see #getLengthExp()
	 * @see #setLengthExp(Integer)
	 * @generated
	 */
	void unsetLengthExp();

	/**
	 * Returns whether the value of the '{@link eastadl22_alpha.Quantity#getLengthExp <em>Length Exp</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Length Exp</em>' attribute is set.
	 * @see #unsetLengthExp()
	 * @see #getLengthExp()
	 * @see #setLengthExp(Integer)
	 * @generated
	 */
	boolean isSetLengthExp();

	/**
	 * Returns the value of the '<em><b>Luminous Intensity Exp</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Luminous Intensity Exp</em>' attribute.
	 * @see #isSetLuminousIntensityExp()
	 * @see #unsetLuminousIntensityExp()
	 * @see #setLuminousIntensityExp(Integer)
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getQuantity_LuminousIntensityExp()
	 * @model default="0" unsettable="true" dataType="eastadl22_alpha.Integer" required="true"
	 *        annotation="MetaData guid='{A0748C47-CFBD-466b-BAB3-CC7FB5EF2B1A}' id='194' EA\040name='luminousIntensityExp'"
	 *        extendedMetaData="name='LUMINOUS-INTENSITY-EXP' kind='element'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='LUMINOUS-INTENSITY-EXPS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	Integer getLuminousIntensityExp();

	/**
	 * Sets the value of the '{@link eastadl22_alpha.Quantity#getLuminousIntensityExp <em>Luminous Intensity Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Luminous Intensity Exp</em>' attribute.
	 * @see #isSetLuminousIntensityExp()
	 * @see #unsetLuminousIntensityExp()
	 * @see #getLuminousIntensityExp()
	 * @generated
	 */
	void setLuminousIntensityExp(Integer value);

	/**
	 * Unsets the value of the '{@link eastadl22_alpha.Quantity#getLuminousIntensityExp <em>Luminous Intensity Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLuminousIntensityExp()
	 * @see #getLuminousIntensityExp()
	 * @see #setLuminousIntensityExp(Integer)
	 * @generated
	 */
	void unsetLuminousIntensityExp();

	/**
	 * Returns whether the value of the '{@link eastadl22_alpha.Quantity#getLuminousIntensityExp <em>Luminous Intensity Exp</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Luminous Intensity Exp</em>' attribute is set.
	 * @see #unsetLuminousIntensityExp()
	 * @see #getLuminousIntensityExp()
	 * @see #setLuminousIntensityExp(Integer)
	 * @generated
	 */
	boolean isSetLuminousIntensityExp();

	/**
	 * Returns the value of the '<em><b>Mass Exp</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Exp</em>' attribute.
	 * @see #isSetMassExp()
	 * @see #unsetMassExp()
	 * @see #setMassExp(Integer)
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getQuantity_MassExp()
	 * @model default="0" unsettable="true" dataType="eastadl22_alpha.Integer" required="true"
	 *        annotation="MetaData guid='{0D1E18D0-4B5B-4534-91CC-2D07AE83AD3D}' id='195' EA\040name='massExp'"
	 *        extendedMetaData="name='MASS-EXP' kind='element'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='MASS-EXPS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	Integer getMassExp();

	/**
	 * Sets the value of the '{@link eastadl22_alpha.Quantity#getMassExp <em>Mass Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Exp</em>' attribute.
	 * @see #isSetMassExp()
	 * @see #unsetMassExp()
	 * @see #getMassExp()
	 * @generated
	 */
	void setMassExp(Integer value);

	/**
	 * Unsets the value of the '{@link eastadl22_alpha.Quantity#getMassExp <em>Mass Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMassExp()
	 * @see #getMassExp()
	 * @see #setMassExp(Integer)
	 * @generated
	 */
	void unsetMassExp();

	/**
	 * Returns whether the value of the '{@link eastadl22_alpha.Quantity#getMassExp <em>Mass Exp</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mass Exp</em>' attribute is set.
	 * @see #unsetMassExp()
	 * @see #getMassExp()
	 * @see #setMassExp(Integer)
	 * @generated
	 */
	boolean isSetMassExp();

	/**
	 * Returns the value of the '<em><b>Thermodynamic Temperature Exp</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermodynamic Temperature Exp</em>' attribute.
	 * @see #isSetThermodynamicTemperatureExp()
	 * @see #unsetThermodynamicTemperatureExp()
	 * @see #setThermodynamicTemperatureExp(Integer)
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getQuantity_ThermodynamicTemperatureExp()
	 * @model default="0" unsettable="true" dataType="eastadl22_alpha.Integer" required="true"
	 *        annotation="MetaData guid='{C746E241-A891-4338-8B1F-C8321C50CD62}' id='196' EA\040name='thermodynamicTemperatureExp'"
	 *        extendedMetaData="name='THERMODYNAMIC-TEMPERATURE-EXP' kind='element'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='THERMODYNAMIC-TEMPERATURE-EXPS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	Integer getThermodynamicTemperatureExp();

	/**
	 * Sets the value of the '{@link eastadl22_alpha.Quantity#getThermodynamicTemperatureExp <em>Thermodynamic Temperature Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermodynamic Temperature Exp</em>' attribute.
	 * @see #isSetThermodynamicTemperatureExp()
	 * @see #unsetThermodynamicTemperatureExp()
	 * @see #getThermodynamicTemperatureExp()
	 * @generated
	 */
	void setThermodynamicTemperatureExp(Integer value);

	/**
	 * Unsets the value of the '{@link eastadl22_alpha.Quantity#getThermodynamicTemperatureExp <em>Thermodynamic Temperature Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThermodynamicTemperatureExp()
	 * @see #getThermodynamicTemperatureExp()
	 * @see #setThermodynamicTemperatureExp(Integer)
	 * @generated
	 */
	void unsetThermodynamicTemperatureExp();

	/**
	 * Returns whether the value of the '{@link eastadl22_alpha.Quantity#getThermodynamicTemperatureExp <em>Thermodynamic Temperature Exp</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Thermodynamic Temperature Exp</em>' attribute is set.
	 * @see #unsetThermodynamicTemperatureExp()
	 * @see #getThermodynamicTemperatureExp()
	 * @see #setThermodynamicTemperatureExp(Integer)
	 * @generated
	 */
	boolean isSetThermodynamicTemperatureExp();

	/**
	 * Returns the value of the '<em><b>Time Exp</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Exp</em>' attribute.
	 * @see #isSetTimeExp()
	 * @see #unsetTimeExp()
	 * @see #setTimeExp(Integer)
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getQuantity_TimeExp()
	 * @model default="0" unsettable="true" dataType="eastadl22_alpha.Integer" required="true"
	 *        annotation="MetaData guid='{83A2FF1C-B49A-4e63-AF5E-F8C9E83640D5}' id='197' EA\040name='timeExp'"
	 *        extendedMetaData="name='TIME-EXP' kind='element'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='TIME-EXPS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	Integer getTimeExp();

	/**
	 * Sets the value of the '{@link eastadl22_alpha.Quantity#getTimeExp <em>Time Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Exp</em>' attribute.
	 * @see #isSetTimeExp()
	 * @see #unsetTimeExp()
	 * @see #getTimeExp()
	 * @generated
	 */
	void setTimeExp(Integer value);

	/**
	 * Unsets the value of the '{@link eastadl22_alpha.Quantity#getTimeExp <em>Time Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTimeExp()
	 * @see #getTimeExp()
	 * @see #setTimeExp(Integer)
	 * @generated
	 */
	void unsetTimeExp();

	/**
	 * Returns whether the value of the '{@link eastadl22_alpha.Quantity#getTimeExp <em>Time Exp</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Time Exp</em>' attribute is set.
	 * @see #unsetTimeExp()
	 * @see #getTimeExp()
	 * @see #setTimeExp(Integer)
	 * @generated
	 */
	boolean isSetTimeExp();

} // Quantity
