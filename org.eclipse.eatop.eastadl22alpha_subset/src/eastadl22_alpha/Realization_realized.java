/**
 */
package eastadl22_alpha;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Realization realized</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * null
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Infrastructure.Elements._instanceRef.Realization_realized</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eastadl22_alpha.Realization_realized#getIdentifiable_target <em>Identifiable target</em>}</li>
 *   <li>{@link eastadl22_alpha.Realization_realized#getIdentifiable_context <em>Identifiable context</em>}</li>
 * </ul>
 *
 * @see eastadl22_alpha.Eastadl22_alphaPackage#getRealization_realized()
 * @model annotation="MetaData guid='{26C21A3A-94DC-494a-9005-33BE217ADF44}' id='258' EA\040name='Realization_realized'"
 *        annotation="Stereotype Stereotype='instanceRef'"
 *        annotation="TaggedValues xml.name='REALIZATION--REALIZED-IREF'"
 *        extendedMetaData="name='REALIZATION--REALIZED-IREF' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='REALIZATION--REALIZED-IREFS'"
 * @generated
 */
public interface Realization_realized extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifiable target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifiable target</em>' reference.
	 * @see #setIdentifiable_target(EAElement)
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getRealization_realized_Identifiable_target()
	 * @model required="true"
	 *        annotation="MetaData guid='{F4913E5B-B4B9-4266-91B0-3151474B658F}' id='147' EA\040name=''"
	 *        annotation="Stereotype Stereotype='instanceRef.target'"
	 *        annotation="TaggedValues xml.roleElement='true' xml.roleWrapperElement='false'"
	 *        extendedMetaData="name='IDENTIFIABLE-TARGET-REF' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='IDENTIFIABLE-TARGET-REFS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	EAElement getIdentifiable_target();

	/**
	 * Sets the value of the '{@link eastadl22_alpha.Realization_realized#getIdentifiable_target <em>Identifiable target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifiable target</em>' reference.
	 * @see #getIdentifiable_target()
	 * @generated
	 */
	void setIdentifiable_target(EAElement value);

	/**
	 * Returns the value of the '<em><b>Identifiable context</b></em>' reference list.
	 * The list contents are of type {@link eastadl22_alpha.EAElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifiable context</em>' reference list.
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getRealization_realized_Identifiable_context()
	 * @model annotation="MetaData guid='{39A71433-8663-4ecd-B4B9-269D03DADD8C}' id='163' EA\040name=''"
	 *        annotation="Stereotype Stereotype='instanceRef.context'"
	 *        annotation="TaggedValues xml.roleElement='true' xml.roleWrapperElement='false'"
	 *        extendedMetaData="name='IDENTIFIABLE-CONTEXT-REF' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='IDENTIFIABLE-CONTEXT-REFS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	EList<EAElement> getIdentifiable_context();

} // Realization_realized
