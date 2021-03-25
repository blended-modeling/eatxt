/**
 */
package org.eclipse.eatop.eastadl21.impl;

import java.util.Collection;

import org.eclipse.eatop.eastadl21.AllocateableElement;
import org.eclipse.eatop.eastadl21.Eastadl21Package;
import org.eclipse.eatop.eastadl21.FunctionAllocation_allocatedElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.sphinx.emf.ecore.ExtendedEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Allocation allocated Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eatop.eastadl21.impl.FunctionAllocation_allocatedElementImpl#getAllocateableElement_context <em>Allocateable Element context</em>}</li>
 *   <li>{@link org.eclipse.eatop.eastadl21.impl.FunctionAllocation_allocatedElementImpl#getAllocateableElement <em>Allocateable Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionAllocation_allocatedElementImpl extends ExtendedEObjectImpl implements FunctionAllocation_allocatedElement {
	/**
	 * The cached value of the '{@link #getAllocateableElement_context() <em>Allocateable Element context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocateableElement_context()
	 * @generated
	 * @ordered
	 */
	protected EList<AllocateableElement> allocateableElement_context;

	/**
	 * The cached value of the '{@link #getAllocateableElement() <em>Allocateable Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocateableElement()
	 * @generated
	 * @ordered
	 */
	protected AllocateableElement allocateableElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionAllocation_allocatedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eastadl21Package.Literals.FUNCTION_ALLOCATION_ALLOCATED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AllocateableElement> getAllocateableElement_context() {
		if (allocateableElement_context == null) {
			allocateableElement_context = new EObjectResolvingEList<AllocateableElement>(AllocateableElement.class, this, Eastadl21Package.FUNCTION_ALLOCATION_ALLOCATED_ELEMENT__ALLOCATEABLE_ELEMENT_CONTEXT);
		}
		return allocateableElement_context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllocateableElement getAllocateableElement() {
		if (allocateableElement != null && allocateableElement.eIsProxy()) {
			InternalEObject oldAllocateableElement = (InternalEObject)allocateableElement;
			allocateableElement = (AllocateableElement)eResolveProxy(oldAllocateableElement);
			if (allocateableElement != oldAllocateableElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Eastadl21Package.FUNCTION_ALLOCATION_ALLOCATED_ELEMENT__ALLOCATEABLE_ELEMENT, oldAllocateableElement, allocateableElement));
			}
		}
		return allocateableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocateableElement basicGetAllocateableElement() {
		return allocateableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllocateableElement(AllocateableElement newAllocateableElement) {
		AllocateableElement oldAllocateableElement = allocateableElement;
		allocateableElement = newAllocateableElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eastadl21Package.FUNCTION_ALLOCATION_ALLOCATED_ELEMENT__ALLOCATEABLE_ELEMENT, oldAllocateableElement, allocateableElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Eastadl21Package.FUNCTION_ALLOCATION_ALLOCATED_ELEMENT__ALLOCATEABLE_ELEMENT_CONTEXT:
				return getAllocateableElement_context();
			case Eastadl21Package.FUNCTION_ALLOCATION_ALLOCATED_ELEMENT__ALLOCATEABLE_ELEMENT:
				if (resolve) return getAllocateableElement();
				return basicGetAllocateableElement();
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
			case Eastadl21Package.FUNCTION_ALLOCATION_ALLOCATED_ELEMENT__ALLOCATEABLE_ELEMENT_CONTEXT:
				getAllocateableElement_context().clear();
				getAllocateableElement_context().addAll((Collection<? extends AllocateableElement>)newValue);
				return;
			case Eastadl21Package.FUNCTION_ALLOCATION_ALLOCATED_ELEMENT__ALLOCATEABLE_ELEMENT:
				setAllocateableElement((AllocateableElement)newValue);
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
			case Eastadl21Package.FUNCTION_ALLOCATION_ALLOCATED_ELEMENT__ALLOCATEABLE_ELEMENT_CONTEXT:
				getAllocateableElement_context().clear();
				return;
			case Eastadl21Package.FUNCTION_ALLOCATION_ALLOCATED_ELEMENT__ALLOCATEABLE_ELEMENT:
				setAllocateableElement((AllocateableElement)null);
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
			case Eastadl21Package.FUNCTION_ALLOCATION_ALLOCATED_ELEMENT__ALLOCATEABLE_ELEMENT_CONTEXT:
				return allocateableElement_context != null && !allocateableElement_context.isEmpty();
			case Eastadl21Package.FUNCTION_ALLOCATION_ALLOCATED_ELEMENT__ALLOCATEABLE_ELEMENT:
				return allocateableElement != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionAllocation_allocatedElementImpl
