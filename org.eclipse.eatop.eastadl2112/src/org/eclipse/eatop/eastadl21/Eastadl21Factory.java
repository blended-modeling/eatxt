/**
 */
package org.eclipse.eatop.eastadl21;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.eatop.eastadl21.Eastadl21Package
 * @generated
 */
public interface Eastadl21Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Eastadl21Factory eINSTANCE = org.eclipse.eatop.eastadl21.impl.Eastadl21FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Design Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Design Level</em>'.
	 * @generated
	 */
	DesignLevel createDesignLevel();

	/**
	 * Returns a new object of class '<em>Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allocation</em>'.
	 * @generated
	 */
	Allocation createAllocation();

	/**
	 * Returns a new object of class '<em>Analysis Function Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analysis Function Prototype</em>'.
	 * @generated
	 */
	AnalysisFunctionPrototype createAnalysisFunctionPrototype();

	/**
	 * Returns a new object of class '<em>Analysis Function Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analysis Function Type</em>'.
	 * @generated
	 */
	AnalysisFunctionType createAnalysisFunctionType();

	/**
	 * Returns a new object of class '<em>Basic Software Function Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Software Function Type</em>'.
	 * @generated
	 */
	BasicSoftwareFunctionType createBasicSoftwareFunctionType();

	/**
	 * Returns a new object of class '<em>Design Function Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Design Function Prototype</em>'.
	 * @generated
	 */
	DesignFunctionPrototype createDesignFunctionPrototype();

	/**
	 * Returns a new object of class '<em>Design Function Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Design Function Type</em>'.
	 * @generated
	 */
	DesignFunctionType createDesignFunctionType();

	/**
	 * Returns a new object of class '<em>Functional Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functional Device</em>'.
	 * @generated
	 */
	FunctionalDevice createFunctionalDevice();

	/**
	 * Returns a new object of class '<em>Function Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Allocation</em>'.
	 * @generated
	 */
	FunctionAllocation createFunctionAllocation();

	/**
	 * Returns a new object of class '<em>Function Client Server Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Client Server Interface</em>'.
	 * @generated
	 */
	FunctionClientServerInterface createFunctionClientServerInterface();

	/**
	 * Returns a new object of class '<em>Function Client Server Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Client Server Port</em>'.
	 * @generated
	 */
	FunctionClientServerPort createFunctionClientServerPort();

	/**
	 * Returns a new object of class '<em>Function Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Connector</em>'.
	 * @generated
	 */
	FunctionConnector createFunctionConnector();

	/**
	 * Returns a new object of class '<em>Function Flow Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Flow Port</em>'.
	 * @generated
	 */
	FunctionFlowPort createFunctionFlowPort();

	/**
	 * Returns a new object of class '<em>Function Power Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Power Port</em>'.
	 * @generated
	 */
	FunctionPowerPort createFunctionPowerPort();

	/**
	 * Returns a new object of class '<em>Hardware Function Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Function Type</em>'.
	 * @generated
	 */
	HardwareFunctionType createHardwareFunctionType();

	/**
	 * Returns a new object of class '<em>Local Device Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Device Manager</em>'.
	 * @generated
	 */
	LocalDeviceManager createLocalDeviceManager();

	/**
	 * Returns a new object of class '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation</em>'.
	 * @generated
	 */
	Operation createOperation();

	/**
	 * Returns a new object of class '<em>Port Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Group</em>'.
	 * @generated
	 */
	PortGroup createPortGroup();

	/**
	 * Returns a new object of class '<em>Function Allocation allocated Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Allocation allocated Element</em>'.
	 * @generated
	 */
	FunctionAllocation_allocatedElement createFunctionAllocation_allocatedElement();

	/**
	 * Returns a new object of class '<em>Function Allocation target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Allocation target</em>'.
	 * @generated
	 */
	FunctionAllocation_target createFunctionAllocation_target();

	/**
	 * Returns a new object of class '<em>Function Connector port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Connector port</em>'.
	 * @generated
	 */
	FunctionConnector_port createFunctionConnector_port();

	/**
	 * Returns a new object of class '<em>Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actuator</em>'.
	 * @generated
	 */
	Actuator createActuator();

	/**
	 * Returns a new object of class '<em>Communication Hardware Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Hardware Pin</em>'.
	 * @generated
	 */
	CommunicationHardwarePin createCommunicationHardwarePin();

	/**
	 * Returns a new object of class '<em>Electrical Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Electrical Component</em>'.
	 * @generated
	 */
	ElectricalComponent createElectricalComponent();

	/**
	 * Returns a new object of class '<em>Hardware Component Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Component Prototype</em>'.
	 * @generated
	 */
	HardwareComponentPrototype createHardwareComponentPrototype();

	/**
	 * Returns a new object of class '<em>Hardware Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Component Type</em>'.
	 * @generated
	 */
	HardwareComponentType createHardwareComponentType();

	/**
	 * Returns a new object of class '<em>Hardware Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Connector</em>'.
	 * @generated
	 */
	HardwareConnector createHardwareConnector();

	/**
	 * Returns a new object of class '<em>Hardware Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Port</em>'.
	 * @generated
	 */
	HardwarePort createHardwarePort();

	/**
	 * Returns a new object of class '<em>Hardware Port Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Port Connector</em>'.
	 * @generated
	 */
	HardwarePortConnector createHardwarePortConnector();

	/**
	 * Returns a new object of class '<em>IO Hardware Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IO Hardware Pin</em>'.
	 * @generated
	 */
	IOHardwarePin createIOHardwarePin();

	/**
	 * Returns a new object of class '<em>Logical Port Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Port Connector</em>'.
	 * @generated
	 */
	LogicalPortConnector createLogicalPortConnector();

	/**
	 * Returns a new object of class '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node</em>'.
	 * @generated
	 */
	Node createNode();

	/**
	 * Returns a new object of class '<em>Power Hardware Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Power Hardware Pin</em>'.
	 * @generated
	 */
	PowerHardwarePin createPowerHardwarePin();

	/**
	 * Returns a new object of class '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor</em>'.
	 * @generated
	 */
	Sensor createSensor();

	/**
	 * Returns a new object of class '<em>Hardware Connector port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Connector port</em>'.
	 * @generated
	 */
	HardwareConnector_port createHardwareConnector_port();

	/**
	 * Returns a new object of class '<em>Hardware Port Connector port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Port Connector port</em>'.
	 * @generated
	 */
	HardwarePortConnector_port createHardwarePortConnector_port();

	/**
	 * Returns a new object of class '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comment</em>'.
	 * @generated
	 */
	Comment createComment();

	/**
	 * Returns a new object of class '<em>EA Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EA Package</em>'.
	 * @generated
	 */
	EAPackage createEAPackage();

	/**
	 * Returns a new object of class '<em>EAXML</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EAXML</em>'.
	 * @generated
	 */
	EAXML createEAXML();

	/**
	 * Returns a new object of class '<em>Rationale</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rationale</em>'.
	 * @generated
	 */
	Rationale createRationale();

	/**
	 * Returns a new object of class '<em>Realization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Realization</em>'.
	 * @generated
	 */
	Realization createRealization();

	/**
	 * Returns a new object of class '<em>Realization realized</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Realization realized</em>'.
	 * @generated
	 */
	Realization_realized createRealization_realized();

	/**
	 * Returns a new object of class '<em>Realization realized By</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Realization realized By</em>'.
	 * @generated
	 */
	Realization_realizedBy createRealization_realizedBy();

	/**
	 * Returns a new object of class '<em>Array Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Datatype</em>'.
	 * @generated
	 */
	ArrayDatatype createArrayDatatype();

	/**
	 * Returns a new object of class '<em>Composite Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Datatype</em>'.
	 * @generated
	 */
	CompositeDatatype createCompositeDatatype();

	/**
	 * Returns a new object of class '<em>EA Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EA Boolean</em>'.
	 * @generated
	 */
	EABoolean createEABoolean();

	/**
	 * Returns a new object of class '<em>EA Datatype Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EA Datatype Prototype</em>'.
	 * @generated
	 */
	EADatatypePrototype createEADatatypePrototype();

	/**
	 * Returns a new object of class '<em>EA Numerical</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EA Numerical</em>'.
	 * @generated
	 */
	EANumerical createEANumerical();

	/**
	 * Returns a new object of class '<em>EA String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EA String</em>'.
	 * @generated
	 */
	EAString createEAString();

	/**
	 * Returns a new object of class '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration</em>'.
	 * @generated
	 */
	Enumeration createEnumeration();

	/**
	 * Returns a new object of class '<em>Enumeration Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration Literal</em>'.
	 * @generated
	 */
	EnumerationLiteral createEnumerationLiteral();

	/**
	 * Returns a new object of class '<em>Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quantity</em>'.
	 * @generated
	 */
	Quantity createQuantity();

	/**
	 * Returns a new object of class '<em>Rangeable Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rangeable Value Type</em>'.
	 * @generated
	 */
	RangeableValueType createRangeableValueType();

	/**
	 * Returns a new object of class '<em>Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit</em>'.
	 * @generated
	 */
	Unit createUnit();

	/**
	 * Returns a new object of class '<em>EA Array Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EA Array Value</em>'.
	 * @generated
	 */
	EAArrayValue createEAArrayValue();

	/**
	 * Returns a new object of class '<em>EA Boolean Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EA Boolean Value</em>'.
	 * @generated
	 */
	EABooleanValue createEABooleanValue();

	/**
	 * Returns a new object of class '<em>EA Composite Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EA Composite Value</em>'.
	 * @generated
	 */
	EACompositeValue createEACompositeValue();

	/**
	 * Returns a new object of class '<em>EA Enumeration Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EA Enumeration Value</em>'.
	 * @generated
	 */
	EAEnumerationValue createEAEnumerationValue();

	/**
	 * Returns a new object of class '<em>EA Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EA Expression</em>'.
	 * @generated
	 */
	EAExpression createEAExpression();

	/**
	 * Returns a new object of class '<em>EA Numerical Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EA Numerical Value</em>'.
	 * @generated
	 */
	EANumericalValue createEANumericalValue();

	/**
	 * Returns a new object of class '<em>EA String Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EA String Value</em>'.
	 * @generated
	 */
	EAStringValue createEAStringValue();

	/**
	 * Returns a new object of class '<em>User Attribute Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Attribute Definition</em>'.
	 * @generated
	 */
	UserAttributeDefinition createUserAttributeDefinition();

	/**
	 * Returns a new object of class '<em>User Attributed Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Attributed Element</em>'.
	 * @generated
	 */
	UserAttributedElement createUserAttributedElement();

	/**
	 * Returns a new object of class '<em>User Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Element Type</em>'.
	 * @generated
	 */
	UserElementType createUserElementType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Eastadl21Package getEastadl21Package();

} //Eastadl21Factory
