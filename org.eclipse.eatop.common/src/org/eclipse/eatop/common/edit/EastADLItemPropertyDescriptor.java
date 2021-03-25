/**
 * <copyright>
 *  
 * Copyright (c) 2014 Continental AG and others.
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 
 * which accompanies this distribution, and is
 * available at http://www.eclipse.org/org/documents/epl-v10.php
 *  
 * Contributors: 
 *     Continental AG - Initial API and implementation
 *  
 * </copyright>
 * 
 */
package org.eclipse.eatop.common.edit;

import java.util.List;

import org.eclipse.eatop.common.internal.messages.Messages;
import org.eclipse.eatop.common.resource.EastADLURIFactory;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.sphinx.emf.edit.ExtendedItemPropertyDescriptor;

public class EastADLItemPropertyDescriptor extends ExtendedItemPropertyDescriptor {

	/**
	 * This creates an instance that uses a resource locator and determines the cell editor from the type of the
	 * structural feature.
	 */
	public EastADLItemPropertyDescriptor(AdapterFactory adapterFactory, ResourceLocator resourceLocator, String displayName, String description,
			EStructuralFeature feature, boolean isSettable) {
		super(adapterFactory, resourceLocator, displayName, description, feature, isSettable, false, false, null, null, null);
	}

	/**
	 * This creates an instance that uses a resource locator, specifies a static image, and determines the cell editor
	 * from the type of the structural feature.
	 */
	public EastADLItemPropertyDescriptor(AdapterFactory adapterFactory, ResourceLocator resourceLocator, String displayName, String description,
			EStructuralFeature feature, boolean isSettable, Object staticImage) {
		super(adapterFactory, resourceLocator, displayName, description, feature, isSettable, false, false, staticImage, null, null);
	}

	/**
	 * This creates an instance that uses a resource locator, specifies a category and filter flags, and determines the
	 * cell editor from the type of the structural feature.
	 */
	public EastADLItemPropertyDescriptor(AdapterFactory adapterFactory, ResourceLocator resourceLocator, String displayName, String description,
			EStructuralFeature feature, boolean isSettable, String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description, feature, isSettable, false, false, null, category, filterFlags);
	}

	/**
	 * This creates an instance that uses a resource locator; specifies a static image, a category, and filter flags;
	 * and determines the cell editor from the type of the structural feature.
	 */
	public EastADLItemPropertyDescriptor(AdapterFactory adapterFactory, ResourceLocator resourceLocator, String displayName, String description,
			EStructuralFeature feature, boolean isSettable, Object staticImage, String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description, feature, isSettable, false, false, staticImage, category, filterFlags);

	}

	/**
	 * This creates an instance that uses a resource locator; indicates whether to be multi-line and to sort choices;
	 * specifies a static image, a category, and filter flags; and determines the cell editor from the type of the
	 * structural feature.
	 */
	public EastADLItemPropertyDescriptor(AdapterFactory adapterFactory, ResourceLocator resourceLocator, String displayName, String description,
			EStructuralFeature feature, boolean isSettable, boolean multiLine, boolean sortChoices, Object staticImage, String category,
			String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description, feature, isSettable, multiLine, sortChoices, staticImage, category,
				filterFlags);
	}

	/**
	 * This creates an instance that uses a resource locator and determines the cell editor from the parent references.
	 */
	public EastADLItemPropertyDescriptor(AdapterFactory adapterFactory, ResourceLocator resourceLocator, String displayName, String description,
			EReference[] parentReferences, boolean isSettable) {
		this(adapterFactory, resourceLocator, displayName, description, parentReferences, isSettable, null, null);
	}

	/**
	 * This creates an instance that uses a resource locator, specifies a category and filter flags, and determines the
	 * cell editor from the parent references.
	 */
	public EastADLItemPropertyDescriptor(AdapterFactory adapterFactory, ResourceLocator resourceLocator, String displayName, String description,
			EReference[] parentReferences, boolean isSettable, String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description, parentReferences, isSettable, category, filterFlags);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.sphinx.emf.edit.ExtendedItemPropertyDescriptor#getLabelProvider(java.lang.Object)
	 */
	@Override
	public IItemLabelProvider getLabelProvider(Object object) {
		final IItemLabelProvider itemLabelProvider = super.getLabelProvider(object);
		return new IItemLabelProvider() {
			@Override
			public String getText(Object object) {
				if (object instanceof EObject) {
					EObject eObject = (EObject) object;
					if (eObject.eIsProxy()) {
						URI proxyUri = EcoreUtil.getURI(eObject);
						if (proxyUri != null) {
							return proxyUri.toString();
						} else {
							return Messages.label_unknownProxyURI;
						}

					}
					if (feature instanceof EReference) {
						String absoluteQualifiedName = EastADLURIFactory.getAbsoluteQualifiedName(eObject);
						if (absoluteQualifiedName.length() > 0) {
							return itemLabelProvider.getText(object) + " [" + absoluteQualifiedName + "]"; //$NON-NLS-1$ //$NON-NLS-2$
						}
					}
				} else if (object instanceof EList<?>) {
					StringBuffer result = new StringBuffer();
					for (Object child : (List<?>) object) {
						if (result.length() != 0) {
							result.append(", "); //$NON-NLS-1$
						}
						result.append(getText(child));
					}
					return result.toString();
				}
				return itemLabelProvider.getText(object);
			}

			@Override
			public Object getImage(Object object) {
				return itemLabelProvider.getImage(object);
			}
		};
	}
}
