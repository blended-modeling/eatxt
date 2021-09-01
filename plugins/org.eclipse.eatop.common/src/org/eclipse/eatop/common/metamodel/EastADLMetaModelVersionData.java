/**
 * <copyright>
 * 
 * Copyright (c) 2014 itemis and others.
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 
 * which accompanies this distribution, and is
 * available at http://www.eclipse.org/org/documents/epl-v10.php
 * 
 * Contributors: 
 *     itemis - Initial API and implementation
 * 
 * </copyright>
 */
package org.eclipse.eatop.common.metamodel;

import org.eclipse.sphinx.emf.metamodel.MetaModelVersionData;

public class EastADLMetaModelVersionData extends MetaModelVersionData implements Comparable<EastADLMetaModelVersionData> {

	protected static String getNsPostfix(int major, int minor, int revision) {
		return major + "." + minor + "." + revision; //$NON-NLS-1$ //$NON-NLS-2$
	}

	private int major;
	private int minor;
	private int revision;

	public EastADLMetaModelVersionData(String name, int major, int minor, int revision) {
		super(getNsPostfix(major, minor, revision), getNsPostfix(major, minor, revision), name, EastADLReleaseDescriptor.INSTANCE);
		this.major = major;
		this.minor = minor;
		this.revision = revision;
	}

	public int getMajor() {
		return major;
	}

	public int getMinor() {
		return minor;
	}

	public int getRevision() {
		return revision;
	}

	@Override
	public int compareTo(EastADLMetaModelVersionData other) {
		int result;

		result = new Integer(major).compareTo(other.major);
		if (result != 0) {
			return result;
		}

		result = new Integer(minor).compareTo(other.minor);
		if (result != 0) {
			return result;
		}

		result = new Integer(revision).compareTo(other.revision);

		return result;
	}
}
