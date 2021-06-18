/**
 */
package eastadl22_alpha.util;

import eastadl22_alpha.*;

import org.eclipse.eatop.geastadl.ginfrastructure.gelements.GEAPackage;
import org.eclipse.eatop.geastadl.ginfrastructure.gelements.GEAPackageableElement;
import org.eclipse.eatop.geastadl.ginfrastructure.gelements.GEAXML;
import org.eclipse.eatop.geastadl.ginfrastructure.gelements.GIdentifiable;
import org.eclipse.eatop.geastadl.ginfrastructure.gelements.GReferrable;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eastadl22_alpha.Eastadl22_alphaPackage
 * @generated
 */
public class Eastadl22_alphaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Eastadl22_alphaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Eastadl22_alphaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Eastadl22_alphaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Eastadl22_alphaSwitch<Adapter> modelSwitch =
		new Eastadl22_alphaSwitch<Adapter>() {
			@Override
			public Adapter caseDesignLevel(DesignLevel object) {
				return createDesignLevelAdapter();
			}
			@Override
			public Adapter caseAllocateableElement(AllocateableElement object) {
				return createAllocateableElementAdapter();
			}
			@Override
			public Adapter caseAllocation(Allocation object) {
				return createAllocationAdapter();
			}
			@Override
			public Adapter caseAnalysisFunctionPrototype(AnalysisFunctionPrototype object) {
				return createAnalysisFunctionPrototypeAdapter();
			}
			@Override
			public Adapter caseAnalysisFunctionType(AnalysisFunctionType object) {
				return createAnalysisFunctionTypeAdapter();
			}
			@Override
			public Adapter caseBasicSoftwareFunctionType(BasicSoftwareFunctionType object) {
				return createBasicSoftwareFunctionTypeAdapter();
			}
			@Override
			public Adapter caseDesignFunctionPrototype(DesignFunctionPrototype object) {
				return createDesignFunctionPrototypeAdapter();
			}
			@Override
			public Adapter caseDesignFunctionType(DesignFunctionType object) {
				return createDesignFunctionTypeAdapter();
			}
			@Override
			public Adapter caseFunctionalDevice(FunctionalDevice object) {
				return createFunctionalDeviceAdapter();
			}
			@Override
			public Adapter caseFunctionAllocation(FunctionAllocation object) {
				return createFunctionAllocationAdapter();
			}
			@Override
			public Adapter caseFunctionClientServerInterface(FunctionClientServerInterface object) {
				return createFunctionClientServerInterfaceAdapter();
			}
			@Override
			public Adapter caseFunctionClientServerPort(FunctionClientServerPort object) {
				return createFunctionClientServerPortAdapter();
			}
			@Override
			public Adapter caseFunctionConnector(FunctionConnector object) {
				return createFunctionConnectorAdapter();
			}
			@Override
			public Adapter caseFunctionFlowPort(FunctionFlowPort object) {
				return createFunctionFlowPortAdapter();
			}
			@Override
			public Adapter caseFunctionPort(FunctionPort object) {
				return createFunctionPortAdapter();
			}
			@Override
			public Adapter caseFunctionPowerPort(FunctionPowerPort object) {
				return createFunctionPowerPortAdapter();
			}
			@Override
			public Adapter caseFunctionPrototype(FunctionPrototype object) {
				return createFunctionPrototypeAdapter();
			}
			@Override
			public Adapter caseFunctionType(FunctionType object) {
				return createFunctionTypeAdapter();
			}
			@Override
			public Adapter caseHardwareFunctionType(HardwareFunctionType object) {
				return createHardwareFunctionTypeAdapter();
			}
			@Override
			public Adapter caseLocalDeviceManager(LocalDeviceManager object) {
				return createLocalDeviceManagerAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter casePortGroup(PortGroup object) {
				return createPortGroupAdapter();
			}
			@Override
			public Adapter caseFunctionAllocation_allocatedElement(FunctionAllocation_allocatedElement object) {
				return createFunctionAllocation_allocatedElementAdapter();
			}
			@Override
			public Adapter caseFunctionAllocation_target(FunctionAllocation_target object) {
				return createFunctionAllocation_targetAdapter();
			}
			@Override
			public Adapter caseFunctionConnector_port(FunctionConnector_port object) {
				return createFunctionConnector_portAdapter();
			}
			@Override
			public Adapter caseActuator(Actuator object) {
				return createActuatorAdapter();
			}
			@Override
			public Adapter caseCommunicationHardwarePin(CommunicationHardwarePin object) {
				return createCommunicationHardwarePinAdapter();
			}
			@Override
			public Adapter caseElectricalComponent(ElectricalComponent object) {
				return createElectricalComponentAdapter();
			}
			@Override
			public Adapter caseHardwareComponentPrototype(HardwareComponentPrototype object) {
				return createHardwareComponentPrototypeAdapter();
			}
			@Override
			public Adapter caseHardwareComponentType(HardwareComponentType object) {
				return createHardwareComponentTypeAdapter();
			}
			@Override
			public Adapter caseHardwareConnector(HardwareConnector object) {
				return createHardwareConnectorAdapter();
			}
			@Override
			public Adapter caseHardwarePin(HardwarePin object) {
				return createHardwarePinAdapter();
			}
			@Override
			public Adapter caseHardwarePort(HardwarePort object) {
				return createHardwarePortAdapter();
			}
			@Override
			public Adapter caseHardwarePortConnector(HardwarePortConnector object) {
				return createHardwarePortConnectorAdapter();
			}
			@Override
			public Adapter caseIOHardwarePin(IOHardwarePin object) {
				return createIOHardwarePinAdapter();
			}
			@Override
			public Adapter caseLogicalPortConnector(LogicalPortConnector object) {
				return createLogicalPortConnectorAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter casePortConnector(PortConnector object) {
				return createPortConnectorAdapter();
			}
			@Override
			public Adapter casePowerHardwarePin(PowerHardwarePin object) {
				return createPowerHardwarePinAdapter();
			}
			@Override
			public Adapter caseSensor(Sensor object) {
				return createSensorAdapter();
			}
			@Override
			public Adapter caseAllocationTarget(AllocationTarget object) {
				return createAllocationTargetAdapter();
			}
			@Override
			public Adapter caseHardwareConnector_port(HardwareConnector_port object) {
				return createHardwareConnector_portAdapter();
			}
			@Override
			public Adapter caseHardwarePortConnector_port(HardwarePortConnector_port object) {
				return createHardwarePortConnector_portAdapter();
			}
			@Override
			public Adapter caseComment(Comment object) {
				return createCommentAdapter();
			}
			@Override
			public Adapter caseContext(Context object) {
				return createContextAdapter();
			}
			@Override
			public Adapter caseEAConnector(EAConnector object) {
				return createEAConnectorAdapter();
			}
			@Override
			public Adapter caseEAElement(EAElement object) {
				return createEAElementAdapter();
			}
			@Override
			public Adapter caseEAPackage(EAPackage object) {
				return createEAPackageAdapter();
			}
			@Override
			public Adapter caseEAPackageableElement(EAPackageableElement object) {
				return createEAPackageableElementAdapter();
			}
			@Override
			public Adapter caseEAPort(EAPort object) {
				return createEAPortAdapter();
			}
			@Override
			public Adapter caseEAPrototype(EAPrototype object) {
				return createEAPrototypeAdapter();
			}
			@Override
			public Adapter caseEAType(EAType object) {
				return createEATypeAdapter();
			}
			@Override
			public Adapter caseEAXML(EAXML object) {
				return createEAXMLAdapter();
			}
			@Override
			public Adapter caseRationale(Rationale object) {
				return createRationaleAdapter();
			}
			@Override
			public Adapter caseRealization(Realization object) {
				return createRealizationAdapter();
			}
			@Override
			public Adapter caseReferrable(Referrable object) {
				return createReferrableAdapter();
			}
			@Override
			public Adapter caseRelationship(Relationship object) {
				return createRelationshipAdapter();
			}
			@Override
			public Adapter caseTraceableSpecification(TraceableSpecification object) {
				return createTraceableSpecificationAdapter();
			}
			@Override
			public Adapter caseIdentifiable(Identifiable object) {
				return createIdentifiableAdapter();
			}
			@Override
			public Adapter caseRealization_realized(Realization_realized object) {
				return createRealization_realizedAdapter();
			}
			@Override
			public Adapter caseRealization_realizedBy(Realization_realizedBy object) {
				return createRealization_realizedByAdapter();
			}
			@Override
			public Adapter caseArrayDatatype(ArrayDatatype object) {
				return createArrayDatatypeAdapter();
			}
			@Override
			public Adapter caseCompositeDatatype(CompositeDatatype object) {
				return createCompositeDatatypeAdapter();
			}
			@Override
			public Adapter caseEABoolean(EABoolean object) {
				return createEABooleanAdapter();
			}
			@Override
			public Adapter caseEADatatype(EADatatype object) {
				return createEADatatypeAdapter();
			}
			@Override
			public Adapter caseEADatatypePrototype(EADatatypePrototype object) {
				return createEADatatypePrototypeAdapter();
			}
			@Override
			public Adapter caseEANumerical(EANumerical object) {
				return createEANumericalAdapter();
			}
			@Override
			public Adapter caseEAString(EAString object) {
				return createEAStringAdapter();
			}
			@Override
			public Adapter caseEnumeration(Enumeration object) {
				return createEnumerationAdapter();
			}
			@Override
			public Adapter caseEnumerationLiteral(EnumerationLiteral object) {
				return createEnumerationLiteralAdapter();
			}
			@Override
			public Adapter caseQuantity(Quantity object) {
				return createQuantityAdapter();
			}
			@Override
			public Adapter caseRangeableValueType(RangeableValueType object) {
				return createRangeableValueTypeAdapter();
			}
			@Override
			public Adapter caseUnit(Unit object) {
				return createUnitAdapter();
			}
			@Override
			public Adapter caseEAArrayValue(EAArrayValue object) {
				return createEAArrayValueAdapter();
			}
			@Override
			public Adapter caseEABooleanValue(EABooleanValue object) {
				return createEABooleanValueAdapter();
			}
			@Override
			public Adapter caseEACompositeValue(EACompositeValue object) {
				return createEACompositeValueAdapter();
			}
			@Override
			public Adapter caseEAEnumerationValue(EAEnumerationValue object) {
				return createEAEnumerationValueAdapter();
			}
			@Override
			public Adapter caseEAExpression(EAExpression object) {
				return createEAExpressionAdapter();
			}
			@Override
			public Adapter caseEANumericalValue(EANumericalValue object) {
				return createEANumericalValueAdapter();
			}
			@Override
			public Adapter caseEAStringValue(EAStringValue object) {
				return createEAStringValueAdapter();
			}
			@Override
			public Adapter caseEAValue(EAValue object) {
				return createEAValueAdapter();
			}
			@Override
			public Adapter caseUserAttributeDefinition(UserAttributeDefinition object) {
				return createUserAttributeDefinitionAdapter();
			}
			@Override
			public Adapter caseUserAttributedElement(UserAttributedElement object) {
				return createUserAttributedElementAdapter();
			}
			@Override
			public Adapter caseUserElementType(UserElementType object) {
				return createUserElementTypeAdapter();
			}
			@Override
			public Adapter caseGReferrable(GReferrable object) {
				return createGReferrableAdapter();
			}
			@Override
			public Adapter caseGIdentifiable(GIdentifiable object) {
				return createGIdentifiableAdapter();
			}
			@Override
			public Adapter caseGEAPackageableElement(GEAPackageableElement object) {
				return createGEAPackageableElementAdapter();
			}
			@Override
			public Adapter caseGEAPackage(GEAPackage object) {
				return createGEAPackageAdapter();
			}
			@Override
			public Adapter caseGEAXML(GEAXML object) {
				return createGEAXMLAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.DesignLevel <em>Design Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.DesignLevel
	 * @generated
	 */
	public Adapter createDesignLevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.AllocateableElement <em>Allocateable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.AllocateableElement
	 * @generated
	 */
	public Adapter createAllocateableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.Allocation <em>Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.Allocation
	 * @generated
	 */
	public Adapter createAllocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.AnalysisFunctionPrototype <em>Analysis Function Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.AnalysisFunctionPrototype
	 * @generated
	 */
	public Adapter createAnalysisFunctionPrototypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.AnalysisFunctionType <em>Analysis Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.AnalysisFunctionType
	 * @generated
	 */
	public Adapter createAnalysisFunctionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.BasicSoftwareFunctionType <em>Basic Software Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.BasicSoftwareFunctionType
	 * @generated
	 */
	public Adapter createBasicSoftwareFunctionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.DesignFunctionPrototype <em>Design Function Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.DesignFunctionPrototype
	 * @generated
	 */
	public Adapter createDesignFunctionPrototypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.DesignFunctionType <em>Design Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.DesignFunctionType
	 * @generated
	 */
	public Adapter createDesignFunctionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.FunctionalDevice <em>Functional Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.FunctionalDevice
	 * @generated
	 */
	public Adapter createFunctionalDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.FunctionAllocation <em>Function Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.FunctionAllocation
	 * @generated
	 */
	public Adapter createFunctionAllocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.FunctionClientServerInterface <em>Function Client Server Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.FunctionClientServerInterface
	 * @generated
	 */
	public Adapter createFunctionClientServerInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.FunctionClientServerPort <em>Function Client Server Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.FunctionClientServerPort
	 * @generated
	 */
	public Adapter createFunctionClientServerPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.FunctionConnector <em>Function Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.FunctionConnector
	 * @generated
	 */
	public Adapter createFunctionConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.FunctionFlowPort <em>Function Flow Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.FunctionFlowPort
	 * @generated
	 */
	public Adapter createFunctionFlowPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.FunctionPort <em>Function Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.FunctionPort
	 * @generated
	 */
	public Adapter createFunctionPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.FunctionPowerPort <em>Function Power Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.FunctionPowerPort
	 * @generated
	 */
	public Adapter createFunctionPowerPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.FunctionPrototype <em>Function Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.FunctionPrototype
	 * @generated
	 */
	public Adapter createFunctionPrototypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.FunctionType <em>Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.FunctionType
	 * @generated
	 */
	public Adapter createFunctionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.HardwareFunctionType <em>Hardware Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.HardwareFunctionType
	 * @generated
	 */
	public Adapter createHardwareFunctionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.LocalDeviceManager <em>Local Device Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.LocalDeviceManager
	 * @generated
	 */
	public Adapter createLocalDeviceManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.PortGroup <em>Port Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.PortGroup
	 * @generated
	 */
	public Adapter createPortGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.FunctionAllocation_allocatedElement <em>Function Allocation allocated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.FunctionAllocation_allocatedElement
	 * @generated
	 */
	public Adapter createFunctionAllocation_allocatedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.FunctionAllocation_target <em>Function Allocation target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.FunctionAllocation_target
	 * @generated
	 */
	public Adapter createFunctionAllocation_targetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.FunctionConnector_port <em>Function Connector port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.FunctionConnector_port
	 * @generated
	 */
	public Adapter createFunctionConnector_portAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.Actuator
	 * @generated
	 */
	public Adapter createActuatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.CommunicationHardwarePin <em>Communication Hardware Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.CommunicationHardwarePin
	 * @generated
	 */
	public Adapter createCommunicationHardwarePinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.ElectricalComponent <em>Electrical Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.ElectricalComponent
	 * @generated
	 */
	public Adapter createElectricalComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.HardwareComponentPrototype <em>Hardware Component Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.HardwareComponentPrototype
	 * @generated
	 */
	public Adapter createHardwareComponentPrototypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.HardwareComponentType <em>Hardware Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.HardwareComponentType
	 * @generated
	 */
	public Adapter createHardwareComponentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.HardwareConnector <em>Hardware Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.HardwareConnector
	 * @generated
	 */
	public Adapter createHardwareConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.HardwarePin <em>Hardware Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.HardwarePin
	 * @generated
	 */
	public Adapter createHardwarePinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.HardwarePort <em>Hardware Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.HardwarePort
	 * @generated
	 */
	public Adapter createHardwarePortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.HardwarePortConnector <em>Hardware Port Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.HardwarePortConnector
	 * @generated
	 */
	public Adapter createHardwarePortConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.IOHardwarePin <em>IO Hardware Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.IOHardwarePin
	 * @generated
	 */
	public Adapter createIOHardwarePinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.LogicalPortConnector <em>Logical Port Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.LogicalPortConnector
	 * @generated
	 */
	public Adapter createLogicalPortConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.PortConnector <em>Port Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.PortConnector
	 * @generated
	 */
	public Adapter createPortConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.PowerHardwarePin <em>Power Hardware Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.PowerHardwarePin
	 * @generated
	 */
	public Adapter createPowerHardwarePinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.Sensor
	 * @generated
	 */
	public Adapter createSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.AllocationTarget <em>Allocation Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.AllocationTarget
	 * @generated
	 */
	public Adapter createAllocationTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.HardwareConnector_port <em>Hardware Connector port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.HardwareConnector_port
	 * @generated
	 */
	public Adapter createHardwareConnector_portAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.HardwarePortConnector_port <em>Hardware Port Connector port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.HardwarePortConnector_port
	 * @generated
	 */
	public Adapter createHardwarePortConnector_portAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.Comment
	 * @generated
	 */
	public Adapter createCommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.Context
	 * @generated
	 */
	public Adapter createContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.EAConnector <em>EA Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.EAConnector
	 * @generated
	 */
	public Adapter createEAConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.EAElement <em>EA Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.EAElement
	 * @generated
	 */
	public Adapter createEAElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.EAPackage <em>EA Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.EAPackage
	 * @generated
	 */
	public Adapter createEAPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.EAPackageableElement <em>EA Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.EAPackageableElement
	 * @generated
	 */
	public Adapter createEAPackageableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.EAPort <em>EA Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.EAPort
	 * @generated
	 */
	public Adapter createEAPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.EAPrototype <em>EA Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.EAPrototype
	 * @generated
	 */
	public Adapter createEAPrototypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.EAType <em>EA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.EAType
	 * @generated
	 */
	public Adapter createEATypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.EAXML <em>EAXML</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.EAXML
	 * @generated
	 */
	public Adapter createEAXMLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.Rationale <em>Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.Rationale
	 * @generated
	 */
	public Adapter createRationaleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.Realization <em>Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.Realization
	 * @generated
	 */
	public Adapter createRealizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.Referrable <em>Referrable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.Referrable
	 * @generated
	 */
	public Adapter createReferrableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.Relationship
	 * @generated
	 */
	public Adapter createRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.TraceableSpecification <em>Traceable Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.TraceableSpecification
	 * @generated
	 */
	public Adapter createTraceableSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.Identifiable
	 * @generated
	 */
	public Adapter createIdentifiableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.Realization_realized <em>Realization realized</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.Realization_realized
	 * @generated
	 */
	public Adapter createRealization_realizedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.Realization_realizedBy <em>Realization realized By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.Realization_realizedBy
	 * @generated
	 */
	public Adapter createRealization_realizedByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.ArrayDatatype <em>Array Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.ArrayDatatype
	 * @generated
	 */
	public Adapter createArrayDatatypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.CompositeDatatype <em>Composite Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.CompositeDatatype
	 * @generated
	 */
	public Adapter createCompositeDatatypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.EABoolean <em>EA Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.EABoolean
	 * @generated
	 */
	public Adapter createEABooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.EADatatype <em>EA Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.EADatatype
	 * @generated
	 */
	public Adapter createEADatatypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.EADatatypePrototype <em>EA Datatype Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.EADatatypePrototype
	 * @generated
	 */
	public Adapter createEADatatypePrototypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.EANumerical <em>EA Numerical</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.EANumerical
	 * @generated
	 */
	public Adapter createEANumericalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.EAString <em>EA String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.EAString
	 * @generated
	 */
	public Adapter createEAStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.Enumeration
	 * @generated
	 */
	public Adapter createEnumerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.EnumerationLiteral <em>Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.EnumerationLiteral
	 * @generated
	 */
	public Adapter createEnumerationLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.Quantity
	 * @generated
	 */
	public Adapter createQuantityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.RangeableValueType <em>Rangeable Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.RangeableValueType
	 * @generated
	 */
	public Adapter createRangeableValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.Unit
	 * @generated
	 */
	public Adapter createUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.EAArrayValue <em>EA Array Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.EAArrayValue
	 * @generated
	 */
	public Adapter createEAArrayValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.EABooleanValue <em>EA Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.EABooleanValue
	 * @generated
	 */
	public Adapter createEABooleanValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.EACompositeValue <em>EA Composite Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.EACompositeValue
	 * @generated
	 */
	public Adapter createEACompositeValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.EAEnumerationValue <em>EA Enumeration Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.EAEnumerationValue
	 * @generated
	 */
	public Adapter createEAEnumerationValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.EAExpression <em>EA Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.EAExpression
	 * @generated
	 */
	public Adapter createEAExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.EANumericalValue <em>EA Numerical Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.EANumericalValue
	 * @generated
	 */
	public Adapter createEANumericalValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.EAStringValue <em>EA String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.EAStringValue
	 * @generated
	 */
	public Adapter createEAStringValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.EAValue <em>EA Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.EAValue
	 * @generated
	 */
	public Adapter createEAValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.UserAttributeDefinition <em>User Attribute Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.UserAttributeDefinition
	 * @generated
	 */
	public Adapter createUserAttributeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.UserAttributedElement <em>User Attributed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.UserAttributedElement
	 * @generated
	 */
	public Adapter createUserAttributedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eastadl22_alpha.UserElementType <em>User Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eastadl22_alpha.UserElementType
	 * @generated
	 */
	public Adapter createUserElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eatop.geastadl.ginfrastructure.gelements.GReferrable <em>GReferrable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eatop.geastadl.ginfrastructure.gelements.GReferrable
	 * @generated
	 */
	public Adapter createGReferrableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eatop.geastadl.ginfrastructure.gelements.GIdentifiable <em>GIdentifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eatop.geastadl.ginfrastructure.gelements.GIdentifiable
	 * @generated
	 */
	public Adapter createGIdentifiableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eatop.geastadl.ginfrastructure.gelements.GEAPackageableElement <em>GEA Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eatop.geastadl.ginfrastructure.gelements.GEAPackageableElement
	 * @generated
	 */
	public Adapter createGEAPackageableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eatop.geastadl.ginfrastructure.gelements.GEAPackage <em>GEA Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eatop.geastadl.ginfrastructure.gelements.GEAPackage
	 * @generated
	 */
	public Adapter createGEAPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.eatop.geastadl.ginfrastructure.gelements.GEAXML <em>GEAXML</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.eatop.geastadl.ginfrastructure.gelements.GEAXML
	 * @generated
	 */
	public Adapter createGEAXMLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Eastadl22_alphaAdapterFactory
