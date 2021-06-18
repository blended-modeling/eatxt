/**
 */
package eastadl22_alpha;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analysis Function Prototype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The AnalysisFunctionPrototype represents references to the occurrence of the AnalysisFunctionType that types it when it acts as a part.
 * 
 * The AnalysisFunctionPrototype is typed by an AnalysisFunctionType.
 * 
 * 
 * Semantics:
 * The AnalysisFunctionPrototype represents an occurrence of the AnalysisFunctionType that types it.
 * 
 * 
 * Extension:
 * UML Property, specialization of SysML::BlockProperty
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Structure.FunctionModeling.AnalysisFunctionPrototype</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eastadl22_alpha.AnalysisFunctionPrototype#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see eastadl22_alpha.Eastadl22_alphaPackage#getAnalysisFunctionPrototype()
 * @model annotation="MetaData guid='{95E72BFB-F9BB-4bb2-B78C-F0227D35280C}' id='51' EA\040name='AnalysisFunctionPrototype'"
 *        extendedMetaData="name='ANALYSIS-FUNCTION-PROTOTYPE' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='ANALYSIS-FUNCTION-PROTOTYPES'"
 * @generated
 */
public interface AnalysisFunctionPrototype extends FunctionPrototype {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(AnalysisFunctionType)
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getAnalysisFunctionPrototype_Type()
	 * @model required="true"
	 *        annotation="MetaData guid='{0B20899E-F2AF-460c-98F5-B9634FB87D29}' id='606' EA\040name=''"
	 *        annotation="Stereotype Stereotype='isOfType'"
	 *        extendedMetaData="name='TYPE-TREF' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='TYPE-TREFS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	AnalysisFunctionType getType();

	/**
	 * Sets the value of the '{@link eastadl22_alpha.AnalysisFunctionPrototype#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(AnalysisFunctionType value);

} // AnalysisFunctionPrototype
