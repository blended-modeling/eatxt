/**
 */
package org.eclipse.eatop.eastadl21;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Realization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Realization is a relationship which typically relates two or more elements across boundaries of the EAST-ADL abstraction levels. 
 * 
 * It identifies an element that serves as a specification within this realization relationship and on the other side it identifies a more concrete element that is supposed to realize this specification.
 * 
 * Constraints:
 * [1] The realizedBy elements shall be on a lower abstraction level or be more concrete than the realized elements.
 * [2] The realizedBy or realized elements shall be structural or behavioral.
 * 
 * Semantics:
 * The Realization is a relationship which identifies one or several abstract elements that are realized by one or several concrete elements. The realizedBy elements together represent a realization of the group of realized elements and is collectively responsible for meeting the specification of the realized elements, including (derivations of) its requirements.
 * 
 * Notation:
 * A Realization relationship is shown as a dashed line with a triangular arrowhead at the end that corresponds to the realized entity. The entity at the tail of the arrow (the realizing EAElement or the realizing ARElement) depends on the entity at the arrowhead (the realized EAElement).
 * 
 * Extension: Realization
 * 
 * Temporary change in the profile (to overcome Papyrus current limitation):
 * - added extension towards Dependency
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Infrastructure.Elements.Realization</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eatop.eastadl21.Realization#getRealized <em>Realized</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.Realization#getRealizedBy <em>Realized By</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getRealization()
 * @model annotation="MetaData guid='{6CF0316D-200B-4d0d-AE92-7C7D20905731}' id='248' EA\040name='Realization'"
 *        extendedMetaData="name='REALIZATION' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='REALIZATIONS'"
 * @generated
 */
public interface Realization extends Relationship {
	/**
	 * Returns the value of the '<em><b>Realized</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.eatop.eastadl21.Realization_realized}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized</em>' containment reference list.
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getRealization_Realized()
	 * @model containment="true" required="true"
	 *        annotation="MetaData guid='{5C463577-4933-4e60-B3EE-D0DDB794EE5C}' id='136' EA\040name=''"
	 *        annotation="TaggedValues xml.name='REALIZED-IREF' xml.namePlural='REALIZED-IREFS' xml.roleElement='true' xml.typeElement='false' xml.typeWrapperElement='false'"
	 *        extendedMetaData="name='REALIZED-IREF' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='REALIZED-IREFS' xmlAttribute='false' featureWrapperElement='true' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	EList<Realization_realized> getRealized();

	/**
	 * Returns the value of the '<em><b>Realized By</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.eatop.eastadl21.Realization_realizedBy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized By</em>' containment reference list.
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getRealization_RealizedBy()
	 * @model containment="true" required="true"
	 *        annotation="MetaData guid='{89C72DED-7AAC-495c-AEDE-CA8C82A68340}' id='135' EA\040name=''"
	 *        annotation="TaggedValues xml.name='REALIZED-BY-IREF' xml.namePlural='REALIZED-BY-IREFS' xml.roleElement='true' xml.typeElement='false' xml.typeWrapperElement='false'"
	 *        extendedMetaData="name='REALIZED-BY-IREF' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='REALIZED-BY-IREFS' xmlAttribute='false' featureWrapperElement='true' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	EList<Realization_realizedBy> getRealizedBy();

} // Realization
