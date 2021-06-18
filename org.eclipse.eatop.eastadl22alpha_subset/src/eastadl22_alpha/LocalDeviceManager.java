/**
 */
package eastadl22_alpha;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Device Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The LocalDeviceManager represents a DesignFunction that act as a manager or functional interface to Sensors, Actuators and other devices. It is responsible for translating between the electrical/logical interface of the device, as provided by a BasicSoftwareFunction, and the physical interface of the device. For example, consider a temperature sensor with voltage output. The HardwareFunctionType defines the transfer from temperature to voltage. A BasicSoftwareFunction relays the voltage from the microcontroller's I/O. The role of the LocalDeviceManager is now to translate from voltage to temperature value, taking into account the sensor's characteristics such as nonlinearities, calibration, etc. The resulting temperature is available to the other DesignFunctions. By separating the device specific part from the middleware and ECU specific parts, it is possible to systematically change interface function together with the device.
 * 
 * The role of the LocalDeviceManager is to act as an interface between the electrical output of Sensors or electrical input of Actuators and the physical quantity of those devices.
 * 
 * 
 * Semantics:
 * The LocalDeviceManager encapsulates the device-specific or functional parts of a Sensor or Actuator, device, etc. interface.
 * 
 * 
 * Constraints:
 * [1] A DesignFunctionPrototype typed by a LocalDeviceManager shall be allocated to the same ECU node as the device that it manages is connected to.
 * [2] A LocalDeviceManager shall be connected with BasicSoftwareFunction(s) and DesignFunction(s).
 * 
 * 
 * Extension: Class, specialization of SysML::Block
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Structure.FunctionModeling.LocalDeviceManager</b></em> 
 * <!-- end-model-doc -->
 *
 *
 * @see eastadl22_alpha.Eastadl22_alphaPackage#getLocalDeviceManager()
 * @model annotation="MetaData guid='{6AC62F42-8EC0-4052-B5FE-6A05E4DAC1B3}' id='47' EA\040name='LocalDeviceManager'"
 *        extendedMetaData="name='LOCAL-DEVICE-MANAGER' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='LOCAL-DEVICE-MANAGERS'"
 * @generated
 */
public interface LocalDeviceManager extends DesignFunctionType {
} // LocalDeviceManager
