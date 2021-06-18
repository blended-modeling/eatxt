/**
 */
package eastadl22_alpha;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design Function Prototype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The DesignFunctionPrototype represents references to the occurrence of the DesignFunctionType that types it when it acts as a part.
 * The DesignFunctionPrototype is typed by a DesignFunctionType.
 * 
 * Semantics:
 * The DesignFunctionPrototype represents an occurrence of the DesignFunctionType that types it.
 * 
 * Extension:
 * UML Property, specialization of SysML::BlockProperty
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Structure.FunctionModeling.DesignFunctionPrototype</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eastadl22_alpha.DesignFunctionPrototype#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see eastadl22_alpha.Eastadl22_alphaPackage#getDesignFunctionPrototype()
 * @model annotation="MetaData guid='{7372B5DE-E4EC-4362-BD1E-350BED871A6C}' id='48' EA\040name='DesignFunctionPrototype'"
 *        extendedMetaData="name='DESIGN-FUNCTION-PROTOTYPE' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='DESIGN-FUNCTION-PROTOTYPES'"
 * @generated
 */
public interface DesignFunctionPrototype extends FunctionPrototype, AllocateableElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DesignFunctionType)
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getDesignFunctionPrototype_Type()
	 * @model required="true"
	 *        annotation="MetaData guid='{EF3CD027-CED3-43b1-B7C6-7E8057BEB530}' id='660' EA\040name=''"
	 *        annotation="Stereotype Stereotype='isOfType'"
	 *        extendedMetaData="name='TYPE-TREF' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='TYPE-TREFS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	DesignFunctionType getType();

	/**
	 * Sets the value of the '{@link eastadl22_alpha.DesignFunctionPrototype#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DesignFunctionType value);

} // DesignFunctionPrototype
