/**
 */
package org.eclipse.eatop.eastadl21.edit.providers;


import java.util.Collection;
import java.util.List;

import org.eclipse.eatop.eastadl21.EAPackage;
import org.eclipse.eatop.eastadl21.Eastadl21Factory;
import org.eclipse.eatop.eastadl21.Eastadl21Package;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.eatop.eastadl21.EAPackage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EAPackageItemProvider extends EAElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAPackageItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Eastadl21Package.Literals.EA_PACKAGE__SUB_PACKAGE);
			childrenFeatures.add(Eastadl21Package.Literals.EA_PACKAGE__ELEMENT);
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
	 * This returns EAPackage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EAPackage"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EAPackage)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EAPackage_type") :
			getString("_UI_EAPackage_type") + " " + label;
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

		switch (notification.getFeatureID(EAPackage.class)) {
			case Eastadl21Package.EA_PACKAGE__SUB_PACKAGE:
			case Eastadl21Package.EA_PACKAGE__ELEMENT:
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
				(Eastadl21Package.Literals.EA_PACKAGE__SUB_PACKAGE,
				 Eastadl21Factory.eINSTANCE.createEAPackage()));

		newChildDescriptors.add
			(createChildParameter
				(Eastadl21Package.Literals.EA_PACKAGE__ELEMENT,
				 Eastadl21Factory.eINSTANCE.createDesignLevel()));

		newChildDescriptors.add
			(createChildParameter
				(Eastadl21Package.Literals.EA_PACKAGE__ELEMENT,
				 Eastadl21Factory.eINSTANCE.createAnalysisFunctionType()));

		newChildDescriptors.add
			(createChildParameter
				(Eastadl21Package.Literals.EA_PACKAGE__ELEMENT,
				 Eastadl21Factory.eINSTANCE.createDesignFunctionType()));

		newChildDescriptors.add
			(createChildParameter
				(Eastadl21Package.Literals.EA_PACKAGE__ELEMENT,
				 Eastadl21Factory.eINSTANCE.createBasicSoftwareFunctionType()));

		newChildDescriptors.add
			(createChildParameter
				(Eastadl21Package.Literals.EA_PACKAGE__ELEMENT,
				 Eastadl21Factory.eINSTANCE.createFunctionalDevice()));

		newChildDescriptors.add
			(createChildParameter
				(Eastadl21Package.Literals.EA_PACKAGE__ELEMENT,
				 Eastadl21Factory.eINSTANCE.createFunctionClientServerInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Eastadl21Package.Literals.EA_PACKAGE__ELEMENT,
				 Eastadl21Factory.eINSTANCE.createHardwareFunctionType()));

		newChildDescriptors.add
			(createChildParameter
				(Eastadl21Package.Literals.EA_PACKAGE__ELEMENT,
				 Eastadl21Factory.eINSTANCE.createLocalDeviceManager()));

		newChildDescriptors.add
			(createChildParameter
				(Eastadl21Package.Literals.EA_PACKAGE__ELEMENT,
				 Eastadl21Factory.eINSTANCE.createHardwareComponentType()));

		newChildDescriptors.add
			(createChildParameter
				(Eastadl21Package.Literals.EA_PACKAGE__ELEMENT,
				 Eastadl21Factory.eINSTANCE.createActuator()));

		newChildDescriptors.add
			(createChildParameter
				(Eastadl21Package.Literals.EA_PACKAGE__ELEMENT,
				 Eastadl21Factory.eINSTANCE.createElectricalComponent()));

		newChildDescriptors.add
			(createChildParameter
				(Eastadl21Package.Literals.EA_PACKAGE__ELEMENT,
				 Eastadl21Factory.eINSTANCE.createNode()));

		newChildDescriptors.add
			(createChildParameter
				(Eastadl21Package.Literals.EA_PACKAGE__ELEMENT,
				 Eastadl21Factory.eINSTANCE.createSensor()));

		newChildDescriptors.add
			(createChildParameter
				(Eastadl21Package.Literals.EA_PACKAGE__ELEMENT,
				 Eastadl21Factory.eINSTANCE.createArrayDatatype()));

		newChildDescriptors.add
			(createChildParameter
				(Eastadl21Package.Literals.EA_PACKAGE__ELEMENT,
				 Eastadl21Factory.eINSTANCE.createCompositeDatatype()));

		newChildDescriptors.add
			(createChildParameter
				(Eastadl21Package.Literals.EA_PACKAGE__ELEMENT,
				 Eastadl21Factory.eINSTANCE.createEABoolean()));

		newChildDescriptors.add
			(createChildParameter
				(Eastadl21Package.Literals.EA_PACKAGE__ELEMENT,
				 Eastadl21Factory.eINSTANCE.createEANumerical()));

		newChildDescriptors.add
			(createChildParameter
				(Eastadl21Package.Literals.EA_PACKAGE__ELEMENT,
				 Eastadl21Factory.eINSTANCE.createEAString()));

		newChildDescriptors.add
			(createChildParameter
				(Eastadl21Package.Literals.EA_PACKAGE__ELEMENT,
				 Eastadl21Factory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(Eastadl21Package.Literals.EA_PACKAGE__ELEMENT,
				 Eastadl21Factory.eINSTANCE.createQuantity()));

		newChildDescriptors.add
			(createChildParameter
				(Eastadl21Package.Literals.EA_PACKAGE__ELEMENT,
				 Eastadl21Factory.eINSTANCE.createRangeableValueType()));

		newChildDescriptors.add
			(createChildParameter
				(Eastadl21Package.Literals.EA_PACKAGE__ELEMENT,
				 Eastadl21Factory.eINSTANCE.createUnit()));

		newChildDescriptors.add
			(createChildParameter
				(Eastadl21Package.Literals.EA_PACKAGE__ELEMENT,
				 Eastadl21Factory.eINSTANCE.createUserAttributeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Eastadl21Package.Literals.EA_PACKAGE__ELEMENT,
				 Eastadl21Factory.eINSTANCE.createUserAttributedElement()));

		newChildDescriptors.add
			(createChildParameter
				(Eastadl21Package.Literals.EA_PACKAGE__ELEMENT,
				 Eastadl21Factory.eINSTANCE.createUserElementType()));
	}

}
