/**
 */
package eastadl22_alpha;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * HardwarePort represents a connection point (called "connector" by electrical engineers) in the hardware architecture. The HardwarePort may be logical or physical. For physical HardwarePorts, the electrical connections points are represented as HardwarePins contained in the HardwarePort.
 * 
 * Constraints:
 * Referenced HardwarePins must be contained (directly or indirectly in a containment hierarchy of HardwarePorts) in the same HardwareComponent as the referencing Hardware port. , or contained in a HardwarePort contained in the same HardwareComponent or as the referencing Hardware port.
 * 
 * Semantics:
 * HardwarePort represents a physical or logical connection point related to the hardware. For physical connection points, HardwarePins contained in the HardwarePort represent the electrical connection points. If the isShield attribute it true, the HardwarePort connects to the shield of a referencing HardwarePortConnector.
 * Depending on modeling style hardware port may refer to:
 * <ul>
 * 	<li>a physical connection point (e.g., twisted pair wire for a CAN bus) or</li>
 * 	<li>a logical connector (e.g., 1 MB/s CAN bus).</li>
 * </ul>
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Structure.HardwareModeling.HardwarePort</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eastadl22_alpha.HardwarePort#getIsShield <em>Is Shield</em>}</li>
 *   <li>{@link eastadl22_alpha.HardwarePort#getContainedPin <em>Contained Pin</em>}</li>
 *   <li>{@link eastadl22_alpha.HardwarePort#getContainedPort <em>Contained Port</em>}</li>
 *   <li>{@link eastadl22_alpha.HardwarePort#getReferencedPin <em>Referenced Pin</em>}</li>
 * </ul>
 *
 * @see eastadl22_alpha.Eastadl22_alphaPackage#getHardwarePort()
 * @model annotation="MetaData guid='{A6C752FF-247C-4782-A671-EE3D86AC5028}' id='74' EA\040name='HardwarePort'"
 *        annotation="Stereotype Stereotype='atpStructureElement'"
 *        extendedMetaData="name='HARDWARE-PORT' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='HARDWARE-PORTS'"
 * @generated
 */
public interface HardwarePort extends EAPort, AllocationTarget {
	/**
	 * Returns the value of the '<em><b>Is Shield</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if this port is representing the shield.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Shield</em>' attribute.
	 * @see #isSetIsShield()
	 * @see #unsetIsShield()
	 * @see #setIsShield(Boolean)
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getHardwarePort_IsShield()
	 * @model default="false" unsettable="true" dataType="eastadl22_alpha.Boolean"
	 *        annotation="MetaData guid='{1CACE436-2824-46a4-A964-B557592AA32A}' id='57' EA\040name='isShield'"
	 *        extendedMetaData="name='IS-SHIELD' kind='element'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='IS-SHIELDS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	Boolean getIsShield();

	/**
	 * Sets the value of the '{@link eastadl22_alpha.HardwarePort#getIsShield <em>Is Shield</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Shield</em>' attribute.
	 * @see #isSetIsShield()
	 * @see #unsetIsShield()
	 * @see #getIsShield()
	 * @generated
	 */
	void setIsShield(Boolean value);

	/**
	 * Unsets the value of the '{@link eastadl22_alpha.HardwarePort#getIsShield <em>Is Shield</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsShield()
	 * @see #getIsShield()
	 * @see #setIsShield(Boolean)
	 * @generated
	 */
	void unsetIsShield();

	/**
	 * Returns whether the value of the '{@link eastadl22_alpha.HardwarePort#getIsShield <em>Is Shield</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Shield</em>' attribute is set.
	 * @see #unsetIsShield()
	 * @see #getIsShield()
	 * @see #setIsShield(Boolean)
	 * @generated
	 */
	boolean isSetIsShield();

	/**
	 * Returns the value of the '<em><b>Contained Pin</b></em>' containment reference list.
	 * The list contents are of type {@link eastadl22_alpha.HardwarePin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Pin</em>' containment reference list.
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getHardwarePort_ContainedPin()
	 * @model containment="true"
	 *        annotation="MetaData guid='{C5347C2A-0716-4775-907B-392DC7E28AB8}' id='550' EA\040name=''"
	 *        extendedMetaData="name='CONTAINED-PIN' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='CONTAINED-PINS' xmlAttribute='false' featureWrapperElement='true' featureElement='false' classifierWrapperElement='false' classifierElement='true'"
	 * @generated
	 */
	EList<HardwarePin> getContainedPin();

	/**
	 * Returns the value of the '<em><b>Contained Port</b></em>' containment reference list.
	 * The list contents are of type {@link eastadl22_alpha.HardwarePort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Port</em>' containment reference list.
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getHardwarePort_ContainedPort()
	 * @model containment="true"
	 *        annotation="MetaData guid='{14391AD1-846F-4e1e-997F-1FEB0CDF0A57}' id='549' EA\040name=''"
	 *        extendedMetaData="name='CONTAINED-PORT' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='CONTAINED-PORTS' xmlAttribute='false' featureWrapperElement='true' featureElement='false' classifierWrapperElement='false' classifierElement='true'"
	 * @generated
	 */
	EList<HardwarePort> getContainedPort();

	/**
	 * Returns the value of the '<em><b>Referenced Pin</b></em>' reference list.
	 * The list contents are of type {@link eastadl22_alpha.HardwarePin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Pin</em>' reference list.
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getHardwarePort_ReferencedPin()
	 * @model annotation="MetaData guid='{5D6381B6-D179-41c6-9D1A-4B2BDFB31AFA}' id='553' EA\040name=''"
	 *        extendedMetaData="name='REFERENCED-PIN-REF' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='REFERENCED-PIN-REFS' xmlAttribute='false' featureWrapperElement='true' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	EList<HardwarePin> getReferencedPin();

} // HardwarePort
