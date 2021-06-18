/**
 */
package eastadl22_alpha;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Function Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The HardwareFunctionType is the transfer function for the identified HardwareComponentType or a specification of an intended transfer function. HardwareFunctionType types DesignFunctionPrototypes in the FunctionalDesignArchitecture. The ports of such DesignFunctionPrototypes are typically connected to a plant model with ClampConnectors.
 * 
 * DesignFunctionPrototypes typed by HardwareFunctionType may be allocated to HardwareComponents in which case the HardwareFunctionType must match the HardwareFunctionType of the target HardwareComponent. Typically, the same HardwareFunctionType types the prototype that is allocated to its target HardwareComponent.
 * 
 * HardwareFunctionTypes are typically transfer functions of sensors, actuators, amplifiers and other peripherals with a fixed transfer function. Thus, HardwareFunctionTypes are generally not defined for ECUNodes.
 * 
 * Constraints:
 * [1] A DesignFunctionPrototype typed by a HardwareFunctionType shall be connected to the EnvironmentModel via ClampConnectors and to BasicSoftwareFunctions via FunctionConnectors.
 * [2] A HardwareFunctionType shall only contain prototypes typed by HardwareFunctionType.
 * 
 * Semantics: 
 * The HardwareFunctionType is the transfer function for the associated hardware components such as sensors, actuators, amplifiers, etc or a specification of an intended transfer function.
 * 
 * A DesignFunctionPrototype typed by a HardwareFunctionType allocated to Sensors or Actuators is the interfacing element to the plant model.
 * 
 * Extension: 
 * UML Class, specialization of SysML::Block
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Structure.FunctionModeling.HardwareFunctionType</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eastadl22_alpha.HardwareFunctionType#getHardwareComponent <em>Hardware Component</em>}</li>
 * </ul>
 *
 * @see eastadl22_alpha.Eastadl22_alphaPackage#getHardwareFunctionType()
 * @model annotation="MetaData guid='{EC92E36B-69A9-4237-8642-6FC1E2849578}' id='56' EA\040name='HardwareFunctionType'"
 *        extendedMetaData="name='HARDWARE-FUNCTION-TYPE' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='HARDWARE-FUNCTION-TYPES'"
 * @generated
 */
public interface HardwareFunctionType extends DesignFunctionType {
	/**
	 * Returns the value of the '<em><b>Hardware Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware Component</em>' reference.
	 * @see #setHardwareComponent(HardwareComponentType)
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getHardwareFunctionType_HardwareComponent()
	 * @model annotation="MetaData guid='{65DF489B-BF68-4800-B137-072573689AB2}' id='597' EA\040name=''"
	 *        extendedMetaData="name='HARDWARE-COMPONENT-REF' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='HARDWARE-COMPONENT-REFS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	HardwareComponentType getHardwareComponent();

	/**
	 * Sets the value of the '{@link eastadl22_alpha.HardwareFunctionType#getHardwareComponent <em>Hardware Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware Component</em>' reference.
	 * @see #getHardwareComponent()
	 * @generated
	 */
	void setHardwareComponent(HardwareComponentType value);

} // HardwareFunctionType
