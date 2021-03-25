/**
 */
package org.eclipse.eatop.eastadl21.util;

import java.util.List;

import org.eclipse.eatop.eastadl21.*;

import org.eclipse.eatop.geastadl.ginfrastructure.gelements.GEAPackage;
import org.eclipse.eatop.geastadl.ginfrastructure.gelements.GEAPackageableElement;
import org.eclipse.eatop.geastadl.ginfrastructure.gelements.GEAXML;
import org.eclipse.eatop.geastadl.ginfrastructure.gelements.GIdentifiable;
import org.eclipse.eatop.geastadl.ginfrastructure.gelements.GReferrable;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.eatop.eastadl21.Eastadl21Package
 * @generated
 */
public class Eastadl21Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Eastadl21Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Eastadl21Switch() {
		if (modelPackage == null) {
			modelPackage = Eastadl21Package.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Eastadl21Package.ALLOCATEABLE_ELEMENT: {
				AllocateableElement allocateableElement = (AllocateableElement)theEObject;
				T result = caseAllocateableElement(allocateableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.ALLOCATION: {
				Allocation allocation = (Allocation)theEObject;
				T result = caseAllocation(allocation);
				if (result == null) result = caseEAPackageableElement(allocation);
				if (result == null) result = caseEAElement(allocation);
				if (result == null) result = caseGEAPackageableElement(allocation);
				if (result == null) result = caseIdentifiable(allocation);
				if (result == null) result = caseReferrable(allocation);
				if (result == null) result = caseGIdentifiable(allocation);
				if (result == null) result = caseGReferrable(allocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.BASIC_SOFTWARE_FUNCTION_TYPE: {
				BasicSoftwareFunctionType basicSoftwareFunctionType = (BasicSoftwareFunctionType)theEObject;
				T result = caseBasicSoftwareFunctionType(basicSoftwareFunctionType);
				if (result == null) result = caseDesignFunctionType(basicSoftwareFunctionType);
				if (result == null) result = caseFunctionType(basicSoftwareFunctionType);
				if (result == null) result = caseContext(basicSoftwareFunctionType);
				if (result == null) result = caseEAType(basicSoftwareFunctionType);
				if (result == null) result = caseEAPackageableElement(basicSoftwareFunctionType);
				if (result == null) result = caseEAElement(basicSoftwareFunctionType);
				if (result == null) result = caseGEAPackageableElement(basicSoftwareFunctionType);
				if (result == null) result = caseIdentifiable(basicSoftwareFunctionType);
				if (result == null) result = caseReferrable(basicSoftwareFunctionType);
				if (result == null) result = caseGIdentifiable(basicSoftwareFunctionType);
				if (result == null) result = caseGReferrable(basicSoftwareFunctionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.DESIGN_FUNCTION_PROTOTYPE: {
				DesignFunctionPrototype designFunctionPrototype = (DesignFunctionPrototype)theEObject;
				T result = caseDesignFunctionPrototype(designFunctionPrototype);
				if (result == null) result = caseFunctionPrototype(designFunctionPrototype);
				if (result == null) result = caseAllocateableElement(designFunctionPrototype);
				if (result == null) result = caseEAPrototype(designFunctionPrototype);
				if (result == null) result = caseEAElement(designFunctionPrototype);
				if (result == null) result = caseIdentifiable(designFunctionPrototype);
				if (result == null) result = caseReferrable(designFunctionPrototype);
				if (result == null) result = caseGIdentifiable(designFunctionPrototype);
				if (result == null) result = caseGReferrable(designFunctionPrototype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.DESIGN_FUNCTION_TYPE: {
				DesignFunctionType designFunctionType = (DesignFunctionType)theEObject;
				T result = caseDesignFunctionType(designFunctionType);
				if (result == null) result = caseFunctionType(designFunctionType);
				if (result == null) result = caseContext(designFunctionType);
				if (result == null) result = caseEAType(designFunctionType);
				if (result == null) result = caseEAPackageableElement(designFunctionType);
				if (result == null) result = caseEAElement(designFunctionType);
				if (result == null) result = caseGEAPackageableElement(designFunctionType);
				if (result == null) result = caseIdentifiable(designFunctionType);
				if (result == null) result = caseReferrable(designFunctionType);
				if (result == null) result = caseGIdentifiable(designFunctionType);
				if (result == null) result = caseGReferrable(designFunctionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.FUNCTION_ALLOCATION: {
				FunctionAllocation functionAllocation = (FunctionAllocation)theEObject;
				T result = caseFunctionAllocation(functionAllocation);
				if (result == null) result = caseEAElement(functionAllocation);
				if (result == null) result = caseIdentifiable(functionAllocation);
				if (result == null) result = caseReferrable(functionAllocation);
				if (result == null) result = caseGIdentifiable(functionAllocation);
				if (result == null) result = caseGReferrable(functionAllocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.FUNCTION_CLIENT_SERVER_INTERFACE: {
				FunctionClientServerInterface functionClientServerInterface = (FunctionClientServerInterface)theEObject;
				T result = caseFunctionClientServerInterface(functionClientServerInterface);
				if (result == null) result = caseTraceableSpecification(functionClientServerInterface);
				if (result == null) result = caseEAPackageableElement(functionClientServerInterface);
				if (result == null) result = caseEAElement(functionClientServerInterface);
				if (result == null) result = caseGEAPackageableElement(functionClientServerInterface);
				if (result == null) result = caseIdentifiable(functionClientServerInterface);
				if (result == null) result = caseReferrable(functionClientServerInterface);
				if (result == null) result = caseGIdentifiable(functionClientServerInterface);
				if (result == null) result = caseGReferrable(functionClientServerInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.FUNCTION_CLIENT_SERVER_PORT: {
				FunctionClientServerPort functionClientServerPort = (FunctionClientServerPort)theEObject;
				T result = caseFunctionClientServerPort(functionClientServerPort);
				if (result == null) result = caseFunctionPort(functionClientServerPort);
				if (result == null) result = caseEAElement(functionClientServerPort);
				if (result == null) result = caseEAPort(functionClientServerPort);
				if (result == null) result = caseAllocateableElement(functionClientServerPort);
				if (result == null) result = caseIdentifiable(functionClientServerPort);
				if (result == null) result = caseReferrable(functionClientServerPort);
				if (result == null) result = caseGIdentifiable(functionClientServerPort);
				if (result == null) result = caseGReferrable(functionClientServerPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.FUNCTION_CONNECTOR: {
				FunctionConnector functionConnector = (FunctionConnector)theEObject;
				T result = caseFunctionConnector(functionConnector);
				if (result == null) result = caseEAElement(functionConnector);
				if (result == null) result = caseEAConnector(functionConnector);
				if (result == null) result = caseAllocateableElement(functionConnector);
				if (result == null) result = caseIdentifiable(functionConnector);
				if (result == null) result = caseReferrable(functionConnector);
				if (result == null) result = caseGIdentifiable(functionConnector);
				if (result == null) result = caseGReferrable(functionConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.FUNCTION_FLOW_PORT: {
				FunctionFlowPort functionFlowPort = (FunctionFlowPort)theEObject;
				T result = caseFunctionFlowPort(functionFlowPort);
				if (result == null) result = caseFunctionPort(functionFlowPort);
				if (result == null) result = caseEAElement(functionFlowPort);
				if (result == null) result = caseEAPort(functionFlowPort);
				if (result == null) result = caseAllocateableElement(functionFlowPort);
				if (result == null) result = caseIdentifiable(functionFlowPort);
				if (result == null) result = caseReferrable(functionFlowPort);
				if (result == null) result = caseGIdentifiable(functionFlowPort);
				if (result == null) result = caseGReferrable(functionFlowPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.FUNCTION_PORT: {
				FunctionPort functionPort = (FunctionPort)theEObject;
				T result = caseFunctionPort(functionPort);
				if (result == null) result = caseEAElement(functionPort);
				if (result == null) result = caseEAPort(functionPort);
				if (result == null) result = caseAllocateableElement(functionPort);
				if (result == null) result = caseIdentifiable(functionPort);
				if (result == null) result = caseReferrable(functionPort);
				if (result == null) result = caseGIdentifiable(functionPort);
				if (result == null) result = caseGReferrable(functionPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.FUNCTION_POWER_PORT: {
				FunctionPowerPort functionPowerPort = (FunctionPowerPort)theEObject;
				T result = caseFunctionPowerPort(functionPowerPort);
				if (result == null) result = caseFunctionPort(functionPowerPort);
				if (result == null) result = caseEAElement(functionPowerPort);
				if (result == null) result = caseEAPort(functionPowerPort);
				if (result == null) result = caseAllocateableElement(functionPowerPort);
				if (result == null) result = caseIdentifiable(functionPowerPort);
				if (result == null) result = caseReferrable(functionPowerPort);
				if (result == null) result = caseGIdentifiable(functionPowerPort);
				if (result == null) result = caseGReferrable(functionPowerPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.FUNCTION_PROTOTYPE: {
				FunctionPrototype functionPrototype = (FunctionPrototype)theEObject;
				T result = caseFunctionPrototype(functionPrototype);
				if (result == null) result = caseEAPrototype(functionPrototype);
				if (result == null) result = caseEAElement(functionPrototype);
				if (result == null) result = caseIdentifiable(functionPrototype);
				if (result == null) result = caseReferrable(functionPrototype);
				if (result == null) result = caseGIdentifiable(functionPrototype);
				if (result == null) result = caseGReferrable(functionPrototype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.FUNCTION_TYPE: {
				FunctionType functionType = (FunctionType)theEObject;
				T result = caseFunctionType(functionType);
				if (result == null) result = caseContext(functionType);
				if (result == null) result = caseEAType(functionType);
				if (result == null) result = caseEAPackageableElement(functionType);
				if (result == null) result = caseEAElement(functionType);
				if (result == null) result = caseGEAPackageableElement(functionType);
				if (result == null) result = caseIdentifiable(functionType);
				if (result == null) result = caseReferrable(functionType);
				if (result == null) result = caseGIdentifiable(functionType);
				if (result == null) result = caseGReferrable(functionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.HARDWARE_FUNCTION_TYPE: {
				HardwareFunctionType hardwareFunctionType = (HardwareFunctionType)theEObject;
				T result = caseHardwareFunctionType(hardwareFunctionType);
				if (result == null) result = caseDesignFunctionType(hardwareFunctionType);
				if (result == null) result = caseFunctionType(hardwareFunctionType);
				if (result == null) result = caseContext(hardwareFunctionType);
				if (result == null) result = caseEAType(hardwareFunctionType);
				if (result == null) result = caseEAPackageableElement(hardwareFunctionType);
				if (result == null) result = caseEAElement(hardwareFunctionType);
				if (result == null) result = caseGEAPackageableElement(hardwareFunctionType);
				if (result == null) result = caseIdentifiable(hardwareFunctionType);
				if (result == null) result = caseReferrable(hardwareFunctionType);
				if (result == null) result = caseGIdentifiable(hardwareFunctionType);
				if (result == null) result = caseGReferrable(hardwareFunctionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.LOCAL_DEVICE_MANAGER: {
				LocalDeviceManager localDeviceManager = (LocalDeviceManager)theEObject;
				T result = caseLocalDeviceManager(localDeviceManager);
				if (result == null) result = caseDesignFunctionType(localDeviceManager);
				if (result == null) result = caseFunctionType(localDeviceManager);
				if (result == null) result = caseContext(localDeviceManager);
				if (result == null) result = caseEAType(localDeviceManager);
				if (result == null) result = caseEAPackageableElement(localDeviceManager);
				if (result == null) result = caseEAElement(localDeviceManager);
				if (result == null) result = caseGEAPackageableElement(localDeviceManager);
				if (result == null) result = caseIdentifiable(localDeviceManager);
				if (result == null) result = caseReferrable(localDeviceManager);
				if (result == null) result = caseGIdentifiable(localDeviceManager);
				if (result == null) result = caseGReferrable(localDeviceManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.OPERATION: {
				Operation operation = (Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = caseEAElement(operation);
				if (result == null) result = caseIdentifiable(operation);
				if (result == null) result = caseReferrable(operation);
				if (result == null) result = caseGIdentifiable(operation);
				if (result == null) result = caseGReferrable(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.PORT_GROUP: {
				PortGroup portGroup = (PortGroup)theEObject;
				T result = casePortGroup(portGroup);
				if (result == null) result = caseEAElement(portGroup);
				if (result == null) result = caseIdentifiable(portGroup);
				if (result == null) result = caseReferrable(portGroup);
				if (result == null) result = caseGIdentifiable(portGroup);
				if (result == null) result = caseGReferrable(portGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.FUNCTION_ALLOCATION_ALLOCATED_ELEMENT: {
				FunctionAllocation_allocatedElement functionAllocation_allocatedElement = (FunctionAllocation_allocatedElement)theEObject;
				T result = caseFunctionAllocation_allocatedElement(functionAllocation_allocatedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.FUNCTION_ALLOCATION_TARGET: {
				FunctionAllocation_target functionAllocation_target = (FunctionAllocation_target)theEObject;
				T result = caseFunctionAllocation_target(functionAllocation_target);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.FUNCTION_CONNECTOR_PORT: {
				FunctionConnector_port functionConnector_port = (FunctionConnector_port)theEObject;
				T result = caseFunctionConnector_port(functionConnector_port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.ACTUATOR: {
				Actuator actuator = (Actuator)theEObject;
				T result = caseActuator(actuator);
				if (result == null) result = caseHardwareComponentType(actuator);
				if (result == null) result = caseContext(actuator);
				if (result == null) result = caseEAType(actuator);
				if (result == null) result = caseEAPackageableElement(actuator);
				if (result == null) result = caseEAElement(actuator);
				if (result == null) result = caseGEAPackageableElement(actuator);
				if (result == null) result = caseIdentifiable(actuator);
				if (result == null) result = caseReferrable(actuator);
				if (result == null) result = caseGIdentifiable(actuator);
				if (result == null) result = caseGReferrable(actuator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.COMMUNICATION_HARDWARE_PIN: {
				CommunicationHardwarePin communicationHardwarePin = (CommunicationHardwarePin)theEObject;
				T result = caseCommunicationHardwarePin(communicationHardwarePin);
				if (result == null) result = caseHardwarePin(communicationHardwarePin);
				if (result == null) result = caseEAPort(communicationHardwarePin);
				if (result == null) result = caseAllocationTarget(communicationHardwarePin);
				if (result == null) result = caseEAElement(communicationHardwarePin);
				if (result == null) result = caseIdentifiable(communicationHardwarePin);
				if (result == null) result = caseReferrable(communicationHardwarePin);
				if (result == null) result = caseGIdentifiable(communicationHardwarePin);
				if (result == null) result = caseGReferrable(communicationHardwarePin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.ELECTRICAL_COMPONENT: {
				ElectricalComponent electricalComponent = (ElectricalComponent)theEObject;
				T result = caseElectricalComponent(electricalComponent);
				if (result == null) result = caseHardwareComponentType(electricalComponent);
				if (result == null) result = caseContext(electricalComponent);
				if (result == null) result = caseEAType(electricalComponent);
				if (result == null) result = caseEAPackageableElement(electricalComponent);
				if (result == null) result = caseEAElement(electricalComponent);
				if (result == null) result = caseGEAPackageableElement(electricalComponent);
				if (result == null) result = caseIdentifiable(electricalComponent);
				if (result == null) result = caseReferrable(electricalComponent);
				if (result == null) result = caseGIdentifiable(electricalComponent);
				if (result == null) result = caseGReferrable(electricalComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.HARDWARE_COMPONENT_PROTOTYPE: {
				HardwareComponentPrototype hardwareComponentPrototype = (HardwareComponentPrototype)theEObject;
				T result = caseHardwareComponentPrototype(hardwareComponentPrototype);
				if (result == null) result = caseAllocationTarget(hardwareComponentPrototype);
				if (result == null) result = caseEAPrototype(hardwareComponentPrototype);
				if (result == null) result = caseEAElement(hardwareComponentPrototype);
				if (result == null) result = caseIdentifiable(hardwareComponentPrototype);
				if (result == null) result = caseReferrable(hardwareComponentPrototype);
				if (result == null) result = caseGIdentifiable(hardwareComponentPrototype);
				if (result == null) result = caseGReferrable(hardwareComponentPrototype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.HARDWARE_COMPONENT_TYPE: {
				HardwareComponentType hardwareComponentType = (HardwareComponentType)theEObject;
				T result = caseHardwareComponentType(hardwareComponentType);
				if (result == null) result = caseContext(hardwareComponentType);
				if (result == null) result = caseEAType(hardwareComponentType);
				if (result == null) result = caseEAPackageableElement(hardwareComponentType);
				if (result == null) result = caseEAElement(hardwareComponentType);
				if (result == null) result = caseGEAPackageableElement(hardwareComponentType);
				if (result == null) result = caseIdentifiable(hardwareComponentType);
				if (result == null) result = caseReferrable(hardwareComponentType);
				if (result == null) result = caseGIdentifiable(hardwareComponentType);
				if (result == null) result = caseGReferrable(hardwareComponentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.HARDWARE_CONNECTOR: {
				HardwareConnector hardwareConnector = (HardwareConnector)theEObject;
				T result = caseHardwareConnector(hardwareConnector);
				if (result == null) result = caseEAElement(hardwareConnector);
				if (result == null) result = caseEAConnector(hardwareConnector);
				if (result == null) result = caseIdentifiable(hardwareConnector);
				if (result == null) result = caseReferrable(hardwareConnector);
				if (result == null) result = caseGIdentifiable(hardwareConnector);
				if (result == null) result = caseGReferrable(hardwareConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.HARDWARE_PIN: {
				HardwarePin hardwarePin = (HardwarePin)theEObject;
				T result = caseHardwarePin(hardwarePin);
				if (result == null) result = caseEAPort(hardwarePin);
				if (result == null) result = caseAllocationTarget(hardwarePin);
				if (result == null) result = caseEAElement(hardwarePin);
				if (result == null) result = caseIdentifiable(hardwarePin);
				if (result == null) result = caseReferrable(hardwarePin);
				if (result == null) result = caseGIdentifiable(hardwarePin);
				if (result == null) result = caseGReferrable(hardwarePin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.HARDWARE_PORT: {
				HardwarePort hardwarePort = (HardwarePort)theEObject;
				T result = caseHardwarePort(hardwarePort);
				if (result == null) result = caseEAPort(hardwarePort);
				if (result == null) result = caseAllocationTarget(hardwarePort);
				if (result == null) result = caseEAElement(hardwarePort);
				if (result == null) result = caseIdentifiable(hardwarePort);
				if (result == null) result = caseReferrable(hardwarePort);
				if (result == null) result = caseGIdentifiable(hardwarePort);
				if (result == null) result = caseGReferrable(hardwarePort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.HARDWARE_PORT_CONNECTOR: {
				HardwarePortConnector hardwarePortConnector = (HardwarePortConnector)theEObject;
				T result = caseHardwarePortConnector(hardwarePortConnector);
				if (result == null) result = casePortConnector(hardwarePortConnector);
				if (result == null) result = caseEAConnector(hardwarePortConnector);
				if (result == null) result = caseAllocationTarget(hardwarePortConnector);
				if (result == null) result = caseEAElement(hardwarePortConnector);
				if (result == null) result = caseIdentifiable(hardwarePortConnector);
				if (result == null) result = caseReferrable(hardwarePortConnector);
				if (result == null) result = caseGIdentifiable(hardwarePortConnector);
				if (result == null) result = caseGReferrable(hardwarePortConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.IO_HARDWARE_PIN: {
				IOHardwarePin ioHardwarePin = (IOHardwarePin)theEObject;
				T result = caseIOHardwarePin(ioHardwarePin);
				if (result == null) result = caseHardwarePin(ioHardwarePin);
				if (result == null) result = caseEAPort(ioHardwarePin);
				if (result == null) result = caseAllocationTarget(ioHardwarePin);
				if (result == null) result = caseEAElement(ioHardwarePin);
				if (result == null) result = caseIdentifiable(ioHardwarePin);
				if (result == null) result = caseReferrable(ioHardwarePin);
				if (result == null) result = caseGIdentifiable(ioHardwarePin);
				if (result == null) result = caseGReferrable(ioHardwarePin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.LOGICAL_PORT_CONNECTOR: {
				LogicalPortConnector logicalPortConnector = (LogicalPortConnector)theEObject;
				T result = caseLogicalPortConnector(logicalPortConnector);
				if (result == null) result = casePortConnector(logicalPortConnector);
				if (result == null) result = caseEAConnector(logicalPortConnector);
				if (result == null) result = caseAllocationTarget(logicalPortConnector);
				if (result == null) result = caseEAElement(logicalPortConnector);
				if (result == null) result = caseIdentifiable(logicalPortConnector);
				if (result == null) result = caseReferrable(logicalPortConnector);
				if (result == null) result = caseGIdentifiable(logicalPortConnector);
				if (result == null) result = caseGReferrable(logicalPortConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = caseHardwareComponentType(node);
				if (result == null) result = caseContext(node);
				if (result == null) result = caseEAType(node);
				if (result == null) result = caseEAPackageableElement(node);
				if (result == null) result = caseEAElement(node);
				if (result == null) result = caseGEAPackageableElement(node);
				if (result == null) result = caseIdentifiable(node);
				if (result == null) result = caseReferrable(node);
				if (result == null) result = caseGIdentifiable(node);
				if (result == null) result = caseGReferrable(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.PORT_CONNECTOR: {
				PortConnector portConnector = (PortConnector)theEObject;
				T result = casePortConnector(portConnector);
				if (result == null) result = caseEAConnector(portConnector);
				if (result == null) result = caseAllocationTarget(portConnector);
				if (result == null) result = caseEAElement(portConnector);
				if (result == null) result = caseIdentifiable(portConnector);
				if (result == null) result = caseReferrable(portConnector);
				if (result == null) result = caseGIdentifiable(portConnector);
				if (result == null) result = caseGReferrable(portConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.POWER_HARDWARE_PIN: {
				PowerHardwarePin powerHardwarePin = (PowerHardwarePin)theEObject;
				T result = casePowerHardwarePin(powerHardwarePin);
				if (result == null) result = caseHardwarePin(powerHardwarePin);
				if (result == null) result = caseEAPort(powerHardwarePin);
				if (result == null) result = caseAllocationTarget(powerHardwarePin);
				if (result == null) result = caseEAElement(powerHardwarePin);
				if (result == null) result = caseIdentifiable(powerHardwarePin);
				if (result == null) result = caseReferrable(powerHardwarePin);
				if (result == null) result = caseGIdentifiable(powerHardwarePin);
				if (result == null) result = caseGReferrable(powerHardwarePin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.SENSOR: {
				Sensor sensor = (Sensor)theEObject;
				T result = caseSensor(sensor);
				if (result == null) result = caseHardwareComponentType(sensor);
				if (result == null) result = caseContext(sensor);
				if (result == null) result = caseEAType(sensor);
				if (result == null) result = caseEAPackageableElement(sensor);
				if (result == null) result = caseEAElement(sensor);
				if (result == null) result = caseGEAPackageableElement(sensor);
				if (result == null) result = caseIdentifiable(sensor);
				if (result == null) result = caseReferrable(sensor);
				if (result == null) result = caseGIdentifiable(sensor);
				if (result == null) result = caseGReferrable(sensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.ALLOCATION_TARGET: {
				AllocationTarget allocationTarget = (AllocationTarget)theEObject;
				T result = caseAllocationTarget(allocationTarget);
				if (result == null) result = caseEAElement(allocationTarget);
				if (result == null) result = caseIdentifiable(allocationTarget);
				if (result == null) result = caseReferrable(allocationTarget);
				if (result == null) result = caseGIdentifiable(allocationTarget);
				if (result == null) result = caseGReferrable(allocationTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.HARDWARE_CONNECTOR_PORT: {
				HardwareConnector_port hardwareConnector_port = (HardwareConnector_port)theEObject;
				T result = caseHardwareConnector_port(hardwareConnector_port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.HARDWARE_PORT_CONNECTOR_PORT: {
				HardwarePortConnector_port hardwarePortConnector_port = (HardwarePortConnector_port)theEObject;
				T result = caseHardwarePortConnector_port(hardwarePortConnector_port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.COMMENT: {
				Comment comment = (Comment)theEObject;
				T result = caseComment(comment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.CONTEXT: {
				Context context = (Context)theEObject;
				T result = caseContext(context);
				if (result == null) result = caseEAPackageableElement(context);
				if (result == null) result = caseEAElement(context);
				if (result == null) result = caseGEAPackageableElement(context);
				if (result == null) result = caseIdentifiable(context);
				if (result == null) result = caseReferrable(context);
				if (result == null) result = caseGIdentifiable(context);
				if (result == null) result = caseGReferrable(context);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.EA_CONNECTOR: {
				EAConnector eaConnector = (EAConnector)theEObject;
				T result = caseEAConnector(eaConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.EA_ELEMENT: {
				EAElement eaElement = (EAElement)theEObject;
				T result = caseEAElement(eaElement);
				if (result == null) result = caseIdentifiable(eaElement);
				if (result == null) result = caseReferrable(eaElement);
				if (result == null) result = caseGIdentifiable(eaElement);
				if (result == null) result = caseGReferrable(eaElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.EA_PACKAGE: {
				EAPackage eaPackage = (EAPackage)theEObject;
				T result = caseEAPackage(eaPackage);
				if (result == null) result = caseEAElement(eaPackage);
				if (result == null) result = caseGEAPackage(eaPackage);
				if (result == null) result = caseIdentifiable(eaPackage);
				if (result == null) result = caseReferrable(eaPackage);
				if (result == null) result = caseGIdentifiable(eaPackage);
				if (result == null) result = caseGReferrable(eaPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.EA_PACKAGEABLE_ELEMENT: {
				EAPackageableElement eaPackageableElement = (EAPackageableElement)theEObject;
				T result = caseEAPackageableElement(eaPackageableElement);
				if (result == null) result = caseEAElement(eaPackageableElement);
				if (result == null) result = caseGEAPackageableElement(eaPackageableElement);
				if (result == null) result = caseIdentifiable(eaPackageableElement);
				if (result == null) result = caseReferrable(eaPackageableElement);
				if (result == null) result = caseGIdentifiable(eaPackageableElement);
				if (result == null) result = caseGReferrable(eaPackageableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.EA_PORT: {
				EAPort eaPort = (EAPort)theEObject;
				T result = caseEAPort(eaPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.EA_PROTOTYPE: {
				EAPrototype eaPrototype = (EAPrototype)theEObject;
				T result = caseEAPrototype(eaPrototype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.EA_TYPE: {
				EAType eaType = (EAType)theEObject;
				T result = caseEAType(eaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.EAXML: {
				EAXML eaxml = (EAXML)theEObject;
				T result = caseEAXML(eaxml);
				if (result == null) result = caseGEAXML(eaxml);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.RATIONALE: {
				Rationale rationale = (Rationale)theEObject;
				T result = caseRationale(rationale);
				if (result == null) result = caseComment(rationale);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.REALIZATION: {
				Realization realization = (Realization)theEObject;
				T result = caseRealization(realization);
				if (result == null) result = caseRelationship(realization);
				if (result == null) result = caseEAElement(realization);
				if (result == null) result = caseIdentifiable(realization);
				if (result == null) result = caseReferrable(realization);
				if (result == null) result = caseGIdentifiable(realization);
				if (result == null) result = caseGReferrable(realization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.REFERRABLE: {
				Referrable referrable = (Referrable)theEObject;
				T result = caseReferrable(referrable);
				if (result == null) result = caseGReferrable(referrable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.RELATIONSHIP: {
				Relationship relationship = (Relationship)theEObject;
				T result = caseRelationship(relationship);
				if (result == null) result = caseEAElement(relationship);
				if (result == null) result = caseIdentifiable(relationship);
				if (result == null) result = caseReferrable(relationship);
				if (result == null) result = caseGIdentifiable(relationship);
				if (result == null) result = caseGReferrable(relationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.TRACEABLE_SPECIFICATION: {
				TraceableSpecification traceableSpecification = (TraceableSpecification)theEObject;
				T result = caseTraceableSpecification(traceableSpecification);
				if (result == null) result = caseEAPackageableElement(traceableSpecification);
				if (result == null) result = caseEAElement(traceableSpecification);
				if (result == null) result = caseGEAPackageableElement(traceableSpecification);
				if (result == null) result = caseIdentifiable(traceableSpecification);
				if (result == null) result = caseReferrable(traceableSpecification);
				if (result == null) result = caseGIdentifiable(traceableSpecification);
				if (result == null) result = caseGReferrable(traceableSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.IDENTIFIABLE: {
				Identifiable identifiable = (Identifiable)theEObject;
				T result = caseIdentifiable(identifiable);
				if (result == null) result = caseReferrable(identifiable);
				if (result == null) result = caseGIdentifiable(identifiable);
				if (result == null) result = caseGReferrable(identifiable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.REALIZATION_REALIZED: {
				Realization_realized realization_realized = (Realization_realized)theEObject;
				T result = caseRealization_realized(realization_realized);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.REALIZATION_REALIZED_BY: {
				Realization_realizedBy realization_realizedBy = (Realization_realizedBy)theEObject;
				T result = caseRealization_realizedBy(realization_realizedBy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.ARRAY_DATATYPE: {
				ArrayDatatype arrayDatatype = (ArrayDatatype)theEObject;
				T result = caseArrayDatatype(arrayDatatype);
				if (result == null) result = caseEADatatype(arrayDatatype);
				if (result == null) result = caseTraceableSpecification(arrayDatatype);
				if (result == null) result = caseEAPackageableElement(arrayDatatype);
				if (result == null) result = caseEAElement(arrayDatatype);
				if (result == null) result = caseGEAPackageableElement(arrayDatatype);
				if (result == null) result = caseIdentifiable(arrayDatatype);
				if (result == null) result = caseReferrable(arrayDatatype);
				if (result == null) result = caseGIdentifiable(arrayDatatype);
				if (result == null) result = caseGReferrable(arrayDatatype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.COMPOSITE_DATATYPE: {
				CompositeDatatype compositeDatatype = (CompositeDatatype)theEObject;
				T result = caseCompositeDatatype(compositeDatatype);
				if (result == null) result = caseEADatatype(compositeDatatype);
				if (result == null) result = caseTraceableSpecification(compositeDatatype);
				if (result == null) result = caseEAPackageableElement(compositeDatatype);
				if (result == null) result = caseEAElement(compositeDatatype);
				if (result == null) result = caseGEAPackageableElement(compositeDatatype);
				if (result == null) result = caseIdentifiable(compositeDatatype);
				if (result == null) result = caseReferrable(compositeDatatype);
				if (result == null) result = caseGIdentifiable(compositeDatatype);
				if (result == null) result = caseGReferrable(compositeDatatype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.EA_BOOLEAN: {
				EABoolean eaBoolean = (EABoolean)theEObject;
				T result = caseEABoolean(eaBoolean);
				if (result == null) result = caseEADatatype(eaBoolean);
				if (result == null) result = caseTraceableSpecification(eaBoolean);
				if (result == null) result = caseEAPackageableElement(eaBoolean);
				if (result == null) result = caseEAElement(eaBoolean);
				if (result == null) result = caseGEAPackageableElement(eaBoolean);
				if (result == null) result = caseIdentifiable(eaBoolean);
				if (result == null) result = caseReferrable(eaBoolean);
				if (result == null) result = caseGIdentifiable(eaBoolean);
				if (result == null) result = caseGReferrable(eaBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.EA_DATATYPE: {
				EADatatype eaDatatype = (EADatatype)theEObject;
				T result = caseEADatatype(eaDatatype);
				if (result == null) result = caseTraceableSpecification(eaDatatype);
				if (result == null) result = caseEAPackageableElement(eaDatatype);
				if (result == null) result = caseEAElement(eaDatatype);
				if (result == null) result = caseGEAPackageableElement(eaDatatype);
				if (result == null) result = caseIdentifiable(eaDatatype);
				if (result == null) result = caseReferrable(eaDatatype);
				if (result == null) result = caseGIdentifiable(eaDatatype);
				if (result == null) result = caseGReferrable(eaDatatype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.EA_DATATYPE_PROTOTYPE: {
				EADatatypePrototype eaDatatypePrototype = (EADatatypePrototype)theEObject;
				T result = caseEADatatypePrototype(eaDatatypePrototype);
				if (result == null) result = caseEAElement(eaDatatypePrototype);
				if (result == null) result = caseIdentifiable(eaDatatypePrototype);
				if (result == null) result = caseReferrable(eaDatatypePrototype);
				if (result == null) result = caseGIdentifiable(eaDatatypePrototype);
				if (result == null) result = caseGReferrable(eaDatatypePrototype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.EA_NUMERICAL: {
				EANumerical eaNumerical = (EANumerical)theEObject;
				T result = caseEANumerical(eaNumerical);
				if (result == null) result = caseEADatatype(eaNumerical);
				if (result == null) result = caseTraceableSpecification(eaNumerical);
				if (result == null) result = caseEAPackageableElement(eaNumerical);
				if (result == null) result = caseEAElement(eaNumerical);
				if (result == null) result = caseGEAPackageableElement(eaNumerical);
				if (result == null) result = caseIdentifiable(eaNumerical);
				if (result == null) result = caseReferrable(eaNumerical);
				if (result == null) result = caseGIdentifiable(eaNumerical);
				if (result == null) result = caseGReferrable(eaNumerical);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.EA_STRING: {
				EAString eaString = (EAString)theEObject;
				T result = caseEAString(eaString);
				if (result == null) result = caseEADatatype(eaString);
				if (result == null) result = caseTraceableSpecification(eaString);
				if (result == null) result = caseEAPackageableElement(eaString);
				if (result == null) result = caseEAElement(eaString);
				if (result == null) result = caseGEAPackageableElement(eaString);
				if (result == null) result = caseIdentifiable(eaString);
				if (result == null) result = caseReferrable(eaString);
				if (result == null) result = caseGIdentifiable(eaString);
				if (result == null) result = caseGReferrable(eaString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.ENUMERATION: {
				Enumeration enumeration = (Enumeration)theEObject;
				T result = caseEnumeration(enumeration);
				if (result == null) result = caseEADatatype(enumeration);
				if (result == null) result = caseTraceableSpecification(enumeration);
				if (result == null) result = caseEAPackageableElement(enumeration);
				if (result == null) result = caseEAElement(enumeration);
				if (result == null) result = caseGEAPackageableElement(enumeration);
				if (result == null) result = caseIdentifiable(enumeration);
				if (result == null) result = caseReferrable(enumeration);
				if (result == null) result = caseGIdentifiable(enumeration);
				if (result == null) result = caseGReferrable(enumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.ENUMERATION_LITERAL: {
				EnumerationLiteral enumerationLiteral = (EnumerationLiteral)theEObject;
				T result = caseEnumerationLiteral(enumerationLiteral);
				if (result == null) result = caseEAElement(enumerationLiteral);
				if (result == null) result = caseIdentifiable(enumerationLiteral);
				if (result == null) result = caseReferrable(enumerationLiteral);
				if (result == null) result = caseGIdentifiable(enumerationLiteral);
				if (result == null) result = caseGReferrable(enumerationLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.QUANTITY: {
				Quantity quantity = (Quantity)theEObject;
				T result = caseQuantity(quantity);
				if (result == null) result = caseEAPackageableElement(quantity);
				if (result == null) result = caseEAElement(quantity);
				if (result == null) result = caseGEAPackageableElement(quantity);
				if (result == null) result = caseIdentifiable(quantity);
				if (result == null) result = caseReferrable(quantity);
				if (result == null) result = caseGIdentifiable(quantity);
				if (result == null) result = caseGReferrable(quantity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.RANGEABLE_VALUE_TYPE: {
				RangeableValueType rangeableValueType = (RangeableValueType)theEObject;
				T result = caseRangeableValueType(rangeableValueType);
				if (result == null) result = caseEADatatype(rangeableValueType);
				if (result == null) result = caseTraceableSpecification(rangeableValueType);
				if (result == null) result = caseEAPackageableElement(rangeableValueType);
				if (result == null) result = caseEAElement(rangeableValueType);
				if (result == null) result = caseGEAPackageableElement(rangeableValueType);
				if (result == null) result = caseIdentifiable(rangeableValueType);
				if (result == null) result = caseReferrable(rangeableValueType);
				if (result == null) result = caseGIdentifiable(rangeableValueType);
				if (result == null) result = caseGReferrable(rangeableValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.UNIT: {
				Unit unit = (Unit)theEObject;
				T result = caseUnit(unit);
				if (result == null) result = caseEAPackageableElement(unit);
				if (result == null) result = caseEAElement(unit);
				if (result == null) result = caseGEAPackageableElement(unit);
				if (result == null) result = caseIdentifiable(unit);
				if (result == null) result = caseReferrable(unit);
				if (result == null) result = caseGIdentifiable(unit);
				if (result == null) result = caseGReferrable(unit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.EA_ARRAY_VALUE: {
				EAArrayValue eaArrayValue = (EAArrayValue)theEObject;
				T result = caseEAArrayValue(eaArrayValue);
				if (result == null) result = caseEAValue(eaArrayValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.EA_BOOLEAN_VALUE: {
				EABooleanValue eaBooleanValue = (EABooleanValue)theEObject;
				T result = caseEABooleanValue(eaBooleanValue);
				if (result == null) result = caseEAValue(eaBooleanValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.EA_COMPOSITE_VALUE: {
				EACompositeValue eaCompositeValue = (EACompositeValue)theEObject;
				T result = caseEACompositeValue(eaCompositeValue);
				if (result == null) result = caseEAValue(eaCompositeValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.EA_ENUMERATION_VALUE: {
				EAEnumerationValue eaEnumerationValue = (EAEnumerationValue)theEObject;
				T result = caseEAEnumerationValue(eaEnumerationValue);
				if (result == null) result = caseEAValue(eaEnumerationValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.EA_EXPRESSION: {
				EAExpression eaExpression = (EAExpression)theEObject;
				T result = caseEAExpression(eaExpression);
				if (result == null) result = caseEAValue(eaExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.EA_NUMERICAL_VALUE: {
				EANumericalValue eaNumericalValue = (EANumericalValue)theEObject;
				T result = caseEANumericalValue(eaNumericalValue);
				if (result == null) result = caseEAValue(eaNumericalValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.EA_STRING_VALUE: {
				EAStringValue eaStringValue = (EAStringValue)theEObject;
				T result = caseEAStringValue(eaStringValue);
				if (result == null) result = caseEAValue(eaStringValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eastadl21Package.EA_VALUE: {
				EAValue eaValue = (EAValue)theEObject;
				T result = caseEAValue(eaValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allocateable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allocateable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllocateableElement(AllocateableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllocation(Allocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Software Function Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Software Function Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicSoftwareFunctionType(BasicSoftwareFunctionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Design Function Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Design Function Prototype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesignFunctionPrototype(DesignFunctionPrototype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Design Function Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Design Function Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesignFunctionType(DesignFunctionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Allocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionAllocation(FunctionAllocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Client Server Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Client Server Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionClientServerInterface(FunctionClientServerInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Client Server Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Client Server Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionClientServerPort(FunctionClientServerPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionConnector(FunctionConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Flow Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Flow Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionFlowPort(FunctionFlowPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionPort(FunctionPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Power Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Power Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionPowerPort(FunctionPowerPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Prototype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionPrototype(FunctionPrototype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionType(FunctionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Function Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Function Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareFunctionType(HardwareFunctionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Device Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Device Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalDeviceManager(LocalDeviceManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortGroup(PortGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Allocation allocated Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Allocation allocated Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionAllocation_allocatedElement(FunctionAllocation_allocatedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Allocation target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Allocation target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionAllocation_target(FunctionAllocation_target object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Connector port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Connector port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionConnector_port(FunctionConnector_port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actuator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActuator(Actuator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Hardware Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Hardware Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationHardwarePin(CommunicationHardwarePin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Electrical Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Electrical Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElectricalComponent(ElectricalComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Component Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Component Prototype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareComponentPrototype(HardwareComponentPrototype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Component Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareComponentType(HardwareComponentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareConnector(HardwareConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwarePin(HardwarePin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwarePort(HardwarePort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Port Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Port Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwarePortConnector(HardwarePortConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IO Hardware Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IO Hardware Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIOHardwarePin(IOHardwarePin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Port Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Port Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalPortConnector(LogicalPortConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortConnector(PortConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Hardware Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Hardware Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerHardwarePin(PowerHardwarePin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensor(Sensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allocation Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allocation Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllocationTarget(AllocationTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Connector port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Connector port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareConnector_port(HardwareConnector_port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Port Connector port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Port Connector port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwarePortConnector_port(HardwarePortConnector_port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComment(Comment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContext(Context object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAConnector(EAConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAElement(EAElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAPackage(EAPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Packageable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Packageable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAPackageableElement(EAPackageableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAPort(EAPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Prototype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAPrototype(EAPrototype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAType(EAType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EAXML</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EAXML</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAXML(EAXML object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rationale</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rationale</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRationale(Rationale object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Realization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Realization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealization(Realization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferrable(Referrable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationship(Relationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traceable Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traceable Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraceableSpecification(TraceableSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiable(Identifiable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Realization realized</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Realization realized</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealization_realized(Realization_realized object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Realization realized By</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Realization realized By</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealization_realizedBy(Realization_realizedBy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Datatype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayDatatype(ArrayDatatype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Datatype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeDatatype(CompositeDatatype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEABoolean(EABoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Datatype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEADatatype(EADatatype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Datatype Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Datatype Prototype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEADatatypePrototype(EADatatypePrototype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Numerical</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Numerical</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEANumerical(EANumerical object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAString(EAString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeration(Enumeration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationLiteral(EnumerationLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantity(Quantity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rangeable Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rangeable Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeableValueType(RangeableValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnit(Unit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Array Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Array Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAArrayValue(EAArrayValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Boolean Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Boolean Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEABooleanValue(EABooleanValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Composite Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Composite Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEACompositeValue(EACompositeValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Enumeration Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Enumeration Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAEnumerationValue(EAEnumerationValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAExpression(EAExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Numerical Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Numerical Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEANumericalValue(EANumericalValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA String Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA String Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAStringValue(EAStringValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAValue(EAValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GReferrable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GReferrable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGReferrable(GReferrable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GIdentifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GIdentifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGIdentifiable(GIdentifiable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GEA Packageable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GEA Packageable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGEAPackageableElement(GEAPackageableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GEA Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GEA Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGEAPackage(GEAPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GEAXML</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GEAXML</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGEAXML(GEAXML object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //Eastadl21Switch
