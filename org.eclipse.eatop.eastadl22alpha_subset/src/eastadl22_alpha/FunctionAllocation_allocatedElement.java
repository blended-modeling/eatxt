/**
 */
package eastadl22_alpha;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Allocation allocated Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * null
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Structure.FunctionModeling._instanceRef.FunctionAllocation_allocatedElement</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eastadl22_alpha.FunctionAllocation_allocatedElement#getAllocateableElement_context <em>Allocateable Element context</em>}</li>
 *   <li>{@link eastadl22_alpha.FunctionAllocation_allocatedElement#getAllocateableElement <em>Allocateable Element</em>}</li>
 * </ul>
 *
 * @see eastadl22_alpha.Eastadl22_alphaPackage#getFunctionAllocation_allocatedElement()
 * @model annotation="MetaData guid='{BFC688AB-66B4-4708-840A-20D3A84DCBDB}' id='61' EA\040name='FunctionAllocation_allocatedElement'"
 *        annotation="Stereotype Stereotype='instanceRef'"
 *        annotation="TaggedValues xml.name='FUNCTION-ALLOCATION--ALLOCATED-ELEMENT-IREF'"
 *        extendedMetaData="name='FUNCTION-ALLOCATION--ALLOCATED-ELEMENT-IREF' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='FUNCTION-ALLOCATION--ALLOCATED-ELEMENT-IREFS'"
 * @generated
 */
public interface FunctionAllocation_allocatedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Allocateable Element context</b></em>' reference list.
	 * The list contents are of type {@link eastadl22_alpha.AllocateableElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocateable Element context</em>' reference list.
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getFunctionAllocation_allocatedElement_AllocateableElement_context()
	 * @model annotation="MetaData guid='{9B2636BC-F8DD-455d-A497-6A62F3945DC0}' id='687' EA\040name=''"
	 *        annotation="Stereotype Stereotype='instanceRef.context'"
	 *        annotation="TaggedValues xml.roleElement='true' xml.roleWrapperElement='false'"
	 *        extendedMetaData="name='ALLOCATEABLE-ELEMENT-CONTEXT-REF' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='ALLOCATEABLE-ELEMENT-CONTEXT-REFS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	EList<AllocateableElement> getAllocateableElement_context();

	/**
	 * Returns the value of the '<em><b>Allocateable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocateable Element</em>' reference.
	 * @see #setAllocateableElement(AllocateableElement)
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getFunctionAllocation_allocatedElement_AllocateableElement()
	 * @model required="true"
	 *        annotation="MetaData guid='{4A9493F5-E1A9-42ce-B76A-2BFFC7CB1E8C}' id='689' EA\040name=''"
	 *        annotation="Stereotype Stereotype='instanceRef.target'"
	 *        annotation="TaggedValues xml.roleElement='true' xml.roleWrapperElement='false'"
	 *        extendedMetaData="name='ALLOCATEABLE-ELEMENT-REF' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='ALLOCATEABLE-ELEMENT-REFS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	AllocateableElement getAllocateableElement();

	/**
	 * Sets the value of the '{@link eastadl22_alpha.FunctionAllocation_allocatedElement#getAllocateableElement <em>Allocateable Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocateable Element</em>' reference.
	 * @see #getAllocateableElement()
	 * @generated
	 */
	void setAllocateableElement(AllocateableElement value);

} // FunctionAllocation_allocatedElement
