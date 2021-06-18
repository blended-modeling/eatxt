/**
 */
package eastadl22_alpha;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Client Server Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The FunctionClientServerInterface is used to specify the operations in FunctionClientServerPorts.
 * 
 * Semantics:
 * The operations of the FunctionClientServerInterface are required or provided through the FunctionClientServerPorts typed by the FunctionClientServerInterface.
 * 
 * Extension: UML Interface
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Structure.FunctionModeling.FunctionClientServerInterface</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eastadl22_alpha.FunctionClientServerInterface#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see eastadl22_alpha.Eastadl22_alphaPackage#getFunctionClientServerInterface()
 * @model annotation="MetaData guid='{7437700A-B53A-4558-B709-93B1C33C8B72}' id='49' EA\040name='FunctionClientServerInterface'"
 *        annotation="Stereotype Stereotype='atpType'"
 *        extendedMetaData="name='FUNCTION-CLIENT-SERVER-INTERFACE' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='FUNCTION-CLIENT-SERVER-INTERFACES'"
 * @generated
 */
public interface FunctionClientServerInterface extends TraceableSpecification {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
	 * The list contents are of type {@link eastadl22_alpha.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference list.
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getFunctionClientServerInterface_Operation()
	 * @model containment="true"
	 *        annotation="MetaData guid='{9E2B087B-33AF-4626-8067-675BAC88FBDD}' id='652' EA\040name=''"
	 *        extendedMetaData="name='OPERATION' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='OPERATIONS' xmlAttribute='false' featureWrapperElement='true' featureElement='false' classifierWrapperElement='false' classifierElement='true'"
	 * @generated
	 */
	EList<Operation> getOperation();

} // FunctionClientServerInterface
