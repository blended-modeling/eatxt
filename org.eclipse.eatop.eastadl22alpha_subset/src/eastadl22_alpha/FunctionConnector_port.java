/**
 */
package eastadl22_alpha;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Connector port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * null
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Structure.FunctionModeling._instanceRef.FunctionConnector_port</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eastadl22_alpha.FunctionConnector_port#getFunctionPrototype <em>Function Prototype</em>}</li>
 *   <li>{@link eastadl22_alpha.FunctionConnector_port#getFunctionPort <em>Function Port</em>}</li>
 * </ul>
 *
 * @see eastadl22_alpha.Eastadl22_alphaPackage#getFunctionConnector_port()
 * @model annotation="MetaData guid='{527FF4D4-61FC-4db3-BFD2-AF17B822EB3D}' id='60' EA\040name='FunctionConnector_port'"
 *        annotation="Stereotype Stereotype='instanceRef'"
 *        annotation="TaggedValues xml.name='FUNCTION-CONNECTOR--PORT-IREF'"
 *        extendedMetaData="name='FUNCTION-CONNECTOR--PORT-IREF' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='FUNCTION-CONNECTOR--PORT-IREFS'"
 * @generated
 */
public interface FunctionConnector_port extends EObject {
	/**
	 * Returns the value of the '<em><b>Function Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Prototype</em>' reference.
	 * @see #setFunctionPrototype(FunctionPrototype)
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getFunctionConnector_port_FunctionPrototype()
	 * @model annotation="MetaData guid='{30EE37E6-C38C-4021-A49D-721B759870D0}' id='634' EA\040name=''"
	 *        annotation="Stereotype Stereotype='instanceRef.context'"
	 *        annotation="TaggedValues xml.roleElement='true' xml.roleWrapperElement='false'"
	 *        extendedMetaData="name='FUNCTION-PROTOTYPE-REF' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='FUNCTION-PROTOTYPE-REFS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	FunctionPrototype getFunctionPrototype();

	/**
	 * Sets the value of the '{@link eastadl22_alpha.FunctionConnector_port#getFunctionPrototype <em>Function Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Prototype</em>' reference.
	 * @see #getFunctionPrototype()
	 * @generated
	 */
	void setFunctionPrototype(FunctionPrototype value);

	/**
	 * Returns the value of the '<em><b>Function Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Port</em>' reference.
	 * @see #setFunctionPort(FunctionPort)
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getFunctionConnector_port_FunctionPort()
	 * @model required="true"
	 *        annotation="MetaData guid='{41E5A08C-358B-4971-9D2A-B92713B6536D}' id='678' EA\040name=''"
	 *        annotation="Stereotype Stereotype='instanceRef.target'"
	 *        annotation="TaggedValues xml.roleElement='true' xml.roleWrapperElement='false'"
	 *        extendedMetaData="name='FUNCTION-PORT-REF' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='FUNCTION-PORT-REFS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	FunctionPort getFunctionPort();

	/**
	 * Sets the value of the '{@link eastadl22_alpha.FunctionConnector_port#getFunctionPort <em>Function Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Port</em>' reference.
	 * @see #getFunctionPort()
	 * @generated
	 */
	void setFunctionPort(FunctionPort value);

} // FunctionConnector_port
