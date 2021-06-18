/**
 */
package eastadl22_alpha;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Realization realized By</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * null
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Infrastructure.Elements._instanceRef.Realization_realizedBy</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eastadl22_alpha.Realization_realizedBy#getIdentifiable_target <em>Identifiable target</em>}</li>
 *   <li>{@link eastadl22_alpha.Realization_realizedBy#getIdentifiable_context <em>Identifiable context</em>}</li>
 * </ul>
 *
 * @see eastadl22_alpha.Eastadl22_alphaPackage#getRealization_realizedBy()
 * @model annotation="MetaData guid='{25084276-AADD-4a2a-8DE3-678D62CB7894}' id='257' EA\040name='Realization_realizedBy'"
 *        annotation="Stereotype Stereotype='instanceRef'"
 *        annotation="TaggedValues xml.name='REALIZATION--REALIZED-BY-IREF'"
 *        extendedMetaData="name='REALIZATION--REALIZED-BY-IREF' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='REALIZATION--REALIZED-BY-IREFS'"
 * @generated
 */
public interface Realization_realizedBy extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifiable target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifiable target</em>' reference.
	 * @see #setIdentifiable_target(Identifiable)
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getRealization_realizedBy_Identifiable_target()
	 * @model required="true"
	 *        annotation="MetaData guid='{F19A7A4F-F6CD-4888-8377-5E869D856E87}' id='167' EA\040name=''"
	 *        annotation="Stereotype Stereotype='instanceRef.target'"
	 *        annotation="TaggedValues xml.roleElement='true' xml.roleWrapperElement='false'"
	 *        extendedMetaData="name='IDENTIFIABLE-TARGET-REF' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='IDENTIFIABLE-TARGET-REFS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	Identifiable getIdentifiable_target();

	/**
	 * Sets the value of the '{@link eastadl22_alpha.Realization_realizedBy#getIdentifiable_target <em>Identifiable target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifiable target</em>' reference.
	 * @see #getIdentifiable_target()
	 * @generated
	 */
	void setIdentifiable_target(Identifiable value);

	/**
	 * Returns the value of the '<em><b>Identifiable context</b></em>' reference list.
	 * The list contents are of type {@link eastadl22_alpha.Identifiable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifiable context</em>' reference list.
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getRealization_realizedBy_Identifiable_context()
	 * @model annotation="MetaData guid='{218B0D37-1F8C-4f18-B7B3-CA512E924BC7}' id='170' EA\040name=''"
	 *        annotation="Stereotype Stereotype='instanceRef.context'"
	 *        annotation="TaggedValues xml.roleElement='true' xml.roleWrapperElement='false'"
	 *        extendedMetaData="name='IDENTIFIABLE-CONTEXT-REF' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='IDENTIFIABLE-CONTEXT-REFS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	EList<Identifiable> getIdentifiable_context();

} // Realization_realizedBy
