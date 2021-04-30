/**
 */
package org.eclipse.eatop.eastadl21;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Datatype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A CompositeDatatype represents a non-scalar datatype. Take as an example a CompositeDatatype "MyCountries" that can refer, e.g., to an Enumeration "CountryEnumeration" {USA, Canada, Japan, EU} via two EADatatypePrototypes (record variables): FirstCountry and SecondCountry. Then an attribute typed by this CompositeDatatype "MyCountries" may have a value like: (EU (identified as FirstCountry), Japan (identified as SecondCountry)).
 * 
 * Semantics:
 * A CompositeDatatype represents a non-scalar datatype. The contained datatypePrototypes act as record variables to identify the ordered datatype instances of the tuple (the CompositeDatatype).
 * 
 * Notation:
 * The datatype CompositeDatatype is denoted using the rectangle symbol with keyword «Datatype CompositeDatatype».
 * 
 * Extension: UML Datatype
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Infrastructure.Datatypes.CompositeDatatype</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eatop.eastadl21.CompositeDatatype#getDatatypePrototype <em>Datatype Prototype</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getCompositeDatatype()
 * @model annotation="MetaData guid='{0E778F31-4152-4ce5-B51E-104870A55EDC}' id='260' EA\040name='CompositeDatatype'"
 *        extendedMetaData="name='COMPOSITE-DATATYPE' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='COMPOSITE-DATATYPES'"
 * @generated
 */
public interface CompositeDatatype extends EADatatype {
	/**
	 * Returns the value of the '<em><b>Datatype Prototype</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.eatop.eastadl21.EADatatypePrototype}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype Prototype</em>' containment reference list.
	 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getCompositeDatatype_DatatypePrototype()
	 * @model containment="true" required="true"
	 *        annotation="MetaData guid='{71E9D2EB-EBB4-4535-AF2E-0F465CC498FA}' id='107' EA\040name=''"
	 *        extendedMetaData="name='DATATYPE-PROTOTYPE' kind='element' namespace='http://east-adl.info/2.1.12'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='DATATYPE-PROTOTYPES' xmlAttribute='false' featureWrapperElement='true' featureElement='false' classifierWrapperElement='false' classifierElement='true'"
	 * @generated
	 */
	EList<EADatatypePrototype> getDatatypePrototype();

} // CompositeDatatype
