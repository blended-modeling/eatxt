/**
 */
package org.eclipse.eatop.eastadl21.impl;

import org.eclipse.eatop.eastadl21.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Eastadl21FactoryImpl extends EFactoryImpl implements Eastadl21Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Eastadl21Factory init() {
		try {
			Eastadl21Factory theEastadl21Factory = (Eastadl21Factory)EPackage.Registry.INSTANCE.getEFactory(Eastadl21Package.eNS_URI);
			if (theEastadl21Factory != null) {
				return theEastadl21Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Eastadl21FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Eastadl21FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Eastadl21Package.ALLOCATION: return createAllocation();
			case Eastadl21Package.BASIC_SOFTWARE_FUNCTION_TYPE: return createBasicSoftwareFunctionType();
			case Eastadl21Package.DESIGN_FUNCTION_PROTOTYPE: return createDesignFunctionPrototype();
			case Eastadl21Package.DESIGN_FUNCTION_TYPE: return createDesignFunctionType();
			case Eastadl21Package.FUNCTION_ALLOCATION: return createFunctionAllocation();
			case Eastadl21Package.FUNCTION_CLIENT_SERVER_INTERFACE: return createFunctionClientServerInterface();
			case Eastadl21Package.FUNCTION_CLIENT_SERVER_PORT: return createFunctionClientServerPort();
			case Eastadl21Package.FUNCTION_CONNECTOR: return createFunctionConnector();
			case Eastadl21Package.FUNCTION_FLOW_PORT: return createFunctionFlowPort();
			case Eastadl21Package.FUNCTION_POWER_PORT: return createFunctionPowerPort();
			case Eastadl21Package.HARDWARE_FUNCTION_TYPE: return createHardwareFunctionType();
			case Eastadl21Package.LOCAL_DEVICE_MANAGER: return createLocalDeviceManager();
			case Eastadl21Package.OPERATION: return createOperation();
			case Eastadl21Package.PORT_GROUP: return createPortGroup();
			case Eastadl21Package.FUNCTION_ALLOCATION_ALLOCATED_ELEMENT: return createFunctionAllocation_allocatedElement();
			case Eastadl21Package.FUNCTION_ALLOCATION_TARGET: return createFunctionAllocation_target();
			case Eastadl21Package.FUNCTION_CONNECTOR_PORT: return createFunctionConnector_port();
			case Eastadl21Package.ACTUATOR: return createActuator();
			case Eastadl21Package.COMMUNICATION_HARDWARE_PIN: return createCommunicationHardwarePin();
			case Eastadl21Package.ELECTRICAL_COMPONENT: return createElectricalComponent();
			case Eastadl21Package.HARDWARE_COMPONENT_PROTOTYPE: return createHardwareComponentPrototype();
			case Eastadl21Package.HARDWARE_COMPONENT_TYPE: return createHardwareComponentType();
			case Eastadl21Package.HARDWARE_CONNECTOR: return createHardwareConnector();
			case Eastadl21Package.HARDWARE_PORT: return createHardwarePort();
			case Eastadl21Package.HARDWARE_PORT_CONNECTOR: return createHardwarePortConnector();
			case Eastadl21Package.IO_HARDWARE_PIN: return createIOHardwarePin();
			case Eastadl21Package.LOGICAL_PORT_CONNECTOR: return createLogicalPortConnector();
			case Eastadl21Package.NODE: return createNode();
			case Eastadl21Package.POWER_HARDWARE_PIN: return createPowerHardwarePin();
			case Eastadl21Package.SENSOR: return createSensor();
			case Eastadl21Package.HARDWARE_CONNECTOR_PORT: return createHardwareConnector_port();
			case Eastadl21Package.HARDWARE_PORT_CONNECTOR_PORT: return createHardwarePortConnector_port();
			case Eastadl21Package.COMMENT: return createComment();
			case Eastadl21Package.EA_PACKAGE: return createEAPackage();
			case Eastadl21Package.EAXML: return createEAXML();
			case Eastadl21Package.RATIONALE: return createRationale();
			case Eastadl21Package.REALIZATION: return createRealization();
			case Eastadl21Package.REALIZATION_REALIZED: return createRealization_realized();
			case Eastadl21Package.REALIZATION_REALIZED_BY: return createRealization_realizedBy();
			case Eastadl21Package.ARRAY_DATATYPE: return createArrayDatatype();
			case Eastadl21Package.COMPOSITE_DATATYPE: return createCompositeDatatype();
			case Eastadl21Package.EA_BOOLEAN: return createEABoolean();
			case Eastadl21Package.EA_DATATYPE_PROTOTYPE: return createEADatatypePrototype();
			case Eastadl21Package.EA_NUMERICAL: return createEANumerical();
			case Eastadl21Package.EA_STRING: return createEAString();
			case Eastadl21Package.ENUMERATION: return createEnumeration();
			case Eastadl21Package.ENUMERATION_LITERAL: return createEnumerationLiteral();
			case Eastadl21Package.QUANTITY: return createQuantity();
			case Eastadl21Package.RANGEABLE_VALUE_TYPE: return createRangeableValueType();
			case Eastadl21Package.UNIT: return createUnit();
			case Eastadl21Package.EA_ARRAY_VALUE: return createEAArrayValue();
			case Eastadl21Package.EA_BOOLEAN_VALUE: return createEABooleanValue();
			case Eastadl21Package.EA_COMPOSITE_VALUE: return createEACompositeValue();
			case Eastadl21Package.EA_ENUMERATION_VALUE: return createEAEnumerationValue();
			case Eastadl21Package.EA_EXPRESSION: return createEAExpression();
			case Eastadl21Package.EA_NUMERICAL_VALUE: return createEANumericalValue();
			case Eastadl21Package.EA_STRING_VALUE: return createEAStringValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Eastadl21Package.CLIENT_SERVER_KIND:
				return createClientServerKindFromString(eDataType, initialValue);
			case Eastadl21Package.EA_DIRECTION_KIND:
				return createEADirectionKindFromString(eDataType, initialValue);
			case Eastadl21Package.HARDWARE_BUS_KIND:
				return createHardwareBusKindFromString(eDataType, initialValue);
			case Eastadl21Package.IO_HARDWARE_PIN_KIND:
				return createIOHardwarePinKindFromString(eDataType, initialValue);
			case Eastadl21Package.BOOLEAN:
				return createBooleanFromString(eDataType, initialValue);
			case Eastadl21Package.FLOAT:
				return createFloatFromString(eDataType, initialValue);
			case Eastadl21Package.IDENTIFIER:
				return createIdentifierFromString(eDataType, initialValue);
			case Eastadl21Package.INTEGER:
				return createIntegerFromString(eDataType, initialValue);
			case Eastadl21Package.NUMERICAL:
				return createNumericalFromString(eDataType, initialValue);
			case Eastadl21Package.REF:
				return createRefFromString(eDataType, initialValue);
			case Eastadl21Package.STRING:
				return createStringFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Eastadl21Package.CLIENT_SERVER_KIND:
				return convertClientServerKindToString(eDataType, instanceValue);
			case Eastadl21Package.EA_DIRECTION_KIND:
				return convertEADirectionKindToString(eDataType, instanceValue);
			case Eastadl21Package.HARDWARE_BUS_KIND:
				return convertHardwareBusKindToString(eDataType, instanceValue);
			case Eastadl21Package.IO_HARDWARE_PIN_KIND:
				return convertIOHardwarePinKindToString(eDataType, instanceValue);
			case Eastadl21Package.BOOLEAN:
				return convertBooleanToString(eDataType, instanceValue);
			case Eastadl21Package.FLOAT:
				return convertFloatToString(eDataType, instanceValue);
			case Eastadl21Package.IDENTIFIER:
				return convertIdentifierToString(eDataType, instanceValue);
			case Eastadl21Package.INTEGER:
				return convertIntegerToString(eDataType, instanceValue);
			case Eastadl21Package.NUMERICAL:
				return convertNumericalToString(eDataType, instanceValue);
			case Eastadl21Package.REF:
				return convertRefToString(eDataType, instanceValue);
			case Eastadl21Package.STRING:
				return convertStringToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Allocation createAllocation() {
		AllocationImpl allocation = new AllocationImpl();
		return allocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicSoftwareFunctionType createBasicSoftwareFunctionType() {
		BasicSoftwareFunctionTypeImpl basicSoftwareFunctionType = new BasicSoftwareFunctionTypeImpl();
		return basicSoftwareFunctionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DesignFunctionPrototype createDesignFunctionPrototype() {
		DesignFunctionPrototypeImpl designFunctionPrototype = new DesignFunctionPrototypeImpl();
		return designFunctionPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DesignFunctionType createDesignFunctionType() {
		DesignFunctionTypeImpl designFunctionType = new DesignFunctionTypeImpl();
		return designFunctionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionAllocation createFunctionAllocation() {
		FunctionAllocationImpl functionAllocation = new FunctionAllocationImpl();
		return functionAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionClientServerInterface createFunctionClientServerInterface() {
		FunctionClientServerInterfaceImpl functionClientServerInterface = new FunctionClientServerInterfaceImpl();
		return functionClientServerInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionClientServerPort createFunctionClientServerPort() {
		FunctionClientServerPortImpl functionClientServerPort = new FunctionClientServerPortImpl();
		return functionClientServerPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionConnector createFunctionConnector() {
		FunctionConnectorImpl functionConnector = new FunctionConnectorImpl();
		return functionConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionFlowPort createFunctionFlowPort() {
		FunctionFlowPortImpl functionFlowPort = new FunctionFlowPortImpl();
		return functionFlowPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionPowerPort createFunctionPowerPort() {
		FunctionPowerPortImpl functionPowerPort = new FunctionPowerPortImpl();
		return functionPowerPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HardwareFunctionType createHardwareFunctionType() {
		HardwareFunctionTypeImpl hardwareFunctionType = new HardwareFunctionTypeImpl();
		return hardwareFunctionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocalDeviceManager createLocalDeviceManager() {
		LocalDeviceManagerImpl localDeviceManager = new LocalDeviceManagerImpl();
		return localDeviceManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortGroup createPortGroup() {
		PortGroupImpl portGroup = new PortGroupImpl();
		return portGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionAllocation_allocatedElement createFunctionAllocation_allocatedElement() {
		FunctionAllocation_allocatedElementImpl functionAllocation_allocatedElement = new FunctionAllocation_allocatedElementImpl();
		return functionAllocation_allocatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionAllocation_target createFunctionAllocation_target() {
		FunctionAllocation_targetImpl functionAllocation_target = new FunctionAllocation_targetImpl();
		return functionAllocation_target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionConnector_port createFunctionConnector_port() {
		FunctionConnector_portImpl functionConnector_port = new FunctionConnector_portImpl();
		return functionConnector_port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Actuator createActuator() {
		ActuatorImpl actuator = new ActuatorImpl();
		return actuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationHardwarePin createCommunicationHardwarePin() {
		CommunicationHardwarePinImpl communicationHardwarePin = new CommunicationHardwarePinImpl();
		return communicationHardwarePin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElectricalComponent createElectricalComponent() {
		ElectricalComponentImpl electricalComponent = new ElectricalComponentImpl();
		return electricalComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HardwareComponentPrototype createHardwareComponentPrototype() {
		HardwareComponentPrototypeImpl hardwareComponentPrototype = new HardwareComponentPrototypeImpl();
		return hardwareComponentPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HardwareComponentType createHardwareComponentType() {
		HardwareComponentTypeImpl hardwareComponentType = new HardwareComponentTypeImpl();
		return hardwareComponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HardwareConnector createHardwareConnector() {
		HardwareConnectorImpl hardwareConnector = new HardwareConnectorImpl();
		return hardwareConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HardwarePort createHardwarePort() {
		HardwarePortImpl hardwarePort = new HardwarePortImpl();
		return hardwarePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HardwarePortConnector createHardwarePortConnector() {
		HardwarePortConnectorImpl hardwarePortConnector = new HardwarePortConnectorImpl();
		return hardwarePortConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IOHardwarePin createIOHardwarePin() {
		IOHardwarePinImpl ioHardwarePin = new IOHardwarePinImpl();
		return ioHardwarePin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicalPortConnector createLogicalPortConnector() {
		LogicalPortConnectorImpl logicalPortConnector = new LogicalPortConnectorImpl();
		return logicalPortConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PowerHardwarePin createPowerHardwarePin() {
		PowerHardwarePinImpl powerHardwarePin = new PowerHardwarePinImpl();
		return powerHardwarePin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sensor createSensor() {
		SensorImpl sensor = new SensorImpl();
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HardwareConnector_port createHardwareConnector_port() {
		HardwareConnector_portImpl hardwareConnector_port = new HardwareConnector_portImpl();
		return hardwareConnector_port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HardwarePortConnector_port createHardwarePortConnector_port() {
		HardwarePortConnector_portImpl hardwarePortConnector_port = new HardwarePortConnector_portImpl();
		return hardwarePortConnector_port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAPackage createEAPackage() {
		EAPackageImpl eaPackage = new EAPackageImpl();
		return eaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAXML createEAXML() {
		EAXMLImpl eaxml = new EAXMLImpl();
		return eaxml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rationale createRationale() {
		RationaleImpl rationale = new RationaleImpl();
		return rationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Realization createRealization() {
		RealizationImpl realization = new RealizationImpl();
		return realization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Realization_realized createRealization_realized() {
		Realization_realizedImpl realization_realized = new Realization_realizedImpl();
		return realization_realized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Realization_realizedBy createRealization_realizedBy() {
		Realization_realizedByImpl realization_realizedBy = new Realization_realizedByImpl();
		return realization_realizedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayDatatype createArrayDatatype() {
		ArrayDatatypeImpl arrayDatatype = new ArrayDatatypeImpl();
		return arrayDatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositeDatatype createCompositeDatatype() {
		CompositeDatatypeImpl compositeDatatype = new CompositeDatatypeImpl();
		return compositeDatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EABoolean createEABoolean() {
		EABooleanImpl eaBoolean = new EABooleanImpl();
		return eaBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EADatatypePrototype createEADatatypePrototype() {
		EADatatypePrototypeImpl eaDatatypePrototype = new EADatatypePrototypeImpl();
		return eaDatatypePrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EANumerical createEANumerical() {
		EANumericalImpl eaNumerical = new EANumericalImpl();
		return eaNumerical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAString createEAString() {
		EAStringImpl eaString = new EAStringImpl();
		return eaString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration createEnumeration() {
		EnumerationImpl enumeration = new EnumerationImpl();
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumerationLiteral createEnumerationLiteral() {
		EnumerationLiteralImpl enumerationLiteral = new EnumerationLiteralImpl();
		return enumerationLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity createQuantity() {
		QuantityImpl quantity = new QuantityImpl();
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RangeableValueType createRangeableValueType() {
		RangeableValueTypeImpl rangeableValueType = new RangeableValueTypeImpl();
		return rangeableValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Unit createUnit() {
		UnitImpl unit = new UnitImpl();
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAArrayValue createEAArrayValue() {
		EAArrayValueImpl eaArrayValue = new EAArrayValueImpl();
		return eaArrayValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EABooleanValue createEABooleanValue() {
		EABooleanValueImpl eaBooleanValue = new EABooleanValueImpl();
		return eaBooleanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EACompositeValue createEACompositeValue() {
		EACompositeValueImpl eaCompositeValue = new EACompositeValueImpl();
		return eaCompositeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAEnumerationValue createEAEnumerationValue() {
		EAEnumerationValueImpl eaEnumerationValue = new EAEnumerationValueImpl();
		return eaEnumerationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAExpression createEAExpression() {
		EAExpressionImpl eaExpression = new EAExpressionImpl();
		return eaExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EANumericalValue createEANumericalValue() {
		EANumericalValueImpl eaNumericalValue = new EANumericalValueImpl();
		return eaNumericalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAStringValue createEAStringValue() {
		EAStringValueImpl eaStringValue = new EAStringValueImpl();
		return eaStringValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientServerKind createClientServerKindFromString(EDataType eDataType, String initialValue) {
		ClientServerKind result = ClientServerKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClientServerKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EADirectionKind createEADirectionKindFromString(EDataType eDataType, String initialValue) {
		EADirectionKind result = EADirectionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEADirectionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareBusKind createHardwareBusKindFromString(EDataType eDataType, String initialValue) {
		HardwareBusKind result = HardwareBusKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHardwareBusKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOHardwarePinKind createIOHardwarePinKindFromString(EDataType eDataType, String initialValue) {
		IOHardwarePinKind result = IOHardwarePinKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIOHardwarePinKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createBooleanFromString(EDataType eDataType, String initialValue) {
		return (Boolean)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createFloatFromString(EDataType eDataType, String initialValue) {
		return (Double)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFloatToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIdentifierFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdentifierToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createIntegerFromString(EDataType eDataType, String initialValue) {
		return (Integer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createNumericalFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumericalToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createRefFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRefToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStringFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Eastadl21Package getEastadl21Package() {
		return (Eastadl21Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Eastadl21Package getPackage() {
		return Eastadl21Package.eINSTANCE;
	}

} //Eastadl21FactoryImpl
