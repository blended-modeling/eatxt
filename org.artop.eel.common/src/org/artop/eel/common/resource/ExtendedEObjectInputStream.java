/**
 * Copyright (c) 2007-2013 IBM Corporation, Geensoft, itemis and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *   Geensoft - Binary resource support, release descriptor support
 *   itemis - Refactored to provide code copied from Eclipse under EPL
 */
package org.artop.eel.common.resource;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl.EObjectInputStream;

public class ExtendedEObjectInputStream extends EObjectInputStream {

	/**
	 * A boolean flag that indicate if transient proxies should be checked or not when loading EObjects.
	 */
	protected boolean shouldCheckTransientProxy = false;

	/**
	 * Creates a new EObjectInputStream with given inputStream and load options.
	 * 
	 * @param inputStream
	 *            an input stream.
	 * @param options
	 *            A map of options used to control the load process independently of the model.
	 * @throws IOException
	 */
	public ExtendedEObjectInputStream(InputStream inputStream, Map<?, ?> options) throws IOException {
		this(inputStream, options, options != null && options.containsKey(IBinaryResource.OPTION_CHECK_TRANSIENT_PROXY) ? (Boolean) options
				.get(IBinaryResource.OPTION_CHECK_TRANSIENT_PROXY) : false);
	}

	/**
	 * Creates a new EObjectInputStream with given inputStream, load options and a boolean flag that indicate if
	 * transient proxies should be checked or not when loading EObjects.
	 * 
	 * @param inputStream
	 *            an input stream.
	 * @param options
	 *            A map of options used to control the save/load process independently of the model.
	 * @param shouldCheckTransientProxy
	 *            a boolean flag that indicate if transient proxies should be checked or not when loading EObjects
	 * @throws IOException
	 */
	public ExtendedEObjectInputStream(InputStream inputStream, Map<?, ?> options, boolean shouldCheckTransientProxy) throws IOException {
		super(inputStream, options);

		this.shouldCheckTransientProxy = shouldCheckTransientProxy;
	}

	/*
	 * Copied from BinaryResourceImpl.EObjectInputStream#loadEObject() to handle pre and post load of feature values
	 * @see org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl.EObjectInputStream#loadEObject()
	 */
	@Override
	public InternalEObject loadEObject() throws IOException {
		int id = readCompressedInt();
		if (id == -1) {
			return null;
		} else {
			if (eObjectList.size() <= id) {
				EClassData eClassData = readEClass();
				InternalEObject internalEObject = (InternalEObject) eClassData.eFactory.create(eClassData.eClass);
				eObjectList.add(internalEObject);

				Map<String, String> destValues = new HashMap<String, String>();
				preLoadFeatureValues(internalEObject, destValues);

				for (;;) {
					int featureID = readCompressedInt() - 1;
					if (featureID == -1) {
						break;
					} else if (featureID == -2) {
						internalEObject.eSetProxyURI(readURI());
						if (!shouldCheckTransientProxy || (style & STYLE_PROXY_ATTRIBUTES) == 0) {
							break;
						}
					} else {
						EStructuralFeatureData eStructuralFeatureData = getEStructuralFeatureData(eClassData, featureID);
						loadFeatureValue(internalEObject, eStructuralFeatureData);
					}
				}

				postLoadFeatureValues(internalEObject, destValues);
				return internalEObject;
			} else {
				return eObjectList.get(id);
			}
		}
	}

	/**
	 * Handle pre-load of all feature values of an object. Subclasses should override this method to provide concrete
	 * implementation.
	 */
	protected void preLoadFeatureValues(InternalEObject internalEObject, Map<String, String> destValues) throws IOException {
		// Do nothing by default.
	}

	/**
	 * Handle post-load of all feature values of an object. Subclasses should override this method to provide concrete
	 * implementation.
	 */
	protected void postLoadFeatureValues(InternalEObject internalEObject, Map<String, String> destValues) throws IOException {
		// Do nothing by default.
	}
}
