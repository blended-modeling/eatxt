/**
 */
package org.eclipse.eatop.eastadl21;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EA Numerical Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Used to model a numerical value.
 * 
 * Constraints:
 * [1] Shall be typed by an EANumerical or a RangeableValueType.
 * 
 * Semantics:
 * The semantics of this value is defined by the element typed by the type EADatatype.
 * 
 * Extension:
 * UML2:LiteralSpecification
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Infrastructure.Values.EANumericalValue</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eatop.eastadl21.EANumericalValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getEANumericalValue()
 * @model annotation="MetaData guid='{76BC30C9-D7F4-4f40-BD77-D87AB50B3E2C}' id='275' EA\040name='EANumericalValue'"
 *        extendedMetaData="name='EA-NUMERICAL-VALUE' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='EA-NUMERICAL-VALUES'"
 * @generated
 */
public interface EANumericalValue extends EAValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(String)
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getEANumericalValue_Value()
	 * @model unsettable="true" dataType="org.eclipse.eatop.eastadl21.Numerical" required="true"
	 *        annotation="MetaData guid='{F96B188B-0E55-4624-A088-E49B88CC7F66}' id='207' EA\040name='value'"
	 *        extendedMetaData="name='VALUE' kind='element'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='VALUES' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.eatop.eastadl21.EANumericalValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.eatop.eastadl21.EANumericalValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(String)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.eclipse.eatop.eastadl21.EANumericalValue#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(String)
	 * @generated
	 */
	boolean isSetValue();

} // EANumericalValue
