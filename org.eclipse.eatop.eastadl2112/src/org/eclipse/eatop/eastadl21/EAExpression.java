/**
 */
package org.eclipse.eatop.eastadl21;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EA Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The mixed string EAExpression allow for modeling of expressions with references to elements in the model. Specializations within the metamodel define their syntax and the referred metaclasses used in the expressions.
 * 
 * Semantics:
 * Used for modeling of expressions with references to model elements. Different typing of the expression is possible, if e.g. typed by an EABooleanDatatype the evaluated expression results in a boolean value.
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Infrastructure.Values.EAExpression</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eatop.eastadl21.EAExpression#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getEAExpression()
 * @model annotation="MetaData guid='{2FCEE92E-A893-4601-AA4D-52CE3A301564}' id='272' EA\040name='EAExpression'"
 *        annotation="Stereotype Stereotype='atpMixedString'"
 *        extendedMetaData="name='EA-EXPRESSION' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='EA-EXPRESSIONS'"
 * @generated
 */
public interface EAExpression extends EAValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.eatop.eastadl21.EAValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getEAExpression_Value()
	 * @model containment="true"
	 *        annotation="MetaData guid='{BB0F6AA7-5FD9-4131-9864-BD309D412AF3}' id='768' EA\040name=''"
	 *        extendedMetaData="name='VALUE' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData featureWrapperElement='true' featureElement='false' classifierWrapperElement='false' classifierElement='true' wrapperName='VALUES' xmlAttribute='false'"
	 * @generated
	 */
	EList<EAValue> getValue();

} // EAExpression
