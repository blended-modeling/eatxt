/**
 */
package eastadl22_alpha;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The abstract metaclass FunctionType abstracts the function component types that are used to model the functional structure, which is distinguished from the implementation of component types using AUTOSAR. The syntax of FunctionTypes is inspired from the concept of Block from SysML.
 * 
 * FunctionBehavior and FunctionTrigger in the Behavior package are associated to a FunctionType.
 * 
 * 
 * Semantics:
 * The FunctionType abstracts the function component types that are used to model the functional structure on AnalysisLevel and DesignLevel.
 * Leaf functions of an EAST-ADL function hierarchy are called elementary Functions.
 * Elementary Functions have synchronous execution semantics:
 * 1. Read inputs
 * 2. Execute (duration: Execution time)
 * 3. Write outputs
 * Execution is defined by a behavior that acts as a transfer function.
 * Subclasses of the abstract class FunctionType add their own semantics.
 * 
 * If a behavior is attached to the FunctionType, the execution semantic for a discrete elementary FunctionType complies with the run-to-completion semantic. This has the following implications:
 * 
 * 1. Input that arrives at the input FunctionPorts after execution begins will be ignored until the next execution cycle.
 * 
 * 2. If more than one input value arrives per FunctionPort before execution begins, the last value will override all previous ones in the public part of the input FunctionPort (single element buffers for input).
 * 
 * 3. The local part of a FunctionPort does not change its value during execution of the behavior.
 * 
 * 4. During an execution cycle, only one output value can be sent per FunctionPort. If consecutive output values are produced on the same FunctionPort during a single execution cycle, the last value will override all previous ones on the output FunctionPort (single element buffers for output).
 * 
 * 5. Output will not be available at an output FunctionPort before execution ends.
 * 
 * 6. Elementary FunctionTypes may not produce any side effects (i.e., all data passes the FunctionPorts).
 * 
 * 
 * Constraints:
 * [1] Elementary FunctionTypes shall not have parts.
 * 
 * 
 * Notation:
 * The FunctionType is shown as a solid-outline rectangle containing the name, with its FunctionPorts or PortGroups on the perimeter. Contained entities may be shown with their FunctionConnectors (White-box view).
 * 
 * 
 * Extension: UML Class, specialization of SysML::Block
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Structure.FunctionModeling.FunctionType</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eastadl22_alpha.FunctionType#getIsElementary <em>Is Elementary</em>}</li>
 *   <li>{@link eastadl22_alpha.FunctionType#getPortGroup <em>Port Group</em>}</li>
 *   <li>{@link eastadl22_alpha.FunctionType#getConnector <em>Connector</em>}</li>
 *   <li>{@link eastadl22_alpha.FunctionType#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see eastadl22_alpha.Eastadl22_alphaPackage#getFunctionType()
 * @model abstract="true"
 *        annotation="MetaData guid='{49E3AA17-2E8F-4a27-B9F6-B22E8248B778}' id='42' EA\040name='FunctionType'"
 *        annotation="Stereotype Stereotype='atpType'"
 *        extendedMetaData="name='FUNCTION-TYPE' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='FUNCTION-TYPES'"
 * @generated
 */
public interface FunctionType extends Context, EAType {
	/**
	 * Returns the value of the '<em><b>Is Elementary</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True, when this type must not have any parts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Elementary</em>' attribute.
	 * @see #isSetIsElementary()
	 * @see #unsetIsElementary()
	 * @see #setIsElementary(Boolean)
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getFunctionType_IsElementary()
	 * @model default="false" unsettable="true" dataType="eastadl22_alpha.Boolean"
	 *        annotation="MetaData guid='{5E1BBB96-8761-4338-A6AC-B2F07E32B433}' id='40' EA\040name='isElementary'"
	 *        extendedMetaData="name='IS-ELEMENTARY' kind='element'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='IS-ELEMENTARYS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	Boolean getIsElementary();

	/**
	 * Sets the value of the '{@link eastadl22_alpha.FunctionType#getIsElementary <em>Is Elementary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Elementary</em>' attribute.
	 * @see #isSetIsElementary()
	 * @see #unsetIsElementary()
	 * @see #getIsElementary()
	 * @generated
	 */
	void setIsElementary(Boolean value);

	/**
	 * Unsets the value of the '{@link eastadl22_alpha.FunctionType#getIsElementary <em>Is Elementary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsElementary()
	 * @see #getIsElementary()
	 * @see #setIsElementary(Boolean)
	 * @generated
	 */
	void unsetIsElementary();

	/**
	 * Returns whether the value of the '{@link eastadl22_alpha.FunctionType#getIsElementary <em>Is Elementary</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Elementary</em>' attribute is set.
	 * @see #unsetIsElementary()
	 * @see #getIsElementary()
	 * @see #setIsElementary(Boolean)
	 * @generated
	 */
	boolean isSetIsElementary();

	/**
	 * Returns the value of the '<em><b>Port Group</b></em>' containment reference list.
	 * The list contents are of type {@link eastadl22_alpha.PortGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Group</em>' containment reference list.
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getFunctionType_PortGroup()
	 * @model containment="true"
	 *        annotation="MetaData guid='{9BE4A996-E5F6-492d-ABCA-DB1237190462}' id='644' EA\040name=''"
	 *        extendedMetaData="name='PORT-GROUP' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='PORT-GROUPS' xmlAttribute='false' featureWrapperElement='true' featureElement='false' classifierWrapperElement='false' classifierElement='true'"
	 * @generated
	 */
	EList<PortGroup> getPortGroup();

	/**
	 * Returns the value of the '<em><b>Connector</b></em>' containment reference list.
	 * The list contents are of type {@link eastadl22_alpha.FunctionConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' containment reference list.
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getFunctionType_Connector()
	 * @model containment="true"
	 *        annotation="MetaData guid='{675E9D03-0146-43ff-9086-C754A9FA69EA}' id='656' EA\040name=''"
	 *        extendedMetaData="name='CONNECTOR' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='CONNECTORS' xmlAttribute='false' featureWrapperElement='true' featureElement='false' classifierWrapperElement='false' classifierElement='true'"
	 * @generated
	 */
	EList<FunctionConnector> getConnector();

	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link eastadl22_alpha.FunctionPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getFunctionType_Port()
	 * @model containment="true"
	 *        annotation="MetaData guid='{A81C4B4A-221A-42b1-AE7D-0F3B943394B5}' id='671' EA\040name=''"
	 *        extendedMetaData="name='PORT' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='PORTS' xmlAttribute='false' featureWrapperElement='true' featureElement='false' classifierWrapperElement='false' classifierElement='true'"
	 * @generated
	 */
	EList<FunctionPort> getPort();

} // FunctionType
