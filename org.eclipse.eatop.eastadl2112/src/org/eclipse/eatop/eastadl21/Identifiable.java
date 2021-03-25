/**
 */
package org.eclipse.eatop.eastadl21;

import org.eclipse.eatop.geastadl.ginfrastructure.gelements.GIdentifiable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifiable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This abstract element adds a UUID attribute to the Referrable element which is specialized.
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Infrastructure.Elements.Identifiable</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eatop.eastadl21.Identifiable#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.Identifiable#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getIdentifiable()
 * @model abstract="true"
 *        annotation="MetaData guid='{2860CE0C-2776-4873-8C44-223AAF7DF8F3}' id='244' EA\040name='Identifiable'"
 *        extendedMetaData="name='IDENTIFIABLE' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='IDENTIFIABLES'"
 * @generated
 */
public interface Identifiable extends Referrable, GIdentifiable {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element assigns a category to the parent element. The category is intended to specialize the usage and/or the content identifiable object. Such a specialization may also impose particular semantic constraints on the entire substructure (not only the identifiable itself).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #isSetCategory()
	 * @see #unsetCategory()
	 * @see #setCategory(String)
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getIdentifiable_Category()
	 * @model unsettable="true" dataType="org.eclipse.eatop.eastadl21.Identifier"
	 *        annotation="MetaData guid='{08AA5134-D7F8-4560-B626-A952B30D27CF}' id='183' EA\040name='category'"
	 *        annotation="TaggedValues xml.sequenceOffset='-50'"
	 *        extendedMetaData="kind='element' namespace='http://east-adl.info/2.1.12' name='CATEGORY'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='CATEGORYS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link org.eclipse.eatop.eastadl21.Identifiable#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #isSetCategory()
	 * @see #unsetCategory()
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.eatop.eastadl21.Identifiable#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategory()
	 * @see #getCategory()
	 * @see #setCategory(String)
	 * @generated
	 */
	void unsetCategory();

	/**
	 * Returns whether the value of the '{@link org.eclipse.eatop.eastadl21.Identifiable#getCategory <em>Category</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Category</em>' attribute is set.
	 * @see #unsetCategory()
	 * @see #getCategory()
	 * @see #setCategory(String)
	 * @generated
	 */
	boolean isSetCategory();

	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The purpose of this attribute is to provide a globally unique identifier for an instance of a metaclass. The values of this attribute should be globally unique strings prefixed by the type of identifier.  For example, to include a
	 * DCE UUID as defined by The Open Group, the UUID would be preceded by "DCE:". The values of this attribute may be used to support merging of different models. 
	 * The form of the UUID (Universally Unique Identifier) is taken from a standard defined by the Open Group (was Open Software Foundation). This standard is widely used, including by Microsoft for COM (GUIDs) and by many companies for DCE, which is based on CORBA. The method for generating these 128-bit IDs is published in the standard and the effectiveness and uniqueness of the IDs is not in practice disputed.
	 * If the id namespace is omitted, DCE is assumed. 
	 * An example is "DCE:2fac1234-31f8-11b4-a222-08002b34c003".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #isSetUuid()
	 * @see #unsetUuid()
	 * @see #setUuid(String)
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getIdentifiable_Uuid()
	 * @model unsettable="true" dataType="org.eclipse.eatop.eastadl21.String"
	 *        annotation="MetaData guid='{C090F23D-AA65-44a7-A0CE-F1626239B24F}' id='184' EA\040name='uuid'"
	 *        annotation="TaggedValues xml.attribute='true'"
	 *        extendedMetaData="kind='attribute' name='UUID'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='UUIDS' xmlAttribute='true' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link org.eclipse.eatop.eastadl21.Identifiable#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #isSetUuid()
	 * @see #unsetUuid()
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.eatop.eastadl21.Identifiable#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUuid()
	 * @see #getUuid()
	 * @see #setUuid(String)
	 * @generated
	 */
	void unsetUuid();

	/**
	 * Returns whether the value of the '{@link org.eclipse.eatop.eastadl21.Identifiable#getUuid <em>Uuid</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Uuid</em>' attribute is set.
	 * @see #unsetUuid()
	 * @see #getUuid()
	 * @see #setUuid(String)
	 * @generated
	 */
	boolean isSetUuid();

} // Identifiable
