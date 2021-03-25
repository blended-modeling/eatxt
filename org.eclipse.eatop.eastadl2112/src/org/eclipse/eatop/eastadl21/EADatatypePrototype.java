/**
 */
package org.eclipse.eatop.eastadl21;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EA Datatype Prototype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The EADatatypePrototype represents a typed variable. An example is a composite datatype ColorValue with parts R, G, and B of type integer. ColorValue would contain three prototypes only to be able to reference the record parts by name. 
 * 
 * Semantics:
 * The EADatatypePrototype represents a typed variable. It acts as an appearance of a datatype.
 * 
 * Extension: Class
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Infrastructure.Datatypes.EADatatypePrototype</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eatop.eastadl21.EADatatypePrototype#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getEADatatypePrototype()
 * @model annotation="MetaData guid='{193FFECB-A63A-4e69-893D-78F409864CB6}' id='261' EA\040name='EADatatypePrototype'"
 *        annotation="Stereotype Stereotype='atpPrototype'"
 *        extendedMetaData="name='EA-DATATYPE-PROTOTYPE' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='EA-DATATYPE-PROTOTYPES'"
 * @generated
 */
public interface EADatatypePrototype extends EAElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(EADatatype)
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getEADatatypePrototype_Type()
	 * @model required="true"
	 *        annotation="MetaData guid='{579BDBF6-CE24-473d-B7EB-FD6C6D8C5787}' id='117' EA\040name=''"
	 *        annotation="Stereotype Stereotype='isOfType'"
	 *        extendedMetaData="name='TYPE-TREF' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='TYPE-TREFS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	EADatatype getType();

	/**
	 * Sets the value of the '{@link org.eclipse.eatop.eastadl21.EADatatypePrototype#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EADatatype value);

} // EADatatypePrototype
