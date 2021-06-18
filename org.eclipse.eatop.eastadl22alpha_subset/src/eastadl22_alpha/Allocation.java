/**
 */
package eastadl22_alpha;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Allocation element contains function allocations. It can bundle function allocations that belong together, e.g., all function allocations for a simulation.
 * 
 * Semantics:
 * The Allocation element contains function allocations, i.e., it can bundle function allocations that belong together.
 * 
 * Extension: Class
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Structure.FunctionModeling.Allocation</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eastadl22_alpha.Allocation#getFunctionAllocation <em>Function Allocation</em>}</li>
 * </ul>
 *
 * @see eastadl22_alpha.Eastadl22_alphaPackage#getAllocation()
 * @model annotation="MetaData guid='{62868E4F-8FA9-4f95-96F9-1B9F47B4EC86}' id='46' EA\040name='Allocation'"
 *        extendedMetaData="name='ALLOCATION' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='ALLOCATIONS'"
 * @generated
 */
public interface Allocation extends EAElement {
	/**
	 * Returns the value of the '<em><b>Function Allocation</b></em>' containment reference list.
	 * The list contents are of type {@link eastadl22_alpha.FunctionAllocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Allocation</em>' containment reference list.
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getAllocation_FunctionAllocation()
	 * @model containment="true"
	 *        annotation="MetaData guid='{845496EE-F7B5-4440-BE72-8F3DC81891D2}' id='682' EA\040name=''"
	 *        extendedMetaData="name='FUNCTION-ALLOCATION' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='FUNCTION-ALLOCATIONS' xmlAttribute='false' featureWrapperElement='true' featureElement='false' classifierWrapperElement='false' classifierElement='true'"
	 * @generated
	 */
	EList<FunctionAllocation> getFunctionAllocation();

} // Allocation
