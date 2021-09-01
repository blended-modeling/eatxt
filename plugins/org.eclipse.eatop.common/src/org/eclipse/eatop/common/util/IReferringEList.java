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
 */
package org.eclipse.eatop.common.util;

import org.eclipse.emf.common.util.EList;

/**
 * A specialist {@link EList} implementation that support also storing the DEST values
 * 
 * @param <E>
 */
public interface IReferringEList<E> extends EList<E> {

	/**
	 * Set the DEST value for the reference stored at position index
	 * 
	 * @param index
	 *            the index of the reference
	 * @param dest
	 *            the dest value. If null any existing dest will be cleared.
	 */
	public void setReferringDest(int index, String dest);

	/**
	 * Return the DEST value for the reference stored at position index
	 * 
	 * @param index
	 *            the index of the reference
	 * @return the dest value or null if there is no dest attached
	 */
	public String getReferringDest(int index);

}
