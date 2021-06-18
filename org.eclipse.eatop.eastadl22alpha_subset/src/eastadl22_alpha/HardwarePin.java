/**
 */
package eastadl22_alpha;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * HardwarePin represents an electrical connection point of its containing HardwareComponent.
 * 
 * Semantics:
 * Hardware pin represents an electrical connection point. Depending on direction attribute, the energy and current flow is out of the containing component (out) or into the containing component (in). Depending on the isGround attribute, the HardwarePin represent ground.
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Structure.HardwareModeling.HardwarePin</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eastadl22_alpha.HardwarePin#getDirection <em>Direction</em>}</li>
 *   <li>{@link eastadl22_alpha.HardwarePin#getIsGround <em>Is Ground</em>}</li>
 * </ul>
 *
 * @see eastadl22_alpha.Eastadl22_alphaPackage#getHardwarePin()
 * @model abstract="true"
 *        annotation="MetaData guid='{98022932-54F8-4d59-B679-54828A48EA21}' id='72' EA\040name='HardwarePin'"
 *        annotation="Stereotype Stereotype='atpStructureElement'"
 *        extendedMetaData="name='HARDWARE-PIN' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='HARDWARE-PINS'"
 * @generated
 */
public interface HardwarePin extends EAElement, EAPort, AllocationTarget {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The default value is <code>"IN"</code>.
	 * The literals are from the enumeration {@link eastadl22_alpha.EADirectionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The direction of current through the pin.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see eastadl22_alpha.EADirectionKind
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #setDirection(EADirectionKind)
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getHardwarePin_Direction()
	 * @model default="IN" unsettable="true"
	 *        annotation="MetaData guid='{FFE99615-1A29-4ae0-8F52-AAB82427043B}' id='54' EA\040name='direction'"
	 *        extendedMetaData="name='DIRECTION' kind='element'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='DIRECTIONS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	EADirectionKind getDirection();

	/**
	 * Sets the value of the '{@link eastadl22_alpha.HardwarePin#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see eastadl22_alpha.EADirectionKind
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(EADirectionKind value);

	/**
	 * Unsets the value of the '{@link eastadl22_alpha.HardwarePin#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDirection()
	 * @see #getDirection()
	 * @see #setDirection(EADirectionKind)
	 * @generated
	 */
	void unsetDirection();

	/**
	 * Returns whether the value of the '{@link eastadl22_alpha.HardwarePin#getDirection <em>Direction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Direction</em>' attribute is set.
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @see #setDirection(EADirectionKind)
	 * @generated
	 */
	boolean isSetDirection();

	/**
	 * Returns the value of the '<em><b>Is Ground</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the pin is connected to ground.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Ground</em>' attribute.
	 * @see #isSetIsGround()
	 * @see #unsetIsGround()
	 * @see #setIsGround(Boolean)
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getHardwarePin_IsGround()
	 * @model default="false" unsettable="true" dataType="eastadl22_alpha.Boolean"
	 *        annotation="MetaData guid='{EA0CCAA5-F152-4fbc-AAC1-D87E0A82C32D}' id='55' EA\040name='isGround'"
	 *        extendedMetaData="name='IS-GROUND' kind='element'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='IS-GROUNDS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	Boolean getIsGround();

	/**
	 * Sets the value of the '{@link eastadl22_alpha.HardwarePin#getIsGround <em>Is Ground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Ground</em>' attribute.
	 * @see #isSetIsGround()
	 * @see #unsetIsGround()
	 * @see #getIsGround()
	 * @generated
	 */
	void setIsGround(Boolean value);

	/**
	 * Unsets the value of the '{@link eastadl22_alpha.HardwarePin#getIsGround <em>Is Ground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsGround()
	 * @see #getIsGround()
	 * @see #setIsGround(Boolean)
	 * @generated
	 */
	void unsetIsGround();

	/**
	 * Returns whether the value of the '{@link eastadl22_alpha.HardwarePin#getIsGround <em>Is Ground</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Ground</em>' attribute is set.
	 * @see #unsetIsGround()
	 * @see #getIsGround()
	 * @see #setIsGround(Boolean)
	 * @generated
	 */
	boolean isSetIsGround();

} // HardwarePin
