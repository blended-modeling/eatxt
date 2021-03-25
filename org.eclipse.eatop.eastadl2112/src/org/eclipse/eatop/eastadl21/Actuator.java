/**
 */
package org.eclipse.eatop.eastadl21;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actuator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Actuator is the element that represents electrical actuators, such as valves, motors, lamps, brake units, etc. Non-electrical actuators such as the engine, hydraulics, etc. are considered part of the plant model (environment). Plant models are not part of the Hardware Design Architecture. 
 * 
 * Semantics:
 * The Actuator metaclass represents the physical and electrical aspects of actuator hardware. The logical aspect is represented by a HardwareFunctionType associated with the Actuator.
 * 
 * Notation:
 * Actuator is shown as a solid-outline rectangle with double vertical borders. The rectangle contains the name, and its ports or port groups on the perimeter.
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Structure.HardwareModeling.Actuator</b></em> 
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getActuator()
 * @model annotation="MetaData guid='{856A8DAD-76A2-437c-BD21-2B6A2D5480E4}' id='71' EA\040name='Actuator'"
 *        extendedMetaData="name='ACTUATOR' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='ACTUATORS'"
 * @generated
 */
public interface Actuator extends HardwareComponentType {
} // Actuator
