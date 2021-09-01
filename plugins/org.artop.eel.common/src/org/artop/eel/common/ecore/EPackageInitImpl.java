/**
 * Copyright (c) 2017 IBM Corporation, itemis and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Bosch - Initial API and implementation
 */
package org.artop.eel.common.ecore;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * EPackage initialization interface This class provides a common generic access to locally generated initializer
 * methods
 */
public class EPackageInitImpl extends EPackageImpl {

	/**
	 * Loads the package and any sub-packages from their serialized form.
	 */
	public void loadPackage() {
		// do nothing here by default
	}

	/**
	 * Creates the meta-model objects for the package. This method is guarded to have no affect on any invocation but
	 * its first.
	 */
	public void createPackageContents() {
		// do nothing here by default
	}

	/**
	 * Complete the initialization of the package and its meta-model. This method is guarded to have no affect on any
	 * invocation but its first.
	 */
	public void initializePackageContents() {
		// do nothing here by default
	}

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 */
	public void fixPackageContents() {
		// do nothing here by default
	}

}
