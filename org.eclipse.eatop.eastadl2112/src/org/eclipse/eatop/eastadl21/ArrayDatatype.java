/**
 */
package org.eclipse.eatop.eastadl21;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Datatype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specification of an array of the typing EADatatype. All elements of the ArrayDatatype have the same datatype.
 * 
 * Semantics:
 * ArrayDatatype is a datatype for an array of datatypes of the same type.
 * 
 * Notation:
 * The datatype ArrayDatatype is denoted using the rectangle symbol with keyword «Datatype ArrayDatatype».
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Infrastructure.Datatypes.ArrayDatatype</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eatop.eastadl21.ArrayDatatype#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.ArrayDatatype#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.ArrayDatatype#getElementType <em>Element Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getArrayDatatype()
 * @model annotation="MetaData guid='{7D607C58-8A67-4b3a-82C7-1268A035D1E1}' id='263' EA\040name='ArrayDatatype'"
 *        extendedMetaData="name='ARRAY-DATATYPE' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='ARRAY-DATATYPES'"
 * @generated
 */
public interface ArrayDatatype extends EADatatype {
	/**
	 * Returns the value of the '<em><b>Max Length</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum number of values in this array. Unbounded if not provided.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Length</em>' attribute.
	 * @see #isSetMaxLength()
	 * @see #unsetMaxLength()
	 * @see #setMaxLength(Integer)
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getArrayDatatype_MaxLength()
	 * @model default="0" unsettable="true" dataType="org.eclipse.eatop.eastadl21.Integer"
	 *        annotation="MetaData guid='{15950005-1114-4549-850B-CA48EAC260EF}' id='189' EA\040name='maxLength'"
	 *        extendedMetaData="name='MAX-LENGTH' kind='element'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='MAX-LENGTHS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	Integer getMaxLength();

	/**
	 * Sets the value of the '{@link org.eclipse.eatop.eastadl21.ArrayDatatype#getMaxLength <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Length</em>' attribute.
	 * @see #isSetMaxLength()
	 * @see #unsetMaxLength()
	 * @see #getMaxLength()
	 * @generated
	 */
	void setMaxLength(Integer value);

	/**
	 * Unsets the value of the '{@link org.eclipse.eatop.eastadl21.ArrayDatatype#getMaxLength <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxLength()
	 * @see #getMaxLength()
	 * @see #setMaxLength(Integer)
	 * @generated
	 */
	void unsetMaxLength();

	/**
	 * Returns whether the value of the '{@link org.eclipse.eatop.eastadl21.ArrayDatatype#getMaxLength <em>Max Length</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Length</em>' attribute is set.
	 * @see #unsetMaxLength()
	 * @see #getMaxLength()
	 * @see #setMaxLength(Integer)
	 * @generated
	 */
	boolean isSetMaxLength();

	/**
	 * Returns the value of the '<em><b>Min Length</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum number of values in this array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Length</em>' attribute.
	 * @see #isSetMinLength()
	 * @see #unsetMinLength()
	 * @see #setMinLength(Integer)
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getArrayDatatype_MinLength()
	 * @model default="0" unsettable="true" dataType="org.eclipse.eatop.eastadl21.Integer"
	 *        annotation="MetaData guid='{C3125712-83B6-448d-AA16-B865C8FF4341}' id='190' EA\040name='minLength'"
	 *        extendedMetaData="name='MIN-LENGTH' kind='element'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='MIN-LENGTHS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	Integer getMinLength();

	/**
	 * Sets the value of the '{@link org.eclipse.eatop.eastadl21.ArrayDatatype#getMinLength <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Length</em>' attribute.
	 * @see #isSetMinLength()
	 * @see #unsetMinLength()
	 * @see #getMinLength()
	 * @generated
	 */
	void setMinLength(Integer value);

	/**
	 * Unsets the value of the '{@link org.eclipse.eatop.eastadl21.ArrayDatatype#getMinLength <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinLength()
	 * @see #getMinLength()
	 * @see #setMinLength(Integer)
	 * @generated
	 */
	void unsetMinLength();

	/**
	 * Returns whether the value of the '{@link org.eclipse.eatop.eastadl21.ArrayDatatype#getMinLength <em>Min Length</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Length</em>' attribute is set.
	 * @see #unsetMinLength()
	 * @see #getMinLength()
	 * @see #setMinLength(Integer)
	 * @generated
	 */
	boolean isSetMinLength();

	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Type</em>' reference.
	 * @see #setElementType(EADatatype)
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getArrayDatatype_ElementType()
	 * @model required="true"
	 *        annotation="MetaData guid='{EE93265B-1F16-4edd-AA26-35AD5C32383E}' id='109' EA\040name=''"
	 *        extendedMetaData="name='ELEMENT-TYPE-REF' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='ELEMENT-TYPE-REFS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	EADatatype getElementType();

	/**
	 * Sets the value of the '{@link org.eclipse.eatop.eastadl21.ArrayDatatype#getElementType <em>Element Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Type</em>' reference.
	 * @see #getElementType()
	 * @generated
	 */
	void setElementType(EADatatype value);

} // ArrayDatatype
