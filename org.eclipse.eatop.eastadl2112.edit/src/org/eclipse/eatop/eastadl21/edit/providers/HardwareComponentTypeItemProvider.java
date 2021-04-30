/**
 */
package org.eclipse.eatop.eastadl21.edit.providers;


import java.util.Collection;
import java.util.List;

import org.eclipse.eatop.eastadl21.Eastadl21Factory;
import org.eclipse.eatop.eastadl21.Eastadl21Package;
import org.eclipse.eatop.eastadl21.HardwareComponentType;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.eatop.eastadl21.HardwareComponentType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HardwareComponentTypeItemProvider extends ContextItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareComponentTypeItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(Eastadl21Package.Literals.HARDWARE_COMPONENT_TYPE__PIN);
			childrenFeatures.add(Eastadl21Package.Literals.HARDWARE_COMPONENT_TYPE__PART);
			childrenFeatures.add(Eastadl21Package.Literals.HARDWARE_COMPONENT_TYPE__CONNECTOR);
			childrenFeatures.add(Eastadl21Package.Literals.HARDWARE_COMPONENT_TYPE__PORT);
			childrenFeatures.add(Eastadl21Package.Literals.HARDWARE_COMPONENT_TYPE__PORT_CONNECTOR);
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
	 * This returns HardwareComponentType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HardwareComponentType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((HardwareComponentType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_HardwareComponentType_type") :
			getString("_UI_HardwareComponentType_type") + " " + label;
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

		switch (notification.getFeatureID(HardwareComponentType.class)) {
			case Eastadl21Package.HARDWARE_COMPONENT_TYPE__PIN:
			case Eastadl21Package.HARDWARE_COMPONENT_TYPE__PART:
			case Eastadl21Package.HARDWARE_COMPONENT_TYPE__CONNECTOR:
			case Eastadl21Package.HARDWARE_COMPONENT_TYPE__PORT:
			case Eastadl21Package.HARDWARE_COMPONENT_TYPE__PORT_CONNECTOR:
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
				(Eastadl21Package.Literals.HARDWARE_COMPONENT_TYPE__PIN,
				 Eastadl21Factory.eINSTANCE.createCommunicationHardwarePin()));

		newChildDescriptors.add
			(createChildParameter
				(Eastadl21Package.Literals.HARDWARE_COMPONENT_TYPE__PIN,
				 Eastadl21Factory.eINSTANCE.createIOHardwarePin()));

		newChildDescriptors.add
			(createChildParameter
				(Eastadl21Package.Literals.HARDWARE_COMPONENT_TYPE__PIN,
				 Eastadl21Factory.eINSTANCE.createPowerHardwarePin()));

		newChildDescriptors.add
			(createChildParameter
				(Eastadl21Package.Literals.HARDWARE_COMPONENT_TYPE__PART,
				 Eastadl21Factory.eINSTANCE.createHardwareComponentPrototype()));

		newChildDescriptors.add
			(createChildParameter
				(Eastadl21Package.Literals.HARDWARE_COMPONENT_TYPE__CONNECTOR,
				 Eastadl21Factory.eINSTANCE.createHardwareConnector()));

		newChildDescriptors.add
			(createChildParameter
				(Eastadl21Package.Literals.HARDWARE_COMPONENT_TYPE__PORT,
				 Eastadl21Factory.eINSTANCE.createHardwarePort()));

		newChildDescriptors.add
			(createChildParameter
				(Eastadl21Package.Literals.HARDWARE_COMPONENT_TYPE__PORT_CONNECTOR,
				 Eastadl21Factory.eINSTANCE.createHardwarePortConnector()));

		newChildDescriptors.add
			(createChildParameter
				(Eastadl21Package.Literals.HARDWARE_COMPONENT_TYPE__PORT_CONNECTOR,
				 Eastadl21Factory.eINSTANCE.createLogicalPortConnector()));
	}

}
