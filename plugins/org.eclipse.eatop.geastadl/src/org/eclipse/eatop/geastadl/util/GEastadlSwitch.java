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
 * 
 */
package org.eclipse.eatop.geastadl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call
 * {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is
 * returned, which is the result of the switch. <!-- end-user-doc -->
 */
public class GEastadlSwitch<T> {

	private interface Switch<T> {
		T doSwitch(EObject o);
	}

	public T doSwitch(EObject o) {
		Switch<T> swtch = pkgMap.get(o.eClass().getEPackage());
		return swtch == null ? null : swtch.doSwitch(o);
	}

	public T caseGEAXML(org.eclipse.eatop.geastadl.ginfrastructure.gelements.GEAXML aGEAXML) {
		return null;
	}

	public T caseGEAPackage(org.eclipse.eatop.geastadl.ginfrastructure.gelements.GEAPackage aGEAPackage) {
		return null;
	}

	public T caseGEAPackageableElement(org.eclipse.eatop.geastadl.ginfrastructure.gelements.GEAPackageableElement aGEAPackageableElement) {
		return null;
	}

	public T caseGIdentifiable(org.eclipse.eatop.geastadl.ginfrastructure.gelements.GIdentifiable aGIdentifiable) {
		return null;
	}

	public T caseGReferrable(org.eclipse.eatop.geastadl.ginfrastructure.gelements.GReferrable aGReferrable) {
		return null;
	}

	private class Switch1 extends org.eclipse.eatop.geastadl.ginfrastructure.gelements.util.GelementsSwitch<T> implements Switch<T> {

		@Override
		public T caseGEAXML(org.eclipse.eatop.geastadl.ginfrastructure.gelements.GEAXML o) {
			return GEastadlSwitch.this.caseGEAXML(o);
		}

		@Override
		public T caseGEAPackage(org.eclipse.eatop.geastadl.ginfrastructure.gelements.GEAPackage o) {
			return GEastadlSwitch.this.caseGEAPackage(o);
		}

		@Override
		public T caseGEAPackageableElement(org.eclipse.eatop.geastadl.ginfrastructure.gelements.GEAPackageableElement o) {
			return GEastadlSwitch.this.caseGEAPackageableElement(o);
		}

		@Override
		public T caseGIdentifiable(org.eclipse.eatop.geastadl.ginfrastructure.gelements.GIdentifiable o) {
			return GEastadlSwitch.this.caseGIdentifiable(o);
		}

		@Override
		public T caseGReferrable(org.eclipse.eatop.geastadl.ginfrastructure.gelements.GReferrable o) {
			return GEastadlSwitch.this.caseGReferrable(o);
		}
	}

	private class PkgMap extends java.util.HashMap<EPackage, Switch<T>> {
		private static final long serialVersionUID = 1L;

		public PkgMap() {
			put(org.eclipse.eatop.geastadl.ginfrastructure.gelements.GelementsPackage.eINSTANCE, new Switch1());
		}
	}

	private PkgMap pkgMap = new PkgMap();
}