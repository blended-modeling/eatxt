/**
 */
package eastadl22_alpha;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EA Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * EAValue is an abstract element with concrete elements used to store typed values in the model. Some of the specializations correspond to UML2 literal specifications EAValue corresponds to UML2 Value Specification which is a typed element.
 * 
 * The EAValue does not have a name and is contained where a value is modeled.
 * 
 * Semantics:
 * The semantics of this element is defined by the element typed by the corresponding EADatatype.
 * 
 * Extension:
 * UML2:ValueSpecification
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Infrastructure.Values.EAValue</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eastadl22_alpha.EAValue#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see eastadl22_alpha.Eastadl22_alphaPackage#getEAValue()
 * @model abstract="true"
 *        annotation="MetaData guid='{A1C876A3-2D63-4c68-9339-009B0F4E5DFF}' id='276' EA\040name='EAValue'"
 *        annotation="Stereotype Stereotype='atpPrototype'"
 *        extendedMetaData="name='EA-VALUE' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='EA-VALUES'"
 * @generated
 */
public interface EAValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(EADatatype)
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getEAValue_Type()
	 * @model required="true"
	 *        annotation="MetaData guid='{AC4002B9-B6AF-4e27-B4CB-56928DE44554}' id='111' EA\040name=''"
	 *        annotation="Stereotype Stereotype='isOfType'"
	 *        extendedMetaData="name='TYPE-TREF' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='TYPE-TREFS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	EADatatype getType();

	/**
	 * Sets the value of the '{@link eastadl22_alpha.EAValue#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EADatatype value);

} // EAValue
