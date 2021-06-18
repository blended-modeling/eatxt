/**
 */
package eastadl22_alpha;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EA Enumeration Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Used to model a value for an Enumeration or several values in a multivalued EnumerationValueType.
 * 
 * Constraints:
 * [1] Shall be typed by an Enumeration or an EnumerationValueType.
 * 
 * Semantics:
 * The semantics of this value is defined by the element typed by the typing Enumeration or the semantics defined in the EnumerationValueType.
 * 
 * Extension:
 * UML:InstanceSpecification
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Infrastructure.Values.EAEnumerationValue</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eastadl22_alpha.EAEnumerationValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see eastadl22_alpha.Eastadl22_alphaPackage#getEAEnumerationValue()
 * @model annotation="MetaData guid='{3D2374C5-E3D6-4dd4-9029-D81A4E41938F}' id='273' EA\040name='EAEnumerationValue'"
 *        extendedMetaData="name='EA-ENUMERATION-VALUE' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='EA-ENUMERATION-VALUES'"
 * @generated
 */
public interface EAEnumerationValue extends EAValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference list.
	 * The list contents are of type {@link eastadl22_alpha.EnumerationLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference list.
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getEAEnumerationValue_Value()
	 * @model required="true"
	 *        annotation="MetaData guid='{674E5981-E731-4d98-9F3A-E180D6F4CAB6}' id='102' EA\040name=''"
	 *        extendedMetaData="name='VALUE-REF' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='VALUE-REFS' xmlAttribute='false' featureWrapperElement='true' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	EList<EnumerationLiteral> getValue();

} // EAEnumerationValue
