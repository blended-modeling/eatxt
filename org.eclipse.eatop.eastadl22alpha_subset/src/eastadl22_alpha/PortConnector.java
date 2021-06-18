/**
 */
package eastadl22_alpha;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PortConnector is an abstract entity representing a connection between two hardware ports.
 * 
 * Semantics:
 * See specializations
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Structure.HardwareModeling.PortConnector</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eastadl22_alpha.PortConnector#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see eastadl22_alpha.Eastadl22_alphaPackage#getPortConnector()
 * @model abstract="true"
 *        annotation="MetaData guid='{13CD52D4-1F53-4be2-9264-00E219AE7E83}' id='62' EA\040name='PortConnector'"
 *        annotation="Stereotype Stereotype='atpStructureElement'"
 *        extendedMetaData="name='PORT-CONNECTOR' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='PORT-CONNECTORS'"
 * @generated
 */
public interface PortConnector extends EAConnector, AllocationTarget {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link eastadl22_alpha.HardwarePortConnector_port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getPortConnector_Port()
	 * @model containment="true" lower="2" upper="2"
	 *        annotation="MetaData guid='{9480F58F-5086-4dd1-9391-1CCBD530026E}' id='589' EA\040name=''"
	 *        annotation="TaggedValues xml.name='PORT-IREF' xml.namePlural='PORT-IREFS' xml.roleElement='true' xml.typeElement='false' xml.typeWrapperElement='false'"
	 *        extendedMetaData="name='PORT-IREF' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='PORT-IREFS' xmlAttribute='false' featureWrapperElement='true' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	EList<HardwarePortConnector_port> getPort();

} // PortConnector
