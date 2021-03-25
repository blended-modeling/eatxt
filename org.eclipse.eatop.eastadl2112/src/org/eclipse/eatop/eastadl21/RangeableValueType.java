/**
 */
package org.eclipse.eatop.eastadl21;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rangeable Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The RangeableValueType is a specific datatype applicable for numerical datatypes. It describes the accuracy, resolution, and the significant digits of the baseRangeable datatype.
 * 
 * Semantics:
 * The RangeableValueType adds the ability to describe the accuracy, resolution, and the significant digits of the baseRangeable datatype.
 * 
 * Notation:
 * The datatype RangeableValueType is denoted using the rectangle symbol with keyword «Datatype RangeableValueType».
 * 
 * Extension: UML Datatype, SysML ValueType
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Infrastructure.Datatypes.RangeableValueType</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eatop.eastadl21.RangeableValueType#getAccuracy <em>Accuracy</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.RangeableValueType#getResolution <em>Resolution</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.RangeableValueType#getSignificantDigits <em>Significant Digits</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.RangeableValueType#getBaseRangeable <em>Base Rangeable</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getRangeableValueType()
 * @model annotation="MetaData guid='{F91A2609-CAE8-45ee-B554-475516D6AA50}' id='270' EA\040name='RangeableValueType'"
 *        extendedMetaData="name='RANGEABLE-VALUE-TYPE' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='RANGEABLE-VALUE-TYPES'"
 * @generated
 */
public interface RangeableValueType extends EADatatype {
	/**
	 * Returns the value of the '<em><b>Accuracy</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The accuracy of the data (e.g., the FunctionFlowports input or output).
	 * 
	 * Example: An accuracy of 0.5 of the temperature means a communicated value of 19 represents an actual temperature of 19 +/- 0.5 degrees.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Accuracy</em>' attribute.
	 * @see #isSetAccuracy()
	 * @see #unsetAccuracy()
	 * @see #setAccuracy(Double)
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getRangeableValueType_Accuracy()
	 * @model default="0.0" unsettable="true" dataType="org.eclipse.eatop.eastadl21.Float" required="true"
	 *        annotation="MetaData guid='{4FF031B7-25F8-49d6-8E60-939E81519C03}' id='203' EA\040name='accuracy'"
	 *        extendedMetaData="name='ACCURACY' kind='element'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='ACCURACYS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	Double getAccuracy();

	/**
	 * Sets the value of the '{@link org.eclipse.eatop.eastadl21.RangeableValueType#getAccuracy <em>Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accuracy</em>' attribute.
	 * @see #isSetAccuracy()
	 * @see #unsetAccuracy()
	 * @see #getAccuracy()
	 * @generated
	 */
	void setAccuracy(Double value);

	/**
	 * Unsets the value of the '{@link org.eclipse.eatop.eastadl21.RangeableValueType#getAccuracy <em>Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAccuracy()
	 * @see #getAccuracy()
	 * @see #setAccuracy(Double)
	 * @generated
	 */
	void unsetAccuracy();

	/**
	 * Returns whether the value of the '{@link org.eclipse.eatop.eastadl21.RangeableValueType#getAccuracy <em>Accuracy</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Accuracy</em>' attribute is set.
	 * @see #unsetAccuracy()
	 * @see #getAccuracy()
	 * @see #setAccuracy(Double)
	 * @generated
	 */
	boolean isSetAccuracy();

	/**
	 * Returns the value of the '<em><b>Resolution</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The resolution of the data expressed as the size of the minimum difference between data values. 
	 * 
	 * Example: A resolution of 0.1 means that temperature may be represented in increments of 0.1 degree.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resolution</em>' attribute.
	 * @see #isSetResolution()
	 * @see #unsetResolution()
	 * @see #setResolution(Double)
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getRangeableValueType_Resolution()
	 * @model default="0.0" unsettable="true" dataType="org.eclipse.eatop.eastadl21.Float" required="true"
	 *        annotation="MetaData guid='{1AC5048F-DCC4-4963-B10F-0FD142E8C247}' id='204' EA\040name='resolution'"
	 *        extendedMetaData="name='RESOLUTION' kind='element'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='RESOLUTIONS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	Double getResolution();

	/**
	 * Sets the value of the '{@link org.eclipse.eatop.eastadl21.RangeableValueType#getResolution <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution</em>' attribute.
	 * @see #isSetResolution()
	 * @see #unsetResolution()
	 * @see #getResolution()
	 * @generated
	 */
	void setResolution(Double value);

	/**
	 * Unsets the value of the '{@link org.eclipse.eatop.eastadl21.RangeableValueType#getResolution <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResolution()
	 * @see #getResolution()
	 * @see #setResolution(Double)
	 * @generated
	 */
	void unsetResolution();

	/**
	 * Returns whether the value of the '{@link org.eclipse.eatop.eastadl21.RangeableValueType#getResolution <em>Resolution</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Resolution</em>' attribute is set.
	 * @see #unsetResolution()
	 * @see #getResolution()
	 * @see #setResolution(Double)
	 * @generated
	 */
	boolean isSetResolution();

	/**
	 * Returns the value of the '<em><b>Significant Digits</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of significant digits, e.g., for the speed case: if the speed is a one digit number (e.g., 5 km/h), then this digit is significant, if the speed is a two digits number (e.g., 15 km/h), then the first digit is significant (here: 1), if the speed is a three digits number (e.g., 215 km/h), then the first two digits are significant (here: 21). Significant means here, that the respective digits are reliable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Significant Digits</em>' attribute.
	 * @see #isSetSignificantDigits()
	 * @see #unsetSignificantDigits()
	 * @see #setSignificantDigits(Integer)
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getRangeableValueType_SignificantDigits()
	 * @model default="0" unsettable="true" dataType="org.eclipse.eatop.eastadl21.Integer"
	 *        annotation="MetaData guid='{12B85D1C-E996-4b27-9526-255B0990F4F4}' id='205' EA\040name='significantDigits'"
	 *        extendedMetaData="name='SIGNIFICANT-DIGITS' kind='element'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='SIGNIFICANT-DIGITSS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	Integer getSignificantDigits();

	/**
	 * Sets the value of the '{@link org.eclipse.eatop.eastadl21.RangeableValueType#getSignificantDigits <em>Significant Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Significant Digits</em>' attribute.
	 * @see #isSetSignificantDigits()
	 * @see #unsetSignificantDigits()
	 * @see #getSignificantDigits()
	 * @generated
	 */
	void setSignificantDigits(Integer value);

	/**
	 * Unsets the value of the '{@link org.eclipse.eatop.eastadl21.RangeableValueType#getSignificantDigits <em>Significant Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSignificantDigits()
	 * @see #getSignificantDigits()
	 * @see #setSignificantDigits(Integer)
	 * @generated
	 */
	void unsetSignificantDigits();

	/**
	 * Returns whether the value of the '{@link org.eclipse.eatop.eastadl21.RangeableValueType#getSignificantDigits <em>Significant Digits</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Significant Digits</em>' attribute is set.
	 * @see #unsetSignificantDigits()
	 * @see #getSignificantDigits()
	 * @see #setSignificantDigits(Integer)
	 * @generated
	 */
	boolean isSetSignificantDigits();

	/**
	 * Returns the value of the '<em><b>Base Rangeable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Rangeable</em>' reference.
	 * @see #setBaseRangeable(EANumerical)
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getRangeableValueType_BaseRangeable()
	 * @model required="true"
	 *        annotation="MetaData guid='{9D58C294-993F-4b4f-B075-8A9799F7CD0F}' id='103' EA\040name=''"
	 *        extendedMetaData="name='BASE-RANGEABLE-REF' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='BASE-RANGEABLE-REFS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	EANumerical getBaseRangeable();

	/**
	 * Sets the value of the '{@link org.eclipse.eatop.eastadl21.RangeableValueType#getBaseRangeable <em>Base Rangeable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Rangeable</em>' reference.
	 * @see #getBaseRangeable()
	 * @generated
	 */
	void setBaseRangeable(EANumerical value);

} // RangeableValueType
