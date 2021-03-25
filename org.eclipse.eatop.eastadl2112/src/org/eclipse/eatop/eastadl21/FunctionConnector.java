/**
 */
package org.eclipse.eatop.eastadl21;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The FunctionConnector indicates that the connected FunctionPorts exchange signals or client-server requests/responses.
 * 
 * A FunctionConnector used to connect ports of parts within a FunctionType is called an assembly connector. A FunctionConnector between a port of a part and a port of the FunctionType itself is called a delegation connector.
 * 
 * Semantics:
 * The FunctionConnector connects a pair of FunctionFlowPorts or FunctionClientServerPorts. If two FunctionFlowPorts are connected, data elements of the type of the output FunctionFlowPort flow from the output FunctionFlowPort to the input FunctionFlowPort. If FunctionClientServerPorts are connected, the client calls the server according to the operations of the interfaces. 
 * 
 * The FunctionPrototype with the connected port has to be identified by the FunctionConnector as well.
 * 
 * The FunctionConnector is normally routed according to the hardware topology and the allocation of source and destination. If there are redundant paths, a FunctionAllocation may be used to prescribe allocation.
 * 
 * 
 * Constraints:
 * [1] Can connect two FunctionFlowPorts of different directions when this is an assembly FunctionConnector.
 * 
 * [2] Can connect two FunctionFlowPorts of the same direction when this is a delegation FunctionConnector.
 * 
 * [3] Can connect two ClientServerPorts of different kinds when this is an assembly FunctionConnector.
 * 
 * [4] Can connect two ClientServerPorts of the same kind when this is a delegation FunctionConnector.
 * 
 * [5] Can connect two FunctionFlowPorts with direction inout.
 * 
 * Notation: FunctionConnector is shown as a solid line
 * 
 * Extension: UML Connector
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Structure.FunctionModeling.FunctionConnector</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eatop.eastadl21.FunctionConnector#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getFunctionConnector()
 * @model annotation="MetaData guid='{48EF76B0-7C42-4534-A8AC-5CC55844C363}' id='40' EA\040name='FunctionConnector'"
 *        annotation="Stereotype Stereotype='atpStructureElement'"
 *        extendedMetaData="name='FUNCTION-CONNECTOR' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='FUNCTION-CONNECTORS'"
 * @generated
 */
public interface FunctionConnector extends EAElement, EAConnector, AllocateableElement {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.eatop.eastadl21.FunctionConnector_port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getFunctionConnector_Port()
	 * @model containment="true" lower="2" upper="2"
	 *        annotation="MetaData guid='{08786CF1-06DA-4ecf-8DD3-C530F308D3CF}' id='659' EA\040name=''"
	 *        annotation="TaggedValues xml.name='PORT-IREF' xml.namePlural='PORT-IREFS' xml.roleElement='true' xml.typeElement='false' xml.typeWrapperElement='false'"
	 *        extendedMetaData="name='PORT-IREF' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='PORT-IREFS' xmlAttribute='false' featureWrapperElement='true' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	EList<FunctionConnector_port> getPort();

} // FunctionConnector
