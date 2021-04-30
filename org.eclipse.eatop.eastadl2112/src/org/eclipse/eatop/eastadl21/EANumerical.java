/**
 */
package org.eclipse.eatop.eastadl21;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EA Numerical</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Datatype for numerical values.
 * 
 * Semantics:
 * EANumerical has attributes for modeling of the allowed range.
 * 
 * Notation:
 * The datatype EANumerical is denoted using the rectangle symbol with keyword «Datatype Numerical».
 * 
 * Extension: UML Datatype
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Infrastructure.Datatypes.EANumerical</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eatop.eastadl21.EANumerical#getMax <em>Max</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.EANumerical#getMin <em>Min</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.EANumerical#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getEANumerical()
 * @model annotation="MetaData guid='{C3B7BF74-6A76-4a54-994D-79812BADB92B}' id='266' EA\040name='EANumerical'"
 *        extendedMetaData="name='EA-NUMERICAL' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='EA-NUMERICALS'"
 * @generated
 */
public interface EANumerical extends EADatatype {
	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximal value of the range.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #isSetMax()
	 * @see #unsetMax()
	 * @see #setMax(String)
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getEANumerical_Max()
	 * @model unsettable="true" dataType="org.eclipse.eatop.eastadl21.Numerical"
	 *        annotation="MetaData guid='{C25DD0A8-12A0-4bc5-BC92-21570DBF9E1C}' id='198' EA\040name='max'"
	 *        extendedMetaData="name='MAX' kind='element'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='MAXS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	String getMax();

	/**
	 * Sets the value of the '{@link org.eclipse.eatop.eastadl21.EANumerical#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #isSetMax()
	 * @see #unsetMax()
	 * @see #getMax()
	 * @generated
	 */
	void setMax(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.eatop.eastadl21.EANumerical#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMax()
	 * @see #getMax()
	 * @see #setMax(String)
	 * @generated
	 */
	void unsetMax();

	/**
	 * Returns whether the value of the '{@link org.eclipse.eatop.eastadl21.EANumerical#getMax <em>Max</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max</em>' attribute is set.
	 * @see #unsetMax()
	 * @see #getMax()
	 * @see #setMax(String)
	 * @generated
	 */
	boolean isSetMax();

	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum value of the range.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #isSetMin()
	 * @see #unsetMin()
	 * @see #setMin(String)
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getEANumerical_Min()
	 * @model unsettable="true" dataType="org.eclipse.eatop.eastadl21.Numerical"
	 *        annotation="MetaData guid='{6800E957-5D78-4ccd-9A07-F217138D38BE}' id='199' EA\040name='min'"
	 *        extendedMetaData="name='MIN' kind='element'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='MINS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	String getMin();

	/**
	 * Sets the value of the '{@link org.eclipse.eatop.eastadl21.EANumerical#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #isSetMin()
	 * @see #unsetMin()
	 * @see #getMin()
	 * @generated
	 */
	void setMin(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.eatop.eastadl21.EANumerical#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMin()
	 * @see #getMin()
	 * @see #setMin(String)
	 * @generated
	 */
	void unsetMin();

	/**
	 * Returns whether the value of the '{@link org.eclipse.eatop.eastadl21.EANumerical#getMin <em>Min</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min</em>' attribute is set.
	 * @see #unsetMin()
	 * @see #getMin()
	 * @see #setMin(String)
	 * @generated
	 */
	boolean isSetMin();

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' reference.
	 * @see #setUnit(Unit)
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getEANumerical_Unit()
	 * @model annotation="MetaData guid='{1CDCA2F1-BC75-4118-BD18-E4DDC077EEAF}' id='104' EA\040name=''"
	 *        extendedMetaData="name='UNIT-REF' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='UNIT-REFS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	Unit getUnit();

	/**
	 * Sets the value of the '{@link org.eclipse.eatop.eastadl21.EANumerical#getUnit <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Unit value);

} // EANumerical
