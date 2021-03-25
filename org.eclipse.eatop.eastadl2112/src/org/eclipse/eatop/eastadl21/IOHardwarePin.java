/**
 */
package org.eclipse.eatop.eastadl21;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IO Hardware Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * IOHardwarePin represents an electrical connection point for digital or analog I/O. 
 * 
 * Semantics:
 * The IOHardwarePin represents an electrical pin or connection point. 
 * 
 * Notation:
 * IOHardwarePin is shown as a solid square with an IO inside. Its name may appear outside the square.
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Structure.HardwareModeling.IOHardwarePin</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eatop.eastadl21.IOHardwarePin#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getIOHardwarePin()
 * @model annotation="MetaData guid='{A04B3394-5337-4770-8A4C-B2BA8A8B24C2}' id='73' EA\040name='IOHardwarePin'"
 *        extendedMetaData="name='IO-HARDWARE-PIN' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='IO-HARDWARE-PINS'"
 * @generated
 */
public interface IOHardwarePin extends HardwarePin {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"DIGITAL"</code>.
	 * The literals are from the enumeration {@link org.eclipse.eatop.eastadl21.IOHardwarePinKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * kind defines whether the IOHardwarePort is digital, analog or PWM (Pulse Width Modulated).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.eatop.eastadl21.IOHardwarePinKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #setKind(IOHardwarePinKind)
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getIOHardwarePin_Kind()
	 * @model default="DIGITAL" unsettable="true"
	 *        annotation="MetaData guid='{62535CD1-4C0F-439d-B75C-D6E4D6B143B6}' id='56' EA\040name='kind'"
	 *        extendedMetaData="name='KIND' kind='element'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='KINDS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	IOHardwarePinKind getKind();

	/**
	 * Sets the value of the '{@link org.eclipse.eatop.eastadl21.IOHardwarePin#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.eatop.eastadl21.IOHardwarePinKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #getKind()
	 * @generated
	 */
	void setKind(IOHardwarePinKind value);

	/**
	 * Unsets the value of the '{@link org.eclipse.eatop.eastadl21.IOHardwarePin#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKind()
	 * @see #getKind()
	 * @see #setKind(IOHardwarePinKind)
	 * @generated
	 */
	void unsetKind();

	/**
	 * Returns whether the value of the '{@link org.eclipse.eatop.eastadl21.IOHardwarePin#getKind <em>Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kind</em>' attribute is set.
	 * @see #unsetKind()
	 * @see #getKind()
	 * @see #setKind(IOHardwarePinKind)
	 * @generated
	 */
	boolean isSetKind();

} // IOHardwarePin
