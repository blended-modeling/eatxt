/**
 */
package org.eclipse.eatop.eastadl21.util;

import java.util.Map;

import org.eclipse.eatop.eastadl21.*;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.eatop.eastadl21.Eastadl21Package
 * @generated
 */
public class Eastadl21Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Eastadl21Validator INSTANCE = new Eastadl21Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.eatop.eastadl21";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Eastadl21Validator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return Eastadl21Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case Eastadl21Package.ALLOCATEABLE_ELEMENT:
				return validateAllocateableElement((AllocateableElement)value, diagnostics, context);
			case Eastadl21Package.ALLOCATION:
				return validateAllocation((Allocation)value, diagnostics, context);
			case Eastadl21Package.BASIC_SOFTWARE_FUNCTION_TYPE:
				return validateBasicSoftwareFunctionType((BasicSoftwareFunctionType)value, diagnostics, context);
			case Eastadl21Package.DESIGN_FUNCTION_PROTOTYPE:
				return validateDesignFunctionPrototype((DesignFunctionPrototype)value, diagnostics, context);
			case Eastadl21Package.DESIGN_FUNCTION_TYPE:
				return validateDesignFunctionType((DesignFunctionType)value, diagnostics, context);
			case Eastadl21Package.FUNCTION_ALLOCATION:
				return validateFunctionAllocation((FunctionAllocation)value, diagnostics, context);
			case Eastadl21Package.FUNCTION_CLIENT_SERVER_INTERFACE:
				return validateFunctionClientServerInterface((FunctionClientServerInterface)value, diagnostics, context);
			case Eastadl21Package.FUNCTION_CLIENT_SERVER_PORT:
				return validateFunctionClientServerPort((FunctionClientServerPort)value, diagnostics, context);
			case Eastadl21Package.FUNCTION_CONNECTOR:
				return validateFunctionConnector((FunctionConnector)value, diagnostics, context);
			case Eastadl21Package.FUNCTION_FLOW_PORT:
				return validateFunctionFlowPort((FunctionFlowPort)value, diagnostics, context);
			case Eastadl21Package.FUNCTION_PORT:
				return validateFunctionPort((FunctionPort)value, diagnostics, context);
			case Eastadl21Package.FUNCTION_POWER_PORT:
				return validateFunctionPowerPort((FunctionPowerPort)value, diagnostics, context);
			case Eastadl21Package.FUNCTION_PROTOTYPE:
				return validateFunctionPrototype((FunctionPrototype)value, diagnostics, context);
			case Eastadl21Package.FUNCTION_TYPE:
				return validateFunctionType((FunctionType)value, diagnostics, context);
			case Eastadl21Package.HARDWARE_FUNCTION_TYPE:
				return validateHardwareFunctionType((HardwareFunctionType)value, diagnostics, context);
			case Eastadl21Package.LOCAL_DEVICE_MANAGER:
				return validateLocalDeviceManager((LocalDeviceManager)value, diagnostics, context);
			case Eastadl21Package.OPERATION:
				return validateOperation((Operation)value, diagnostics, context);
			case Eastadl21Package.PORT_GROUP:
				return validatePortGroup((PortGroup)value, diagnostics, context);
			case Eastadl21Package.FUNCTION_ALLOCATION_ALLOCATED_ELEMENT:
				return validateFunctionAllocation_allocatedElement((FunctionAllocation_allocatedElement)value, diagnostics, context);
			case Eastadl21Package.FUNCTION_ALLOCATION_TARGET:
				return validateFunctionAllocation_target((FunctionAllocation_target)value, diagnostics, context);
			case Eastadl21Package.FUNCTION_CONNECTOR_PORT:
				return validateFunctionConnector_port((FunctionConnector_port)value, diagnostics, context);
			case Eastadl21Package.ACTUATOR:
				return validateActuator((Actuator)value, diagnostics, context);
			case Eastadl21Package.COMMUNICATION_HARDWARE_PIN:
				return validateCommunicationHardwarePin((CommunicationHardwarePin)value, diagnostics, context);
			case Eastadl21Package.ELECTRICAL_COMPONENT:
				return validateElectricalComponent((ElectricalComponent)value, diagnostics, context);
			case Eastadl21Package.HARDWARE_COMPONENT_PROTOTYPE:
				return validateHardwareComponentPrototype((HardwareComponentPrototype)value, diagnostics, context);
			case Eastadl21Package.HARDWARE_COMPONENT_TYPE:
				return validateHardwareComponentType((HardwareComponentType)value, diagnostics, context);
			case Eastadl21Package.HARDWARE_CONNECTOR:
				return validateHardwareConnector((HardwareConnector)value, diagnostics, context);
			case Eastadl21Package.HARDWARE_PIN:
				return validateHardwarePin((HardwarePin)value, diagnostics, context);
			case Eastadl21Package.HARDWARE_PORT:
				return validateHardwarePort((HardwarePort)value, diagnostics, context);
			case Eastadl21Package.HARDWARE_PORT_CONNECTOR:
				return validateHardwarePortConnector((HardwarePortConnector)value, diagnostics, context);
			case Eastadl21Package.IO_HARDWARE_PIN:
				return validateIOHardwarePin((IOHardwarePin)value, diagnostics, context);
			case Eastadl21Package.LOGICAL_PORT_CONNECTOR:
				return validateLogicalPortConnector((LogicalPortConnector)value, diagnostics, context);
			case Eastadl21Package.NODE:
				return validateNode((Node)value, diagnostics, context);
			case Eastadl21Package.PORT_CONNECTOR:
				return validatePortConnector((PortConnector)value, diagnostics, context);
			case Eastadl21Package.POWER_HARDWARE_PIN:
				return validatePowerHardwarePin((PowerHardwarePin)value, diagnostics, context);
			case Eastadl21Package.SENSOR:
				return validateSensor((Sensor)value, diagnostics, context);
			case Eastadl21Package.ALLOCATION_TARGET:
				return validateAllocationTarget((AllocationTarget)value, diagnostics, context);
			case Eastadl21Package.HARDWARE_CONNECTOR_PORT:
				return validateHardwareConnector_port((HardwareConnector_port)value, diagnostics, context);
			case Eastadl21Package.HARDWARE_PORT_CONNECTOR_PORT:
				return validateHardwarePortConnector_port((HardwarePortConnector_port)value, diagnostics, context);
			case Eastadl21Package.COMMENT:
				return validateComment((Comment)value, diagnostics, context);
			case Eastadl21Package.CONTEXT:
				return validateContext((Context)value, diagnostics, context);
			case Eastadl21Package.EA_CONNECTOR:
				return validateEAConnector((EAConnector)value, diagnostics, context);
			case Eastadl21Package.EA_ELEMENT:
				return validateEAElement((EAElement)value, diagnostics, context);
			case Eastadl21Package.EA_PACKAGE:
				return validateEAPackage((EAPackage)value, diagnostics, context);
			case Eastadl21Package.EA_PACKAGEABLE_ELEMENT:
				return validateEAPackageableElement((EAPackageableElement)value, diagnostics, context);
			case Eastadl21Package.EA_PORT:
				return validateEAPort((EAPort)value, diagnostics, context);
			case Eastadl21Package.EA_PROTOTYPE:
				return validateEAPrototype((EAPrototype)value, diagnostics, context);
			case Eastadl21Package.EA_TYPE:
				return validateEAType((EAType)value, diagnostics, context);
			case Eastadl21Package.EAXML:
				return validateEAXML((EAXML)value, diagnostics, context);
			case Eastadl21Package.RATIONALE:
				return validateRationale((Rationale)value, diagnostics, context);
			case Eastadl21Package.REALIZATION:
				return validateRealization((Realization)value, diagnostics, context);
			case Eastadl21Package.REFERRABLE:
				return validateReferrable((Referrable)value, diagnostics, context);
			case Eastadl21Package.RELATIONSHIP:
				return validateRelationship((Relationship)value, diagnostics, context);
			case Eastadl21Package.TRACEABLE_SPECIFICATION:
				return validateTraceableSpecification((TraceableSpecification)value, diagnostics, context);
			case Eastadl21Package.IDENTIFIABLE:
				return validateIdentifiable((Identifiable)value, diagnostics, context);
			case Eastadl21Package.REALIZATION_REALIZED:
				return validateRealization_realized((Realization_realized)value, diagnostics, context);
			case Eastadl21Package.REALIZATION_REALIZED_BY:
				return validateRealization_realizedBy((Realization_realizedBy)value, diagnostics, context);
			case Eastadl21Package.ARRAY_DATATYPE:
				return validateArrayDatatype((ArrayDatatype)value, diagnostics, context);
			case Eastadl21Package.COMPOSITE_DATATYPE:
				return validateCompositeDatatype((CompositeDatatype)value, diagnostics, context);
			case Eastadl21Package.EA_BOOLEAN:
				return validateEABoolean((EABoolean)value, diagnostics, context);
			case Eastadl21Package.EA_DATATYPE:
				return validateEADatatype((EADatatype)value, diagnostics, context);
			case Eastadl21Package.EA_DATATYPE_PROTOTYPE:
				return validateEADatatypePrototype((EADatatypePrototype)value, diagnostics, context);
			case Eastadl21Package.EA_NUMERICAL:
				return validateEANumerical((EANumerical)value, diagnostics, context);
			case Eastadl21Package.EA_STRING:
				return validateEAString((EAString)value, diagnostics, context);
			case Eastadl21Package.ENUMERATION:
				return validateEnumeration((Enumeration)value, diagnostics, context);
			case Eastadl21Package.ENUMERATION_LITERAL:
				return validateEnumerationLiteral((EnumerationLiteral)value, diagnostics, context);
			case Eastadl21Package.QUANTITY:
				return validateQuantity((Quantity)value, diagnostics, context);
			case Eastadl21Package.RANGEABLE_VALUE_TYPE:
				return validateRangeableValueType((RangeableValueType)value, diagnostics, context);
			case Eastadl21Package.UNIT:
				return validateUnit((Unit)value, diagnostics, context);
			case Eastadl21Package.EA_ARRAY_VALUE:
				return validateEAArrayValue((EAArrayValue)value, diagnostics, context);
			case Eastadl21Package.EA_BOOLEAN_VALUE:
				return validateEABooleanValue((EABooleanValue)value, diagnostics, context);
			case Eastadl21Package.EA_COMPOSITE_VALUE:
				return validateEACompositeValue((EACompositeValue)value, diagnostics, context);
			case Eastadl21Package.EA_ENUMERATION_VALUE:
				return validateEAEnumerationValue((EAEnumerationValue)value, diagnostics, context);
			case Eastadl21Package.EA_EXPRESSION:
				return validateEAExpression((EAExpression)value, diagnostics, context);
			case Eastadl21Package.EA_NUMERICAL_VALUE:
				return validateEANumericalValue((EANumericalValue)value, diagnostics, context);
			case Eastadl21Package.EA_STRING_VALUE:
				return validateEAStringValue((EAStringValue)value, diagnostics, context);
			case Eastadl21Package.EA_VALUE:
				return validateEAValue((EAValue)value, diagnostics, context);
			case Eastadl21Package.CLIENT_SERVER_KIND:
				return validateClientServerKind((ClientServerKind)value, diagnostics, context);
			case Eastadl21Package.EA_DIRECTION_KIND:
				return validateEADirectionKind((EADirectionKind)value, diagnostics, context);
			case Eastadl21Package.HARDWARE_BUS_KIND:
				return validateHardwareBusKind((HardwareBusKind)value, diagnostics, context);
			case Eastadl21Package.IO_HARDWARE_PIN_KIND:
				return validateIOHardwarePinKind((IOHardwarePinKind)value, diagnostics, context);
			case Eastadl21Package.BOOLEAN:
				return validateBoolean((Boolean)value, diagnostics, context);
			case Eastadl21Package.FLOAT:
				return validateFloat((Double)value, diagnostics, context);
			case Eastadl21Package.IDENTIFIER:
				return validateIdentifier((String)value, diagnostics, context);
			case Eastadl21Package.INTEGER:
				return validateInteger((Integer)value, diagnostics, context);
			case Eastadl21Package.NUMERICAL:
				return validateNumerical((String)value, diagnostics, context);
			case Eastadl21Package.REF:
				return validateRef((String)value, diagnostics, context);
			case Eastadl21Package.STRING:
				return validateString((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllocateableElement(AllocateableElement allocateableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(allocateableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllocation(Allocation allocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(allocation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicSoftwareFunctionType(BasicSoftwareFunctionType basicSoftwareFunctionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(basicSoftwareFunctionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDesignFunctionPrototype(DesignFunctionPrototype designFunctionPrototype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(designFunctionPrototype, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDesignFunctionType(DesignFunctionType designFunctionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(designFunctionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionAllocation(FunctionAllocation functionAllocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionAllocation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionClientServerInterface(FunctionClientServerInterface functionClientServerInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionClientServerInterface, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionClientServerPort(FunctionClientServerPort functionClientServerPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionClientServerPort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionConnector(FunctionConnector functionConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionConnector, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionFlowPort(FunctionFlowPort functionFlowPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionFlowPort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionPort(FunctionPort functionPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionPort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionPowerPort(FunctionPowerPort functionPowerPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionPowerPort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionPrototype(FunctionPrototype functionPrototype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionPrototype, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionType(FunctionType functionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHardwareFunctionType(HardwareFunctionType hardwareFunctionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hardwareFunctionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalDeviceManager(LocalDeviceManager localDeviceManager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(localDeviceManager, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortGroup(PortGroup portGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(portGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionAllocation_allocatedElement(FunctionAllocation_allocatedElement functionAllocation_allocatedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionAllocation_allocatedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionAllocation_target(FunctionAllocation_target functionAllocation_target, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionAllocation_target, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionConnector_port(FunctionConnector_port functionConnector_port, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionConnector_port, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActuator(Actuator actuator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actuator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationHardwarePin(CommunicationHardwarePin communicationHardwarePin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(communicationHardwarePin, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElectricalComponent(ElectricalComponent electricalComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(electricalComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHardwareComponentPrototype(HardwareComponentPrototype hardwareComponentPrototype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hardwareComponentPrototype, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHardwareComponentType(HardwareComponentType hardwareComponentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hardwareComponentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHardwareConnector(HardwareConnector hardwareConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hardwareConnector, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHardwarePin(HardwarePin hardwarePin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hardwarePin, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHardwarePort(HardwarePort hardwarePort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hardwarePort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHardwarePortConnector(HardwarePortConnector hardwarePortConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hardwarePortConnector, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIOHardwarePin(IOHardwarePin ioHardwarePin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ioHardwarePin, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogicalPortConnector(LogicalPortConnector logicalPortConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(logicalPortConnector, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(node, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortConnector(PortConnector portConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(portConnector, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePowerHardwarePin(PowerHardwarePin powerHardwarePin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(powerHardwarePin, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensor(Sensor sensor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sensor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllocationTarget(AllocationTarget allocationTarget, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(allocationTarget, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHardwareConnector_port(HardwareConnector_port hardwareConnector_port, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hardwareConnector_port, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHardwarePortConnector_port(HardwarePortConnector_port hardwarePortConnector_port, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hardwarePortConnector_port, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment(Comment comment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(comment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContext(Context context, DiagnosticChain diagnostics, Map<Object, Object> theContext) {
		return validate_EveryDefaultConstraint(context, diagnostics, theContext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEAConnector(EAConnector eaConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eaConnector, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEAElement(EAElement eaElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eaElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEAPackage(EAPackage eaPackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eaPackage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEAPackageableElement(EAPackageableElement eaPackageableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eaPackageableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEAPort(EAPort eaPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eaPort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEAPrototype(EAPrototype eaPrototype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eaPrototype, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEAType(EAType eaType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eaType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEAXML(EAXML eaxml, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eaxml, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRationale(Rationale rationale, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rationale, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRealization(Realization realization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(realization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferrable(Referrable referrable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referrable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationship(Relationship relationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relationship, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTraceableSpecification(TraceableSpecification traceableSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(traceableSpecification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifiable(Identifiable identifiable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(identifiable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRealization_realized(Realization_realized realization_realized, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(realization_realized, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRealization_realizedBy(Realization_realizedBy realization_realizedBy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(realization_realizedBy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrayDatatype(ArrayDatatype arrayDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arrayDatatype, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeDatatype(CompositeDatatype compositeDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compositeDatatype, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEABoolean(EABoolean eaBoolean, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eaBoolean, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEADatatype(EADatatype eaDatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eaDatatype, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEADatatypePrototype(EADatatypePrototype eaDatatypePrototype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eaDatatypePrototype, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEANumerical(EANumerical eaNumerical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eaNumerical, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEAString(EAString eaString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eaString, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumeration(Enumeration enumeration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumeration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationLiteral(EnumerationLiteral enumerationLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumerationLiteral, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantity(Quantity quantity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quantity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeableValueType(RangeableValueType rangeableValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rangeableValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnit(Unit unit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEAArrayValue(EAArrayValue eaArrayValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eaArrayValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEABooleanValue(EABooleanValue eaBooleanValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eaBooleanValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEACompositeValue(EACompositeValue eaCompositeValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eaCompositeValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEAEnumerationValue(EAEnumerationValue eaEnumerationValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eaEnumerationValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEAExpression(EAExpression eaExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eaExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEANumericalValue(EANumericalValue eaNumericalValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eaNumericalValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEAStringValue(EAStringValue eaStringValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eaStringValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEAValue(EAValue eaValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eaValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClientServerKind(ClientServerKind clientServerKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEADirectionKind(EADirectionKind eaDirectionKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHardwareBusKind(HardwareBusKind hardwareBusKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIOHardwarePinKind(IOHardwarePinKind ioHardwarePinKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean(Boolean boolean_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBoolean_Pattern(boolean_, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBoolean_Pattern
	 */
	public static final  PatternMatcher [][] BOOLEAN__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("0|1|true|false")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean_Pattern(Boolean boolean_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Eastadl21Package.Literals.BOOLEAN, boolean_, BOOLEAN__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloat(Double float_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifier(String identifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIdentifier_Pattern(identifier, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIdentifier_Pattern
	 */
	public static final  PatternMatcher [][] IDENTIFIER__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[a-zA-Z]([a-zA-Z0-9]|_[a-zA-Z0-9])*_?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifier_Pattern(String identifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Eastadl21Package.Literals.IDENTIFIER, identifier, IDENTIFIER__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger(Integer integer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateInteger_Pattern(integer, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateInteger_Pattern
	 */
	public static final  PatternMatcher [][] INTEGER__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[+\\-]?[1-9][0-9]*|0x[0-9a-f]*|0[0-7]*|0b[0-1]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger_Pattern(Integer integer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Eastadl21Package.Literals.INTEGER, integer, INTEGER__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumerical(String numerical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNumerical_Pattern(numerical, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateNumerical_Pattern
	 */
	public static final  PatternMatcher [][] NUMERICAL__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(0x[0-9a-f]*)|(0[1-7][0-7]*)|(0b[0-1]*)|([+\\-]?[0-9]+(\\.[0-9]*)?(E([+\\-]?)[0-9]*)?)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Numerical</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumerical_Pattern(String numerical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Eastadl21Package.Literals.NUMERICAL, numerical, NUMERICAL__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRef(String ref, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRef_Pattern(ref, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateRef_Pattern
	 */
	public static final  PatternMatcher [][] REF__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("/?[a-zA-Z][a-zA-Z0-9_]{0,127}(/[a-zA-Z][a-zA-Z0-9_]{0,127})*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRef_Pattern(String ref, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Eastadl21Package.Literals.REF, ref, REF__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString(String string, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Activator.INSTANCE;
	}

} //Eastadl21Validator
