/**
 * <copyright>
 * 
 * Copyright (c) 2014 itemis, Arccore and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *     itemis - Initial API and implementation
 *     Arccore - Explorer actions and common source code
 * 
 * </copyright>
 */
package org.eclipse.eatop.common.datatypes;

import org.eclipse.emf.common.util.EList;

/**
 * @param <T>
 */
public interface INumericalDataTypeEList<P, T extends INumericalDataType> extends EList<P> {

	/**
	 * @param index
	 * @return
	 */
	public T getNumericalData(int index);

	public void setNumericalData(int index, T data);

}
