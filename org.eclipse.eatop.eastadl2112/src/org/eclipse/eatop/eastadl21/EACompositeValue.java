/**
 */
package org.eclipse.eatop.eastadl21;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EA Composite Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Used to model values in a record.
 * 
 * Constraints:
 * [1] Shall be typed by an CompositeDatatype.
 * [2] The values in this EACompositeValue shall be typed and ordered in the same way as the EADatatypePrototypes in the typing CompositeDatatype.
 * 
 * Semantics:
 * The semantics of this value is defined by the element typed by the typing CompositeDatatype.
 * 
 * Extension:
 * UML2:LiteralSpecification
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Infrastructure.Values.EACompositeValue</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eatop.eastadl21.EACompositeValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getEACompositeValue()
 * @model annotation="MetaData guid='{C75CA405-1DF7-4732-8BA9-35E62A0A6BD3}' id='277' EA\040name='EACompositeValue'"
 *        extendedMetaData="name='EA-COMPOSITE-VALUE' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='EA-COMPOSITE-VALUES'"
 * @generated
 */
public interface EACompositeValue extends EAValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.eatop.eastadl21.EAValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getEACompositeValue_Value()
	 * @model containment="true" required="true"
	 *        annotation="MetaData guid='{FAE9286C-FBCF-4759-9DC8-A6CCF7104286}' id='84' EA\040name=''"
	 *        extendedMetaData="name='VALUE' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='VALUES' xmlAttribute='false' featureWrapperElement='true' featureElement='false' classifierWrapperElement='false' classifierElement='true'"
	 * @generated
	 */
	EList<EAValue> getValue();

} // EACompositeValue
