/**
 */
package eastadl22_alpha;

import org.eclipse.eatop.geastadl.ginfrastructure.gelements.GReferrable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referrable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This abstract element has the shortName attribute which is used for references of elements in the model in combination with the shortName of the elements parents.
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Infrastructure.Elements.Referrable</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eastadl22_alpha.Referrable#getShortName <em>Short Name</em>}</li>
 * </ul>
 *
 * @see eastadl22_alpha.Eastadl22_alphaPackage#getReferrable()
 * @model abstract="true"
 *        annotation="MetaData guid='{462AFDC8-1694-4a1f-8FF9-D1315369EAEC}' id='246' EA\040name='Referrable'"
 *        extendedMetaData="name='REFERRABLE' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='REFERRABLES'"
 * @generated
 */
public interface Referrable extends GReferrable {
	/**
	 * Returns the value of the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This specifies an identifying shortName for the object. It needs to be unique within its context and is intended for humans but even more for technical reference.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Short Name</em>' attribute.
	 * @see #isSetShortName()
	 * @see #unsetShortName()
	 * @see #setShortName(String)
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getReferrable_ShortName()
	 * @model unsettable="true" dataType="eastadl22_alpha.Identifier" required="true"
	 *        annotation="MetaData guid='{3FE09079-22D7-4736-82A5-5C743E31871E}' id='186' EA\040name='shortName'"
	 *        annotation="TaggedValues xml.enforceMinMultiplicity='true' xml.sequenceOffset='-100'"
	 *        extendedMetaData="kind='element' namespace='http://east-adl.info/2.1.12' name='SHORT-NAME'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='SHORT-NAMES' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	String getShortName();

	/**
	 * Sets the value of the '{@link eastadl22_alpha.Referrable#getShortName <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Name</em>' attribute.
	 * @see #isSetShortName()
	 * @see #unsetShortName()
	 * @see #getShortName()
	 * @generated
	 */
	void setShortName(String value);

	/**
	 * Unsets the value of the '{@link eastadl22_alpha.Referrable#getShortName <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShortName()
	 * @see #getShortName()
	 * @see #setShortName(String)
	 * @generated
	 */
	void unsetShortName();

	/**
	 * Returns whether the value of the '{@link eastadl22_alpha.Referrable#getShortName <em>Short Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Short Name</em>' attribute is set.
	 * @see #unsetShortName()
	 * @see #getShortName()
	 * @see #setShortName(String)
	 * @generated
	 */
	boolean isSetShortName();

} // Referrable
