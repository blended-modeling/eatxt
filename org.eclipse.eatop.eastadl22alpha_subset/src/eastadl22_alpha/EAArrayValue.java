/**
 */
package eastadl22_alpha;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EA Array Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Used to hold the values in an array.
 * 
 * Constraints:
 * [1] Shall be typed by an ArrayDatatype.
 * 
 * Extension:
 * UML2:LiteralSpecification
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Infrastructure.Values.EAArrayValue</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eastadl22_alpha.EAArrayValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see eastadl22_alpha.Eastadl22_alphaPackage#getEAArrayValue()
 * @model annotation="MetaData guid='{522E6AF4-A0B3-4606-9FA4-75131A3115EC}' id='274' EA\040name='EAArrayValue'"
 *        extendedMetaData="name='EA-ARRAY-VALUE' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='EA-ARRAY-VALUES'"
 * @generated
 */
public interface EAArrayValue extends EAValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link eastadl22_alpha.EAValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getEAArrayValue_Value()
	 * @model containment="true"
	 *        annotation="MetaData guid='{7A58A32F-F269-4dc4-884F-EFF0BD7E8D0F}' id='94' EA\040name=''"
	 *        extendedMetaData="name='VALUE' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='VALUES' xmlAttribute='false' featureWrapperElement='true' featureElement='false' classifierWrapperElement='false' classifierElement='true'"
	 * @generated
	 */
	EList<EAValue> getValue();

} // EAArrayValue
