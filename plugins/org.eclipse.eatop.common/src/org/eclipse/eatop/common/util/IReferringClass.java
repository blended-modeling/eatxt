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

/**
 * Each EAST-ADL model class that have non-containment references to other EAST-ADL model classes will also implement
 * this interface that provide set/get access to the value of the "DEST" attribute used by the "-REF", "-IREF" or
 * "-TREF" xml element.<br/>
 * Implementation note:<br/>
 * <ul>
 * <li>If the DEST is null, the xml.name annotation shall be used during serialization</li>
 * <li>If the DEST is an empty string, no DEST attribute shall be generated during serialization</li>
 * <li>When a reference is set the DEST value stored for it is reset to null. As a result, if a particular DEST is
 * required, it shall be set AFTER the reference is set</li>
 * </ul>
 */
public interface IReferringClass {

	public static final int NO_INDEX = -1;

	/**
	 * Set the value of the DEST attribute. Please note that this method have to be called AFTER the reference is set.
	 * 
	 * @param referenceID
	 *            The ID of the non-containment reference.
	 * @param dest
	 *            The value of the DEST
	 */
	public void eSetReferringDest(int referenceID, String dest);

	/**
	 * Set the value of the DEST attribute. Please note that this method have to be called AFTER the reference is set.
	 * 
	 * @param referenceID
	 *            The ID of the non-containment reference.
	 * @param index
	 *            The index of the value in a many non-containment reference. Ignored if the reference have an upper
	 *            multiplicity of 1
	 * @param dest
	 *            The value of the DEST
	 */
	public void eSetReferringDest(int referenceID, int index, String dest);

	/**
	 * Get the value of the DEST attribute. Please note that null or empty string have special meaning as per
	 * {@link IReferringClass class} notes.
	 * 
	 * @param referenceID
	 *            The ID of the non-containment reference.
	 * @return The value of the DEST, could be null or an empty string
	 */
	public String eGetReferringDest(int referenceID);

	/**
	 * Get the value of the DEST attribute. Please note that null or empty string have special meaning as per
	 * {@link IReferringClass class} notes.
	 * 
	 * @param referenceID
	 *            The ID of the non-containment reference.
	 * @param index
	 *            The index of the value in a many non-containment reference. Ignored if the reference have an upper
	 *            multiplicity of 1
	 * @return The value of the DEST, could be null or an empty string
	 */
	public String eGetReferringDest(int referenceID, int index);

}
