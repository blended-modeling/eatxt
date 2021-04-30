/**
 */
package org.eclipse.eatop.eastadl21.edit.providers;


import java.util.Collection;
import java.util.List;

import org.eclipse.eatop.eastadl21.Eastadl21Package;
import org.eclipse.eatop.eastadl21.Quantity;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.eatop.eastadl21.Quantity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class QuantityItemProvider extends EAPackageableElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantityItemProvider(AdapterFactory adapterFactory) {
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

			addAmountOfSubstanceExpPropertyDescriptor(object);
			addElectricCurrentExpPropertyDescriptor(object);
			addLengthExpPropertyDescriptor(object);
			addLuminousIntensityExpPropertyDescriptor(object);
			addMassExpPropertyDescriptor(object);
			addThermodynamicTemperatureExpPropertyDescriptor(object);
			addTimeExpPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Amount Of Substance Exp feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAmountOfSubstanceExpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Quantity_amountOfSubstanceExp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Quantity_amountOfSubstanceExp_feature", "_UI_Quantity_type"),
				 Eastadl21Package.Literals.QUANTITY__AMOUNT_OF_SUBSTANCE_EXP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Electric Current Exp feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addElectricCurrentExpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Quantity_electricCurrentExp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Quantity_electricCurrentExp_feature", "_UI_Quantity_type"),
				 Eastadl21Package.Literals.QUANTITY__ELECTRIC_CURRENT_EXP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Length Exp feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLengthExpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Quantity_lengthExp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Quantity_lengthExp_feature", "_UI_Quantity_type"),
				 Eastadl21Package.Literals.QUANTITY__LENGTH_EXP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Luminous Intensity Exp feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLuminousIntensityExpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Quantity_luminousIntensityExp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Quantity_luminousIntensityExp_feature", "_UI_Quantity_type"),
				 Eastadl21Package.Literals.QUANTITY__LUMINOUS_INTENSITY_EXP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mass Exp feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMassExpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Quantity_massExp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Quantity_massExp_feature", "_UI_Quantity_type"),
				 Eastadl21Package.Literals.QUANTITY__MASS_EXP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Thermodynamic Temperature Exp feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThermodynamicTemperatureExpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Quantity_thermodynamicTemperatureExp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Quantity_thermodynamicTemperatureExp_feature", "_UI_Quantity_type"),
				 Eastadl21Package.Literals.QUANTITY__THERMODYNAMIC_TEMPERATURE_EXP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Time Exp feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeExpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Quantity_timeExp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Quantity_timeExp_feature", "_UI_Quantity_type"),
				 Eastadl21Package.Literals.QUANTITY__TIME_EXP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Quantity.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Quantity"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Quantity)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Quantity_type") :
			getString("_UI_Quantity_type") + " " + label;
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

		switch (notification.getFeatureID(Quantity.class)) {
			case Eastadl21Package.QUANTITY__AMOUNT_OF_SUBSTANCE_EXP:
			case Eastadl21Package.QUANTITY__ELECTRIC_CURRENT_EXP:
			case Eastadl21Package.QUANTITY__LENGTH_EXP:
			case Eastadl21Package.QUANTITY__LUMINOUS_INTENSITY_EXP:
			case Eastadl21Package.QUANTITY__MASS_EXP:
			case Eastadl21Package.QUANTITY__THERMODYNAMIC_TEMPERATURE_EXP:
			case Eastadl21Package.QUANTITY__TIME_EXP:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
