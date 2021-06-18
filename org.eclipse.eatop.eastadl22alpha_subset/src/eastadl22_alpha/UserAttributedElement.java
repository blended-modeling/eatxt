/**
 */
package eastadl22_alpha;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Attributed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UserAttributedElement is used to attach user attribute values to any EAST-ADL or AUTOSAR element, i.e. all instances of all subclasses of Identifiable. What user attributes a certain element should be supplied with can be defined beforehand with UserElementTypes.
 * 
 * According to a common EAST-ADL meta-modeling pattern, the meta-classes that are attributable, i.e. to which user attributes may be attached, do not inherit from meta-class UserAttributedElement but instead UserAttributedElement points to these meta-classes via association "attributedElement" (for example, to allow attaching user attributes to AUTOSAR Identifiable that cannot inherit from EAST-ADL infrastructure meta-classes).
 * 
 * The actual values are given as a contained instance of EAValue and are provided with a definition through the UserAttributeDefinitions in the UserElementType. If more than one value is contained, then the same number of UserElementTypes/UserAttributeDefinitions must be referenced and the order of values and definitions must be consistent (see constraint no. 2 below).
 * 
 * Example: let us assume that a DesignFunctionType "WiperSystem" should be provided with the value "OK" for a user attribute "Status". This is achieved by creating an instance of UserAttributedElement pointing via association "attributedElement" to instance "WiperSystem", pointing via instance "uaType" to the UserElementType with a UserAttributeDefinition "Status" and containing via containment association "uaValue" an EAStringValue "OK".
 * 
 * Semantics:
 * UserAttributedElement can be annotated with user attributes.
 * 
 * Constraints:
 * [1] The associations "uaValue" and the uaDefinitions of all "uaType"s must refer to the same number of elements.
 * [2] The order of associations "uaValue" and "uaType" / "uaDefinition" must be consistent, i.e. the n-th EAValue must correspond to the n-th UserAttributeDefinition when listing all UserElementTypes' definitions in depth-first order.
 * 
 * Extension:
 * Class
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Infrastructure.UserAttributes.UserAttributedElement</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eastadl22_alpha.UserAttributedElement#getUaValue <em>Ua Value</em>}</li>
 *   <li>{@link eastadl22_alpha.UserAttributedElement#getUaType <em>Ua Type</em>}</li>
 *   <li>{@link eastadl22_alpha.UserAttributedElement#getAttributedElement <em>Attributed Element</em>}</li>
 * </ul>
 *
 * @see eastadl22_alpha.Eastadl22_alphaPackage#getUserAttributedElement()
 * @model annotation="MetaData guid='{A1219C54-EAEF-43a3-A1AB-5B0632893861}' id='280' EA\040name='UserAttributedElement'"
 *        extendedMetaData="name='USER-ATTRIBUTED-ELEMENT' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='USER-ATTRIBUTED-ELEMENTS'"
 * @generated
 */
public interface UserAttributedElement extends EAPackageableElement {
	/**
	 * Returns the value of the '<em><b>Ua Value</b></em>' containment reference list.
	 * The list contents are of type {@link eastadl22_alpha.EAValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ua Value</em>' containment reference list.
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getUserAttributedElement_UaValue()
	 * @model containment="true"
	 *        annotation="MetaData guid='{82B92190-BCF1-488d-94EB-7B0023E7D34D}' id='90' EA\040name=''"
	 *        extendedMetaData="name='UA-VALUE' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='UA-VALUES' xmlAttribute='false' featureWrapperElement='true' featureElement='false' classifierWrapperElement='false' classifierElement='true'"
	 * @generated
	 */
	EList<EAValue> getUaValue();

	/**
	 * Returns the value of the '<em><b>Ua Type</b></em>' reference list.
	 * The list contents are of type {@link eastadl22_alpha.UserElementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ua Type</em>' reference list.
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getUserAttributedElement_UaType()
	 * @model annotation="MetaData guid='{6549EA90-8651-4487-9035-C32C8856972D}' id='83' EA\040name=''"
	 *        extendedMetaData="name='UA-TYPE-REF' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='UA-TYPE-REFS' xmlAttribute='false' featureWrapperElement='true' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	EList<UserElementType> getUaType();

	/**
	 * Returns the value of the '<em><b>Attributed Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributed Element</em>' reference.
	 * @see #setAttributedElement(Identifiable)
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getUserAttributedElement_AttributedElement()
	 * @model required="true"
	 *        annotation="MetaData guid='{E80D8C33-14DD-4a85-ADB3-32076CC892F5}' id='168' EA\040name=''"
	 *        extendedMetaData="name='ATTRIBUTED-ELEMENT-REF' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='ATTRIBUTED-ELEMENT-REFS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	Identifiable getAttributedElement();

	/**
	 * Sets the value of the '{@link eastadl22_alpha.UserAttributedElement#getAttributedElement <em>Attributed Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributed Element</em>' reference.
	 * @see #getAttributedElement()
	 * @generated
	 */
	void setAttributedElement(Identifiable value);

} // UserAttributedElement
