/**
 */
package org.eclipse.eatop.eastadl21;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analysis Function Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The AnalysisFunctionType is a concrete FunctionType and therefore inherits the elementary function properties from the abstract metaclass FunctionType. The AnalysisFunctionType is used to model the functional structure on AnalysisLevel. The syntax of AnalysisFunctionTypes is inspired from the type-prototype pattern used by AUTOSAR.
 * 
 * The AnalysisFunctions may interact with other AnalysisFunctions (i.e., also FunctionalDevices) through their FunctionPorts.
 * 
 * Furthermore, an AnalysisFunction may be decomposed into contained parts that are AnalysisFunctionPrototypes. This allows the functionalities provided by the parent AnalysisFunction to be broken up hierarchically into sub-functionalities.
 * 
 * A FunctionBehavior may be associated with each AnalysisFunction. In the case where the AnalysisFunction is decomposed, the behavior is a specification for the composed behavior of the parts.
 * 
 * 
 * Semantics:
 * The AnalysisFunctionType represents a node in a tree structure corresponding to the functional decomposition of a top level AnalysisFunction. The AnalysisFunction represents the analysis function used to describe the functionalities provided by a vehicle on the AnalysisLevel. At the AnalysisLevel, AnalysisFunctions are defined and structured according to the functional requirements, i.e., the functionalities provided to the user. 
 * 
 * Extension: UML Class, specialization of SysML::Block
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Structure.FunctionModeling.AnalysisFunctionType</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eatop.eastadl21.AnalysisFunctionType#getPart <em>Part</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getAnalysisFunctionType()
 * @model annotation="MetaData guid='{FD507174-A96E-4328-A323-4D51BF4ABC67}' id='57' EA\040name='AnalysisFunctionType'"
 *        extendedMetaData="name='ANALYSIS-FUNCTION-TYPE' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='ANALYSIS-FUNCTION-TYPES'"
 * @generated
 */
public interface AnalysisFunctionType extends FunctionType {
	/**
	 * Returns the value of the '<em><b>Part</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.eatop.eastadl21.AnalysisFunctionPrototype}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part</em>' containment reference list.
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getAnalysisFunctionType_Part()
	 * @model containment="true"
	 *        annotation="MetaData guid='{DCE3DDD8-7185-4db8-AAAD-AB3A2884A816}' id='605' EA\040name=''"
	 *        extendedMetaData="name='PART' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='PARTS' xmlAttribute='false' featureWrapperElement='true' featureElement='false' classifierWrapperElement='false' classifierElement='true'"
	 * @generated
	 */
	EList<AnalysisFunctionPrototype> getPart();

} // AnalysisFunctionType
