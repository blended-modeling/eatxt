/**
 */
package eastadl22_alpha.util;

import eastadl22_alpha.Eastadl22_alphaPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Eastadl22_alphaXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Eastadl22_alphaXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		Eastadl22_alphaPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Eastadl22_alphaResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new Eastadl22_alphaResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Eastadl22_alphaResourceFactoryImpl());
		}
		return registrations;
	}

} //Eastadl22_alphaXMLProcessor
