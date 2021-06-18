/**
 */
package eastadl22_alpha;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Client Server Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The FunctionClientServerPort is a FunctionPort for client-server interaction. A number of FunctionClientServerPorts of clientServerType "client" can be connected to one FunctionClientServerPort of clientServerType "server", i.e. when connected the multiplicity for the connection is n to 1 for client and server.
 * 
 * Semantics: 
 * The FunctionClientServerPort is a FunctionPort for client-server interaction.
 * 
 * FunctionClientServerPorts are single buffer overwrite and nonconsumable.
 * 
 * Constraints:
 * [1] A FunctionClientServerPort of clientServerType "client" can only be connected to one FunctionClientServerPort of clientServerType "server".
 * 
 * Extension: UML Port
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Structure.FunctionModeling.FunctionClientServerPort</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eastadl22_alpha.FunctionClientServerPort#getKind <em>Kind</em>}</li>
 *   <li>{@link eastadl22_alpha.FunctionClientServerPort#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see eastadl22_alpha.Eastadl22_alphaPackage#getFunctionClientServerPort()
 * @model annotation="MetaData guid='{BE654DCF-B47C-46ab-9C57-DBC4D0945F06}' id='52' EA\040name='FunctionClientServerPort'"
 *        extendedMetaData="name='FUNCTION-CLIENT-SERVER-PORT' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='FUNCTION-CLIENT-SERVER-PORTS'"
 * @generated
 */
public interface FunctionClientServerPort extends FunctionPort {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"CLIENT"</code>.
	 * The literals are from the enumeration {@link eastadl22_alpha.ClientServerKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see eastadl22_alpha.ClientServerKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #setKind(ClientServerKind)
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getFunctionClientServerPort_Kind()
	 * @model default="CLIENT" unsettable="true" required="true"
	 *        annotation="MetaData guid='{3D87B778-F71F-4bc9-9115-4C3F423EB931}' id='41' EA\040name='kind'"
	 *        extendedMetaData="name='KIND' kind='element'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='KINDS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	ClientServerKind getKind();

	/**
	 * Sets the value of the '{@link eastadl22_alpha.FunctionClientServerPort#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see eastadl22_alpha.ClientServerKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ClientServerKind value);

	/**
	 * Unsets the value of the '{@link eastadl22_alpha.FunctionClientServerPort#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKind()
	 * @see #getKind()
	 * @see #setKind(ClientServerKind)
	 * @generated
	 */
	void unsetKind();

	/**
	 * Returns whether the value of the '{@link eastadl22_alpha.FunctionClientServerPort#getKind <em>Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kind</em>' attribute is set.
	 * @see #unsetKind()
	 * @see #getKind()
	 * @see #setKind(ClientServerKind)
	 * @generated
	 */
	boolean isSetKind();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(FunctionClientServerInterface)
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getFunctionClientServerPort_Type()
	 * @model required="true"
	 *        annotation="MetaData guid='{1A5B859E-18A4-4f59-8B7C-270B3B9660E0}' id='610' EA\040name=''"
	 *        annotation="Stereotype Stereotype='isOfType'"
	 *        extendedMetaData="name='TYPE-TREF' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='TYPE-TREFS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	FunctionClientServerInterface getType();

	/**
	 * Sets the value of the '{@link eastadl22_alpha.FunctionClientServerPort#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(FunctionClientServerInterface value);

} // FunctionClientServerPort
