/**
 */
package org.eclipse.eatop.eastadl21.edit.providers;


import java.util.Collection;
import java.util.List;

import org.eclipse.eatop.eastadl21.Eastadl21Factory;
import org.eclipse.eatop.eastadl21.Eastadl21Package;
import org.eclipse.eatop.eastadl21.HardwarePort;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.eatop.eastadl21.HardwarePort} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HardwarePortItemProvider extends EAPortItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwarePortItemProvider(AdapterFactory adapterFactory) {
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

			addShortNamePropertyDescriptor(object);
			addCategoryPropertyDescriptor(object);
			addUuidPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addIsShieldPropertyDescriptor(object);
			addReferencedPinPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Short Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShortNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Referrable_shortName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Referrable_shortName_feature", "_UI_Referrable_type"),
				 Eastadl21Package.Literals.REFERRABLE__SHORT_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Category feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCategoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Identifiable_category_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Identifiable_category_feature", "_UI_Identifiable_type"),
				 Eastadl21Package.Literals.IDENTIFIABLE__CATEGORY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Uuid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUuidPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Identifiable_uuid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Identifiable_uuid_feature", "_UI_Identifiable_type"),
				 Eastadl21Package.Literals.IDENTIFIABLE__UUID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EAElement_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EAElement_name_feature", "_UI_EAElement_type"),
				 Eastadl21Package.Literals.EA_ELEMENT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Shield feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsShieldPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HardwarePort_isShield_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HardwarePort_isShield_feature", "_UI_HardwarePort_type"),
				 Eastadl21Package.Literals.HARDWARE_PORT__IS_SHIELD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Referenced Pin feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReferencedPinPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HardwarePort_referencedPin_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HardwarePort_referencedPin_feature", "_UI_HardwarePort_type"),
				 Eastadl21Package.Literals.HARDWARE_PORT__REFERENCED_PIN,
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
			childrenFeatures.add(Eastadl21Package.Literals.EA_ELEMENT__OWNED_COMMENT);
			childrenFeatures.add(Eastadl21Package.Literals.HARDWARE_PORT__CONTAINED_PIN);
			childrenFeatures.add(Eastadl21Package.Literals.HARDWARE_PORT__CONTAINED_PORT);
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
	 * This returns HardwarePort.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HardwarePort"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((HardwarePort)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_HardwarePort_type") :
			getString("_UI_HardwarePort_type") + " " + label;
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

		switch (notification.getFeatureID(HardwarePort.class)) {
			case Eastadl21Package.HARDWARE_PORT__GSHORT_NAME:
			case Eastadl21Package.HARDWARE_PORT__SHORT_NAME:
			case Eastadl21Package.HARDWARE_PORT__CATEGORY:
			case Eastadl21Package.HARDWARE_PORT__UUID:
			case Eastadl21Package.HARDWARE_PORT__NAME:
			case Eastadl21Package.HARDWARE_PORT__IS_SHIELD:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Eastadl21Package.HARDWARE_PORT__OWNED_COMMENT:
			case Eastadl21Package.HARDWARE_PORT__CONTAINED_PIN:
			case Eastadl21Package.HARDWARE_PORT__CONTAINED_PORT:
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
				(Eastadl21Package.Literals.EA_ELEMENT__OWNED_COMMENT,
				 Eastadl21Factory.eINSTANCE.createComment()));

		newChildDescriptors.add
			(createChildParameter
				(Eastadl21Package.Literals.EA_ELEMENT__OWNED_COMMENT,
				 Eastadl21Factory.eINSTANCE.createRationale()));

		newChildDescriptors.add
			(createChildParameter
				(Eastadl21Package.Literals.HARDWARE_PORT__CONTAINED_PIN,
				 Eastadl21Factory.eINSTANCE.createCommunicationHardwarePin()));

		newChildDescriptors.add
			(createChildParameter
				(Eastadl21Package.Literals.HARDWARE_PORT__CONTAINED_PIN,
				 Eastadl21Factory.eINSTANCE.createIOHardwarePin()));

		newChildDescriptors.add
			(createChildParameter
				(Eastadl21Package.Literals.HARDWARE_PORT__CONTAINED_PIN,
				 Eastadl21Factory.eINSTANCE.createPowerHardwarePin()));

		newChildDescriptors.add
			(createChildParameter
				(Eastadl21Package.Literals.HARDWARE_PORT__CONTAINED_PORT,
				 Eastadl21Factory.eINSTANCE.createHardwarePort()));
	}

}
