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
package org.eclipse.eatop.common.internal.messages;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {

	private static final String BUNDLE_NAME = "org.eclipse.eatop.common.internal.messages.Messages"; //$NON-NLS-1$
	public static String error_invalidEastADLURIMustStartWithEastadlScheme;
	public static String error_invalidEastADLURIInvalideDestinationTypeSpecifier;
	public static String error_invalidEastADLURIMustContentQueryDestinationTypeSpecifier;
	public static String error_numericalDT_nullString;

	public static String label_unknownProxyURI;

	public static String EAData00001;
	public static String EAData00002;
	public static String clearing_binaryResources;

	static {
		// Initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
