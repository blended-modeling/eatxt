/**
 */
package eastadl22_alpha;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traceable Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The TraceableSpecification is an abstract metaclass which is used to allow its specializations to be allocated to a Context. 
 * 
 * Semantics:
 * TraceableSpecification is specialized by requirements, test cases and other specifications, that can be allocated to a Context, for example to a sensor or to an entire HW architecture.
 * 
 * See Context and Relationship.
 * 
 * Extension: 
 * The ADLTraceableSpecification is a specification stereotype which extends UML2 metaclass Element
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Infrastructure.Elements.TraceableSpecification</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eastadl22_alpha.TraceableSpecification#getText <em>Text</em>}</li>
 *   <li>{@link eastadl22_alpha.TraceableSpecification#getUri <em>Uri</em>}</li>
 * </ul>
 *
 * @see eastadl22_alpha.Eastadl22_alphaPackage#getTraceableSpecification()
 * @model abstract="true"
 *        annotation="MetaData guid='{AF13C9C7-B586-4065-99EF-6BF79895687C}' id='251' EA\040name='TraceableSpecification'"
 *        extendedMetaData="name='TRACEABLE-SPECIFICATION' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='TRACEABLE-SPECIFICATIONS'"
 * @generated
 */
public interface TraceableSpecification extends EAPackageableElement {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional description attribute that provides textual representation, or a reference to the textual representation, of the Traceable Specification in a specific formalism.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #isSetText()
	 * @see #unsetText()
	 * @see #setText(String)
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getTraceableSpecification_Text()
	 * @model unsettable="true" dataType="eastadl22_alpha.String"
	 *        annotation="MetaData guid='{3E99F740-2125-4cd5-8534-D3E8C40C7B70}' id='187' EA\040name='text'"
	 *        extendedMetaData="name='TEXT' kind='element'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='TEXTS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link eastadl22_alpha.TraceableSpecification#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #isSetText()
	 * @see #unsetText()
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Unsets the value of the '{@link eastadl22_alpha.TraceableSpecification#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetText()
	 * @see #getText()
	 * @see #setText(String)
	 * @generated
	 */
	void unsetText();

	/**
	 * Returns whether the value of the '{@link eastadl22_alpha.TraceableSpecification#getText <em>Text</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text</em>' attribute is set.
	 * @see #unsetText()
	 * @see #getText()
	 * @see #setText(String)
	 * @generated
	 */
	boolean isSetText();

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to possible external file containing the content of the traceable specification.
	 * 
	 * Example: Not only requirements need to refer to possible external files containing the requirement statement but also VVOutcome. So we need to move the uri attribute up one level.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #isSetUri()
	 * @see #unsetUri()
	 * @see #setUri(String)
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getTraceableSpecification_Uri()
	 * @model unsettable="true" dataType="eastadl22_alpha.String"
	 *        annotation="MetaData guid='{603BA755-EBD1-4714-9CD3-21C6E6B21456}' id='243' EA\040name='uri'"
	 *        extendedMetaData="name='URI' kind='element'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='URIS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link eastadl22_alpha.TraceableSpecification#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #isSetUri()
	 * @see #unsetUri()
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Unsets the value of the '{@link eastadl22_alpha.TraceableSpecification#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUri()
	 * @see #getUri()
	 * @see #setUri(String)
	 * @generated
	 */
	void unsetUri();

	/**
	 * Returns whether the value of the '{@link eastadl22_alpha.TraceableSpecification#getUri <em>Uri</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Uri</em>' attribute is set.
	 * @see #unsetUri()
	 * @see #getUri()
	 * @see #setUri(String)
	 * @generated
	 */
	boolean isSetUri();

} // TraceableSpecification
