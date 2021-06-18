/**
 */
package eastadl22_alpha;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The FunctionalDevice represents an abstract sensor or actuator that encapsulates sensor/actuator dynamics and the interfacing software. The FunctionalDevice is the interface between the electronic architecture and the environment (connected by ClampConnectors, see the Environment chapter). As such, it is a transfer function between the AnalysisFunction and the physical entity that it measures or actuates.
 * 
 * A Realization dependency can be used for traceability from LocalDeviceManagers in the DesignLevel and Sensors/Actuators in the hardware design architecture that are represented by the FunctionalDevice.
 * 
 * Semantics:
 * The behavior associated with the FunctionalDevice is the transfer function between the environment model representing the environment and an AnalysisFunction. The transfer function represents the sensor or actuator and its interfacing hardware and software (connectors, electronics, in/out interface, driver software, and application software).
 * 
 * Constraints:
 * No additional constraints.
 * 
 * Extension: Class, specialization of SysML::Block
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Structure.FunctionModeling.FunctionalDevice</b></em> 
 * <!-- end-model-doc -->
 *
 *
 * @see eastadl22_alpha.Eastadl22_alphaPackage#getFunctionalDevice()
 * @model annotation="MetaData guid='{4B657BEF-838B-49b9-8B46-1CE35CEFE970}' id='43' EA\040name='FunctionalDevice'"
 *        extendedMetaData="name='FUNCTIONAL-DEVICE' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='FUNCTIONAL-DEVICES'"
 * @generated
 */
public interface FunctionalDevice extends AnalysisFunctionType {
} // FunctionalDevice
