/**
 */
package org.eclipse.eatop.eastadl21;

import org.eclipse.eatop.geastadl.ginfrastructure.gelements.GEAXML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EAXML</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The root element of an exchanged XML file which contains an EAST-ADL model.
 * 
 * Semantics:
 * EAXML represents the root element of an EAST-ADL XML file. 
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Infrastructure.Elements.EAXML</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eatop.eastadl21.EAXML#getTopLevelPackage <em>Top Level Package</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getEAXML()
 * @model annotation="MetaData guid='{913C0AF8-1B68-42bd-B8F7-1CA700DDA2CF}' id='249' EA\040name='EAXML'"
 *        annotation="TaggedValues admin.documentVersion='2013-11-28' autosar.documentVersion='4.0' xml.globalElement='true'"
 *        extendedMetaData="name='EAXML' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='EAXMLS' xmlGlobalElement='true'"
 * @generated
 */
public interface EAXML extends GEAXML {
	/**
	 * Returns the value of the '<em><b>Top Level Package</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.eatop.eastadl21.EAPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Level Package</em>' containment reference list.
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getEAXML_TopLevelPackage()
	 * @model containment="true"
	 *        annotation="MetaData guid='{33C94FC6-4B90-454c-9FA5-447A9B612F69}' id='133' EA\040name=''"
	 *        annotation="Stereotype Stereotype='splitable'"
	 *        extendedMetaData="name='TOP-LEVEL-PACKAGE' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='TOP-LEVEL-PACKAGES' xmlAttribute='false' featureWrapperElement='true' featureElement='false' classifierWrapperElement='false' classifierElement='true'"
	 * @generated
	 */
	EList<EAPackage> getTopLevelPackage();

} // EAXML
