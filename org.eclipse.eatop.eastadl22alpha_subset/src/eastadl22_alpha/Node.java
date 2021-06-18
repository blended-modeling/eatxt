/**
 */
package eastadl22_alpha;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Node represents the computer nodes of the embedded electrical/electronic system. Nodes consist of processor(s) and may be connected to sensors, actuators and other ECUs via a BusConnector.
 * 
 * Node denotes an electronic control unit that acts as a computing element executing Functions. In case a single CPU ECU is represented, it is sufficient to have a single, non-hierarchical Node. 
 * 
 * Semantics:
 * The Node element represents an ECU, i.e. an Electronic Control Unit, and an allocation target of FunctionPrototypes.
 * 
 * The Node executes its allocated FunctionPrototypes at the specified executionRate. The executionRate denotes how many execution seconds of an allocated functionPrototype´s execution time are processed in each real-time second. Actual execution time is thus found by dividing the parameters of the ExecutionTimeConstraint with executionRate.
 * 
 * Example: If an ECU is 25% faster than a standard ECU (e.g., in a certain context, execution times are given assuming a nominal speed of 100 MHz; our CPU is then 125 MHz), the executionRate is 1.25. An execution time of 5 ms would then become 4 ms on this ECU.
 * 
 * Notation:
 * Node is shown as a solid-outline rectangle with Node at the top right. The rectangle contains the name, and its ports or port groups on the perimeter.
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Structure.HardwareModeling.Node</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eastadl22_alpha.Node#getExecutionRate <em>Execution Rate</em>}</li>
 * </ul>
 *
 * @see eastadl22_alpha.Eastadl22_alphaPackage#getNode()
 * @model annotation="MetaData guid='{74DF80A4-4CCE-42d8-8DA5-D0FAF022D2D5}' id='68' EA\040name='Node'"
 *        extendedMetaData="name='NODE' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='NODES'"
 * @generated
 */
public interface Node extends HardwareComponentType {
	/**
	 * Returns the value of the '<em><b>Execution Rate</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ExecutionRate is used to compute an approximate execution time. A nominal execution time divided by executionRate provides the actual execution time to be used e.g. for timing analysis in feasibility studies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Execution Rate</em>' attribute.
	 * @see #isSetExecutionRate()
	 * @see #unsetExecutionRate()
	 * @see #setExecutionRate(Double)
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getNode_ExecutionRate()
	 * @model default="0.0" unsettable="true" dataType="eastadl22_alpha.Float"
	 *        annotation="MetaData guid='{128CCBC8-300C-49fd-943E-2A0FD32A46E8}' id='52' EA\040name='executionRate'"
	 *        extendedMetaData="name='EXECUTION-RATE' kind='element'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='EXECUTION-RATES' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	Double getExecutionRate();

	/**
	 * Sets the value of the '{@link eastadl22_alpha.Node#getExecutionRate <em>Execution Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Rate</em>' attribute.
	 * @see #isSetExecutionRate()
	 * @see #unsetExecutionRate()
	 * @see #getExecutionRate()
	 * @generated
	 */
	void setExecutionRate(Double value);

	/**
	 * Unsets the value of the '{@link eastadl22_alpha.Node#getExecutionRate <em>Execution Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExecutionRate()
	 * @see #getExecutionRate()
	 * @see #setExecutionRate(Double)
	 * @generated
	 */
	void unsetExecutionRate();

	/**
	 * Returns whether the value of the '{@link eastadl22_alpha.Node#getExecutionRate <em>Execution Rate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Execution Rate</em>' attribute is set.
	 * @see #unsetExecutionRate()
	 * @see #getExecutionRate()
	 * @see #setExecutionRate(Double)
	 * @generated
	 */
	boolean isSetExecutionRate();

} // Node
