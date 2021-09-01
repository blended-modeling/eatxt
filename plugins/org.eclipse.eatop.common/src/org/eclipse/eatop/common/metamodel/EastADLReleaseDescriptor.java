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

import org.eclipse.sphinx.emf.metamodel.AbstractMetaModelDescriptor;
import org.eclipse.sphinx.emf.metamodel.IMetaModelDescriptor;

public class EastADLReleaseDescriptor extends AbstractMetaModelDescriptor implements Comparable<EastADLReleaseDescriptor> {

	/**
	 * The base name of all EAST-ADL metamodel versions.
	 */
	public static final String BASE_NAME = "EAST-ADL"; //$NON-NLS-1$

	/**
	 * The identifier used for referencing this {@link IMetaModelDescriptor}.
	 */
	public static final String ID = "org.eclipse.eatop.eastadl"; //$NON-NLS-1$	

	/**
	 * The base namespace of all EAST-ADL meta models.
	 */
	public static final String BASE_NAMESPACE = "http://east-adl.info"; //$NON-NLS-1$

	/**
	 * The id of release-independent base content type for all release-specific EAST-ADL XML file content types.
	 */
	public static final String EAXML_BASE_CONTENT_TYPE_ID = "org.eclipse.eatop.eastadl.eastadlXMLFile"; //$NON-NLS-1$

	/**
	 * The default file extension used for EAST-ADL XML files.
	 */
	public static final String EAXML_DEFAULT_FILE_EXTENSION = "eaxml"; //$NON-NLS-1$

	/**
	 * Singleton instance.
	 */
	public static final EastADLReleaseDescriptor INSTANCE = new EastADLReleaseDescriptor();

	protected EastADLMetaModelVersionData eastadlVersionData;

	/**
	 * The base uri scheme of all EAST-ADL meta models.
	 */
	public static final String URI_SCHEME = "ea"; //$NON-NLS-1$

	/**
	 * Private default constructor for singleton pattern.
	 */
	private EastADLReleaseDescriptor() {
		super(ID, BASE_NAMESPACE, BASE_NAME);
	}

	protected EastADLReleaseDescriptor(String identifier, EastADLMetaModelVersionData versionData) {
		super(identifier, BASE_NAMESPACE, versionData);

		eastadlVersionData = versionData;
	}

	/*
	 * @see org.eclipse.sphinx.emf.metamodel.AbstractMetaModelDescriptor# getDefaultContentTypeId()
	 */
	@Override
	public String getDefaultContentTypeId() {
		return EAXML_BASE_CONTENT_TYPE_ID;
	}

	public EastADLMetaModelVersionData getEastADLVersionData() {
		return eastadlVersionData;
	}

	/*
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(EastADLReleaseDescriptor other) {
		return eastadlVersionData.compareTo(other.eastadlVersionData);
	}

	/*
	 * @see org.eclipse.sphinx.emf.metamodel.AbstractMetaModelDescriptor# getCustomURIScheme()
	 */
	@Override
	public String getCustomURIScheme() {
		return URI_SCHEME;
	}

}
