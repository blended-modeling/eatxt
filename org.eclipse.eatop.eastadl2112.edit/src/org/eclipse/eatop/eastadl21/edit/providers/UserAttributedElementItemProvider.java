/**
 */
package org.eclipse.eatop.eastadl21.edit.providers;


import java.util.Collection;
import java.util.List;

import org.eclipse.eatop.eastadl21.Eastadl21Factory;
import org.eclipse.eatop.eastadl21.Eastadl21Package;
import org.eclipse.eatop.eastadl21.UserAttributedElement;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.eatop.eastadl21.UserAttributedElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UserAttributedElementItemProvider extends EAPackageableElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserAttributedElementItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addUaTypePropertyDescriptor(object);
			addAttributedElementPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Ua Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUaTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UserAttributedElement_uaType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UserAttributedElement_uaType_feature", "_UI_UserAttributedElement_type"),
				 Eastadl21Package.Literals.USER_ATTRIBUTED_ELEMENT__UA_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Attributed Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttributedElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UserAttributedElement_attributedElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UserAttributedElement_attributedElement_feature", "_UI_UserAttributedElement_type"),
				 Eastadl21Package.Literals.USER_ATTRIBUTED_ELEMENT__ATTRIBUTED_ELEMENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Eastadl21Package.Literals.USER_ATTRIBUTED_ELEMENT__UA_VALUE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns UserAttributedElement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UserAttributedElement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((UserAttributedElement)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_UserAttributedElement_type") :
			getString("_UI_UserAttributedElement_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(UserAttributedElement.class)) {
			case Eastadl21Package.USER_ATTRIBUTED_ELEMENT__UA_VALUE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(Eastadl21Package.Literals.USER_ATTRIBUTED_ELEMENT__UA_VALUE,
				 Eastadl21Factory.eINSTANCE.createEAArrayValue()));

		newChildDescriptors.add
			(createChildParameter
				(Eastadl21Package.Literals.USER_ATTRIBUTED_ELEMENT__UA_VALUE,
				 Eastadl21Factory.eINSTANCE.createEABooleanValue()));

		newChildDescriptors.add
			(createChildParameter
				(Eastadl21Package.Literals.USER_ATTRIBUTED_ELEMENT__UA_VALUE,
				 Eastadl21Factory.eINSTANCE.createEACompositeValue()));

		newChildDescriptors.add
			(createChildParameter
				(Eastadl21Package.Literals.USER_ATTRIBUTED_ELEMENT__UA_VALUE,
				 Eastadl21Factory.eINSTANCE.createEAEnumerationValue()));

		newChildDescriptors.add
			(createChildParameter
				(Eastadl21Package.Literals.USER_ATTRIBUTED_ELEMENT__UA_VALUE,
				 Eastadl21Factory.eINSTANCE.createEAExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Eastadl21Package.Literals.USER_ATTRIBUTED_ELEMENT__UA_VALUE,
				 Eastadl21Factory.eINSTANCE.createEANumericalValue()));

		newChildDescriptors.add
			(createChildParameter
				(Eastadl21Package.Literals.USER_ATTRIBUTED_ELEMENT__UA_VALUE,
				 Eastadl21Factory.eINSTANCE.createEAStringValue()));
	}

}
