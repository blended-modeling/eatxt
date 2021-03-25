/**
 */
package org.eclipse.eatop.eastadl21;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The PortGroup represents several FunctionPorts grouped into one. All FunctionPorts that are part of a PortGroup are graphically represented as a single FunctionPort. The PortGroup has no semantic meaning except that it makes graphical representation of the connected FunctionPorts easier to read, and provides a means to logically organize several FunctionPorts into one group.
 * 
 * Connectors are still connected to the contained FunctionPorts, but tool support may simplify connections by allowing semiautomatic or automatic connection to all FunctionPorts of a PortGroup.
 * 
 * Note that the term "PortGroup" is also used by AADL.
 * 
 * Semantics:
 * The PortGroup provides the means to organize FunctionPorts and FunctionConnectors. It does not add semantics. In the model, the FunctionPorts contained in the PortGroup are connected as individual FunctionPorts.
 * 
 * Constraints:
 * [1] The FunctionPorts in a PortGroup must all be of the same component; all FunctionPorts in a PortGroup must be of the same kind (FunctionFlowPort with same EADirectionKind or FunctionClientServerPort with same ClientServerKind).
 * 
 * Notation:
 * FunctionConnectors connected to FunctionPorts of a PortGroup are graphically collapsed into a single line.
 * The PortGroup is rendered as its contained ports, but with a double outline.
 * 
 * Extension: Class
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Structure.FunctionModeling.PortGroup</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eatop.eastadl21.PortGroup#getPortGroup <em>Port Group</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.PortGroup#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getPortGroup()
 * @model annotation="MetaData guid='{8530392A-D9F3-468f-9ABE-775410A7EFEA}' id='50' EA\040name='PortGroup'"
 *        extendedMetaData="name='PORT-GROUP' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='PORT-GROUPS'"
 * @generated
 */
public interface PortGroup extends EAElement {
	/**
	 * Returns the value of the '<em><b>Port Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.eatop.eastadl21.PortGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Group</em>' containment reference list.
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getPortGroup_PortGroup()
	 * @model containment="true"
	 *        annotation="MetaData guid='{B9130A83-778C-4324-A5F6-6EF9D6969514}' id='608' EA\040name=''"
	 *        extendedMetaData="name='PORT-GROUP' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='PORT-GROUPS' xmlAttribute='false' featureWrapperElement='true' featureElement='false' classifierWrapperElement='false' classifierElement='true'"
	 * @generated
	 */
	EList<PortGroup> getPortGroup();

	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.eatop.eastadl21.FunctionPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference list.
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getPortGroup_Port()
	 * @model annotation="MetaData guid='{104D41E9-2C9C-4425-9675-695D5B4D8FCC}' id='681' EA\040name=''"
	 *        extendedMetaData="name='PORT-REF' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='PORT-REFS' xmlAttribute='false' featureWrapperElement='true' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	EList<FunctionPort> getPort();

} // PortGroup
