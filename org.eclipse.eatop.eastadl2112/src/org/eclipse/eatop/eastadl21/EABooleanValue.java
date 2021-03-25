/**
 */
package org.eclipse.eatop.eastadl21;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EA Boolean Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Used to model a boolean value.
 * 
 * Constraints:
 * [1] Shall be typed by an EABoolean.
 * 
 * Semantics:
 * The semantics of this value is defined by the element typed by the typing EABoolean.
 * 
 * Extension:
 * UML2:LiteralBoolean
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Infrastructure.Values.EABooleanValue</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eatop.eastadl21.EABooleanValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getEABooleanValue()
 * @model annotation="MetaData guid='{26A6AA76-7DC1-4efc-AE80-99EA0F9F892E}' id='271' EA\040name='EABooleanValue'"
 *        extendedMetaData="name='EA-BOOLEAN-VALUE' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='EA-BOOLEAN-VALUES'"
 * @generated
 */
public interface EABooleanValue extends EAValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(Boolean)
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getEABooleanValue_Value()
	 * @model default="false" unsettable="true" dataType="org.eclipse.eatop.eastadl21.Boolean" required="true"
	 *        annotation="MetaData guid='{4EF5F62D-1016-4aa5-A94A-B9ED68EB92D3}' id='206' EA\040name='value'"
	 *        extendedMetaData="name='VALUE' kind='element'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='VALUES' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	Boolean getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.eatop.eastadl21.EABooleanValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.eatop.eastadl21.EABooleanValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(Boolean)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.eclipse.eatop.eastadl21.EABooleanValue#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(Boolean)
	 * @generated
	 */
	boolean isSetValue();

} // EABooleanValue
