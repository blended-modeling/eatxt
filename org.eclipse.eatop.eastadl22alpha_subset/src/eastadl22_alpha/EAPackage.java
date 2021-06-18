/**
 */
package eastadl22_alpha;

import org.eclipse.eatop.geastadl.ginfrastructure.gelements.GEAPackage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EA Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Used for organization of the packageable elements in the model.
 * 
 * Semantics:
 * EAPackages can be organized hierarchically, where each level may contain a number of EAPackageableElements.
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Infrastructure.Elements.EAPackage</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eastadl22_alpha.EAPackage#getSubPackage <em>Sub Package</em>}</li>
 *   <li>{@link eastadl22_alpha.EAPackage#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see eastadl22_alpha.Eastadl22_alphaPackage#getEAPackage()
 * @model annotation="MetaData guid='{E7054AFB-DD6D-4422-AA3B-77AFB8D6A983}' id='254' EA\040name='EAPackage'"
 *        extendedMetaData="name='EA-PACKAGE' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='EA-PACKAGES'"
 * @generated
 */
public interface EAPackage extends EAElement, GEAPackage {
	/**
	 * Returns the value of the '<em><b>Sub Package</b></em>' containment reference list.
	 * The list contents are of type {@link eastadl22_alpha.EAPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Package</em>' containment reference list.
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getEAPackage_SubPackage()
	 * @model containment="true"
	 *        annotation="MetaData guid='{D850CEAE-A007-4533-A892-46677485ED90}' id='120' EA\040name=''"
	 *        annotation="Stereotype Stereotype='splitable'"
	 *        extendedMetaData="name='SUB-PACKAGE' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='SUB-PACKAGES' xmlAttribute='false' featureWrapperElement='true' featureElement='false' classifierWrapperElement='false' classifierElement='true'"
	 * @generated
	 */
	EList<EAPackage> getSubPackage();

	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link eastadl22_alpha.EAPackageableElement}.
	 * It is bidirectional and its opposite is '{@link eastadl22_alpha.EAPackageableElement#getEAPackage_element <em>EA Package element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getEAPackage_Element()
	 * @see eastadl22_alpha.EAPackageableElement#getEAPackage_element
	 * @model opposite="EAPackage_element" containment="true"
	 *        annotation="MetaData guid='{438A6683-48C5-4af2-A6DE-B32B0F043990}' id='141' EA\040name=''"
	 *        annotation="Stereotype Stereotype='splitable'"
	 *        extendedMetaData="name='ELEMENT' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='ELEMENTS' xmlAttribute='false' featureWrapperElement='true' featureElement='false' classifierWrapperElement='false' classifierElement='true'"
	 * @generated
	 */
	EList<EAPackageableElement> getElement();

} // EAPackage
