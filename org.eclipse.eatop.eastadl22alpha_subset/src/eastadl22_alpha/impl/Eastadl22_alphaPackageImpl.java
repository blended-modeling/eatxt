/**
 */
package eastadl22_alpha.impl;

import eastadl22_alpha.Actuator;
import eastadl22_alpha.AllocateableElement;
import eastadl22_alpha.Allocation;
import eastadl22_alpha.AllocationTarget;
import eastadl22_alpha.AnalysisFunctionPrototype;
import eastadl22_alpha.AnalysisFunctionType;
import eastadl22_alpha.ArrayDatatype;
import eastadl22_alpha.BasicSoftwareFunctionType;
import eastadl22_alpha.ClientServerKind;
import eastadl22_alpha.Comment;
import eastadl22_alpha.CommunicationHardwarePin;
import eastadl22_alpha.CompositeDatatype;
import eastadl22_alpha.Context;
import eastadl22_alpha.DesignFunctionPrototype;
import eastadl22_alpha.DesignFunctionType;
import eastadl22_alpha.DesignLevel;
import eastadl22_alpha.EAArrayValue;
import eastadl22_alpha.EABoolean;
import eastadl22_alpha.EABooleanValue;
import eastadl22_alpha.EACompositeValue;
import eastadl22_alpha.EAConnector;
import eastadl22_alpha.EADatatype;
import eastadl22_alpha.EADatatypePrototype;
import eastadl22_alpha.EADirectionKind;
import eastadl22_alpha.EAElement;
import eastadl22_alpha.EAEnumerationValue;
import eastadl22_alpha.EAExpression;
import eastadl22_alpha.EANumerical;
import eastadl22_alpha.EANumericalValue;
import eastadl22_alpha.EAPackage;
import eastadl22_alpha.EAPackageableElement;
import eastadl22_alpha.EAPort;
import eastadl22_alpha.EAPrototype;
import eastadl22_alpha.EAString;
import eastadl22_alpha.EAStringValue;
import eastadl22_alpha.EAType;
import eastadl22_alpha.EAValue;
import eastadl22_alpha.Eastadl22_alphaFactory;
import eastadl22_alpha.Eastadl22_alphaPackage;
import eastadl22_alpha.ElectricalComponent;
import eastadl22_alpha.Enumeration;
import eastadl22_alpha.EnumerationLiteral;
import eastadl22_alpha.FunctionAllocation;
import eastadl22_alpha.FunctionAllocation_allocatedElement;
import eastadl22_alpha.FunctionAllocation_target;
import eastadl22_alpha.FunctionClientServerInterface;
import eastadl22_alpha.FunctionClientServerPort;
import eastadl22_alpha.FunctionConnector;
import eastadl22_alpha.FunctionConnector_port;
import eastadl22_alpha.FunctionFlowPort;
import eastadl22_alpha.FunctionPort;
import eastadl22_alpha.FunctionPowerPort;
import eastadl22_alpha.FunctionPrototype;
import eastadl22_alpha.FunctionType;
import eastadl22_alpha.FunctionalDevice;
import eastadl22_alpha.HardwareBusKind;
import eastadl22_alpha.HardwareComponentPrototype;
import eastadl22_alpha.HardwareComponentType;
import eastadl22_alpha.HardwareConnector;
import eastadl22_alpha.HardwareConnector_port;
import eastadl22_alpha.HardwareFunctionType;
import eastadl22_alpha.HardwarePin;
import eastadl22_alpha.HardwarePort;
import eastadl22_alpha.HardwarePortConnector;
import eastadl22_alpha.HardwarePortConnector_port;
import eastadl22_alpha.IOHardwarePin;
import eastadl22_alpha.IOHardwarePinKind;
import eastadl22_alpha.Identifiable;
import eastadl22_alpha.LocalDeviceManager;
import eastadl22_alpha.LogicalPortConnector;
import eastadl22_alpha.Node;
import eastadl22_alpha.Operation;
import eastadl22_alpha.PortConnector;
import eastadl22_alpha.PortGroup;
import eastadl22_alpha.PowerHardwarePin;
import eastadl22_alpha.Quantity;
import eastadl22_alpha.RangeableValueType;
import eastadl22_alpha.Rationale;
import eastadl22_alpha.Realization;
import eastadl22_alpha.Realization_realized;
import eastadl22_alpha.Realization_realizedBy;
import eastadl22_alpha.Referrable;
import eastadl22_alpha.Relationship;
import eastadl22_alpha.Sensor;
import eastadl22_alpha.TraceableSpecification;
import eastadl22_alpha.Unit;
import eastadl22_alpha.UserAttributeDefinition;
import eastadl22_alpha.UserAttributedElement;
import eastadl22_alpha.UserElementType;

import eastadl22_alpha.util.Eastadl22_alphaValidator;

import org.eclipse.eatop.geastadl.ginfrastructure.gelements.GelementsPackage;

import org.eclipse.eatop.geastadl.ginfrastructure.gprimitivetypes.GprimitivetypesPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Eastadl22_alphaPackageImpl extends EPackageImpl implements Eastadl22_alphaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass designLevelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocateableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analysisFunctionPrototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analysisFunctionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicSoftwareFunctionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass designFunctionPrototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass designFunctionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionAllocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionClientServerInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionClientServerPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionFlowPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionPowerPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionPrototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareFunctionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localDeviceManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionAllocation_allocatedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionAllocation_targetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionConnector_portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actuatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationHardwarePinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass electricalComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareComponentPrototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareComponentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwarePinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwarePortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwarePortConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioHardwarePinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalPortConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerHardwarePinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocationTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareConnector_portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwarePortConnector_portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaPackageableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaPrototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaxmlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rationaleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referrableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceableSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realization_realizedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realization_realizedByEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayDatatypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeDatatypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaDatatypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaDatatypePrototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaNumericalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeableValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaArrayValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaBooleanValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaCompositeValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaEnumerationValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaNumericalValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaStringValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userAttributeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userAttributedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userElementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum clientServerKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eaDirectionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hardwareBusKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ioHardwarePinKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType floatEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType identifierEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType integerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType numericalEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType refEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Eastadl22_alphaPackageImpl() {
		super(eNS_URI, Eastadl22_alphaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Eastadl22_alphaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Eastadl22_alphaPackage init() {
		if (isInited) return (Eastadl22_alphaPackage)EPackage.Registry.INSTANCE.getEPackage(Eastadl22_alphaPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEastadl22_alphaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Eastadl22_alphaPackageImpl theEastadl22_alphaPackage = registeredEastadl22_alphaPackage instanceof Eastadl22_alphaPackageImpl ? (Eastadl22_alphaPackageImpl)registeredEastadl22_alphaPackage : new Eastadl22_alphaPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		GelementsPackage.eINSTANCE.eClass();
		GprimitivetypesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEastadl22_alphaPackage.createPackageContents();

		// Initialize created meta-data
		theEastadl22_alphaPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theEastadl22_alphaPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return Eastadl22_alphaValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theEastadl22_alphaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Eastadl22_alphaPackage.eNS_URI, theEastadl22_alphaPackage);
		return theEastadl22_alphaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDesignLevel() {
		return designLevelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesignLevel_Allocation() {
		return (EReference)designLevelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesignLevel_FunctionalDesignArchitecture() {
		return (EReference)designLevelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesignLevel_HardwareDesignArchitecture() {
		return (EReference)designLevelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllocateableElement() {
		return allocateableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllocation() {
		return allocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocation_FunctionAllocation() {
		return (EReference)allocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalysisFunctionPrototype() {
		return analysisFunctionPrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisFunctionPrototype_Type() {
		return (EReference)analysisFunctionPrototypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalysisFunctionType() {
		return analysisFunctionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisFunctionType_Part() {
		return (EReference)analysisFunctionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicSoftwareFunctionType() {
		return basicSoftwareFunctionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDesignFunctionPrototype() {
		return designFunctionPrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesignFunctionPrototype_Type() {
		return (EReference)designFunctionPrototypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDesignFunctionType() {
		return designFunctionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesignFunctionType_Part() {
		return (EReference)designFunctionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalDevice() {
		return functionalDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionAllocation() {
		return functionAllocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionAllocation_AllocatedElement() {
		return (EReference)functionAllocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionAllocation_Target() {
		return (EReference)functionAllocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionClientServerInterface() {
		return functionClientServerInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionClientServerInterface_Operation() {
		return (EReference)functionClientServerInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionClientServerPort() {
		return functionClientServerPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionClientServerPort_Kind() {
		return (EAttribute)functionClientServerPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionClientServerPort_Type() {
		return (EReference)functionClientServerPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionConnector() {
		return functionConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionConnector_Port() {
		return (EReference)functionConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionFlowPort() {
		return functionFlowPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionFlowPort_Direction() {
		return (EAttribute)functionFlowPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionFlowPort_Type() {
		return (EReference)functionFlowPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionFlowPort_DefaultValue() {
		return (EReference)functionFlowPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionPort() {
		return functionPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionPowerPort() {
		return functionPowerPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionPowerPort_Type() {
		return (EReference)functionPowerPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionPrototype() {
		return functionPrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionType() {
		return functionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionType_IsElementary() {
		return (EAttribute)functionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionType_PortGroup() {
		return (EReference)functionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionType_Connector() {
		return (EReference)functionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionType_Port() {
		return (EReference)functionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareFunctionType() {
		return hardwareFunctionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareFunctionType_HardwareComponent() {
		return (EReference)hardwareFunctionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalDeviceManager() {
		return localDeviceManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Return() {
		return (EReference)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Argument() {
		return (EReference)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortGroup() {
		return portGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortGroup_PortGroup() {
		return (EReference)portGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortGroup_Port() {
		return (EReference)portGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionAllocation_allocatedElement() {
		return functionAllocation_allocatedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionAllocation_allocatedElement_AllocateableElement_context() {
		return (EReference)functionAllocation_allocatedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionAllocation_allocatedElement_AllocateableElement() {
		return (EReference)functionAllocation_allocatedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionAllocation_target() {
		return functionAllocation_targetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionAllocation_target_AllocationTarget_context() {
		return (EReference)functionAllocation_targetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionAllocation_target_AllocationTarget() {
		return (EReference)functionAllocation_targetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionConnector_port() {
		return functionConnector_portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionConnector_port_FunctionPrototype() {
		return (EReference)functionConnector_portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionConnector_port_FunctionPort() {
		return (EReference)functionConnector_portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActuator() {
		return actuatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationHardwarePin() {
		return communicationHardwarePinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElectricalComponent() {
		return electricalComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricalComponent_IsActive() {
		return (EAttribute)electricalComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareComponentPrototype() {
		return hardwareComponentPrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareComponentPrototype_Type() {
		return (EReference)hardwareComponentPrototypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareComponentType() {
		return hardwareComponentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareComponentType_Pin() {
		return (EReference)hardwareComponentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareComponentType_Part() {
		return (EReference)hardwareComponentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareComponentType_Connector() {
		return (EReference)hardwareComponentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareComponentType_Port() {
		return (EReference)hardwareComponentTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareComponentType_PortConnector() {
		return (EReference)hardwareComponentTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareConnector() {
		return hardwareConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareConnector_Port() {
		return (EReference)hardwareConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwarePin() {
		return hardwarePinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwarePin_Direction() {
		return (EAttribute)hardwarePinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwarePin_IsGround() {
		return (EAttribute)hardwarePinEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwarePort() {
		return hardwarePortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHardwarePort_IsShield() {
		return (EAttribute)hardwarePortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwarePort_ContainedPin() {
		return (EReference)hardwarePortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwarePort_ContainedPort() {
		return (EReference)hardwarePortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwarePort_ReferencedPin() {
		return (EReference)hardwarePortEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwarePortConnector() {
		return hardwarePortConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwarePortConnector_Connector() {
		return (EReference)hardwarePortConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIOHardwarePin() {
		return ioHardwarePinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIOHardwarePin_Kind() {
		return (EAttribute)ioHardwarePinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalPortConnector() {
		return logicalPortConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalPortConnector_Kind() {
		return (EAttribute)logicalPortConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalPortConnector_BusSpeed() {
		return (EAttribute)logicalPortConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_ExecutionRate() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortConnector() {
		return portConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortConnector_Port() {
		return (EReference)portConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerHardwarePin() {
		return powerHardwarePinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensor() {
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllocationTarget() {
		return allocationTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwareConnector_port() {
		return hardwareConnector_portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareConnector_port_HardwarePin() {
		return (EReference)hardwareConnector_portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwareConnector_port_HardwareComponentPrototype() {
		return (EReference)hardwareConnector_portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardwarePortConnector_port() {
		return hardwarePortConnector_portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwarePortConnector_port_HardwarePort() {
		return (EReference)hardwarePortConnector_portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardwarePortConnector_port_HardwareComponentPrototype() {
		return (EReference)hardwarePortConnector_portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComment() {
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_Body() {
		return (EAttribute)commentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContext() {
		return contextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContext_TraceableSpecification() {
		return (EReference)contextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContext_OwnedRelationship() {
		return (EReference)contextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAConnector() {
		return eaConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAElement() {
		return eaElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAElement_Name() {
		return (EAttribute)eaElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAElement_OwnedComment() {
		return (EReference)eaElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAPackage() {
		return eaPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAPackage_SubPackage() {
		return (EReference)eaPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAPackage_Element() {
		return (EReference)eaPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAPackageableElement() {
		return eaPackageableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAPackageableElement_EAPackage_element() {
		return (EReference)eaPackageableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAPort() {
		return eaPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAPrototype() {
		return eaPrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAType() {
		return eaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAXML() {
		return eaxmlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAXML_TopLevelPackage() {
		return (EReference)eaxmlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRationale() {
		return rationaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealization() {
		return realizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealization_Realized() {
		return (EReference)realizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealization_RealizedBy() {
		return (EReference)realizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferrable() {
		return referrableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferrable_ShortName() {
		return (EAttribute)referrableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationship() {
		return relationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTraceableSpecification() {
		return traceableSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraceableSpecification_Text() {
		return (EAttribute)traceableSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraceableSpecification_Uri() {
		return (EAttribute)traceableSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifiable() {
		return identifiableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiable_Category() {
		return (EAttribute)identifiableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiable_Uuid() {
		return (EAttribute)identifiableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealization_realized() {
		return realization_realizedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealization_realized_Identifiable_target() {
		return (EReference)realization_realizedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealization_realized_Identifiable_context() {
		return (EReference)realization_realizedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealization_realizedBy() {
		return realization_realizedByEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealization_realizedBy_Identifiable_target() {
		return (EReference)realization_realizedByEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealization_realizedBy_Identifiable_context() {
		return (EReference)realization_realizedByEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayDatatype() {
		return arrayDatatypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayDatatype_MaxLength() {
		return (EAttribute)arrayDatatypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayDatatype_MinLength() {
		return (EAttribute)arrayDatatypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayDatatype_ElementType() {
		return (EReference)arrayDatatypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeDatatype() {
		return compositeDatatypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeDatatype_DatatypePrototype() {
		return (EReference)compositeDatatypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEABoolean() {
		return eaBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEADatatype() {
		return eaDatatypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEADatatypePrototype() {
		return eaDatatypePrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEADatatypePrototype_Type() {
		return (EReference)eaDatatypePrototypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEANumerical() {
		return eaNumericalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEANumerical_Max() {
		return (EAttribute)eaNumericalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEANumerical_Min() {
		return (EAttribute)eaNumericalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEANumerical_Unit() {
		return (EReference)eaNumericalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAString() {
		return eaStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumeration() {
		return enumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumeration_IsMultiValued() {
		return (EAttribute)enumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeration_Literal() {
		return (EReference)enumerationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationLiteral() {
		return enumerationLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantity() {
		return quantityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantity_AmountOfSubstanceExp() {
		return (EAttribute)quantityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantity_ElectricCurrentExp() {
		return (EAttribute)quantityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantity_LengthExp() {
		return (EAttribute)quantityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantity_LuminousIntensityExp() {
		return (EAttribute)quantityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantity_MassExp() {
		return (EAttribute)quantityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantity_ThermodynamicTemperatureExp() {
		return (EAttribute)quantityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantity_TimeExp() {
		return (EAttribute)quantityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRangeableValueType() {
		return rangeableValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRangeableValueType_Accuracy() {
		return (EAttribute)rangeableValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRangeableValueType_Resolution() {
		return (EAttribute)rangeableValueTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRangeableValueType_SignificantDigits() {
		return (EAttribute)rangeableValueTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRangeableValueType_BaseRangeable() {
		return (EReference)rangeableValueTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnit() {
		return unitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnit_Factor() {
		return (EAttribute)unitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnit_Symbol() {
		return (EAttribute)unitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnit_Offset() {
		return (EAttribute)unitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnit_Reference() {
		return (EReference)unitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnit_Quantity() {
		return (EReference)unitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAArrayValue() {
		return eaArrayValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAArrayValue_Value() {
		return (EReference)eaArrayValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEABooleanValue() {
		return eaBooleanValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEABooleanValue_Value() {
		return (EAttribute)eaBooleanValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEACompositeValue() {
		return eaCompositeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEACompositeValue_Value() {
		return (EReference)eaCompositeValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAEnumerationValue() {
		return eaEnumerationValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAEnumerationValue_Value() {
		return (EReference)eaEnumerationValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAExpression() {
		return eaExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAExpression_Value() {
		return (EReference)eaExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEANumericalValue() {
		return eaNumericalValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEANumericalValue_Value() {
		return (EAttribute)eaNumericalValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAStringValue() {
		return eaStringValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAStringValue_Value() {
		return (EAttribute)eaStringValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAValue() {
		return eaValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAValue_Type() {
		return (EReference)eaValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserAttributeDefinition() {
		return userAttributeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserAttributeDefinition_DefaultValue() {
		return (EReference)userAttributeDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserAttributeDefinition_Type() {
		return (EReference)userAttributeDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserAttributedElement() {
		return userAttributedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserAttributedElement_UaValue() {
		return (EReference)userAttributedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserAttributedElement_UaType() {
		return (EReference)userAttributedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserAttributedElement_AttributedElement() {
		return (EReference)userAttributedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserElementType() {
		return userElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserElementType_ValidFor() {
		return (EAttribute)userElementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserElementType_Key() {
		return (EAttribute)userElementTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserElementType_UaDefinition() {
		return (EReference)userElementTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClientServerKind() {
		return clientServerKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEADirectionKind() {
		return eaDirectionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHardwareBusKind() {
		return hardwareBusKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIOHardwarePinKind() {
		return ioHardwarePinKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBoolean() {
		return booleanEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFloat() {
		return floatEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIdentifier() {
		return identifierEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInteger() {
		return integerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNumerical() {
		return numericalEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRef() {
		return refEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getString() {
		return stringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Eastadl22_alphaFactory getEastadl22_alphaFactory() {
		return (Eastadl22_alphaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		designLevelEClass = createEClass(DESIGN_LEVEL);
		createEReference(designLevelEClass, DESIGN_LEVEL__ALLOCATION);
		createEReference(designLevelEClass, DESIGN_LEVEL__FUNCTIONAL_DESIGN_ARCHITECTURE);
		createEReference(designLevelEClass, DESIGN_LEVEL__HARDWARE_DESIGN_ARCHITECTURE);

		allocateableElementEClass = createEClass(ALLOCATEABLE_ELEMENT);

		allocationEClass = createEClass(ALLOCATION);
		createEReference(allocationEClass, ALLOCATION__FUNCTION_ALLOCATION);

		analysisFunctionPrototypeEClass = createEClass(ANALYSIS_FUNCTION_PROTOTYPE);
		createEReference(analysisFunctionPrototypeEClass, ANALYSIS_FUNCTION_PROTOTYPE__TYPE);

		analysisFunctionTypeEClass = createEClass(ANALYSIS_FUNCTION_TYPE);
		createEReference(analysisFunctionTypeEClass, ANALYSIS_FUNCTION_TYPE__PART);

		basicSoftwareFunctionTypeEClass = createEClass(BASIC_SOFTWARE_FUNCTION_TYPE);

		designFunctionPrototypeEClass = createEClass(DESIGN_FUNCTION_PROTOTYPE);
		createEReference(designFunctionPrototypeEClass, DESIGN_FUNCTION_PROTOTYPE__TYPE);

		designFunctionTypeEClass = createEClass(DESIGN_FUNCTION_TYPE);
		createEReference(designFunctionTypeEClass, DESIGN_FUNCTION_TYPE__PART);

		functionalDeviceEClass = createEClass(FUNCTIONAL_DEVICE);

		functionAllocationEClass = createEClass(FUNCTION_ALLOCATION);
		createEReference(functionAllocationEClass, FUNCTION_ALLOCATION__ALLOCATED_ELEMENT);
		createEReference(functionAllocationEClass, FUNCTION_ALLOCATION__TARGET);

		functionClientServerInterfaceEClass = createEClass(FUNCTION_CLIENT_SERVER_INTERFACE);
		createEReference(functionClientServerInterfaceEClass, FUNCTION_CLIENT_SERVER_INTERFACE__OPERATION);

		functionClientServerPortEClass = createEClass(FUNCTION_CLIENT_SERVER_PORT);
		createEAttribute(functionClientServerPortEClass, FUNCTION_CLIENT_SERVER_PORT__KIND);
		createEReference(functionClientServerPortEClass, FUNCTION_CLIENT_SERVER_PORT__TYPE);

		functionConnectorEClass = createEClass(FUNCTION_CONNECTOR);
		createEReference(functionConnectorEClass, FUNCTION_CONNECTOR__PORT);

		functionFlowPortEClass = createEClass(FUNCTION_FLOW_PORT);
		createEAttribute(functionFlowPortEClass, FUNCTION_FLOW_PORT__DIRECTION);
		createEReference(functionFlowPortEClass, FUNCTION_FLOW_PORT__TYPE);
		createEReference(functionFlowPortEClass, FUNCTION_FLOW_PORT__DEFAULT_VALUE);

		functionPortEClass = createEClass(FUNCTION_PORT);

		functionPowerPortEClass = createEClass(FUNCTION_POWER_PORT);
		createEReference(functionPowerPortEClass, FUNCTION_POWER_PORT__TYPE);

		functionPrototypeEClass = createEClass(FUNCTION_PROTOTYPE);

		functionTypeEClass = createEClass(FUNCTION_TYPE);
		createEAttribute(functionTypeEClass, FUNCTION_TYPE__IS_ELEMENTARY);
		createEReference(functionTypeEClass, FUNCTION_TYPE__PORT_GROUP);
		createEReference(functionTypeEClass, FUNCTION_TYPE__CONNECTOR);
		createEReference(functionTypeEClass, FUNCTION_TYPE__PORT);

		hardwareFunctionTypeEClass = createEClass(HARDWARE_FUNCTION_TYPE);
		createEReference(hardwareFunctionTypeEClass, HARDWARE_FUNCTION_TYPE__HARDWARE_COMPONENT);

		localDeviceManagerEClass = createEClass(LOCAL_DEVICE_MANAGER);

		operationEClass = createEClass(OPERATION);
		createEReference(operationEClass, OPERATION__RETURN);
		createEReference(operationEClass, OPERATION__ARGUMENT);

		portGroupEClass = createEClass(PORT_GROUP);
		createEReference(portGroupEClass, PORT_GROUP__PORT_GROUP);
		createEReference(portGroupEClass, PORT_GROUP__PORT);

		functionAllocation_allocatedElementEClass = createEClass(FUNCTION_ALLOCATION_ALLOCATED_ELEMENT);
		createEReference(functionAllocation_allocatedElementEClass, FUNCTION_ALLOCATION_ALLOCATED_ELEMENT__ALLOCATEABLE_ELEMENT_CONTEXT);
		createEReference(functionAllocation_allocatedElementEClass, FUNCTION_ALLOCATION_ALLOCATED_ELEMENT__ALLOCATEABLE_ELEMENT);

		functionAllocation_targetEClass = createEClass(FUNCTION_ALLOCATION_TARGET);
		createEReference(functionAllocation_targetEClass, FUNCTION_ALLOCATION_TARGET__ALLOCATION_TARGET_CONTEXT);
		createEReference(functionAllocation_targetEClass, FUNCTION_ALLOCATION_TARGET__ALLOCATION_TARGET);

		functionConnector_portEClass = createEClass(FUNCTION_CONNECTOR_PORT);
		createEReference(functionConnector_portEClass, FUNCTION_CONNECTOR_PORT__FUNCTION_PROTOTYPE);
		createEReference(functionConnector_portEClass, FUNCTION_CONNECTOR_PORT__FUNCTION_PORT);

		actuatorEClass = createEClass(ACTUATOR);

		communicationHardwarePinEClass = createEClass(COMMUNICATION_HARDWARE_PIN);

		electricalComponentEClass = createEClass(ELECTRICAL_COMPONENT);
		createEAttribute(electricalComponentEClass, ELECTRICAL_COMPONENT__IS_ACTIVE);

		hardwareComponentPrototypeEClass = createEClass(HARDWARE_COMPONENT_PROTOTYPE);
		createEReference(hardwareComponentPrototypeEClass, HARDWARE_COMPONENT_PROTOTYPE__TYPE);

		hardwareComponentTypeEClass = createEClass(HARDWARE_COMPONENT_TYPE);
		createEReference(hardwareComponentTypeEClass, HARDWARE_COMPONENT_TYPE__PIN);
		createEReference(hardwareComponentTypeEClass, HARDWARE_COMPONENT_TYPE__PART);
		createEReference(hardwareComponentTypeEClass, HARDWARE_COMPONENT_TYPE__CONNECTOR);
		createEReference(hardwareComponentTypeEClass, HARDWARE_COMPONENT_TYPE__PORT);
		createEReference(hardwareComponentTypeEClass, HARDWARE_COMPONENT_TYPE__PORT_CONNECTOR);

		hardwareConnectorEClass = createEClass(HARDWARE_CONNECTOR);
		createEReference(hardwareConnectorEClass, HARDWARE_CONNECTOR__PORT);

		hardwarePinEClass = createEClass(HARDWARE_PIN);
		createEAttribute(hardwarePinEClass, HARDWARE_PIN__DIRECTION);
		createEAttribute(hardwarePinEClass, HARDWARE_PIN__IS_GROUND);

		hardwarePortEClass = createEClass(HARDWARE_PORT);
		createEAttribute(hardwarePortEClass, HARDWARE_PORT__IS_SHIELD);
		createEReference(hardwarePortEClass, HARDWARE_PORT__CONTAINED_PIN);
		createEReference(hardwarePortEClass, HARDWARE_PORT__CONTAINED_PORT);
		createEReference(hardwarePortEClass, HARDWARE_PORT__REFERENCED_PIN);

		hardwarePortConnectorEClass = createEClass(HARDWARE_PORT_CONNECTOR);
		createEReference(hardwarePortConnectorEClass, HARDWARE_PORT_CONNECTOR__CONNECTOR);

		ioHardwarePinEClass = createEClass(IO_HARDWARE_PIN);
		createEAttribute(ioHardwarePinEClass, IO_HARDWARE_PIN__KIND);

		logicalPortConnectorEClass = createEClass(LOGICAL_PORT_CONNECTOR);
		createEAttribute(logicalPortConnectorEClass, LOGICAL_PORT_CONNECTOR__KIND);
		createEAttribute(logicalPortConnectorEClass, LOGICAL_PORT_CONNECTOR__BUS_SPEED);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__EXECUTION_RATE);

		portConnectorEClass = createEClass(PORT_CONNECTOR);
		createEReference(portConnectorEClass, PORT_CONNECTOR__PORT);

		powerHardwarePinEClass = createEClass(POWER_HARDWARE_PIN);

		sensorEClass = createEClass(SENSOR);

		allocationTargetEClass = createEClass(ALLOCATION_TARGET);

		hardwareConnector_portEClass = createEClass(HARDWARE_CONNECTOR_PORT);
		createEReference(hardwareConnector_portEClass, HARDWARE_CONNECTOR_PORT__HARDWARE_PIN);
		createEReference(hardwareConnector_portEClass, HARDWARE_CONNECTOR_PORT__HARDWARE_COMPONENT_PROTOTYPE);

		hardwarePortConnector_portEClass = createEClass(HARDWARE_PORT_CONNECTOR_PORT);
		createEReference(hardwarePortConnector_portEClass, HARDWARE_PORT_CONNECTOR_PORT__HARDWARE_PORT);
		createEReference(hardwarePortConnector_portEClass, HARDWARE_PORT_CONNECTOR_PORT__HARDWARE_COMPONENT_PROTOTYPE);

		commentEClass = createEClass(COMMENT);
		createEAttribute(commentEClass, COMMENT__BODY);

		contextEClass = createEClass(CONTEXT);
		createEReference(contextEClass, CONTEXT__TRACEABLE_SPECIFICATION);
		createEReference(contextEClass, CONTEXT__OWNED_RELATIONSHIP);

		eaConnectorEClass = createEClass(EA_CONNECTOR);

		eaElementEClass = createEClass(EA_ELEMENT);
		createEAttribute(eaElementEClass, EA_ELEMENT__NAME);
		createEReference(eaElementEClass, EA_ELEMENT__OWNED_COMMENT);

		eaPackageEClass = createEClass(EA_PACKAGE);
		createEReference(eaPackageEClass, EA_PACKAGE__SUB_PACKAGE);
		createEReference(eaPackageEClass, EA_PACKAGE__ELEMENT);

		eaPackageableElementEClass = createEClass(EA_PACKAGEABLE_ELEMENT);
		createEReference(eaPackageableElementEClass, EA_PACKAGEABLE_ELEMENT__EA_PACKAGE_ELEMENT);

		eaPortEClass = createEClass(EA_PORT);

		eaPrototypeEClass = createEClass(EA_PROTOTYPE);

		eaTypeEClass = createEClass(EA_TYPE);

		eaxmlEClass = createEClass(EAXML);
		createEReference(eaxmlEClass, EAXML__TOP_LEVEL_PACKAGE);

		rationaleEClass = createEClass(RATIONALE);

		realizationEClass = createEClass(REALIZATION);
		createEReference(realizationEClass, REALIZATION__REALIZED);
		createEReference(realizationEClass, REALIZATION__REALIZED_BY);

		referrableEClass = createEClass(REFERRABLE);
		createEAttribute(referrableEClass, REFERRABLE__SHORT_NAME);

		relationshipEClass = createEClass(RELATIONSHIP);

		traceableSpecificationEClass = createEClass(TRACEABLE_SPECIFICATION);
		createEAttribute(traceableSpecificationEClass, TRACEABLE_SPECIFICATION__TEXT);
		createEAttribute(traceableSpecificationEClass, TRACEABLE_SPECIFICATION__URI);

		identifiableEClass = createEClass(IDENTIFIABLE);
		createEAttribute(identifiableEClass, IDENTIFIABLE__CATEGORY);
		createEAttribute(identifiableEClass, IDENTIFIABLE__UUID);

		realization_realizedEClass = createEClass(REALIZATION_REALIZED);
		createEReference(realization_realizedEClass, REALIZATION_REALIZED__IDENTIFIABLE_TARGET);
		createEReference(realization_realizedEClass, REALIZATION_REALIZED__IDENTIFIABLE_CONTEXT);

		realization_realizedByEClass = createEClass(REALIZATION_REALIZED_BY);
		createEReference(realization_realizedByEClass, REALIZATION_REALIZED_BY__IDENTIFIABLE_TARGET);
		createEReference(realization_realizedByEClass, REALIZATION_REALIZED_BY__IDENTIFIABLE_CONTEXT);

		arrayDatatypeEClass = createEClass(ARRAY_DATATYPE);
		createEAttribute(arrayDatatypeEClass, ARRAY_DATATYPE__MAX_LENGTH);
		createEAttribute(arrayDatatypeEClass, ARRAY_DATATYPE__MIN_LENGTH);
		createEReference(arrayDatatypeEClass, ARRAY_DATATYPE__ELEMENT_TYPE);

		compositeDatatypeEClass = createEClass(COMPOSITE_DATATYPE);
		createEReference(compositeDatatypeEClass, COMPOSITE_DATATYPE__DATATYPE_PROTOTYPE);

		eaBooleanEClass = createEClass(EA_BOOLEAN);

		eaDatatypeEClass = createEClass(EA_DATATYPE);

		eaDatatypePrototypeEClass = createEClass(EA_DATATYPE_PROTOTYPE);
		createEReference(eaDatatypePrototypeEClass, EA_DATATYPE_PROTOTYPE__TYPE);

		eaNumericalEClass = createEClass(EA_NUMERICAL);
		createEAttribute(eaNumericalEClass, EA_NUMERICAL__MAX);
		createEAttribute(eaNumericalEClass, EA_NUMERICAL__MIN);
		createEReference(eaNumericalEClass, EA_NUMERICAL__UNIT);

		eaStringEClass = createEClass(EA_STRING);

		enumerationEClass = createEClass(ENUMERATION);
		createEAttribute(enumerationEClass, ENUMERATION__IS_MULTI_VALUED);
		createEReference(enumerationEClass, ENUMERATION__LITERAL);

		enumerationLiteralEClass = createEClass(ENUMERATION_LITERAL);

		quantityEClass = createEClass(QUANTITY);
		createEAttribute(quantityEClass, QUANTITY__AMOUNT_OF_SUBSTANCE_EXP);
		createEAttribute(quantityEClass, QUANTITY__ELECTRIC_CURRENT_EXP);
		createEAttribute(quantityEClass, QUANTITY__LENGTH_EXP);
		createEAttribute(quantityEClass, QUANTITY__LUMINOUS_INTENSITY_EXP);
		createEAttribute(quantityEClass, QUANTITY__MASS_EXP);
		createEAttribute(quantityEClass, QUANTITY__THERMODYNAMIC_TEMPERATURE_EXP);
		createEAttribute(quantityEClass, QUANTITY__TIME_EXP);

		rangeableValueTypeEClass = createEClass(RANGEABLE_VALUE_TYPE);
		createEAttribute(rangeableValueTypeEClass, RANGEABLE_VALUE_TYPE__ACCURACY);
		createEAttribute(rangeableValueTypeEClass, RANGEABLE_VALUE_TYPE__RESOLUTION);
		createEAttribute(rangeableValueTypeEClass, RANGEABLE_VALUE_TYPE__SIGNIFICANT_DIGITS);
		createEReference(rangeableValueTypeEClass, RANGEABLE_VALUE_TYPE__BASE_RANGEABLE);

		unitEClass = createEClass(UNIT);
		createEAttribute(unitEClass, UNIT__FACTOR);
		createEAttribute(unitEClass, UNIT__SYMBOL);
		createEAttribute(unitEClass, UNIT__OFFSET);
		createEReference(unitEClass, UNIT__REFERENCE);
		createEReference(unitEClass, UNIT__QUANTITY);

		eaArrayValueEClass = createEClass(EA_ARRAY_VALUE);
		createEReference(eaArrayValueEClass, EA_ARRAY_VALUE__VALUE);

		eaBooleanValueEClass = createEClass(EA_BOOLEAN_VALUE);
		createEAttribute(eaBooleanValueEClass, EA_BOOLEAN_VALUE__VALUE);

		eaCompositeValueEClass = createEClass(EA_COMPOSITE_VALUE);
		createEReference(eaCompositeValueEClass, EA_COMPOSITE_VALUE__VALUE);

		eaEnumerationValueEClass = createEClass(EA_ENUMERATION_VALUE);
		createEReference(eaEnumerationValueEClass, EA_ENUMERATION_VALUE__VALUE);

		eaExpressionEClass = createEClass(EA_EXPRESSION);
		createEReference(eaExpressionEClass, EA_EXPRESSION__VALUE);

		eaNumericalValueEClass = createEClass(EA_NUMERICAL_VALUE);
		createEAttribute(eaNumericalValueEClass, EA_NUMERICAL_VALUE__VALUE);

		eaStringValueEClass = createEClass(EA_STRING_VALUE);
		createEAttribute(eaStringValueEClass, EA_STRING_VALUE__VALUE);

		eaValueEClass = createEClass(EA_VALUE);
		createEReference(eaValueEClass, EA_VALUE__TYPE);

		userAttributeDefinitionEClass = createEClass(USER_ATTRIBUTE_DEFINITION);
		createEReference(userAttributeDefinitionEClass, USER_ATTRIBUTE_DEFINITION__DEFAULT_VALUE);
		createEReference(userAttributeDefinitionEClass, USER_ATTRIBUTE_DEFINITION__TYPE);

		userAttributedElementEClass = createEClass(USER_ATTRIBUTED_ELEMENT);
		createEReference(userAttributedElementEClass, USER_ATTRIBUTED_ELEMENT__UA_VALUE);
		createEReference(userAttributedElementEClass, USER_ATTRIBUTED_ELEMENT__UA_TYPE);
		createEReference(userAttributedElementEClass, USER_ATTRIBUTED_ELEMENT__ATTRIBUTED_ELEMENT);

		userElementTypeEClass = createEClass(USER_ELEMENT_TYPE);
		createEAttribute(userElementTypeEClass, USER_ELEMENT_TYPE__VALID_FOR);
		createEAttribute(userElementTypeEClass, USER_ELEMENT_TYPE__KEY);
		createEReference(userElementTypeEClass, USER_ELEMENT_TYPE__UA_DEFINITION);

		// Create enums
		clientServerKindEEnum = createEEnum(CLIENT_SERVER_KIND);
		eaDirectionKindEEnum = createEEnum(EA_DIRECTION_KIND);
		hardwareBusKindEEnum = createEEnum(HARDWARE_BUS_KIND);
		ioHardwarePinKindEEnum = createEEnum(IO_HARDWARE_PIN_KIND);

		// Create data types
		booleanEDataType = createEDataType(BOOLEAN);
		floatEDataType = createEDataType(FLOAT);
		identifierEDataType = createEDataType(IDENTIFIER);
		integerEDataType = createEDataType(INTEGER);
		numericalEDataType = createEDataType(NUMERICAL);
		refEDataType = createEDataType(REF);
		stringEDataType = createEDataType(STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		GelementsPackage theGelementsPackage = (GelementsPackage)EPackage.Registry.INSTANCE.getEPackage(GelementsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		designLevelEClass.getESuperTypes().add(this.getContext());
		allocationEClass.getESuperTypes().add(this.getEAElement());
		analysisFunctionPrototypeEClass.getESuperTypes().add(this.getFunctionPrototype());
		analysisFunctionTypeEClass.getESuperTypes().add(this.getFunctionType());
		basicSoftwareFunctionTypeEClass.getESuperTypes().add(this.getDesignFunctionType());
		designFunctionPrototypeEClass.getESuperTypes().add(this.getFunctionPrototype());
		designFunctionPrototypeEClass.getESuperTypes().add(this.getAllocateableElement());
		designFunctionTypeEClass.getESuperTypes().add(this.getFunctionType());
		functionalDeviceEClass.getESuperTypes().add(this.getAnalysisFunctionType());
		functionAllocationEClass.getESuperTypes().add(this.getEAElement());
		functionClientServerInterfaceEClass.getESuperTypes().add(this.getTraceableSpecification());
		functionClientServerPortEClass.getESuperTypes().add(this.getFunctionPort());
		functionConnectorEClass.getESuperTypes().add(this.getEAElement());
		functionConnectorEClass.getESuperTypes().add(this.getEAConnector());
		functionConnectorEClass.getESuperTypes().add(this.getAllocateableElement());
		functionFlowPortEClass.getESuperTypes().add(this.getFunctionPort());
		functionPortEClass.getESuperTypes().add(this.getEAElement());
		functionPortEClass.getESuperTypes().add(this.getEAPort());
		functionPortEClass.getESuperTypes().add(this.getAllocateableElement());
		functionPowerPortEClass.getESuperTypes().add(this.getFunctionPort());
		functionPrototypeEClass.getESuperTypes().add(this.getEAPrototype());
		functionPrototypeEClass.getESuperTypes().add(this.getEAElement());
		functionTypeEClass.getESuperTypes().add(this.getContext());
		functionTypeEClass.getESuperTypes().add(this.getEAType());
		hardwareFunctionTypeEClass.getESuperTypes().add(this.getDesignFunctionType());
		localDeviceManagerEClass.getESuperTypes().add(this.getDesignFunctionType());
		operationEClass.getESuperTypes().add(this.getEAElement());
		portGroupEClass.getESuperTypes().add(this.getEAElement());
		actuatorEClass.getESuperTypes().add(this.getHardwareComponentType());
		communicationHardwarePinEClass.getESuperTypes().add(this.getHardwarePin());
		electricalComponentEClass.getESuperTypes().add(this.getHardwareComponentType());
		hardwareComponentPrototypeEClass.getESuperTypes().add(this.getAllocationTarget());
		hardwareComponentPrototypeEClass.getESuperTypes().add(this.getEAPrototype());
		hardwareComponentTypeEClass.getESuperTypes().add(this.getContext());
		hardwareComponentTypeEClass.getESuperTypes().add(this.getEAType());
		hardwareConnectorEClass.getESuperTypes().add(this.getEAElement());
		hardwareConnectorEClass.getESuperTypes().add(this.getEAConnector());
		hardwarePinEClass.getESuperTypes().add(this.getEAElement());
		hardwarePinEClass.getESuperTypes().add(this.getEAPort());
		hardwarePinEClass.getESuperTypes().add(this.getAllocationTarget());
		hardwarePortEClass.getESuperTypes().add(this.getEAPort());
		hardwarePortEClass.getESuperTypes().add(this.getAllocationTarget());
		hardwarePortConnectorEClass.getESuperTypes().add(this.getEAConnector());
		hardwarePortConnectorEClass.getESuperTypes().add(this.getPortConnector());
		ioHardwarePinEClass.getESuperTypes().add(this.getHardwarePin());
		logicalPortConnectorEClass.getESuperTypes().add(this.getEAConnector());
		logicalPortConnectorEClass.getESuperTypes().add(this.getPortConnector());
		nodeEClass.getESuperTypes().add(this.getHardwareComponentType());
		portConnectorEClass.getESuperTypes().add(this.getEAConnector());
		portConnectorEClass.getESuperTypes().add(this.getAllocationTarget());
		powerHardwarePinEClass.getESuperTypes().add(this.getHardwarePin());
		sensorEClass.getESuperTypes().add(this.getHardwareComponentType());
		allocationTargetEClass.getESuperTypes().add(this.getEAElement());
		contextEClass.getESuperTypes().add(this.getEAPackageableElement());
		eaElementEClass.getESuperTypes().add(this.getIdentifiable());
		eaPackageEClass.getESuperTypes().add(this.getEAElement());
		eaPackageEClass.getESuperTypes().add(theGelementsPackage.getGEAPackage());
		eaPackageableElementEClass.getESuperTypes().add(this.getEAElement());
		eaPackageableElementEClass.getESuperTypes().add(theGelementsPackage.getGEAPackageableElement());
		eaxmlEClass.getESuperTypes().add(theGelementsPackage.getGEAXML());
		rationaleEClass.getESuperTypes().add(this.getComment());
		realizationEClass.getESuperTypes().add(this.getRelationship());
		referrableEClass.getESuperTypes().add(theGelementsPackage.getGReferrable());
		relationshipEClass.getESuperTypes().add(this.getEAElement());
		traceableSpecificationEClass.getESuperTypes().add(this.getEAPackageableElement());
		identifiableEClass.getESuperTypes().add(this.getReferrable());
		identifiableEClass.getESuperTypes().add(theGelementsPackage.getGIdentifiable());
		arrayDatatypeEClass.getESuperTypes().add(this.getEADatatype());
		compositeDatatypeEClass.getESuperTypes().add(this.getEADatatype());
		eaBooleanEClass.getESuperTypes().add(this.getEADatatype());
		eaDatatypeEClass.getESuperTypes().add(this.getTraceableSpecification());
		eaDatatypePrototypeEClass.getESuperTypes().add(this.getEAElement());
		eaNumericalEClass.getESuperTypes().add(this.getEADatatype());
		eaStringEClass.getESuperTypes().add(this.getEADatatype());
		enumerationEClass.getESuperTypes().add(this.getEADatatype());
		enumerationLiteralEClass.getESuperTypes().add(this.getEAElement());
		quantityEClass.getESuperTypes().add(this.getEAPackageableElement());
		rangeableValueTypeEClass.getESuperTypes().add(this.getEADatatype());
		unitEClass.getESuperTypes().add(this.getEAPackageableElement());
		eaArrayValueEClass.getESuperTypes().add(this.getEAValue());
		eaBooleanValueEClass.getESuperTypes().add(this.getEAValue());
		eaCompositeValueEClass.getESuperTypes().add(this.getEAValue());
		eaEnumerationValueEClass.getESuperTypes().add(this.getEAValue());
		eaExpressionEClass.getESuperTypes().add(this.getEAValue());
		eaNumericalValueEClass.getESuperTypes().add(this.getEAValue());
		eaStringValueEClass.getESuperTypes().add(this.getEAValue());
		userAttributeDefinitionEClass.getESuperTypes().add(this.getEAPackageableElement());
		userAttributedElementEClass.getESuperTypes().add(this.getEAPackageableElement());
		userElementTypeEClass.getESuperTypes().add(this.getEAPackageableElement());

		// Initialize classes and features; add operations and parameters
		initEClass(designLevelEClass, DesignLevel.class, "DesignLevel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDesignLevel_Allocation(), this.getAllocation(), null, "allocation", null, 0, -1, DesignLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDesignLevel_FunctionalDesignArchitecture(), this.getDesignFunctionPrototype(), null, "functionalDesignArchitecture", null, 0, 1, DesignLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDesignLevel_HardwareDesignArchitecture(), this.getHardwareComponentPrototype(), null, "hardwareDesignArchitecture", null, 0, 1, DesignLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allocateableElementEClass, AllocateableElement.class, "AllocateableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(allocationEClass, Allocation.class, "Allocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllocation_FunctionAllocation(), this.getFunctionAllocation(), null, "functionAllocation", null, 0, -1, Allocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(analysisFunctionPrototypeEClass, AnalysisFunctionPrototype.class, "AnalysisFunctionPrototype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnalysisFunctionPrototype_Type(), this.getAnalysisFunctionType(), null, "type", null, 1, 1, AnalysisFunctionPrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(analysisFunctionTypeEClass, AnalysisFunctionType.class, "AnalysisFunctionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnalysisFunctionType_Part(), this.getAnalysisFunctionPrototype(), null, "part", null, 0, -1, AnalysisFunctionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicSoftwareFunctionTypeEClass, BasicSoftwareFunctionType.class, "BasicSoftwareFunctionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(designFunctionPrototypeEClass, DesignFunctionPrototype.class, "DesignFunctionPrototype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDesignFunctionPrototype_Type(), this.getDesignFunctionType(), null, "type", null, 1, 1, DesignFunctionPrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(designFunctionTypeEClass, DesignFunctionType.class, "DesignFunctionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDesignFunctionType_Part(), this.getDesignFunctionPrototype(), null, "part", null, 0, -1, DesignFunctionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionalDeviceEClass, FunctionalDevice.class, "FunctionalDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionAllocationEClass, FunctionAllocation.class, "FunctionAllocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionAllocation_AllocatedElement(), this.getFunctionAllocation_allocatedElement(), null, "allocatedElement", null, 1, 1, FunctionAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionAllocation_Target(), this.getFunctionAllocation_target(), null, "target", null, 1, 1, FunctionAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionClientServerInterfaceEClass, FunctionClientServerInterface.class, "FunctionClientServerInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionClientServerInterface_Operation(), this.getOperation(), null, "operation", null, 0, -1, FunctionClientServerInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionClientServerPortEClass, FunctionClientServerPort.class, "FunctionClientServerPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionClientServerPort_Kind(), this.getClientServerKind(), "kind", "CLIENT", 1, 1, FunctionClientServerPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionClientServerPort_Type(), this.getFunctionClientServerInterface(), null, "type", null, 1, 1, FunctionClientServerPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionConnectorEClass, FunctionConnector.class, "FunctionConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionConnector_Port(), this.getFunctionConnector_port(), null, "port", null, 2, 2, FunctionConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionFlowPortEClass, FunctionFlowPort.class, "FunctionFlowPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionFlowPort_Direction(), this.getEADirectionKind(), "direction", "IN", 1, 1, FunctionFlowPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionFlowPort_Type(), this.getEADatatype(), null, "type", null, 1, 1, FunctionFlowPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionFlowPort_DefaultValue(), this.getEAValue(), null, "defaultValue", null, 0, 1, FunctionFlowPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionPortEClass, FunctionPort.class, "FunctionPort", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionPowerPortEClass, FunctionPowerPort.class, "FunctionPowerPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionPowerPort_Type(), this.getCompositeDatatype(), null, "type", null, 1, 1, FunctionPowerPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionPrototypeEClass, FunctionPrototype.class, "FunctionPrototype", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionTypeEClass, FunctionType.class, "FunctionType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionType_IsElementary(), this.getBoolean(), "isElementary", "false", 0, 1, FunctionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionType_PortGroup(), this.getPortGroup(), null, "portGroup", null, 0, -1, FunctionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionType_Connector(), this.getFunctionConnector(), null, "connector", null, 0, -1, FunctionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionType_Port(), this.getFunctionPort(), null, "port", null, 0, -1, FunctionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwareFunctionTypeEClass, HardwareFunctionType.class, "HardwareFunctionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHardwareFunctionType_HardwareComponent(), this.getHardwareComponentType(), null, "hardwareComponent", null, 0, 1, HardwareFunctionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localDeviceManagerEClass, LocalDeviceManager.class, "LocalDeviceManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperation_Return(), this.getEADatatypePrototype(), null, "return", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Argument(), this.getEADatatypePrototype(), null, "argument", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portGroupEClass, PortGroup.class, "PortGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortGroup_PortGroup(), this.getPortGroup(), null, "portGroup", null, 0, -1, PortGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPortGroup_Port(), this.getFunctionPort(), null, "port", null, 0, -1, PortGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionAllocation_allocatedElementEClass, FunctionAllocation_allocatedElement.class, "FunctionAllocation_allocatedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionAllocation_allocatedElement_AllocateableElement_context(), this.getAllocateableElement(), null, "allocateableElement_context", null, 0, -1, FunctionAllocation_allocatedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionAllocation_allocatedElement_AllocateableElement(), this.getAllocateableElement(), null, "allocateableElement", null, 1, 1, FunctionAllocation_allocatedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionAllocation_targetEClass, FunctionAllocation_target.class, "FunctionAllocation_target", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionAllocation_target_AllocationTarget_context(), this.getAllocationTarget(), null, "allocationTarget_context", null, 0, -1, FunctionAllocation_target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionAllocation_target_AllocationTarget(), this.getAllocationTarget(), null, "allocationTarget", null, 1, 1, FunctionAllocation_target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionConnector_portEClass, FunctionConnector_port.class, "FunctionConnector_port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionConnector_port_FunctionPrototype(), this.getFunctionPrototype(), null, "functionPrototype", null, 0, 1, FunctionConnector_port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionConnector_port_FunctionPort(), this.getFunctionPort(), null, "functionPort", null, 1, 1, FunctionConnector_port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actuatorEClass, Actuator.class, "Actuator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(communicationHardwarePinEClass, CommunicationHardwarePin.class, "CommunicationHardwarePin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(electricalComponentEClass, ElectricalComponent.class, "ElectricalComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElectricalComponent_IsActive(), this.getBoolean(), "isActive", "false", 0, 1, ElectricalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwareComponentPrototypeEClass, HardwareComponentPrototype.class, "HardwareComponentPrototype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHardwareComponentPrototype_Type(), this.getHardwareComponentType(), null, "type", null, 1, 1, HardwareComponentPrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwareComponentTypeEClass, HardwareComponentType.class, "HardwareComponentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHardwareComponentType_Pin(), this.getHardwarePin(), null, "pin", null, 0, -1, HardwareComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHardwareComponentType_Part(), this.getHardwareComponentPrototype(), null, "part", null, 0, -1, HardwareComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHardwareComponentType_Connector(), this.getHardwareConnector(), null, "connector", null, 0, -1, HardwareComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHardwareComponentType_Port(), this.getHardwarePort(), null, "port", null, 0, -1, HardwareComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHardwareComponentType_PortConnector(), this.getPortConnector(), null, "portConnector", null, 0, -1, HardwareComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwareConnectorEClass, HardwareConnector.class, "HardwareConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHardwareConnector_Port(), this.getHardwareConnector_port(), null, "port", null, 2, 2, HardwareConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwarePinEClass, HardwarePin.class, "HardwarePin", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHardwarePin_Direction(), this.getEADirectionKind(), "direction", "IN", 0, 1, HardwarePin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHardwarePin_IsGround(), this.getBoolean(), "isGround", "false", 0, 1, HardwarePin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwarePortEClass, HardwarePort.class, "HardwarePort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHardwarePort_IsShield(), this.getBoolean(), "isShield", "false", 0, 1, HardwarePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHardwarePort_ContainedPin(), this.getHardwarePin(), null, "containedPin", null, 0, -1, HardwarePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHardwarePort_ContainedPort(), this.getHardwarePort(), null, "containedPort", null, 0, -1, HardwarePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHardwarePort_ReferencedPin(), this.getHardwarePin(), null, "referencedPin", null, 0, -1, HardwarePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwarePortConnectorEClass, HardwarePortConnector.class, "HardwarePortConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHardwarePortConnector_Connector(), this.getHardwareConnector(), null, "connector", null, 0, -1, HardwarePortConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ioHardwarePinEClass, IOHardwarePin.class, "IOHardwarePin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIOHardwarePin_Kind(), this.getIOHardwarePinKind(), "kind", "DIGITAL", 0, 1, IOHardwarePin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicalPortConnectorEClass, LogicalPortConnector.class, "LogicalPortConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogicalPortConnector_Kind(), this.getHardwareBusKind(), "kind", "TIMETRIGGERED", 0, 1, LogicalPortConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicalPortConnector_BusSpeed(), this.getFloat(), "busSpeed", "0.0", 0, 1, LogicalPortConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_ExecutionRate(), this.getFloat(), "executionRate", "0.0", 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portConnectorEClass, PortConnector.class, "PortConnector", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortConnector_Port(), this.getHardwarePortConnector_port(), null, "port", null, 2, 2, PortConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(powerHardwarePinEClass, PowerHardwarePin.class, "PowerHardwarePin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sensorEClass, Sensor.class, "Sensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(allocationTargetEClass, AllocationTarget.class, "AllocationTarget", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hardwareConnector_portEClass, HardwareConnector_port.class, "HardwareConnector_port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHardwareConnector_port_HardwarePin(), this.getHardwarePin(), null, "hardwarePin", null, 1, 1, HardwareConnector_port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHardwareConnector_port_HardwareComponentPrototype(), this.getHardwareComponentPrototype(), null, "hardwareComponentPrototype", null, 0, 1, HardwareConnector_port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardwarePortConnector_portEClass, HardwarePortConnector_port.class, "HardwarePortConnector_port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHardwarePortConnector_port_HardwarePort(), this.getHardwarePort(), null, "hardwarePort", null, 1, 1, HardwarePortConnector_port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHardwarePortConnector_port_HardwareComponentPrototype(), this.getHardwareComponentPrototype(), null, "hardwareComponentPrototype", null, 0, 1, HardwarePortConnector_port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComment_Body(), this.getString(), "body", null, 1, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextEClass, Context.class, "Context", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContext_TraceableSpecification(), this.getTraceableSpecification(), null, "traceableSpecification", null, 0, -1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContext_OwnedRelationship(), this.getRelationship(), null, "ownedRelationship", null, 0, -1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eaConnectorEClass, EAConnector.class, "EAConnector", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eaElementEClass, EAElement.class, "EAElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEAElement_Name(), this.getString(), "name", null, 0, 1, EAElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAElement_OwnedComment(), this.getComment(), null, "ownedComment", null, 0, -1, EAElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eaPackageEClass, EAPackage.class, "EAPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEAPackage_SubPackage(), this.getEAPackage(), null, "subPackage", null, 0, -1, EAPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAPackage_Element(), this.getEAPackageableElement(), this.getEAPackageableElement_EAPackage_element(), "element", null, 0, -1, EAPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eaPackageableElementEClass, EAPackageableElement.class, "EAPackageableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEAPackageableElement_EAPackage_element(), this.getEAPackage(), this.getEAPackage_Element(), "EAPackage_element", null, 0, 1, EAPackageableElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eaPortEClass, EAPort.class, "EAPort", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eaPrototypeEClass, EAPrototype.class, "EAPrototype", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eaTypeEClass, EAType.class, "EAType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eaxmlEClass, eastadl22_alpha.EAXML.class, "EAXML", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEAXML_TopLevelPackage(), this.getEAPackage(), null, "topLevelPackage", null, 0, -1, eastadl22_alpha.EAXML.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rationaleEClass, Rationale.class, "Rationale", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(realizationEClass, Realization.class, "Realization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRealization_Realized(), this.getRealization_realized(), null, "realized", null, 1, -1, Realization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRealization_RealizedBy(), this.getRealization_realizedBy(), null, "realizedBy", null, 1, -1, Realization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referrableEClass, Referrable.class, "Referrable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReferrable_ShortName(), this.getIdentifier(), "shortName", null, 1, 1, Referrable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipEClass, Relationship.class, "Relationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(traceableSpecificationEClass, TraceableSpecification.class, "TraceableSpecification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTraceableSpecification_Text(), this.getString(), "text", null, 0, 1, TraceableSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraceableSpecification_Uri(), this.getString(), "uri", null, 0, 1, TraceableSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifiableEClass, Identifiable.class, "Identifiable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiable_Category(), this.getIdentifier(), "category", null, 0, 1, Identifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifiable_Uuid(), this.getString(), "uuid", null, 0, 1, Identifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(realization_realizedEClass, Realization_realized.class, "Realization_realized", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRealization_realized_Identifiable_target(), this.getEAElement(), null, "identifiable_target", null, 1, 1, Realization_realized.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRealization_realized_Identifiable_context(), this.getEAElement(), null, "identifiable_context", null, 0, -1, Realization_realized.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(realization_realizedByEClass, Realization_realizedBy.class, "Realization_realizedBy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRealization_realizedBy_Identifiable_target(), this.getIdentifiable(), null, "identifiable_target", null, 1, 1, Realization_realizedBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRealization_realizedBy_Identifiable_context(), this.getIdentifiable(), null, "identifiable_context", null, 0, -1, Realization_realizedBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayDatatypeEClass, ArrayDatatype.class, "ArrayDatatype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArrayDatatype_MaxLength(), this.getInteger(), "maxLength", "0", 0, 1, ArrayDatatype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArrayDatatype_MinLength(), this.getInteger(), "minLength", "0", 0, 1, ArrayDatatype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArrayDatatype_ElementType(), this.getEADatatype(), null, "elementType", null, 1, 1, ArrayDatatype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeDatatypeEClass, CompositeDatatype.class, "CompositeDatatype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeDatatype_DatatypePrototype(), this.getEADatatypePrototype(), null, "datatypePrototype", null, 1, -1, CompositeDatatype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eaBooleanEClass, EABoolean.class, "EABoolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eaDatatypeEClass, EADatatype.class, "EADatatype", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eaDatatypePrototypeEClass, EADatatypePrototype.class, "EADatatypePrototype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEADatatypePrototype_Type(), this.getEADatatype(), null, "type", null, 1, 1, EADatatypePrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eaNumericalEClass, EANumerical.class, "EANumerical", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEANumerical_Max(), this.getNumerical(), "max", null, 0, 1, EANumerical.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEANumerical_Min(), this.getNumerical(), "min", null, 0, 1, EANumerical.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEANumerical_Unit(), this.getUnit(), null, "unit", null, 0, 1, EANumerical.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eaStringEClass, EAString.class, "EAString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enumerationEClass, Enumeration.class, "Enumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumeration_IsMultiValued(), this.getBoolean(), "isMultiValued", "false", 1, 1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumeration_Literal(), this.getEnumerationLiteral(), null, "literal", null, 2, -1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationLiteralEClass, EnumerationLiteral.class, "EnumerationLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(quantityEClass, Quantity.class, "Quantity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuantity_AmountOfSubstanceExp(), this.getInteger(), "amountOfSubstanceExp", "0", 1, 1, Quantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuantity_ElectricCurrentExp(), this.getInteger(), "electricCurrentExp", "0", 1, 1, Quantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuantity_LengthExp(), this.getInteger(), "lengthExp", "0", 1, 1, Quantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuantity_LuminousIntensityExp(), this.getInteger(), "luminousIntensityExp", "0", 1, 1, Quantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuantity_MassExp(), this.getInteger(), "massExp", "0", 1, 1, Quantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuantity_ThermodynamicTemperatureExp(), this.getInteger(), "thermodynamicTemperatureExp", "0", 1, 1, Quantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuantity_TimeExp(), this.getInteger(), "timeExp", "0", 1, 1, Quantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rangeableValueTypeEClass, RangeableValueType.class, "RangeableValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRangeableValueType_Accuracy(), this.getFloat(), "accuracy", "0.0", 1, 1, RangeableValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRangeableValueType_Resolution(), this.getFloat(), "resolution", "0.0", 1, 1, RangeableValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRangeableValueType_SignificantDigits(), this.getInteger(), "significantDigits", "0", 0, 1, RangeableValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRangeableValueType_BaseRangeable(), this.getEANumerical(), null, "baseRangeable", null, 1, 1, RangeableValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitEClass, Unit.class, "Unit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnit_Factor(), this.getFloat(), "factor", "0.0", 1, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnit_Symbol(), this.getString(), "symbol", null, 1, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnit_Offset(), this.getFloat(), "offset", "0.0", 1, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnit_Reference(), this.getUnit(), null, "reference", null, 0, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnit_Quantity(), this.getQuantity(), null, "quantity", null, 0, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eaArrayValueEClass, EAArrayValue.class, "EAArrayValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEAArrayValue_Value(), this.getEAValue(), null, "value", null, 0, -1, EAArrayValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eaBooleanValueEClass, EABooleanValue.class, "EABooleanValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEABooleanValue_Value(), this.getBoolean(), "value", "false", 1, 1, EABooleanValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eaCompositeValueEClass, EACompositeValue.class, "EACompositeValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEACompositeValue_Value(), this.getEAValue(), null, "value", null, 1, -1, EACompositeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eaEnumerationValueEClass, EAEnumerationValue.class, "EAEnumerationValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEAEnumerationValue_Value(), this.getEnumerationLiteral(), null, "value", null, 1, -1, EAEnumerationValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eaExpressionEClass, EAExpression.class, "EAExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEAExpression_Value(), this.getEAValue(), null, "value", null, 0, -1, EAExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eaNumericalValueEClass, EANumericalValue.class, "EANumericalValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEANumericalValue_Value(), this.getNumerical(), "value", null, 1, 1, EANumericalValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eaStringValueEClass, EAStringValue.class, "EAStringValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEAStringValue_Value(), this.getString(), "value", null, 1, 1, EAStringValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eaValueEClass, EAValue.class, "EAValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEAValue_Type(), this.getEADatatype(), null, "type", null, 1, 1, EAValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userAttributeDefinitionEClass, UserAttributeDefinition.class, "UserAttributeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUserAttributeDefinition_DefaultValue(), this.getEAValue(), null, "defaultValue", null, 0, 1, UserAttributeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserAttributeDefinition_Type(), this.getEADatatype(), null, "type", null, 1, 1, UserAttributeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userAttributedElementEClass, UserAttributedElement.class, "UserAttributedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUserAttributedElement_UaValue(), this.getEAValue(), null, "uaValue", null, 0, -1, UserAttributedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserAttributedElement_UaType(), this.getUserElementType(), null, "uaType", null, 0, -1, UserAttributedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserAttributedElement_AttributedElement(), this.getIdentifiable(), null, "attributedElement", null, 1, 1, UserAttributedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userElementTypeEClass, UserElementType.class, "UserElementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserElementType_ValidFor(), this.getString(), "validFor", null, 0, 1, UserElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserElementType_Key(), this.getString(), "key", null, 1, 1, UserElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserElementType_UaDefinition(), this.getUserAttributeDefinition(), null, "uaDefinition", null, 0, -1, UserElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(clientServerKindEEnum, ClientServerKind.class, "ClientServerKind");
		addEEnumLiteral(clientServerKindEEnum, ClientServerKind.CLIENT);
		addEEnumLiteral(clientServerKindEEnum, ClientServerKind.SERVER);

		initEEnum(eaDirectionKindEEnum, EADirectionKind.class, "EADirectionKind");
		addEEnumLiteral(eaDirectionKindEEnum, EADirectionKind.IN);
		addEEnumLiteral(eaDirectionKindEEnum, EADirectionKind.INOUT);
		addEEnumLiteral(eaDirectionKindEEnum, EADirectionKind.OUT);

		initEEnum(hardwareBusKindEEnum, HardwareBusKind.class, "HardwareBusKind");
		addEEnumLiteral(hardwareBusKindEEnum, HardwareBusKind.TIME_TRIGGERED);
		addEEnumLiteral(hardwareBusKindEEnum, HardwareBusKind.EVENT_TRIGGERED);
		addEEnumLiteral(hardwareBusKindEEnum, HardwareBusKind.TIME_AND_EVENT_TRIGGERED);
		addEEnumLiteral(hardwareBusKindEEnum, HardwareBusKind.OTHER);

		initEEnum(ioHardwarePinKindEEnum, IOHardwarePinKind.class, "IOHardwarePinKind");
		addEEnumLiteral(ioHardwarePinKindEEnum, IOHardwarePinKind.DIGITAL);
		addEEnumLiteral(ioHardwarePinKindEEnum, IOHardwarePinKind.ANALOG);
		addEEnumLiteral(ioHardwarePinKindEEnum, IOHardwarePinKind.PWM);
		addEEnumLiteral(ioHardwarePinKindEEnum, IOHardwarePinKind.OTHER);

		// Initialize data types
		initEDataType(booleanEDataType, Boolean.class, "Boolean", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(floatEDataType, Double.class, "Float", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(identifierEDataType, String.class, "Identifier", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(integerEDataType, Integer.class, "Integer", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(numericalEDataType, String.class, "Numerical", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(refEDataType, String.class, "Ref", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stringEDataType, String.class, "String", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// MetaData
		createMetaDataAnnotations();
		// http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData
		createXMLPersistenceMappingExtendedMetaDataAnnotations();
		// Stereotype
		createStereotypeAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// TaggedValues
		createTaggedValuesAnnotations();
	}

	/**
	 * Initializes the annotations for <b>MetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createMetaDataAnnotations() {
		String source = "MetaData";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "guid", "{7298DC40-A4F8-4a5d-A0CC-4A71F6987184}",
			   "id", "1",
			   "EA name", "eastadl21"
		   });
		addAnnotation
		  (designLevelEClass,
		   source,
		   new String[] {
			   "guid", "{3DA8D034-A23A-4d6a-9174-C76163018C43}",
			   "id", "19",
			   "EA name", "DesignLevel"
		   });
		addAnnotation
		  (getDesignLevel_Allocation(),
		   source,
		   new String[] {
			   "guid", "{49F4574F-E818-4cb3-B6C9-17F03BBA953B}",
			   "id", "732",
			   "EA name", ""
		   });
		addAnnotation
		  (getDesignLevel_FunctionalDesignArchitecture(),
		   source,
		   new String[] {
			   "guid", "{48012A9C-B5CA-49d2-9DE1-ABFA2AD87D0F}",
			   "id", "733",
			   "EA name", ""
		   });
		addAnnotation
		  (getDesignLevel_HardwareDesignArchitecture(),
		   source,
		   new String[] {
			   "guid", "{77E96486-A5F0-42e3-B1F0-2B3A3A6305CB}",
			   "id", "731",
			   "EA name", ""
		   });
		addAnnotation
		  (allocateableElementEClass,
		   source,
		   new String[] {
			   "guid", "{0659EB2C-24E9-4789-BEAA-D3581E492DC2}",
			   "id", "36",
			   "EA name", "AllocateableElement"
		   });
		addAnnotation
		  (allocationEClass,
		   source,
		   new String[] {
			   "guid", "{62868E4F-8FA9-4f95-96F9-1B9F47B4EC86}",
			   "id", "46",
			   "EA name", "Allocation"
		   });
		addAnnotation
		  (getAllocation_FunctionAllocation(),
		   source,
		   new String[] {
			   "guid", "{845496EE-F7B5-4440-BE72-8F3DC81891D2}",
			   "id", "682",
			   "EA name", ""
		   });
		addAnnotation
		  (analysisFunctionPrototypeEClass,
		   source,
		   new String[] {
			   "guid", "{95E72BFB-F9BB-4bb2-B78C-F0227D35280C}",
			   "id", "51",
			   "EA name", "AnalysisFunctionPrototype"
		   });
		addAnnotation
		  (getAnalysisFunctionPrototype_Type(),
		   source,
		   new String[] {
			   "guid", "{0B20899E-F2AF-460c-98F5-B9634FB87D29}",
			   "id", "606",
			   "EA name", ""
		   });
		addAnnotation
		  (analysisFunctionTypeEClass,
		   source,
		   new String[] {
			   "guid", "{FD507174-A96E-4328-A323-4D51BF4ABC67}",
			   "id", "57",
			   "EA name", "AnalysisFunctionType"
		   });
		addAnnotation
		  (getAnalysisFunctionType_Part(),
		   source,
		   new String[] {
			   "guid", "{DCE3DDD8-7185-4db8-AAAD-AB3A2884A816}",
			   "id", "605",
			   "EA name", ""
		   });
		addAnnotation
		  (basicSoftwareFunctionTypeEClass,
		   source,
		   new String[] {
			   "guid", "{5C011050-DADF-4bbf-BB5C-1FDABDC27CA3}",
			   "id", "45",
			   "EA name", "BasicSoftwareFunctionType"
		   });
		addAnnotation
		  (clientServerKindEEnum,
		   source,
		   new String[] {
			   "guid", "{04E14304-2B3D-40ed-91E7-13EE40A7AD2D}",
			   "id", "35",
			   "EA name", "ClientServerKind"
		   });
		addAnnotation
		  (designFunctionPrototypeEClass,
		   source,
		   new String[] {
			   "guid", "{7372B5DE-E4EC-4362-BD1E-350BED871A6C}",
			   "id", "48",
			   "EA name", "DesignFunctionPrototype"
		   });
		addAnnotation
		  (getDesignFunctionPrototype_Type(),
		   source,
		   new String[] {
			   "guid", "{EF3CD027-CED3-43b1-B7C6-7E8057BEB530}",
			   "id", "660",
			   "EA name", ""
		   });
		addAnnotation
		  (designFunctionTypeEClass,
		   source,
		   new String[] {
			   "guid", "{3C657C41-C724-4363-9C66-8616E947578F}",
			   "id", "39",
			   "EA name", "DesignFunctionType"
		   });
		addAnnotation
		  (getDesignFunctionType_Part(),
		   source,
		   new String[] {
			   "guid", "{18AEE740-4D7B-4047-A49B-81815D2B9469}",
			   "id", "665",
			   "EA name", ""
		   });
		addAnnotation
		  (eaDirectionKindEEnum,
		   source,
		   new String[] {
			   "guid", "{CF3960D3-9916-459d-BD2D-E40C7F7D6CD9}",
			   "id", "54",
			   "EA name", "EADirectionKind"
		   });
		addAnnotation
		  (functionalDeviceEClass,
		   source,
		   new String[] {
			   "guid", "{4B657BEF-838B-49b9-8B46-1CE35CEFE970}",
			   "id", "43",
			   "EA name", "FunctionalDevice"
		   });
		addAnnotation
		  (functionAllocationEClass,
		   source,
		   new String[] {
			   "guid", "{2D44D38D-1029-4bee-8AB6-2B09AC2A69CD}",
			   "id", "37",
			   "EA name", "FunctionAllocation"
		   });
		addAnnotation
		  (getFunctionAllocation_AllocatedElement(),
		   source,
		   new String[] {
			   "guid", "{82757B7A-A1A9-4df3-92B2-929CF4A5EB2C}",
			   "id", "683",
			   "EA name", ""
		   });
		addAnnotation
		  (getFunctionAllocation_Target(),
		   source,
		   new String[] {
			   "guid", "{2E6C2DAB-FF14-42e6-A241-487CCC9B6BD4}",
			   "id", "686",
			   "EA name", ""
		   });
		addAnnotation
		  (functionClientServerInterfaceEClass,
		   source,
		   new String[] {
			   "guid", "{7437700A-B53A-4558-B709-93B1C33C8B72}",
			   "id", "49",
			   "EA name", "FunctionClientServerInterface"
		   });
		addAnnotation
		  (getFunctionClientServerInterface_Operation(),
		   source,
		   new String[] {
			   "guid", "{9E2B087B-33AF-4626-8067-675BAC88FBDD}",
			   "id", "652",
			   "EA name", ""
		   });
		addAnnotation
		  (functionClientServerPortEClass,
		   source,
		   new String[] {
			   "guid", "{BE654DCF-B47C-46ab-9C57-DBC4D0945F06}",
			   "id", "52",
			   "EA name", "FunctionClientServerPort"
		   });
		addAnnotation
		  (getFunctionClientServerPort_Kind(),
		   source,
		   new String[] {
			   "guid", "{3D87B778-F71F-4bc9-9115-4C3F423EB931}",
			   "id", "41",
			   "EA name", "kind"
		   });
		addAnnotation
		  (getFunctionClientServerPort_Type(),
		   source,
		   new String[] {
			   "guid", "{1A5B859E-18A4-4f59-8B7C-270B3B9660E0}",
			   "id", "610",
			   "EA name", ""
		   });
		addAnnotation
		  (functionConnectorEClass,
		   source,
		   new String[] {
			   "guid", "{48EF76B0-7C42-4534-A8AC-5CC55844C363}",
			   "id", "40",
			   "EA name", "FunctionConnector"
		   });
		addAnnotation
		  (getFunctionConnector_Port(),
		   source,
		   new String[] {
			   "guid", "{08786CF1-06DA-4ecf-8DD3-C530F308D3CF}",
			   "id", "659",
			   "EA name", ""
		   });
		addAnnotation
		  (functionFlowPortEClass,
		   source,
		   new String[] {
			   "guid", "{C66FD504-B39C-4042-881C-08D3C77C38BE}",
			   "id", "53",
			   "EA name", "FunctionFlowPort"
		   });
		addAnnotation
		  (getFunctionFlowPort_Direction(),
		   source,
		   new String[] {
			   "guid", "{5C884441-F9DC-40dd-BB1D-1DD5C2C1F9F3}",
			   "id", "42",
			   "EA name", "direction"
		   });
		addAnnotation
		  (getFunctionFlowPort_Type(),
		   source,
		   new String[] {
			   "guid", "{BC294377-FD70-4265-81EC-709D587A969E}",
			   "id", "600",
			   "EA name", ""
		   });
		addAnnotation
		  (getFunctionFlowPort_DefaultValue(),
		   source,
		   new String[] {
			   "guid", "{ED2EBA97-BEAF-472e-A943-B49644B1E35B}",
			   "id", "599",
			   "EA name", ""
		   });
		addAnnotation
		  (functionPortEClass,
		   source,
		   new String[] {
			   "guid", "{3539CC74-9CB1-4588-8DC1-56763EC80FCE}",
			   "id", "38",
			   "EA name", "FunctionPort"
		   });
		addAnnotation
		  (functionPowerPortEClass,
		   source,
		   new String[] {
			   "guid", "{DA3443C9-9A3F-41b5-B5AE-6F1679690758}",
			   "id", "55",
			   "EA name", "FunctionPowerPort"
		   });
		addAnnotation
		  (getFunctionPowerPort_Type(),
		   source,
		   new String[] {
			   "guid", "{E87018E5-835A-40ca-8958-EA7B23B9FA8F}",
			   "id", "598",
			   "EA name", ""
		   });
		addAnnotation
		  (functionPrototypeEClass,
		   source,
		   new String[] {
			   "guid", "{58AD2368-5DEC-4c60-9D04-5592AA08467B}",
			   "id", "44",
			   "EA name", "FunctionPrototype"
		   });
		addAnnotation
		  (functionTypeEClass,
		   source,
		   new String[] {
			   "guid", "{49E3AA17-2E8F-4a27-B9F6-B22E8248B778}",
			   "id", "42",
			   "EA name", "FunctionType"
		   });
		addAnnotation
		  (getFunctionType_IsElementary(),
		   source,
		   new String[] {
			   "guid", "{5E1BBB96-8761-4338-A6AC-B2F07E32B433}",
			   "id", "40",
			   "EA name", "isElementary"
		   });
		addAnnotation
		  (getFunctionType_PortGroup(),
		   source,
		   new String[] {
			   "guid", "{9BE4A996-E5F6-492d-ABCA-DB1237190462}",
			   "id", "644",
			   "EA name", ""
		   });
		addAnnotation
		  (getFunctionType_Connector(),
		   source,
		   new String[] {
			   "guid", "{675E9D03-0146-43ff-9086-C754A9FA69EA}",
			   "id", "656",
			   "EA name", ""
		   });
		addAnnotation
		  (getFunctionType_Port(),
		   source,
		   new String[] {
			   "guid", "{A81C4B4A-221A-42b1-AE7D-0F3B943394B5}",
			   "id", "671",
			   "EA name", ""
		   });
		addAnnotation
		  (hardwareFunctionTypeEClass,
		   source,
		   new String[] {
			   "guid", "{EC92E36B-69A9-4237-8642-6FC1E2849578}",
			   "id", "56",
			   "EA name", "HardwareFunctionType"
		   });
		addAnnotation
		  (getHardwareFunctionType_HardwareComponent(),
		   source,
		   new String[] {
			   "guid", "{65DF489B-BF68-4800-B137-072573689AB2}",
			   "id", "597",
			   "EA name", ""
		   });
		addAnnotation
		  (localDeviceManagerEClass,
		   source,
		   new String[] {
			   "guid", "{6AC62F42-8EC0-4052-B5FE-6A05E4DAC1B3}",
			   "id", "47",
			   "EA name", "LocalDeviceManager"
		   });
		addAnnotation
		  (operationEClass,
		   source,
		   new String[] {
			   "guid", "{495B3F7E-D740-4376-956C-8802DC157BE6}",
			   "id", "41",
			   "EA name", "Operation"
		   });
		addAnnotation
		  (getOperation_Return(),
		   source,
		   new String[] {
			   "guid", "{DE0D9A1E-F182-4ad3-9AB6-86ACDA06FF34}",
			   "id", "650",
			   "EA name", ""
		   });
		addAnnotation
		  (getOperation_Argument(),
		   source,
		   new String[] {
			   "guid", "{D3FA2F8E-C7DA-4e41-8EE2-25C86BE0F382}",
			   "id", "651",
			   "EA name", ""
		   });
		addAnnotation
		  (portGroupEClass,
		   source,
		   new String[] {
			   "guid", "{8530392A-D9F3-468f-9ABE-775410A7EFEA}",
			   "id", "50",
			   "EA name", "PortGroup"
		   });
		addAnnotation
		  (getPortGroup_PortGroup(),
		   source,
		   new String[] {
			   "guid", "{B9130A83-778C-4324-A5F6-6EF9D6969514}",
			   "id", "608",
			   "EA name", ""
		   });
		addAnnotation
		  (getPortGroup_Port(),
		   source,
		   new String[] {
			   "guid", "{104D41E9-2C9C-4425-9675-695D5B4D8FCC}",
			   "id", "681",
			   "EA name", ""
		   });
		addAnnotation
		  (functionAllocation_allocatedElementEClass,
		   source,
		   new String[] {
			   "guid", "{BFC688AB-66B4-4708-840A-20D3A84DCBDB}",
			   "id", "61",
			   "EA name", "FunctionAllocation_allocatedElement"
		   });
		addAnnotation
		  (getFunctionAllocation_allocatedElement_AllocateableElement_context(),
		   source,
		   new String[] {
			   "guid", "{9B2636BC-F8DD-455d-A497-6A62F3945DC0}",
			   "id", "687",
			   "EA name", ""
		   });
		addAnnotation
		  (getFunctionAllocation_allocatedElement_AllocateableElement(),
		   source,
		   new String[] {
			   "guid", "{4A9493F5-E1A9-42ce-B76A-2BFFC7CB1E8C}",
			   "id", "689",
			   "EA name", ""
		   });
		addAnnotation
		  (functionAllocation_targetEClass,
		   source,
		   new String[] {
			   "guid", "{2DC82CBD-1A5F-407b-8B54-C39D0AF43453}",
			   "id", "59",
			   "EA name", "FunctionAllocation_target"
		   });
		addAnnotation
		  (getFunctionAllocation_target_AllocationTarget_context(),
		   source,
		   new String[] {
			   "guid", "{9061FF72-F509-4726-B458-331C96C4E175}",
			   "id", "595",
			   "EA name", ""
		   });
		addAnnotation
		  (getFunctionAllocation_target_AllocationTarget(),
		   source,
		   new String[] {
			   "guid", "{383F0976-221A-4358-9515-8EE808F7C07F}",
			   "id", "596",
			   "EA name", ""
		   });
		addAnnotation
		  (functionConnector_portEClass,
		   source,
		   new String[] {
			   "guid", "{527FF4D4-61FC-4db3-BFD2-AF17B822EB3D}",
			   "id", "60",
			   "EA name", "FunctionConnector_port"
		   });
		addAnnotation
		  (getFunctionConnector_port_FunctionPrototype(),
		   source,
		   new String[] {
			   "guid", "{30EE37E6-C38C-4021-A49D-721B759870D0}",
			   "id", "634",
			   "EA name", ""
		   });
		addAnnotation
		  (getFunctionConnector_port_FunctionPort(),
		   source,
		   new String[] {
			   "guid", "{41E5A08C-358B-4971-9D2A-B92713B6536D}",
			   "id", "678",
			   "EA name", ""
		   });
		addAnnotation
		  (actuatorEClass,
		   source,
		   new String[] {
			   "guid", "{856A8DAD-76A2-437c-BD21-2B6A2D5480E4}",
			   "id", "71",
			   "EA name", "Actuator"
		   });
		addAnnotation
		  (communicationHardwarePinEClass,
		   source,
		   new String[] {
			   "guid", "{699DF6A3-DE76-40f2-BFBC-F23393B0756D}",
			   "id", "66",
			   "EA name", "CommunicationHardwarePin"
		   });
		addAnnotation
		  (electricalComponentEClass,
		   source,
		   new String[] {
			   "guid", "{811FB5A2-1515-4099-9551-28C81B74C32A}",
			   "id", "69",
			   "EA name", "ElectricalComponent"
		   });
		addAnnotation
		  (getElectricalComponent_IsActive(),
		   source,
		   new String[] {
			   "guid", "{DCC2DDA2-C739-468b-BE1F-EC8B0B419EEE}",
			   "id", "53",
			   "EA name", "isActive"
		   });
		addAnnotation
		  (hardwareBusKindEEnum,
		   source,
		   new String[] {
			   "guid", "{60C5AC3B-B9C2-4381-84A6-7A931BE35EE1}",
			   "id", "65",
			   "EA name", "HardwareBusKind"
		   });
		addAnnotation
		  (hardwareComponentPrototypeEClass,
		   source,
		   new String[] {
			   "guid", "{713C68FF-BB2B-43c2-9DF7-0123D98B37C4}",
			   "id", "67",
			   "EA name", "HardwareComponentPrototype"
		   });
		addAnnotation
		  (getHardwareComponentPrototype_Type(),
		   source,
		   new String[] {
			   "guid", "{F5B0C598-2834-4558-AA2A-3E948177C76D}",
			   "id", "566",
			   "EA name", ""
		   });
		addAnnotation
		  (hardwareComponentTypeEClass,
		   source,
		   new String[] {
			   "guid", "{F850D1D4-02F6-4e8a-A2D9-A17A1CF88DED}",
			   "id", "77",
			   "EA name", "HardwareComponentType"
		   });
		addAnnotation
		  (getHardwareComponentType_Pin(),
		   source,
		   new String[] {
			   "guid", "{12E210BA-92FD-4a37-AD85-B3ACF51D5EEA}",
			   "id", "558",
			   "EA name", ""
		   });
		addAnnotation
		  (getHardwareComponentType_Part(),
		   source,
		   new String[] {
			   "guid", "{0C83D1F4-FDA7-4f76-A806-7A0F772FC2DF}",
			   "id", "579",
			   "EA name", ""
		   });
		addAnnotation
		  (getHardwareComponentType_Connector(),
		   source,
		   new String[] {
			   "guid", "{FE87A764-6E97-4133-90BF-62F674E7E868}",
			   "id", "581",
			   "EA name", ""
		   });
		addAnnotation
		  (getHardwareComponentType_Port(),
		   source,
		   new String[] {
			   "guid", "{9D06EF26-078C-491b-A40C-59236BD80B94}",
			   "id", "546",
			   "EA name", ""
		   });
		addAnnotation
		  (getHardwareComponentType_PortConnector(),
		   source,
		   new String[] {
			   "guid", "{93BB2A53-63BB-4724-986C-41F7897F21D0}",
			   "id", "590",
			   "EA name", ""
		   });
		addAnnotation
		  (hardwareConnectorEClass,
		   source,
		   new String[] {
			   "guid", "{5A2BFB83-CF90-464a-861C-B401F27A2139}",
			   "id", "64",
			   "EA name", "HardwareConnector"
		   });
		addAnnotation
		  (getHardwareConnector_Port(),
		   source,
		   new String[] {
			   "guid", "{045A446B-B69C-459f-A27F-AAFE827A64CD}",
			   "id", "586",
			   "EA name", ""
		   });
		addAnnotation
		  (hardwarePinEClass,
		   source,
		   new String[] {
			   "guid", "{98022932-54F8-4d59-B679-54828A48EA21}",
			   "id", "72",
			   "EA name", "HardwarePin"
		   });
		addAnnotation
		  (getHardwarePin_Direction(),
		   source,
		   new String[] {
			   "guid", "{FFE99615-1A29-4ae0-8F52-AAB82427043B}",
			   "id", "54",
			   "EA name", "direction"
		   });
		addAnnotation
		  (getHardwarePin_IsGround(),
		   source,
		   new String[] {
			   "guid", "{EA0CCAA5-F152-4fbc-AAC1-D87E0A82C32D}",
			   "id", "55",
			   "EA name", "isGround"
		   });
		addAnnotation
		  (hardwarePortEClass,
		   source,
		   new String[] {
			   "guid", "{A6C752FF-247C-4782-A671-EE3D86AC5028}",
			   "id", "74",
			   "EA name", "HardwarePort"
		   });
		addAnnotation
		  (getHardwarePort_IsShield(),
		   source,
		   new String[] {
			   "guid", "{1CACE436-2824-46a4-A964-B557592AA32A}",
			   "id", "57",
			   "EA name", "isShield"
		   });
		addAnnotation
		  (getHardwarePort_ContainedPin(),
		   source,
		   new String[] {
			   "guid", "{C5347C2A-0716-4775-907B-392DC7E28AB8}",
			   "id", "550",
			   "EA name", ""
		   });
		addAnnotation
		  (getHardwarePort_ContainedPort(),
		   source,
		   new String[] {
			   "guid", "{14391AD1-846F-4e1e-997F-1FEB0CDF0A57}",
			   "id", "549",
			   "EA name", ""
		   });
		addAnnotation
		  (getHardwarePort_ReferencedPin(),
		   source,
		   new String[] {
			   "guid", "{5D6381B6-D179-41c6-9D1A-4B2BDFB31AFA}",
			   "id", "553",
			   "EA name", ""
		   });
		addAnnotation
		  (hardwarePortConnectorEClass,
		   source,
		   new String[] {
			   "guid", "{B2E37CF6-5FCD-45d5-BA73-03208CC7627F}",
			   "id", "341",
			   "EA name", "HardwarePortConnector"
		   });
		addAnnotation
		  (getHardwarePortConnector_Connector(),
		   source,
		   new String[] {
			   "guid", "{7A73A93C-376A-4b21-9F62-1811EFDC1ECB}",
			   "id", "591",
			   "EA name", ""
		   });
		addAnnotation
		  (ioHardwarePinEClass,
		   source,
		   new String[] {
			   "guid", "{A04B3394-5337-4770-8A4C-B2BA8A8B24C2}",
			   "id", "73",
			   "EA name", "IOHardwarePin"
		   });
		addAnnotation
		  (getIOHardwarePin_Kind(),
		   source,
		   new String[] {
			   "guid", "{62535CD1-4C0F-439d-B75C-D6E4D6B143B6}",
			   "id", "56",
			   "EA name", "kind"
		   });
		addAnnotation
		  (ioHardwarePinKindEEnum,
		   source,
		   new String[] {
			   "guid", "{B66B161C-B428-46a2-B8F0-6C9FCF8AA799}",
			   "id", "75",
			   "EA name", "IOHardwarePinKind"
		   });
		addAnnotation
		  (logicalPortConnectorEClass,
		   source,
		   new String[] {
			   "guid", "{2DD74900-7819-4c9d-B3F6-C9E8173E0BCC}",
			   "id", "340",
			   "EA name", "LogicalPortConnector"
		   });
		addAnnotation
		  (getLogicalPortConnector_Kind(),
		   source,
		   new String[] {
			   "guid", "{344894C8-0702-4062-B1F0-6244BEF805B2}",
			   "id", "242",
			   "EA name", "kind"
		   });
		addAnnotation
		  (getLogicalPortConnector_BusSpeed(),
		   source,
		   new String[] {
			   "guid", "{A17DAF5B-F5B1-4fd7-A3A3-A8606F418BD7}",
			   "id", "241",
			   "EA name", "busSpeed"
		   });
		addAnnotation
		  (nodeEClass,
		   source,
		   new String[] {
			   "guid", "{74DF80A4-4CCE-42d8-8DA5-D0FAF022D2D5}",
			   "id", "68",
			   "EA name", "Node"
		   });
		addAnnotation
		  (getNode_ExecutionRate(),
		   source,
		   new String[] {
			   "guid", "{128CCBC8-300C-49fd-943E-2A0FD32A46E8}",
			   "id", "52",
			   "EA name", "executionRate"
		   });
		addAnnotation
		  (portConnectorEClass,
		   source,
		   new String[] {
			   "guid", "{13CD52D4-1F53-4be2-9264-00E219AE7E83}",
			   "id", "62",
			   "EA name", "PortConnector"
		   });
		addAnnotation
		  (getPortConnector_Port(),
		   source,
		   new String[] {
			   "guid", "{9480F58F-5086-4dd1-9391-1CCBD530026E}",
			   "id", "589",
			   "EA name", ""
		   });
		addAnnotation
		  (powerHardwarePinEClass,
		   source,
		   new String[] {
			   "guid", "{CF43E170-E6A0-4170-B7E1-B8F29C4C633C}",
			   "id", "76",
			   "EA name", "PowerHardwarePin"
		   });
		addAnnotation
		  (sensorEClass,
		   source,
		   new String[] {
			   "guid", "{4104D948-2E18-4382-A4C4-7D5E900A0638}",
			   "id", "63",
			   "EA name", "Sensor"
		   });
		addAnnotation
		  (allocationTargetEClass,
		   source,
		   new String[] {
			   "guid", "{81B9C7B6-767B-4e93-944F-ECABCE1EC722}",
			   "id", "70",
			   "EA name", "AllocationTarget"
		   });
		addAnnotation
		  (hardwareConnector_portEClass,
		   source,
		   new String[] {
			   "guid", "{A026C05F-7FC6-4c46-843F-5D2086B56565}",
			   "id", "79",
			   "EA name", "HardwareConnector_port"
		   });
		addAnnotation
		  (getHardwareConnector_port_HardwarePin(),
		   source,
		   new String[] {
			   "guid", "{010A420A-407F-4eb1-B040-2C2AA4DCD91B}",
			   "id", "560",
			   "EA name", ""
		   });
		addAnnotation
		  (getHardwareConnector_port_HardwareComponentPrototype(),
		   source,
		   new String[] {
			   "guid", "{E3B999A4-29A7-4966-9AA6-31443620B999}",
			   "id", "569",
			   "EA name", ""
		   });
		addAnnotation
		  (hardwarePortConnector_portEClass,
		   source,
		   new String[] {
			   "guid", "{C8A001F2-4DBE-4251-AA6D-C9EDFA45F14E}",
			   "id", "80",
			   "EA name", "HardwarePortConnector_port"
		   });
		addAnnotation
		  (getHardwarePortConnector_port_HardwarePort(),
		   source,
		   new String[] {
			   "guid", "{FC79F778-FDA8-44ac-AB77-45B514F10D0C}",
			   "id", "545",
			   "EA name", ""
		   });
		addAnnotation
		  (getHardwarePortConnector_port_HardwareComponentPrototype(),
		   source,
		   new String[] {
			   "guid", "{C2E8CDA0-92AA-4322-91D5-97BC4ABB70C7}",
			   "id", "571",
			   "EA name", ""
		   });
		addAnnotation
		  (commentEClass,
		   source,
		   new String[] {
			   "guid", "{2287958E-8753-4127-A7F0-EF7674C93E07}",
			   "id", "243",
			   "EA name", "Comment"
		   });
		addAnnotation
		  (getComment_Body(),
		   source,
		   new String[] {
			   "guid", "{B9D51FAE-5DE0-4d76-9A6D-4526635B8C04}",
			   "id", "182",
			   "EA name", "body"
		   });
		addAnnotation
		  (contextEClass,
		   source,
		   new String[] {
			   "guid", "{C196A58B-83D2-40ab-B7CC-A1F39DB7DEB3}",
			   "id", "252",
			   "EA name", "Context"
		   });
		addAnnotation
		  (getContext_TraceableSpecification(),
		   source,
		   new String[] {
			   "guid", "{7E9C04D7-A9C1-4729-AAFF-DA6E3396E495}",
			   "id", "125",
			   "EA name", ""
		   });
		addAnnotation
		  (getContext_OwnedRelationship(),
		   source,
		   new String[] {
			   "guid", "{1102A3E5-90C7-41f5-828C-AC734F1E6723}",
			   "id", "131",
			   "EA name", ""
		   });
		addAnnotation
		  (eaConnectorEClass,
		   source,
		   new String[] {
			   "guid", "{01765C94-3C29-4707-A220-4A087EF7715D}",
			   "id", "240",
			   "EA name", "EAConnector"
		   });
		addAnnotation
		  (eaElementEClass,
		   source,
		   new String[] {
			   "guid", "{32EE025B-F605-4638-832C-ACA586A730B6}",
			   "id", "245",
			   "EA name", "EAElement"
		   });
		addAnnotation
		  (getEAElement_Name(),
		   source,
		   new String[] {
			   "guid", "{CABA8034-2E7C-457f-A46F-F57744416604}",
			   "id", "185",
			   "EA name", "name"
		   });
		addAnnotation
		  (getEAElement_OwnedComment(),
		   source,
		   new String[] {
			   "guid", "{A0343AF4-B8B1-4ed5-8185-7900200397CF}",
			   "id", "173",
			   "EA name", ""
		   });
		addAnnotation
		  (eaPackageEClass,
		   source,
		   new String[] {
			   "guid", "{E7054AFB-DD6D-4422-AA3B-77AFB8D6A983}",
			   "id", "254",
			   "EA name", "EAPackage"
		   });
		addAnnotation
		  (getEAPackage_SubPackage(),
		   source,
		   new String[] {
			   "guid", "{D850CEAE-A007-4533-A892-46677485ED90}",
			   "id", "120",
			   "EA name", ""
		   });
		addAnnotation
		  (getEAPackage_Element(),
		   source,
		   new String[] {
			   "guid", "{438A6683-48C5-4af2-A6DE-B32B0F043990}",
			   "id", "141",
			   "EA name", ""
		   });
		addAnnotation
		  (eaPackageableElementEClass,
		   source,
		   new String[] {
			   "guid", "{686C8F6A-E793-4d92-AF88-2BEBF5B710DA}",
			   "id", "247",
			   "EA name", "EAPackageableElement"
		   });
		addAnnotation
		  (eaPortEClass,
		   source,
		   new String[] {
			   "guid", "{10698331-4A64-42ad-A197-3DAC8FEC8CBA}",
			   "id", "241",
			   "EA name", "EAPort"
		   });
		addAnnotation
		  (eaPrototypeEClass,
		   source,
		   new String[] {
			   "guid", "{1E1AF782-BA77-49a6-B9E4-B1D058AA66E9}",
			   "id", "242",
			   "EA name", "EAPrototype"
		   });
		addAnnotation
		  (eaTypeEClass,
		   source,
		   new String[] {
			   "guid", "{E5FBF4BB-C662-479e-98EE-DBCF4FFA6DDF}",
			   "id", "253",
			   "EA name", "EAType"
		   });
		addAnnotation
		  (eaxmlEClass,
		   source,
		   new String[] {
			   "guid", "{913C0AF8-1B68-42bd-B8F7-1CA700DDA2CF}",
			   "id", "249",
			   "EA name", "EAXML"
		   });
		addAnnotation
		  (getEAXML_TopLevelPackage(),
		   source,
		   new String[] {
			   "guid", "{33C94FC6-4B90-454c-9FA5-447A9B612F69}",
			   "id", "133",
			   "EA name", ""
		   });
		addAnnotation
		  (rationaleEClass,
		   source,
		   new String[] {
			   "guid", "{F31CFE0D-DFD8-4810-B1D9-5CB23BCD25E3}",
			   "id", "255",
			   "EA name", "Rationale"
		   });
		addAnnotation
		  (realizationEClass,
		   source,
		   new String[] {
			   "guid", "{6CF0316D-200B-4d0d-AE92-7C7D20905731}",
			   "id", "248",
			   "EA name", "Realization"
		   });
		addAnnotation
		  (getRealization_Realized(),
		   source,
		   new String[] {
			   "guid", "{5C463577-4933-4e60-B3EE-D0DDB794EE5C}",
			   "id", "136",
			   "EA name", ""
		   });
		addAnnotation
		  (getRealization_RealizedBy(),
		   source,
		   new String[] {
			   "guid", "{89C72DED-7AAC-495c-AEDE-CA8C82A68340}",
			   "id", "135",
			   "EA name", ""
		   });
		addAnnotation
		  (referrableEClass,
		   source,
		   new String[] {
			   "guid", "{462AFDC8-1694-4a1f-8FF9-D1315369EAEC}",
			   "id", "246",
			   "EA name", "Referrable"
		   });
		addAnnotation
		  (getReferrable_ShortName(),
		   source,
		   new String[] {
			   "guid", "{3FE09079-22D7-4736-82A5-5C743E31871E}",
			   "id", "186",
			   "EA name", "shortName"
		   });
		addAnnotation
		  (relationshipEClass,
		   source,
		   new String[] {
			   "guid", "{93F6186A-7622-480a-98D0-A92E9099135A}",
			   "id", "250",
			   "EA name", "Relationship"
		   });
		addAnnotation
		  (traceableSpecificationEClass,
		   source,
		   new String[] {
			   "guid", "{AF13C9C7-B586-4065-99EF-6BF79895687C}",
			   "id", "251",
			   "EA name", "TraceableSpecification"
		   });
		addAnnotation
		  (getTraceableSpecification_Text(),
		   source,
		   new String[] {
			   "guid", "{3E99F740-2125-4cd5-8534-D3E8C40C7B70}",
			   "id", "187",
			   "EA name", "text"
		   });
		addAnnotation
		  (getTraceableSpecification_Uri(),
		   source,
		   new String[] {
			   "guid", "{603BA755-EBD1-4714-9CD3-21C6E6B21456}",
			   "id", "243",
			   "EA name", "uri"
		   });
		addAnnotation
		  (identifiableEClass,
		   source,
		   new String[] {
			   "guid", "{2860CE0C-2776-4873-8C44-223AAF7DF8F3}",
			   "id", "244",
			   "EA name", "Identifiable"
		   });
		addAnnotation
		  (getIdentifiable_Category(),
		   source,
		   new String[] {
			   "guid", "{08AA5134-D7F8-4560-B626-A952B30D27CF}",
			   "id", "183",
			   "EA name", "category"
		   });
		addAnnotation
		  (getIdentifiable_Uuid(),
		   source,
		   new String[] {
			   "guid", "{C090F23D-AA65-44a7-A0CE-F1626239B24F}",
			   "id", "184",
			   "EA name", "uuid"
		   });
		addAnnotation
		  (realization_realizedEClass,
		   source,
		   new String[] {
			   "guid", "{26C21A3A-94DC-494a-9005-33BE217ADF44}",
			   "id", "258",
			   "EA name", "Realization_realized"
		   });
		addAnnotation
		  (getRealization_realized_Identifiable_target(),
		   source,
		   new String[] {
			   "guid", "{F4913E5B-B4B9-4266-91B0-3151474B658F}",
			   "id", "147",
			   "EA name", ""
		   });
		addAnnotation
		  (getRealization_realized_Identifiable_context(),
		   source,
		   new String[] {
			   "guid", "{39A71433-8663-4ecd-B4B9-269D03DADD8C}",
			   "id", "163",
			   "EA name", ""
		   });
		addAnnotation
		  (realization_realizedByEClass,
		   source,
		   new String[] {
			   "guid", "{25084276-AADD-4a2a-8DE3-678D62CB7894}",
			   "id", "257",
			   "EA name", "Realization_realizedBy"
		   });
		addAnnotation
		  (getRealization_realizedBy_Identifiable_target(),
		   source,
		   new String[] {
			   "guid", "{F19A7A4F-F6CD-4888-8377-5E869D856E87}",
			   "id", "167",
			   "EA name", ""
		   });
		addAnnotation
		  (getRealization_realizedBy_Identifiable_context(),
		   source,
		   new String[] {
			   "guid", "{218B0D37-1F8C-4f18-B7B3-CA512E924BC7}",
			   "id", "170",
			   "EA name", ""
		   });
		addAnnotation
		  (arrayDatatypeEClass,
		   source,
		   new String[] {
			   "guid", "{7D607C58-8A67-4b3a-82C7-1268A035D1E1}",
			   "id", "263",
			   "EA name", "ArrayDatatype"
		   });
		addAnnotation
		  (getArrayDatatype_MaxLength(),
		   source,
		   new String[] {
			   "guid", "{15950005-1114-4549-850B-CA48EAC260EF}",
			   "id", "189",
			   "EA name", "maxLength"
		   });
		addAnnotation
		  (getArrayDatatype_MinLength(),
		   source,
		   new String[] {
			   "guid", "{C3125712-83B6-448d-AA16-B865C8FF4341}",
			   "id", "190",
			   "EA name", "minLength"
		   });
		addAnnotation
		  (getArrayDatatype_ElementType(),
		   source,
		   new String[] {
			   "guid", "{EE93265B-1F16-4edd-AA26-35AD5C32383E}",
			   "id", "109",
			   "EA name", ""
		   });
		addAnnotation
		  (compositeDatatypeEClass,
		   source,
		   new String[] {
			   "guid", "{0E778F31-4152-4ce5-B51E-104870A55EDC}",
			   "id", "260",
			   "EA name", "CompositeDatatype"
		   });
		addAnnotation
		  (getCompositeDatatype_DatatypePrototype(),
		   source,
		   new String[] {
			   "guid", "{71E9D2EB-EBB4-4535-AF2E-0F465CC498FA}",
			   "id", "107",
			   "EA name", ""
		   });
		addAnnotation
		  (eaBooleanEClass,
		   source,
		   new String[] {
			   "guid", "{8DE10996-BEC1-44e0-94E3-CB124D2A694C}",
			   "id", "264",
			   "EA name", "EABoolean"
		   });
		addAnnotation
		  (eaDatatypeEClass,
		   source,
		   new String[] {
			   "guid", "{01E487F6-8AE2-4620-A617-B482404D8FFE}",
			   "id", "259",
			   "EA name", "EADatatype"
		   });
		addAnnotation
		  (eaDatatypePrototypeEClass,
		   source,
		   new String[] {
			   "guid", "{193FFECB-A63A-4e69-893D-78F409864CB6}",
			   "id", "261",
			   "EA name", "EADatatypePrototype"
		   });
		addAnnotation
		  (getEADatatypePrototype_Type(),
		   source,
		   new String[] {
			   "guid", "{579BDBF6-CE24-473d-B7EB-FD6C6D8C5787}",
			   "id", "117",
			   "EA name", ""
		   });
		addAnnotation
		  (eaNumericalEClass,
		   source,
		   new String[] {
			   "guid", "{C3B7BF74-6A76-4a54-994D-79812BADB92B}",
			   "id", "266",
			   "EA name", "EANumerical"
		   });
		addAnnotation
		  (getEANumerical_Max(),
		   source,
		   new String[] {
			   "guid", "{C25DD0A8-12A0-4bc5-BC92-21570DBF9E1C}",
			   "id", "198",
			   "EA name", "max"
		   });
		addAnnotation
		  (getEANumerical_Min(),
		   source,
		   new String[] {
			   "guid", "{6800E957-5D78-4ccd-9A07-F217138D38BE}",
			   "id", "199",
			   "EA name", "min"
		   });
		addAnnotation
		  (getEANumerical_Unit(),
		   source,
		   new String[] {
			   "guid", "{1CDCA2F1-BC75-4118-BD18-E4DDC077EEAF}",
			   "id", "104",
			   "EA name", ""
		   });
		addAnnotation
		  (eaStringEClass,
		   source,
		   new String[] {
			   "guid", "{C3F56F1F-F3EE-44a2-BA35-C6B0FBC88EBF}",
			   "id", "267",
			   "EA name", "EAString"
		   });
		addAnnotation
		  (enumerationEClass,
		   source,
		   new String[] {
			   "guid", "{1C38542B-750C-400a-84E6-ED07357E8D81}",
			   "id", "262",
			   "EA name", "Enumeration"
		   });
		addAnnotation
		  (getEnumeration_IsMultiValued(),
		   source,
		   new String[] {
			   "guid", "{8CE013ED-5893-48c6-9CAA-F0ABA98C7FC8}",
			   "id", "188",
			   "EA name", "isMultiValued"
		   });
		addAnnotation
		  (getEnumeration_Literal(),
		   source,
		   new String[] {
			   "guid", "{6952ECD4-6D2C-49c8-945A-9AF4F6C8AEB2}",
			   "id", "106",
			   "EA name", ""
		   });
		addAnnotation
		  (enumerationLiteralEClass,
		   source,
		   new String[] {
			   "guid", "{C988DA98-DE18-4178-AAD3-0D95CF706E25}",
			   "id", "268",
			   "EA name", "EnumerationLiteral"
		   });
		addAnnotation
		  (quantityEClass,
		   source,
		   new String[] {
			   "guid", "{9A214F41-622B-474d-9FD8-133338E36FBF}",
			   "id", "265",
			   "EA name", "Quantity"
		   });
		addAnnotation
		  (getQuantity_AmountOfSubstanceExp(),
		   source,
		   new String[] {
			   "guid", "{FD6D780D-6692-4852-9446-3B1F9BF25F25}",
			   "id", "191",
			   "EA name", "amountOfSubstanceExp"
		   });
		addAnnotation
		  (getQuantity_ElectricCurrentExp(),
		   source,
		   new String[] {
			   "guid", "{60D49918-E376-4522-A81F-E0A05F76AF50}",
			   "id", "192",
			   "EA name", "electricCurrentExp"
		   });
		addAnnotation
		  (getQuantity_LengthExp(),
		   source,
		   new String[] {
			   "guid", "{C1D4278D-D4FE-4b67-A5FA-2F79D2BE7DCA}",
			   "id", "193",
			   "EA name", "lengthExp"
		   });
		addAnnotation
		  (getQuantity_LuminousIntensityExp(),
		   source,
		   new String[] {
			   "guid", "{A0748C47-CFBD-466b-BAB3-CC7FB5EF2B1A}",
			   "id", "194",
			   "EA name", "luminousIntensityExp"
		   });
		addAnnotation
		  (getQuantity_MassExp(),
		   source,
		   new String[] {
			   "guid", "{0D1E18D0-4B5B-4534-91CC-2D07AE83AD3D}",
			   "id", "195",
			   "EA name", "massExp"
		   });
		addAnnotation
		  (getQuantity_ThermodynamicTemperatureExp(),
		   source,
		   new String[] {
			   "guid", "{C746E241-A891-4338-8B1F-C8321C50CD62}",
			   "id", "196",
			   "EA name", "thermodynamicTemperatureExp"
		   });
		addAnnotation
		  (getQuantity_TimeExp(),
		   source,
		   new String[] {
			   "guid", "{83A2FF1C-B49A-4e63-AF5E-F8C9E83640D5}",
			   "id", "197",
			   "EA name", "timeExp"
		   });
		addAnnotation
		  (rangeableValueTypeEClass,
		   source,
		   new String[] {
			   "guid", "{F91A2609-CAE8-45ee-B554-475516D6AA50}",
			   "id", "270",
			   "EA name", "RangeableValueType"
		   });
		addAnnotation
		  (getRangeableValueType_Accuracy(),
		   source,
		   new String[] {
			   "guid", "{4FF031B7-25F8-49d6-8E60-939E81519C03}",
			   "id", "203",
			   "EA name", "accuracy"
		   });
		addAnnotation
		  (getRangeableValueType_Resolution(),
		   source,
		   new String[] {
			   "guid", "{1AC5048F-DCC4-4963-B10F-0FD142E8C247}",
			   "id", "204",
			   "EA name", "resolution"
		   });
		addAnnotation
		  (getRangeableValueType_SignificantDigits(),
		   source,
		   new String[] {
			   "guid", "{12B85D1C-E996-4b27-9526-255B0990F4F4}",
			   "id", "205",
			   "EA name", "significantDigits"
		   });
		addAnnotation
		  (getRangeableValueType_BaseRangeable(),
		   source,
		   new String[] {
			   "guid", "{9D58C294-993F-4b4f-B075-8A9799F7CD0F}",
			   "id", "103",
			   "EA name", ""
		   });
		addAnnotation
		  (unitEClass,
		   source,
		   new String[] {
			   "guid", "{E09D0995-9F42-4d54-AD8D-3FC95579FEAE}",
			   "id", "269",
			   "EA name", "Unit"
		   });
		addAnnotation
		  (getUnit_Factor(),
		   source,
		   new String[] {
			   "guid", "{669E9CED-532C-4f45-A2D3-DC4DA6590C0E}",
			   "id", "200",
			   "EA name", "factor"
		   });
		addAnnotation
		  (getUnit_Symbol(),
		   source,
		   new String[] {
			   "guid", "{453C7108-FD8D-4cf7-890D-F44BE696259E}",
			   "id", "202",
			   "EA name", "symbol"
		   });
		addAnnotation
		  (getUnit_Offset(),
		   source,
		   new String[] {
			   "guid", "{DEF5AF97-7DED-481a-BB54-2E859CBF055E}",
			   "id", "201",
			   "EA name", "offset"
		   });
		addAnnotation
		  (getUnit_Reference(),
		   source,
		   new String[] {
			   "guid", "{9E5F8FC8-F6BB-4269-B7EA-C42929D60354}",
			   "id", "101",
			   "EA name", ""
		   });
		addAnnotation
		  (getUnit_Quantity(),
		   source,
		   new String[] {
			   "guid", "{3E8151DE-C7BC-4b83-A540-D90849643BEA}",
			   "id", "105",
			   "EA name", ""
		   });
		addAnnotation
		  (eaArrayValueEClass,
		   source,
		   new String[] {
			   "guid", "{522E6AF4-A0B3-4606-9FA4-75131A3115EC}",
			   "id", "274",
			   "EA name", "EAArrayValue"
		   });
		addAnnotation
		  (getEAArrayValue_Value(),
		   source,
		   new String[] {
			   "guid", "{7A58A32F-F269-4dc4-884F-EFF0BD7E8D0F}",
			   "id", "94",
			   "EA name", ""
		   });
		addAnnotation
		  (eaBooleanValueEClass,
		   source,
		   new String[] {
			   "guid", "{26A6AA76-7DC1-4efc-AE80-99EA0F9F892E}",
			   "id", "271",
			   "EA name", "EABooleanValue"
		   });
		addAnnotation
		  (getEABooleanValue_Value(),
		   source,
		   new String[] {
			   "guid", "{4EF5F62D-1016-4aa5-A94A-B9ED68EB92D3}",
			   "id", "206",
			   "EA name", "value"
		   });
		addAnnotation
		  (eaCompositeValueEClass,
		   source,
		   new String[] {
			   "guid", "{C75CA405-1DF7-4732-8BA9-35E62A0A6BD3}",
			   "id", "277",
			   "EA name", "EACompositeValue"
		   });
		addAnnotation
		  (getEACompositeValue_Value(),
		   source,
		   new String[] {
			   "guid", "{FAE9286C-FBCF-4759-9DC8-A6CCF7104286}",
			   "id", "84",
			   "EA name", ""
		   });
		addAnnotation
		  (eaEnumerationValueEClass,
		   source,
		   new String[] {
			   "guid", "{3D2374C5-E3D6-4dd4-9029-D81A4E41938F}",
			   "id", "273",
			   "EA name", "EAEnumerationValue"
		   });
		addAnnotation
		  (getEAEnumerationValue_Value(),
		   source,
		   new String[] {
			   "guid", "{674E5981-E731-4d98-9F3A-E180D6F4CAB6}",
			   "id", "102",
			   "EA name", ""
		   });
		addAnnotation
		  (eaExpressionEClass,
		   source,
		   new String[] {
			   "guid", "{2FCEE92E-A893-4601-AA4D-52CE3A301564}",
			   "id", "272",
			   "EA name", "EAExpression"
		   });
		addAnnotation
		  (getEAExpression_Value(),
		   source,
		   new String[] {
			   "guid", "{BB0F6AA7-5FD9-4131-9864-BD309D412AF3}",
			   "id", "768",
			   "EA name", ""
		   });
		addAnnotation
		  (eaNumericalValueEClass,
		   source,
		   new String[] {
			   "guid", "{76BC30C9-D7F4-4f40-BD77-D87AB50B3E2C}",
			   "id", "275",
			   "EA name", "EANumericalValue"
		   });
		addAnnotation
		  (getEANumericalValue_Value(),
		   source,
		   new String[] {
			   "guid", "{F96B188B-0E55-4624-A088-E49B88CC7F66}",
			   "id", "207",
			   "EA name", "value"
		   });
		addAnnotation
		  (eaStringValueEClass,
		   source,
		   new String[] {
			   "guid", "{F6D6431D-A664-4f4f-BCA0-821C62B7AC74}",
			   "id", "278",
			   "EA name", "EAStringValue"
		   });
		addAnnotation
		  (getEAStringValue_Value(),
		   source,
		   new String[] {
			   "guid", "{DB4FD27C-3702-4e69-B136-D8C953EE1FBE}",
			   "id", "208",
			   "EA name", "value"
		   });
		addAnnotation
		  (eaValueEClass,
		   source,
		   new String[] {
			   "guid", "{A1C876A3-2D63-4c68-9339-009B0F4E5DFF}",
			   "id", "276",
			   "EA name", "EAValue"
		   });
		addAnnotation
		  (getEAValue_Type(),
		   source,
		   new String[] {
			   "guid", "{AC4002B9-B6AF-4e27-B4CB-56928DE44554}",
			   "id", "111",
			   "EA name", ""
		   });
		addAnnotation
		  (userAttributeDefinitionEClass,
		   source,
		   new String[] {
			   "guid", "{C6168EF6-BF21-483a-AB57-29476CFCBB8B}",
			   "id", "281",
			   "EA name", "UserAttributeDefinition"
		   });
		addAnnotation
		  (getUserAttributeDefinition_DefaultValue(),
		   source,
		   new String[] {
			   "guid", "{A04DA623-AF7C-4d15-BE7B-82E61F5CE693}",
			   "id", "88",
			   "EA name", ""
		   });
		addAnnotation
		  (getUserAttributeDefinition_Type(),
		   source,
		   new String[] {
			   "guid", "{FD35CE9A-94D5-4d1c-A5FF-FB44819443A1}",
			   "id", "108",
			   "EA name", ""
		   });
		addAnnotation
		  (userAttributedElementEClass,
		   source,
		   new String[] {
			   "guid", "{A1219C54-EAEF-43a3-A1AB-5B0632893861}",
			   "id", "280",
			   "EA name", "UserAttributedElement"
		   });
		addAnnotation
		  (getUserAttributedElement_UaValue(),
		   source,
		   new String[] {
			   "guid", "{82B92190-BCF1-488d-94EB-7B0023E7D34D}",
			   "id", "90",
			   "EA name", ""
		   });
		addAnnotation
		  (getUserAttributedElement_UaType(),
		   source,
		   new String[] {
			   "guid", "{6549EA90-8651-4487-9035-C32C8856972D}",
			   "id", "83",
			   "EA name", ""
		   });
		addAnnotation
		  (getUserAttributedElement_AttributedElement(),
		   source,
		   new String[] {
			   "guid", "{E80D8C33-14DD-4a85-ADB3-32076CC892F5}",
			   "id", "168",
			   "EA name", ""
		   });
		addAnnotation
		  (userElementTypeEClass,
		   source,
		   new String[] {
			   "guid", "{2828A38E-2714-4a98-A042-2C89C672D2A0}",
			   "id", "279",
			   "EA name", "UserElementType"
		   });
		addAnnotation
		  (getUserElementType_ValidFor(),
		   source,
		   new String[] {
			   "guid", "{0AD22778-BA7C-49e5-8D0B-8758E8E80C98}",
			   "id", "210",
			   "EA name", "validFor"
		   });
		addAnnotation
		  (getUserElementType_Key(),
		   source,
		   new String[] {
			   "guid", "{E8A227AA-4D80-4355-B5BA-377F5AB266FF}",
			   "id", "209",
			   "EA name", "key"
		   });
		addAnnotation
		  (getUserElementType_UaDefinition(),
		   source,
		   new String[] {
			   "guid", "{6804EA72-C6EA-42e4-8BD9-F3BF13F4F8C6}",
			   "id", "82",
			   "EA name", ""
		   });
		addAnnotation
		  (booleanEDataType,
		   source,
		   new String[] {
			   "guid", "{9365CFD9-2871-41ff-87BF-C275FEACE8C1}",
			   "id", "286",
			   "EA name", "Boolean"
		   });
		addAnnotation
		  (floatEDataType,
		   source,
		   new String[] {
			   "guid", "{49898B10-8A94-41e6-BED2-7F1FAF97751A}",
			   "id", "283",
			   "EA name", "Float"
		   });
		addAnnotation
		  (identifierEDataType,
		   source,
		   new String[] {
			   "guid", "{4C96DDE8-BF90-4e35-8377-A8F6149ED921}",
			   "id", "284",
			   "EA name", "Identifier"
		   });
		addAnnotation
		  (integerEDataType,
		   source,
		   new String[] {
			   "guid", "{AF358DFF-5FE1-4156-8BA0-0797C0B9FA9F}",
			   "id", "287",
			   "EA name", "Integer"
		   });
		addAnnotation
		  (numericalEDataType,
		   source,
		   new String[] {
			   "guid", "{8F2F332E-18D3-4797-AACC-4F1249E644E6}",
			   "id", "285",
			   "EA name", "Numerical"
		   });
		addAnnotation
		  (refEDataType,
		   source,
		   new String[] {
			   "guid", "{405E6B24-05A5-4469-B58F-6A005065B3A5}",
			   "id", "282",
			   "EA name", "Ref"
		   });
		addAnnotation
		  (stringEDataType,
		   source,
		   new String[] {
			   "guid", "{E1926EE2-68FF-48ff-A194-4B3E069ADD4E}",
			   "id", "288",
			   "EA name", "String"
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXMLPersistenceMappingExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "defaultEReferenceReferencedTypeAttributeName", "TYPE"
		   });
		addAnnotation
		  (designLevelEClass,
		   source,
		   new String[] {
			   "wrapperName", "DESIGN-LEVELS"
		   });
		addAnnotation
		  (getDesignLevel_Allocation(),
		   source,
		   new String[] {
			   "wrapperName", "ALLOCATIONS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "true",
			   "featureElement", "false",
			   "classifierWrapperElement", "false",
			   "classifierElement", "true"
		   });
		addAnnotation
		  (getDesignLevel_FunctionalDesignArchitecture(),
		   source,
		   new String[] {
			   "wrapperName", "FUNCTIONAL-DESIGN-ARCHITECTURES",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (getDesignLevel_HardwareDesignArchitecture(),
		   source,
		   new String[] {
			   "wrapperName", "HARDWARE-DESIGN-ARCHITECTURES",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (allocateableElementEClass,
		   source,
		   new String[] {
			   "wrapperName", "ALLOCATEABLE-ELEMENTS"
		   });
		addAnnotation
		  (allocationEClass,
		   source,
		   new String[] {
			   "wrapperName", "ALLOCATIONS"
		   });
		addAnnotation
		  (getAllocation_FunctionAllocation(),
		   source,
		   new String[] {
			   "wrapperName", "FUNCTION-ALLOCATIONS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "true",
			   "featureElement", "false",
			   "classifierWrapperElement", "false",
			   "classifierElement", "true"
		   });
		addAnnotation
		  (analysisFunctionPrototypeEClass,
		   source,
		   new String[] {
			   "wrapperName", "ANALYSIS-FUNCTION-PROTOTYPES"
		   });
		addAnnotation
		  (getAnalysisFunctionPrototype_Type(),
		   source,
		   new String[] {
			   "wrapperName", "TYPE-TREFS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (analysisFunctionTypeEClass,
		   source,
		   new String[] {
			   "wrapperName", "ANALYSIS-FUNCTION-TYPES"
		   });
		addAnnotation
		  (getAnalysisFunctionType_Part(),
		   source,
		   new String[] {
			   "wrapperName", "PARTS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "true",
			   "featureElement", "false",
			   "classifierWrapperElement", "false",
			   "classifierElement", "true"
		   });
		addAnnotation
		  (basicSoftwareFunctionTypeEClass,
		   source,
		   new String[] {
			   "wrapperName", "BASIC-SOFTWARE-FUNCTION-TYPES"
		   });
		addAnnotation
		  (clientServerKindEEnum,
		   source,
		   new String[] {
			   "wrapperName", "CLIENT-SERVER-KINDS"
		   });
		addAnnotation
		  (designFunctionPrototypeEClass,
		   source,
		   new String[] {
			   "wrapperName", "DESIGN-FUNCTION-PROTOTYPES"
		   });
		addAnnotation
		  (getDesignFunctionPrototype_Type(),
		   source,
		   new String[] {
			   "wrapperName", "TYPE-TREFS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (designFunctionTypeEClass,
		   source,
		   new String[] {
			   "wrapperName", "DESIGN-FUNCTION-TYPES"
		   });
		addAnnotation
		  (getDesignFunctionType_Part(),
		   source,
		   new String[] {
			   "wrapperName", "PARTS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "true",
			   "featureElement", "false",
			   "classifierWrapperElement", "false",
			   "classifierElement", "true"
		   });
		addAnnotation
		  (eaDirectionKindEEnum,
		   source,
		   new String[] {
			   "wrapperName", "EA-DIRECTION-KINDS"
		   });
		addAnnotation
		  (functionalDeviceEClass,
		   source,
		   new String[] {
			   "wrapperName", "FUNCTIONAL-DEVICES"
		   });
		addAnnotation
		  (functionAllocationEClass,
		   source,
		   new String[] {
			   "wrapperName", "FUNCTION-ALLOCATIONS"
		   });
		addAnnotation
		  (getFunctionAllocation_AllocatedElement(),
		   source,
		   new String[] {
			   "wrapperName", "ALLOCATED-ELEMENT-IREFS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (getFunctionAllocation_Target(),
		   source,
		   new String[] {
			   "wrapperName", "TARGET-IREFS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (functionClientServerInterfaceEClass,
		   source,
		   new String[] {
			   "wrapperName", "FUNCTION-CLIENT-SERVER-INTERFACES"
		   });
		addAnnotation
		  (getFunctionClientServerInterface_Operation(),
		   source,
		   new String[] {
			   "wrapperName", "OPERATIONS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "true",
			   "featureElement", "false",
			   "classifierWrapperElement", "false",
			   "classifierElement", "true"
		   });
		addAnnotation
		  (functionClientServerPortEClass,
		   source,
		   new String[] {
			   "wrapperName", "FUNCTION-CLIENT-SERVER-PORTS"
		   });
		addAnnotation
		  (getFunctionClientServerPort_Kind(),
		   source,
		   new String[] {
			   "wrapperName", "KINDS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (getFunctionClientServerPort_Type(),
		   source,
		   new String[] {
			   "wrapperName", "TYPE-TREFS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (functionConnectorEClass,
		   source,
		   new String[] {
			   "wrapperName", "FUNCTION-CONNECTORS"
		   });
		addAnnotation
		  (getFunctionConnector_Port(),
		   source,
		   new String[] {
			   "wrapperName", "PORT-IREFS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "true",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (functionFlowPortEClass,
		   source,
		   new String[] {
			   "wrapperName", "FUNCTION-FLOW-PORTS"
		   });
		addAnnotation
		  (getFunctionFlowPort_Direction(),
		   source,
		   new String[] {
			   "wrapperName", "DIRECTIONS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (getFunctionFlowPort_Type(),
		   source,
		   new String[] {
			   "wrapperName", "TYPE-TREFS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (getFunctionFlowPort_DefaultValue(),
		   source,
		   new String[] {
			   "wrapperName", "DEFAULT-VALUES",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "true"
		   });
		addAnnotation
		  (functionPortEClass,
		   source,
		   new String[] {
			   "wrapperName", "FUNCTION-PORTS"
		   });
		addAnnotation
		  (functionPowerPortEClass,
		   source,
		   new String[] {
			   "wrapperName", "FUNCTION-POWER-PORTS"
		   });
		addAnnotation
		  (getFunctionPowerPort_Type(),
		   source,
		   new String[] {
			   "wrapperName", "TYPE-TREFS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (functionPrototypeEClass,
		   source,
		   new String[] {
			   "wrapperName", "FUNCTION-PROTOTYPES"
		   });
		addAnnotation
		  (functionTypeEClass,
		   source,
		   new String[] {
			   "wrapperName", "FUNCTION-TYPES"
		   });
		addAnnotation
		  (getFunctionType_IsElementary(),
		   source,
		   new String[] {
			   "wrapperName", "IS-ELEMENTARYS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (getFunctionType_PortGroup(),
		   source,
		   new String[] {
			   "wrapperName", "PORT-GROUPS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "true",
			   "featureElement", "false",
			   "classifierWrapperElement", "false",
			   "classifierElement", "true"
		   });
		addAnnotation
		  (getFunctionType_Connector(),
		   source,
		   new String[] {
			   "wrapperName", "CONNECTORS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "true",
			   "featureElement", "false",
			   "classifierWrapperElement", "false",
			   "classifierElement", "true"
		   });
		addAnnotation
		  (getFunctionType_Port(),
		   source,
		   new String[] {
			   "wrapperName", "PORTS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "true",
			   "featureElement", "false",
			   "classifierWrapperElement", "false",
			   "classifierElement", "true"
		   });
		addAnnotation
		  (hardwareFunctionTypeEClass,
		   source,
		   new String[] {
			   "wrapperName", "HARDWARE-FUNCTION-TYPES"
		   });
		addAnnotation
		  (getHardwareFunctionType_HardwareComponent(),
		   source,
		   new String[] {
			   "wrapperName", "HARDWARE-COMPONENT-REFS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (localDeviceManagerEClass,
		   source,
		   new String[] {
			   "wrapperName", "LOCAL-DEVICE-MANAGERS"
		   });
		addAnnotation
		  (operationEClass,
		   source,
		   new String[] {
			   "wrapperName", "OPERATIONS"
		   });
		addAnnotation
		  (getOperation_Return(),
		   source,
		   new String[] {
			   "wrapperName", "RETURNS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (getOperation_Argument(),
		   source,
		   new String[] {
			   "wrapperName", "ARGUMENTS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "true",
			   "featureElement", "false",
			   "classifierWrapperElement", "false",
			   "classifierElement", "true"
		   });
		addAnnotation
		  (portGroupEClass,
		   source,
		   new String[] {
			   "wrapperName", "PORT-GROUPS"
		   });
		addAnnotation
		  (getPortGroup_PortGroup(),
		   source,
		   new String[] {
			   "wrapperName", "PORT-GROUPS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "true",
			   "featureElement", "false",
			   "classifierWrapperElement", "false",
			   "classifierElement", "true"
		   });
		addAnnotation
		  (getPortGroup_Port(),
		   source,
		   new String[] {
			   "wrapperName", "PORT-REFS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "true",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (functionAllocation_allocatedElementEClass,
		   source,
		   new String[] {
			   "wrapperName", "FUNCTION-ALLOCATION--ALLOCATED-ELEMENT-IREFS"
		   });
		addAnnotation
		  (getFunctionAllocation_allocatedElement_AllocateableElement_context(),
		   source,
		   new String[] {
			   "wrapperName", "ALLOCATEABLE-ELEMENT-CONTEXT-REFS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (getFunctionAllocation_allocatedElement_AllocateableElement(),
		   source,
		   new String[] {
			   "wrapperName", "ALLOCATEABLE-ELEMENT-REFS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (functionAllocation_targetEClass,
		   source,
		   new String[] {
			   "wrapperName", "FUNCTION-ALLOCATION--TARGET-IREFS"
		   });
		addAnnotation
		  (getFunctionAllocation_target_AllocationTarget_context(),
		   source,
		   new String[] {
			   "wrapperName", "ALLOCATION-TARGET-CONTEXT-REFS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (getFunctionAllocation_target_AllocationTarget(),
		   source,
		   new String[] {
			   "wrapperName", "ALLOCATION-TARGET-REFS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (functionConnector_portEClass,
		   source,
		   new String[] {
			   "wrapperName", "FUNCTION-CONNECTOR--PORT-IREFS"
		   });
		addAnnotation
		  (getFunctionConnector_port_FunctionPrototype(),
		   source,
		   new String[] {
			   "wrapperName", "FUNCTION-PROTOTYPE-REFS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (getFunctionConnector_port_FunctionPort(),
		   source,
		   new String[] {
			   "wrapperName", "FUNCTION-PORT-REFS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (actuatorEClass,
		   source,
		   new String[] {
			   "wrapperName", "ACTUATORS"
		   });
		addAnnotation
		  (communicationHardwarePinEClass,
		   source,
		   new String[] {
			   "wrapperName", "COMMUNICATION-HARDWARE-PINS"
		   });
		addAnnotation
		  (electricalComponentEClass,
		   source,
		   new String[] {
			   "wrapperName", "ELECTRICAL-COMPONENTS"
		   });
		addAnnotation
		  (getElectricalComponent_IsActive(),
		   source,
		   new String[] {
			   "wrapperName", "IS-ACTIVES",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (hardwareBusKindEEnum,
		   source,
		   new String[] {
			   "wrapperName", "HARDWARE-BUS-KINDS"
		   });
		addAnnotation
		  (hardwareComponentPrototypeEClass,
		   source,
		   new String[] {
			   "wrapperName", "HARDWARE-COMPONENT-PROTOTYPES"
		   });
		addAnnotation
		  (getHardwareComponentPrototype_Type(),
		   source,
		   new String[] {
			   "wrapperName", "TYPE-TREFS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (hardwareComponentTypeEClass,
		   source,
		   new String[] {
			   "wrapperName", "HARDWARE-COMPONENT-TYPES"
		   });
		addAnnotation
		  (getHardwareComponentType_Pin(),
		   source,
		   new String[] {
			   "wrapperName", "PINS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "true",
			   "featureElement", "false",
			   "classifierWrapperElement", "false",
			   "classifierElement", "true"
		   });
		addAnnotation
		  (getHardwareComponentType_Part(),
		   source,
		   new String[] {
			   "wrapperName", "PARTS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "true",
			   "featureElement", "false",
			   "classifierWrapperElement", "false",
			   "classifierElement", "true"
		   });
		addAnnotation
		  (getHardwareComponentType_Connector(),
		   source,
		   new String[] {
			   "wrapperName", "CONNECTORS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "true",
			   "featureElement", "false",
			   "classifierWrapperElement", "false",
			   "classifierElement", "true"
		   });
		addAnnotation
		  (getHardwareComponentType_Port(),
		   source,
		   new String[] {
			   "wrapperName", "PORTS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "true",
			   "featureElement", "false",
			   "classifierWrapperElement", "false",
			   "classifierElement", "true"
		   });
		addAnnotation
		  (getHardwareComponentType_PortConnector(),
		   source,
		   new String[] {
			   "wrapperName", "PORT-CONNECTORS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "true",
			   "featureElement", "false",
			   "classifierWrapperElement", "false",
			   "classifierElement", "true"
		   });
		addAnnotation
		  (hardwareConnectorEClass,
		   source,
		   new String[] {
			   "wrapperName", "HARDWARE-CONNECTORS"
		   });
		addAnnotation
		  (getHardwareConnector_Port(),
		   source,
		   new String[] {
			   "wrapperName", "PORT-IREFS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "true",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (hardwarePinEClass,
		   source,
		   new String[] {
			   "wrapperName", "HARDWARE-PINS"
		   });
		addAnnotation
		  (getHardwarePin_Direction(),
		   source,
		   new String[] {
			   "wrapperName", "DIRECTIONS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (getHardwarePin_IsGround(),
		   source,
		   new String[] {
			   "wrapperName", "IS-GROUNDS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (hardwarePortEClass,
		   source,
		   new String[] {
			   "wrapperName", "HARDWARE-PORTS"
		   });
		addAnnotation
		  (getHardwarePort_IsShield(),
		   source,
		   new String[] {
			   "wrapperName", "IS-SHIELDS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (getHardwarePort_ContainedPin(),
		   source,
		   new String[] {
			   "wrapperName", "CONTAINED-PINS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "true",
			   "featureElement", "false",
			   "classifierWrapperElement", "false",
			   "classifierElement", "true"
		   });
		addAnnotation
		  (getHardwarePort_ContainedPort(),
		   source,
		   new String[] {
			   "wrapperName", "CONTAINED-PORTS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "true",
			   "featureElement", "false",
			   "classifierWrapperElement", "false",
			   "classifierElement", "true"
		   });
		addAnnotation
		  (getHardwarePort_ReferencedPin(),
		   source,
		   new String[] {
			   "wrapperName", "REFERENCED-PIN-REFS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "true",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (hardwarePortConnectorEClass,
		   source,
		   new String[] {
			   "wrapperName", "HARDWARE-PORT-CONNECTORS"
		   });
		addAnnotation
		  (getHardwarePortConnector_Connector(),
		   source,
		   new String[] {
			   "wrapperName", "CONNECTORS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "true",
			   "featureElement", "false",
			   "classifierWrapperElement", "false",
			   "classifierElement", "true"
		   });
		addAnnotation
		  (ioHardwarePinEClass,
		   source,
		   new String[] {
			   "wrapperName", "IO-HARDWARE-PINS"
		   });
		addAnnotation
		  (getIOHardwarePin_Kind(),
		   source,
		   new String[] {
			   "wrapperName", "KINDS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (ioHardwarePinKindEEnum,
		   source,
		   new String[] {
			   "wrapperName", "IO-HARDWARE-PIN-KINDS"
		   });
		addAnnotation
		  (logicalPortConnectorEClass,
		   source,
		   new String[] {
			   "wrapperName", "LOGICAL-PORT-CONNECTORS"
		   });
		addAnnotation
		  (getLogicalPortConnector_Kind(),
		   source,
		   new String[] {
			   "wrapperName", "KINDS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (getLogicalPortConnector_BusSpeed(),
		   source,
		   new String[] {
			   "wrapperName", "BUS-SPEEDS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (nodeEClass,
		   source,
		   new String[] {
			   "wrapperName", "NODES"
		   });
		addAnnotation
		  (getNode_ExecutionRate(),
		   source,
		   new String[] {
			   "wrapperName", "EXECUTION-RATES",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (portConnectorEClass,
		   source,
		   new String[] {
			   "wrapperName", "PORT-CONNECTORS"
		   });
		addAnnotation
		  (getPortConnector_Port(),
		   source,
		   new String[] {
			   "wrapperName", "PORT-IREFS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "true",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (powerHardwarePinEClass,
		   source,
		   new String[] {
			   "wrapperName", "POWER-HARDWARE-PINS"
		   });
		addAnnotation
		  (sensorEClass,
		   source,
		   new String[] {
			   "wrapperName", "SENSORS"
		   });
		addAnnotation
		  (allocationTargetEClass,
		   source,
		   new String[] {
			   "wrapperName", "ALLOCATION-TARGETS"
		   });
		addAnnotation
		  (hardwareConnector_portEClass,
		   source,
		   new String[] {
			   "wrapperName", "HARDWARE-CONNECTOR--PORT-IREFS"
		   });
		addAnnotation
		  (getHardwareConnector_port_HardwarePin(),
		   source,
		   new String[] {
			   "wrapperName", "HARDWARE-PIN-REFS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (getHardwareConnector_port_HardwareComponentPrototype(),
		   source,
		   new String[] {
			   "wrapperName", "HARDWARE-COMPONENT-PROTOTYPE-REFS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (hardwarePortConnector_portEClass,
		   source,
		   new String[] {
			   "wrapperName", "HARDWARE-PORT-CONNECTOR--PORT-IREFS"
		   });
		addAnnotation
		  (getHardwarePortConnector_port_HardwarePort(),
		   source,
		   new String[] {
			   "wrapperName", "HARDWARE-PORT-REFS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (getHardwarePortConnector_port_HardwareComponentPrototype(),
		   source,
		   new String[] {
			   "wrapperName", "HARDWARE-COMPONENT-PROTOTYPE-REFS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (commentEClass,
		   source,
		   new String[] {
			   "wrapperName", "COMMENTS"
		   });
		addAnnotation
		  (getComment_Body(),
		   source,
		   new String[] {
			   "wrapperName", "BODYS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (contextEClass,
		   source,
		   new String[] {
			   "wrapperName", "CONTEXTS"
		   });
		addAnnotation
		  (getContext_TraceableSpecification(),
		   source,
		   new String[] {
			   "wrapperName", "TRACEABLE-SPECIFICATION-REFS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "true",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (getContext_OwnedRelationship(),
		   source,
		   new String[] {
			   "wrapperName", "OWNED-RELATIONSHIPS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "true",
			   "featureElement", "false",
			   "classifierWrapperElement", "false",
			   "classifierElement", "true"
		   });
		addAnnotation
		  (eaConnectorEClass,
		   source,
		   new String[] {
			   "wrapperName", "EA-CONNECTORS"
		   });
		addAnnotation
		  (eaElementEClass,
		   source,
		   new String[] {
			   "wrapperName", "EA-ELEMENTS"
		   });
		addAnnotation
		  (getEAElement_Name(),
		   source,
		   new String[] {
			   "wrapperName", "NAMES",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (getEAElement_OwnedComment(),
		   source,
		   new String[] {
			   "wrapperName", "OWNED-COMMENTS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "true",
			   "featureElement", "false",
			   "classifierWrapperElement", "false",
			   "classifierElement", "true"
		   });
		addAnnotation
		  (eaPackageEClass,
		   source,
		   new String[] {
			   "wrapperName", "EA-PACKAGES"
		   });
		addAnnotation
		  (getEAPackage_SubPackage(),
		   source,
		   new String[] {
			   "wrapperName", "SUB-PACKAGES",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "true",
			   "featureElement", "false",
			   "classifierWrapperElement", "false",
			   "classifierElement", "true"
		   });
		addAnnotation
		  (getEAPackage_Element(),
		   source,
		   new String[] {
			   "wrapperName", "ELEMENTS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "true",
			   "featureElement", "false",
			   "classifierWrapperElement", "false",
			   "classifierElement", "true"
		   });
		addAnnotation
		  (eaPackageableElementEClass,
		   source,
		   new String[] {
			   "wrapperName", "EA-PACKAGEABLE-ELEMENTS"
		   });
		addAnnotation
		  (getEAPackageableElement_EAPackage_element(),
		   source,
		   new String[] {
			   "wrapperName", "EA-PACKAGE-ELEMENT-REFS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (eaPortEClass,
		   source,
		   new String[] {
			   "wrapperName", "EA-PORTS"
		   });
		addAnnotation
		  (eaPrototypeEClass,
		   source,
		   new String[] {
			   "wrapperName", "EA-PROTOTYPES"
		   });
		addAnnotation
		  (eaTypeEClass,
		   source,
		   new String[] {
			   "wrapperName", "EA-TYPES"
		   });
		addAnnotation
		  (eaxmlEClass,
		   source,
		   new String[] {
			   "wrapperName", "EAXMLS",
			   "xmlGlobalElement", "true"
		   });
		addAnnotation
		  (getEAXML_TopLevelPackage(),
		   source,
		   new String[] {
			   "wrapperName", "TOP-LEVEL-PACKAGES",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "true",
			   "featureElement", "false",
			   "classifierWrapperElement", "false",
			   "classifierElement", "true"
		   });
		addAnnotation
		  (rationaleEClass,
		   source,
		   new String[] {
			   "wrapperName", "RATIONALES"
		   });
		addAnnotation
		  (realizationEClass,
		   source,
		   new String[] {
			   "wrapperName", "REALIZATIONS"
		   });
		addAnnotation
		  (getRealization_Realized(),
		   source,
		   new String[] {
			   "wrapperName", "REALIZED-IREFS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "true",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (getRealization_RealizedBy(),
		   source,
		   new String[] {
			   "wrapperName", "REALIZED-BY-IREFS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "true",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (referrableEClass,
		   source,
		   new String[] {
			   "wrapperName", "REFERRABLES"
		   });
		addAnnotation
		  (getReferrable_ShortName(),
		   source,
		   new String[] {
			   "wrapperName", "SHORT-NAMES",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (relationshipEClass,
		   source,
		   new String[] {
			   "wrapperName", "RELATIONSHIPS"
		   });
		addAnnotation
		  (traceableSpecificationEClass,
		   source,
		   new String[] {
			   "wrapperName", "TRACEABLE-SPECIFICATIONS"
		   });
		addAnnotation
		  (getTraceableSpecification_Text(),
		   source,
		   new String[] {
			   "wrapperName", "TEXTS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (getTraceableSpecification_Uri(),
		   source,
		   new String[] {
			   "wrapperName", "URIS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (identifiableEClass,
		   source,
		   new String[] {
			   "wrapperName", "IDENTIFIABLES"
		   });
		addAnnotation
		  (getIdentifiable_Category(),
		   source,
		   new String[] {
			   "wrapperName", "CATEGORYS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (getIdentifiable_Uuid(),
		   source,
		   new String[] {
			   "wrapperName", "UUIDS",
			   "xmlAttribute", "true",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (realization_realizedEClass,
		   source,
		   new String[] {
			   "wrapperName", "REALIZATION--REALIZED-IREFS"
		   });
		addAnnotation
		  (getRealization_realized_Identifiable_target(),
		   source,
		   new String[] {
			   "wrapperName", "IDENTIFIABLE-TARGET-REFS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (getRealization_realized_Identifiable_context(),
		   source,
		   new String[] {
			   "wrapperName", "IDENTIFIABLE-CONTEXT-REFS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (realization_realizedByEClass,
		   source,
		   new String[] {
			   "wrapperName", "REALIZATION--REALIZED-BY-IREFS"
		   });
		addAnnotation
		  (getRealization_realizedBy_Identifiable_target(),
		   source,
		   new String[] {
			   "wrapperName", "IDENTIFIABLE-TARGET-REFS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (getRealization_realizedBy_Identifiable_context(),
		   source,
		   new String[] {
			   "wrapperName", "IDENTIFIABLE-CONTEXT-REFS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (arrayDatatypeEClass,
		   source,
		   new String[] {
			   "wrapperName", "ARRAY-DATATYPES"
		   });
		addAnnotation
		  (getArrayDatatype_MaxLength(),
		   source,
		   new String[] {
			   "wrapperName", "MAX-LENGTHS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (getArrayDatatype_MinLength(),
		   source,
		   new String[] {
			   "wrapperName", "MIN-LENGTHS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (getArrayDatatype_ElementType(),
		   source,
		   new String[] {
			   "wrapperName", "ELEMENT-TYPE-REFS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (compositeDatatypeEClass,
		   source,
		   new String[] {
			   "wrapperName", "COMPOSITE-DATATYPES"
		   });
		addAnnotation
		  (getCompositeDatatype_DatatypePrototype(),
		   source,
		   new String[] {
			   "wrapperName", "DATATYPE-PROTOTYPES",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "true",
			   "featureElement", "false",
			   "classifierWrapperElement", "false",
			   "classifierElement", "true"
		   });
		addAnnotation
		  (eaBooleanEClass,
		   source,
		   new String[] {
			   "wrapperName", "EA-BOOLEANS"
		   });
		addAnnotation
		  (eaDatatypeEClass,
		   source,
		   new String[] {
			   "wrapperName", "EA-DATATYPES"
		   });
		addAnnotation
		  (eaDatatypePrototypeEClass,
		   source,
		   new String[] {
			   "wrapperName", "EA-DATATYPE-PROTOTYPES"
		   });
		addAnnotation
		  (getEADatatypePrototype_Type(),
		   source,
		   new String[] {
			   "wrapperName", "TYPE-TREFS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (eaNumericalEClass,
		   source,
		   new String[] {
			   "wrapperName", "EA-NUMERICALS"
		   });
		addAnnotation
		  (getEANumerical_Max(),
		   source,
		   new String[] {
			   "wrapperName", "MAXS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (getEANumerical_Min(),
		   source,
		   new String[] {
			   "wrapperName", "MINS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (getEANumerical_Unit(),
		   source,
		   new String[] {
			   "wrapperName", "UNIT-REFS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (eaStringEClass,
		   source,
		   new String[] {
			   "wrapperName", "EA-STRINGS"
		   });
		addAnnotation
		  (enumerationEClass,
		   source,
		   new String[] {
			   "wrapperName", "ENUMERATIONS"
		   });
		addAnnotation
		  (getEnumeration_IsMultiValued(),
		   source,
		   new String[] {
			   "wrapperName", "IS-MULTI-VALUEDS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (getEnumeration_Literal(),
		   source,
		   new String[] {
			   "wrapperName", "LITERALS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "true",
			   "featureElement", "false",
			   "classifierWrapperElement", "false",
			   "classifierElement", "true"
		   });
		addAnnotation
		  (enumerationLiteralEClass,
		   source,
		   new String[] {
			   "wrapperName", "ENUMERATION-LITERALS"
		   });
		addAnnotation
		  (quantityEClass,
		   source,
		   new String[] {
			   "wrapperName", "QUANTITYS"
		   });
		addAnnotation
		  (getQuantity_AmountOfSubstanceExp(),
		   source,
		   new String[] {
			   "wrapperName", "AMOUNT-OF-SUBSTANCE-EXPS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (getQuantity_ElectricCurrentExp(),
		   source,
		   new String[] {
			   "wrapperName", "ELECTRIC-CURRENT-EXPS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (getQuantity_LengthExp(),
		   source,
		   new String[] {
			   "wrapperName", "LENGTH-EXPS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (getQuantity_LuminousIntensityExp(),
		   source,
		   new String[] {
			   "wrapperName", "LUMINOUS-INTENSITY-EXPS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (getQuantity_MassExp(),
		   source,
		   new String[] {
			   "wrapperName", "MASS-EXPS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (getQuantity_ThermodynamicTemperatureExp(),
		   source,
		   new String[] {
			   "wrapperName", "THERMODYNAMIC-TEMPERATURE-EXPS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (getQuantity_TimeExp(),
		   source,
		   new String[] {
			   "wrapperName", "TIME-EXPS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (rangeableValueTypeEClass,
		   source,
		   new String[] {
			   "wrapperName", "RANGEABLE-VALUE-TYPES"
		   });
		addAnnotation
		  (getRangeableValueType_Accuracy(),
		   source,
		   new String[] {
			   "wrapperName", "ACCURACYS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (getRangeableValueType_Resolution(),
		   source,
		   new String[] {
			   "wrapperName", "RESOLUTIONS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (getRangeableValueType_SignificantDigits(),
		   source,
		   new String[] {
			   "wrapperName", "SIGNIFICANT-DIGITSS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (getRangeableValueType_BaseRangeable(),
		   source,
		   new String[] {
			   "wrapperName", "BASE-RANGEABLE-REFS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (unitEClass,
		   source,
		   new String[] {
			   "wrapperName", "UNITS"
		   });
		addAnnotation
		  (getUnit_Factor(),
		   source,
		   new String[] {
			   "wrapperName", "FACTORS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (getUnit_Symbol(),
		   source,
		   new String[] {
			   "wrapperName", "SYMBOLS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (getUnit_Offset(),
		   source,
		   new String[] {
			   "wrapperName", "OFFSETS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (getUnit_Reference(),
		   source,
		   new String[] {
			   "wrapperName", "REFERENCE-REFS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (getUnit_Quantity(),
		   source,
		   new String[] {
			   "wrapperName", "QUANTITY-REFS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (eaArrayValueEClass,
		   source,
		   new String[] {
			   "wrapperName", "EA-ARRAY-VALUES"
		   });
		addAnnotation
		  (getEAArrayValue_Value(),
		   source,
		   new String[] {
			   "wrapperName", "VALUES",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "true",
			   "featureElement", "false",
			   "classifierWrapperElement", "false",
			   "classifierElement", "true"
		   });
		addAnnotation
		  (eaBooleanValueEClass,
		   source,
		   new String[] {
			   "wrapperName", "EA-BOOLEAN-VALUES"
		   });
		addAnnotation
		  (getEABooleanValue_Value(),
		   source,
		   new String[] {
			   "wrapperName", "VALUES",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (eaCompositeValueEClass,
		   source,
		   new String[] {
			   "wrapperName", "EA-COMPOSITE-VALUES"
		   });
		addAnnotation
		  (getEACompositeValue_Value(),
		   source,
		   new String[] {
			   "wrapperName", "VALUES",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "true",
			   "featureElement", "false",
			   "classifierWrapperElement", "false",
			   "classifierElement", "true"
		   });
		addAnnotation
		  (eaEnumerationValueEClass,
		   source,
		   new String[] {
			   "wrapperName", "EA-ENUMERATION-VALUES"
		   });
		addAnnotation
		  (getEAEnumerationValue_Value(),
		   source,
		   new String[] {
			   "wrapperName", "VALUE-REFS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "true",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (eaExpressionEClass,
		   source,
		   new String[] {
			   "wrapperName", "EA-EXPRESSIONS"
		   });
		addAnnotation
		  (getEAExpression_Value(),
		   source,
		   new String[] {
			   "featureWrapperElement", "true",
			   "featureElement", "false",
			   "classifierWrapperElement", "false",
			   "classifierElement", "true",
			   "wrapperName", "VALUES",
			   "xmlAttribute", "false"
		   });
		addAnnotation
		  (eaNumericalValueEClass,
		   source,
		   new String[] {
			   "wrapperName", "EA-NUMERICAL-VALUES"
		   });
		addAnnotation
		  (getEANumericalValue_Value(),
		   source,
		   new String[] {
			   "wrapperName", "VALUES",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (eaStringValueEClass,
		   source,
		   new String[] {
			   "wrapperName", "EA-STRING-VALUES"
		   });
		addAnnotation
		  (getEAStringValue_Value(),
		   source,
		   new String[] {
			   "wrapperName", "VALUES",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (eaValueEClass,
		   source,
		   new String[] {
			   "wrapperName", "EA-VALUES"
		   });
		addAnnotation
		  (getEAValue_Type(),
		   source,
		   new String[] {
			   "wrapperName", "TYPE-TREFS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (userAttributeDefinitionEClass,
		   source,
		   new String[] {
			   "wrapperName", "USER-ATTRIBUTE-DEFINITIONS"
		   });
		addAnnotation
		  (getUserAttributeDefinition_DefaultValue(),
		   source,
		   new String[] {
			   "wrapperName", "DEFAULT-VALUES",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "true"
		   });
		addAnnotation
		  (getUserAttributeDefinition_Type(),
		   source,
		   new String[] {
			   "wrapperName", "TYPE-REFS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (userAttributedElementEClass,
		   source,
		   new String[] {
			   "wrapperName", "USER-ATTRIBUTED-ELEMENTS"
		   });
		addAnnotation
		  (getUserAttributedElement_UaValue(),
		   source,
		   new String[] {
			   "wrapperName", "UA-VALUES",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "true",
			   "featureElement", "false",
			   "classifierWrapperElement", "false",
			   "classifierElement", "true"
		   });
		addAnnotation
		  (getUserAttributedElement_UaType(),
		   source,
		   new String[] {
			   "wrapperName", "UA-TYPE-REFS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "true",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (getUserAttributedElement_AttributedElement(),
		   source,
		   new String[] {
			   "wrapperName", "ATTRIBUTED-ELEMENT-REFS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (userElementTypeEClass,
		   source,
		   new String[] {
			   "wrapperName", "USER-ELEMENT-TYPES"
		   });
		addAnnotation
		  (getUserElementType_ValidFor(),
		   source,
		   new String[] {
			   "wrapperName", "VALID-FORS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (getUserElementType_Key(),
		   source,
		   new String[] {
			   "wrapperName", "KEYS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "false",
			   "featureElement", "true",
			   "classifierWrapperElement", "false",
			   "classifierElement", "false"
		   });
		addAnnotation
		  (getUserElementType_UaDefinition(),
		   source,
		   new String[] {
			   "wrapperName", "UA-DEFINITIONS",
			   "xmlAttribute", "false",
			   "featureWrapperElement", "true",
			   "featureElement", "false",
			   "classifierWrapperElement", "false",
			   "classifierElement", "true"
		   });
		addAnnotation
		  (booleanEDataType,
		   source,
		   new String[] {
			   "wrapperName", "BOOLEANS",
			   "xmlXsdSimpleType", "string",
			   "xmlCustomSimpleType", "true"
		   });
		addAnnotation
		  (floatEDataType,
		   source,
		   new String[] {
			   "wrapperName", "FLOATS",
			   "xmlXsdSimpleType", "double",
			   "xmlCustomSimpleType", "false"
		   });
		addAnnotation
		  (identifierEDataType,
		   source,
		   new String[] {
			   "wrapperName", "IDENTIFIERS",
			   "xmlXsdSimpleType", "string",
			   "xmlCustomSimpleType", "true"
		   });
		addAnnotation
		  (integerEDataType,
		   source,
		   new String[] {
			   "wrapperName", "INTEGERS",
			   "xmlXsdSimpleType", "string",
			   "xmlCustomSimpleType", "true"
		   });
		addAnnotation
		  (numericalEDataType,
		   source,
		   new String[] {
			   "wrapperName", "NUMERICALS",
			   "xmlXsdSimpleType", "string",
			   "xmlCustomSimpleType", "true"
		   });
		addAnnotation
		  (refEDataType,
		   source,
		   new String[] {
			   "wrapperName", "REFS",
			   "xmlXsdSimpleType", "string",
			   "xmlCustomSimpleType", "true"
		   });
		addAnnotation
		  (stringEDataType,
		   source,
		   new String[] {
			   "wrapperName", "STRINGS",
			   "xmlXsdSimpleType", "string",
			   "xmlCustomSimpleType", "false"
		   });
	}

	/**
	 * Initializes the annotations for <b>Stereotype</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createStereotypeAnnotations() {
		String source = "Stereotype";
		addAnnotation
		  (designLevelEClass,
		   source,
		   new String[] {
			   "Stereotype", "atpStructureElement"
		   });
		addAnnotation
		  (getAnalysisFunctionPrototype_Type(),
		   source,
		   new String[] {
			   "Stereotype", "isOfType"
		   });
		addAnnotation
		  (clientServerKindEEnum,
		   source,
		   new String[] {
			   "Stereotype", "enumeration"
		   });
		addAnnotation
		  (getDesignFunctionPrototype_Type(),
		   source,
		   new String[] {
			   "Stereotype", "isOfType"
		   });
		addAnnotation
		  (eaDirectionKindEEnum,
		   source,
		   new String[] {
			   "Stereotype", "enumeration"
		   });
		addAnnotation
		  (functionClientServerInterfaceEClass,
		   source,
		   new String[] {
			   "Stereotype", "atpType"
		   });
		addAnnotation
		  (getFunctionClientServerPort_Type(),
		   source,
		   new String[] {
			   "Stereotype", "isOfType"
		   });
		addAnnotation
		  (functionConnectorEClass,
		   source,
		   new String[] {
			   "Stereotype", "atpStructureElement"
		   });
		addAnnotation
		  (getFunctionFlowPort_Type(),
		   source,
		   new String[] {
			   "Stereotype", "isOfType"
		   });
		addAnnotation
		  (functionPortEClass,
		   source,
		   new String[] {
			   "Stereotype", "atpPrototype"
		   });
		addAnnotation
		  (getFunctionPowerPort_Type(),
		   source,
		   new String[] {
			   "Stereotype", "isOfType"
		   });
		addAnnotation
		  (functionPrototypeEClass,
		   source,
		   new String[] {
			   "Stereotype", "atpPrototype"
		   });
		addAnnotation
		  (functionTypeEClass,
		   source,
		   new String[] {
			   "Stereotype", "atpType"
		   });
		addAnnotation
		  (functionAllocation_allocatedElementEClass,
		   source,
		   new String[] {
			   "Stereotype", "instanceRef"
		   });
		addAnnotation
		  (getFunctionAllocation_allocatedElement_AllocateableElement_context(),
		   source,
		   new String[] {
			   "Stereotype", "instanceRef.context"
		   });
		addAnnotation
		  (getFunctionAllocation_allocatedElement_AllocateableElement(),
		   source,
		   new String[] {
			   "Stereotype", "instanceRef.target"
		   });
		addAnnotation
		  (functionAllocation_targetEClass,
		   source,
		   new String[] {
			   "Stereotype", "instanceRef"
		   });
		addAnnotation
		  (getFunctionAllocation_target_AllocationTarget_context(),
		   source,
		   new String[] {
			   "Stereotype", "instanceRef.context"
		   });
		addAnnotation
		  (getFunctionAllocation_target_AllocationTarget(),
		   source,
		   new String[] {
			   "Stereotype", "instanceRef.target"
		   });
		addAnnotation
		  (functionConnector_portEClass,
		   source,
		   new String[] {
			   "Stereotype", "instanceRef"
		   });
		addAnnotation
		  (getFunctionConnector_port_FunctionPrototype(),
		   source,
		   new String[] {
			   "Stereotype", "instanceRef.context"
		   });
		addAnnotation
		  (getFunctionConnector_port_FunctionPort(),
		   source,
		   new String[] {
			   "Stereotype", "instanceRef.target"
		   });
		addAnnotation
		  (electricalComponentEClass,
		   source,
		   new String[] {
			   "Stereotype", "atpType"
		   });
		addAnnotation
		  (hardwareBusKindEEnum,
		   source,
		   new String[] {
			   "Stereotype", "enumeration"
		   });
		addAnnotation
		  (hardwareComponentPrototypeEClass,
		   source,
		   new String[] {
			   "Stereotype", "atpPrototype"
		   });
		addAnnotation
		  (getHardwareComponentPrototype_Type(),
		   source,
		   new String[] {
			   "Stereotype", "isOfType"
		   });
		addAnnotation
		  (hardwareComponentTypeEClass,
		   source,
		   new String[] {
			   "Stereotype", "atpType"
		   });
		addAnnotation
		  (hardwareConnectorEClass,
		   source,
		   new String[] {
			   "Stereotype", "atpStructureElement"
		   });
		addAnnotation
		  (hardwarePinEClass,
		   source,
		   new String[] {
			   "Stereotype", "atpStructureElement"
		   });
		addAnnotation
		  (hardwarePortEClass,
		   source,
		   new String[] {
			   "Stereotype", "atpStructureElement"
		   });
		addAnnotation
		  (hardwarePortConnectorEClass,
		   source,
		   new String[] {
			   "Stereotype", "atpStructureElement"
		   });
		addAnnotation
		  (ioHardwarePinKindEEnum,
		   source,
		   new String[] {
			   "Stereotype", "enumeration"
		   });
		addAnnotation
		  (logicalPortConnectorEClass,
		   source,
		   new String[] {
			   "Stereotype", "atpStructureElement"
		   });
		addAnnotation
		  (portConnectorEClass,
		   source,
		   new String[] {
			   "Stereotype", "atpStructureElement"
		   });
		addAnnotation
		  (hardwareConnector_portEClass,
		   source,
		   new String[] {
			   "Stereotype", "instanceRef"
		   });
		addAnnotation
		  (getHardwareConnector_port_HardwarePin(),
		   source,
		   new String[] {
			   "Stereotype", "instanceRef.target"
		   });
		addAnnotation
		  (getHardwareConnector_port_HardwareComponentPrototype(),
		   source,
		   new String[] {
			   "Stereotype", "instanceRef.context"
		   });
		addAnnotation
		  (hardwarePortConnector_portEClass,
		   source,
		   new String[] {
			   "Stereotype", "instanceRef"
		   });
		addAnnotation
		  (getHardwarePortConnector_port_HardwarePort(),
		   source,
		   new String[] {
			   "Stereotype", "instanceRef.target"
		   });
		addAnnotation
		  (getHardwarePortConnector_port_HardwareComponentPrototype(),
		   source,
		   new String[] {
			   "Stereotype", "instanceRef.context"
		   });
		addAnnotation
		  (getEAPackage_SubPackage(),
		   source,
		   new String[] {
			   "Stereotype", "splitable"
		   });
		addAnnotation
		  (getEAPackage_Element(),
		   source,
		   new String[] {
			   "Stereotype", "splitable"
		   });
		addAnnotation
		  (getEAXML_TopLevelPackage(),
		   source,
		   new String[] {
			   "Stereotype", "splitable"
		   });
		addAnnotation
		  (realization_realizedEClass,
		   source,
		   new String[] {
			   "Stereotype", "instanceRef"
		   });
		addAnnotation
		  (getRealization_realized_Identifiable_target(),
		   source,
		   new String[] {
			   "Stereotype", "instanceRef.target"
		   });
		addAnnotation
		  (getRealization_realized_Identifiable_context(),
		   source,
		   new String[] {
			   "Stereotype", "instanceRef.context"
		   });
		addAnnotation
		  (realization_realizedByEClass,
		   source,
		   new String[] {
			   "Stereotype", "instanceRef"
		   });
		addAnnotation
		  (getRealization_realizedBy_Identifiable_target(),
		   source,
		   new String[] {
			   "Stereotype", "instanceRef.target"
		   });
		addAnnotation
		  (getRealization_realizedBy_Identifiable_context(),
		   source,
		   new String[] {
			   "Stereotype", "instanceRef.context"
		   });
		addAnnotation
		  (eaDatatypeEClass,
		   source,
		   new String[] {
			   "Stereotype", "atpType"
		   });
		addAnnotation
		  (eaDatatypePrototypeEClass,
		   source,
		   new String[] {
			   "Stereotype", "atpPrototype"
		   });
		addAnnotation
		  (getEADatatypePrototype_Type(),
		   source,
		   new String[] {
			   "Stereotype", "isOfType"
		   });
		addAnnotation
		  (eaExpressionEClass,
		   source,
		   new String[] {
			   "Stereotype", "atpMixedString"
		   });
		addAnnotation
		  (eaValueEClass,
		   source,
		   new String[] {
			   "Stereotype", "atpPrototype"
		   });
		addAnnotation
		  (getEAValue_Type(),
		   source,
		   new String[] {
			   "Stereotype", "isOfType"
		   });
		addAnnotation
		  (booleanEDataType,
		   source,
		   new String[] {
			   "Stereotype", "primitive"
		   });
		addAnnotation
		  (floatEDataType,
		   source,
		   new String[] {
			   "Stereotype", "primitive"
		   });
		addAnnotation
		  (identifierEDataType,
		   source,
		   new String[] {
			   "Stereotype", "primitive"
		   });
		addAnnotation
		  (integerEDataType,
		   source,
		   new String[] {
			   "Stereotype", "primitive"
		   });
		addAnnotation
		  (numericalEDataType,
		   source,
		   new String[] {
			   "Stereotype", "primitive"
		   });
		addAnnotation
		  (refEDataType,
		   source,
		   new String[] {
			   "Stereotype", "primitive"
		   });
		addAnnotation
		  (stringEDataType,
		   source,
		   new String[] {
			   "Stereotype", "primitive"
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (designLevelEClass,
		   source,
		   new String[] {
			   "name", "DESIGN-LEVEL",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDesignLevel_Allocation(),
		   source,
		   new String[] {
			   "name", "ALLOCATION",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (getDesignLevel_FunctionalDesignArchitecture(),
		   source,
		   new String[] {
			   "name", "FUNCTIONAL-DESIGN-ARCHITECTURE",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (getDesignLevel_HardwareDesignArchitecture(),
		   source,
		   new String[] {
			   "name", "HARDWARE-DESIGN-ARCHITECTURE",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (allocateableElementEClass,
		   source,
		   new String[] {
			   "name", "ALLOCATEABLE-ELEMENT",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (allocationEClass,
		   source,
		   new String[] {
			   "name", "ALLOCATION",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAllocation_FunctionAllocation(),
		   source,
		   new String[] {
			   "name", "FUNCTION-ALLOCATION",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (analysisFunctionPrototypeEClass,
		   source,
		   new String[] {
			   "name", "ANALYSIS-FUNCTION-PROTOTYPE",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAnalysisFunctionPrototype_Type(),
		   source,
		   new String[] {
			   "name", "TYPE-TREF",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (analysisFunctionTypeEClass,
		   source,
		   new String[] {
			   "name", "ANALYSIS-FUNCTION-TYPE",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAnalysisFunctionType_Part(),
		   source,
		   new String[] {
			   "name", "PART",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (basicSoftwareFunctionTypeEClass,
		   source,
		   new String[] {
			   "name", "BASIC-SOFTWARE-FUNCTION-TYPE",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (clientServerKindEEnum,
		   source,
		   new String[] {
			   "name", "CLIENT-SERVER-KIND"
		   });
		addAnnotation
		  (designFunctionPrototypeEClass,
		   source,
		   new String[] {
			   "name", "DESIGN-FUNCTION-PROTOTYPE",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDesignFunctionPrototype_Type(),
		   source,
		   new String[] {
			   "name", "TYPE-TREF",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (designFunctionTypeEClass,
		   source,
		   new String[] {
			   "name", "DESIGN-FUNCTION-TYPE",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDesignFunctionType_Part(),
		   source,
		   new String[] {
			   "name", "PART",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (eaDirectionKindEEnum,
		   source,
		   new String[] {
			   "name", "EA-DIRECTION-KIND"
		   });
		addAnnotation
		  (functionalDeviceEClass,
		   source,
		   new String[] {
			   "name", "FUNCTIONAL-DEVICE",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (functionAllocationEClass,
		   source,
		   new String[] {
			   "name", "FUNCTION-ALLOCATION",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFunctionAllocation_AllocatedElement(),
		   source,
		   new String[] {
			   "name", "ALLOCATED-ELEMENT-IREF",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (getFunctionAllocation_Target(),
		   source,
		   new String[] {
			   "name", "TARGET-IREF",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (functionClientServerInterfaceEClass,
		   source,
		   new String[] {
			   "name", "FUNCTION-CLIENT-SERVER-INTERFACE",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFunctionClientServerInterface_Operation(),
		   source,
		   new String[] {
			   "name", "OPERATION",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (functionClientServerPortEClass,
		   source,
		   new String[] {
			   "name", "FUNCTION-CLIENT-SERVER-PORT",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFunctionClientServerPort_Kind(),
		   source,
		   new String[] {
			   "name", "KIND",
			   "kind", "element"
		   });
		addAnnotation
		  (getFunctionClientServerPort_Type(),
		   source,
		   new String[] {
			   "name", "TYPE-TREF",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (functionConnectorEClass,
		   source,
		   new String[] {
			   "name", "FUNCTION-CONNECTOR",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFunctionConnector_Port(),
		   source,
		   new String[] {
			   "name", "PORT-IREF",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (functionFlowPortEClass,
		   source,
		   new String[] {
			   "name", "FUNCTION-FLOW-PORT",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFunctionFlowPort_Direction(),
		   source,
		   new String[] {
			   "name", "DIRECTION",
			   "kind", "element"
		   });
		addAnnotation
		  (getFunctionFlowPort_Type(),
		   source,
		   new String[] {
			   "name", "TYPE-TREF",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (getFunctionFlowPort_DefaultValue(),
		   source,
		   new String[] {
			   "name", "DEFAULT-VALUE",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (functionPortEClass,
		   source,
		   new String[] {
			   "name", "FUNCTION-PORT",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (functionPowerPortEClass,
		   source,
		   new String[] {
			   "name", "FUNCTION-POWER-PORT",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFunctionPowerPort_Type(),
		   source,
		   new String[] {
			   "name", "TYPE-TREF",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (functionPrototypeEClass,
		   source,
		   new String[] {
			   "name", "FUNCTION-PROTOTYPE",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (functionTypeEClass,
		   source,
		   new String[] {
			   "name", "FUNCTION-TYPE",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFunctionType_IsElementary(),
		   source,
		   new String[] {
			   "name", "IS-ELEMENTARY",
			   "kind", "element"
		   });
		addAnnotation
		  (getFunctionType_PortGroup(),
		   source,
		   new String[] {
			   "name", "PORT-GROUP",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (getFunctionType_Connector(),
		   source,
		   new String[] {
			   "name", "CONNECTOR",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (getFunctionType_Port(),
		   source,
		   new String[] {
			   "name", "PORT",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (hardwareFunctionTypeEClass,
		   source,
		   new String[] {
			   "name", "HARDWARE-FUNCTION-TYPE",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHardwareFunctionType_HardwareComponent(),
		   source,
		   new String[] {
			   "name", "HARDWARE-COMPONENT-REF",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (localDeviceManagerEClass,
		   source,
		   new String[] {
			   "name", "LOCAL-DEVICE-MANAGER",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (operationEClass,
		   source,
		   new String[] {
			   "name", "OPERATION",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getOperation_Return(),
		   source,
		   new String[] {
			   "name", "RETURN",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (getOperation_Argument(),
		   source,
		   new String[] {
			   "name", "ARGUMENT",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (portGroupEClass,
		   source,
		   new String[] {
			   "name", "PORT-GROUP",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPortGroup_PortGroup(),
		   source,
		   new String[] {
			   "name", "PORT-GROUP",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (getPortGroup_Port(),
		   source,
		   new String[] {
			   "name", "PORT-REF",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (functionAllocation_allocatedElementEClass,
		   source,
		   new String[] {
			   "name", "FUNCTION-ALLOCATION--ALLOCATED-ELEMENT-IREF",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFunctionAllocation_allocatedElement_AllocateableElement_context(),
		   source,
		   new String[] {
			   "name", "ALLOCATEABLE-ELEMENT-CONTEXT-REF",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (getFunctionAllocation_allocatedElement_AllocateableElement(),
		   source,
		   new String[] {
			   "name", "ALLOCATEABLE-ELEMENT-REF",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (functionAllocation_targetEClass,
		   source,
		   new String[] {
			   "name", "FUNCTION-ALLOCATION--TARGET-IREF",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFunctionAllocation_target_AllocationTarget_context(),
		   source,
		   new String[] {
			   "name", "ALLOCATION-TARGET-CONTEXT-REF",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (getFunctionAllocation_target_AllocationTarget(),
		   source,
		   new String[] {
			   "name", "ALLOCATION-TARGET-REF",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (functionConnector_portEClass,
		   source,
		   new String[] {
			   "name", "FUNCTION-CONNECTOR--PORT-IREF",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFunctionConnector_port_FunctionPrototype(),
		   source,
		   new String[] {
			   "name", "FUNCTION-PROTOTYPE-REF",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (getFunctionConnector_port_FunctionPort(),
		   source,
		   new String[] {
			   "name", "FUNCTION-PORT-REF",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (actuatorEClass,
		   source,
		   new String[] {
			   "name", "ACTUATOR",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (communicationHardwarePinEClass,
		   source,
		   new String[] {
			   "name", "COMMUNICATION-HARDWARE-PIN",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (electricalComponentEClass,
		   source,
		   new String[] {
			   "name", "ELECTRICAL-COMPONENT",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getElectricalComponent_IsActive(),
		   source,
		   new String[] {
			   "name", "IS-ACTIVE",
			   "kind", "element"
		   });
		addAnnotation
		  (hardwareBusKindEEnum,
		   source,
		   new String[] {
			   "name", "HARDWARE-BUS-KIND"
		   });
		addAnnotation
		  (hardwareComponentPrototypeEClass,
		   source,
		   new String[] {
			   "name", "HARDWARE-COMPONENT-PROTOTYPE",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHardwareComponentPrototype_Type(),
		   source,
		   new String[] {
			   "name", "TYPE-TREF",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (hardwareComponentTypeEClass,
		   source,
		   new String[] {
			   "name", "HARDWARE-COMPONENT-TYPE",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHardwareComponentType_Pin(),
		   source,
		   new String[] {
			   "name", "PIN",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (getHardwareComponentType_Part(),
		   source,
		   new String[] {
			   "name", "PART",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (getHardwareComponentType_Connector(),
		   source,
		   new String[] {
			   "name", "CONNECTOR",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (getHardwareComponentType_Port(),
		   source,
		   new String[] {
			   "name", "PORT",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (getHardwareComponentType_PortConnector(),
		   source,
		   new String[] {
			   "name", "PORT-CONNECTOR",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (hardwareConnectorEClass,
		   source,
		   new String[] {
			   "name", "HARDWARE-CONNECTOR",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHardwareConnector_Port(),
		   source,
		   new String[] {
			   "name", "PORT-IREF",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (hardwarePinEClass,
		   source,
		   new String[] {
			   "name", "HARDWARE-PIN",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHardwarePin_Direction(),
		   source,
		   new String[] {
			   "name", "DIRECTION",
			   "kind", "element"
		   });
		addAnnotation
		  (getHardwarePin_IsGround(),
		   source,
		   new String[] {
			   "name", "IS-GROUND",
			   "kind", "element"
		   });
		addAnnotation
		  (hardwarePortEClass,
		   source,
		   new String[] {
			   "name", "HARDWARE-PORT",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHardwarePort_IsShield(),
		   source,
		   new String[] {
			   "name", "IS-SHIELD",
			   "kind", "element"
		   });
		addAnnotation
		  (getHardwarePort_ContainedPin(),
		   source,
		   new String[] {
			   "name", "CONTAINED-PIN",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (getHardwarePort_ContainedPort(),
		   source,
		   new String[] {
			   "name", "CONTAINED-PORT",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (getHardwarePort_ReferencedPin(),
		   source,
		   new String[] {
			   "name", "REFERENCED-PIN-REF",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (hardwarePortConnectorEClass,
		   source,
		   new String[] {
			   "name", "HARDWARE-PORT-CONNECTOR",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHardwarePortConnector_Connector(),
		   source,
		   new String[] {
			   "name", "CONNECTOR",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (ioHardwarePinEClass,
		   source,
		   new String[] {
			   "name", "IO-HARDWARE-PIN",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIOHardwarePin_Kind(),
		   source,
		   new String[] {
			   "name", "KIND",
			   "kind", "element"
		   });
		addAnnotation
		  (ioHardwarePinKindEEnum,
		   source,
		   new String[] {
			   "name", "IO-HARDWARE-PIN-KIND"
		   });
		addAnnotation
		  (logicalPortConnectorEClass,
		   source,
		   new String[] {
			   "name", "LOGICAL-PORT-CONNECTOR",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLogicalPortConnector_Kind(),
		   source,
		   new String[] {
			   "name", "KIND",
			   "kind", "element"
		   });
		addAnnotation
		  (getLogicalPortConnector_BusSpeed(),
		   source,
		   new String[] {
			   "name", "BUS-SPEED",
			   "kind", "element"
		   });
		addAnnotation
		  (nodeEClass,
		   source,
		   new String[] {
			   "name", "NODE",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNode_ExecutionRate(),
		   source,
		   new String[] {
			   "name", "EXECUTION-RATE",
			   "kind", "element"
		   });
		addAnnotation
		  (portConnectorEClass,
		   source,
		   new String[] {
			   "name", "PORT-CONNECTOR",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPortConnector_Port(),
		   source,
		   new String[] {
			   "name", "PORT-IREF",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (powerHardwarePinEClass,
		   source,
		   new String[] {
			   "name", "POWER-HARDWARE-PIN",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (sensorEClass,
		   source,
		   new String[] {
			   "name", "SENSOR",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (allocationTargetEClass,
		   source,
		   new String[] {
			   "name", "ALLOCATION-TARGET",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (hardwareConnector_portEClass,
		   source,
		   new String[] {
			   "name", "HARDWARE-CONNECTOR--PORT-IREF",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHardwareConnector_port_HardwarePin(),
		   source,
		   new String[] {
			   "name", "HARDWARE-PIN-REF",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (getHardwareConnector_port_HardwareComponentPrototype(),
		   source,
		   new String[] {
			   "name", "HARDWARE-COMPONENT-PROTOTYPE-REF",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (hardwarePortConnector_portEClass,
		   source,
		   new String[] {
			   "name", "HARDWARE-PORT-CONNECTOR--PORT-IREF",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHardwarePortConnector_port_HardwarePort(),
		   source,
		   new String[] {
			   "name", "HARDWARE-PORT-REF",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (getHardwarePortConnector_port_HardwareComponentPrototype(),
		   source,
		   new String[] {
			   "name", "HARDWARE-COMPONENT-PROTOTYPE-REF",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (commentEClass,
		   source,
		   new String[] {
			   "name", "COMMENT",
			   "kind", "simple"
		   });
		addAnnotation
		  (getComment_Body(),
		   source,
		   new String[] {
			   "name", "BODY",
			   "kind", "element"
		   });
		addAnnotation
		  (contextEClass,
		   source,
		   new String[] {
			   "name", "CONTEXT",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getContext_TraceableSpecification(),
		   source,
		   new String[] {
			   "name", "TRACEABLE-SPECIFICATION-REF",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (getContext_OwnedRelationship(),
		   source,
		   new String[] {
			   "name", "OWNED-RELATIONSHIP",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (eaConnectorEClass,
		   source,
		   new String[] {
			   "name", "EA-CONNECTOR",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (eaElementEClass,
		   source,
		   new String[] {
			   "name", "EA-ELEMENT",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEAElement_Name(),
		   source,
		   new String[] {
			   "name", "NAME",
			   "kind", "element"
		   });
		addAnnotation
		  (getEAElement_OwnedComment(),
		   source,
		   new String[] {
			   "name", "OWNED-COMMENT",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (eaPackageEClass,
		   source,
		   new String[] {
			   "name", "EA-PACKAGE",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEAPackage_SubPackage(),
		   source,
		   new String[] {
			   "name", "SUB-PACKAGE",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (getEAPackage_Element(),
		   source,
		   new String[] {
			   "name", "ELEMENT",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (eaPackageableElementEClass,
		   source,
		   new String[] {
			   "name", "EA-PACKAGEABLE-ELEMENT",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEAPackageableElement_EAPackage_element(),
		   source,
		   new String[] {
			   "name", "EA-PACKAGE-ELEMENT-REF",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (eaPortEClass,
		   source,
		   new String[] {
			   "name", "EA-PORT",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (eaPrototypeEClass,
		   source,
		   new String[] {
			   "name", "EA-PROTOTYPE",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (eaTypeEClass,
		   source,
		   new String[] {
			   "name", "EA-TYPE",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (eaxmlEClass,
		   source,
		   new String[] {
			   "name", "EAXML",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEAXML_TopLevelPackage(),
		   source,
		   new String[] {
			   "name", "TOP-LEVEL-PACKAGE",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (rationaleEClass,
		   source,
		   new String[] {
			   "name", "RATIONALE",
			   "kind", "simple"
		   });
		addAnnotation
		  (realizationEClass,
		   source,
		   new String[] {
			   "name", "REALIZATION",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRealization_Realized(),
		   source,
		   new String[] {
			   "name", "REALIZED-IREF",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (getRealization_RealizedBy(),
		   source,
		   new String[] {
			   "name", "REALIZED-BY-IREF",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (referrableEClass,
		   source,
		   new String[] {
			   "name", "REFERRABLE",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getReferrable_ShortName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12",
			   "name", "SHORT-NAME"
		   });
		addAnnotation
		  (relationshipEClass,
		   source,
		   new String[] {
			   "name", "RELATIONSHIP",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (traceableSpecificationEClass,
		   source,
		   new String[] {
			   "name", "TRACEABLE-SPECIFICATION",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTraceableSpecification_Text(),
		   source,
		   new String[] {
			   "name", "TEXT",
			   "kind", "element"
		   });
		addAnnotation
		  (getTraceableSpecification_Uri(),
		   source,
		   new String[] {
			   "name", "URI",
			   "kind", "element"
		   });
		addAnnotation
		  (identifiableEClass,
		   source,
		   new String[] {
			   "name", "IDENTIFIABLE",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIdentifiable_Category(),
		   source,
		   new String[] {
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12",
			   "name", "CATEGORY"
		   });
		addAnnotation
		  (getIdentifiable_Uuid(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "UUID"
		   });
		addAnnotation
		  (realization_realizedEClass,
		   source,
		   new String[] {
			   "name", "REALIZATION--REALIZED-IREF",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRealization_realized_Identifiable_target(),
		   source,
		   new String[] {
			   "name", "IDENTIFIABLE-TARGET-REF",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (getRealization_realized_Identifiable_context(),
		   source,
		   new String[] {
			   "name", "IDENTIFIABLE-CONTEXT-REF",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (realization_realizedByEClass,
		   source,
		   new String[] {
			   "name", "REALIZATION--REALIZED-BY-IREF",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRealization_realizedBy_Identifiable_target(),
		   source,
		   new String[] {
			   "name", "IDENTIFIABLE-TARGET-REF",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (getRealization_realizedBy_Identifiable_context(),
		   source,
		   new String[] {
			   "name", "IDENTIFIABLE-CONTEXT-REF",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (arrayDatatypeEClass,
		   source,
		   new String[] {
			   "name", "ARRAY-DATATYPE",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getArrayDatatype_MaxLength(),
		   source,
		   new String[] {
			   "name", "MAX-LENGTH",
			   "kind", "element"
		   });
		addAnnotation
		  (getArrayDatatype_MinLength(),
		   source,
		   new String[] {
			   "name", "MIN-LENGTH",
			   "kind", "element"
		   });
		addAnnotation
		  (getArrayDatatype_ElementType(),
		   source,
		   new String[] {
			   "name", "ELEMENT-TYPE-REF",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (compositeDatatypeEClass,
		   source,
		   new String[] {
			   "name", "COMPOSITE-DATATYPE",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCompositeDatatype_DatatypePrototype(),
		   source,
		   new String[] {
			   "name", "DATATYPE-PROTOTYPE",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (eaBooleanEClass,
		   source,
		   new String[] {
			   "name", "EA-BOOLEAN",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (eaDatatypeEClass,
		   source,
		   new String[] {
			   "name", "EA-DATATYPE",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (eaDatatypePrototypeEClass,
		   source,
		   new String[] {
			   "name", "EA-DATATYPE-PROTOTYPE",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEADatatypePrototype_Type(),
		   source,
		   new String[] {
			   "name", "TYPE-TREF",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (eaNumericalEClass,
		   source,
		   new String[] {
			   "name", "EA-NUMERICAL",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEANumerical_Max(),
		   source,
		   new String[] {
			   "name", "MAX",
			   "kind", "element"
		   });
		addAnnotation
		  (getEANumerical_Min(),
		   source,
		   new String[] {
			   "name", "MIN",
			   "kind", "element"
		   });
		addAnnotation
		  (getEANumerical_Unit(),
		   source,
		   new String[] {
			   "name", "UNIT-REF",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (eaStringEClass,
		   source,
		   new String[] {
			   "name", "EA-STRING",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (enumerationEClass,
		   source,
		   new String[] {
			   "name", "ENUMERATION",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEnumeration_IsMultiValued(),
		   source,
		   new String[] {
			   "name", "IS-MULTI-VALUED",
			   "kind", "element"
		   });
		addAnnotation
		  (getEnumeration_Literal(),
		   source,
		   new String[] {
			   "name", "LITERAL",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (enumerationLiteralEClass,
		   source,
		   new String[] {
			   "name", "ENUMERATION-LITERAL",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (quantityEClass,
		   source,
		   new String[] {
			   "name", "QUANTITY",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getQuantity_AmountOfSubstanceExp(),
		   source,
		   new String[] {
			   "name", "AMOUNT-OF-SUBSTANCE-EXP",
			   "kind", "element"
		   });
		addAnnotation
		  (getQuantity_ElectricCurrentExp(),
		   source,
		   new String[] {
			   "name", "ELECTRIC-CURRENT-EXP",
			   "kind", "element"
		   });
		addAnnotation
		  (getQuantity_LengthExp(),
		   source,
		   new String[] {
			   "name", "LENGTH-EXP",
			   "kind", "element"
		   });
		addAnnotation
		  (getQuantity_LuminousIntensityExp(),
		   source,
		   new String[] {
			   "name", "LUMINOUS-INTENSITY-EXP",
			   "kind", "element"
		   });
		addAnnotation
		  (getQuantity_MassExp(),
		   source,
		   new String[] {
			   "name", "MASS-EXP",
			   "kind", "element"
		   });
		addAnnotation
		  (getQuantity_ThermodynamicTemperatureExp(),
		   source,
		   new String[] {
			   "name", "THERMODYNAMIC-TEMPERATURE-EXP",
			   "kind", "element"
		   });
		addAnnotation
		  (getQuantity_TimeExp(),
		   source,
		   new String[] {
			   "name", "TIME-EXP",
			   "kind", "element"
		   });
		addAnnotation
		  (rangeableValueTypeEClass,
		   source,
		   new String[] {
			   "name", "RANGEABLE-VALUE-TYPE",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRangeableValueType_Accuracy(),
		   source,
		   new String[] {
			   "name", "ACCURACY",
			   "kind", "element"
		   });
		addAnnotation
		  (getRangeableValueType_Resolution(),
		   source,
		   new String[] {
			   "name", "RESOLUTION",
			   "kind", "element"
		   });
		addAnnotation
		  (getRangeableValueType_SignificantDigits(),
		   source,
		   new String[] {
			   "name", "SIGNIFICANT-DIGITS",
			   "kind", "element"
		   });
		addAnnotation
		  (getRangeableValueType_BaseRangeable(),
		   source,
		   new String[] {
			   "name", "BASE-RANGEABLE-REF",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (unitEClass,
		   source,
		   new String[] {
			   "name", "UNIT",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUnit_Factor(),
		   source,
		   new String[] {
			   "name", "FACTOR",
			   "kind", "element"
		   });
		addAnnotation
		  (getUnit_Symbol(),
		   source,
		   new String[] {
			   "name", "SYMBOL",
			   "kind", "element"
		   });
		addAnnotation
		  (getUnit_Offset(),
		   source,
		   new String[] {
			   "name", "OFFSET",
			   "kind", "element"
		   });
		addAnnotation
		  (getUnit_Reference(),
		   source,
		   new String[] {
			   "name", "REFERENCE-REF",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (getUnit_Quantity(),
		   source,
		   new String[] {
			   "name", "QUANTITY-REF",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (eaArrayValueEClass,
		   source,
		   new String[] {
			   "name", "EA-ARRAY-VALUE",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEAArrayValue_Value(),
		   source,
		   new String[] {
			   "name", "VALUE",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (eaBooleanValueEClass,
		   source,
		   new String[] {
			   "name", "EA-BOOLEAN-VALUE",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEABooleanValue_Value(),
		   source,
		   new String[] {
			   "name", "VALUE",
			   "kind", "element"
		   });
		addAnnotation
		  (eaCompositeValueEClass,
		   source,
		   new String[] {
			   "name", "EA-COMPOSITE-VALUE",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEACompositeValue_Value(),
		   source,
		   new String[] {
			   "name", "VALUE",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (eaEnumerationValueEClass,
		   source,
		   new String[] {
			   "name", "EA-ENUMERATION-VALUE",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEAEnumerationValue_Value(),
		   source,
		   new String[] {
			   "name", "VALUE-REF",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (eaExpressionEClass,
		   source,
		   new String[] {
			   "name", "EA-EXPRESSION",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEAExpression_Value(),
		   source,
		   new String[] {
			   "name", "VALUE",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (eaNumericalValueEClass,
		   source,
		   new String[] {
			   "name", "EA-NUMERICAL-VALUE",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEANumericalValue_Value(),
		   source,
		   new String[] {
			   "name", "VALUE",
			   "kind", "element"
		   });
		addAnnotation
		  (eaStringValueEClass,
		   source,
		   new String[] {
			   "name", "EA-STRING-VALUE",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEAStringValue_Value(),
		   source,
		   new String[] {
			   "name", "VALUE",
			   "kind", "element"
		   });
		addAnnotation
		  (eaValueEClass,
		   source,
		   new String[] {
			   "name", "EA-VALUE",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEAValue_Type(),
		   source,
		   new String[] {
			   "name", "TYPE-TREF",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (userAttributeDefinitionEClass,
		   source,
		   new String[] {
			   "name", "USER-ATTRIBUTE-DEFINITION",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUserAttributeDefinition_DefaultValue(),
		   source,
		   new String[] {
			   "name", "DEFAULT-VALUE",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (getUserAttributeDefinition_Type(),
		   source,
		   new String[] {
			   "name", "TYPE-REF",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (userAttributedElementEClass,
		   source,
		   new String[] {
			   "name", "USER-ATTRIBUTED-ELEMENT",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUserAttributedElement_UaValue(),
		   source,
		   new String[] {
			   "name", "UA-VALUE",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (getUserAttributedElement_UaType(),
		   source,
		   new String[] {
			   "name", "UA-TYPE-REF",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (getUserAttributedElement_AttributedElement(),
		   source,
		   new String[] {
			   "name", "ATTRIBUTED-ELEMENT-REF",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (userElementTypeEClass,
		   source,
		   new String[] {
			   "name", "USER-ELEMENT-TYPE",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUserElementType_ValidFor(),
		   source,
		   new String[] {
			   "name", "VALID-FOR",
			   "kind", "element"
		   });
		addAnnotation
		  (getUserElementType_Key(),
		   source,
		   new String[] {
			   "name", "KEY",
			   "kind", "element"
		   });
		addAnnotation
		  (getUserElementType_UaDefinition(),
		   source,
		   new String[] {
			   "name", "UA-DEFINITION",
			   "kind", "element",
			   "namespace", "http://east-adl.info/2.1.12"
		   });
		addAnnotation
		  (booleanEDataType,
		   source,
		   new String[] {
			   "name", "BOOLEAN",
			   "pattern", "0|1|true|false"
		   });
		addAnnotation
		  (floatEDataType,
		   source,
		   new String[] {
			   "name", "FLOAT"
		   });
		addAnnotation
		  (identifierEDataType,
		   source,
		   new String[] {
			   "name", "IDENTIFIER",
			   "pattern", "[a-zA-Z]([a-zA-Z0-9]|_[a-zA-Z0-9])*_?"
		   });
		addAnnotation
		  (integerEDataType,
		   source,
		   new String[] {
			   "name", "INTEGER",
			   "pattern", "[+\\-]?[1-9][0-9]*|0x[0-9a-f]*|0[0-7]*|0b[0-1]*"
		   });
		addAnnotation
		  (numericalEDataType,
		   source,
		   new String[] {
			   "name", "NUMERICAL",
			   "pattern", "(0x[0-9a-f]*)|(0[1-7][0-7]*)|(0b[0-1]*)|([+\\-]?[0-9]+(\\.[0-9]*)?(E([+\\-]?)[0-9]*)?)"
		   });
		addAnnotation
		  (refEDataType,
		   source,
		   new String[] {
			   "name", "REF",
			   "pattern", "/?[a-zA-Z][a-zA-Z0-9_]{0,127}(/[a-zA-Z][a-zA-Z0-9_]{0,127})*"
		   });
		addAnnotation
		  (stringEDataType,
		   source,
		   new String[] {
			   "name", "STRING"
		   });
	}

	/**
	 * Initializes the annotations for <b>TaggedValues</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createTaggedValuesAnnotations() {
		String source = "TaggedValues";
		addAnnotation
		  (getFunctionAllocation_AllocatedElement(),
		   source,
		   new String[] {
			   "xml.name", "ALLOCATED-ELEMENT-IREF",
			   "xml.namePlural", "ALLOCATED-ELEMENT-IREFS",
			   "xml.roleElement", "true",
			   "xml.typeElement", "false",
			   "xml.typeWrapperElement", "false"
		   });
		addAnnotation
		  (getFunctionAllocation_Target(),
		   source,
		   new String[] {
			   "xml.name", "TARGET-IREF",
			   "xml.namePlural", "TARGET-IREFS",
			   "xml.roleElement", "true",
			   "xml.typeElement", "false",
			   "xml.typeWrapperElement", "false"
		   });
		addAnnotation
		  (getFunctionConnector_Port(),
		   source,
		   new String[] {
			   "xml.name", "PORT-IREF",
			   "xml.namePlural", "PORT-IREFS",
			   "xml.roleElement", "true",
			   "xml.typeElement", "false",
			   "xml.typeWrapperElement", "false"
		   });
		addAnnotation
		  (functionAllocation_allocatedElementEClass,
		   source,
		   new String[] {
			   "xml.name", "FUNCTION-ALLOCATION--ALLOCATED-ELEMENT-IREF"
		   });
		addAnnotation
		  (getFunctionAllocation_allocatedElement_AllocateableElement_context(),
		   source,
		   new String[] {
			   "xml.roleElement", "true",
			   "xml.roleWrapperElement", "false"
		   });
		addAnnotation
		  (getFunctionAllocation_allocatedElement_AllocateableElement(),
		   source,
		   new String[] {
			   "xml.roleElement", "true",
			   "xml.roleWrapperElement", "false"
		   });
		addAnnotation
		  (functionAllocation_targetEClass,
		   source,
		   new String[] {
			   "xml.name", "FUNCTION-ALLOCATION--TARGET-IREF"
		   });
		addAnnotation
		  (getFunctionAllocation_target_AllocationTarget_context(),
		   source,
		   new String[] {
			   "xml.roleElement", "true",
			   "xml.roleWrapperElement", "false"
		   });
		addAnnotation
		  (getFunctionAllocation_target_AllocationTarget(),
		   source,
		   new String[] {
			   "xml.roleElement", "true",
			   "xml.roleWrapperElement", "false"
		   });
		addAnnotation
		  (functionConnector_portEClass,
		   source,
		   new String[] {
			   "xml.name", "FUNCTION-CONNECTOR--PORT-IREF"
		   });
		addAnnotation
		  (getFunctionConnector_port_FunctionPrototype(),
		   source,
		   new String[] {
			   "xml.roleElement", "true",
			   "xml.roleWrapperElement", "false"
		   });
		addAnnotation
		  (getFunctionConnector_port_FunctionPort(),
		   source,
		   new String[] {
			   "xml.roleElement", "true",
			   "xml.roleWrapperElement", "false"
		   });
		addAnnotation
		  (getHardwareConnector_Port(),
		   source,
		   new String[] {
			   "xml.name", "PORT-IREF",
			   "xml.namePlural", "PORT-IREFS",
			   "xml.roleElement", "true",
			   "xml.typeElement", "false",
			   "xml.typeWrapperElement", "false"
		   });
		addAnnotation
		  (getPortConnector_Port(),
		   source,
		   new String[] {
			   "xml.name", "PORT-IREF",
			   "xml.namePlural", "PORT-IREFS",
			   "xml.roleElement", "true",
			   "xml.typeElement", "false",
			   "xml.typeWrapperElement", "false"
		   });
		addAnnotation
		  (hardwareConnector_portEClass,
		   source,
		   new String[] {
			   "xml.name", "HARDWARE-CONNECTOR--PORT-IREF"
		   });
		addAnnotation
		  (getHardwareConnector_port_HardwarePin(),
		   source,
		   new String[] {
			   "xml.roleElement", "true",
			   "xml.roleWrapperElement", "false"
		   });
		addAnnotation
		  (getHardwareConnector_port_HardwareComponentPrototype(),
		   source,
		   new String[] {
			   "xml.roleElement", "true",
			   "xml.roleWrapperElement", "false"
		   });
		addAnnotation
		  (hardwarePortConnector_portEClass,
		   source,
		   new String[] {
			   "xml.name", "HARDWARE-PORT-CONNECTOR--PORT-IREF"
		   });
		addAnnotation
		  (getHardwarePortConnector_port_HardwarePort(),
		   source,
		   new String[] {
			   "xml.roleElement", "true",
			   "xml.roleWrapperElement", "false"
		   });
		addAnnotation
		  (getHardwarePortConnector_port_HardwareComponentPrototype(),
		   source,
		   new String[] {
			   "xml.roleElement", "true",
			   "xml.roleWrapperElement", "false"
		   });
		addAnnotation
		  (eaxmlEClass,
		   source,
		   new String[] {
			   "admin.documentVersion", "2013-11-28",
			   "autosar.documentVersion", "4.0",
			   "xml.globalElement", "true"
		   });
		addAnnotation
		  (getRealization_Realized(),
		   source,
		   new String[] {
			   "xml.name", "REALIZED-IREF",
			   "xml.namePlural", "REALIZED-IREFS",
			   "xml.roleElement", "true",
			   "xml.typeElement", "false",
			   "xml.typeWrapperElement", "false"
		   });
		addAnnotation
		  (getRealization_RealizedBy(),
		   source,
		   new String[] {
			   "xml.name", "REALIZED-BY-IREF",
			   "xml.namePlural", "REALIZED-BY-IREFS",
			   "xml.roleElement", "true",
			   "xml.typeElement", "false",
			   "xml.typeWrapperElement", "false"
		   });
		addAnnotation
		  (getReferrable_ShortName(),
		   source,
		   new String[] {
			   "xml.enforceMinMultiplicity", "true",
			   "xml.sequenceOffset", "-100"
		   });
		addAnnotation
		  (getIdentifiable_Category(),
		   source,
		   new String[] {
			   "xml.sequenceOffset", "-50"
		   });
		addAnnotation
		  (getIdentifiable_Uuid(),
		   source,
		   new String[] {
			   "xml.attribute", "true"
		   });
		addAnnotation
		  (realization_realizedEClass,
		   source,
		   new String[] {
			   "xml.name", "REALIZATION--REALIZED-IREF"
		   });
		addAnnotation
		  (getRealization_realized_Identifiable_target(),
		   source,
		   new String[] {
			   "xml.roleElement", "true",
			   "xml.roleWrapperElement", "false"
		   });
		addAnnotation
		  (getRealization_realized_Identifiable_context(),
		   source,
		   new String[] {
			   "xml.roleElement", "true",
			   "xml.roleWrapperElement", "false"
		   });
		addAnnotation
		  (realization_realizedByEClass,
		   source,
		   new String[] {
			   "xml.name", "REALIZATION--REALIZED-BY-IREF"
		   });
		addAnnotation
		  (getRealization_realizedBy_Identifiable_target(),
		   source,
		   new String[] {
			   "xml.roleElement", "true",
			   "xml.roleWrapperElement", "false"
		   });
		addAnnotation
		  (getRealization_realizedBy_Identifiable_context(),
		   source,
		   new String[] {
			   "xml.roleElement", "true",
			   "xml.roleWrapperElement", "false"
		   });
		addAnnotation
		  (booleanEDataType,
		   source,
		   new String[] {
			   "xml.xsd.customType", "BOOLEAN",
			   "xml.xsd.pattern", "0|1|true|false",
			   "xml.xsd.type", "string"
		   });
		addAnnotation
		  (floatEDataType,
		   source,
		   new String[] {
			   "xml.xsd.type", "double"
		   });
		addAnnotation
		  (identifierEDataType,
		   source,
		   new String[] {
			   "xml.xsd.customType", "IDENTIFIER",
			   "xml.xsd.maxLength", "128",
			   "xml.xsd.pattern", "[a-zA-Z]([a-zA-Z0-9]|_[a-zA-Z0-9])*_?",
			   "xml.xsd.type", "string"
		   });
		addAnnotation
		  (integerEDataType,
		   source,
		   new String[] {
			   "xml.xsd.customType", "INTEGER",
			   "xml.xsd.pattern", "[+\\-]?[1-9][0-9]*|0x[0-9a-f]*|0[0-7]*|0b[0-1]*",
			   "xml.xsd.type", "string"
		   });
		addAnnotation
		  (numericalEDataType,
		   source,
		   new String[] {
			   "xml.xsd.customType", "NUMERICAL-VALUE",
			   "xml.xsd.pattern", "(0x[0-9a-f]*)|(0[1-7][0-7]*)|(0b[0-1]*)|([+\\-]?[0-9]+(\\.[0-9]*)?(E([+\\-]?)[0-9]*)?)",
			   "xml.xsd.type", "string"
		   });
		addAnnotation
		  (refEDataType,
		   source,
		   new String[] {
			   "xml.xsd.customType", "REF",
			   "xml.xsd.pattern", "/?[a-zA-Z][a-zA-Z0-9_]{0,127}(/[a-zA-Z][a-zA-Z0-9_]{0,127})*",
			   "xml.xsd.type", "string"
		   });
		addAnnotation
		  (stringEDataType,
		   source,
		   new String[] {
			   "xml.xsd.type", "string"
		   });
	}

} //Eastadl22_alphaPackageImpl
