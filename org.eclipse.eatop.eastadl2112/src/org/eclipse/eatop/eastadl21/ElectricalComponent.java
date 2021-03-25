/**
 */
package org.eclipse.eatop.eastadl21;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Electrical Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ElectricalComponent represents a hardware element with a pure electrical purpose, i.e., not computational like Nodes or mechatronical like Sensors and Actuators. Examples include relays, batteries, capacitors and resistors.
 * 
 * Semantics:
 * ElectricalComponent represents a physical element with electrical circuit. Depending on isActive attribute, it may be active (e.g., a battery or generator) or passive (e.g., a relay).
 * 
 * Notation:
 * ElectricalComponent is shown as a solid-outline rectangle. The rectangle contains the name, and its ports or port groups on the perimeter.
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Structure.HardwareModeling.ElectricalComponent</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eatop.eastadl21.ElectricalComponent#getIsActive <em>Is Active</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getElectricalComponent()
 * @model annotation="MetaData guid='{811FB5A2-1515-4099-9551-28C81B74C32A}' id='69' EA\040name='ElectricalComponent'"
 *        annotation="Stereotype Stereotype='atpType'"
 *        extendedMetaData="name='ELECTRICAL-COMPONENT' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='ELECTRICAL-COMPONENTS'"
 * @generated
 */
public interface ElectricalComponent extends HardwareComponentType {
	/**
	 * Returns the value of the '<em><b>Is Active</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates if the ElectricalComponent is active or passive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Active</em>' attribute.
	 * @see #isSetIsActive()
	 * @see #unsetIsActive()
	 * @see #setIsActive(Boolean)
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getElectricalComponent_IsActive()
	 * @model default="false" unsettable="true" dataType="org.eclipse.eatop.eastadl21.Boolean"
	 *        annotation="MetaData guid='{DCC2DDA2-C739-468b-BE1F-EC8B0B419EEE}' id='53' EA\040name='isActive'"
	 *        extendedMetaData="name='IS-ACTIVE' kind='element'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='IS-ACTIVES' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	Boolean getIsActive();

	/**
	 * Sets the value of the '{@link org.eclipse.eatop.eastadl21.ElectricalComponent#getIsActive <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Active</em>' attribute.
	 * @see #isSetIsActive()
	 * @see #unsetIsActive()
	 * @see #getIsActive()
	 * @generated
	 */
	void setIsActive(Boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.eatop.eastadl21.ElectricalComponent#getIsActive <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsActive()
	 * @see #getIsActive()
	 * @see #setIsActive(Boolean)
	 * @generated
	 */
	void unsetIsActive();

	/**
	 * Returns whether the value of the '{@link org.eclipse.eatop.eastadl21.ElectricalComponent#getIsActive <em>Is Active</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Active</em>' attribute is set.
	 * @see #unsetIsActive()
	 * @see #getIsActive()
	 * @see #setIsActive(Boolean)
	 * @generated
	 */
	boolean isSetIsActive();

} // ElectricalComponent
