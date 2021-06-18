/**
 */
package eastadl22_alpha;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Power Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The FunctionPowerPort is a FunctionPort for denoting the physical interactions between environment and sensing/actuation functions.
 * 
 * Semantics: 
 * The FunctionPowerPort conserves physical variables in a dynamic process.
 * 
 * The typing CompositeDatatype owns two EADatatypePrototypes called Across and Through, representing the exchanged physical variables of the FunctionPowerPort. In two or more directly connected function power ports, the Across variables always get the same value and the Through variables always sum up to zero.
 * 
 * Constraints:
 * [1] The owner of a FunctionPowerPort is either a FunctionalDevice or a HardwareFunctionType if it is Elementary, or any DesignFunctionType otherwise. Alternatively it is owned by a FunctionType typing a prototype in Environment.
 * 
 * [2] Two connected FunctionPowerPort must have the same Datatype.
 * 
 * [3] The typing Datatype shall have two datatypePrototypes called Across and Through, with Datatypes that are consistent and representing the variables of the PowerPort. 
 * 
 * 
 * Extension: UML Port
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Structure.FunctionModeling.FunctionPowerPort</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eastadl22_alpha.FunctionPowerPort#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see eastadl22_alpha.Eastadl22_alphaPackage#getFunctionPowerPort()
 * @model annotation="MetaData guid='{DA3443C9-9A3F-41b5-B5AE-6F1679690758}' id='55' EA\040name='FunctionPowerPort'"
 *        extendedMetaData="name='FUNCTION-POWER-PORT' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='FUNCTION-POWER-PORTS'"
 * @generated
 */
public interface FunctionPowerPort extends FunctionPort {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(CompositeDatatype)
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getFunctionPowerPort_Type()
	 * @model required="true"
	 *        annotation="MetaData guid='{E87018E5-835A-40ca-8958-EA7B23B9FA8F}' id='598' EA\040name=''"
	 *        annotation="Stereotype Stereotype='isOfType'"
	 *        extendedMetaData="name='TYPE-TREF' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='TYPE-TREFS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	CompositeDatatype getType();

	/**
	 * Sets the value of the '{@link eastadl22_alpha.FunctionPowerPort#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CompositeDatatype value);

} // FunctionPowerPort
