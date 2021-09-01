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

/**
 * Common interface of all numerical datatypes
 */
public interface INumericalDataType {

	/**
	 * Set the radix to the one specified by the parameter. Valid values are 2, 8, 10 or 16
	 * 
	 * @param radix
	 */
	public void setRadix(int radix);

	/**
	 * Return the current radix
	 * 
	 * @return
	 */
	public byte getRadix();

	/**
	 * Set the number of digits to be used while encoding the value. Use "-1" to use a minimum number of digits
	 * 
	 * @param digits
	 */
	public void setNoOfDigits(int noOfDigits);

	/**
	 * Return the number of digits that will be used for encoding the value
	 * 
	 * @return
	 */
	public byte getNoOfDigits();

	/**
	 * Return the corresponding value object that holds the numerical value (Integer, Long, Double...)
	 * 
	 * @return
	 */
	public Object basicGetValue();

	/**
	 * @param value
	 */
	public void basicSetValue(Object value);

	/**
	 * Decode the <code>value</code> from its string representation and set the internal fields to the corresponding
	 * values.
	 * 
	 * @param value
	 */
	public void decode(String value);

	/**
	 * Encode the value into its String representation using the current radix and noOfDigits
	 * 
	 * @return
	 */
	public String encode();

	/**
	 * Return true if the encoded number is negative, false otherwise.
	 * 
	 * @return
	 */
	public boolean isNegative();

}
