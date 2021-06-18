/**
 */
package eastadl22_alpha.impl;

import eastadl22_alpha.EAPackage;
import eastadl22_alpha.EAPackageableElement;
import eastadl22_alpha.Eastadl22_alphaPackage;

import java.util.Collection;

import org.eclipse.eatop.geastadl.ginfrastructure.gelements.GEAPackage;
import org.eclipse.eatop.geastadl.ginfrastructure.gelements.GEAPackageableElement;
import org.eclipse.eatop.geastadl.ginfrastructure.gelements.GelementsPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EA Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eastadl22_alpha.impl.EAPackageImpl#getGElement <em>GElement</em>}</li>
 *   <li>{@link eastadl22_alpha.impl.EAPackageImpl#getGSubPackage <em>GSub Package</em>}</li>
 *   <li>{@link eastadl22_alpha.impl.EAPackageImpl#getSubPackage <em>Sub Package</em>}</li>
 *   <li>{@link eastadl22_alpha.impl.EAPackageImpl#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EAPackageImpl extends EAElementImpl implements EAPackage {
	/**
	 * The cached value of the '{@link #getSubPackage() <em>Sub Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<EAPackage> subPackage;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected EList<EAPackageableElement> element;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EAPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eastadl22_alphaPackage.Literals.EA_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GEAPackageableElement> getGElement() {
		// TODO: implement this method to return the 'GElement' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GEAPackage> getGSubPackage() {
		// TODO: implement this method to return the 'GSub Package' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAPackage> getSubPackage() {
		if (subPackage == null) {
			subPackage = new EObjectContainmentEList<EAPackage>(EAPackage.class, this, Eastadl22_alphaPackage.EA_PACKAGE__SUB_PACKAGE);
		}
		return subPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAPackageableElement> getElement() {
		if (element == null) {
			element = new EObjectContainmentWithInverseEList<EAPackageableElement>(EAPackageableElement.class, this, Eastadl22_alphaPackage.EA_PACKAGE__ELEMENT, Eastadl22_alphaPackage.EA_PACKAGEABLE_ELEMENT__EA_PACKAGE_ELEMENT);
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Eastadl22_alphaPackage.EA_PACKAGE__ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElement()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Eastadl22_alphaPackage.EA_PACKAGE__SUB_PACKAGE:
				return ((InternalEList<?>)getSubPackage()).basicRemove(otherEnd, msgs);
			case Eastadl22_alphaPackage.EA_PACKAGE__ELEMENT:
				return ((InternalEList<?>)getElement()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Eastadl22_alphaPackage.EA_PACKAGE__GELEMENT:
				return getGElement();
			case Eastadl22_alphaPackage.EA_PACKAGE__GSUB_PACKAGE:
				return getGSubPackage();
			case Eastadl22_alphaPackage.EA_PACKAGE__SUB_PACKAGE:
				return getSubPackage();
			case Eastadl22_alphaPackage.EA_PACKAGE__ELEMENT:
				return getElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Eastadl22_alphaPackage.EA_PACKAGE__GELEMENT:
				getGElement().clear();
				getGElement().addAll((Collection<? extends GEAPackageableElement>)newValue);
				return;
			case Eastadl22_alphaPackage.EA_PACKAGE__GSUB_PACKAGE:
				getGSubPackage().clear();
				getGSubPackage().addAll((Collection<? extends GEAPackage>)newValue);
				return;
			case Eastadl22_alphaPackage.EA_PACKAGE__SUB_PACKAGE:
				getSubPackage().clear();
				getSubPackage().addAll((Collection<? extends EAPackage>)newValue);
				return;
			case Eastadl22_alphaPackage.EA_PACKAGE__ELEMENT:
				getElement().clear();
				getElement().addAll((Collection<? extends EAPackageableElement>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Eastadl22_alphaPackage.EA_PACKAGE__GELEMENT:
				getGElement().clear();
				return;
			case Eastadl22_alphaPackage.EA_PACKAGE__GSUB_PACKAGE:
				getGSubPackage().clear();
				return;
			case Eastadl22_alphaPackage.EA_PACKAGE__SUB_PACKAGE:
				getSubPackage().clear();
				return;
			case Eastadl22_alphaPackage.EA_PACKAGE__ELEMENT:
				getElement().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Eastadl22_alphaPackage.EA_PACKAGE__GELEMENT:
				return !getGElement().isEmpty();
			case Eastadl22_alphaPackage.EA_PACKAGE__GSUB_PACKAGE:
				return !getGSubPackage().isEmpty();
			case Eastadl22_alphaPackage.EA_PACKAGE__SUB_PACKAGE:
				return subPackage != null && !subPackage.isEmpty();
			case Eastadl22_alphaPackage.EA_PACKAGE__ELEMENT:
				return element != null && !element.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == GEAPackage.class) {
			switch (derivedFeatureID) {
				case Eastadl22_alphaPackage.EA_PACKAGE__GELEMENT: return GelementsPackage.GEA_PACKAGE__GELEMENT;
				case Eastadl22_alphaPackage.EA_PACKAGE__GSUB_PACKAGE: return GelementsPackage.GEA_PACKAGE__GSUB_PACKAGE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == GEAPackage.class) {
			switch (baseFeatureID) {
				case GelementsPackage.GEA_PACKAGE__GELEMENT: return Eastadl22_alphaPackage.EA_PACKAGE__GELEMENT;
				case GelementsPackage.GEA_PACKAGE__GSUB_PACKAGE: return Eastadl22_alphaPackage.EA_PACKAGE__GSUB_PACKAGE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //EAPackageImpl
