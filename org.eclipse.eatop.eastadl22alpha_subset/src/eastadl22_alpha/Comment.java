/**
 */
package eastadl22_alpha;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Comment represents a textual annotation.
 * 
 * Semantics:
 * Comment represents a textual annotation that applies to the containing or associated element.
 * 
 * 
 * Extension: Comment
 * 
 * Original fully qualified name: 
 * <em><b>eastadl21.EAST-ADL.Infrastructure.Elements.Comment</b></em> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eastadl22_alpha.Comment#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see eastadl22_alpha.Eastadl22_alphaPackage#getComment()
 * @model annotation="MetaData guid='{2287958E-8753-4127-A7F0-EF7674C93E07}' id='243' EA\040name='Comment'"
 *        extendedMetaData="name='COMMENT' kind='simple'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='COMMENTS'"
 * @generated
 */
public interface Comment extends EObject {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a string that is the comment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #isSetBody()
	 * @see #unsetBody()
	 * @see #setBody(String)
	 * @see eastadl22_alpha.Eastadl22_alphaPackage#getComment_Body()
	 * @model unsettable="true" dataType="eastadl22_alpha.String" required="true"
	 *        annotation="MetaData guid='{B9D51FAE-5DE0-4d76-9A6D-4526635B8C04}' id='182' EA\040name='body'"
	 *        extendedMetaData="name='BODY' kind='element'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='BODYS' xmlAttribute='false' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link eastadl22_alpha.Comment#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #isSetBody()
	 * @see #unsetBody()
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Unsets the value of the '{@link eastadl22_alpha.Comment#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBody()
	 * @see #getBody()
	 * @see #setBody(String)
	 * @generated
	 */
	void unsetBody();

	/**
	 * Returns whether the value of the '{@link eastadl22_alpha.Comment#getBody <em>Body</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Body</em>' attribute is set.
	 * @see #unsetBody()
	 * @see #getBody()
	 * @see #setBody(String)
	 * @generated
	 */
	boolean isSetBody();

} // Comment
