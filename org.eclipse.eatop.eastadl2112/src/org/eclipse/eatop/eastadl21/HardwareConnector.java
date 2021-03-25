/**
 */
package org.eclipse.eatop.eastadl21;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Hardware connectors represent wires that electrically connect the hardware components through its pins.
 * 
 * Semantics:
 * The HardwareConnector represent a wire or conductor that joins the referenced pins electrically.
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Structure.HardwareModeling.HardwareConnector</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eatop.eastadl21.HardwareConnector#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getHardwareConnector()
 * @model annotation="MetaData guid='{5A2BFB83-CF90-464a-861C-B401F27A2139}' id='64' EA\040name='HardwareConnector'"
 *        annotation="Stereotype Stereotype='atpStructureElement'"
 *        extendedMetaData="name='HARDWARE-CONNECTOR' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='HARDWARE-CONNECTORS'"
 * @generated
 */
public interface HardwareConnector extends EAElement, EAConnector {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.eatop.eastadl21.HardwareConnector_port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getHardwareConnector_Port()
	 * @model containment="true" lower="2" upper="2"
	 *        annotation="MetaData guid='{045A446B-B69C-459f-A27F-AAFE827A64CD}' id='586' EA\040name=''"
	 *        annotation="TaggedValues xml.name='PORT-IREF' xml.namePlural='PORT-IREFS' xml.roleElement='true' xml.typeElement='false' xml.typeWrapperElement='false'"
	 *        extendedMetaData="name='PORT-IREF' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='PORT-IREFS' xmlAttribute='false' featureWrapperElement='true' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	EList<HardwareConnector_port> getPort();

} // HardwareConnector
