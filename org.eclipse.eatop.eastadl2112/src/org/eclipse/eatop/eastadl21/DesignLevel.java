/**
 */
package org.eclipse.eatop.eastadl21;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The DesignLevel represents the vehicle electrical/electronic system on the design abstraction level. It includes primarily the Functional Design Architecture (FDA), and the HardwareDesignArchitecture (HDA).
 * 
 * FDA represents a top level Function. It is supposed to implement all the functionalities of a vehicle, as specified by a FAA or a Vehicle level (if no FAA has been defined during the process).
 * 
 * The design level in EAST-ADL includes the design architecture containing the functional specification and hardware architecture of the vehicle electrical/electronic system. The design architecture includes the FDA representing a decomposition of functionalities analyzed on the analysis level. The decomposition has the purpose of making it possible to meet constraints regarding non-functional properties such as allocation, efficiency, reuse, or supplier concerns. There is an n-to-m mapping between entities of the design level and the ones on the analysis level.
 * 
 * Non-transparent infrastructure functionality such as mode changes and error handling are also represented at the design level, such that their impact on applications' behaviors can be estimated.
 * 
 * The FDA parts are typed by DesignFunctionTypes and e.g. LocalDeviceManagers. The view of the HardwareArchitecture facilitates the realization of LocalDeviceManager as sensor/actuator HW elements.
 * 
 * The HDA is the hardware design from a system perspective. The HDA has two purposes:
 * 
 * 1) It shows the physical entities and how they are connected.
 * 
 * 2) It is an allocation target for the Functions of the FDA.
 * 
 * The HDA represents the hardware architecture of the embedded system. Its contained HW elements represent the physical aspects of the hardware entities and how they are connected. HardwareFunctionTypes associated to HW components represent the logical behavior of the contained HW elements. 
 * 
 * Semantics:
 * The DesignLevel is the representation of the vehicle electrical/electronic system on the design abstraction level. It corresponds to the design of logical functions and boundaries extended in regards to resource commitment.
 * 
 * Notation:
 * The DesignLevel is shown as a solid-outline rectangle containing the name, with its ports or port groups on the perimeter. Contained entities may be shown with their connectors and allocations (White-box view).
 * 
 * Extension: Class
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Structure.SystemModeling.DesignLevel</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eatop.eastadl21.DesignLevel#getAllocation <em>Allocation</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.DesignLevel#getFunctionalDesignArchitecture <em>Functional Design Architecture</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.DesignLevel#getHardwareDesignArchitecture <em>Hardware Design Architecture</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getDesignLevel()
 * @model annotation="MetaData guid='{3DA8D034-A23A-4d6a-9174-C76163018C43}' id='19' EA\040name='DesignLevel'"
 *        annotation="Stereotype Stereotype='atpStructureElement'"
 *        extendedMetaData="name='DESIGN-LEVEL' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='DESIGN-LEVELS'"
 * @generated
 */
public interface DesignLevel extends Context {
	/**
	 * Returns the value of the '<em><b>Allocation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.eatop.eastadl21.Allocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation</em>' containment reference list.
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getDesignLevel_Allocation()
	 * @model containment="true"
	 *        annotation="MetaData guid='{49F4574F-E818-4cb3-B6C9-17F03BBA953B}' id='732' EA\040name=''"
	 *        extendedMetaData="name='ALLOCATION' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='ALLOCATIONS' xmlAttribute='false' featureWrapperElement='true' featureElement='false' classifierWrapperElement='false' classifierElement='true'"
	 * @generated
	 */
	EList<Allocation> getAllocation();

	/**
	 * Returns the value of the '<em><b>Functional Design Architecture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functional Design Architecture</em>' containment reference.
	 * @see #setFunctionalDesignArchitecture(DesignFunctionPrototype)
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getDesignLevel_FunctionalDesignArchitecture()
	 * @model containment="true"
	 *        annotation="MetaData guid='{48012A9C-B5CA-49d2-9DE1-ABFA2AD87D0F}' id='733' EA\040name=''"
	 *        extendedMetaData="name='FUNCTIONAL-DESIGN-ARCHITECTURE' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='FUNCTIONAL-DESIGN-ARCHITECTURES' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	DesignFunctionPrototype getFunctionalDesignArchitecture();

	/**
	 * Sets the value of the '{@link org.eclipse.eatop.eastadl21.DesignLevel#getFunctionalDesignArchitecture <em>Functional Design Architecture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functional Design Architecture</em>' containment reference.
	 * @see #getFunctionalDesignArchitecture()
	 * @generated
	 */
	void setFunctionalDesignArchitecture(DesignFunctionPrototype value);

	/**
	 * Returns the value of the '<em><b>Hardware Design Architecture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware Design Architecture</em>' containment reference.
	 * @see #setHardwareDesignArchitecture(HardwareComponentPrototype)
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getDesignLevel_HardwareDesignArchitecture()
	 * @model containment="true"
	 *        annotation="MetaData guid='{77E96486-A5F0-42e3-B1F0-2B3A3A6305CB}' id='731' EA\040name=''"
	 *        extendedMetaData="name='HARDWARE-DESIGN-ARCHITECTURE' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='HARDWARE-DESIGN-ARCHITECTURES' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	HardwareComponentPrototype getHardwareDesignArchitecture();

	/**
	 * Sets the value of the '{@link org.eclipse.eatop.eastadl21.DesignLevel#getHardwareDesignArchitecture <em>Hardware Design Architecture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware Design Architecture</em>' containment reference.
	 * @see #getHardwareDesignArchitecture()
	 * @generated
	 */
	void setHardwareDesignArchitecture(HardwareComponentPrototype value);

} // DesignLevel
