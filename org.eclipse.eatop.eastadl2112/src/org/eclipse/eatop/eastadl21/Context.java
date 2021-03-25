/**
 */
package org.eclipse.eatop.eastadl21;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Context represents a simple and practical way to allocate TraceableSpecifications to a specific EAST-ADL model context, and to let this specific model context own Relationships.
 * 
 * Semantics:
 * See Relationship and TraceableSpecification.
 * 
 * Extension: 
 * The ADLContext stereotype is an abstract stereotype which extends UML2 metaclass Element
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Infrastructure.Elements.Context</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eatop.eastadl21.Context#getTraceableSpecification <em>Traceable Specification</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.Context#getOwnedRelationship <em>Owned Relationship</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getContext()
 * @model abstract="true"
 *        annotation="MetaData guid='{C196A58B-83D2-40ab-B7CC-A1F39DB7DEB3}' id='252' EA\040name='Context'"
 *        extendedMetaData="name='CONTEXT' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='CONTEXTS'"
 * @generated
 */
public interface Context extends EAPackageableElement {
	/**
	 * Returns the value of the '<em><b>Traceable Specification</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.eatop.eastadl21.TraceableSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traceable Specification</em>' reference list.
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getContext_TraceableSpecification()
	 * @model annotation="MetaData guid='{7E9C04D7-A9C1-4729-AAFF-DA6E3396E495}' id='125' EA\040name=''"
	 *        extendedMetaData="name='TRACEABLE-SPECIFICATION-REF' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='TRACEABLE-SPECIFICATION-REFS' xmlAttribute='false' featureWrapperElement='true' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	EList<TraceableSpecification> getTraceableSpecification();

	/**
	 * Returns the value of the '<em><b>Owned Relationship</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.eatop.eastadl21.Relationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Relationship</em>' containment reference list.
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getContext_OwnedRelationship()
	 * @model containment="true"
	 *        annotation="MetaData guid='{1102A3E5-90C7-41f5-828C-AC734F1E6723}' id='131' EA\040name=''"
	 *        extendedMetaData="name='OWNED-RELATIONSHIP' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='OWNED-RELATIONSHIPS' xmlAttribute='false' featureWrapperElement='true' featureElement='false' classifierWrapperElement='false' classifierElement='true'"
	 * @generated
	 */
	EList<Relationship> getOwnedRelationship();

} // Context
