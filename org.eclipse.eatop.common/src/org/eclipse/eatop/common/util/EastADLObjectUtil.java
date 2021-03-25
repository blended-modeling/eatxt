/**
 * <copyright>
 * 
 * Copyright (c) 2014 itemis and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *     itemis - Initial API and implementation
 * 
 * </copyright>
 */
package org.eclipse.eatop.common.util;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * An utility class providing helper methods for turning an EAObject into a proxy object by using the EASTADL URI
 * schema.
 */
public class EastADLObjectUtil {

	/**
	 * A map that associates to an EAObject another map in which the key is featureID_index where featureID is the id of
	 * the feature which has a reference with an abstract destination and index the index of the reference if there
	 * might be many, and the value is the name of the DEST field. The map key could probably be more specific than
	 * EObject, but this avoids a dependency on GEAObject.
	 */
	private static Map<EObject, Map<String, String>> eaObjectToAbstractDests = Collections
			.synchronizedMap(new WeakHashMap<EObject, Map<String, String>>());

	/**
	 * Tests if given object is an EastADL EAObject.
	 * 
	 * @param object
	 *            The object to be tested.
	 * @return <code>true</code> if given object is an EastADL EAObject, <code>false</code> otherwise.
	 */
	public static boolean isEaObject(Object object) {
		if (object instanceof EObject) {
			/*
			 * Performance optimization: We could test if given object is an instance of EAObject by using
			 * EObjectUtil#isAssignableFrom(EClass, String). But this method recursively walks up the obejct's
			 * inheritance hierarchy until the object's type name matches the specified type name which may be quite low
			 * performing in certain cases. Therefore we refer to the qualified name of the Java package behind the
			 * given object and check if it matches the namespace of one of the EastADL meta model implementations in
			 * Eatop. This way we can be sure that there will always be only a single string comparison to be done.
			 */
			return object.getClass().getName().matches("eastadl\\d\\w\\..*"); //$NON-NLS-1$
		}
		return false;
	}

	/**
	 * Tests if given {@link Resource} is an EastADL resource.
	 * 
	 * @param resource
	 *            The {@link Resource} to be tested.
	 * @return <code>true</code> if given {@link Resource} is an EastADL resource, <code>false</code> otherwise.
	 */
	public static boolean isEastADLResource(Resource resource) {
		if (resource != null) {
			List<EObject> contents = resource.getContents();
			if (contents.size() > 0) {
				return isEaObject(contents.get(0));
			}
		}
		return false;
	}

	public static Map<String, String> getEObjectAbstractDests(EObject referenceContainer) {
		return eaObjectToAbstractDests.get(referenceContainer);
	}

	/**
	 * Gets the value of dest attribute associated with given container, featureID and index. This is linked to abstract
	 * destination handling.
	 * 
	 * @param referenceContainer
	 *            The container of the reference.
	 * @param featureID
	 *            The feature ID of the reference..
	 * @param index
	 *            The index in case the reference is many, {@link NO_INDEX other}.
	 * @return
	 */
	public static String getDest(EObject referenceContainer, int featureID, int index) {
		String dest = null;
		Map<String, String> featureIDAndIndexToDest = eaObjectToAbstractDests.get(referenceContainer);
		if (featureIDAndIndexToDest != null) {
			StringBuilder buffer = new StringBuilder();
			buffer.append(featureID);
			buffer.append(" "); //$NON-NLS-1$
			buffer.append(index);
			dest = featureIDAndIndexToDest.get(buffer.toString());
		}
		return dest;
	}

	/**
	 * Defines the dest attribute associated with given container, featureID and index. This is linked to abstract
	 * references support
	 * 
	 * @param referenceContainer
	 *            The container of the reference
	 * @param featureID
	 *            The feature id of the reference.
	 * @param index
	 *            The index.
	 * @param dest
	 *            The dest attribute value. If null, any existing dest stored for the feature will be removed
	 */
	public static void setDest(EObject referenceContainer, int featureID, int index, String dest) {
		StringBuilder buffer = new StringBuilder();
		buffer.append(featureID);
		buffer.append(" "); //$NON-NLS-1$
		buffer.append(index);
		setDest(referenceContainer, buffer.toString(), dest);
	}

	/**
	 * Shift all existing dest values stored for a particular reference container and feature one position up
	 * 
	 * @param referenceContainer
	 *            The container of the reference
	 * @param featureID
	 *            The feature id of the reference.
	 * @param startIndex
	 *            the index from where to start shifting
	 * @param endIndex
	 *            the index up to where the shifting shall be performed
	 */
	public static void shiftDestUp(EObject referenceContainer, int featureID, int startIndex, int endIndex) {
		Map<String, String> destMap = eaObjectToAbstractDests.get(referenceContainer);
		if (destMap != null) {
			int index = endIndex;
			while (index >= startIndex) {
				StringBuilder buffer = new StringBuilder();
				buffer.append(featureID);
				buffer.append(" "); //$NON-NLS-1$
				buffer.append(index);
				String dest = destMap.get(buffer.toString());
				if (dest != null) {
					// remove the value and store it for index+1
					destMap.remove(buffer.toString());
					buffer = new StringBuilder();
					buffer.append(featureID);
					buffer.append(" "); //$NON-NLS-1$
					buffer.append(index + 1);
					destMap.put(buffer.toString(), dest);
				}
				index--;
			}
		}
	}

	/**
	 * Shift all existing dest values stored for a particular reference container and feature one position down
	 * 
	 * @param referenceContainer
	 *            The container of the reference
	 * @param featureID
	 *            The feature id of the reference.
	 * @param startIndex
	 *            the index from where to start shifting
	 * @param endIndex
	 *            the index up to where the shifting shall be performed
	 */
	public static void shiftDestDown(EObject referenceContainer, int featureID, int startIndex, int endIndex) {
		Map<String, String> destMap = eaObjectToAbstractDests.get(referenceContainer);
		if (destMap != null) {
			int index = startIndex;
			while (index <= endIndex) {
				StringBuilder buffer = new StringBuilder();
				buffer.append(featureID);
				buffer.append(" "); //$NON-NLS-1$
				buffer.append(index);
				String dest = destMap.get(buffer.toString());
				if (dest != null) {
					// remove the value and store it for index-1
					destMap.remove(buffer.toString());
					buffer = new StringBuilder();
					buffer.append(featureID);
					buffer.append(" "); //$NON-NLS-1$
					buffer.append(index - 1);
					destMap.put(buffer.toString(), dest);
				}
				index++;
			}
		}
	}

	/**
	 * Defines the dest attribute associated with given container, key. This is linked to abstract references support
	 * 
	 * @param referenceContainer
	 *            The container of the reference
	 * @param key
	 *            The key, which is "[featureID] [index]"
	 * @param dest
	 *            The dest attribute value.
	 */
	public static void setDest(EObject referenceContainer, String key, String dest) {
		Map<String, String> featureIDAndIndexToDest = eaObjectToAbstractDests.get(referenceContainer);
		if (featureIDAndIndexToDest == null && dest != null) {
			featureIDAndIndexToDest = new HashMap<String, String>();
			eaObjectToAbstractDests.put(referenceContainer, featureIDAndIndexToDest);
		}
		if (featureIDAndIndexToDest != null) {
			if (dest == null) {
				featureIDAndIndexToDest.remove(key);
				if (featureIDAndIndexToDest.isEmpty()) {
					eaObjectToAbstractDests.remove(referenceContainer);
				}
			} else {
				featureIDAndIndexToDest.put(key, dest);
			}
		}
	}

}
