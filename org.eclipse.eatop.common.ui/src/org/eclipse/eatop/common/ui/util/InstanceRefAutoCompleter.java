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

import org.eclipse.eatop.common.ui.internal.messages.Messages;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.viewers.TreePath;

public class InstanceRefAutoCompleter {

	public static void completeInstanceRefContext(EObject instanceref, EStructuralFeature feature, TreePath treePath) {
		EObject chosenTarget = (EObject) treePath.getLastSegment();
		EObject prototypeClass = null;
		// Find prototype closest to the target in the virtual containment tree
		for (int i = treePath.getSegmentCount() - 1; i > 0; i--) {
			EObject eo = (EObject) treePath.getSegment(i);
			if (isPrototype(eo)) {
				prototypeClass = eo.eClass();
				break;
			}
		}

		if (chosenTarget == null || prototypeClass == null) {
			return; // failed
		}

		// Context will consist of all prototypes that are in the path towards target in the virtual containment tree

		EList<EObject> candidates = new BasicEList<EObject>();
		TreePath path = treePath.getParentPath();
		while (path != null && path.getLastSegment() != null) {
			if (((EObject) path.getLastSegment()).eClass() == prototypeClass) {
				candidates.add((EObject) path.getLastSegment());
			}
			path = path.getParentPath();
		}

		if (candidates.size() > 0) {
			instanceref.eSet(feature, candidates);
		}
	}

	private static boolean isPrototype(EObject eo) {
		if (eo instanceof EClass) {
			if (((EClass) eo).getName().equals(Messages.EAPrototype)) {
				return true;
			}
			for (EObject superclass : ((EClass) eo).getEAllSuperTypes()) {
				if (superclass == eo) {
					continue;
				}
				if (isPrototype(superclass)) {
					return true;
				}
			}
			return false;
		} else {
			for (EObject superclass : eo.eClass().getESuperTypes()) {
				if (superclass == eo) {
					continue;
				}
				if (isPrototype(superclass)) {
					return true;
				}
			}
			return false;
		}
	}
}
