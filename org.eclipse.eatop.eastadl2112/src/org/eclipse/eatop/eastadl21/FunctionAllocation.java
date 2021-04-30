/**
 */
package org.eclipse.eatop.eastadl21;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * FunctionAllocation represents an allocation constraint binding an AllocateableElement (computation functions or communication connectors) on an AllocationTarget (computation or communication resource).
 * 
 * Semantics:
 * FunctionAllocation specifies that the identified AllocationTarget is a host for the identified AllocateableElement.
 * 
 * Constraints:
 * AllocatableElements allocated to PortConnectors must be FunctionConnectors.
 * AllocatableElements allocated to HardwarePorts or HardwarePins must be FunctionPorts.
 * AllocatableElements allocated to HardwareComponentPrototypes must be DesignFunctionPrototypes.
 * 
 * Notation:
 * A FunctionAllocation is shown as a dependency (dashed line) with an "allocation" keyword attached to it.
 * 
 * Extension: Class, specializesDesignConstraint
 * target to AUTOSAR::ECUResourceTemplate::ECU
 * allocatedAutosarComponent to AUTOSAR::Components::ClientPort
 * 
 * ToDo:
 * Cf. AUTOSAR SWMapping::MappingConstraint
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Structure.FunctionModeling.FunctionAllocation</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eatop.eastadl21.FunctionAllocation#getAllocatedElement <em>Allocated Element</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.FunctionAllocation#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getFunctionAllocation()
 * @model annotation="MetaData guid='{2D44D38D-1029-4bee-8AB6-2B09AC2A69CD}' id='37' EA\040name='FunctionAllocation'"
 *        extendedMetaData="name='FUNCTION-ALLOCATION' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='FUNCTION-ALLOCATIONS'"
 * @generated
 */
public interface FunctionAllocation extends EAElement {
	/**
	 * Returns the value of the '<em><b>Allocated Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated Element</em>' containment reference.
	 * @see #setAllocatedElement(FunctionAllocation_allocatedElement)
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getFunctionAllocation_AllocatedElement()
	 * @model containment="true" required="true"
	 *        annotation="MetaData guid='{82757B7A-A1A9-4df3-92B2-929CF4A5EB2C}' id='683' EA\040name=''"
	 *        annotation="TaggedValues xml.name='ALLOCATED-ELEMENT-IREF' xml.namePlural='ALLOCATED-ELEMENT-IREFS' xml.roleElement='true' xml.typeElement='false' xml.typeWrapperElement='false'"
	 *        extendedMetaData="name='ALLOCATED-ELEMENT-IREF' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='ALLOCATED-ELEMENT-IREFS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	FunctionAllocation_allocatedElement getAllocatedElement();

	/**
	 * Sets the value of the '{@link org.eclipse.eatop.eastadl21.FunctionAllocation#getAllocatedElement <em>Allocated Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocated Element</em>' containment reference.
	 * @see #getAllocatedElement()
	 * @generated
	 */
	void setAllocatedElement(FunctionAllocation_allocatedElement value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(FunctionAllocation_target)
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getFunctionAllocation_Target()
	 * @model containment="true" required="true"
	 *        annotation="MetaData guid='{2E6C2DAB-FF14-42e6-A241-487CCC9B6BD4}' id='686' EA\040name=''"
	 *        annotation="TaggedValues xml.name='TARGET-IREF' xml.namePlural='TARGET-IREFS' xml.roleElement='true' xml.typeElement='false' xml.typeWrapperElement='false'"
	 *        extendedMetaData="name='TARGET-IREF' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='TARGET-IREFS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	FunctionAllocation_target getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.eatop.eastadl21.FunctionAllocation#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(FunctionAllocation_target value);

} // FunctionAllocation
