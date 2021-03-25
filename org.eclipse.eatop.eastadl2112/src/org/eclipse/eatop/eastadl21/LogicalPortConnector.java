/**
 */
package org.eclipse.eatop.eastadl21;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Port Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * LogicalPortConnector represents a logical connection to its referenced ports, typically a communication bus.
 * 
 * Constraints:
 * No additional constraints
 * 
 * Semantics:
 * The LogicalPortConnector represents a logical connection to its referenced HardwarePorts. 
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Structure.HardwareModeling.LogicalPortConnector</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eatop.eastadl21.LogicalPortConnector#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.LogicalPortConnector#getBusSpeed <em>Bus Speed</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getLogicalPortConnector()
 * @model annotation="MetaData guid='{2DD74900-7819-4c9d-B3F6-C9E8173E0BCC}' id='340' EA\040name='LogicalPortConnector'"
 *        annotation="Stereotype Stereotype='atpStructureElement'"
 *        extendedMetaData="name='LOGICAL-PORT-CONNECTOR' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='LOGICAL-PORT-CONNECTORS'"
 * @generated
 */
public interface LogicalPortConnector extends EAConnector, PortConnector {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"TIMETRIGGERED"</code>.
	 * The literals are from the enumeration {@link org.eclipse.eatop.eastadl21.HardwareBusKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.eatop.eastadl21.HardwareBusKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #setKind(HardwareBusKind)
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getLogicalPortConnector_Kind()
	 * @model default="TIMETRIGGERED" unsettable="true"
	 *        annotation="MetaData guid='{344894C8-0702-4062-B1F0-6244BEF805B2}' id='242' EA\040name='kind'"
	 *        extendedMetaData="name='KIND' kind='element'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='KINDS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	HardwareBusKind getKind();

	/**
	 * Sets the value of the '{@link org.eclipse.eatop.eastadl21.LogicalPortConnector#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.eatop.eastadl21.HardwareBusKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #getKind()
	 * @generated
	 */
	void setKind(HardwareBusKind value);

	/**
	 * Unsets the value of the '{@link org.eclipse.eatop.eastadl21.LogicalPortConnector#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKind()
	 * @see #getKind()
	 * @see #setKind(HardwareBusKind)
	 * @generated
	 */
	void unsetKind();

	/**
	 * Returns whether the value of the '{@link org.eclipse.eatop.eastadl21.LogicalPortConnector#getKind <em>Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kind</em>' attribute is set.
	 * @see #unsetKind()
	 * @see #getKind()
	 * @see #setKind(HardwareBusKind)
	 * @generated
	 */
	boolean isSetKind();

	/**
	 * Returns the value of the '<em><b>Bus Speed</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates bus speed in megabits per second
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bus Speed</em>' attribute.
	 * @see #isSetBusSpeed()
	 * @see #unsetBusSpeed()
	 * @see #setBusSpeed(Double)
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getLogicalPortConnector_BusSpeed()
	 * @model default="0.0" unsettable="true" dataType="org.eclipse.eatop.eastadl21.Float"
	 *        annotation="MetaData guid='{A17DAF5B-F5B1-4fd7-A3A3-A8606F418BD7}' id='241' EA\040name='busSpeed'"
	 *        extendedMetaData="name='BUS-SPEED' kind='element'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='BUS-SPEEDS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	Double getBusSpeed();

	/**
	 * Sets the value of the '{@link org.eclipse.eatop.eastadl21.LogicalPortConnector#getBusSpeed <em>Bus Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus Speed</em>' attribute.
	 * @see #isSetBusSpeed()
	 * @see #unsetBusSpeed()
	 * @see #getBusSpeed()
	 * @generated
	 */
	void setBusSpeed(Double value);

	/**
	 * Unsets the value of the '{@link org.eclipse.eatop.eastadl21.LogicalPortConnector#getBusSpeed <em>Bus Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBusSpeed()
	 * @see #getBusSpeed()
	 * @see #setBusSpeed(Double)
	 * @generated
	 */
	void unsetBusSpeed();

	/**
	 * Returns whether the value of the '{@link org.eclipse.eatop.eastadl21.LogicalPortConnector#getBusSpeed <em>Bus Speed</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bus Speed</em>' attribute is set.
	 * @see #unsetBusSpeed()
	 * @see #getBusSpeed()
	 * @see #setBusSpeed(Double)
	 * @generated
	 */
	boolean isSetBusSpeed();

} // LogicalPortConnector
