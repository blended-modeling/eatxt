/**
 * <copyright>
 * 
 * Copyright (c) 2014 Arccore and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *     Arccore - Initial API and implementation
 * 
 * </copyright>
 */
package org.eclipse.eatop.common.ui.util;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sphinx.emf.util.WorkspaceEditingDomainUtil;
import org.eclipse.sphinx.emf.util.WorkspaceTransactionUtil;

public class InstanceRefAdder {

	public static void AddInstanceRef(final EObject eo) {
		if (ModelSearcher.hasInstanceRefChild(eo)) {
			return;
		}
		EReference instRef = null;
		for (EReference child : eo.eClass().getEAllContainments()) {
			if (ModelSearcher.isModelElementInInstanceRefPackage(child)) {
				instRef = child;
			}
		}
		EStructuralFeature instRefFeature = null;
		for (EStructuralFeature f : eo.eClass().getEAllStructuralFeatures()) {
			if (f == instRef) {
				instRefFeature = f;
			}
		}
		if (instRef == null || instRefFeature == null) {
			return;
		}
		final EObject createdRef = EcoreUtil.create(instRef.getEReferenceType());
		final String featureName = instRefFeature.getName();
		final EStructuralFeature finalFeature = instRefFeature;

		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				if (finalFeature.isMany()) {
					EList<EObject> l = new BasicEList<EObject>();
					l.add(createdRef);
					eo.eSet(eo.eClass().getEStructuralFeature(featureName), l);
				} else {
					eo.eSet(eo.eClass().getEStructuralFeature(featureName), createdRef);
				}
			}
		};
		TransactionalEditingDomain editingDomain = WorkspaceEditingDomainUtil.getEditingDomain(eo);
		if (editingDomain != null) {
			try {
				WorkspaceTransactionUtil.executeInWriteTransaction(editingDomain, runnable, "createInstanceRef"); //$NON-NLS-1$
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		} else {
			runnable.run();
		}
	}

}
