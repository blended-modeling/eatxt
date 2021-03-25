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
package org.eclipse.eatop.common.preferences;

import org.eclipse.core.resources.IMarker;
import org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl;

/**
 * Constants for the EAST-ADL preferences which can be set for the platform and their default values.
 */
public interface IEastADLPreferenceConstants {

	/**
	 * The minor release/revision will be automatically derived from the loaded resource.
	 */
	String PREF_VALUE_AUTO_CONVERSION_MODE = "same_as_in_original_resource"; //$NON-NLS-1$

	/**
	 * The default value the minor release/revision used when saving EAST-ADL XML files
	 */
	String PREF_EAST_ADL_RESOURCE_VERSION_DEFAULT = PREF_VALUE_AUTO_CONVERSION_MODE;

	/**
	 * Id of the EAST-ADL preference which determines if the EAST-ADL XML files are validated against the XSD when
	 * loaded.
	 */
	String PREF_XSD_VALIDATION_ON_LOAD = "xsd_validation_on_load"; //$NON-NLS-1$

	/**
	 * The default value for {@link #PREF_XSD_VALIDATION_ON_LOAD}.
	 */
	boolean PREF_XSD_VALIDATION_ON_LOAD_DEFAULT = Boolean.FALSE;

	/**
	 * 
	 */
	String PREF_XSD_VALIDATION_SEVERITY_LEVEL = "xsd_validation_severity_level"; //$NON-NLS-1$

	int SEVERITY_ERROR = IMarker.SEVERITY_ERROR;
	int SEVERITY_WARNING = IMarker.SEVERITY_WARNING;
	int SEVERITY_INFO = IMarker.SEVERITY_INFO;

	/**
	 * Problems from XSD validation have warning severity by default.
	 */
	int PREF_XSD_VALIDATION_SEVERITY_LEVEL_DEFAULT = SEVERITY_WARNING;

	/**
	 * 
	 */
	String PREF_LIMIT_PROBLEM_INDICATION_ON_LOAD = "limit_problem_indication_on_load"; //$NON-NLS-1$

	/**
	 * The default value for {@link #PREF_EAST_ADL_RELEASE}.
	 */
	boolean PREF_LIMIT_PROBLEM_INDICATION_ON_LOAD_DEFAULT = Boolean.TRUE;

	/**
	 * 
	 */
	String PREF_MAX_PROBLEM_REPORTED_ON_LOAD = "max_problem_reported_on_load"; //$NON-NLS-1$

	/**
	 * The default value for {@link #PREF_MAX_PROBLEM_REPORTED_ON_LOAD}.
	 */
	int PREF_MAX_PROBLEM_REPORTED_ON_LOAD_DEFAULT = 10;

	/**
	 * 
	 */
	String PREF_SYNC_UUIDS = "sync_uuids"; //$NON-NLS-1$

	/**
	 * The default value for {@link #PREF_SYNC_UUIDS}.
	 */
	boolean PREF_SYNC_UUIDS_DEFAULT = Boolean.FALSE;

	/**
	 * Id of the EAST-ADL preference which determines if EMF binary resources are used.
	 * 
	 * @see BinaryResourceImpl
	 */
	String PREF_USE_BINARY_RESOURCE = "use_binary_resource"; //$NON-NLS-1$

	/**
	 * The default value for {@link #PREF_USE_BINARY_RESOURCE}.
	 */
	boolean PREF_USE_BINARY_RESOURCE_DEFAULT = Boolean.FALSE;
}
