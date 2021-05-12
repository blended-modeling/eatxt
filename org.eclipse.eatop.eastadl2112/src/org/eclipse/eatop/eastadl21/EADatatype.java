/**
 */
package org.eclipse.eatop.eastadl21;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EA Datatype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The EADatatype is a metaclass, which signifies a type whose instances are identified only by their value. The EADatatype metaclass represents the description of the value set for some variable, parameter etc. without a description of how these possible values are represented at implementation level. The implementation representation is defined at implementation level by the AUTOSAR concept PrimitiveTypeWithSemantics, and the implemented datatype shall be associated with a Realization relationship. The realizing datatype must match the EADatatype regarding range, resolution, unit, and dimension.
 * 
 * Semantics:
 * EADatatype metaclass is a special kind of classifier, similar to a class. It differs from the class in that instances of a data type are identified only by their value.
 * 
 * Constraints:
 * [1] In the case of an AR implementation, an EADatatype is realized generally by PrimitiveTypeWithSemantics, which has to be consistent w.r.t. range, resolution, etc.
 * 
 * Notation:
 * The EADatatype is denoted using the rectangle symbol with keyword «Datatype».
 * 
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Infrastructure.Datatypes.EADatatype</b></em> 
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.eatop.eastadl21.Eastadl21Package#getEADatatype()
 * @model abstract="true"
 *        annotation="MetaData guid='{01E487F6-8AE2-4620-A617-B482404D8FFE}' id='259' EA\040name='EADatatype'"
 *        annotation="Stereotype Stereotype='atpType'"
 *        extendedMetaData="name='EA-DATATYPE' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='EA-DATATYPES'"
 * @generated
 */
public interface EADatatype extends TraceableSpecification {
} // EADatatype
