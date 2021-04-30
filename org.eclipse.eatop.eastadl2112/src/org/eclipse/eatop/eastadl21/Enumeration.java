/**
 */
package org.eclipse.eatop.eastadl21;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An enumeration is a datatype whose values are enumerated in the model as enumeration literals. Enumeration is a kind of datatype, whose instances may be any of a number of user-defined enumeration literals.
 * 
 * Semantics:
 * Enumeration is a kind of datatype, whose instances may be any number &gt; 1 of user-defined enumeration literals. Enumerations contain at least two literals, otherwise it would be a constant. The contained literals need to be ordered.
 * 
 * 
 * Notation:
 * The datatype Enumeration is denoted using the rectangle symbol with keyword «Datatype Enumeration».
 * 
 * Extension: UML Enumeration
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Infrastructure.Datatypes.Enumeration</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eatop.eastadl21.Enumeration#getIsMultiValued <em>Is Multi Valued</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.Enumeration#getLiteral <em>Literal</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getEnumeration()
 * @model annotation="MetaData guid='{1C38542B-750C-400a-84E6-ED07357E8D81}' id='262' EA\040name='Enumeration'"
 *        extendedMetaData="name='ENUMERATION' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='ENUMERATIONS'"
 * @generated
 */
public interface Enumeration extends EADatatype {
	/**
	 * Returns the value of the '<em><b>Is Multi Valued</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This boolean attribute is true, if multiple enumeration values can be selected. It is false, if only one enumeration value is allowed to be selected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Multi Valued</em>' attribute.
	 * @see #isSetIsMultiValued()
	 * @see #unsetIsMultiValued()
	 * @see #setIsMultiValued(Boolean)
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getEnumeration_IsMultiValued()
	 * @model default="false" unsettable="true" dataType="org.eclipse.eatop.eastadl21.Boolean" required="true"
	 *        annotation="MetaData guid='{8CE013ED-5893-48c6-9CAA-F0ABA98C7FC8}' id='188' EA\040name='isMultiValued'"
	 *        extendedMetaData="name='IS-MULTI-VALUED' kind='element'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='IS-MULTI-VALUEDS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	Boolean getIsMultiValued();

	/**
	 * Sets the value of the '{@link org.eclipse.eatop.eastadl21.Enumeration#getIsMultiValued <em>Is Multi Valued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Multi Valued</em>' attribute.
	 * @see #isSetIsMultiValued()
	 * @see #unsetIsMultiValued()
	 * @see #getIsMultiValued()
	 * @generated
	 */
	void setIsMultiValued(Boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.eatop.eastadl21.Enumeration#getIsMultiValued <em>Is Multi Valued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsMultiValued()
	 * @see #getIsMultiValued()
	 * @see #setIsMultiValued(Boolean)
	 * @generated
	 */
	void unsetIsMultiValued();

	/**
	 * Returns whether the value of the '{@link org.eclipse.eatop.eastadl21.Enumeration#getIsMultiValued <em>Is Multi Valued</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Multi Valued</em>' attribute is set.
	 * @see #unsetIsMultiValued()
	 * @see #getIsMultiValued()
	 * @see #setIsMultiValued(Boolean)
	 * @generated
	 */
	boolean isSetIsMultiValued();

	/**
	 * Returns the value of the '<em><b>Literal</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.eatop.eastadl21.EnumerationLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal</em>' containment reference list.
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getEnumeration_Literal()
	 * @model containment="true" lower="2"
	 *        annotation="MetaData guid='{6952ECD4-6D2C-49c8-945A-9AF4F6C8AEB2}' id='106' EA\040name=''"
	 *        extendedMetaData="name='LITERAL' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='LITERALS' xmlAttribute='false' featureWrapperElement='true' featureElement='false' classifierWrapperElement='false' classifierElement='true'"
	 * @generated
	 */
	EList<EnumerationLiteral> getLiteral();

} // Enumeration
