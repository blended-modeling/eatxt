/**
 */
package eastadl22_alpha;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Relationship is an abstract metaclass which represents a relationship between arbitrary elements.
 * 
 * Semantics:
 * In many cases, Contexts such as functions and sensors need to have requirements and other specification elements allocated to them. In other cases, the relationship between an element and the related specification element is specific for a certain Context: for example a Requirement on a sensor is only applicable in certain hardware architectures. These relationships are modeled by concrete specializations of Relationship.
 * 
 * See Context and TraceableSpecification.
 * 
 * Extension: 
 * The ADLRelationship stereotype is a relationship stereotype that specializes UML2 stereotype Relationship, which extends UML2 metaclass Dependency
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Infrastructure.Elements.Relationship</b></em> 
 * <!-- end-model-doc -->
 *
 *
 * @see eastadl22_alpha.Eastadl22_alphaPackage#getRelationship()
 * @model abstract="true"
 *        annotation="MetaData guid='{93F6186A-7622-480a-98D0-A92E9099135A}' id='250' EA\040name='Relationship'"
 *        extendedMetaData="name='RELATIONSHIP' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='RELATIONSHIPS'"
 * @generated
 */
public interface Relationship extends EAElement {
} // Relationship
