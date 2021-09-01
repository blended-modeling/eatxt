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

import java.lang.reflect.Proxy;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.sphinx.emf.edit.ExtendedItemProviderAdapter;

public class EastADLItemProviderAdapter extends ExtendedItemProviderAdapter {

	/**
	 * An instance is created from an adapter factory. The factory is used as a key so that we always know which factory
	 * created this adapter.
	 * 
	 * @param adapterFactory
	 *            The factory which created the Adapter.
	 */
	public EastADLItemProviderAdapter(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * org.eclipse.sphinx.emf.edit.ExtendedItemProviderAdapter#createItemPropertyDescriptor(org.eclipse.emf.common.notify
	 * .AdapterFactory, org.eclipse.emf.common.util.ResourceLocator, java.lang.String, java.lang.String,
	 * org.eclipse.emf.ecore.EStructuralFeature, boolean, boolean, boolean, java.lang.Object, java.lang.String,
	 * java.lang.String[])
	 */
	@Override
	protected ItemPropertyDescriptor createItemPropertyDescriptor(AdapterFactory adapterFactory, ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable, boolean multiLine, boolean sortChoices, Object staticImage,
			String category, String[] filterFlags) {
		return new EastADLItemPropertyDescriptor(adapterFactory, resourceLocator, displayName, description, feature, isSettable, multiLine,
				sortChoices, staticImage, category, filterFlags);
	}

	/**
	 * There might be multiple features into the parent where is possible to put a child; the current implementation
	 * tries to reuse the feature where the child had been located initially if possible.
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		if (child instanceof EObject && object instanceof EObject) {
			EStructuralFeature cntFeature = ((EObject) child).eContainingFeature();
			if (cntFeature != null && cntFeature.getEContainingClass() == ((EObject) object).eClass()) {
				return cntFeature;
			}
		}
		return super.getChildFeature(object, child);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#isWrappingNeeded(java.lang.Object)
	 */
	@Override
	protected boolean isWrappingNeeded(Object object) {
		if (object instanceof Proxy) {
			// do not cache children of objects that are proxy not real model elements
			return false;
		} else {
			return super.isWrappingNeeded(object);
		}
	}

}
