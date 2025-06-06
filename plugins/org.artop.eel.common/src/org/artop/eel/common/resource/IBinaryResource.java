/**
 * Copyright (c) 2013 itemis and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   itemis - Initial API and implementation
 */
package org.artop.eel.common.resource;

public interface IBinaryResource {

	/**
	 * A Boolean option to specify whether transient proxies should be checked or not when loading and/or serializing
	 * EObjects. The default is false.
	 */
	public static String OPTION_CHECK_TRANSIENT_PROXY = "TRANSIENT_PROXY"; //$NON-NLS-1$
}
