/**
 */
package eastadl22_alpha;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design Function Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The DesignFunctionType is a concrete FunctionType and therefore inherits the elementary function properties from the abstract metaclass FunctionType. The DesignFunctionType is used to model the functional structure on DesignLevel. The syntax of DesignFunctionTypes is inspired by the type-prototype pattern used by AUTOSAR.
 * 
 * The DesignFunctions may interact with other DesignFunctions (i.e., also BasicSoftwareFunctions, HardwareFunctions, and LocalDeviceManagers) through their FunctionPorts.
 * 
 * Furthermore, a DesignFunction may be decomposed into the contained parts that are DesignFunctionPrototypes. This allows the functionalities provided by the parent DesignFunction to be broken up hierarchically into sub-functionalities.
 * 
 * Execution time constraints on the DesignFunctionType can be expressed by ExecutionTimeConstraints, see the Timing package.
 * 
 * Semantics:
 * The DesignFunctionType represents a node in a tree structure corresponding to the functional decomposition of a top level DesignFunction. The DesignFunction represents the design function used to describe the functionalities provided by a vehicle on the DesignLevel. At the DesignLevel, DesignFunctions are defined and structured according to the functional and hardware system design.
 * 
 * 
 * Extension: UML Class, specialization of SysML::Block
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Structure.FunctionModeling.DesignFunctionType</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eastadl22_alpha.DesignFunctionType#getPart <em>Part</em>}</li>
 * </ul>
 *
 * @see eastadl22_alpha.Eastadl22_alphaPackage#getDesignFunctionType()
 * @model annotation="MetaData guid='{3C657C41-C724-4363-9C66-8616E947578F}' id='39' EA\040name='DesignFunctionType'"
 *        extendedMetaData="name='DESIGN-FUNCTION-TYPE' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='DESIGN-FUNCTION-TYPES'"
 * @generated
 */
public interface DesignFunctionType extends FunctionType {
	/**
	 * Returns the value of the '<em><b>Part</b></em>' containment reference list.
	 * The list contents are of type {@link eastadl22_alpha.DesignFunctionPrototype}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part</em>' containment reference list.
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getDesignFunctionType_Part()
	 * @model containment="true"
	 *        annotation="MetaData guid='{18AEE740-4D7B-4047-A49B-81815D2B9469}' id='665' EA\040name=''"
	 *        extendedMetaData="name='PART' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='PARTS' xmlAttribute='false' featureWrapperElement='true' featureElement='false' classifierWrapperElement='false' classifierElement='true'"
	 * @generated
	 */
	EList<DesignFunctionPrototype> getPart();

} // DesignFunctionType
