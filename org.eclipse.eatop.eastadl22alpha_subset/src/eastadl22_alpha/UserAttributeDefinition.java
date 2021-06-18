/**
 */
package eastadl22_alpha;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Attribute Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UserAttributeDefinition defines a certain user attribute. 
 * 
 * The name of a UserAttributeDefinition should be used in editing tools as a label for the input field representing the user attribute and its description should be presented to the user to explain the meaning of this user attribute.
 * 
 * To identify a user attribute in a universally unique way, its short name is appended to the key of the containing UserElementType after appending a "." character (dot) as a separator. For example, if a UserAttributeDefinition with short name "MyStatus" is contained in a UserElementType with key "com.myCompany.myDepartment.myProject.MyPort", then the user attribute represented by this UserAttributeDefinition has the key "com.myCompany.myDepartment.myProject.MyPort.MyStatus".
 * 
 * Semantics:
 * UserAttributeDefinition defines a user defined attribute.
 * 
 * Extension:
 * Class
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Infrastructure.UserAttributes.UserAttributeDefinition</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eastadl22_alpha.UserAttributeDefinition#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link eastadl22_alpha.UserAttributeDefinition#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see eastadl22_alpha.Eastadl22_alphaPackage#getUserAttributeDefinition()
 * @model annotation="MetaData guid='{C6168EF6-BF21-483a-AB57-29476CFCBB8B}' id='281' EA\040name='UserAttributeDefinition'"
 *        extendedMetaData="name='USER-ATTRIBUTE-DEFINITION' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='USER-ATTRIBUTE-DEFINITIONS'"
 * @generated
 */
public interface UserAttributeDefinition extends EAPackageableElement {
	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(EAValue)
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getUserAttributeDefinition_DefaultValue()
	 * @model containment="true"
	 *        annotation="MetaData guid='{A04DA623-AF7C-4d15-BE7B-82E61F5CE693}' id='88' EA\040name=''"
	 *        extendedMetaData="name='DEFAULT-VALUE' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='DEFAULT-VALUES' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='true'"
	 * @generated
	 */
	EAValue getDefaultValue();

	/**
	 * Sets the value of the '{@link eastadl22_alpha.UserAttributeDefinition#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(EAValue value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(EADatatype)
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getUserAttributeDefinition_Type()
	 * @model required="true"
	 *        annotation="MetaData guid='{FD35CE9A-94D5-4d1c-A5FF-FB44819443A1}' id='108' EA\040name=''"
	 *        extendedMetaData="name='TYPE-REF' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='TYPE-REFS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	EADatatype getType();

	/**
	 * Sets the value of the '{@link eastadl22_alpha.UserAttributeDefinition#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EADatatype value);

} // UserAttributeDefinition
