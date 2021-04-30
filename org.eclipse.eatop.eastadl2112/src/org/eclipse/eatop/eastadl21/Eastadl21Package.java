/**
 */
package org.eclipse.eatop.eastadl21;

import org.eclipse.eatop.geastadl.ginfrastructure.gelements.GelementsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.eatop.eastadl21.Eastadl21Factory
 * @model kind="package"
 *        annotation="MetaData guid='{7298DC40-A4F8-4a5d-A0CC-4A71F6987184}' id='1' EA\040name='eastadl21'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData defaultEReferenceReferencedTypeAttributeName='TYPE'"
 * @generated
 */
public interface Eastadl21Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "eastadl21";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://east-adl.info/2.1.12";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "com.chalmers";

	/**
	 * The package content type ID.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eCONTENT_TYPE = "org.eclipse.eatop.eastadl21.eastadl21XMLFile";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Eastadl21Package eINSTANCE = org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.AllocateableElementImpl <em>Allocateable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.AllocateableElementImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getAllocateableElement()
	 * @generated
	 */
	int ALLOCATEABLE_ELEMENT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.ReferrableImpl <em>Referrable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.ReferrableImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getReferrable()
	 * @generated
	 */
	int REFERRABLE = 55;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRABLE__GSHORT_NAME = GelementsPackage.GREFERRABLE__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRABLE__SHORT_NAME = GelementsPackage.GREFERRABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Referrable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRABLE_FEATURE_COUNT = GelementsPackage.GREFERRABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.IdentifiableImpl <em>Identifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.IdentifiableImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getIdentifiable()
	 * @generated
	 */
	int IDENTIFIABLE = 58;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__GSHORT_NAME = REFERRABLE__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__SHORT_NAME = REFERRABLE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__CATEGORY = REFERRABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__UUID = REFERRABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_FEATURE_COUNT = REFERRABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.EAElementImpl <em>EA Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.EAElementImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getEAElement()
	 * @generated
	 */
	int EA_ELEMENT = 46;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__GSHORT_NAME = IDENTIFIABLE__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__SHORT_NAME = IDENTIFIABLE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__CATEGORY = IDENTIFIABLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__UUID = IDENTIFIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__NAME = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT__OWNED_COMMENT = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EA Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ELEMENT_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.EAPackageableElementImpl <em>EA Packageable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.EAPackageableElementImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getEAPackageableElement()
	 * @generated
	 */
	int EA_PACKAGEABLE_ELEMENT = 48;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGEABLE_ELEMENT__GSHORT_NAME = EA_ELEMENT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGEABLE_ELEMENT__SHORT_NAME = EA_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGEABLE_ELEMENT__CATEGORY = EA_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGEABLE_ELEMENT__UUID = EA_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGEABLE_ELEMENT__NAME = EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGEABLE_ELEMENT__OWNED_COMMENT = EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGEABLE_ELEMENT__GEA_PACKAGE_ELEMENT = EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGEABLE_ELEMENT__EA_PACKAGE_ELEMENT = EA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EA Packageable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT = EA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.AllocationImpl <em>Allocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.AllocationImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getAllocation()
	 * @generated
	 */
	int ALLOCATION = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.ContextImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 44;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__GSHORT_NAME = EA_PACKAGEABLE_ELEMENT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__SHORT_NAME = EA_PACKAGEABLE_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__CATEGORY = EA_PACKAGEABLE_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__UUID = EA_PACKAGEABLE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__NAME = EA_PACKAGEABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__OWNED_COMMENT = EA_PACKAGEABLE_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__GEA_PACKAGE_ELEMENT = EA_PACKAGEABLE_ELEMENT__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__EA_PACKAGE_ELEMENT = EA_PACKAGEABLE_ELEMENT__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Traceable Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__TRACEABLE_SPECIFICATION = EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__OWNED_RELATIONSHIP = EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.DesignLevelImpl <em>Design Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.DesignLevelImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getDesignLevel()
	 * @generated
	 */
	int DESIGN_LEVEL = 0;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LEVEL__GSHORT_NAME = CONTEXT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LEVEL__SHORT_NAME = CONTEXT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LEVEL__CATEGORY = CONTEXT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LEVEL__UUID = CONTEXT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LEVEL__NAME = CONTEXT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LEVEL__OWNED_COMMENT = CONTEXT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LEVEL__GEA_PACKAGE_ELEMENT = CONTEXT__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LEVEL__EA_PACKAGE_ELEMENT = CONTEXT__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Traceable Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LEVEL__TRACEABLE_SPECIFICATION = CONTEXT__TRACEABLE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LEVEL__OWNED_RELATIONSHIP = CONTEXT__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Allocation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LEVEL__ALLOCATION = CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Functional Design Architecture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LEVEL__FUNCTIONAL_DESIGN_ARCHITECTURE = CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hardware Design Architecture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LEVEL__HARDWARE_DESIGN_ARCHITECTURE = CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Design Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_LEVEL_FEATURE_COUNT = CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Allocateable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATEABLE_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION__GSHORT_NAME = EA_ELEMENT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION__SHORT_NAME = EA_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION__CATEGORY = EA_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION__UUID = EA_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION__NAME = EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION__OWNED_COMMENT = EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Function Allocation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION__FUNCTION_ALLOCATION = EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_FEATURE_COUNT = EA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.FunctionTypeImpl <em>Function Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.FunctionTypeImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getFunctionType()
	 * @generated
	 */
	int FUNCTION_TYPE = 17;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.AnalysisFunctionTypeImpl <em>Analysis Function Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.AnalysisFunctionTypeImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getAnalysisFunctionType()
	 * @generated
	 */
	int ANALYSIS_FUNCTION_TYPE = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.DesignFunctionTypeImpl <em>Design Function Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.DesignFunctionTypeImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getDesignFunctionType()
	 * @generated
	 */
	int DESIGN_FUNCTION_TYPE = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.BasicSoftwareFunctionTypeImpl <em>Basic Software Function Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.BasicSoftwareFunctionTypeImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getBasicSoftwareFunctionType()
	 * @generated
	 */
	int BASIC_SOFTWARE_FUNCTION_TYPE = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.EAPrototypeImpl <em>EA Prototype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.EAPrototypeImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getEAPrototype()
	 * @generated
	 */
	int EA_PROTOTYPE = 50;

	/**
	 * The number of structural features of the '<em>EA Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PROTOTYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.FunctionPrototypeImpl <em>Function Prototype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.FunctionPrototypeImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getFunctionPrototype()
	 * @generated
	 */
	int FUNCTION_PROTOTYPE = 16;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PROTOTYPE__GSHORT_NAME = EA_PROTOTYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PROTOTYPE__SHORT_NAME = EA_PROTOTYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PROTOTYPE__CATEGORY = EA_PROTOTYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PROTOTYPE__UUID = EA_PROTOTYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PROTOTYPE__NAME = EA_PROTOTYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PROTOTYPE__OWNED_COMMENT = EA_PROTOTYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Function Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PROTOTYPE_FEATURE_COUNT = EA_PROTOTYPE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.AnalysisFunctionPrototypeImpl <em>Analysis Function Prototype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.AnalysisFunctionPrototypeImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getAnalysisFunctionPrototype()
	 * @generated
	 */
	int ANALYSIS_FUNCTION_PROTOTYPE = 3;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION_PROTOTYPE__GSHORT_NAME = FUNCTION_PROTOTYPE__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION_PROTOTYPE__SHORT_NAME = FUNCTION_PROTOTYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION_PROTOTYPE__CATEGORY = FUNCTION_PROTOTYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION_PROTOTYPE__UUID = FUNCTION_PROTOTYPE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION_PROTOTYPE__NAME = FUNCTION_PROTOTYPE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION_PROTOTYPE__OWNED_COMMENT = FUNCTION_PROTOTYPE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION_PROTOTYPE__TYPE = FUNCTION_PROTOTYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Analysis Function Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION_PROTOTYPE_FEATURE_COUNT = FUNCTION_PROTOTYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__GSHORT_NAME = CONTEXT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__SHORT_NAME = CONTEXT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__CATEGORY = CONTEXT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__UUID = CONTEXT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__NAME = CONTEXT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__OWNED_COMMENT = CONTEXT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__GEA_PACKAGE_ELEMENT = CONTEXT__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__EA_PACKAGE_ELEMENT = CONTEXT__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Traceable Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__TRACEABLE_SPECIFICATION = CONTEXT__TRACEABLE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__OWNED_RELATIONSHIP = CONTEXT__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Is Elementary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__IS_ELEMENTARY = CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__PORT_GROUP = CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__CONNECTOR = CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__PORT = CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Function Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_FEATURE_COUNT = CONTEXT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION_TYPE__GSHORT_NAME = FUNCTION_TYPE__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION_TYPE__SHORT_NAME = FUNCTION_TYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION_TYPE__CATEGORY = FUNCTION_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION_TYPE__UUID = FUNCTION_TYPE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION_TYPE__NAME = FUNCTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION_TYPE__OWNED_COMMENT = FUNCTION_TYPE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION_TYPE__GEA_PACKAGE_ELEMENT = FUNCTION_TYPE__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION_TYPE__EA_PACKAGE_ELEMENT = FUNCTION_TYPE__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Traceable Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION_TYPE__TRACEABLE_SPECIFICATION = FUNCTION_TYPE__TRACEABLE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION_TYPE__OWNED_RELATIONSHIP = FUNCTION_TYPE__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Is Elementary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION_TYPE__IS_ELEMENTARY = FUNCTION_TYPE__IS_ELEMENTARY;

	/**
	 * The feature id for the '<em><b>Port Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION_TYPE__PORT_GROUP = FUNCTION_TYPE__PORT_GROUP;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION_TYPE__CONNECTOR = FUNCTION_TYPE__CONNECTOR;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION_TYPE__PORT = FUNCTION_TYPE__PORT;

	/**
	 * The feature id for the '<em><b>Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION_TYPE__PART = FUNCTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Analysis Function Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION_TYPE_FEATURE_COUNT = FUNCTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_FUNCTION_TYPE__GSHORT_NAME = FUNCTION_TYPE__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_FUNCTION_TYPE__SHORT_NAME = FUNCTION_TYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_FUNCTION_TYPE__CATEGORY = FUNCTION_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_FUNCTION_TYPE__UUID = FUNCTION_TYPE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_FUNCTION_TYPE__NAME = FUNCTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_FUNCTION_TYPE__OWNED_COMMENT = FUNCTION_TYPE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_FUNCTION_TYPE__GEA_PACKAGE_ELEMENT = FUNCTION_TYPE__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_FUNCTION_TYPE__EA_PACKAGE_ELEMENT = FUNCTION_TYPE__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Traceable Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_FUNCTION_TYPE__TRACEABLE_SPECIFICATION = FUNCTION_TYPE__TRACEABLE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_FUNCTION_TYPE__OWNED_RELATIONSHIP = FUNCTION_TYPE__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Is Elementary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_FUNCTION_TYPE__IS_ELEMENTARY = FUNCTION_TYPE__IS_ELEMENTARY;

	/**
	 * The feature id for the '<em><b>Port Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_FUNCTION_TYPE__PORT_GROUP = FUNCTION_TYPE__PORT_GROUP;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_FUNCTION_TYPE__CONNECTOR = FUNCTION_TYPE__CONNECTOR;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_FUNCTION_TYPE__PORT = FUNCTION_TYPE__PORT;

	/**
	 * The feature id for the '<em><b>Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_FUNCTION_TYPE__PART = FUNCTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Design Function Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_FUNCTION_TYPE_FEATURE_COUNT = FUNCTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SOFTWARE_FUNCTION_TYPE__GSHORT_NAME = DESIGN_FUNCTION_TYPE__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SOFTWARE_FUNCTION_TYPE__SHORT_NAME = DESIGN_FUNCTION_TYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SOFTWARE_FUNCTION_TYPE__CATEGORY = DESIGN_FUNCTION_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SOFTWARE_FUNCTION_TYPE__UUID = DESIGN_FUNCTION_TYPE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SOFTWARE_FUNCTION_TYPE__NAME = DESIGN_FUNCTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SOFTWARE_FUNCTION_TYPE__OWNED_COMMENT = DESIGN_FUNCTION_TYPE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SOFTWARE_FUNCTION_TYPE__GEA_PACKAGE_ELEMENT = DESIGN_FUNCTION_TYPE__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SOFTWARE_FUNCTION_TYPE__EA_PACKAGE_ELEMENT = DESIGN_FUNCTION_TYPE__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Traceable Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SOFTWARE_FUNCTION_TYPE__TRACEABLE_SPECIFICATION = DESIGN_FUNCTION_TYPE__TRACEABLE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SOFTWARE_FUNCTION_TYPE__OWNED_RELATIONSHIP = DESIGN_FUNCTION_TYPE__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Is Elementary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SOFTWARE_FUNCTION_TYPE__IS_ELEMENTARY = DESIGN_FUNCTION_TYPE__IS_ELEMENTARY;

	/**
	 * The feature id for the '<em><b>Port Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SOFTWARE_FUNCTION_TYPE__PORT_GROUP = DESIGN_FUNCTION_TYPE__PORT_GROUP;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SOFTWARE_FUNCTION_TYPE__CONNECTOR = DESIGN_FUNCTION_TYPE__CONNECTOR;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SOFTWARE_FUNCTION_TYPE__PORT = DESIGN_FUNCTION_TYPE__PORT;

	/**
	 * The feature id for the '<em><b>Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SOFTWARE_FUNCTION_TYPE__PART = DESIGN_FUNCTION_TYPE__PART;

	/**
	 * The number of structural features of the '<em>Basic Software Function Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SOFTWARE_FUNCTION_TYPE_FEATURE_COUNT = DESIGN_FUNCTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.DesignFunctionPrototypeImpl <em>Design Function Prototype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.DesignFunctionPrototypeImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getDesignFunctionPrototype()
	 * @generated
	 */
	int DESIGN_FUNCTION_PROTOTYPE = 6;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_FUNCTION_PROTOTYPE__GSHORT_NAME = FUNCTION_PROTOTYPE__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_FUNCTION_PROTOTYPE__SHORT_NAME = FUNCTION_PROTOTYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_FUNCTION_PROTOTYPE__CATEGORY = FUNCTION_PROTOTYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_FUNCTION_PROTOTYPE__UUID = FUNCTION_PROTOTYPE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_FUNCTION_PROTOTYPE__NAME = FUNCTION_PROTOTYPE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_FUNCTION_PROTOTYPE__OWNED_COMMENT = FUNCTION_PROTOTYPE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_FUNCTION_PROTOTYPE__TYPE = FUNCTION_PROTOTYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Design Function Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_FUNCTION_PROTOTYPE_FEATURE_COUNT = FUNCTION_PROTOTYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.FunctionalDeviceImpl <em>Functional Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.FunctionalDeviceImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getFunctionalDevice()
	 * @generated
	 */
	int FUNCTIONAL_DEVICE = 8;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DEVICE__GSHORT_NAME = ANALYSIS_FUNCTION_TYPE__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DEVICE__SHORT_NAME = ANALYSIS_FUNCTION_TYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DEVICE__CATEGORY = ANALYSIS_FUNCTION_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DEVICE__UUID = ANALYSIS_FUNCTION_TYPE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DEVICE__NAME = ANALYSIS_FUNCTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DEVICE__OWNED_COMMENT = ANALYSIS_FUNCTION_TYPE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DEVICE__GEA_PACKAGE_ELEMENT = ANALYSIS_FUNCTION_TYPE__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DEVICE__EA_PACKAGE_ELEMENT = ANALYSIS_FUNCTION_TYPE__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Traceable Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DEVICE__TRACEABLE_SPECIFICATION = ANALYSIS_FUNCTION_TYPE__TRACEABLE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DEVICE__OWNED_RELATIONSHIP = ANALYSIS_FUNCTION_TYPE__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Is Elementary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DEVICE__IS_ELEMENTARY = ANALYSIS_FUNCTION_TYPE__IS_ELEMENTARY;

	/**
	 * The feature id for the '<em><b>Port Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DEVICE__PORT_GROUP = ANALYSIS_FUNCTION_TYPE__PORT_GROUP;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DEVICE__CONNECTOR = ANALYSIS_FUNCTION_TYPE__CONNECTOR;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DEVICE__PORT = ANALYSIS_FUNCTION_TYPE__PORT;

	/**
	 * The feature id for the '<em><b>Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DEVICE__PART = ANALYSIS_FUNCTION_TYPE__PART;

	/**
	 * The number of structural features of the '<em>Functional Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DEVICE_FEATURE_COUNT = ANALYSIS_FUNCTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.FunctionAllocationImpl <em>Function Allocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.FunctionAllocationImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getFunctionAllocation()
	 * @generated
	 */
	int FUNCTION_ALLOCATION = 9;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ALLOCATION__GSHORT_NAME = EA_ELEMENT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ALLOCATION__SHORT_NAME = EA_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ALLOCATION__CATEGORY = EA_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ALLOCATION__UUID = EA_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ALLOCATION__NAME = EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ALLOCATION__OWNED_COMMENT = EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Allocated Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ALLOCATION__ALLOCATED_ELEMENT = EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ALLOCATION__TARGET = EA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ALLOCATION_FEATURE_COUNT = EA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.TraceableSpecificationImpl <em>Traceable Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.TraceableSpecificationImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getTraceableSpecification()
	 * @generated
	 */
	int TRACEABLE_SPECIFICATION = 57;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_SPECIFICATION__GSHORT_NAME = EA_PACKAGEABLE_ELEMENT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_SPECIFICATION__SHORT_NAME = EA_PACKAGEABLE_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_SPECIFICATION__CATEGORY = EA_PACKAGEABLE_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_SPECIFICATION__UUID = EA_PACKAGEABLE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_SPECIFICATION__NAME = EA_PACKAGEABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_SPECIFICATION__OWNED_COMMENT = EA_PACKAGEABLE_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_SPECIFICATION__GEA_PACKAGE_ELEMENT = EA_PACKAGEABLE_ELEMENT__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_SPECIFICATION__EA_PACKAGE_ELEMENT = EA_PACKAGEABLE_ELEMENT__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_SPECIFICATION__TEXT = EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_SPECIFICATION__URI = EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traceable Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_SPECIFICATION_FEATURE_COUNT = EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.FunctionClientServerInterfaceImpl <em>Function Client Server Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.FunctionClientServerInterfaceImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getFunctionClientServerInterface()
	 * @generated
	 */
	int FUNCTION_CLIENT_SERVER_INTERFACE = 10;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CLIENT_SERVER_INTERFACE__GSHORT_NAME = TRACEABLE_SPECIFICATION__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CLIENT_SERVER_INTERFACE__SHORT_NAME = TRACEABLE_SPECIFICATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CLIENT_SERVER_INTERFACE__CATEGORY = TRACEABLE_SPECIFICATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CLIENT_SERVER_INTERFACE__UUID = TRACEABLE_SPECIFICATION__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CLIENT_SERVER_INTERFACE__NAME = TRACEABLE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CLIENT_SERVER_INTERFACE__OWNED_COMMENT = TRACEABLE_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CLIENT_SERVER_INTERFACE__GEA_PACKAGE_ELEMENT = TRACEABLE_SPECIFICATION__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CLIENT_SERVER_INTERFACE__EA_PACKAGE_ELEMENT = TRACEABLE_SPECIFICATION__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CLIENT_SERVER_INTERFACE__TEXT = TRACEABLE_SPECIFICATION__TEXT;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CLIENT_SERVER_INTERFACE__URI = TRACEABLE_SPECIFICATION__URI;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CLIENT_SERVER_INTERFACE__OPERATION = TRACEABLE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function Client Server Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CLIENT_SERVER_INTERFACE_FEATURE_COUNT = TRACEABLE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.FunctionPortImpl <em>Function Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.FunctionPortImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getFunctionPort()
	 * @generated
	 */
	int FUNCTION_PORT = 14;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT__GSHORT_NAME = EA_ELEMENT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT__SHORT_NAME = EA_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT__CATEGORY = EA_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT__UUID = EA_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT__NAME = EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT__OWNED_COMMENT = EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The number of structural features of the '<em>Function Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT_FEATURE_COUNT = EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.FunctionClientServerPortImpl <em>Function Client Server Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.FunctionClientServerPortImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getFunctionClientServerPort()
	 * @generated
	 */
	int FUNCTION_CLIENT_SERVER_PORT = 11;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CLIENT_SERVER_PORT__GSHORT_NAME = FUNCTION_PORT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CLIENT_SERVER_PORT__SHORT_NAME = FUNCTION_PORT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CLIENT_SERVER_PORT__CATEGORY = FUNCTION_PORT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CLIENT_SERVER_PORT__UUID = FUNCTION_PORT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CLIENT_SERVER_PORT__NAME = FUNCTION_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CLIENT_SERVER_PORT__OWNED_COMMENT = FUNCTION_PORT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CLIENT_SERVER_PORT__KIND = FUNCTION_PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CLIENT_SERVER_PORT__TYPE = FUNCTION_PORT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Client Server Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CLIENT_SERVER_PORT_FEATURE_COUNT = FUNCTION_PORT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.FunctionConnectorImpl <em>Function Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.FunctionConnectorImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getFunctionConnector()
	 * @generated
	 */
	int FUNCTION_CONNECTOR = 12;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CONNECTOR__GSHORT_NAME = EA_ELEMENT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CONNECTOR__SHORT_NAME = EA_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CONNECTOR__CATEGORY = EA_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CONNECTOR__UUID = EA_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CONNECTOR__NAME = EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CONNECTOR__OWNED_COMMENT = EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CONNECTOR__PORT = EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CONNECTOR_FEATURE_COUNT = EA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.FunctionFlowPortImpl <em>Function Flow Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.FunctionFlowPortImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getFunctionFlowPort()
	 * @generated
	 */
	int FUNCTION_FLOW_PORT = 13;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FLOW_PORT__GSHORT_NAME = FUNCTION_PORT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FLOW_PORT__SHORT_NAME = FUNCTION_PORT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FLOW_PORT__CATEGORY = FUNCTION_PORT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FLOW_PORT__UUID = FUNCTION_PORT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FLOW_PORT__NAME = FUNCTION_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FLOW_PORT__OWNED_COMMENT = FUNCTION_PORT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FLOW_PORT__DIRECTION = FUNCTION_PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FLOW_PORT__TYPE = FUNCTION_PORT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FLOW_PORT__DEFAULT_VALUE = FUNCTION_PORT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Function Flow Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FLOW_PORT_FEATURE_COUNT = FUNCTION_PORT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.FunctionPowerPortImpl <em>Function Power Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.FunctionPowerPortImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getFunctionPowerPort()
	 * @generated
	 */
	int FUNCTION_POWER_PORT = 15;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_POWER_PORT__GSHORT_NAME = FUNCTION_PORT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_POWER_PORT__SHORT_NAME = FUNCTION_PORT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_POWER_PORT__CATEGORY = FUNCTION_PORT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_POWER_PORT__UUID = FUNCTION_PORT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_POWER_PORT__NAME = FUNCTION_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_POWER_PORT__OWNED_COMMENT = FUNCTION_PORT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_POWER_PORT__TYPE = FUNCTION_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function Power Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_POWER_PORT_FEATURE_COUNT = FUNCTION_PORT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.HardwareFunctionTypeImpl <em>Hardware Function Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.HardwareFunctionTypeImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getHardwareFunctionType()
	 * @generated
	 */
	int HARDWARE_FUNCTION_TYPE = 18;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_FUNCTION_TYPE__GSHORT_NAME = DESIGN_FUNCTION_TYPE__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_FUNCTION_TYPE__SHORT_NAME = DESIGN_FUNCTION_TYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_FUNCTION_TYPE__CATEGORY = DESIGN_FUNCTION_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_FUNCTION_TYPE__UUID = DESIGN_FUNCTION_TYPE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_FUNCTION_TYPE__NAME = DESIGN_FUNCTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_FUNCTION_TYPE__OWNED_COMMENT = DESIGN_FUNCTION_TYPE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_FUNCTION_TYPE__GEA_PACKAGE_ELEMENT = DESIGN_FUNCTION_TYPE__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_FUNCTION_TYPE__EA_PACKAGE_ELEMENT = DESIGN_FUNCTION_TYPE__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Traceable Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_FUNCTION_TYPE__TRACEABLE_SPECIFICATION = DESIGN_FUNCTION_TYPE__TRACEABLE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_FUNCTION_TYPE__OWNED_RELATIONSHIP = DESIGN_FUNCTION_TYPE__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Is Elementary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_FUNCTION_TYPE__IS_ELEMENTARY = DESIGN_FUNCTION_TYPE__IS_ELEMENTARY;

	/**
	 * The feature id for the '<em><b>Port Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_FUNCTION_TYPE__PORT_GROUP = DESIGN_FUNCTION_TYPE__PORT_GROUP;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_FUNCTION_TYPE__CONNECTOR = DESIGN_FUNCTION_TYPE__CONNECTOR;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_FUNCTION_TYPE__PORT = DESIGN_FUNCTION_TYPE__PORT;

	/**
	 * The feature id for the '<em><b>Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_FUNCTION_TYPE__PART = DESIGN_FUNCTION_TYPE__PART;

	/**
	 * The feature id for the '<em><b>Hardware Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_FUNCTION_TYPE__HARDWARE_COMPONENT = DESIGN_FUNCTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hardware Function Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_FUNCTION_TYPE_FEATURE_COUNT = DESIGN_FUNCTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.LocalDeviceManagerImpl <em>Local Device Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.LocalDeviceManagerImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getLocalDeviceManager()
	 * @generated
	 */
	int LOCAL_DEVICE_MANAGER = 19;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__GSHORT_NAME = DESIGN_FUNCTION_TYPE__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__SHORT_NAME = DESIGN_FUNCTION_TYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__CATEGORY = DESIGN_FUNCTION_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__UUID = DESIGN_FUNCTION_TYPE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__NAME = DESIGN_FUNCTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__OWNED_COMMENT = DESIGN_FUNCTION_TYPE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__GEA_PACKAGE_ELEMENT = DESIGN_FUNCTION_TYPE__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__EA_PACKAGE_ELEMENT = DESIGN_FUNCTION_TYPE__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Traceable Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__TRACEABLE_SPECIFICATION = DESIGN_FUNCTION_TYPE__TRACEABLE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__OWNED_RELATIONSHIP = DESIGN_FUNCTION_TYPE__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Is Elementary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__IS_ELEMENTARY = DESIGN_FUNCTION_TYPE__IS_ELEMENTARY;

	/**
	 * The feature id for the '<em><b>Port Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__PORT_GROUP = DESIGN_FUNCTION_TYPE__PORT_GROUP;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__CONNECTOR = DESIGN_FUNCTION_TYPE__CONNECTOR;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__PORT = DESIGN_FUNCTION_TYPE__PORT;

	/**
	 * The feature id for the '<em><b>Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER__PART = DESIGN_FUNCTION_TYPE__PART;

	/**
	 * The number of structural features of the '<em>Local Device Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DEVICE_MANAGER_FEATURE_COUNT = DESIGN_FUNCTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.OperationImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 20;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__GSHORT_NAME = EA_ELEMENT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__SHORT_NAME = EA_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__CATEGORY = EA_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__UUID = EA_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OWNED_COMMENT = EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__RETURN = EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ARGUMENT = EA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = EA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.PortGroupImpl <em>Port Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.PortGroupImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getPortGroup()
	 * @generated
	 */
	int PORT_GROUP = 21;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_GROUP__GSHORT_NAME = EA_ELEMENT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_GROUP__SHORT_NAME = EA_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_GROUP__CATEGORY = EA_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_GROUP__UUID = EA_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_GROUP__NAME = EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_GROUP__OWNED_COMMENT = EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Port Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_GROUP__PORT_GROUP = EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_GROUP__PORT = EA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Port Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_GROUP_FEATURE_COUNT = EA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.FunctionAllocation_allocatedElementImpl <em>Function Allocation allocated Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.FunctionAllocation_allocatedElementImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getFunctionAllocation_allocatedElement()
	 * @generated
	 */
	int FUNCTION_ALLOCATION_ALLOCATED_ELEMENT = 22;

	/**
	 * The feature id for the '<em><b>Allocateable Element context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ALLOCATION_ALLOCATED_ELEMENT__ALLOCATEABLE_ELEMENT_CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Allocateable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ALLOCATION_ALLOCATED_ELEMENT__ALLOCATEABLE_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Function Allocation allocated Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ALLOCATION_ALLOCATED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.FunctionAllocation_targetImpl <em>Function Allocation target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.FunctionAllocation_targetImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getFunctionAllocation_target()
	 * @generated
	 */
	int FUNCTION_ALLOCATION_TARGET = 23;

	/**
	 * The feature id for the '<em><b>Allocation Target context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ALLOCATION_TARGET__ALLOCATION_TARGET_CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Allocation Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ALLOCATION_TARGET__ALLOCATION_TARGET = 1;

	/**
	 * The number of structural features of the '<em>Function Allocation target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ALLOCATION_TARGET_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.FunctionConnector_portImpl <em>Function Connector port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.FunctionConnector_portImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getFunctionConnector_port()
	 * @generated
	 */
	int FUNCTION_CONNECTOR_PORT = 24;

	/**
	 * The feature id for the '<em><b>Function Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CONNECTOR_PORT__FUNCTION_PROTOTYPE = 0;

	/**
	 * The feature id for the '<em><b>Function Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CONNECTOR_PORT__FUNCTION_PORT = 1;

	/**
	 * The number of structural features of the '<em>Function Connector port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CONNECTOR_PORT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.HardwareComponentTypeImpl <em>Hardware Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.HardwareComponentTypeImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getHardwareComponentType()
	 * @generated
	 */
	int HARDWARE_COMPONENT_TYPE = 29;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPONENT_TYPE__GSHORT_NAME = CONTEXT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPONENT_TYPE__SHORT_NAME = CONTEXT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPONENT_TYPE__CATEGORY = CONTEXT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPONENT_TYPE__UUID = CONTEXT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPONENT_TYPE__NAME = CONTEXT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPONENT_TYPE__OWNED_COMMENT = CONTEXT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPONENT_TYPE__GEA_PACKAGE_ELEMENT = CONTEXT__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPONENT_TYPE__EA_PACKAGE_ELEMENT = CONTEXT__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Traceable Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPONENT_TYPE__TRACEABLE_SPECIFICATION = CONTEXT__TRACEABLE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPONENT_TYPE__OWNED_RELATIONSHIP = CONTEXT__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPONENT_TYPE__PIN = CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPONENT_TYPE__PART = CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPONENT_TYPE__CONNECTOR = CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPONENT_TYPE__PORT = CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Port Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPONENT_TYPE__PORT_CONNECTOR = CONTEXT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Hardware Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPONENT_TYPE_FEATURE_COUNT = CONTEXT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.ActuatorImpl <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.ActuatorImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getActuator()
	 * @generated
	 */
	int ACTUATOR = 25;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__GSHORT_NAME = HARDWARE_COMPONENT_TYPE__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__SHORT_NAME = HARDWARE_COMPONENT_TYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__CATEGORY = HARDWARE_COMPONENT_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__UUID = HARDWARE_COMPONENT_TYPE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__NAME = HARDWARE_COMPONENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__OWNED_COMMENT = HARDWARE_COMPONENT_TYPE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__GEA_PACKAGE_ELEMENT = HARDWARE_COMPONENT_TYPE__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__EA_PACKAGE_ELEMENT = HARDWARE_COMPONENT_TYPE__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Traceable Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__TRACEABLE_SPECIFICATION = HARDWARE_COMPONENT_TYPE__TRACEABLE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__OWNED_RELATIONSHIP = HARDWARE_COMPONENT_TYPE__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__PIN = HARDWARE_COMPONENT_TYPE__PIN;

	/**
	 * The feature id for the '<em><b>Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__PART = HARDWARE_COMPONENT_TYPE__PART;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__CONNECTOR = HARDWARE_COMPONENT_TYPE__CONNECTOR;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__PORT = HARDWARE_COMPONENT_TYPE__PORT;

	/**
	 * The feature id for the '<em><b>Port Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__PORT_CONNECTOR = HARDWARE_COMPONENT_TYPE__PORT_CONNECTOR;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = HARDWARE_COMPONENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.HardwarePinImpl <em>Hardware Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.HardwarePinImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getHardwarePin()
	 * @generated
	 */
	int HARDWARE_PIN = 31;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PIN__GSHORT_NAME = EA_ELEMENT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PIN__SHORT_NAME = EA_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PIN__CATEGORY = EA_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PIN__UUID = EA_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PIN__NAME = EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PIN__OWNED_COMMENT = EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PIN__DIRECTION = EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Ground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PIN__IS_GROUND = EA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hardware Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PIN_FEATURE_COUNT = EA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.CommunicationHardwarePinImpl <em>Communication Hardware Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.CommunicationHardwarePinImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getCommunicationHardwarePin()
	 * @generated
	 */
	int COMMUNICATION_HARDWARE_PIN = 26;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_HARDWARE_PIN__GSHORT_NAME = HARDWARE_PIN__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_HARDWARE_PIN__SHORT_NAME = HARDWARE_PIN__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_HARDWARE_PIN__CATEGORY = HARDWARE_PIN__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_HARDWARE_PIN__UUID = HARDWARE_PIN__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_HARDWARE_PIN__NAME = HARDWARE_PIN__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_HARDWARE_PIN__OWNED_COMMENT = HARDWARE_PIN__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_HARDWARE_PIN__DIRECTION = HARDWARE_PIN__DIRECTION;

	/**
	 * The feature id for the '<em><b>Is Ground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_HARDWARE_PIN__IS_GROUND = HARDWARE_PIN__IS_GROUND;

	/**
	 * The number of structural features of the '<em>Communication Hardware Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_HARDWARE_PIN_FEATURE_COUNT = HARDWARE_PIN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.ElectricalComponentImpl <em>Electrical Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.ElectricalComponentImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getElectricalComponent()
	 * @generated
	 */
	int ELECTRICAL_COMPONENT = 27;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_COMPONENT__GSHORT_NAME = HARDWARE_COMPONENT_TYPE__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_COMPONENT__SHORT_NAME = HARDWARE_COMPONENT_TYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_COMPONENT__CATEGORY = HARDWARE_COMPONENT_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_COMPONENT__UUID = HARDWARE_COMPONENT_TYPE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_COMPONENT__NAME = HARDWARE_COMPONENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_COMPONENT__OWNED_COMMENT = HARDWARE_COMPONENT_TYPE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_COMPONENT__GEA_PACKAGE_ELEMENT = HARDWARE_COMPONENT_TYPE__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_COMPONENT__EA_PACKAGE_ELEMENT = HARDWARE_COMPONENT_TYPE__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Traceable Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_COMPONENT__TRACEABLE_SPECIFICATION = HARDWARE_COMPONENT_TYPE__TRACEABLE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_COMPONENT__OWNED_RELATIONSHIP = HARDWARE_COMPONENT_TYPE__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_COMPONENT__PIN = HARDWARE_COMPONENT_TYPE__PIN;

	/**
	 * The feature id for the '<em><b>Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_COMPONENT__PART = HARDWARE_COMPONENT_TYPE__PART;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_COMPONENT__CONNECTOR = HARDWARE_COMPONENT_TYPE__CONNECTOR;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_COMPONENT__PORT = HARDWARE_COMPONENT_TYPE__PORT;

	/**
	 * The feature id for the '<em><b>Port Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_COMPONENT__PORT_CONNECTOR = HARDWARE_COMPONENT_TYPE__PORT_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_COMPONENT__IS_ACTIVE = HARDWARE_COMPONENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Electrical Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_COMPONENT_FEATURE_COUNT = HARDWARE_COMPONENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.AllocationTargetImpl <em>Allocation Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.AllocationTargetImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getAllocationTarget()
	 * @generated
	 */
	int ALLOCATION_TARGET = 40;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_TARGET__GSHORT_NAME = EA_ELEMENT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_TARGET__SHORT_NAME = EA_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_TARGET__CATEGORY = EA_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_TARGET__UUID = EA_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_TARGET__NAME = EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_TARGET__OWNED_COMMENT = EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The number of structural features of the '<em>Allocation Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_TARGET_FEATURE_COUNT = EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.HardwareComponentPrototypeImpl <em>Hardware Component Prototype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.HardwareComponentPrototypeImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getHardwareComponentPrototype()
	 * @generated
	 */
	int HARDWARE_COMPONENT_PROTOTYPE = 28;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPONENT_PROTOTYPE__GSHORT_NAME = ALLOCATION_TARGET__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPONENT_PROTOTYPE__SHORT_NAME = ALLOCATION_TARGET__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPONENT_PROTOTYPE__CATEGORY = ALLOCATION_TARGET__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPONENT_PROTOTYPE__UUID = ALLOCATION_TARGET__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPONENT_PROTOTYPE__NAME = ALLOCATION_TARGET__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPONENT_PROTOTYPE__OWNED_COMMENT = ALLOCATION_TARGET__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPONENT_PROTOTYPE__TYPE = ALLOCATION_TARGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hardware Component Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_COMPONENT_PROTOTYPE_FEATURE_COUNT = ALLOCATION_TARGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.HardwareConnectorImpl <em>Hardware Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.HardwareConnectorImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getHardwareConnector()
	 * @generated
	 */
	int HARDWARE_CONNECTOR = 30;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CONNECTOR__GSHORT_NAME = EA_ELEMENT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CONNECTOR__SHORT_NAME = EA_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CONNECTOR__CATEGORY = EA_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CONNECTOR__UUID = EA_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CONNECTOR__NAME = EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CONNECTOR__OWNED_COMMENT = EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CONNECTOR__PORT = EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hardware Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CONNECTOR_FEATURE_COUNT = EA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.EAPortImpl <em>EA Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.EAPortImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getEAPort()
	 * @generated
	 */
	int EA_PORT = 49;

	/**
	 * The number of structural features of the '<em>EA Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PORT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.HardwarePortImpl <em>Hardware Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.HardwarePortImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getHardwarePort()
	 * @generated
	 */
	int HARDWARE_PORT = 32;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT__GSHORT_NAME = EA_PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT__SHORT_NAME = EA_PORT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT__CATEGORY = EA_PORT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT__UUID = EA_PORT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT__NAME = EA_PORT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT__OWNED_COMMENT = EA_PORT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Shield</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT__IS_SHIELD = EA_PORT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Contained Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT__CONTAINED_PIN = EA_PORT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Contained Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT__CONTAINED_PORT = EA_PORT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Referenced Pin</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT__REFERENCED_PIN = EA_PORT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Hardware Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT_FEATURE_COUNT = EA_PORT_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.EAConnectorImpl <em>EA Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.EAConnectorImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getEAConnector()
	 * @generated
	 */
	int EA_CONNECTOR = 45;

	/**
	 * The number of structural features of the '<em>EA Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_CONNECTOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.HardwarePortConnectorImpl <em>Hardware Port Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.HardwarePortConnectorImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getHardwarePortConnector()
	 * @generated
	 */
	int HARDWARE_PORT_CONNECTOR = 33;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT_CONNECTOR__GSHORT_NAME = EA_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT_CONNECTOR__SHORT_NAME = EA_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT_CONNECTOR__CATEGORY = EA_CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT_CONNECTOR__UUID = EA_CONNECTOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT_CONNECTOR__NAME = EA_CONNECTOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT_CONNECTOR__OWNED_COMMENT = EA_CONNECTOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT_CONNECTOR__PORT = EA_CONNECTOR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT_CONNECTOR__CONNECTOR = EA_CONNECTOR_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Hardware Port Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT_CONNECTOR_FEATURE_COUNT = EA_CONNECTOR_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.IOHardwarePinImpl <em>IO Hardware Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.IOHardwarePinImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getIOHardwarePin()
	 * @generated
	 */
	int IO_HARDWARE_PIN = 34;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_HARDWARE_PIN__GSHORT_NAME = HARDWARE_PIN__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_HARDWARE_PIN__SHORT_NAME = HARDWARE_PIN__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_HARDWARE_PIN__CATEGORY = HARDWARE_PIN__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_HARDWARE_PIN__UUID = HARDWARE_PIN__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_HARDWARE_PIN__NAME = HARDWARE_PIN__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_HARDWARE_PIN__OWNED_COMMENT = HARDWARE_PIN__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_HARDWARE_PIN__DIRECTION = HARDWARE_PIN__DIRECTION;

	/**
	 * The feature id for the '<em><b>Is Ground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_HARDWARE_PIN__IS_GROUND = HARDWARE_PIN__IS_GROUND;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_HARDWARE_PIN__KIND = HARDWARE_PIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IO Hardware Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_HARDWARE_PIN_FEATURE_COUNT = HARDWARE_PIN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.LogicalPortConnectorImpl <em>Logical Port Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.LogicalPortConnectorImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getLogicalPortConnector()
	 * @generated
	 */
	int LOGICAL_PORT_CONNECTOR = 35;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_PORT_CONNECTOR__GSHORT_NAME = EA_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_PORT_CONNECTOR__SHORT_NAME = EA_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_PORT_CONNECTOR__CATEGORY = EA_CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_PORT_CONNECTOR__UUID = EA_CONNECTOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_PORT_CONNECTOR__NAME = EA_CONNECTOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_PORT_CONNECTOR__OWNED_COMMENT = EA_CONNECTOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_PORT_CONNECTOR__PORT = EA_CONNECTOR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_PORT_CONNECTOR__KIND = EA_CONNECTOR_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Bus Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_PORT_CONNECTOR__BUS_SPEED = EA_CONNECTOR_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Logical Port Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_PORT_CONNECTOR_FEATURE_COUNT = EA_CONNECTOR_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.NodeImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getNode()
	 * @generated
	 */
	int NODE = 36;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__GSHORT_NAME = HARDWARE_COMPONENT_TYPE__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SHORT_NAME = HARDWARE_COMPONENT_TYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CATEGORY = HARDWARE_COMPONENT_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__UUID = HARDWARE_COMPONENT_TYPE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = HARDWARE_COMPONENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OWNED_COMMENT = HARDWARE_COMPONENT_TYPE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__GEA_PACKAGE_ELEMENT = HARDWARE_COMPONENT_TYPE__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EA_PACKAGE_ELEMENT = HARDWARE_COMPONENT_TYPE__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Traceable Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TRACEABLE_SPECIFICATION = HARDWARE_COMPONENT_TYPE__TRACEABLE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OWNED_RELATIONSHIP = HARDWARE_COMPONENT_TYPE__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PIN = HARDWARE_COMPONENT_TYPE__PIN;

	/**
	 * The feature id for the '<em><b>Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PART = HARDWARE_COMPONENT_TYPE__PART;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CONNECTOR = HARDWARE_COMPONENT_TYPE__CONNECTOR;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PORT = HARDWARE_COMPONENT_TYPE__PORT;

	/**
	 * The feature id for the '<em><b>Port Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PORT_CONNECTOR = HARDWARE_COMPONENT_TYPE__PORT_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Execution Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EXECUTION_RATE = HARDWARE_COMPONENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = HARDWARE_COMPONENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.PortConnectorImpl <em>Port Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.PortConnectorImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getPortConnector()
	 * @generated
	 */
	int PORT_CONNECTOR = 37;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR__GSHORT_NAME = EA_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR__SHORT_NAME = EA_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR__CATEGORY = EA_CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR__UUID = EA_CONNECTOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR__NAME = EA_CONNECTOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR__OWNED_COMMENT = EA_CONNECTOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR__PORT = EA_CONNECTOR_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Port Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTOR_FEATURE_COUNT = EA_CONNECTOR_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.PowerHardwarePinImpl <em>Power Hardware Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.PowerHardwarePinImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getPowerHardwarePin()
	 * @generated
	 */
	int POWER_HARDWARE_PIN = 38;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_HARDWARE_PIN__GSHORT_NAME = HARDWARE_PIN__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_HARDWARE_PIN__SHORT_NAME = HARDWARE_PIN__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_HARDWARE_PIN__CATEGORY = HARDWARE_PIN__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_HARDWARE_PIN__UUID = HARDWARE_PIN__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_HARDWARE_PIN__NAME = HARDWARE_PIN__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_HARDWARE_PIN__OWNED_COMMENT = HARDWARE_PIN__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_HARDWARE_PIN__DIRECTION = HARDWARE_PIN__DIRECTION;

	/**
	 * The feature id for the '<em><b>Is Ground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_HARDWARE_PIN__IS_GROUND = HARDWARE_PIN__IS_GROUND;

	/**
	 * The number of structural features of the '<em>Power Hardware Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_HARDWARE_PIN_FEATURE_COUNT = HARDWARE_PIN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.SensorImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 39;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__GSHORT_NAME = HARDWARE_COMPONENT_TYPE__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__SHORT_NAME = HARDWARE_COMPONENT_TYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__CATEGORY = HARDWARE_COMPONENT_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__UUID = HARDWARE_COMPONENT_TYPE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = HARDWARE_COMPONENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__OWNED_COMMENT = HARDWARE_COMPONENT_TYPE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__GEA_PACKAGE_ELEMENT = HARDWARE_COMPONENT_TYPE__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__EA_PACKAGE_ELEMENT = HARDWARE_COMPONENT_TYPE__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Traceable Specification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__TRACEABLE_SPECIFICATION = HARDWARE_COMPONENT_TYPE__TRACEABLE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__OWNED_RELATIONSHIP = HARDWARE_COMPONENT_TYPE__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__PIN = HARDWARE_COMPONENT_TYPE__PIN;

	/**
	 * The feature id for the '<em><b>Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__PART = HARDWARE_COMPONENT_TYPE__PART;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__CONNECTOR = HARDWARE_COMPONENT_TYPE__CONNECTOR;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__PORT = HARDWARE_COMPONENT_TYPE__PORT;

	/**
	 * The feature id for the '<em><b>Port Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__PORT_CONNECTOR = HARDWARE_COMPONENT_TYPE__PORT_CONNECTOR;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = HARDWARE_COMPONENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.HardwareConnector_portImpl <em>Hardware Connector port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.HardwareConnector_portImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getHardwareConnector_port()
	 * @generated
	 */
	int HARDWARE_CONNECTOR_PORT = 41;

	/**
	 * The feature id for the '<em><b>Hardware Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CONNECTOR_PORT__HARDWARE_PIN = 0;

	/**
	 * The feature id for the '<em><b>Hardware Component Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CONNECTOR_PORT__HARDWARE_COMPONENT_PROTOTYPE = 1;

	/**
	 * The number of structural features of the '<em>Hardware Connector port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CONNECTOR_PORT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.HardwarePortConnector_portImpl <em>Hardware Port Connector port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.HardwarePortConnector_portImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getHardwarePortConnector_port()
	 * @generated
	 */
	int HARDWARE_PORT_CONNECTOR_PORT = 42;

	/**
	 * The feature id for the '<em><b>Hardware Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT_CONNECTOR_PORT__HARDWARE_PORT = 0;

	/**
	 * The feature id for the '<em><b>Hardware Component Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT_CONNECTOR_PORT__HARDWARE_COMPONENT_PROTOTYPE = 1;

	/**
	 * The number of structural features of the '<em>Hardware Port Connector port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT_CONNECTOR_PORT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.CommentImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 43;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__BODY = 0;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.EAPackageImpl <em>EA Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.EAPackageImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getEAPackage()
	 * @generated
	 */
	int EA_PACKAGE = 47;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGE__GSHORT_NAME = EA_ELEMENT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGE__SHORT_NAME = EA_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGE__CATEGORY = EA_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGE__UUID = EA_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGE__NAME = EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGE__OWNED_COMMENT = EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GElement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGE__GELEMENT = EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>GSub Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGE__GSUB_PACKAGE = EA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sub Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGE__SUB_PACKAGE = EA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGE__ELEMENT = EA_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>EA Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_PACKAGE_FEATURE_COUNT = EA_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.EATypeImpl <em>EA Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.EATypeImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getEAType()
	 * @generated
	 */
	int EA_TYPE = 51;

	/**
	 * The number of structural features of the '<em>EA Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.EAXMLImpl <em>EAXML</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.EAXMLImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getEAXML()
	 * @generated
	 */
	int EAXML = 52;

	/**
	 * The feature id for the '<em><b>GTop Level Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAXML__GTOP_LEVEL_PACKAGE = GelementsPackage.GEAXML__GTOP_LEVEL_PACKAGE;

	/**
	 * The feature id for the '<em><b>Top Level Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAXML__TOP_LEVEL_PACKAGE = GelementsPackage.GEAXML_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EAXML</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAXML_FEATURE_COUNT = GelementsPackage.GEAXML_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.RationaleImpl <em>Rationale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.RationaleImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getRationale()
	 * @generated
	 */
	int RATIONALE = 53;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALE__BODY = COMMENT__BODY;

	/**
	 * The number of structural features of the '<em>Rationale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALE_FEATURE_COUNT = COMMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.RelationshipImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 56;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__GSHORT_NAME = EA_ELEMENT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__SHORT_NAME = EA_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__CATEGORY = EA_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__UUID = EA_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__NAME = EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__OWNED_COMMENT = EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.RealizationImpl <em>Realization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.RealizationImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getRealization()
	 * @generated
	 */
	int REALIZATION = 54;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__GSHORT_NAME = RELATIONSHIP__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__SHORT_NAME = RELATIONSHIP__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__CATEGORY = RELATIONSHIP__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__UUID = RELATIONSHIP__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__NAME = RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__OWNED_COMMENT = RELATIONSHIP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Realized</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__REALIZED = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realized By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__REALIZED_BY = RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Realization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.Realization_realizedImpl <em>Realization realized</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.Realization_realizedImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getRealization_realized()
	 * @generated
	 */
	int REALIZATION_REALIZED = 59;

	/**
	 * The feature id for the '<em><b>Identifiable target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION_REALIZED__IDENTIFIABLE_TARGET = 0;

	/**
	 * The feature id for the '<em><b>Identifiable context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION_REALIZED__IDENTIFIABLE_CONTEXT = 1;

	/**
	 * The number of structural features of the '<em>Realization realized</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION_REALIZED_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.Realization_realizedByImpl <em>Realization realized By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.Realization_realizedByImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getRealization_realizedBy()
	 * @generated
	 */
	int REALIZATION_REALIZED_BY = 60;

	/**
	 * The feature id for the '<em><b>Identifiable target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION_REALIZED_BY__IDENTIFIABLE_TARGET = 0;

	/**
	 * The feature id for the '<em><b>Identifiable context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION_REALIZED_BY__IDENTIFIABLE_CONTEXT = 1;

	/**
	 * The number of structural features of the '<em>Realization realized By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION_REALIZED_BY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.EADatatypeImpl <em>EA Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.EADatatypeImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getEADatatype()
	 * @generated
	 */
	int EA_DATATYPE = 64;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE__GSHORT_NAME = TRACEABLE_SPECIFICATION__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE__SHORT_NAME = TRACEABLE_SPECIFICATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE__CATEGORY = TRACEABLE_SPECIFICATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE__UUID = TRACEABLE_SPECIFICATION__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE__NAME = TRACEABLE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE__OWNED_COMMENT = TRACEABLE_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE__GEA_PACKAGE_ELEMENT = TRACEABLE_SPECIFICATION__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE__EA_PACKAGE_ELEMENT = TRACEABLE_SPECIFICATION__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE__TEXT = TRACEABLE_SPECIFICATION__TEXT;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE__URI = TRACEABLE_SPECIFICATION__URI;

	/**
	 * The number of structural features of the '<em>EA Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE_FEATURE_COUNT = TRACEABLE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.ArrayDatatypeImpl <em>Array Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.ArrayDatatypeImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getArrayDatatype()
	 * @generated
	 */
	int ARRAY_DATATYPE = 61;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DATATYPE__GSHORT_NAME = EA_DATATYPE__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DATATYPE__SHORT_NAME = EA_DATATYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DATATYPE__CATEGORY = EA_DATATYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DATATYPE__UUID = EA_DATATYPE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DATATYPE__NAME = EA_DATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DATATYPE__OWNED_COMMENT = EA_DATATYPE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DATATYPE__GEA_PACKAGE_ELEMENT = EA_DATATYPE__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DATATYPE__EA_PACKAGE_ELEMENT = EA_DATATYPE__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DATATYPE__TEXT = EA_DATATYPE__TEXT;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DATATYPE__URI = EA_DATATYPE__URI;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DATATYPE__MAX_LENGTH = EA_DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DATATYPE__MIN_LENGTH = EA_DATATYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DATATYPE__ELEMENT_TYPE = EA_DATATYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Array Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DATATYPE_FEATURE_COUNT = EA_DATATYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.CompositeDatatypeImpl <em>Composite Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.CompositeDatatypeImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getCompositeDatatype()
	 * @generated
	 */
	int COMPOSITE_DATATYPE = 62;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATATYPE__GSHORT_NAME = EA_DATATYPE__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATATYPE__SHORT_NAME = EA_DATATYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATATYPE__CATEGORY = EA_DATATYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATATYPE__UUID = EA_DATATYPE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATATYPE__NAME = EA_DATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATATYPE__OWNED_COMMENT = EA_DATATYPE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATATYPE__GEA_PACKAGE_ELEMENT = EA_DATATYPE__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATATYPE__EA_PACKAGE_ELEMENT = EA_DATATYPE__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATATYPE__TEXT = EA_DATATYPE__TEXT;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATATYPE__URI = EA_DATATYPE__URI;

	/**
	 * The feature id for the '<em><b>Datatype Prototype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATATYPE__DATATYPE_PROTOTYPE = EA_DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DATATYPE_FEATURE_COUNT = EA_DATATYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.EABooleanImpl <em>EA Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.EABooleanImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getEABoolean()
	 * @generated
	 */
	int EA_BOOLEAN = 63;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_BOOLEAN__GSHORT_NAME = EA_DATATYPE__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_BOOLEAN__SHORT_NAME = EA_DATATYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_BOOLEAN__CATEGORY = EA_DATATYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_BOOLEAN__UUID = EA_DATATYPE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_BOOLEAN__NAME = EA_DATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_BOOLEAN__OWNED_COMMENT = EA_DATATYPE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_BOOLEAN__GEA_PACKAGE_ELEMENT = EA_DATATYPE__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_BOOLEAN__EA_PACKAGE_ELEMENT = EA_DATATYPE__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_BOOLEAN__TEXT = EA_DATATYPE__TEXT;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_BOOLEAN__URI = EA_DATATYPE__URI;

	/**
	 * The number of structural features of the '<em>EA Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_BOOLEAN_FEATURE_COUNT = EA_DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.EADatatypePrototypeImpl <em>EA Datatype Prototype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.EADatatypePrototypeImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getEADatatypePrototype()
	 * @generated
	 */
	int EA_DATATYPE_PROTOTYPE = 65;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE_PROTOTYPE__GSHORT_NAME = EA_ELEMENT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE_PROTOTYPE__SHORT_NAME = EA_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE_PROTOTYPE__CATEGORY = EA_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE_PROTOTYPE__UUID = EA_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE_PROTOTYPE__NAME = EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE_PROTOTYPE__OWNED_COMMENT = EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE_PROTOTYPE__TYPE = EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EA Datatype Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_DATATYPE_PROTOTYPE_FEATURE_COUNT = EA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.EANumericalImpl <em>EA Numerical</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.EANumericalImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getEANumerical()
	 * @generated
	 */
	int EA_NUMERICAL = 66;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_NUMERICAL__GSHORT_NAME = EA_DATATYPE__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_NUMERICAL__SHORT_NAME = EA_DATATYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_NUMERICAL__CATEGORY = EA_DATATYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_NUMERICAL__UUID = EA_DATATYPE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_NUMERICAL__NAME = EA_DATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_NUMERICAL__OWNED_COMMENT = EA_DATATYPE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_NUMERICAL__GEA_PACKAGE_ELEMENT = EA_DATATYPE__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_NUMERICAL__EA_PACKAGE_ELEMENT = EA_DATATYPE__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_NUMERICAL__TEXT = EA_DATATYPE__TEXT;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_NUMERICAL__URI = EA_DATATYPE__URI;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_NUMERICAL__MAX = EA_DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_NUMERICAL__MIN = EA_DATATYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_NUMERICAL__UNIT = EA_DATATYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EA Numerical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_NUMERICAL_FEATURE_COUNT = EA_DATATYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.EAStringImpl <em>EA String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.EAStringImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getEAString()
	 * @generated
	 */
	int EA_STRING = 67;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STRING__GSHORT_NAME = EA_DATATYPE__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STRING__SHORT_NAME = EA_DATATYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STRING__CATEGORY = EA_DATATYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STRING__UUID = EA_DATATYPE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STRING__NAME = EA_DATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STRING__OWNED_COMMENT = EA_DATATYPE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STRING__GEA_PACKAGE_ELEMENT = EA_DATATYPE__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STRING__EA_PACKAGE_ELEMENT = EA_DATATYPE__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STRING__TEXT = EA_DATATYPE__TEXT;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STRING__URI = EA_DATATYPE__URI;

	/**
	 * The number of structural features of the '<em>EA String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STRING_FEATURE_COUNT = EA_DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.EnumerationImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 68;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__GSHORT_NAME = EA_DATATYPE__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__SHORT_NAME = EA_DATATYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__CATEGORY = EA_DATATYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__UUID = EA_DATATYPE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NAME = EA_DATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__OWNED_COMMENT = EA_DATATYPE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__GEA_PACKAGE_ELEMENT = EA_DATATYPE__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__EA_PACKAGE_ELEMENT = EA_DATATYPE__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__TEXT = EA_DATATYPE__TEXT;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__URI = EA_DATATYPE__URI;

	/**
	 * The feature id for the '<em><b>Is Multi Valued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__IS_MULTI_VALUED = EA_DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__LITERAL = EA_DATATYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = EA_DATATYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.EnumerationLiteralImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getEnumerationLiteral()
	 * @generated
	 */
	int ENUMERATION_LITERAL = 69;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__GSHORT_NAME = EA_ELEMENT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__SHORT_NAME = EA_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__CATEGORY = EA_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__UUID = EA_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__NAME = EA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__OWNED_COMMENT = EA_ELEMENT__OWNED_COMMENT;

	/**
	 * The number of structural features of the '<em>Enumeration Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_FEATURE_COUNT = EA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.QuantityImpl <em>Quantity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.QuantityImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getQuantity()
	 * @generated
	 */
	int QUANTITY = 70;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__GSHORT_NAME = EA_PACKAGEABLE_ELEMENT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__SHORT_NAME = EA_PACKAGEABLE_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__CATEGORY = EA_PACKAGEABLE_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__UUID = EA_PACKAGEABLE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__NAME = EA_PACKAGEABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__OWNED_COMMENT = EA_PACKAGEABLE_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__GEA_PACKAGE_ELEMENT = EA_PACKAGEABLE_ELEMENT__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__EA_PACKAGE_ELEMENT = EA_PACKAGEABLE_ELEMENT__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Amount Of Substance Exp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__AMOUNT_OF_SUBSTANCE_EXP = EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Electric Current Exp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__ELECTRIC_CURRENT_EXP = EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Length Exp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__LENGTH_EXP = EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Luminous Intensity Exp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__LUMINOUS_INTENSITY_EXP = EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mass Exp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__MASS_EXP = EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Thermodynamic Temperature Exp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__THERMODYNAMIC_TEMPERATURE_EXP = EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Time Exp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__TIME_EXP = EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_FEATURE_COUNT = EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.RangeableValueTypeImpl <em>Rangeable Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.RangeableValueTypeImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getRangeableValueType()
	 * @generated
	 */
	int RANGEABLE_VALUE_TYPE = 71;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_VALUE_TYPE__GSHORT_NAME = EA_DATATYPE__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_VALUE_TYPE__SHORT_NAME = EA_DATATYPE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_VALUE_TYPE__CATEGORY = EA_DATATYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_VALUE_TYPE__UUID = EA_DATATYPE__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_VALUE_TYPE__NAME = EA_DATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_VALUE_TYPE__OWNED_COMMENT = EA_DATATYPE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_VALUE_TYPE__GEA_PACKAGE_ELEMENT = EA_DATATYPE__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_VALUE_TYPE__EA_PACKAGE_ELEMENT = EA_DATATYPE__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_VALUE_TYPE__TEXT = EA_DATATYPE__TEXT;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_VALUE_TYPE__URI = EA_DATATYPE__URI;

	/**
	 * The feature id for the '<em><b>Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_VALUE_TYPE__ACCURACY = EA_DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_VALUE_TYPE__RESOLUTION = EA_DATATYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Significant Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_VALUE_TYPE__SIGNIFICANT_DIGITS = EA_DATATYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Base Rangeable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_VALUE_TYPE__BASE_RANGEABLE = EA_DATATYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Rangeable Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGEABLE_VALUE_TYPE_FEATURE_COUNT = EA_DATATYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.UnitImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 72;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__GSHORT_NAME = EA_PACKAGEABLE_ELEMENT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__SHORT_NAME = EA_PACKAGEABLE_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__CATEGORY = EA_PACKAGEABLE_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__UUID = EA_PACKAGEABLE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__NAME = EA_PACKAGEABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__OWNED_COMMENT = EA_PACKAGEABLE_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__GEA_PACKAGE_ELEMENT = EA_PACKAGEABLE_ELEMENT__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__EA_PACKAGE_ELEMENT = EA_PACKAGEABLE_ELEMENT__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__FACTOR = EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__SYMBOL = EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__OFFSET = EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__REFERENCE = EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__QUANTITY = EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_COUNT = EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.EAValueImpl <em>EA Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.EAValueImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getEAValue()
	 * @generated
	 */
	int EA_VALUE = 80;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_VALUE__TYPE = 0;

	/**
	 * The number of structural features of the '<em>EA Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_VALUE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.EAArrayValueImpl <em>EA Array Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.EAArrayValueImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getEAArrayValue()
	 * @generated
	 */
	int EA_ARRAY_VALUE = 73;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ARRAY_VALUE__TYPE = EA_VALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ARRAY_VALUE__VALUE = EA_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EA Array Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ARRAY_VALUE_FEATURE_COUNT = EA_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.EABooleanValueImpl <em>EA Boolean Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.EABooleanValueImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getEABooleanValue()
	 * @generated
	 */
	int EA_BOOLEAN_VALUE = 74;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_BOOLEAN_VALUE__TYPE = EA_VALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_BOOLEAN_VALUE__VALUE = EA_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EA Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_BOOLEAN_VALUE_FEATURE_COUNT = EA_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.EACompositeValueImpl <em>EA Composite Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.EACompositeValueImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getEACompositeValue()
	 * @generated
	 */
	int EA_COMPOSITE_VALUE = 75;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_COMPOSITE_VALUE__TYPE = EA_VALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_COMPOSITE_VALUE__VALUE = EA_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EA Composite Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_COMPOSITE_VALUE_FEATURE_COUNT = EA_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.EAEnumerationValueImpl <em>EA Enumeration Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.EAEnumerationValueImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getEAEnumerationValue()
	 * @generated
	 */
	int EA_ENUMERATION_VALUE = 76;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ENUMERATION_VALUE__TYPE = EA_VALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ENUMERATION_VALUE__VALUE = EA_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EA Enumeration Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_ENUMERATION_VALUE_FEATURE_COUNT = EA_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.EAExpressionImpl <em>EA Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.EAExpressionImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getEAExpression()
	 * @generated
	 */
	int EA_EXPRESSION = 77;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_EXPRESSION__TYPE = EA_VALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_EXPRESSION__VALUE = EA_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EA Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_EXPRESSION_FEATURE_COUNT = EA_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.EANumericalValueImpl <em>EA Numerical Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.EANumericalValueImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getEANumericalValue()
	 * @generated
	 */
	int EA_NUMERICAL_VALUE = 78;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_NUMERICAL_VALUE__TYPE = EA_VALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_NUMERICAL_VALUE__VALUE = EA_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EA Numerical Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_NUMERICAL_VALUE_FEATURE_COUNT = EA_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.EAStringValueImpl <em>EA String Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.EAStringValueImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getEAStringValue()
	 * @generated
	 */
	int EA_STRING_VALUE = 79;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STRING_VALUE__TYPE = EA_VALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STRING_VALUE__VALUE = EA_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EA String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA_STRING_VALUE_FEATURE_COUNT = EA_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.UserAttributeDefinitionImpl <em>User Attribute Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.UserAttributeDefinitionImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getUserAttributeDefinition()
	 * @generated
	 */
	int USER_ATTRIBUTE_DEFINITION = 81;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE_DEFINITION__GSHORT_NAME = EA_PACKAGEABLE_ELEMENT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE_DEFINITION__SHORT_NAME = EA_PACKAGEABLE_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE_DEFINITION__CATEGORY = EA_PACKAGEABLE_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE_DEFINITION__UUID = EA_PACKAGEABLE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE_DEFINITION__NAME = EA_PACKAGEABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE_DEFINITION__OWNED_COMMENT = EA_PACKAGEABLE_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE_DEFINITION__GEA_PACKAGE_ELEMENT = EA_PACKAGEABLE_ELEMENT__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE_DEFINITION__EA_PACKAGE_ELEMENT = EA_PACKAGEABLE_ELEMENT__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE_DEFINITION__DEFAULT_VALUE = EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE_DEFINITION__TYPE = EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>User Attribute Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTE_DEFINITION_FEATURE_COUNT = EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.UserAttributedElementImpl <em>User Attributed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.UserAttributedElementImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getUserAttributedElement()
	 * @generated
	 */
	int USER_ATTRIBUTED_ELEMENT = 82;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTED_ELEMENT__GSHORT_NAME = EA_PACKAGEABLE_ELEMENT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTED_ELEMENT__SHORT_NAME = EA_PACKAGEABLE_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTED_ELEMENT__CATEGORY = EA_PACKAGEABLE_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTED_ELEMENT__UUID = EA_PACKAGEABLE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTED_ELEMENT__NAME = EA_PACKAGEABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTED_ELEMENT__OWNED_COMMENT = EA_PACKAGEABLE_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTED_ELEMENT__GEA_PACKAGE_ELEMENT = EA_PACKAGEABLE_ELEMENT__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTED_ELEMENT__EA_PACKAGE_ELEMENT = EA_PACKAGEABLE_ELEMENT__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Ua Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTED_ELEMENT__UA_VALUE = EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ua Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTED_ELEMENT__UA_TYPE = EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attributed Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTED_ELEMENT__ATTRIBUTED_ELEMENT = EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>User Attributed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ATTRIBUTED_ELEMENT_FEATURE_COUNT = EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.impl.UserElementTypeImpl <em>User Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.impl.UserElementTypeImpl
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getUserElementType()
	 * @generated
	 */
	int USER_ELEMENT_TYPE = 83;

	/**
	 * The feature id for the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ELEMENT_TYPE__GSHORT_NAME = EA_PACKAGEABLE_ELEMENT__GSHORT_NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ELEMENT_TYPE__SHORT_NAME = EA_PACKAGEABLE_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ELEMENT_TYPE__CATEGORY = EA_PACKAGEABLE_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ELEMENT_TYPE__UUID = EA_PACKAGEABLE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ELEMENT_TYPE__NAME = EA_PACKAGEABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ELEMENT_TYPE__OWNED_COMMENT = EA_PACKAGEABLE_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ELEMENT_TYPE__GEA_PACKAGE_ELEMENT = EA_PACKAGEABLE_ELEMENT__GEA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>EA Package element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ELEMENT_TYPE__EA_PACKAGE_ELEMENT = EA_PACKAGEABLE_ELEMENT__EA_PACKAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Valid For</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ELEMENT_TYPE__VALID_FOR = EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ELEMENT_TYPE__KEY = EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ua Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ELEMENT_TYPE__UA_DEFINITION = EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>User Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ELEMENT_TYPE_FEATURE_COUNT = EA_PACKAGEABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.ClientServerKind <em>Client Server Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.ClientServerKind
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getClientServerKind()
	 * @generated
	 */
	int CLIENT_SERVER_KIND = 84;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.EADirectionKind <em>EA Direction Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.EADirectionKind
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getEADirectionKind()
	 * @generated
	 */
	int EA_DIRECTION_KIND = 85;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.HardwareBusKind <em>Hardware Bus Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.HardwareBusKind
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getHardwareBusKind()
	 * @generated
	 */
	int HARDWARE_BUS_KIND = 86;

	/**
	 * The meta object id for the '{@link org.eclipse.eatop.eastadl21.IOHardwarePinKind <em>IO Hardware Pin Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eatop.eastadl21.IOHardwarePinKind
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getIOHardwarePinKind()
	 * @generated
	 */
	int IO_HARDWARE_PIN_KIND = 87;

	/**
	 * The meta object id for the '<em>Boolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 88;

	/**
	 * The meta object id for the '<em>Float</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getFloat()
	 * @generated
	 */
	int FLOAT = 89;

	/**
	 * The meta object id for the '<em>Identifier</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getIdentifier()
	 * @generated
	 */
	int IDENTIFIER = 90;

	/**
	 * The meta object id for the '<em>Integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 91;

	/**
	 * The meta object id for the '<em>Numerical</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getNumerical()
	 * @generated
	 */
	int NUMERICAL = 92;

	/**
	 * The meta object id for the '<em>Ref</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getRef()
	 * @generated
	 */
	int REF = 93;

	/**
	 * The meta object id for the '<em>String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getString()
	 * @generated
	 */
	int STRING = 94;


	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.DesignLevel <em>Design Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Design Level</em>'.
	 * @see org.eclipse.eatop.eastadl21.DesignLevel
	 * @generated
	 */
	EClass getDesignLevel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eatop.eastadl21.DesignLevel#getAllocation <em>Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Allocation</em>'.
	 * @see org.eclipse.eatop.eastadl21.DesignLevel#getAllocation()
	 * @see #getDesignLevel()
	 * @generated
	 */
	EReference getDesignLevel_Allocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eatop.eastadl21.DesignLevel#getFunctionalDesignArchitecture <em>Functional Design Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Functional Design Architecture</em>'.
	 * @see org.eclipse.eatop.eastadl21.DesignLevel#getFunctionalDesignArchitecture()
	 * @see #getDesignLevel()
	 * @generated
	 */
	EReference getDesignLevel_FunctionalDesignArchitecture();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eatop.eastadl21.DesignLevel#getHardwareDesignArchitecture <em>Hardware Design Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hardware Design Architecture</em>'.
	 * @see org.eclipse.eatop.eastadl21.DesignLevel#getHardwareDesignArchitecture()
	 * @see #getDesignLevel()
	 * @generated
	 */
	EReference getDesignLevel_HardwareDesignArchitecture();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.AllocateableElement <em>Allocateable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocateable Element</em>'.
	 * @see org.eclipse.eatop.eastadl21.AllocateableElement
	 * @generated
	 */
	EClass getAllocateableElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.Allocation <em>Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocation</em>'.
	 * @see org.eclipse.eatop.eastadl21.Allocation
	 * @generated
	 */
	EClass getAllocation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eatop.eastadl21.Allocation#getFunctionAllocation <em>Function Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function Allocation</em>'.
	 * @see org.eclipse.eatop.eastadl21.Allocation#getFunctionAllocation()
	 * @see #getAllocation()
	 * @generated
	 */
	EReference getAllocation_FunctionAllocation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.AnalysisFunctionPrototype <em>Analysis Function Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analysis Function Prototype</em>'.
	 * @see org.eclipse.eatop.eastadl21.AnalysisFunctionPrototype
	 * @generated
	 */
	EClass getAnalysisFunctionPrototype();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.eatop.eastadl21.AnalysisFunctionPrototype#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.eatop.eastadl21.AnalysisFunctionPrototype#getType()
	 * @see #getAnalysisFunctionPrototype()
	 * @generated
	 */
	EReference getAnalysisFunctionPrototype_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.AnalysisFunctionType <em>Analysis Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analysis Function Type</em>'.
	 * @see org.eclipse.eatop.eastadl21.AnalysisFunctionType
	 * @generated
	 */
	EClass getAnalysisFunctionType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eatop.eastadl21.AnalysisFunctionType#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Part</em>'.
	 * @see org.eclipse.eatop.eastadl21.AnalysisFunctionType#getPart()
	 * @see #getAnalysisFunctionType()
	 * @generated
	 */
	EReference getAnalysisFunctionType_Part();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.BasicSoftwareFunctionType <em>Basic Software Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Software Function Type</em>'.
	 * @see org.eclipse.eatop.eastadl21.BasicSoftwareFunctionType
	 * @generated
	 */
	EClass getBasicSoftwareFunctionType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.DesignFunctionPrototype <em>Design Function Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Design Function Prototype</em>'.
	 * @see org.eclipse.eatop.eastadl21.DesignFunctionPrototype
	 * @generated
	 */
	EClass getDesignFunctionPrototype();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.eatop.eastadl21.DesignFunctionPrototype#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.eatop.eastadl21.DesignFunctionPrototype#getType()
	 * @see #getDesignFunctionPrototype()
	 * @generated
	 */
	EReference getDesignFunctionPrototype_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.DesignFunctionType <em>Design Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Design Function Type</em>'.
	 * @see org.eclipse.eatop.eastadl21.DesignFunctionType
	 * @generated
	 */
	EClass getDesignFunctionType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eatop.eastadl21.DesignFunctionType#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Part</em>'.
	 * @see org.eclipse.eatop.eastadl21.DesignFunctionType#getPart()
	 * @see #getDesignFunctionType()
	 * @generated
	 */
	EReference getDesignFunctionType_Part();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.FunctionalDevice <em>Functional Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Device</em>'.
	 * @see org.eclipse.eatop.eastadl21.FunctionalDevice
	 * @generated
	 */
	EClass getFunctionalDevice();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.FunctionAllocation <em>Function Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Allocation</em>'.
	 * @see org.eclipse.eatop.eastadl21.FunctionAllocation
	 * @generated
	 */
	EClass getFunctionAllocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eatop.eastadl21.FunctionAllocation#getAllocatedElement <em>Allocated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Allocated Element</em>'.
	 * @see org.eclipse.eatop.eastadl21.FunctionAllocation#getAllocatedElement()
	 * @see #getFunctionAllocation()
	 * @generated
	 */
	EReference getFunctionAllocation_AllocatedElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eatop.eastadl21.FunctionAllocation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.eclipse.eatop.eastadl21.FunctionAllocation#getTarget()
	 * @see #getFunctionAllocation()
	 * @generated
	 */
	EReference getFunctionAllocation_Target();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.FunctionClientServerInterface <em>Function Client Server Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Client Server Interface</em>'.
	 * @see org.eclipse.eatop.eastadl21.FunctionClientServerInterface
	 * @generated
	 */
	EClass getFunctionClientServerInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eatop.eastadl21.FunctionClientServerInterface#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see org.eclipse.eatop.eastadl21.FunctionClientServerInterface#getOperation()
	 * @see #getFunctionClientServerInterface()
	 * @generated
	 */
	EReference getFunctionClientServerInterface_Operation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.FunctionClientServerPort <em>Function Client Server Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Client Server Port</em>'.
	 * @see org.eclipse.eatop.eastadl21.FunctionClientServerPort
	 * @generated
	 */
	EClass getFunctionClientServerPort();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eatop.eastadl21.FunctionClientServerPort#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.eclipse.eatop.eastadl21.FunctionClientServerPort#getKind()
	 * @see #getFunctionClientServerPort()
	 * @generated
	 */
	EAttribute getFunctionClientServerPort_Kind();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.eatop.eastadl21.FunctionClientServerPort#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.eatop.eastadl21.FunctionClientServerPort#getType()
	 * @see #getFunctionClientServerPort()
	 * @generated
	 */
	EReference getFunctionClientServerPort_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.FunctionConnector <em>Function Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Connector</em>'.
	 * @see org.eclipse.eatop.eastadl21.FunctionConnector
	 * @generated
	 */
	EClass getFunctionConnector();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eatop.eastadl21.FunctionConnector#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see org.eclipse.eatop.eastadl21.FunctionConnector#getPort()
	 * @see #getFunctionConnector()
	 * @generated
	 */
	EReference getFunctionConnector_Port();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.FunctionFlowPort <em>Function Flow Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Flow Port</em>'.
	 * @see org.eclipse.eatop.eastadl21.FunctionFlowPort
	 * @generated
	 */
	EClass getFunctionFlowPort();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eatop.eastadl21.FunctionFlowPort#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.eclipse.eatop.eastadl21.FunctionFlowPort#getDirection()
	 * @see #getFunctionFlowPort()
	 * @generated
	 */
	EAttribute getFunctionFlowPort_Direction();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.eatop.eastadl21.FunctionFlowPort#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.eatop.eastadl21.FunctionFlowPort#getType()
	 * @see #getFunctionFlowPort()
	 * @generated
	 */
	EReference getFunctionFlowPort_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eatop.eastadl21.FunctionFlowPort#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see org.eclipse.eatop.eastadl21.FunctionFlowPort#getDefaultValue()
	 * @see #getFunctionFlowPort()
	 * @generated
	 */
	EReference getFunctionFlowPort_DefaultValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.FunctionPort <em>Function Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Port</em>'.
	 * @see org.eclipse.eatop.eastadl21.FunctionPort
	 * @generated
	 */
	EClass getFunctionPort();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.FunctionPowerPort <em>Function Power Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Power Port</em>'.
	 * @see org.eclipse.eatop.eastadl21.FunctionPowerPort
	 * @generated
	 */
	EClass getFunctionPowerPort();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.eatop.eastadl21.FunctionPowerPort#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.eatop.eastadl21.FunctionPowerPort#getType()
	 * @see #getFunctionPowerPort()
	 * @generated
	 */
	EReference getFunctionPowerPort_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.FunctionPrototype <em>Function Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Prototype</em>'.
	 * @see org.eclipse.eatop.eastadl21.FunctionPrototype
	 * @generated
	 */
	EClass getFunctionPrototype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.FunctionType <em>Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Type</em>'.
	 * @see org.eclipse.eatop.eastadl21.FunctionType
	 * @generated
	 */
	EClass getFunctionType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eatop.eastadl21.FunctionType#getIsElementary <em>Is Elementary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Elementary</em>'.
	 * @see org.eclipse.eatop.eastadl21.FunctionType#getIsElementary()
	 * @see #getFunctionType()
	 * @generated
	 */
	EAttribute getFunctionType_IsElementary();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eatop.eastadl21.FunctionType#getPortGroup <em>Port Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port Group</em>'.
	 * @see org.eclipse.eatop.eastadl21.FunctionType#getPortGroup()
	 * @see #getFunctionType()
	 * @generated
	 */
	EReference getFunctionType_PortGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eatop.eastadl21.FunctionType#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connector</em>'.
	 * @see org.eclipse.eatop.eastadl21.FunctionType#getConnector()
	 * @see #getFunctionType()
	 * @generated
	 */
	EReference getFunctionType_Connector();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eatop.eastadl21.FunctionType#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see org.eclipse.eatop.eastadl21.FunctionType#getPort()
	 * @see #getFunctionType()
	 * @generated
	 */
	EReference getFunctionType_Port();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.HardwareFunctionType <em>Hardware Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Function Type</em>'.
	 * @see org.eclipse.eatop.eastadl21.HardwareFunctionType
	 * @generated
	 */
	EClass getHardwareFunctionType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.eatop.eastadl21.HardwareFunctionType#getHardwareComponent <em>Hardware Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hardware Component</em>'.
	 * @see org.eclipse.eatop.eastadl21.HardwareFunctionType#getHardwareComponent()
	 * @see #getHardwareFunctionType()
	 * @generated
	 */
	EReference getHardwareFunctionType_HardwareComponent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.LocalDeviceManager <em>Local Device Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Device Manager</em>'.
	 * @see org.eclipse.eatop.eastadl21.LocalDeviceManager
	 * @generated
	 */
	EClass getLocalDeviceManager();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see org.eclipse.eatop.eastadl21.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eatop.eastadl21.Operation#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see org.eclipse.eatop.eastadl21.Operation#getReturn()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Return();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eatop.eastadl21.Operation#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argument</em>'.
	 * @see org.eclipse.eatop.eastadl21.Operation#getArgument()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Argument();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.PortGroup <em>Port Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Group</em>'.
	 * @see org.eclipse.eatop.eastadl21.PortGroup
	 * @generated
	 */
	EClass getPortGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eatop.eastadl21.PortGroup#getPortGroup <em>Port Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port Group</em>'.
	 * @see org.eclipse.eatop.eastadl21.PortGroup#getPortGroup()
	 * @see #getPortGroup()
	 * @generated
	 */
	EReference getPortGroup_PortGroup();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.eatop.eastadl21.PortGroup#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Port</em>'.
	 * @see org.eclipse.eatop.eastadl21.PortGroup#getPort()
	 * @see #getPortGroup()
	 * @generated
	 */
	EReference getPortGroup_Port();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.FunctionAllocation_allocatedElement <em>Function Allocation allocated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Allocation allocated Element</em>'.
	 * @see org.eclipse.eatop.eastadl21.FunctionAllocation_allocatedElement
	 * @generated
	 */
	EClass getFunctionAllocation_allocatedElement();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.eatop.eastadl21.FunctionAllocation_allocatedElement#getAllocateableElement_context <em>Allocateable Element context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allocateable Element context</em>'.
	 * @see org.eclipse.eatop.eastadl21.FunctionAllocation_allocatedElement#getAllocateableElement_context()
	 * @see #getFunctionAllocation_allocatedElement()
	 * @generated
	 */
	EReference getFunctionAllocation_allocatedElement_AllocateableElement_context();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.eatop.eastadl21.FunctionAllocation_allocatedElement#getAllocateableElement <em>Allocateable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Allocateable Element</em>'.
	 * @see org.eclipse.eatop.eastadl21.FunctionAllocation_allocatedElement#getAllocateableElement()
	 * @see #getFunctionAllocation_allocatedElement()
	 * @generated
	 */
	EReference getFunctionAllocation_allocatedElement_AllocateableElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.FunctionAllocation_target <em>Function Allocation target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Allocation target</em>'.
	 * @see org.eclipse.eatop.eastadl21.FunctionAllocation_target
	 * @generated
	 */
	EClass getFunctionAllocation_target();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.eatop.eastadl21.FunctionAllocation_target#getAllocationTarget_context <em>Allocation Target context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allocation Target context</em>'.
	 * @see org.eclipse.eatop.eastadl21.FunctionAllocation_target#getAllocationTarget_context()
	 * @see #getFunctionAllocation_target()
	 * @generated
	 */
	EReference getFunctionAllocation_target_AllocationTarget_context();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.eatop.eastadl21.FunctionAllocation_target#getAllocationTarget <em>Allocation Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Allocation Target</em>'.
	 * @see org.eclipse.eatop.eastadl21.FunctionAllocation_target#getAllocationTarget()
	 * @see #getFunctionAllocation_target()
	 * @generated
	 */
	EReference getFunctionAllocation_target_AllocationTarget();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.FunctionConnector_port <em>Function Connector port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Connector port</em>'.
	 * @see org.eclipse.eatop.eastadl21.FunctionConnector_port
	 * @generated
	 */
	EClass getFunctionConnector_port();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.eatop.eastadl21.FunctionConnector_port#getFunctionPrototype <em>Function Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function Prototype</em>'.
	 * @see org.eclipse.eatop.eastadl21.FunctionConnector_port#getFunctionPrototype()
	 * @see #getFunctionConnector_port()
	 * @generated
	 */
	EReference getFunctionConnector_port_FunctionPrototype();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.eatop.eastadl21.FunctionConnector_port#getFunctionPort <em>Function Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function Port</em>'.
	 * @see org.eclipse.eatop.eastadl21.FunctionConnector_port#getFunctionPort()
	 * @see #getFunctionConnector_port()
	 * @generated
	 */
	EReference getFunctionConnector_port_FunctionPort();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see org.eclipse.eatop.eastadl21.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.CommunicationHardwarePin <em>Communication Hardware Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Hardware Pin</em>'.
	 * @see org.eclipse.eatop.eastadl21.CommunicationHardwarePin
	 * @generated
	 */
	EClass getCommunicationHardwarePin();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.ElectricalComponent <em>Electrical Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Electrical Component</em>'.
	 * @see org.eclipse.eatop.eastadl21.ElectricalComponent
	 * @generated
	 */
	EClass getElectricalComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eatop.eastadl21.ElectricalComponent#getIsActive <em>Is Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Active</em>'.
	 * @see org.eclipse.eatop.eastadl21.ElectricalComponent#getIsActive()
	 * @see #getElectricalComponent()
	 * @generated
	 */
	EAttribute getElectricalComponent_IsActive();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.HardwareComponentPrototype <em>Hardware Component Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Component Prototype</em>'.
	 * @see org.eclipse.eatop.eastadl21.HardwareComponentPrototype
	 * @generated
	 */
	EClass getHardwareComponentPrototype();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.eatop.eastadl21.HardwareComponentPrototype#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.eatop.eastadl21.HardwareComponentPrototype#getType()
	 * @see #getHardwareComponentPrototype()
	 * @generated
	 */
	EReference getHardwareComponentPrototype_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.HardwareComponentType <em>Hardware Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Component Type</em>'.
	 * @see org.eclipse.eatop.eastadl21.HardwareComponentType
	 * @generated
	 */
	EClass getHardwareComponentType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eatop.eastadl21.HardwareComponentType#getPin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pin</em>'.
	 * @see org.eclipse.eatop.eastadl21.HardwareComponentType#getPin()
	 * @see #getHardwareComponentType()
	 * @generated
	 */
	EReference getHardwareComponentType_Pin();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eatop.eastadl21.HardwareComponentType#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Part</em>'.
	 * @see org.eclipse.eatop.eastadl21.HardwareComponentType#getPart()
	 * @see #getHardwareComponentType()
	 * @generated
	 */
	EReference getHardwareComponentType_Part();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eatop.eastadl21.HardwareComponentType#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connector</em>'.
	 * @see org.eclipse.eatop.eastadl21.HardwareComponentType#getConnector()
	 * @see #getHardwareComponentType()
	 * @generated
	 */
	EReference getHardwareComponentType_Connector();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eatop.eastadl21.HardwareComponentType#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see org.eclipse.eatop.eastadl21.HardwareComponentType#getPort()
	 * @see #getHardwareComponentType()
	 * @generated
	 */
	EReference getHardwareComponentType_Port();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eatop.eastadl21.HardwareComponentType#getPortConnector <em>Port Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port Connector</em>'.
	 * @see org.eclipse.eatop.eastadl21.HardwareComponentType#getPortConnector()
	 * @see #getHardwareComponentType()
	 * @generated
	 */
	EReference getHardwareComponentType_PortConnector();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.HardwareConnector <em>Hardware Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Connector</em>'.
	 * @see org.eclipse.eatop.eastadl21.HardwareConnector
	 * @generated
	 */
	EClass getHardwareConnector();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eatop.eastadl21.HardwareConnector#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see org.eclipse.eatop.eastadl21.HardwareConnector#getPort()
	 * @see #getHardwareConnector()
	 * @generated
	 */
	EReference getHardwareConnector_Port();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.HardwarePin <em>Hardware Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Pin</em>'.
	 * @see org.eclipse.eatop.eastadl21.HardwarePin
	 * @generated
	 */
	EClass getHardwarePin();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eatop.eastadl21.HardwarePin#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.eclipse.eatop.eastadl21.HardwarePin#getDirection()
	 * @see #getHardwarePin()
	 * @generated
	 */
	EAttribute getHardwarePin_Direction();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eatop.eastadl21.HardwarePin#getIsGround <em>Is Ground</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Ground</em>'.
	 * @see org.eclipse.eatop.eastadl21.HardwarePin#getIsGround()
	 * @see #getHardwarePin()
	 * @generated
	 */
	EAttribute getHardwarePin_IsGround();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.HardwarePort <em>Hardware Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Port</em>'.
	 * @see org.eclipse.eatop.eastadl21.HardwarePort
	 * @generated
	 */
	EClass getHardwarePort();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eatop.eastadl21.HardwarePort#getIsShield <em>Is Shield</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Shield</em>'.
	 * @see org.eclipse.eatop.eastadl21.HardwarePort#getIsShield()
	 * @see #getHardwarePort()
	 * @generated
	 */
	EAttribute getHardwarePort_IsShield();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eatop.eastadl21.HardwarePort#getContainedPin <em>Contained Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Pin</em>'.
	 * @see org.eclipse.eatop.eastadl21.HardwarePort#getContainedPin()
	 * @see #getHardwarePort()
	 * @generated
	 */
	EReference getHardwarePort_ContainedPin();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eatop.eastadl21.HardwarePort#getContainedPort <em>Contained Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Port</em>'.
	 * @see org.eclipse.eatop.eastadl21.HardwarePort#getContainedPort()
	 * @see #getHardwarePort()
	 * @generated
	 */
	EReference getHardwarePort_ContainedPort();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.eatop.eastadl21.HardwarePort#getReferencedPin <em>Referenced Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced Pin</em>'.
	 * @see org.eclipse.eatop.eastadl21.HardwarePort#getReferencedPin()
	 * @see #getHardwarePort()
	 * @generated
	 */
	EReference getHardwarePort_ReferencedPin();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.HardwarePortConnector <em>Hardware Port Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Port Connector</em>'.
	 * @see org.eclipse.eatop.eastadl21.HardwarePortConnector
	 * @generated
	 */
	EClass getHardwarePortConnector();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eatop.eastadl21.HardwarePortConnector#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connector</em>'.
	 * @see org.eclipse.eatop.eastadl21.HardwarePortConnector#getConnector()
	 * @see #getHardwarePortConnector()
	 * @generated
	 */
	EReference getHardwarePortConnector_Connector();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.IOHardwarePin <em>IO Hardware Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IO Hardware Pin</em>'.
	 * @see org.eclipse.eatop.eastadl21.IOHardwarePin
	 * @generated
	 */
	EClass getIOHardwarePin();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eatop.eastadl21.IOHardwarePin#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.eclipse.eatop.eastadl21.IOHardwarePin#getKind()
	 * @see #getIOHardwarePin()
	 * @generated
	 */
	EAttribute getIOHardwarePin_Kind();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.LogicalPortConnector <em>Logical Port Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Port Connector</em>'.
	 * @see org.eclipse.eatop.eastadl21.LogicalPortConnector
	 * @generated
	 */
	EClass getLogicalPortConnector();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eatop.eastadl21.LogicalPortConnector#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.eclipse.eatop.eastadl21.LogicalPortConnector#getKind()
	 * @see #getLogicalPortConnector()
	 * @generated
	 */
	EAttribute getLogicalPortConnector_Kind();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eatop.eastadl21.LogicalPortConnector#getBusSpeed <em>Bus Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bus Speed</em>'.
	 * @see org.eclipse.eatop.eastadl21.LogicalPortConnector#getBusSpeed()
	 * @see #getLogicalPortConnector()
	 * @generated
	 */
	EAttribute getLogicalPortConnector_BusSpeed();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.eclipse.eatop.eastadl21.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eatop.eastadl21.Node#getExecutionRate <em>Execution Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Rate</em>'.
	 * @see org.eclipse.eatop.eastadl21.Node#getExecutionRate()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_ExecutionRate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.PortConnector <em>Port Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Connector</em>'.
	 * @see org.eclipse.eatop.eastadl21.PortConnector
	 * @generated
	 */
	EClass getPortConnector();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eatop.eastadl21.PortConnector#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see org.eclipse.eatop.eastadl21.PortConnector#getPort()
	 * @see #getPortConnector()
	 * @generated
	 */
	EReference getPortConnector_Port();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.PowerHardwarePin <em>Power Hardware Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Hardware Pin</em>'.
	 * @see org.eclipse.eatop.eastadl21.PowerHardwarePin
	 * @generated
	 */
	EClass getPowerHardwarePin();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see org.eclipse.eatop.eastadl21.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.AllocationTarget <em>Allocation Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocation Target</em>'.
	 * @see org.eclipse.eatop.eastadl21.AllocationTarget
	 * @generated
	 */
	EClass getAllocationTarget();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.HardwareConnector_port <em>Hardware Connector port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Connector port</em>'.
	 * @see org.eclipse.eatop.eastadl21.HardwareConnector_port
	 * @generated
	 */
	EClass getHardwareConnector_port();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.eatop.eastadl21.HardwareConnector_port#getHardwarePin <em>Hardware Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hardware Pin</em>'.
	 * @see org.eclipse.eatop.eastadl21.HardwareConnector_port#getHardwarePin()
	 * @see #getHardwareConnector_port()
	 * @generated
	 */
	EReference getHardwareConnector_port_HardwarePin();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.eatop.eastadl21.HardwareConnector_port#getHardwareComponentPrototype <em>Hardware Component Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hardware Component Prototype</em>'.
	 * @see org.eclipse.eatop.eastadl21.HardwareConnector_port#getHardwareComponentPrototype()
	 * @see #getHardwareConnector_port()
	 * @generated
	 */
	EReference getHardwareConnector_port_HardwareComponentPrototype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.HardwarePortConnector_port <em>Hardware Port Connector port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Port Connector port</em>'.
	 * @see org.eclipse.eatop.eastadl21.HardwarePortConnector_port
	 * @generated
	 */
	EClass getHardwarePortConnector_port();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.eatop.eastadl21.HardwarePortConnector_port#getHardwarePort <em>Hardware Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hardware Port</em>'.
	 * @see org.eclipse.eatop.eastadl21.HardwarePortConnector_port#getHardwarePort()
	 * @see #getHardwarePortConnector_port()
	 * @generated
	 */
	EReference getHardwarePortConnector_port_HardwarePort();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.eatop.eastadl21.HardwarePortConnector_port#getHardwareComponentPrototype <em>Hardware Component Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hardware Component Prototype</em>'.
	 * @see org.eclipse.eatop.eastadl21.HardwarePortConnector_port#getHardwareComponentPrototype()
	 * @see #getHardwarePortConnector_port()
	 * @generated
	 */
	EReference getHardwarePortConnector_port_HardwareComponentPrototype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see org.eclipse.eatop.eastadl21.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eatop.eastadl21.Comment#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see org.eclipse.eatop.eastadl21.Comment#getBody()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Body();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see org.eclipse.eatop.eastadl21.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.eatop.eastadl21.Context#getTraceableSpecification <em>Traceable Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Traceable Specification</em>'.
	 * @see org.eclipse.eatop.eastadl21.Context#getTraceableSpecification()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_TraceableSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eatop.eastadl21.Context#getOwnedRelationship <em>Owned Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Relationship</em>'.
	 * @see org.eclipse.eatop.eastadl21.Context#getOwnedRelationship()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_OwnedRelationship();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.EAConnector <em>EA Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Connector</em>'.
	 * @see org.eclipse.eatop.eastadl21.EAConnector
	 * @generated
	 */
	EClass getEAConnector();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.EAElement <em>EA Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Element</em>'.
	 * @see org.eclipse.eatop.eastadl21.EAElement
	 * @generated
	 */
	EClass getEAElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eatop.eastadl21.EAElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.eatop.eastadl21.EAElement#getName()
	 * @see #getEAElement()
	 * @generated
	 */
	EAttribute getEAElement_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eatop.eastadl21.EAElement#getOwnedComment <em>Owned Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Comment</em>'.
	 * @see org.eclipse.eatop.eastadl21.EAElement#getOwnedComment()
	 * @see #getEAElement()
	 * @generated
	 */
	EReference getEAElement_OwnedComment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.EAPackage <em>EA Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Package</em>'.
	 * @see org.eclipse.eatop.eastadl21.EAPackage
	 * @generated
	 */
	EClass getEAPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eatop.eastadl21.EAPackage#getSubPackage <em>Sub Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Package</em>'.
	 * @see org.eclipse.eatop.eastadl21.EAPackage#getSubPackage()
	 * @see #getEAPackage()
	 * @generated
	 */
	EReference getEAPackage_SubPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eatop.eastadl21.EAPackage#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see org.eclipse.eatop.eastadl21.EAPackage#getElement()
	 * @see #getEAPackage()
	 * @generated
	 */
	EReference getEAPackage_Element();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.EAPackageableElement <em>EA Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Packageable Element</em>'.
	 * @see org.eclipse.eatop.eastadl21.EAPackageableElement
	 * @generated
	 */
	EClass getEAPackageableElement();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.eatop.eastadl21.EAPackageableElement#getEAPackage_element <em>EA Package element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EA Package element</em>'.
	 * @see org.eclipse.eatop.eastadl21.EAPackageableElement#getEAPackage_element()
	 * @see #getEAPackageableElement()
	 * @generated
	 */
	EReference getEAPackageableElement_EAPackage_element();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.EAPort <em>EA Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Port</em>'.
	 * @see org.eclipse.eatop.eastadl21.EAPort
	 * @generated
	 */
	EClass getEAPort();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.EAPrototype <em>EA Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Prototype</em>'.
	 * @see org.eclipse.eatop.eastadl21.EAPrototype
	 * @generated
	 */
	EClass getEAPrototype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.EAType <em>EA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Type</em>'.
	 * @see org.eclipse.eatop.eastadl21.EAType
	 * @generated
	 */
	EClass getEAType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.EAXML <em>EAXML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EAXML</em>'.
	 * @see org.eclipse.eatop.eastadl21.EAXML
	 * @generated
	 */
	EClass getEAXML();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eatop.eastadl21.EAXML#getTopLevelPackage <em>Top Level Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Top Level Package</em>'.
	 * @see org.eclipse.eatop.eastadl21.EAXML#getTopLevelPackage()
	 * @see #getEAXML()
	 * @generated
	 */
	EReference getEAXML_TopLevelPackage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.Rationale <em>Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rationale</em>'.
	 * @see org.eclipse.eatop.eastadl21.Rationale
	 * @generated
	 */
	EClass getRationale();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.Realization <em>Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realization</em>'.
	 * @see org.eclipse.eatop.eastadl21.Realization
	 * @generated
	 */
	EClass getRealization();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eatop.eastadl21.Realization#getRealized <em>Realized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realized</em>'.
	 * @see org.eclipse.eatop.eastadl21.Realization#getRealized()
	 * @see #getRealization()
	 * @generated
	 */
	EReference getRealization_Realized();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eatop.eastadl21.Realization#getRealizedBy <em>Realized By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realized By</em>'.
	 * @see org.eclipse.eatop.eastadl21.Realization#getRealizedBy()
	 * @see #getRealization()
	 * @generated
	 */
	EReference getRealization_RealizedBy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.Referrable <em>Referrable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referrable</em>'.
	 * @see org.eclipse.eatop.eastadl21.Referrable
	 * @generated
	 */
	EClass getReferrable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eatop.eastadl21.Referrable#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name</em>'.
	 * @see org.eclipse.eatop.eastadl21.Referrable#getShortName()
	 * @see #getReferrable()
	 * @generated
	 */
	EAttribute getReferrable_ShortName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see org.eclipse.eatop.eastadl21.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.TraceableSpecification <em>Traceable Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traceable Specification</em>'.
	 * @see org.eclipse.eatop.eastadl21.TraceableSpecification
	 * @generated
	 */
	EClass getTraceableSpecification();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eatop.eastadl21.TraceableSpecification#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.eatop.eastadl21.TraceableSpecification#getText()
	 * @see #getTraceableSpecification()
	 * @generated
	 */
	EAttribute getTraceableSpecification_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eatop.eastadl21.TraceableSpecification#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.eclipse.eatop.eastadl21.TraceableSpecification#getUri()
	 * @see #getTraceableSpecification()
	 * @generated
	 */
	EAttribute getTraceableSpecification_Uri();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable</em>'.
	 * @see org.eclipse.eatop.eastadl21.Identifiable
	 * @generated
	 */
	EClass getIdentifiable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eatop.eastadl21.Identifiable#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see org.eclipse.eatop.eastadl21.Identifiable#getCategory()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_Category();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eatop.eastadl21.Identifiable#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see org.eclipse.eatop.eastadl21.Identifiable#getUuid()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_Uuid();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.Realization_realized <em>Realization realized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realization realized</em>'.
	 * @see org.eclipse.eatop.eastadl21.Realization_realized
	 * @generated
	 */
	EClass getRealization_realized();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.eatop.eastadl21.Realization_realized#getIdentifiable_target <em>Identifiable target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Identifiable target</em>'.
	 * @see org.eclipse.eatop.eastadl21.Realization_realized#getIdentifiable_target()
	 * @see #getRealization_realized()
	 * @generated
	 */
	EReference getRealization_realized_Identifiable_target();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.eatop.eastadl21.Realization_realized#getIdentifiable_context <em>Identifiable context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Identifiable context</em>'.
	 * @see org.eclipse.eatop.eastadl21.Realization_realized#getIdentifiable_context()
	 * @see #getRealization_realized()
	 * @generated
	 */
	EReference getRealization_realized_Identifiable_context();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.Realization_realizedBy <em>Realization realized By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realization realized By</em>'.
	 * @see org.eclipse.eatop.eastadl21.Realization_realizedBy
	 * @generated
	 */
	EClass getRealization_realizedBy();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.eatop.eastadl21.Realization_realizedBy#getIdentifiable_target <em>Identifiable target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Identifiable target</em>'.
	 * @see org.eclipse.eatop.eastadl21.Realization_realizedBy#getIdentifiable_target()
	 * @see #getRealization_realizedBy()
	 * @generated
	 */
	EReference getRealization_realizedBy_Identifiable_target();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.eatop.eastadl21.Realization_realizedBy#getIdentifiable_context <em>Identifiable context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Identifiable context</em>'.
	 * @see org.eclipse.eatop.eastadl21.Realization_realizedBy#getIdentifiable_context()
	 * @see #getRealization_realizedBy()
	 * @generated
	 */
	EReference getRealization_realizedBy_Identifiable_context();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.ArrayDatatype <em>Array Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Datatype</em>'.
	 * @see org.eclipse.eatop.eastadl21.ArrayDatatype
	 * @generated
	 */
	EClass getArrayDatatype();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eatop.eastadl21.ArrayDatatype#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see org.eclipse.eatop.eastadl21.ArrayDatatype#getMaxLength()
	 * @see #getArrayDatatype()
	 * @generated
	 */
	EAttribute getArrayDatatype_MaxLength();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eatop.eastadl21.ArrayDatatype#getMinLength <em>Min Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Length</em>'.
	 * @see org.eclipse.eatop.eastadl21.ArrayDatatype#getMinLength()
	 * @see #getArrayDatatype()
	 * @generated
	 */
	EAttribute getArrayDatatype_MinLength();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.eatop.eastadl21.ArrayDatatype#getElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element Type</em>'.
	 * @see org.eclipse.eatop.eastadl21.ArrayDatatype#getElementType()
	 * @see #getArrayDatatype()
	 * @generated
	 */
	EReference getArrayDatatype_ElementType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.CompositeDatatype <em>Composite Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Datatype</em>'.
	 * @see org.eclipse.eatop.eastadl21.CompositeDatatype
	 * @generated
	 */
	EClass getCompositeDatatype();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eatop.eastadl21.CompositeDatatype#getDatatypePrototype <em>Datatype Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datatype Prototype</em>'.
	 * @see org.eclipse.eatop.eastadl21.CompositeDatatype#getDatatypePrototype()
	 * @see #getCompositeDatatype()
	 * @generated
	 */
	EReference getCompositeDatatype_DatatypePrototype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.EABoolean <em>EA Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Boolean</em>'.
	 * @see org.eclipse.eatop.eastadl21.EABoolean
	 * @generated
	 */
	EClass getEABoolean();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.EADatatype <em>EA Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Datatype</em>'.
	 * @see org.eclipse.eatop.eastadl21.EADatatype
	 * @generated
	 */
	EClass getEADatatype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.EADatatypePrototype <em>EA Datatype Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Datatype Prototype</em>'.
	 * @see org.eclipse.eatop.eastadl21.EADatatypePrototype
	 * @generated
	 */
	EClass getEADatatypePrototype();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.eatop.eastadl21.EADatatypePrototype#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.eatop.eastadl21.EADatatypePrototype#getType()
	 * @see #getEADatatypePrototype()
	 * @generated
	 */
	EReference getEADatatypePrototype_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.EANumerical <em>EA Numerical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Numerical</em>'.
	 * @see org.eclipse.eatop.eastadl21.EANumerical
	 * @generated
	 */
	EClass getEANumerical();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eatop.eastadl21.EANumerical#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see org.eclipse.eatop.eastadl21.EANumerical#getMax()
	 * @see #getEANumerical()
	 * @generated
	 */
	EAttribute getEANumerical_Max();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eatop.eastadl21.EANumerical#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see org.eclipse.eatop.eastadl21.EANumerical#getMin()
	 * @see #getEANumerical()
	 * @generated
	 */
	EAttribute getEANumerical_Min();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.eatop.eastadl21.EANumerical#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unit</em>'.
	 * @see org.eclipse.eatop.eastadl21.EANumerical#getUnit()
	 * @see #getEANumerical()
	 * @generated
	 */
	EReference getEANumerical_Unit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.EAString <em>EA String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA String</em>'.
	 * @see org.eclipse.eatop.eastadl21.EAString
	 * @generated
	 */
	EClass getEAString();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see org.eclipse.eatop.eastadl21.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eatop.eastadl21.Enumeration#getIsMultiValued <em>Is Multi Valued</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Multi Valued</em>'.
	 * @see org.eclipse.eatop.eastadl21.Enumeration#getIsMultiValued()
	 * @see #getEnumeration()
	 * @generated
	 */
	EAttribute getEnumeration_IsMultiValued();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eatop.eastadl21.Enumeration#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literal</em>'.
	 * @see org.eclipse.eatop.eastadl21.Enumeration#getLiteral()
	 * @see #getEnumeration()
	 * @generated
	 */
	EReference getEnumeration_Literal();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.EnumerationLiteral <em>Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Literal</em>'.
	 * @see org.eclipse.eatop.eastadl21.EnumerationLiteral
	 * @generated
	 */
	EClass getEnumerationLiteral();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity</em>'.
	 * @see org.eclipse.eatop.eastadl21.Quantity
	 * @generated
	 */
	EClass getQuantity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eatop.eastadl21.Quantity#getAmountOfSubstanceExp <em>Amount Of Substance Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount Of Substance Exp</em>'.
	 * @see org.eclipse.eatop.eastadl21.Quantity#getAmountOfSubstanceExp()
	 * @see #getQuantity()
	 * @generated
	 */
	EAttribute getQuantity_AmountOfSubstanceExp();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eatop.eastadl21.Quantity#getElectricCurrentExp <em>Electric Current Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Electric Current Exp</em>'.
	 * @see org.eclipse.eatop.eastadl21.Quantity#getElectricCurrentExp()
	 * @see #getQuantity()
	 * @generated
	 */
	EAttribute getQuantity_ElectricCurrentExp();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eatop.eastadl21.Quantity#getLengthExp <em>Length Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length Exp</em>'.
	 * @see org.eclipse.eatop.eastadl21.Quantity#getLengthExp()
	 * @see #getQuantity()
	 * @generated
	 */
	EAttribute getQuantity_LengthExp();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eatop.eastadl21.Quantity#getLuminousIntensityExp <em>Luminous Intensity Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Luminous Intensity Exp</em>'.
	 * @see org.eclipse.eatop.eastadl21.Quantity#getLuminousIntensityExp()
	 * @see #getQuantity()
	 * @generated
	 */
	EAttribute getQuantity_LuminousIntensityExp();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eatop.eastadl21.Quantity#getMassExp <em>Mass Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mass Exp</em>'.
	 * @see org.eclipse.eatop.eastadl21.Quantity#getMassExp()
	 * @see #getQuantity()
	 * @generated
	 */
	EAttribute getQuantity_MassExp();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eatop.eastadl21.Quantity#getThermodynamicTemperatureExp <em>Thermodynamic Temperature Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thermodynamic Temperature Exp</em>'.
	 * @see org.eclipse.eatop.eastadl21.Quantity#getThermodynamicTemperatureExp()
	 * @see #getQuantity()
	 * @generated
	 */
	EAttribute getQuantity_ThermodynamicTemperatureExp();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eatop.eastadl21.Quantity#getTimeExp <em>Time Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Exp</em>'.
	 * @see org.eclipse.eatop.eastadl21.Quantity#getTimeExp()
	 * @see #getQuantity()
	 * @generated
	 */
	EAttribute getQuantity_TimeExp();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.RangeableValueType <em>Rangeable Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rangeable Value Type</em>'.
	 * @see org.eclipse.eatop.eastadl21.RangeableValueType
	 * @generated
	 */
	EClass getRangeableValueType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eatop.eastadl21.RangeableValueType#getAccuracy <em>Accuracy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accuracy</em>'.
	 * @see org.eclipse.eatop.eastadl21.RangeableValueType#getAccuracy()
	 * @see #getRangeableValueType()
	 * @generated
	 */
	EAttribute getRangeableValueType_Accuracy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eatop.eastadl21.RangeableValueType#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution</em>'.
	 * @see org.eclipse.eatop.eastadl21.RangeableValueType#getResolution()
	 * @see #getRangeableValueType()
	 * @generated
	 */
	EAttribute getRangeableValueType_Resolution();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eatop.eastadl21.RangeableValueType#getSignificantDigits <em>Significant Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Significant Digits</em>'.
	 * @see org.eclipse.eatop.eastadl21.RangeableValueType#getSignificantDigits()
	 * @see #getRangeableValueType()
	 * @generated
	 */
	EAttribute getRangeableValueType_SignificantDigits();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.eatop.eastadl21.RangeableValueType#getBaseRangeable <em>Base Rangeable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Rangeable</em>'.
	 * @see org.eclipse.eatop.eastadl21.RangeableValueType#getBaseRangeable()
	 * @see #getRangeableValueType()
	 * @generated
	 */
	EReference getRangeableValueType_BaseRangeable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see org.eclipse.eatop.eastadl21.Unit
	 * @generated
	 */
	EClass getUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eatop.eastadl21.Unit#getFactor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Factor</em>'.
	 * @see org.eclipse.eatop.eastadl21.Unit#getFactor()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_Factor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eatop.eastadl21.Unit#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see org.eclipse.eatop.eastadl21.Unit#getSymbol()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_Symbol();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eatop.eastadl21.Unit#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see org.eclipse.eatop.eastadl21.Unit#getOffset()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_Offset();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.eatop.eastadl21.Unit#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see org.eclipse.eatop.eastadl21.Unit#getReference()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_Reference();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.eatop.eastadl21.Unit#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quantity</em>'.
	 * @see org.eclipse.eatop.eastadl21.Unit#getQuantity()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_Quantity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.EAArrayValue <em>EA Array Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Array Value</em>'.
	 * @see org.eclipse.eatop.eastadl21.EAArrayValue
	 * @generated
	 */
	EClass getEAArrayValue();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eatop.eastadl21.EAArrayValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see org.eclipse.eatop.eastadl21.EAArrayValue#getValue()
	 * @see #getEAArrayValue()
	 * @generated
	 */
	EReference getEAArrayValue_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.EABooleanValue <em>EA Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Boolean Value</em>'.
	 * @see org.eclipse.eatop.eastadl21.EABooleanValue
	 * @generated
	 */
	EClass getEABooleanValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eatop.eastadl21.EABooleanValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.eatop.eastadl21.EABooleanValue#getValue()
	 * @see #getEABooleanValue()
	 * @generated
	 */
	EAttribute getEABooleanValue_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.EACompositeValue <em>EA Composite Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Composite Value</em>'.
	 * @see org.eclipse.eatop.eastadl21.EACompositeValue
	 * @generated
	 */
	EClass getEACompositeValue();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eatop.eastadl21.EACompositeValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see org.eclipse.eatop.eastadl21.EACompositeValue#getValue()
	 * @see #getEACompositeValue()
	 * @generated
	 */
	EReference getEACompositeValue_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.EAEnumerationValue <em>EA Enumeration Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Enumeration Value</em>'.
	 * @see org.eclipse.eatop.eastadl21.EAEnumerationValue
	 * @generated
	 */
	EClass getEAEnumerationValue();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.eatop.eastadl21.EAEnumerationValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Value</em>'.
	 * @see org.eclipse.eatop.eastadl21.EAEnumerationValue#getValue()
	 * @see #getEAEnumerationValue()
	 * @generated
	 */
	EReference getEAEnumerationValue_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.EAExpression <em>EA Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Expression</em>'.
	 * @see org.eclipse.eatop.eastadl21.EAExpression
	 * @generated
	 */
	EClass getEAExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eatop.eastadl21.EAExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see org.eclipse.eatop.eastadl21.EAExpression#getValue()
	 * @see #getEAExpression()
	 * @generated
	 */
	EReference getEAExpression_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.EANumericalValue <em>EA Numerical Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Numerical Value</em>'.
	 * @see org.eclipse.eatop.eastadl21.EANumericalValue
	 * @generated
	 */
	EClass getEANumericalValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eatop.eastadl21.EANumericalValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.eatop.eastadl21.EANumericalValue#getValue()
	 * @see #getEANumericalValue()
	 * @generated
	 */
	EAttribute getEANumericalValue_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.EAStringValue <em>EA String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA String Value</em>'.
	 * @see org.eclipse.eatop.eastadl21.EAStringValue
	 * @generated
	 */
	EClass getEAStringValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eatop.eastadl21.EAStringValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.eatop.eastadl21.EAStringValue#getValue()
	 * @see #getEAStringValue()
	 * @generated
	 */
	EAttribute getEAStringValue_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.EAValue <em>EA Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA Value</em>'.
	 * @see org.eclipse.eatop.eastadl21.EAValue
	 * @generated
	 */
	EClass getEAValue();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.eatop.eastadl21.EAValue#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.eatop.eastadl21.EAValue#getType()
	 * @see #getEAValue()
	 * @generated
	 */
	EReference getEAValue_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.UserAttributeDefinition <em>User Attribute Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Attribute Definition</em>'.
	 * @see org.eclipse.eatop.eastadl21.UserAttributeDefinition
	 * @generated
	 */
	EClass getUserAttributeDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eatop.eastadl21.UserAttributeDefinition#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see org.eclipse.eatop.eastadl21.UserAttributeDefinition#getDefaultValue()
	 * @see #getUserAttributeDefinition()
	 * @generated
	 */
	EReference getUserAttributeDefinition_DefaultValue();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.eatop.eastadl21.UserAttributeDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.eatop.eastadl21.UserAttributeDefinition#getType()
	 * @see #getUserAttributeDefinition()
	 * @generated
	 */
	EReference getUserAttributeDefinition_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.UserAttributedElement <em>User Attributed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Attributed Element</em>'.
	 * @see org.eclipse.eatop.eastadl21.UserAttributedElement
	 * @generated
	 */
	EClass getUserAttributedElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eatop.eastadl21.UserAttributedElement#getUaValue <em>Ua Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ua Value</em>'.
	 * @see org.eclipse.eatop.eastadl21.UserAttributedElement#getUaValue()
	 * @see #getUserAttributedElement()
	 * @generated
	 */
	EReference getUserAttributedElement_UaValue();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.eatop.eastadl21.UserAttributedElement#getUaType <em>Ua Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ua Type</em>'.
	 * @see org.eclipse.eatop.eastadl21.UserAttributedElement#getUaType()
	 * @see #getUserAttributedElement()
	 * @generated
	 */
	EReference getUserAttributedElement_UaType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.eatop.eastadl21.UserAttributedElement#getAttributedElement <em>Attributed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attributed Element</em>'.
	 * @see org.eclipse.eatop.eastadl21.UserAttributedElement#getAttributedElement()
	 * @see #getUserAttributedElement()
	 * @generated
	 */
	EReference getUserAttributedElement_AttributedElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eatop.eastadl21.UserElementType <em>User Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Element Type</em>'.
	 * @see org.eclipse.eatop.eastadl21.UserElementType
	 * @generated
	 */
	EClass getUserElementType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eatop.eastadl21.UserElementType#getValidFor <em>Valid For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid For</em>'.
	 * @see org.eclipse.eatop.eastadl21.UserElementType#getValidFor()
	 * @see #getUserElementType()
	 * @generated
	 */
	EAttribute getUserElementType_ValidFor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eatop.eastadl21.UserElementType#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.eclipse.eatop.eastadl21.UserElementType#getKey()
	 * @see #getUserElementType()
	 * @generated
	 */
	EAttribute getUserElementType_Key();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eatop.eastadl21.UserElementType#getUaDefinition <em>Ua Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ua Definition</em>'.
	 * @see org.eclipse.eatop.eastadl21.UserElementType#getUaDefinition()
	 * @see #getUserElementType()
	 * @generated
	 */
	EReference getUserElementType_UaDefinition();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.eatop.eastadl21.ClientServerKind <em>Client Server Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Client Server Kind</em>'.
	 * @see org.eclipse.eatop.eastadl21.ClientServerKind
	 * @generated
	 */
	EEnum getClientServerKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.eatop.eastadl21.EADirectionKind <em>EA Direction Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EA Direction Kind</em>'.
	 * @see org.eclipse.eatop.eastadl21.EADirectionKind
	 * @generated
	 */
	EEnum getEADirectionKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.eatop.eastadl21.HardwareBusKind <em>Hardware Bus Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hardware Bus Kind</em>'.
	 * @see org.eclipse.eatop.eastadl21.HardwareBusKind
	 * @generated
	 */
	EEnum getHardwareBusKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.eatop.eastadl21.IOHardwarePinKind <em>IO Hardware Pin Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>IO Hardware Pin Kind</em>'.
	 * @see org.eclipse.eatop.eastadl21.IOHardwarePinKind
	 * @generated
	 */
	EEnum getIOHardwarePinKind();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A Boolean value denotes a logical condition that is either 'true' or 'false'.
     * It can be one of "0", "1", "true", "false"
     * 
     * Original fully qualified name: 
     * <em><b>eastadl21.EAST-ADL.Infrastructure.PrimitiveTypes.Boolean</b></em> 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Boolean</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 *        annotation="MetaData guid='{9365CFD9-2871-41ff-87BF-C275FEACE8C1}' id='286' EA\040name='Boolean'"
	 *        annotation="Stereotype Stereotype='primitive'"
	 *        annotation="TaggedValues xml.xsd.customType='BOOLEAN' xml.xsd.pattern='0|1|true|false' xml.xsd.type='string'"
	 *        extendedMetaData="name='BOOLEAN' pattern='0|1|true|false'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='BOOLEANS' xmlXsdSimpleType='string' xmlCustomSimpleType='true'"
	 * @generated
	 */
	EDataType getBoolean();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * An instance of Float is an element from the set of real numbers. The value must comply with IEEE 754 and is limited to what can be expressed by a 64 bit binary representation.
     * 
     * Original fully qualified name: 
     * <em><b>eastadl21.EAST-ADL.Infrastructure.PrimitiveTypes.Float</b></em> 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Float</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        annotation="MetaData guid='{49898B10-8A94-41e6-BED2-7F1FAF97751A}' id='283' EA\040name='Float'"
	 *        annotation="Stereotype Stereotype='primitive'"
	 *        annotation="TaggedValues xml.xsd.type='double'"
	 *        extendedMetaData="name='FLOAT'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='FLOATS' xmlXsdSimpleType='double' xmlCustomSimpleType='false'"
	 * @generated
	 */
	EDataType getFloat();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * An Identifier is a string with a number of constraints on its appearance, satisfying the requirements typical programming languages define for their Identifiers.
     * 
     * This datatype represents a string, that can be used as a c-Identifier.
     * 
     * It needs to start with a letter, mayconsist of letters, digits and underscore. It must not have two consecutive underscores (to support subsequent name mangling based on "__").
     * 
     * 
     * Original fully qualified name: 
     * <em><b>eastadl21.EAST-ADL.Infrastructure.PrimitiveTypes.Identifier</b></em> 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Identifier</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        annotation="MetaData guid='{4C96DDE8-BF90-4e35-8377-A8F6149ED921}' id='284' EA\040name='Identifier'"
	 *        annotation="Stereotype Stereotype='primitive'"
	 *        annotation="TaggedValues xml.xsd.customType='IDENTIFIER' xml.xsd.maxLength='128' xml.xsd.pattern='[a-zA-Z]([a-zA-Z0-9]|_[a-zA-Z0-9])*_?' xml.xsd.type='string'"
	 *        extendedMetaData="name='IDENTIFIER' pattern='[a-zA-Z]([a-zA-Z0-9]|_[a-zA-Z0-9])*_?'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='IDENTIFIERS' xmlXsdSimpleType='string' xmlCustomSimpleType='true'"
	 * @generated
	 */
	EDataType getIdentifier();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * An instance of Integer is an element in the set of integer numbers ( ..., -2, -1, 0, 1, 2, ...).  
     * 
     * The value can be expressed in decimal, octal, hexadecimal and binary representation. Negative numbers can only be expressed in decimal notation
     * 
     * Range is from -2147483648 and 2147483647. 
     * 
     * 
     * Original fully qualified name: 
     * <em><b>eastadl21.EAST-ADL.Infrastructure.PrimitiveTypes.Integer</b></em> 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Integer</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        annotation="MetaData guid='{AF358DFF-5FE1-4156-8BA0-0797C0B9FA9F}' id='287' EA\040name='Integer'"
	 *        annotation="Stereotype Stereotype='primitive'"
	 *        annotation="TaggedValues xml.xsd.customType='INTEGER' xml.xsd.pattern='[+\\-]?[1-9][0-9]*|0x[0-9a-f]*|0[0-7]*|0b[0-1]*' xml.xsd.type='string'"
	 *        extendedMetaData="name='INTEGER' pattern='[+\\-]?[1-9][0-9]*|0x[0-9a-f]*|0[0-7]*|0b[0-1]*'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='INTEGERS' xmlXsdSimpleType='string' xmlCustomSimpleType='true'"
	 * @generated
	 */
	EDataType getInteger();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Numerical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * This primitive specifies a numerical value. It can be denoted in different formats such as Decimal, Octal, Hexadecimal, Float. See the xsd pattern for details.
     * 
     * 
     * Original fully qualified name: 
     * <em><b>eastadl21.EAST-ADL.Infrastructure.PrimitiveTypes.Numerical</b></em> 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Numerical</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        annotation="MetaData guid='{8F2F332E-18D3-4797-AACC-4F1249E644E6}' id='285' EA\040name='Numerical'"
	 *        annotation="Stereotype Stereotype='primitive'"
	 *        annotation="TaggedValues xml.xsd.customType='NUMERICAL-VALUE' xml.xsd.pattern='(0x[0-9a-f]*)|(0[1-7][0-7]*)|(0b[0-1]*)|([+\\-]?[0-9]+(\\.[0-9]*)?(E([+\\-]?)[0-9]*)?)' xml.xsd.type='string'"
	 *        extendedMetaData="name='NUMERICAL' pattern='(0x[0-9a-f]*)|(0[1-7][0-7]*)|(0b[0-1]*)|([+\\-]?[0-9]+(\\.[0-9]*)?(E([+\\-]?)[0-9]*)?)'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='NUMERICALS' xmlXsdSimpleType='string' xmlCustomSimpleType='true'"
	 * @generated
	 */
	EDataType getNumerical();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * This primitive denotes a name based reference. For detailed syntax see the xsd.pattern.
     * 
     * - first slash (relative or absolute reference) [optional]
     * - Identifier  [required]
     * - a sequence of slashes and Identifiers [optional]
     * 
     * This primitve is used by the metamodel tools to create the references.
     * 
     * Original fully qualified name: 
     * <em><b>eastadl21.EAST-ADL.Infrastructure.PrimitiveTypes.Ref</b></em> 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Ref</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        annotation="MetaData guid='{405E6B24-05A5-4469-B58F-6A005065B3A5}' id='282' EA\040name='Ref'"
	 *        annotation="Stereotype Stereotype='primitive'"
	 *        annotation="TaggedValues xml.xsd.customType='REF' xml.xsd.pattern='/?[a-zA-Z][a-zA-Z0-9_]{0,127}(/[a-zA-Z][a-zA-Z0-9_]{0,127})*' xml.xsd.type='string'"
	 *        extendedMetaData="name='REF' pattern='/?[a-zA-Z][a-zA-Z0-9_]{0,127}(/[a-zA-Z][a-zA-Z0-9_]{0,127})*'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='REFS' xmlXsdSimpleType='string' xmlCustomSimpleType='true'"
	 * @generated
	 */
	EDataType getRef();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * This represents a String in which whitespace must be normalized before processing. For example: in order to compare two Strings:
     * 
     * * leading and trailing whitespace needs to be removed
     * * consecutive whitespace (blank, cr, lf, tab) needs to be replaced by one blank.
     * 
     * Original fully qualified name: 
     * <em><b>eastadl21.EAST-ADL.Infrastructure.PrimitiveTypes.String</b></em> 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        annotation="MetaData guid='{E1926EE2-68FF-48ff-A194-4B3E069ADD4E}' id='288' EA\040name='String'"
	 *        annotation="Stereotype Stereotype='primitive'"
	 *        annotation="TaggedValues xml.xsd.type='string'"
	 *        extendedMetaData="name='STRING'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='STRINGS' xmlXsdSimpleType='string' xmlCustomSimpleType='false'"
	 * @generated
	 */
	EDataType getString();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Eastadl21Factory getEastadl21Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.DesignLevelImpl <em>Design Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.DesignLevelImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getDesignLevel()
		 * @generated
		 */
		EClass DESIGN_LEVEL = eINSTANCE.getDesignLevel();

		/**
		 * The meta object literal for the '<em><b>Allocation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_LEVEL__ALLOCATION = eINSTANCE.getDesignLevel_Allocation();

		/**
		 * The meta object literal for the '<em><b>Functional Design Architecture</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_LEVEL__FUNCTIONAL_DESIGN_ARCHITECTURE = eINSTANCE.getDesignLevel_FunctionalDesignArchitecture();

		/**
		 * The meta object literal for the '<em><b>Hardware Design Architecture</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_LEVEL__HARDWARE_DESIGN_ARCHITECTURE = eINSTANCE.getDesignLevel_HardwareDesignArchitecture();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.AllocateableElementImpl <em>Allocateable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.AllocateableElementImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getAllocateableElement()
		 * @generated
		 */
		EClass ALLOCATEABLE_ELEMENT = eINSTANCE.getAllocateableElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.AllocationImpl <em>Allocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.AllocationImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getAllocation()
		 * @generated
		 */
		EClass ALLOCATION = eINSTANCE.getAllocation();

		/**
		 * The meta object literal for the '<em><b>Function Allocation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION__FUNCTION_ALLOCATION = eINSTANCE.getAllocation_FunctionAllocation();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.AnalysisFunctionPrototypeImpl <em>Analysis Function Prototype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.AnalysisFunctionPrototypeImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getAnalysisFunctionPrototype()
		 * @generated
		 */
		EClass ANALYSIS_FUNCTION_PROTOTYPE = eINSTANCE.getAnalysisFunctionPrototype();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_FUNCTION_PROTOTYPE__TYPE = eINSTANCE.getAnalysisFunctionPrototype_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.AnalysisFunctionTypeImpl <em>Analysis Function Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.AnalysisFunctionTypeImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getAnalysisFunctionType()
		 * @generated
		 */
		EClass ANALYSIS_FUNCTION_TYPE = eINSTANCE.getAnalysisFunctionType();

		/**
		 * The meta object literal for the '<em><b>Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_FUNCTION_TYPE__PART = eINSTANCE.getAnalysisFunctionType_Part();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.BasicSoftwareFunctionTypeImpl <em>Basic Software Function Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.BasicSoftwareFunctionTypeImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getBasicSoftwareFunctionType()
		 * @generated
		 */
		EClass BASIC_SOFTWARE_FUNCTION_TYPE = eINSTANCE.getBasicSoftwareFunctionType();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.DesignFunctionPrototypeImpl <em>Design Function Prototype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.DesignFunctionPrototypeImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getDesignFunctionPrototype()
		 * @generated
		 */
		EClass DESIGN_FUNCTION_PROTOTYPE = eINSTANCE.getDesignFunctionPrototype();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_FUNCTION_PROTOTYPE__TYPE = eINSTANCE.getDesignFunctionPrototype_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.DesignFunctionTypeImpl <em>Design Function Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.DesignFunctionTypeImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getDesignFunctionType()
		 * @generated
		 */
		EClass DESIGN_FUNCTION_TYPE = eINSTANCE.getDesignFunctionType();

		/**
		 * The meta object literal for the '<em><b>Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_FUNCTION_TYPE__PART = eINSTANCE.getDesignFunctionType_Part();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.FunctionalDeviceImpl <em>Functional Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.FunctionalDeviceImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getFunctionalDevice()
		 * @generated
		 */
		EClass FUNCTIONAL_DEVICE = eINSTANCE.getFunctionalDevice();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.FunctionAllocationImpl <em>Function Allocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.FunctionAllocationImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getFunctionAllocation()
		 * @generated
		 */
		EClass FUNCTION_ALLOCATION = eINSTANCE.getFunctionAllocation();

		/**
		 * The meta object literal for the '<em><b>Allocated Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_ALLOCATION__ALLOCATED_ELEMENT = eINSTANCE.getFunctionAllocation_AllocatedElement();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_ALLOCATION__TARGET = eINSTANCE.getFunctionAllocation_Target();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.FunctionClientServerInterfaceImpl <em>Function Client Server Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.FunctionClientServerInterfaceImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getFunctionClientServerInterface()
		 * @generated
		 */
		EClass FUNCTION_CLIENT_SERVER_INTERFACE = eINSTANCE.getFunctionClientServerInterface();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CLIENT_SERVER_INTERFACE__OPERATION = eINSTANCE.getFunctionClientServerInterface_Operation();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.FunctionClientServerPortImpl <em>Function Client Server Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.FunctionClientServerPortImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getFunctionClientServerPort()
		 * @generated
		 */
		EClass FUNCTION_CLIENT_SERVER_PORT = eINSTANCE.getFunctionClientServerPort();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_CLIENT_SERVER_PORT__KIND = eINSTANCE.getFunctionClientServerPort_Kind();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CLIENT_SERVER_PORT__TYPE = eINSTANCE.getFunctionClientServerPort_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.FunctionConnectorImpl <em>Function Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.FunctionConnectorImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getFunctionConnector()
		 * @generated
		 */
		EClass FUNCTION_CONNECTOR = eINSTANCE.getFunctionConnector();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CONNECTOR__PORT = eINSTANCE.getFunctionConnector_Port();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.FunctionFlowPortImpl <em>Function Flow Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.FunctionFlowPortImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getFunctionFlowPort()
		 * @generated
		 */
		EClass FUNCTION_FLOW_PORT = eINSTANCE.getFunctionFlowPort();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_FLOW_PORT__DIRECTION = eINSTANCE.getFunctionFlowPort_Direction();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_FLOW_PORT__TYPE = eINSTANCE.getFunctionFlowPort_Type();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_FLOW_PORT__DEFAULT_VALUE = eINSTANCE.getFunctionFlowPort_DefaultValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.FunctionPortImpl <em>Function Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.FunctionPortImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getFunctionPort()
		 * @generated
		 */
		EClass FUNCTION_PORT = eINSTANCE.getFunctionPort();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.FunctionPowerPortImpl <em>Function Power Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.FunctionPowerPortImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getFunctionPowerPort()
		 * @generated
		 */
		EClass FUNCTION_POWER_PORT = eINSTANCE.getFunctionPowerPort();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_POWER_PORT__TYPE = eINSTANCE.getFunctionPowerPort_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.FunctionPrototypeImpl <em>Function Prototype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.FunctionPrototypeImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getFunctionPrototype()
		 * @generated
		 */
		EClass FUNCTION_PROTOTYPE = eINSTANCE.getFunctionPrototype();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.FunctionTypeImpl <em>Function Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.FunctionTypeImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getFunctionType()
		 * @generated
		 */
		EClass FUNCTION_TYPE = eINSTANCE.getFunctionType();

		/**
		 * The meta object literal for the '<em><b>Is Elementary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_TYPE__IS_ELEMENTARY = eINSTANCE.getFunctionType_IsElementary();

		/**
		 * The meta object literal for the '<em><b>Port Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_TYPE__PORT_GROUP = eINSTANCE.getFunctionType_PortGroup();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_TYPE__CONNECTOR = eINSTANCE.getFunctionType_Connector();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_TYPE__PORT = eINSTANCE.getFunctionType_Port();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.HardwareFunctionTypeImpl <em>Hardware Function Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.HardwareFunctionTypeImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getHardwareFunctionType()
		 * @generated
		 */
		EClass HARDWARE_FUNCTION_TYPE = eINSTANCE.getHardwareFunctionType();

		/**
		 * The meta object literal for the '<em><b>Hardware Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_FUNCTION_TYPE__HARDWARE_COMPONENT = eINSTANCE.getHardwareFunctionType_HardwareComponent();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.LocalDeviceManagerImpl <em>Local Device Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.LocalDeviceManagerImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getLocalDeviceManager()
		 * @generated
		 */
		EClass LOCAL_DEVICE_MANAGER = eINSTANCE.getLocalDeviceManager();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.OperationImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Return</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__RETURN = eINSTANCE.getOperation_Return();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__ARGUMENT = eINSTANCE.getOperation_Argument();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.PortGroupImpl <em>Port Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.PortGroupImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getPortGroup()
		 * @generated
		 */
		EClass PORT_GROUP = eINSTANCE.getPortGroup();

		/**
		 * The meta object literal for the '<em><b>Port Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_GROUP__PORT_GROUP = eINSTANCE.getPortGroup_PortGroup();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_GROUP__PORT = eINSTANCE.getPortGroup_Port();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.FunctionAllocation_allocatedElementImpl <em>Function Allocation allocated Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.FunctionAllocation_allocatedElementImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getFunctionAllocation_allocatedElement()
		 * @generated
		 */
		EClass FUNCTION_ALLOCATION_ALLOCATED_ELEMENT = eINSTANCE.getFunctionAllocation_allocatedElement();

		/**
		 * The meta object literal for the '<em><b>Allocateable Element context</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_ALLOCATION_ALLOCATED_ELEMENT__ALLOCATEABLE_ELEMENT_CONTEXT = eINSTANCE.getFunctionAllocation_allocatedElement_AllocateableElement_context();

		/**
		 * The meta object literal for the '<em><b>Allocateable Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_ALLOCATION_ALLOCATED_ELEMENT__ALLOCATEABLE_ELEMENT = eINSTANCE.getFunctionAllocation_allocatedElement_AllocateableElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.FunctionAllocation_targetImpl <em>Function Allocation target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.FunctionAllocation_targetImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getFunctionAllocation_target()
		 * @generated
		 */
		EClass FUNCTION_ALLOCATION_TARGET = eINSTANCE.getFunctionAllocation_target();

		/**
		 * The meta object literal for the '<em><b>Allocation Target context</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_ALLOCATION_TARGET__ALLOCATION_TARGET_CONTEXT = eINSTANCE.getFunctionAllocation_target_AllocationTarget_context();

		/**
		 * The meta object literal for the '<em><b>Allocation Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_ALLOCATION_TARGET__ALLOCATION_TARGET = eINSTANCE.getFunctionAllocation_target_AllocationTarget();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.FunctionConnector_portImpl <em>Function Connector port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.FunctionConnector_portImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getFunctionConnector_port()
		 * @generated
		 */
		EClass FUNCTION_CONNECTOR_PORT = eINSTANCE.getFunctionConnector_port();

		/**
		 * The meta object literal for the '<em><b>Function Prototype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CONNECTOR_PORT__FUNCTION_PROTOTYPE = eINSTANCE.getFunctionConnector_port_FunctionPrototype();

		/**
		 * The meta object literal for the '<em><b>Function Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CONNECTOR_PORT__FUNCTION_PORT = eINSTANCE.getFunctionConnector_port_FunctionPort();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.ActuatorImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.CommunicationHardwarePinImpl <em>Communication Hardware Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.CommunicationHardwarePinImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getCommunicationHardwarePin()
		 * @generated
		 */
		EClass COMMUNICATION_HARDWARE_PIN = eINSTANCE.getCommunicationHardwarePin();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.ElectricalComponentImpl <em>Electrical Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.ElectricalComponentImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getElectricalComponent()
		 * @generated
		 */
		EClass ELECTRICAL_COMPONENT = eINSTANCE.getElectricalComponent();

		/**
		 * The meta object literal for the '<em><b>Is Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELECTRICAL_COMPONENT__IS_ACTIVE = eINSTANCE.getElectricalComponent_IsActive();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.HardwareComponentPrototypeImpl <em>Hardware Component Prototype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.HardwareComponentPrototypeImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getHardwareComponentPrototype()
		 * @generated
		 */
		EClass HARDWARE_COMPONENT_PROTOTYPE = eINSTANCE.getHardwareComponentPrototype();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_COMPONENT_PROTOTYPE__TYPE = eINSTANCE.getHardwareComponentPrototype_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.HardwareComponentTypeImpl <em>Hardware Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.HardwareComponentTypeImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getHardwareComponentType()
		 * @generated
		 */
		EClass HARDWARE_COMPONENT_TYPE = eINSTANCE.getHardwareComponentType();

		/**
		 * The meta object literal for the '<em><b>Pin</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_COMPONENT_TYPE__PIN = eINSTANCE.getHardwareComponentType_Pin();

		/**
		 * The meta object literal for the '<em><b>Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_COMPONENT_TYPE__PART = eINSTANCE.getHardwareComponentType_Part();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_COMPONENT_TYPE__CONNECTOR = eINSTANCE.getHardwareComponentType_Connector();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_COMPONENT_TYPE__PORT = eINSTANCE.getHardwareComponentType_Port();

		/**
		 * The meta object literal for the '<em><b>Port Connector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_COMPONENT_TYPE__PORT_CONNECTOR = eINSTANCE.getHardwareComponentType_PortConnector();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.HardwareConnectorImpl <em>Hardware Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.HardwareConnectorImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getHardwareConnector()
		 * @generated
		 */
		EClass HARDWARE_CONNECTOR = eINSTANCE.getHardwareConnector();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_CONNECTOR__PORT = eINSTANCE.getHardwareConnector_Port();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.HardwarePinImpl <em>Hardware Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.HardwarePinImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getHardwarePin()
		 * @generated
		 */
		EClass HARDWARE_PIN = eINSTANCE.getHardwarePin();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_PIN__DIRECTION = eINSTANCE.getHardwarePin_Direction();

		/**
		 * The meta object literal for the '<em><b>Is Ground</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_PIN__IS_GROUND = eINSTANCE.getHardwarePin_IsGround();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.HardwarePortImpl <em>Hardware Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.HardwarePortImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getHardwarePort()
		 * @generated
		 */
		EClass HARDWARE_PORT = eINSTANCE.getHardwarePort();

		/**
		 * The meta object literal for the '<em><b>Is Shield</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_PORT__IS_SHIELD = eINSTANCE.getHardwarePort_IsShield();

		/**
		 * The meta object literal for the '<em><b>Contained Pin</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_PORT__CONTAINED_PIN = eINSTANCE.getHardwarePort_ContainedPin();

		/**
		 * The meta object literal for the '<em><b>Contained Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_PORT__CONTAINED_PORT = eINSTANCE.getHardwarePort_ContainedPort();

		/**
		 * The meta object literal for the '<em><b>Referenced Pin</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_PORT__REFERENCED_PIN = eINSTANCE.getHardwarePort_ReferencedPin();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.HardwarePortConnectorImpl <em>Hardware Port Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.HardwarePortConnectorImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getHardwarePortConnector()
		 * @generated
		 */
		EClass HARDWARE_PORT_CONNECTOR = eINSTANCE.getHardwarePortConnector();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_PORT_CONNECTOR__CONNECTOR = eINSTANCE.getHardwarePortConnector_Connector();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.IOHardwarePinImpl <em>IO Hardware Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.IOHardwarePinImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getIOHardwarePin()
		 * @generated
		 */
		EClass IO_HARDWARE_PIN = eINSTANCE.getIOHardwarePin();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IO_HARDWARE_PIN__KIND = eINSTANCE.getIOHardwarePin_Kind();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.LogicalPortConnectorImpl <em>Logical Port Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.LogicalPortConnectorImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getLogicalPortConnector()
		 * @generated
		 */
		EClass LOGICAL_PORT_CONNECTOR = eINSTANCE.getLogicalPortConnector();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_PORT_CONNECTOR__KIND = eINSTANCE.getLogicalPortConnector_Kind();

		/**
		 * The meta object literal for the '<em><b>Bus Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_PORT_CONNECTOR__BUS_SPEED = eINSTANCE.getLogicalPortConnector_BusSpeed();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.NodeImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Execution Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__EXECUTION_RATE = eINSTANCE.getNode_ExecutionRate();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.PortConnectorImpl <em>Port Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.PortConnectorImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getPortConnector()
		 * @generated
		 */
		EClass PORT_CONNECTOR = eINSTANCE.getPortConnector();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_CONNECTOR__PORT = eINSTANCE.getPortConnector_Port();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.PowerHardwarePinImpl <em>Power Hardware Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.PowerHardwarePinImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getPowerHardwarePin()
		 * @generated
		 */
		EClass POWER_HARDWARE_PIN = eINSTANCE.getPowerHardwarePin();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.SensorImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.AllocationTargetImpl <em>Allocation Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.AllocationTargetImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getAllocationTarget()
		 * @generated
		 */
		EClass ALLOCATION_TARGET = eINSTANCE.getAllocationTarget();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.HardwareConnector_portImpl <em>Hardware Connector port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.HardwareConnector_portImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getHardwareConnector_port()
		 * @generated
		 */
		EClass HARDWARE_CONNECTOR_PORT = eINSTANCE.getHardwareConnector_port();

		/**
		 * The meta object literal for the '<em><b>Hardware Pin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_CONNECTOR_PORT__HARDWARE_PIN = eINSTANCE.getHardwareConnector_port_HardwarePin();

		/**
		 * The meta object literal for the '<em><b>Hardware Component Prototype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_CONNECTOR_PORT__HARDWARE_COMPONENT_PROTOTYPE = eINSTANCE.getHardwareConnector_port_HardwareComponentPrototype();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.HardwarePortConnector_portImpl <em>Hardware Port Connector port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.HardwarePortConnector_portImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getHardwarePortConnector_port()
		 * @generated
		 */
		EClass HARDWARE_PORT_CONNECTOR_PORT = eINSTANCE.getHardwarePortConnector_port();

		/**
		 * The meta object literal for the '<em><b>Hardware Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_PORT_CONNECTOR_PORT__HARDWARE_PORT = eINSTANCE.getHardwarePortConnector_port_HardwarePort();

		/**
		 * The meta object literal for the '<em><b>Hardware Component Prototype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_PORT_CONNECTOR_PORT__HARDWARE_COMPONENT_PROTOTYPE = eINSTANCE.getHardwarePortConnector_port_HardwareComponentPrototype();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.CommentImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__BODY = eINSTANCE.getComment_Body();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.ContextImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Traceable Specification</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__TRACEABLE_SPECIFICATION = eINSTANCE.getContext_TraceableSpecification();

		/**
		 * The meta object literal for the '<em><b>Owned Relationship</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__OWNED_RELATIONSHIP = eINSTANCE.getContext_OwnedRelationship();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.EAConnectorImpl <em>EA Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.EAConnectorImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getEAConnector()
		 * @generated
		 */
		EClass EA_CONNECTOR = eINSTANCE.getEAConnector();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.EAElementImpl <em>EA Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.EAElementImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getEAElement()
		 * @generated
		 */
		EClass EA_ELEMENT = eINSTANCE.getEAElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_ELEMENT__NAME = eINSTANCE.getEAElement_Name();

		/**
		 * The meta object literal for the '<em><b>Owned Comment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_ELEMENT__OWNED_COMMENT = eINSTANCE.getEAElement_OwnedComment();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.EAPackageImpl <em>EA Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.EAPackageImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getEAPackage()
		 * @generated
		 */
		EClass EA_PACKAGE = eINSTANCE.getEAPackage();

		/**
		 * The meta object literal for the '<em><b>Sub Package</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_PACKAGE__SUB_PACKAGE = eINSTANCE.getEAPackage_SubPackage();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_PACKAGE__ELEMENT = eINSTANCE.getEAPackage_Element();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.EAPackageableElementImpl <em>EA Packageable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.EAPackageableElementImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getEAPackageableElement()
		 * @generated
		 */
		EClass EA_PACKAGEABLE_ELEMENT = eINSTANCE.getEAPackageableElement();

		/**
		 * The meta object literal for the '<em><b>EA Package element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_PACKAGEABLE_ELEMENT__EA_PACKAGE_ELEMENT = eINSTANCE.getEAPackageableElement_EAPackage_element();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.EAPortImpl <em>EA Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.EAPortImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getEAPort()
		 * @generated
		 */
		EClass EA_PORT = eINSTANCE.getEAPort();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.EAPrototypeImpl <em>EA Prototype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.EAPrototypeImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getEAPrototype()
		 * @generated
		 */
		EClass EA_PROTOTYPE = eINSTANCE.getEAPrototype();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.EATypeImpl <em>EA Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.EATypeImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getEAType()
		 * @generated
		 */
		EClass EA_TYPE = eINSTANCE.getEAType();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.EAXMLImpl <em>EAXML</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.EAXMLImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getEAXML()
		 * @generated
		 */
		EClass EAXML = eINSTANCE.getEAXML();

		/**
		 * The meta object literal for the '<em><b>Top Level Package</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EAXML__TOP_LEVEL_PACKAGE = eINSTANCE.getEAXML_TopLevelPackage();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.RationaleImpl <em>Rationale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.RationaleImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getRationale()
		 * @generated
		 */
		EClass RATIONALE = eINSTANCE.getRationale();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.RealizationImpl <em>Realization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.RealizationImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getRealization()
		 * @generated
		 */
		EClass REALIZATION = eINSTANCE.getRealization();

		/**
		 * The meta object literal for the '<em><b>Realized</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALIZATION__REALIZED = eINSTANCE.getRealization_Realized();

		/**
		 * The meta object literal for the '<em><b>Realized By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALIZATION__REALIZED_BY = eINSTANCE.getRealization_RealizedBy();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.ReferrableImpl <em>Referrable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.ReferrableImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getReferrable()
		 * @generated
		 */
		EClass REFERRABLE = eINSTANCE.getReferrable();

		/**
		 * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERRABLE__SHORT_NAME = eINSTANCE.getReferrable_ShortName();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.RelationshipImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.TraceableSpecificationImpl <em>Traceable Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.TraceableSpecificationImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getTraceableSpecification()
		 * @generated
		 */
		EClass TRACEABLE_SPECIFICATION = eINSTANCE.getTraceableSpecification();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACEABLE_SPECIFICATION__TEXT = eINSTANCE.getTraceableSpecification_Text();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACEABLE_SPECIFICATION__URI = eINSTANCE.getTraceableSpecification_Uri();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.IdentifiableImpl <em>Identifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.IdentifiableImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getIdentifiable()
		 * @generated
		 */
		EClass IDENTIFIABLE = eINSTANCE.getIdentifiable();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__CATEGORY = eINSTANCE.getIdentifiable_Category();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__UUID = eINSTANCE.getIdentifiable_Uuid();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.Realization_realizedImpl <em>Realization realized</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.Realization_realizedImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getRealization_realized()
		 * @generated
		 */
		EClass REALIZATION_REALIZED = eINSTANCE.getRealization_realized();

		/**
		 * The meta object literal for the '<em><b>Identifiable target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALIZATION_REALIZED__IDENTIFIABLE_TARGET = eINSTANCE.getRealization_realized_Identifiable_target();

		/**
		 * The meta object literal for the '<em><b>Identifiable context</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALIZATION_REALIZED__IDENTIFIABLE_CONTEXT = eINSTANCE.getRealization_realized_Identifiable_context();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.Realization_realizedByImpl <em>Realization realized By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.Realization_realizedByImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getRealization_realizedBy()
		 * @generated
		 */
		EClass REALIZATION_REALIZED_BY = eINSTANCE.getRealization_realizedBy();

		/**
		 * The meta object literal for the '<em><b>Identifiable target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALIZATION_REALIZED_BY__IDENTIFIABLE_TARGET = eINSTANCE.getRealization_realizedBy_Identifiable_target();

		/**
		 * The meta object literal for the '<em><b>Identifiable context</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALIZATION_REALIZED_BY__IDENTIFIABLE_CONTEXT = eINSTANCE.getRealization_realizedBy_Identifiable_context();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.ArrayDatatypeImpl <em>Array Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.ArrayDatatypeImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getArrayDatatype()
		 * @generated
		 */
		EClass ARRAY_DATATYPE = eINSTANCE.getArrayDatatype();

		/**
		 * The meta object literal for the '<em><b>Max Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_DATATYPE__MAX_LENGTH = eINSTANCE.getArrayDatatype_MaxLength();

		/**
		 * The meta object literal for the '<em><b>Min Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_DATATYPE__MIN_LENGTH = eINSTANCE.getArrayDatatype_MinLength();

		/**
		 * The meta object literal for the '<em><b>Element Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_DATATYPE__ELEMENT_TYPE = eINSTANCE.getArrayDatatype_ElementType();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.CompositeDatatypeImpl <em>Composite Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.CompositeDatatypeImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getCompositeDatatype()
		 * @generated
		 */
		EClass COMPOSITE_DATATYPE = eINSTANCE.getCompositeDatatype();

		/**
		 * The meta object literal for the '<em><b>Datatype Prototype</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_DATATYPE__DATATYPE_PROTOTYPE = eINSTANCE.getCompositeDatatype_DatatypePrototype();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.EABooleanImpl <em>EA Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.EABooleanImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getEABoolean()
		 * @generated
		 */
		EClass EA_BOOLEAN = eINSTANCE.getEABoolean();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.EADatatypeImpl <em>EA Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.EADatatypeImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getEADatatype()
		 * @generated
		 */
		EClass EA_DATATYPE = eINSTANCE.getEADatatype();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.EADatatypePrototypeImpl <em>EA Datatype Prototype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.EADatatypePrototypeImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getEADatatypePrototype()
		 * @generated
		 */
		EClass EA_DATATYPE_PROTOTYPE = eINSTANCE.getEADatatypePrototype();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_DATATYPE_PROTOTYPE__TYPE = eINSTANCE.getEADatatypePrototype_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.EANumericalImpl <em>EA Numerical</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.EANumericalImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getEANumerical()
		 * @generated
		 */
		EClass EA_NUMERICAL = eINSTANCE.getEANumerical();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_NUMERICAL__MAX = eINSTANCE.getEANumerical_Max();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_NUMERICAL__MIN = eINSTANCE.getEANumerical_Min();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_NUMERICAL__UNIT = eINSTANCE.getEANumerical_Unit();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.EAStringImpl <em>EA String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.EAStringImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getEAString()
		 * @generated
		 */
		EClass EA_STRING = eINSTANCE.getEAString();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.EnumerationImpl <em>Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.EnumerationImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getEnumeration()
		 * @generated
		 */
		EClass ENUMERATION = eINSTANCE.getEnumeration();

		/**
		 * The meta object literal for the '<em><b>Is Multi Valued</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION__IS_MULTI_VALUED = eINSTANCE.getEnumeration_IsMultiValued();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION__LITERAL = eINSTANCE.getEnumeration_Literal();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.EnumerationLiteralImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getEnumerationLiteral()
		 * @generated
		 */
		EClass ENUMERATION_LITERAL = eINSTANCE.getEnumerationLiteral();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.QuantityImpl <em>Quantity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.QuantityImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getQuantity()
		 * @generated
		 */
		EClass QUANTITY = eINSTANCE.getQuantity();

		/**
		 * The meta object literal for the '<em><b>Amount Of Substance Exp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITY__AMOUNT_OF_SUBSTANCE_EXP = eINSTANCE.getQuantity_AmountOfSubstanceExp();

		/**
		 * The meta object literal for the '<em><b>Electric Current Exp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITY__ELECTRIC_CURRENT_EXP = eINSTANCE.getQuantity_ElectricCurrentExp();

		/**
		 * The meta object literal for the '<em><b>Length Exp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITY__LENGTH_EXP = eINSTANCE.getQuantity_LengthExp();

		/**
		 * The meta object literal for the '<em><b>Luminous Intensity Exp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITY__LUMINOUS_INTENSITY_EXP = eINSTANCE.getQuantity_LuminousIntensityExp();

		/**
		 * The meta object literal for the '<em><b>Mass Exp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITY__MASS_EXP = eINSTANCE.getQuantity_MassExp();

		/**
		 * The meta object literal for the '<em><b>Thermodynamic Temperature Exp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITY__THERMODYNAMIC_TEMPERATURE_EXP = eINSTANCE.getQuantity_ThermodynamicTemperatureExp();

		/**
		 * The meta object literal for the '<em><b>Time Exp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITY__TIME_EXP = eINSTANCE.getQuantity_TimeExp();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.RangeableValueTypeImpl <em>Rangeable Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.RangeableValueTypeImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getRangeableValueType()
		 * @generated
		 */
		EClass RANGEABLE_VALUE_TYPE = eINSTANCE.getRangeableValueType();

		/**
		 * The meta object literal for the '<em><b>Accuracy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGEABLE_VALUE_TYPE__ACCURACY = eINSTANCE.getRangeableValueType_Accuracy();

		/**
		 * The meta object literal for the '<em><b>Resolution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGEABLE_VALUE_TYPE__RESOLUTION = eINSTANCE.getRangeableValueType_Resolution();

		/**
		 * The meta object literal for the '<em><b>Significant Digits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGEABLE_VALUE_TYPE__SIGNIFICANT_DIGITS = eINSTANCE.getRangeableValueType_SignificantDigits();

		/**
		 * The meta object literal for the '<em><b>Base Rangeable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGEABLE_VALUE_TYPE__BASE_RANGEABLE = eINSTANCE.getRangeableValueType_BaseRangeable();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.UnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.UnitImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getUnit()
		 * @generated
		 */
		EClass UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '<em><b>Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__FACTOR = eINSTANCE.getUnit_Factor();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__SYMBOL = eINSTANCE.getUnit_Symbol();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__OFFSET = eINSTANCE.getUnit_Offset();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__REFERENCE = eINSTANCE.getUnit_Reference();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__QUANTITY = eINSTANCE.getUnit_Quantity();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.EAArrayValueImpl <em>EA Array Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.EAArrayValueImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getEAArrayValue()
		 * @generated
		 */
		EClass EA_ARRAY_VALUE = eINSTANCE.getEAArrayValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_ARRAY_VALUE__VALUE = eINSTANCE.getEAArrayValue_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.EABooleanValueImpl <em>EA Boolean Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.EABooleanValueImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getEABooleanValue()
		 * @generated
		 */
		EClass EA_BOOLEAN_VALUE = eINSTANCE.getEABooleanValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_BOOLEAN_VALUE__VALUE = eINSTANCE.getEABooleanValue_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.EACompositeValueImpl <em>EA Composite Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.EACompositeValueImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getEACompositeValue()
		 * @generated
		 */
		EClass EA_COMPOSITE_VALUE = eINSTANCE.getEACompositeValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_COMPOSITE_VALUE__VALUE = eINSTANCE.getEACompositeValue_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.EAEnumerationValueImpl <em>EA Enumeration Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.EAEnumerationValueImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getEAEnumerationValue()
		 * @generated
		 */
		EClass EA_ENUMERATION_VALUE = eINSTANCE.getEAEnumerationValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_ENUMERATION_VALUE__VALUE = eINSTANCE.getEAEnumerationValue_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.EAExpressionImpl <em>EA Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.EAExpressionImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getEAExpression()
		 * @generated
		 */
		EClass EA_EXPRESSION = eINSTANCE.getEAExpression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_EXPRESSION__VALUE = eINSTANCE.getEAExpression_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.EANumericalValueImpl <em>EA Numerical Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.EANumericalValueImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getEANumericalValue()
		 * @generated
		 */
		EClass EA_NUMERICAL_VALUE = eINSTANCE.getEANumericalValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_NUMERICAL_VALUE__VALUE = eINSTANCE.getEANumericalValue_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.EAStringValueImpl <em>EA String Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.EAStringValueImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getEAStringValue()
		 * @generated
		 */
		EClass EA_STRING_VALUE = eINSTANCE.getEAStringValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EA_STRING_VALUE__VALUE = eINSTANCE.getEAStringValue_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.EAValueImpl <em>EA Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.EAValueImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getEAValue()
		 * @generated
		 */
		EClass EA_VALUE = eINSTANCE.getEAValue();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EA_VALUE__TYPE = eINSTANCE.getEAValue_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.UserAttributeDefinitionImpl <em>User Attribute Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.UserAttributeDefinitionImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getUserAttributeDefinition()
		 * @generated
		 */
		EClass USER_ATTRIBUTE_DEFINITION = eINSTANCE.getUserAttributeDefinition();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_ATTRIBUTE_DEFINITION__DEFAULT_VALUE = eINSTANCE.getUserAttributeDefinition_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_ATTRIBUTE_DEFINITION__TYPE = eINSTANCE.getUserAttributeDefinition_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.UserAttributedElementImpl <em>User Attributed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.UserAttributedElementImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getUserAttributedElement()
		 * @generated
		 */
		EClass USER_ATTRIBUTED_ELEMENT = eINSTANCE.getUserAttributedElement();

		/**
		 * The meta object literal for the '<em><b>Ua Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_ATTRIBUTED_ELEMENT__UA_VALUE = eINSTANCE.getUserAttributedElement_UaValue();

		/**
		 * The meta object literal for the '<em><b>Ua Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_ATTRIBUTED_ELEMENT__UA_TYPE = eINSTANCE.getUserAttributedElement_UaType();

		/**
		 * The meta object literal for the '<em><b>Attributed Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_ATTRIBUTED_ELEMENT__ATTRIBUTED_ELEMENT = eINSTANCE.getUserAttributedElement_AttributedElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.impl.UserElementTypeImpl <em>User Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.impl.UserElementTypeImpl
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getUserElementType()
		 * @generated
		 */
		EClass USER_ELEMENT_TYPE = eINSTANCE.getUserElementType();

		/**
		 * The meta object literal for the '<em><b>Valid For</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_ELEMENT_TYPE__VALID_FOR = eINSTANCE.getUserElementType_ValidFor();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_ELEMENT_TYPE__KEY = eINSTANCE.getUserElementType_Key();

		/**
		 * The meta object literal for the '<em><b>Ua Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_ELEMENT_TYPE__UA_DEFINITION = eINSTANCE.getUserElementType_UaDefinition();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.ClientServerKind <em>Client Server Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.ClientServerKind
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getClientServerKind()
		 * @generated
		 */
		EEnum CLIENT_SERVER_KIND = eINSTANCE.getClientServerKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.EADirectionKind <em>EA Direction Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.EADirectionKind
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getEADirectionKind()
		 * @generated
		 */
		EEnum EA_DIRECTION_KIND = eINSTANCE.getEADirectionKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.HardwareBusKind <em>Hardware Bus Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.HardwareBusKind
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getHardwareBusKind()
		 * @generated
		 */
		EEnum HARDWARE_BUS_KIND = eINSTANCE.getHardwareBusKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.eatop.eastadl21.IOHardwarePinKind <em>IO Hardware Pin Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eatop.eastadl21.IOHardwarePinKind
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getIOHardwarePinKind()
		 * @generated
		 */
		EEnum IO_HARDWARE_PIN_KIND = eINSTANCE.getIOHardwarePinKind();

		/**
		 * The meta object literal for the '<em>Boolean</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Boolean
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getBoolean()
		 * @generated
		 */
		EDataType BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '<em>Float</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getFloat()
		 * @generated
		 */
		EDataType FLOAT = eINSTANCE.getFloat();

		/**
		 * The meta object literal for the '<em>Identifier</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getIdentifier()
		 * @generated
		 */
		EDataType IDENTIFIER = eINSTANCE.getIdentifier();

		/**
		 * The meta object literal for the '<em>Integer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getInteger()
		 * @generated
		 */
		EDataType INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '<em>Numerical</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getNumerical()
		 * @generated
		 */
		EDataType NUMERICAL = eINSTANCE.getNumerical();

		/**
		 * The meta object literal for the '<em>Ref</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getRef()
		 * @generated
		 */
		EDataType REF = eINSTANCE.getRef();

		/**
		 * The meta object literal for the '<em>String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.eatop.eastadl21.impl.Eastadl21PackageImpl#getString()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getString();

	}

} //Eastadl21Package
