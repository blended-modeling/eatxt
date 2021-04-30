/**
 */
package org.eclipse.eatop.eastadl21;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UserElementType defines a certain set of user attributes, i.e. it states that all Identifiables of a certain kind (c.f. the validFor attribute) may be provided with a user attribute value of some datatype. For example, it can be specified that all AnalysisFunctionPrototypes may be amended with an attribute "Status".
 * 
 * The name of a UserElementType should be used in editing tools as a label for the input field representing the user attribute and its description should be presented to the user to explain the meaning of this user attribute.
 * 
 * Semantics:
 * UserElementType represents a user defined type of the specified EAST-ADL or AUTOSAR metaclass.
 * 
 * Constraints:
 * [1] The short names of all UserAttributeDefinitions (i.e. value of attribute "shortName" in UserAttributeDefinition, which is inherited from meta-class Referrable) referred to by association "uaDefinition" must be unique within this UserElementType. In other words, no two UserAttributeDefinitions referred to by association "uaDefinition" must have the same short name.
 * 
 * Extension:
 * Class
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Infrastructure.UserAttributes.UserElementType</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eatop.eastadl21.UserElementType#getValidFor <em>Valid For</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.UserElementType#getKey <em>Key</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.UserElementType#getUaDefinition <em>Ua Definition</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getUserElementType()
 * @model annotation="MetaData guid='{2828A38E-2714-4a98-A042-2C89C672D2A0}' id='279' EA\040name='UserElementType'"
 *        extendedMetaData="name='USER-ELEMENT-TYPE' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='USER-ELEMENT-TYPES'"
 * @generated
 */
public interface UserElementType extends EAPackageableElement {
	/**
	 * Returns the value of the '<em><b>Valid For</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Comma-separated list of metaclass names this user element type is applicable to. If undefined, then this type is applicable to all subclasses of metaclass Identifiable. White-space may appear before and after metaclass names and commas.
	 * 
	 * Example: If UserElementType 'MyFunction' has its validFor attribute set to "FunctionalDevice, LocalDeviceManager", then the contained UserAttributeDefinitions are only applicable to functional devices and local device managers, i.e. only instances of FunctionalDevice and LocalDeviceManager may be adorned with the 'MyFunction' user element type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Valid For</em>' attribute.
	 * @see #isSetValidFor()
	 * @see #unsetValidFor()
	 * @see #setValidFor(String)
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getUserElementType_ValidFor()
	 * @model unsettable="true" dataType="org.eclipse.eatop.eastadl21.String"
	 *        annotation="MetaData guid='{0AD22778-BA7C-49e5-8D0B-8758E8E80C98}' id='210' EA\040name='validFor'"
	 *        extendedMetaData="name='VALID-FOR' kind='element'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='VALID-FORS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	String getValidFor();

	/**
	 * Sets the value of the '{@link org.eclipse.eatop.eastadl21.UserElementType#getValidFor <em>Valid For</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid For</em>' attribute.
	 * @see #isSetValidFor()
	 * @see #unsetValidFor()
	 * @see #getValidFor()
	 * @generated
	 */
	void setValidFor(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.eatop.eastadl21.UserElementType#getValidFor <em>Valid For</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValidFor()
	 * @see #getValidFor()
	 * @see #setValidFor(String)
	 * @generated
	 */
	void unsetValidFor();

	/**
	 * Returns whether the value of the '{@link org.eclipse.eatop.eastadl21.UserElementType#getValidFor <em>Valid For</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Valid For</em>' attribute is set.
	 * @see #unsetValidFor()
	 * @see #getValidFor()
	 * @see #setValidFor(String)
	 * @generated
	 */
	boolean isSetValidFor();

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The globally unique identifier of the user element type. Any string may be used as key as long as it is globally unique.
	 * 
	 * However, there is a recommended procedure for building globally unique keys for user attributes, similar to package naming conventions in the Java programming language:
	 * 
	 * (1) use an internet domain name which is sufficiently specific so that you have control over who will use it for user attribute key generation (e.g. "myDepartment.myCompany.com")
	 * 
	 * (2) reverse it as in Java package names (e.g. "com.myCompany.myDepartment")
	 * 
	 * (3) optionally append additional, dot-separated names for the specific context in which the user attribute is to be used (e.g. "myProject" which results in "com.myCompany.myDepartment.myProject")
	 * 
	 * (4) add a last segment that names the user element type and is sufficiently descriptive to explain its purpose (e.g. "MyPort").
	 * 
	 * In this example, the key of our status attribute would be "com.myCompany.myDepartment.myProject.MyPort".
	 * 
	 * In general, the last segment of the key, i.e. everything following the last dot, should be sufficient to identify the attribute in its usual, most specific context of use. Therefore, implementations may use this last segment as an abbreviated name of the user attribute, e.g. for presenting it in a GUI. But note that the name of the UserElementType should usually be used (if defined).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #isSetKey()
	 * @see #unsetKey()
	 * @see #setKey(String)
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getUserElementType_Key()
	 * @model unsettable="true" dataType="org.eclipse.eatop.eastadl21.String" required="true"
	 *        annotation="MetaData guid='{E8A227AA-4D80-4355-B5BA-377F5AB266FF}' id='209' EA\040name='key'"
	 *        extendedMetaData="name='KEY' kind='element'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='KEYS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link org.eclipse.eatop.eastadl21.UserElementType#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #isSetKey()
	 * @see #unsetKey()
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.eatop.eastadl21.UserElementType#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKey()
	 * @see #getKey()
	 * @see #setKey(String)
	 * @generated
	 */
	void unsetKey();

	/**
	 * Returns whether the value of the '{@link org.eclipse.eatop.eastadl21.UserElementType#getKey <em>Key</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Key</em>' attribute is set.
	 * @see #unsetKey()
	 * @see #getKey()
	 * @see #setKey(String)
	 * @generated
	 */
	boolean isSetKey();

	/**
	 * Returns the value of the '<em><b>Ua Definition</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.eatop.eastadl21.UserAttributeDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ua Definition</em>' containment reference list.
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getUserElementType_UaDefinition()
	 * @model containment="true"
	 *        annotation="MetaData guid='{6804EA72-C6EA-42e4-8BD9-F3BF13F4F8C6}' id='82' EA\040name=''"
	 *        extendedMetaData="name='UA-DEFINITION' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='UA-DEFINITIONS' xmlAttribute='false' featureWrapperElement='true' featureElement='false' classifierWrapperElement='false' classifierElement='true'"
	 * @generated
	 */
	EList<UserAttributeDefinition> getUaDefinition();

} // UserElementType
