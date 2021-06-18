/**
 */
package eastadl22_alpha;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Port Connector port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * null
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Structure.HardwareModeling._instanceRef.HardwarePortConnector_port</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eastadl22_alpha.HardwarePortConnector_port#getHardwarePort <em>Hardware Port</em>}</li>
 *   <li>{@link eastadl22_alpha.HardwarePortConnector_port#getHardwareComponentPrototype <em>Hardware Component Prototype</em>}</li>
 * </ul>
 *
 * @see eastadl22_alpha.Eastadl22_alphaPackage#getHardwarePortConnector_port()
 * @model annotation="MetaData guid='{C8A001F2-4DBE-4251-AA6D-C9EDFA45F14E}' id='80' EA\040name='HardwarePortConnector_port'"
 *        annotation="Stereotype Stereotype='instanceRef'"
 *        annotation="TaggedValues xml.name='HARDWARE-PORT-CONNECTOR--PORT-IREF'"
 *        extendedMetaData="name='HARDWARE-PORT-CONNECTOR--PORT-IREF' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='HARDWARE-PORT-CONNECTOR--PORT-IREFS'"
 * @generated
 */
public interface HardwarePortConnector_port extends EObject {
	/**
	 * Returns the value of the '<em><b>Hardware Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware Port</em>' reference.
	 * @see #setHardwarePort(HardwarePort)
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getHardwarePortConnector_port_HardwarePort()
	 * @model required="true"
	 *        annotation="MetaData guid='{FC79F778-FDA8-44ac-AB77-45B514F10D0C}' id='545' EA\040name=''"
	 *        annotation="Stereotype Stereotype='instanceRef.target'"
	 *        annotation="TaggedValues xml.roleElement='true' xml.roleWrapperElement='false'"
	 *        extendedMetaData="name='HARDWARE-PORT-REF' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='HARDWARE-PORT-REFS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	HardwarePort getHardwarePort();

	/**
	 * Sets the value of the '{@link eastadl22_alpha.HardwarePortConnector_port#getHardwarePort <em>Hardware Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware Port</em>' reference.
	 * @see #getHardwarePort()
	 * @generated
	 */
	void setHardwarePort(HardwarePort value);

	/**
	 * Returns the value of the '<em><b>Hardware Component Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware Component Prototype</em>' reference.
	 * @see #setHardwareComponentPrototype(HardwareComponentPrototype)
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getHardwarePortConnector_port_HardwareComponentPrototype()
	 * @model annotation="MetaData guid='{C2E8CDA0-92AA-4322-91D5-97BC4ABB70C7}' id='571' EA\040name=''"
	 *        annotation="Stereotype Stereotype='instanceRef.context'"
	 *        annotation="TaggedValues xml.roleElement='true' xml.roleWrapperElement='false'"
	 *        extendedMetaData="name='HARDWARE-COMPONENT-PROTOTYPE-REF' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='HARDWARE-COMPONENT-PROTOTYPE-REFS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	HardwareComponentPrototype getHardwareComponentPrototype();

	/**
	 * Sets the value of the '{@link eastadl22_alpha.HardwarePortConnector_port#getHardwareComponentPrototype <em>Hardware Component Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware Component Prototype</em>' reference.
	 * @see #getHardwareComponentPrototype()
	 * @generated
	 */
	void setHardwareComponentPrototype(HardwareComponentPrototype value);

} // HardwarePortConnector_port
