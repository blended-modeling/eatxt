/**
 */
package org.eclipse.eatop.eastadl21;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EA Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The EAElement is an abstract metaclass that represents an arbitrary named entity in the domain model. It specializes AUTOSAR Identifiable which has the shortName attribute used for identification of the element within the namespace in which it is defined.
 * 
 * The abbreviation EA in the name of this metaclass is short for EAST-ADL.
 * 
 * 
 * Semantics:
 * Also the EAElement can be used to extend the EAST-ADL approach to other languages and standards by adding a generalize relation from the respective (non EAST-ADL) element to the EAElement.
 * 
 * Extension: 
 * The ADLEntity stereotype is an abstract stereotype which extends UML2 metaclass NamedElement. The ADLEntity stereotype thus includes the name property from UML2 metaclass:NamedElement. The stereotype representation of this metaclass may be concrete to allow for application on instances from other domain models.
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Infrastructure.Elements.EAElement</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eatop.eastadl21.EAElement#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.EAElement#getOwnedComment <em>Owned Comment</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getEAElement()
 * @model abstract="true"
 *        annotation="MetaData guid='{32EE025B-F605-4638-832C-ACA586A730B6}' id='245' EA\040name='EAElement'"
 *        extendedMetaData="name='EA-ELEMENT' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='EA-ELEMENTS'"
 * @generated
 */
public interface EAElement extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional descriptive name of the EAElement, this name does not have the length restrictions as found for the AUTOSAR Identfiable shortName.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getEAElement_Name()
	 * @model unsettable="true" dataType="org.eclipse.eatop.eastadl21.String"
	 *        annotation="MetaData guid='{CABA8034-2E7C-457f-A46F-F57744416604}' id='185' EA\040name='name'"
	 *        extendedMetaData="name='NAME' kind='element'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='NAMES' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.eatop.eastadl21.EAElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.eatop.eastadl21.EAElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link org.eclipse.eatop.eastadl21.EAElement#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	boolean isSetName();

	/**
	 * Returns the value of the '<em><b>Owned Comment</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.eatop.eastadl21.Comment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Comment</em>' containment reference list.
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getEAElement_OwnedComment()
	 * @model containment="true"
	 *        annotation="MetaData guid='{A0343AF4-B8B1-4ed5-8185-7900200397CF}' id='173' EA\040name=''"
	 *        extendedMetaData="name='OWNED-COMMENT' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='OWNED-COMMENTS' xmlAttribute='false' featureWrapperElement='true' featureElement='false' classifierWrapperElement='false' classifierElement='true'"
	 * @generated
	 */
	EList<Comment> getOwnedComment();

} // EAElement
