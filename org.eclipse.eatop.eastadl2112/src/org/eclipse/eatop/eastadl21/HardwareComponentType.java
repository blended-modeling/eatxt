/**
 */
package org.eclipse.eatop.eastadl21;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The HardwareComponentType represents a hardware element on an abstract level, allowing preliminary engineering activities related to hardware.
 * 
 * Semantics:
 * The HardwareComponentType is a structural entity that defines a part of an electrical architecture. Through its ports it can be connected to electrical sources and sinks. Its logical behavior, the transfer function, may be defined in a HardwareFunctionType referencing the HardwareComponentType. This is typically connected through its ports to the environment model to participate in the end-to-end behavioral definition of a function.
 * 
 * Extension:
 * Class
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Structure.HardwareModeling.HardwareComponentType</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eatop.eastadl21.HardwareComponentType#getPin <em>Pin</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.HardwareComponentType#getPart <em>Part</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.HardwareComponentType#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.HardwareComponentType#getPort <em>Port</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.HardwareComponentType#getPortConnector <em>Port Connector</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getHardwareComponentType()
 * @model annotation="MetaData guid='{F850D1D4-02F6-4e8a-A2D9-A17A1CF88DED}' id='77' EA\040name='HardwareComponentType'"
 *        annotation="Stereotype Stereotype='atpType'"
 *        extendedMetaData="name='HARDWARE-COMPONENT-TYPE' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='HARDWARE-COMPONENT-TYPES'"
 * @generated
 */
public interface HardwareComponentType extends Context, EAType {
	/**
	 * Returns the value of the '<em><b>Pin</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.eatop.eastadl21.HardwarePin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin</em>' containment reference list.
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getHardwareComponentType_Pin()
	 * @model containment="true"
	 *        annotation="MetaData guid='{12E210BA-92FD-4a37-AD85-B3ACF51D5EEA}' id='558' EA\040name=''"
	 *        extendedMetaData="name='PIN' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='PINS' xmlAttribute='false' featureWrapperElement='true' featureElement='false' classifierWrapperElement='false' classifierElement='true'"
	 * @generated
	 */
	EList<HardwarePin> getPin();

	/**
	 * Returns the value of the '<em><b>Part</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.eatop.eastadl21.HardwareComponentPrototype}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part</em>' containment reference list.
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getHardwareComponentType_Part()
	 * @model containment="true"
	 *        annotation="MetaData guid='{0C83D1F4-FDA7-4f76-A806-7A0F772FC2DF}' id='579' EA\040name=''"
	 *        extendedMetaData="name='PART' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='PARTS' xmlAttribute='false' featureWrapperElement='true' featureElement='false' classifierWrapperElement='false' classifierElement='true'"
	 * @generated
	 */
	EList<HardwareComponentPrototype> getPart();

	/**
	 * Returns the value of the '<em><b>Connector</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.eatop.eastadl21.HardwareConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' containment reference list.
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getHardwareComponentType_Connector()
	 * @model containment="true"
	 *        annotation="MetaData guid='{FE87A764-6E97-4133-90BF-62F674E7E868}' id='581' EA\040name=''"
	 *        extendedMetaData="name='CONNECTOR' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='CONNECTORS' xmlAttribute='false' featureWrapperElement='true' featureElement='false' classifierWrapperElement='false' classifierElement='true'"
	 * @generated
	 */
	EList<HardwareConnector> getConnector();

	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.eatop.eastadl21.HardwarePort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getHardwareComponentType_Port()
	 * @model containment="true"
	 *        annotation="MetaData guid='{9D06EF26-078C-491b-A40C-59236BD80B94}' id='546' EA\040name=''"
	 *        extendedMetaData="name='PORT' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='PORTS' xmlAttribute='false' featureWrapperElement='true' featureElement='false' classifierWrapperElement='false' classifierElement='true'"
	 * @generated
	 */
	EList<HardwarePort> getPort();

	/**
	 * Returns the value of the '<em><b>Port Connector</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.eatop.eastadl21.PortConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Connector</em>' containment reference list.
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getHardwareComponentType_PortConnector()
	 * @model containment="true"
	 *        annotation="MetaData guid='{93BB2A53-63BB-4724-986C-41F7897F21D0}' id='590' EA\040name=''"
	 *        extendedMetaData="name='PORT-CONNECTOR' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='PORT-CONNECTORS' xmlAttribute='false' featureWrapperElement='true' featureElement='false' classifierWrapperElement='false' classifierElement='true'"
	 * @generated
	 */
	EList<PortConnector> getPortConnector();

} // HardwareComponentType
