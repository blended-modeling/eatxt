/**
 */
package eastadl22_alpha;

import org.eclipse.eatop.geastadl.ginfrastructure.gelements.GEAPackageableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EA Packageable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Elements that are packageable may be directly contained in a package.
 * 
 * Semantics:
 * Elements specializing EAPackageableElement can be created directly within an EAPackage.
 * 
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Infrastructure.Elements.EAPackageableElement</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eastadl22_alpha.EAPackageableElement#getEAPackage_element <em>EA Package element</em>}</li>
 * </ul>
 *
 * @see eastadl22_alpha.Eastadl22_alphaPackage#getEAPackageableElement()
 * @model abstract="true"
 *        annotation="MetaData guid='{686C8F6A-E793-4d92-AF88-2BEBF5B710DA}' id='247' EA\040name='EAPackageableElement'"
 *        extendedMetaData="name='EA-PACKAGEABLE-ELEMENT' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='EA-PACKAGEABLE-ELEMENTS'"
 * @generated
 */
public interface EAPackageableElement extends EAElement, GEAPackageableElement {
	/**
	 * Returns the value of the '<em><b>EA Package element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eastadl22_alpha.EAPackage#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EA Package element</em>' container reference.
	 * @see #setEAPackage_element(EAPackage)
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getEAPackageableElement_EAPackage_element()
	 * @see eastadl22_alpha.EAPackage#getElement
	 * @model opposite="element"
	 *        extendedMetaData="name='EA-PACKAGE-ELEMENT-REF' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='EA-PACKAGE-ELEMENT-REFS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	EAPackage getEAPackage_element();

	/**
	 * Sets the value of the '{@link eastadl22_alpha.EAPackageableElement#getEAPackage_element <em>EA Package element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EA Package element</em>' container reference.
	 * @see #getEAPackage_element()
	 * @generated
	 */
	void setEAPackage_element(EAPackage value);

} // EAPackageableElement
