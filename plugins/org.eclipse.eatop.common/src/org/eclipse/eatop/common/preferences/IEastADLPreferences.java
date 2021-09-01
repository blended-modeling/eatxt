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

import org.eclipse.eatop.common.internal.Activator;
import org.eclipse.sphinx.platform.preferences.BooleanWorkspacePreference;
import org.eclipse.sphinx.platform.preferences.IWorkspacePreference;
import org.eclipse.sphinx.platform.preferences.IntegerWorkspacePreference;

/**
 * A set of preferences through which users can adjust the way how they work with EAST-ADL models.
 */
public interface IEastADLPreferences {

	/**
	 * Can be defined globally at workspace level.
	 */
	IWorkspacePreference<Boolean> XSD_VALIDATION_ON_LOAD = new BooleanWorkspacePreference(Activator.getPlugin().getSymbolicName(),
			IEastADLPreferenceConstants.PREF_XSD_VALIDATION_ON_LOAD, IEastADLPreferenceConstants.PREF_XSD_VALIDATION_ON_LOAD_DEFAULT);

	/**
	 * Can be defined globally at workspace level.
	 */
	IWorkspacePreference<Integer> XSD_VALIDATION_SEVERITY_LEVEL = new IntegerWorkspacePreference(Activator.getPlugin().getSymbolicName(),
			IEastADLPreferenceConstants.PREF_XSD_VALIDATION_SEVERITY_LEVEL, IEastADLPreferenceConstants.PREF_XSD_VALIDATION_SEVERITY_LEVEL_DEFAULT);

	/**
	 * Can be defined globally at workspace level.
	 */
	IWorkspacePreference<Boolean> LIMIT_PROBLEM_INDICATION_ON_LOAD = new BooleanWorkspacePreference(Activator.getPlugin().getSymbolicName(),
			IEastADLPreferenceConstants.PREF_LIMIT_PROBLEM_INDICATION_ON_LOAD,
			IEastADLPreferenceConstants.PREF_LIMIT_PROBLEM_INDICATION_ON_LOAD_DEFAULT);

	/**
	 * Can be defined globally at workspace level.
	 */
	IWorkspacePreference<Integer> MAX_PROBLEM_REPORTED_ON_LOAD = new IntegerWorkspacePreference(Activator.getPlugin().getSymbolicName(),
			IEastADLPreferenceConstants.PREF_MAX_PROBLEM_REPORTED_ON_LOAD, IEastADLPreferenceConstants.PREF_MAX_PROBLEM_REPORTED_ON_LOAD_DEFAULT);

	/**
	 * Can be defined globally at workspace level.
	 */
	IWorkspacePreference<Boolean> SYNC_UUIDS = new BooleanWorkspacePreference(Activator.getPlugin().getSymbolicName(),
			IEastADLPreferenceConstants.PREF_SYNC_UUIDS, IEastADLPreferenceConstants.PREF_SYNC_UUIDS_DEFAULT);

	/**
	 * Can be defined globally at workspace level.
	 */
	IWorkspacePreference<Boolean> PREF_USE_BINARY_RESOURCE = new BooleanWorkspacePreference(Activator.getPlugin().getSymbolicName(),
			IEastADLPreferenceConstants.PREF_USE_BINARY_RESOURCE, IEastADLPreferenceConstants.PREF_USE_BINARY_RESOURCE_DEFAULT);
}
