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

import org.eclipse.eatop.common.internal.messages.Messages;

/**
 * Shares code common to all numerical datatypes
 */
public abstract class AbstractNumericalDatatype implements INumericalDataType {

	/**
	 * Keep the radix of the value, valid values are 2, 8, 10 or 16
	 */
	private byte radix;

	/**
	 * The number of digits of the original number. In case of a decimal number a positive number means that the number
	 * had a '+' symbol as the first character
	 */
	private byte digits;

	/**
	 * @param radix
	 * @param digits
	 */
	protected AbstractNumericalDatatype(int radix, int digits) {
		setNoOfDigits(digits);
		setRadix(radix);
	}

	/**
	 * @param value
	 */
	protected AbstractNumericalDatatype(String value) {
		decode(value);
	}

	/*
	 * @see org.artop.aal.common.datatypes.INumericalDataType#setRadix(int)
	 */
	@Override
	public void setRadix(int radix) {
		this.radix = (byte) radix;
		if (radix == 10) {
			setNoOfDigits(-1);
		}
	}

	/*
	 * @see org.artop.aal.common.datatypes.INumericalDataType#getRadix()
	 */
	@Override
	public byte getRadix() {
		return radix;
	}

	/*
	 * @see org.artop.aal.common.datatypes.INumericalDataType#setNoOfDigits(int)
	 */
	@Override
	public void setNoOfDigits(int digits) {
		this.digits = (byte) digits;
	}

	/*
	 * @see org.artop.aal.common.datatypes.INumericalDataType#getNoOfDigits()
	 */
	@Override
	public byte getNoOfDigits() {
		return digits;
	}

	/*
	 * @see org.artop.aal.common.datatypes.INumericalDataType#encode()
	 */
	@Override
	public String encode() {
		StringBuilder sb = new StringBuilder(digits + 2);
		switch (getRadix()) {
		case 2:
			sb.append("0b"); //$NON-NLS-1$
			break;
		case 8:
			sb.append('0');
			break;
		case 10:
			if (digits != -1 && !isNegative()) {
				sb.append('+');
			}
			break;
		case 16:
			sb.append("0x"); //$NON-NLS-1$
		}
		String value = encodeValue();
		if (getRadix() != 10) {
			int counter = getNoOfDigits() - value.length();
			while (counter-- > 0) {
				sb.append('0');
			}
		}
		sb.append(value);
		return sb.toString();
	}

	/**
	 * Return the encoded value of the string using the current radix. No radix specific prefix or additional "0" shall
	 * be used
	 * 
	 * @return
	 */
	protected abstract String encodeValue();

	/**
	 * Decode the value
	 * 
	 * @param value
	 * @return
	 */
	@Override
	public void decode(String value) {
		if (value == null || value.length() == 0) {
			throw new NumberFormatException(Messages.error_numericalDT_nullString);
		}
		int radix = 0;
		int index = -1;
		int noOfDigits = -1;
		switch (value.charAt(0)) {
		case '0':
			if (value.length() == 1) {
				radix = 10;
				index = 0;
			} else {
				// octal, binary or hexa
				switch (value.charAt(1)) {
				case 'x':
					radix = 16;
					index = 2;
					noOfDigits = value.length() - 2;
					break;
				case 'b':
					radix = 2;
					index = 2;
					noOfDigits = value.length() - 2;
					break;
				default:
					radix = 8;
					index = 1;
					noOfDigits = value.length() - 1;
				}
			}
			break;
		case '+':
			radix = 10;
			index = 1;
			noOfDigits = 1;
			break;
		default:
			radix = 10;
			index = 0;
		}
		doDecode(value.substring(index), radix, noOfDigits);
	}

	/**
	 * @param value
	 * @param index
	 * @param radix
	 * @param noOfDigits
	 */
	protected abstract void doDecode(String value, int radix, int noOfDigits);

	/*
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return encode();
	}

	@Override
	public abstract Object clone();
}
