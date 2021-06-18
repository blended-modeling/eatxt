/**
 */
package eastadl22_alpha;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Unit describes a unit used for numerical values of a datatype. It may relate to another unit to enable conversions. It may also reference a quantity to give a dimension of the unit.
 * 
 * As a unit conversion example: 
 * The Unit with name Second has the factor 1000, and the reference Millisecond, i.e.:
 * second = 1000 * millisecond 
 * Moreover the Unit may be given a symbol and an offset, for example:
 * The Unit Fahrenheit with factor 1.8 and offset 32 gives with the reference to Celsius the definition of Fahrenheit:
 * F = C*9/5 + 32
 * 
 * Semantics:
 * Unit descibes the unit of typed numerical values.
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Infrastructure.Datatypes.Unit</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eastadl22_alpha.Unit#getFactor <em>Factor</em>}</li>
 *   <li>{@link eastadl22_alpha.Unit#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link eastadl22_alpha.Unit#getOffset <em>Offset</em>}</li>
 *   <li>{@link eastadl22_alpha.Unit#getReference <em>Reference</em>}</li>
 *   <li>{@link eastadl22_alpha.Unit#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @see eastadl22_alpha.Eastadl22_alphaPackage#getUnit()
 * @model annotation="MetaData guid='{E09D0995-9F42-4d54-AD8D-3FC95579FEAE}' id='269' EA\040name='Unit'"
 *        extendedMetaData="name='UNIT' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='UNITS'"
 * @generated
 */
public interface Unit extends EAPackageableElement {
	/**
	 * Returns the value of the '<em><b>Factor</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factor</em>' attribute.
	 * @see #isSetFactor()
	 * @see #unsetFactor()
	 * @see #setFactor(Double)
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getUnit_Factor()
	 * @model default="0.0" unsettable="true" dataType="eastadl22_alpha.Float" required="true"
	 *        annotation="MetaData guid='{669E9CED-532C-4f45-A2D3-DC4DA6590C0E}' id='200' EA\040name='factor'"
	 *        extendedMetaData="name='FACTOR' kind='element'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='FACTORS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	Double getFactor();

	/**
	 * Sets the value of the '{@link eastadl22_alpha.Unit#getFactor <em>Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factor</em>' attribute.
	 * @see #isSetFactor()
	 * @see #unsetFactor()
	 * @see #getFactor()
	 * @generated
	 */
	void setFactor(Double value);

	/**
	 * Unsets the value of the '{@link eastadl22_alpha.Unit#getFactor <em>Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFactor()
	 * @see #getFactor()
	 * @see #setFactor(Double)
	 * @generated
	 */
	void unsetFactor();

	/**
	 * Returns whether the value of the '{@link eastadl22_alpha.Unit#getFactor <em>Factor</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Factor</em>' attribute is set.
	 * @see #unsetFactor()
	 * @see #getFactor()
	 * @see #setFactor(Double)
	 * @generated
	 */
	boolean isSetFactor();

	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' attribute.
	 * @see #isSetSymbol()
	 * @see #unsetSymbol()
	 * @see #setSymbol(String)
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getUnit_Symbol()
	 * @model unsettable="true" dataType="eastadl22_alpha.String" required="true"
	 *        annotation="MetaData guid='{453C7108-FD8D-4cf7-890D-F44BE696259E}' id='202' EA\040name='symbol'"
	 *        extendedMetaData="name='SYMBOL' kind='element'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='SYMBOLS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	String getSymbol();

	/**
	 * Sets the value of the '{@link eastadl22_alpha.Unit#getSymbol <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' attribute.
	 * @see #isSetSymbol()
	 * @see #unsetSymbol()
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(String value);

	/**
	 * Unsets the value of the '{@link eastadl22_alpha.Unit#getSymbol <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSymbol()
	 * @see #getSymbol()
	 * @see #setSymbol(String)
	 * @generated
	 */
	void unsetSymbol();

	/**
	 * Returns whether the value of the '{@link eastadl22_alpha.Unit#getSymbol <em>Symbol</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Symbol</em>' attribute is set.
	 * @see #unsetSymbol()
	 * @see #getSymbol()
	 * @see #setSymbol(String)
	 * @generated
	 */
	boolean isSetSymbol();

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #isSetOffset()
	 * @see #unsetOffset()
	 * @see #setOffset(Double)
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getUnit_Offset()
	 * @model default="0.0" unsettable="true" dataType="eastadl22_alpha.Float" required="true"
	 *        annotation="MetaData guid='{DEF5AF97-7DED-481a-BB54-2E859CBF055E}' id='201' EA\040name='offset'"
	 *        extendedMetaData="name='OFFSET' kind='element'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='OFFSETS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	Double getOffset();

	/**
	 * Sets the value of the '{@link eastadl22_alpha.Unit#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #isSetOffset()
	 * @see #unsetOffset()
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(Double value);

	/**
	 * Unsets the value of the '{@link eastadl22_alpha.Unit#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOffset()
	 * @see #getOffset()
	 * @see #setOffset(Double)
	 * @generated
	 */
	void unsetOffset();

	/**
	 * Returns whether the value of the '{@link eastadl22_alpha.Unit#getOffset <em>Offset</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Offset</em>' attribute is set.
	 * @see #unsetOffset()
	 * @see #getOffset()
	 * @see #setOffset(Double)
	 * @generated
	 */
	boolean isSetOffset();

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(Unit)
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getUnit_Reference()
	 * @model annotation="MetaData guid='{9E5F8FC8-F6BB-4269-B7EA-C42929D60354}' id='101' EA\040name=''"
	 *        extendedMetaData="name='REFERENCE-REF' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='REFERENCE-REFS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	Unit getReference();

	/**
	 * Sets the value of the '{@link eastadl22_alpha.Unit#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Unit value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' reference.
	 * @see #setQuantity(Quantity)
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getUnit_Quantity()
	 * @model annotation="MetaData guid='{3E8151DE-C7BC-4b83-A540-D90849643BEA}' id='105' EA\040name=''"
	 *        extendedMetaData="name='QUANTITY-REF' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='QUANTITY-REFS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link eastadl22_alpha.Unit#getQuantity <em>Quantity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

} // Unit
