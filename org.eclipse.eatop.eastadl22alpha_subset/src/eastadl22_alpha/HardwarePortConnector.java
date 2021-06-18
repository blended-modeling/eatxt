/**
 */
package eastadl22_alpha;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Port Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * HardwarePortConnector represents a set of electrical connecting wires such as a cable, connecting the referenced ports. In case the HardwarePortConnector realizes a LogicalPortConnector, this is indicated by a Realization relationship, where the HardwarePortConnector is the "realizedBy" element and the LogicalPortConnector is the "realized" element.
 * 
 * Constraints:
 * No additional constraints
 * 
 * Semantics:
 * The HardwarePortConnector represents a physical connection between its two referenced HardwarePorts.
 * 
 * The pins contained in the connected HardwarePorts are
 * <ul>
 * 	<li>implicitly connected according to the name matching (Name or Shortname) and direction matching of HardwarePins in the connected HardwarePorts
 * or</li>
 * 	<li>(with precedence) explicitly connected according to the contained HardwareConnectors.</li>
 * </ul>
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Structure.HardwareModeling.HardwarePortConnector</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eastadl22_alpha.HardwarePortConnector#getConnector <em>Connector</em>}</li>
 * </ul>
 *
 * @see eastadl22_alpha.Eastadl22_alphaPackage#getHardwarePortConnector()
 * @model annotation="MetaData guid='{B2E37CF6-5FCD-45d5-BA73-03208CC7627F}' id='341' EA\040name='HardwarePortConnector'"
 *        annotation="Stereotype Stereotype='atpStructureElement'"
 *        extendedMetaData="name='HARDWARE-PORT-CONNECTOR' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='HARDWARE-PORT-CONNECTORS'"
 * @generated
 */
public interface HardwarePortConnector extends EAConnector, PortConnector {
	/**
	 * Returns the value of the '<em><b>Connector</b></em>' containment reference list.
	 * The list contents are of type {@link eastadl22_alpha.HardwareConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' containment reference list.
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getHardwarePortConnector_Connector()
	 * @model containment="true"
	 *        annotation="MetaData guid='{7A73A93C-376A-4b21-9F62-1811EFDC1ECB}' id='591' EA\040name=''"
	 *        extendedMetaData="name='CONNECTOR' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='CONNECTORS' xmlAttribute='false' featureWrapperElement='true' featureElement='false' classifierWrapperElement='false' classifierElement='true'"
	 * @generated
	 */
	EList<HardwareConnector> getConnector();

} // HardwarePortConnector
