/**
 */
package org.eclipse.eatop.eastadl21;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Component Prototype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Appears as part of a HardwareComponentType and is itself typed by a HardwareComponentType. This allows for a reference to the occurrence of a HardwareComponentType when it acts as a part. The purpose is to support the definition of hierarchical structures, and to reuse the same type of Hardware at several places. For example, a wheel speed sensor may occur at all four wheels, but it has a single definition. 
 * 
 * Semantics:
 * The HardwareComponentPrototype represents an occurrence of a hardware element, according to the type of the HardwareComponentPrototype. 
 * 
 * Notation:
 * Shall be shown in the same style as the class specified as type, however it shall be clear that this is a part.
 * 
 * Extension: Property
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Structure.HardwareModeling.HardwareComponentPrototype</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eatop.eastadl21.HardwareComponentPrototype#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getHardwareComponentPrototype()
 * @model annotation="MetaData guid='{713C68FF-BB2B-43c2-9DF7-0123D98B37C4}' id='67' EA\040name='HardwareComponentPrototype'"
 *        annotation="Stereotype Stereotype='atpPrototype'"
 *        extendedMetaData="name='HARDWARE-COMPONENT-PROTOTYPE' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='HARDWARE-COMPONENT-PROTOTYPES'"
 * @generated
 */
public interface HardwareComponentPrototype extends AllocationTarget, EAPrototype {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(HardwareComponentType)
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getHardwareComponentPrototype_Type()
	 * @model required="true"
	 *        annotation="MetaData guid='{F5B0C598-2834-4558-AA2A-3E948177C76D}' id='566' EA\040name=''"
	 *        annotation="Stereotype Stereotype='isOfType'"
	 *        extendedMetaData="name='TYPE-TREF' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='TYPE-TREFS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	HardwareComponentType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.eatop.eastadl21.HardwareComponentPrototype#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(HardwareComponentType value);

} // HardwareComponentPrototype
