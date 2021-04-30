/**
 */
package org.eclipse.eatop.eastadl21;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Flow Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The FunctionFlowPort is a metaclass for flowports, inspired by the SysML FlowPort.
 * 
 * Semantics:
 * FunctionFlowPorts are single buffer overwrite and nonconsumable.
 * 
 * FunctionFlowPorts can be connected if their FunctionPort signatures match; i.e.:
 * 
 * EADatatypes that are ValueTypes are compatible if
 * 
 * * They have the same "dimension".
 * 
 * * They have the same "unit".
 * 
 * EADatatypes that are RangeableValueTypes are compatible if
 * 
 * * The source EADatatype has the same or better "accuracy".
 * 
 * * They have the same baseRangeable.
 * 
 * * The source EADatatype has the same or smaller "maxValue".
 * 
 * * The source EADatatype has the same or higher "minValue".
 * 
 * * The source EADatatype has the same or higher "resolution".
 * 
 * * They have the same "significantDigits".
 * 
 * EADatatypes that are EnumerationValueTypes are compatible if
 * 
 * * They have the same baseEnumeration.
 * 
 * A FunctionFlowPort with direction=in is called an input FunctionFlowPort:
 * 
 * The input FunctionFlowPort indicates that the containing Function requires input data. The EADatatype of this data is defined by the associated EADatatype. The data is sampled at the invocation of the containing entity for discrete Functions. For continuous Functions, the input FunctionFlowPort represents a continuous input connection point.
 * 
 * The input FunctionFlowPort declares a reception point of data. It represents a single element buffer, which is overridden with the latest data. The type of the data is defined by the associated EADatatype.
 * 
 * A FunctionFlowPort with direction=out is called an output FunctionFlowPort:
 * 
 * The output FunctionFlowPort indicates that the containing Function provides output data. The EADatatype of this data is defined by the associated EADatatype. The data is sent at the completion of the containing entity for discrete Functions. For continuous Functions, the output FunctionFlowPort represents a (time-)continuous output connection point.
 * 
 * The output FunctionFlowPort declares a transmission point of data. The type of the data is defined by the associated EADatatype.
 * 
 * A FunctionFlowPort with direction=inout is called an input/output FunctionFlowPort: Its semantics is the one of both the input and output FunctionFlowPort, described above.
 * 
 * Extension: UML Port, specialization of SysML::FlowPort
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Structure.FunctionModeling.FunctionFlowPort</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eatop.eastadl21.FunctionFlowPort#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.FunctionFlowPort#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.FunctionFlowPort#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getFunctionFlowPort()
 * @model annotation="MetaData guid='{C66FD504-B39C-4042-881C-08D3C77C38BE}' id='53' EA\040name='FunctionFlowPort'"
 *        extendedMetaData="name='FUNCTION-FLOW-PORT' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='FUNCTION-FLOW-PORTS'"
 * @generated
 */
public interface FunctionFlowPort extends FunctionPort {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The default value is <code>"IN"</code>.
	 * The literals are from the enumeration {@link org.eclipse.eatop.eastadl21.EADirectionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.eatop.eastadl21.EADirectionKind
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #setDirection(EADirectionKind)
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getFunctionFlowPort_Direction()
	 * @model default="IN" unsettable="true" required="true"
	 *        annotation="MetaData guid='{5C884441-F9DC-40dd-BB1D-1DD5C2C1F9F3}' id='42' EA\040name='direction'"
	 *        extendedMetaData="name='DIRECTION' kind='element'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='DIRECTIONS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	EADirectionKind getDirection();

	/**
	 * Sets the value of the '{@link org.eclipse.eatop.eastadl21.FunctionFlowPort#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.eatop.eastadl21.EADirectionKind
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(EADirectionKind value);

	/**
	 * Unsets the value of the '{@link org.eclipse.eatop.eastadl21.FunctionFlowPort#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDirection()
	 * @see #getDirection()
	 * @see #setDirection(EADirectionKind)
	 * @generated
	 */
	void unsetDirection();

	/**
	 * Returns whether the value of the '{@link org.eclipse.eatop.eastadl21.FunctionFlowPort#getDirection <em>Direction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Direction</em>' attribute is set.
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @see #setDirection(EADirectionKind)
	 * @generated
	 */
	boolean isSetDirection();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(EADatatype)
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getFunctionFlowPort_Type()
	 * @model required="true"
	 *        annotation="MetaData guid='{BC294377-FD70-4265-81EC-709D587A969E}' id='600' EA\040name=''"
	 *        annotation="Stereotype Stereotype='isOfType'"
	 *        extendedMetaData="name='TYPE-TREF' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='TYPE-TREFS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	EADatatype getType();

	/**
	 * Sets the value of the '{@link org.eclipse.eatop.eastadl21.FunctionFlowPort#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EADatatype value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(EAValue)
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getFunctionFlowPort_DefaultValue()
	 * @model containment="true"
	 *        annotation="MetaData guid='{ED2EBA97-BEAF-472e-A943-B49644B1E35B}' id='599' EA\040name=''"
	 *        extendedMetaData="name='DEFAULT-VALUE' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='DEFAULT-VALUES' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='true'"
	 * @generated
	 */
	EAValue getDefaultValue();

	/**
	 * Sets the value of the '{@link org.eclipse.eatop.eastadl21.FunctionFlowPort#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(EAValue value);

} // FunctionFlowPort
