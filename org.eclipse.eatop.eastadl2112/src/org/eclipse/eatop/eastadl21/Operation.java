/**
 */
package org.eclipse.eatop.eastadl21;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Operation is the provided/required operation of a FunctionClientServerInterface. It can specify its return values and arguments by EADatatypePrototypes.
 * 
 * Semantics: 
 * The Operation is the provided/required operation of a FunctionClientServerInterface.
 * 
 * Extension: UML Operation
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Structure.FunctionModeling.Operation</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eatop.eastadl21.Operation#getReturn <em>Return</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.Operation#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getOperation()
 * @model annotation="MetaData guid='{495B3F7E-D740-4376-956C-8802DC157BE6}' id='41' EA\040name='Operation'"
 *        extendedMetaData="name='OPERATION' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='OPERATIONS'"
 * @generated
 */
public interface Operation extends EAElement {
	/**
	 * Returns the value of the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return</em>' containment reference.
	 * @see #setReturn(EADatatypePrototype)
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getOperation_Return()
	 * @model containment="true"
	 *        annotation="MetaData guid='{DE0D9A1E-F182-4ad3-9AB6-86ACDA06FF34}' id='650' EA\040name=''"
	 *        extendedMetaData="name='RETURN' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='RETURNS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	EADatatypePrototype getReturn();

	/**
	 * Sets the value of the '{@link org.eclipse.eatop.eastadl21.Operation#getReturn <em>Return</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return</em>' containment reference.
	 * @see #getReturn()
	 * @generated
	 */
	void setReturn(EADatatypePrototype value);

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.eatop.eastadl21.EADatatypePrototype}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference list.
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getOperation_Argument()
	 * @model containment="true"
	 *        annotation="MetaData guid='{D3FA2F8E-C7DA-4e41-8EE2-25C86BE0F382}' id='651' EA\040name=''"
	 *        extendedMetaData="name='ARGUMENT' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='ARGUMENTS' xmlAttribute='false' featureWrapperElement='true' featureElement='false' classifierWrapperElement='false' classifierElement='true'"
	 * @generated
	 */
	EList<EADatatypePrototype> getArgument();

} // Operation
