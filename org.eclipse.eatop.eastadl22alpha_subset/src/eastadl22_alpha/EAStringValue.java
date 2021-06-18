/**
 */
package eastadl22_alpha;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EA String Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Used to model a string value.
 * 
 * Constraints:
 * [1] Shall be typed by an EAString.
 * 
 * Semantics:
 * The semantics of this value is defined by the element typed by the typing EAString.
 * 
 * Extension:
 * UML2:LiteralString
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Infrastructure.Values.EAStringValue</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eastadl22_alpha.EAStringValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see eastadl22_alpha.Eastadl22_alphaPackage#getEAStringValue()
 * @model annotation="MetaData guid='{F6D6431D-A664-4f4f-BCA0-821C62B7AC74}' id='278' EA\040name='EAStringValue'"
 *        extendedMetaData="name='EA-STRING-VALUE' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='EA-STRING-VALUES'"
 * @generated
 */
public interface EAStringValue extends EAValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(String)
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getEAStringValue_Value()
	 * @model unsettable="true" dataType="eastadl22_alpha.String" required="true"
	 *        annotation="MetaData guid='{DB4FD27C-3702-4e69-B136-D8C953EE1FBE}' id='208' EA\040name='value'"
	 *        extendedMetaData="name='VALUE' kind='element'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='VALUES' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link eastadl22_alpha.EAStringValue#getValue <em>Value</em>}' attribute.
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
	 * Unsets the value of the '{@link eastadl22_alpha.EAStringValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(String)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link eastadl22_alpha.EAStringValue#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(String)
	 * @generated
	 */
	boolean isSetValue();

} // EAStringValue
