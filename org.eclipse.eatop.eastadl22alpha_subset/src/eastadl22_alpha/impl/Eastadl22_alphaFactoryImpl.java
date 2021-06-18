/**
 */
package eastadl22_alpha.impl;

import eastadl22_alpha.*;

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
public class Eastadl22_alphaFactoryImpl extends EFactoryImpl implements Eastadl22_alphaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Eastadl22_alphaFactory init() {
		try {
			Eastadl22_alphaFactory theEastadl22_alphaFactory = (Eastadl22_alphaFactory)EPackage.Registry.INSTANCE.getEFactory(Eastadl22_alphaPackage.eNS_URI);
			if (theEastadl22_alphaFactory != null) {
				return theEastadl22_alphaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Eastadl22_alphaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Eastadl22_alphaFactoryImpl() {
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
			case Eastadl22_alphaPackage.DESIGN_LEVEL: return createDesignLevel();
			case Eastadl22_alphaPackage.ALLOCATION: return createAllocation();
			case Eastadl22_alphaPackage.ANALYSIS_FUNCTION_PROTOTYPE: return createAnalysisFunctionPrototype();
			case Eastadl22_alphaPackage.ANALYSIS_FUNCTION_TYPE: return createAnalysisFunctionType();
			case Eastadl22_alphaPackage.BASIC_SOFTWARE_FUNCTION_TYPE: return createBasicSoftwareFunctionType();
			case Eastadl22_alphaPackage.DESIGN_FUNCTION_PROTOTYPE: return createDesignFunctionPrototype();
			case Eastadl22_alphaPackage.DESIGN_FUNCTION_TYPE: return createDesignFunctionType();
			case Eastadl22_alphaPackage.FUNCTIONAL_DEVICE: return createFunctionalDevice();
			case Eastadl22_alphaPackage.FUNCTION_ALLOCATION: return createFunctionAllocation();
			case Eastadl22_alphaPackage.FUNCTION_CLIENT_SERVER_INTERFACE: return createFunctionClientServerInterface();
			case Eastadl22_alphaPackage.FUNCTION_CLIENT_SERVER_PORT: return createFunctionClientServerPort();
			case Eastadl22_alphaPackage.FUNCTION_CONNECTOR: return createFunctionConnector();
			case Eastadl22_alphaPackage.FUNCTION_FLOW_PORT: return createFunctionFlowPort();
			case Eastadl22_alphaPackage.FUNCTION_POWER_PORT: return createFunctionPowerPort();
			case Eastadl22_alphaPackage.HARDWARE_FUNCTION_TYPE: return createHardwareFunctionType();
			case Eastadl22_alphaPackage.LOCAL_DEVICE_MANAGER: return createLocalDeviceManager();
			case Eastadl22_alphaPackage.OPERATION: return createOperation();
			case Eastadl22_alphaPackage.PORT_GROUP: return createPortGroup();
			case Eastadl22_alphaPackage.FUNCTION_ALLOCATION_ALLOCATED_ELEMENT: return createFunctionAllocation_allocatedElement();
			case Eastadl22_alphaPackage.FUNCTION_ALLOCATION_TARGET: return createFunctionAllocation_target();
			case Eastadl22_alphaPackage.FUNCTION_CONNECTOR_PORT: return createFunctionConnector_port();
			case Eastadl22_alphaPackage.ACTUATOR: return createActuator();
			case Eastadl22_alphaPackage.COMMUNICATION_HARDWARE_PIN: return createCommunicationHardwarePin();
			case Eastadl22_alphaPackage.ELECTRICAL_COMPONENT: return createElectricalComponent();
			case Eastadl22_alphaPackage.HARDWARE_COMPONENT_PROTOTYPE: return createHardwareComponentPrototype();
			case Eastadl22_alphaPackage.HARDWARE_COMPONENT_TYPE: return createHardwareComponentType();
			case Eastadl22_alphaPackage.HARDWARE_CONNECTOR: return createHardwareConnector();
			case Eastadl22_alphaPackage.HARDWARE_PORT: return createHardwarePort();
			case Eastadl22_alphaPackage.HARDWARE_PORT_CONNECTOR: return createHardwarePortConnector();
			case Eastadl22_alphaPackage.IO_HARDWARE_PIN: return createIOHardwarePin();
			case Eastadl22_alphaPackage.LOGICAL_PORT_CONNECTOR: return createLogicalPortConnector();
			case Eastadl22_alphaPackage.NODE: return createNode();
			case Eastadl22_alphaPackage.POWER_HARDWARE_PIN: return createPowerHardwarePin();
			case Eastadl22_alphaPackage.SENSOR: return createSensor();
			case Eastadl22_alphaPackage.HARDWARE_CONNECTOR_PORT: return createHardwareConnector_port();
			case Eastadl22_alphaPackage.HARDWARE_PORT_CONNECTOR_PORT: return createHardwarePortConnector_port();
			case Eastadl22_alphaPackage.COMMENT: return createComment();
			case Eastadl22_alphaPackage.EA_PACKAGE: return createEAPackage();
			case Eastadl22_alphaPackage.EAXML: return createEAXML();
			case Eastadl22_alphaPackage.RATIONALE: return createRationale();
			case Eastadl22_alphaPackage.REALIZATION: return createRealization();
			case Eastadl22_alphaPackage.REALIZATION_REALIZED: return createRealization_realized();
			case Eastadl22_alphaPackage.REALIZATION_REALIZED_BY: return createRealization_realizedBy();
			case Eastadl22_alphaPackage.ARRAY_DATATYPE: return createArrayDatatype();
			case Eastadl22_alphaPackage.COMPOSITE_DATATYPE: return createCompositeDatatype();
			case Eastadl22_alphaPackage.EA_BOOLEAN: return createEABoolean();
			case Eastadl22_alphaPackage.EA_DATATYPE_PROTOTYPE: return createEADatatypePrototype();
			case Eastadl22_alphaPackage.EA_NUMERICAL: return createEANumerical();
			case Eastadl22_alphaPackage.EA_STRING: return createEAString();
			case Eastadl22_alphaPackage.ENUMERATION: return createEnumeration();
			case Eastadl22_alphaPackage.ENUMERATION_LITERAL: return createEnumerationLiteral();
			case Eastadl22_alphaPackage.QUANTITY: return createQuantity();
			case Eastadl22_alphaPackage.RANGEABLE_VALUE_TYPE: return createRangeableValueType();
			case Eastadl22_alphaPackage.UNIT: return createUnit();
			case Eastadl22_alphaPackage.EA_ARRAY_VALUE: return createEAArrayValue();
			case Eastadl22_alphaPackage.EA_BOOLEAN_VALUE: return createEABooleanValue();
			case Eastadl22_alphaPackage.EA_COMPOSITE_VALUE: return createEACompositeValue();
			case Eastadl22_alphaPackage.EA_ENUMERATION_VALUE: return createEAEnumerationValue();
			case Eastadl22_alphaPackage.EA_EXPRESSION: return createEAExpression();
			case Eastadl22_alphaPackage.EA_NUMERICAL_VALUE: return createEANumericalValue();
			case Eastadl22_alphaPackage.EA_STRING_VALUE: return createEAStringValue();
			case Eastadl22_alphaPackage.USER_ATTRIBUTE_DEFINITION: return createUserAttributeDefinition();
			case Eastadl22_alphaPackage.USER_ATTRIBUTED_ELEMENT: return createUserAttributedElement();
			case Eastadl22_alphaPackage.USER_ELEMENT_TYPE: return createUserElementType();
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
			case Eastadl22_alphaPackage.CLIENT_SERVER_KIND:
				return createClientServerKindFromString(eDataType, initialValue);
			case Eastadl22_alphaPackage.EA_DIRECTION_KIND:
				return createEADirectionKindFromString(eDataType, initialValue);
			case Eastadl22_alphaPackage.HARDWARE_BUS_KIND:
				return createHardwareBusKindFromString(eDataType, initialValue);
			case Eastadl22_alphaPackage.IO_HARDWARE_PIN_KIND:
				return createIOHardwarePinKindFromString(eDataType, initialValue);
			case Eastadl22_alphaPackage.BOOLEAN:
				return createBooleanFromString(eDataType, initialValue);
			case Eastadl22_alphaPackage.FLOAT:
				return createFloatFromString(eDataType, initialValue);
			case Eastadl22_alphaPackage.IDENTIFIER:
				return createIdentifierFromString(eDataType, initialValue);
			case Eastadl22_alphaPackage.INTEGER:
				return createIntegerFromString(eDataType, initialValue);
			case Eastadl22_alphaPackage.NUMERICAL:
				return createNumericalFromString(eDataType, initialValue);
			case Eastadl22_alphaPackage.REF:
				return createRefFromString(eDataType, initialValue);
			case Eastadl22_alphaPackage.STRING:
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
			case Eastadl22_alphaPackage.CLIENT_SERVER_KIND:
				return convertClientServerKindToString(eDataType, instanceValue);
			case Eastadl22_alphaPackage.EA_DIRECTION_KIND:
				return convertEADirectionKindToString(eDataType, instanceValue);
			case Eastadl22_alphaPackage.HARDWARE_BUS_KIND:
				return convertHardwareBusKindToString(eDataType, instanceValue);
			case Eastadl22_alphaPackage.IO_HARDWARE_PIN_KIND:
				return convertIOHardwarePinKindToString(eDataType, instanceValue);
			case Eastadl22_alphaPackage.BOOLEAN:
				return convertBooleanToString(eDataType, instanceValue);
			case Eastadl22_alphaPackage.FLOAT:
				return convertFloatToString(eDataType, instanceValue);
			case Eastadl22_alphaPackage.IDENTIFIER:
				return convertIdentifierToString(eDataType, instanceValue);
			case Eastadl22_alphaPackage.INTEGER:
				return convertIntegerToString(eDataType, instanceValue);
			case Eastadl22_alphaPackage.NUMERICAL:
				return convertNumericalToString(eDataType, instanceValue);
			case Eastadl22_alphaPackage.REF:
				return convertRefToString(eDataType, instanceValue);
			case Eastadl22_alphaPackage.STRING:
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
	public DesignLevel createDesignLevel() {
		DesignLevelImpl designLevel = new DesignLevelImpl();
		return designLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Allocation createAllocation() {
		AllocationImpl allocation = new AllocationImpl();
		return allocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisFunctionPrototype createAnalysisFunctionPrototype() {
		AnalysisFunctionPrototypeImpl analysisFunctionPrototype = new AnalysisFunctionPrototypeImpl();
		return analysisFunctionPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisFunctionType createAnalysisFunctionType() {
		AnalysisFunctionTypeImpl analysisFunctionType = new AnalysisFunctionTypeImpl();
		return analysisFunctionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicSoftwareFunctionType createBasicSoftwareFunctionType() {
		BasicSoftwareFunctionTypeImpl basicSoftwareFunctionType = new BasicSoftwareFunctionTypeImpl();
		return basicSoftwareFunctionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignFunctionPrototype createDesignFunctionPrototype() {
		DesignFunctionPrototypeImpl designFunctionPrototype = new DesignFunctionPrototypeImpl();
		return designFunctionPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignFunctionType createDesignFunctionType() {
		DesignFunctionTypeImpl designFunctionType = new DesignFunctionTypeImpl();
		return designFunctionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalDevice createFunctionalDevice() {
		FunctionalDeviceImpl functionalDevice = new FunctionalDeviceImpl();
		return functionalDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionAllocation createFunctionAllocation() {
		FunctionAllocationImpl functionAllocation = new FunctionAllocationImpl();
		return functionAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionClientServerInterface createFunctionClientServerInterface() {
		FunctionClientServerInterfaceImpl functionClientServerInterface = new FunctionClientServerInterfaceImpl();
		return functionClientServerInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionClientServerPort createFunctionClientServerPort() {
		FunctionClientServerPortImpl functionClientServerPort = new FunctionClientServerPortImpl();
		return functionClientServerPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionConnector createFunctionConnector() {
		FunctionConnectorImpl functionConnector = new FunctionConnectorImpl();
		return functionConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionFlowPort createFunctionFlowPort() {
		FunctionFlowPortImpl functionFlowPort = new FunctionFlowPortImpl();
		return functionFlowPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionPowerPort createFunctionPowerPort() {
		FunctionPowerPortImpl functionPowerPort = new FunctionPowerPortImpl();
		return functionPowerPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareFunctionType createHardwareFunctionType() {
		HardwareFunctionTypeImpl hardwareFunctionType = new HardwareFunctionTypeImpl();
		return hardwareFunctionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalDeviceManager createLocalDeviceManager() {
		LocalDeviceManagerImpl localDeviceManager = new LocalDeviceManagerImpl();
		return localDeviceManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortGroup createPortGroup() {
		PortGroupImpl portGroup = new PortGroupImpl();
		return portGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionAllocation_allocatedElement createFunctionAllocation_allocatedElement() {
		FunctionAllocation_allocatedElementImpl functionAllocation_allocatedElement = new FunctionAllocation_allocatedElementImpl();
		return functionAllocation_allocatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionAllocation_target createFunctionAllocation_target() {
		FunctionAllocation_targetImpl functionAllocation_target = new FunctionAllocation_targetImpl();
		return functionAllocation_target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionConnector_port createFunctionConnector_port() {
		FunctionConnector_portImpl functionConnector_port = new FunctionConnector_portImpl();
		return functionConnector_port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actuator createActuator() {
		ActuatorImpl actuator = new ActuatorImpl();
		return actuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationHardwarePin createCommunicationHardwarePin() {
		CommunicationHardwarePinImpl communicationHardwarePin = new CommunicationHardwarePinImpl();
		return communicationHardwarePin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectricalComponent createElectricalComponent() {
		ElectricalComponentImpl electricalComponent = new ElectricalComponentImpl();
		return electricalComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareComponentPrototype createHardwareComponentPrototype() {
		HardwareComponentPrototypeImpl hardwareComponentPrototype = new HardwareComponentPrototypeImpl();
		return hardwareComponentPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareComponentType createHardwareComponentType() {
		HardwareComponentTypeImpl hardwareComponentType = new HardwareComponentTypeImpl();
		return hardwareComponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareConnector createHardwareConnector() {
		HardwareConnectorImpl hardwareConnector = new HardwareConnectorImpl();
		return hardwareConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwarePort createHardwarePort() {
		HardwarePortImpl hardwarePort = new HardwarePortImpl();
		return hardwarePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwarePortConnector createHardwarePortConnector() {
		HardwarePortConnectorImpl hardwarePortConnector = new HardwarePortConnectorImpl();
		return hardwarePortConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOHardwarePin createIOHardwarePin() {
		IOHardwarePinImpl ioHardwarePin = new IOHardwarePinImpl();
		return ioHardwarePin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalPortConnector createLogicalPortConnector() {
		LogicalPortConnectorImpl logicalPortConnector = new LogicalPortConnectorImpl();
		return logicalPortConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerHardwarePin createPowerHardwarePin() {
		PowerHardwarePinImpl powerHardwarePin = new PowerHardwarePinImpl();
		return powerHardwarePin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor createSensor() {
		SensorImpl sensor = new SensorImpl();
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareConnector_port createHardwareConnector_port() {
		HardwareConnector_portImpl hardwareConnector_port = new HardwareConnector_portImpl();
		return hardwareConnector_port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwarePortConnector_port createHardwarePortConnector_port() {
		HardwarePortConnector_portImpl hardwarePortConnector_port = new HardwarePortConnector_portImpl();
		return hardwarePortConnector_port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAPackage createEAPackage() {
		EAPackageImpl eaPackage = new EAPackageImpl();
		return eaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAXML createEAXML() {
		EAXMLImpl eaxml = new EAXMLImpl();
		return eaxml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rationale createRationale() {
		RationaleImpl rationale = new RationaleImpl();
		return rationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Realization createRealization() {
		RealizationImpl realization = new RealizationImpl();
		return realization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Realization_realized createRealization_realized() {
		Realization_realizedImpl realization_realized = new Realization_realizedImpl();
		return realization_realized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Realization_realizedBy createRealization_realizedBy() {
		Realization_realizedByImpl realization_realizedBy = new Realization_realizedByImpl();
		return realization_realizedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayDatatype createArrayDatatype() {
		ArrayDatatypeImpl arrayDatatype = new ArrayDatatypeImpl();
		return arrayDatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeDatatype createCompositeDatatype() {
		CompositeDatatypeImpl compositeDatatype = new CompositeDatatypeImpl();
		return compositeDatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EABoolean createEABoolean() {
		EABooleanImpl eaBoolean = new EABooleanImpl();
		return eaBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EADatatypePrototype createEADatatypePrototype() {
		EADatatypePrototypeImpl eaDatatypePrototype = new EADatatypePrototypeImpl();
		return eaDatatypePrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EANumerical createEANumerical() {
		EANumericalImpl eaNumerical = new EANumericalImpl();
		return eaNumerical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAString createEAString() {
		EAStringImpl eaString = new EAStringImpl();
		return eaString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration createEnumeration() {
		EnumerationImpl enumeration = new EnumerationImpl();
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral createEnumerationLiteral() {
		EnumerationLiteralImpl enumerationLiteral = new EnumerationLiteralImpl();
		return enumerationLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity createQuantity() {
		QuantityImpl quantity = new QuantityImpl();
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeableValueType createRangeableValueType() {
		RangeableValueTypeImpl rangeableValueType = new RangeableValueTypeImpl();
		return rangeableValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit createUnit() {
		UnitImpl unit = new UnitImpl();
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAArrayValue createEAArrayValue() {
		EAArrayValueImpl eaArrayValue = new EAArrayValueImpl();
		return eaArrayValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EABooleanValue createEABooleanValue() {
		EABooleanValueImpl eaBooleanValue = new EABooleanValueImpl();
		return eaBooleanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EACompositeValue createEACompositeValue() {
		EACompositeValueImpl eaCompositeValue = new EACompositeValueImpl();
		return eaCompositeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAEnumerationValue createEAEnumerationValue() {
		EAEnumerationValueImpl eaEnumerationValue = new EAEnumerationValueImpl();
		return eaEnumerationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAExpression createEAExpression() {
		EAExpressionImpl eaExpression = new EAExpressionImpl();
		return eaExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EANumericalValue createEANumericalValue() {
		EANumericalValueImpl eaNumericalValue = new EANumericalValueImpl();
		return eaNumericalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAStringValue createEAStringValue() {
		EAStringValueImpl eaStringValue = new EAStringValueImpl();
		return eaStringValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserAttributeDefinition createUserAttributeDefinition() {
		UserAttributeDefinitionImpl userAttributeDefinition = new UserAttributeDefinitionImpl();
		return userAttributeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserAttributedElement createUserAttributedElement() {
		UserAttributedElementImpl userAttributedElement = new UserAttributedElementImpl();
		return userAttributedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserElementType createUserElementType() {
		UserElementTypeImpl userElementType = new UserElementTypeImpl();
		return userElementType;
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
	public Eastadl22_alphaPackage getEastadl22_alphaPackage() {
		return (Eastadl22_alphaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Eastadl22_alphaPackage getPackage() {
		return Eastadl22_alphaPackage.eINSTANCE;
	}

} //Eastadl22_alphaFactoryImpl
