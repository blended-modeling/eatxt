/**
 */
package eastadl22_alpha;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Connector port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * null
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Structure.HardwareModeling._instanceRef.HardwareConnector_port</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eastadl22_alpha.HardwareConnector_port#getHardwarePin <em>Hardware Pin</em>}</li>
 *   <li>{@link eastadl22_alpha.HardwareConnector_port#getHardwareComponentPrototype <em>Hardware Component Prototype</em>}</li>
 * </ul>
 *
 * @see eastadl22_alpha.Eastadl22_alphaPackage#getHardwareConnector_port()
 * @model annotation="MetaData guid='{A026C05F-7FC6-4c46-843F-5D2086B56565}' id='79' EA\040name='HardwareConnector_port'"
 *        annotation="Stereotype Stereotype='instanceRef'"
 *        annotation="TaggedValues xml.name='HARDWARE-CONNECTOR--PORT-IREF'"
 *        extendedMetaData="name='HARDWARE-CONNECTOR--PORT-IREF' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='HARDWARE-CONNECTOR--PORT-IREFS'"
 * @generated
 */
public interface HardwareConnector_port extends EObject {
	/**
	 * Returns the value of the '<em><b>Hardware Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware Pin</em>' reference.
	 * @see #setHardwarePin(HardwarePin)
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getHardwareConnector_port_HardwarePin()
	 * @model required="true"
	 *        annotation="MetaData guid='{010A420A-407F-4eb1-B040-2C2AA4DCD91B}' id='560' EA\040name=''"
	 *        annotation="Stereotype Stereotype='instanceRef.target'"
	 *        annotation="TaggedValues xml.roleElement='true' xml.roleWrapperElement='false'"
	 *        extendedMetaData="name='HARDWARE-PIN-REF' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='HARDWARE-PIN-REFS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	HardwarePin getHardwarePin();

	/**
	 * Sets the value of the '{@link eastadl22_alpha.HardwareConnector_port#getHardwarePin <em>Hardware Pin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware Pin</em>' reference.
	 * @see #getHardwarePin()
	 * @generated
	 */
	void setHardwarePin(HardwarePin value);

	/**
	 * Returns the value of the '<em><b>Hardware Component Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware Component Prototype</em>' reference.
	 * @see #setHardwareComponentPrototype(HardwareComponentPrototype)
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getHardwareConnector_port_HardwareComponentPrototype()
	 * @model annotation="MetaData guid='{E3B999A4-29A7-4966-9AA6-31443620B999}' id='569' EA\040name=''"
	 *        annotation="Stereotype Stereotype='instanceRef.context'"
	 *        annotation="TaggedValues xml.roleElement='true' xml.roleWrapperElement='false'"
	 *        extendedMetaData="name='HARDWARE-COMPONENT-PROTOTYPE-REF' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='HARDWARE-COMPONENT-PROTOTYPE-REFS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	HardwareComponentPrototype getHardwareComponentPrototype();

	/**
	 * Sets the value of the '{@link eastadl22_alpha.HardwareConnector_port#getHardwareComponentPrototype <em>Hardware Component Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware Component Prototype</em>' reference.
	 * @see #getHardwareComponentPrototype()
	 * @generated
	 */
	void setHardwareComponentPrototype(HardwareComponentPrototype value);

} // HardwareConnector_port
