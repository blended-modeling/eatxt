/**
 */
package eastadl22_alpha.impl;

import eastadl22_alpha.Eastadl22_alphaPackage;
import eastadl22_alpha.Realization;
import eastadl22_alpha.Realization_realized;
import eastadl22_alpha.Realization_realizedBy;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eastadl22_alpha.impl.RealizationImpl#getRealized <em>Realized</em>}</li>
 *   <li>{@link eastadl22_alpha.impl.RealizationImpl#getRealizedBy <em>Realized By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RealizationImpl extends RelationshipImpl implements Realization {
	/**
	 * The cached value of the '{@link #getRealized() <em>Realized</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealized()
	 * @generated
	 * @ordered
	 */
	protected EList<Realization_realized> realized;

	/**
	 * The cached value of the '{@link #getRealizedBy() <em>Realized By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Realization_realizedBy> realizedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eastadl22_alphaPackage.Literals.REALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Realization_realized> getRealized() {
		if (realized == null) {
			realized = new EObjectContainmentEList<Realization_realized>(Realization_realized.class, this, Eastadl22_alphaPackage.REALIZATION__REALIZED);
		}
		return realized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Realization_realizedBy> getRealizedBy() {
		if (realizedBy == null) {
			realizedBy = new EObjectContainmentEList<Realization_realizedBy>(Realization_realizedBy.class, this, Eastadl22_alphaPackage.REALIZATION__REALIZED_BY);
		}
		return realizedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Eastadl22_alphaPackage.REALIZATION__REALIZED:
				return ((InternalEList<?>)getRealized()).basicRemove(otherEnd, msgs);
			case Eastadl22_alphaPackage.REALIZATION__REALIZED_BY:
				return ((InternalEList<?>)getRealizedBy()).basicRemove(otherEnd, msgs);
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
			case Eastadl22_alphaPackage.REALIZATION__REALIZED:
				return getRealized();
			case Eastadl22_alphaPackage.REALIZATION__REALIZED_BY:
				return getRealizedBy();
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
			case Eastadl22_alphaPackage.REALIZATION__REALIZED:
				getRealized().clear();
				getRealized().addAll((Collection<? extends Realization_realized>)newValue);
				return;
			case Eastadl22_alphaPackage.REALIZATION__REALIZED_BY:
				getRealizedBy().clear();
				getRealizedBy().addAll((Collection<? extends Realization_realizedBy>)newValue);
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
			case Eastadl22_alphaPackage.REALIZATION__REALIZED:
				getRealized().clear();
				return;
			case Eastadl22_alphaPackage.REALIZATION__REALIZED_BY:
				getRealizedBy().clear();
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
			case Eastadl22_alphaPackage.REALIZATION__REALIZED:
				return realized != null && !realized.isEmpty();
			case Eastadl22_alphaPackage.REALIZATION__REALIZED_BY:
				return realizedBy != null && !realizedBy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RealizationImpl
