/**
 */
package org.eclipse.eatop.eastadl21;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Allocation target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * null
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Structure.FunctionModeling._instanceRef.FunctionAllocation_target</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eatop.eastadl21.FunctionAllocation_target#getAllocationTarget_context <em>Allocation Target context</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.FunctionAllocation_target#getAllocationTarget <em>Allocation Target</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getFunctionAllocation_target()
 * @model annotation="MetaData guid='{2DC82CBD-1A5F-407b-8B54-C39D0AF43453}' id='59' EA\040name='FunctionAllocation_target'"
 *        annotation="Stereotype Stereotype='instanceRef'"
 *        annotation="TaggedValues xml.name='FUNCTION-ALLOCATION--TARGET-IREF'"
 *        extendedMetaData="name='FUNCTION-ALLOCATION--TARGET-IREF' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='FUNCTION-ALLOCATION--TARGET-IREFS'"
 * @generated
 */
public interface FunctionAllocation_target extends EObject {
	/**
	 * Returns the value of the '<em><b>Allocation Target context</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.eatop.eastadl21.AllocationTarget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation Target context</em>' reference list.
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getFunctionAllocation_target_AllocationTarget_context()
	 * @model annotation="MetaData guid='{9061FF72-F509-4726-B458-331C96C4E175}' id='595' EA\040name=''"
	 *        annotation="Stereotype Stereotype='instanceRef.context'"
	 *        annotation="TaggedValues xml.roleElement='true' xml.roleWrapperElement='false'"
	 *        extendedMetaData="name='ALLOCATION-TARGET-CONTEXT-REF' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='ALLOCATION-TARGET-CONTEXT-REFS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	EList<AllocationTarget> getAllocationTarget_context();

	/**
	 * Returns the value of the '<em><b>Allocation Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation Target</em>' reference.
	 * @see #setAllocationTarget(AllocationTarget)
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getFunctionAllocation_target_AllocationTarget()
	 * @model required="true"
	 *        annotation="MetaData guid='{383F0976-221A-4358-9515-8EE808F7C07F}' id='596' EA\040name=''"
	 *        annotation="Stereotype Stereotype='instanceRef.target'"
	 *        annotation="TaggedValues xml.roleElement='true' xml.roleWrapperElement='false'"
	 *        extendedMetaData="name='ALLOCATION-TARGET-REF' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='ALLOCATION-TARGET-REFS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	AllocationTarget getAllocationTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.eatop.eastadl21.FunctionAllocation_target#getAllocationTarget <em>Allocation Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocation Target</em>' reference.
	 * @see #getAllocationTarget()
	 * @generated
	 */
	void setAllocationTarget(AllocationTarget value);

} // FunctionAllocation_target
