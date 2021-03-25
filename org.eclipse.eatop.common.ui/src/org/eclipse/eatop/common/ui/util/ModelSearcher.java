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

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.eatop.geastadl.ginfrastructure.gelements.GIdentifiable;
import org.eclipse.eatop.geastadl.ginfrastructure.gelements.GReferrable;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.sphinx.emf.util.EObjectUtil;

/**
 * @author jutt
 */
public class ModelSearcher {

	private static String INSTANCE_REF_PACK = "_instancerefPackageImpl"; //$NON-NLS-1$
	private static String INSTANCE_REF = "_instanceref"; //$NON-NLS-1$
	private static Map<String, String> prettyPackageNames;

	static {
		Map<String, String> m = new HashMap<String, String>();
		// No need to add single-word packages, they will be shown correctly
		m.put("systemmodeling", "System Modeling"); //$NON-NLS-1$ //$NON-NLS-2$
		m.put("featuremodeling", "Feature Modeling"); //$NON-NLS-1$ //$NON-NLS-2$
		m.put("vehiclefeaturemodeling", "Vehicle Feature Modeling"); //$NON-NLS-1$ //$NON-NLS-2$
		m.put("functionmodeling", "Function Modeling"); //$NON-NLS-1$ //$NON-NLS-2$
		m.put("hardwaremodeling", "Hardware Modeling"); //$NON-NLS-1$ //$NON-NLS-2$

		m.put("usecases", "Use Cases"); //$NON-NLS-1$ //$NON-NLS-2$
		m.put("verificationvalidation", "Verification && Validation"); //$NON-NLS-1$ //$NON-NLS-2$

		m.put("timingconstraints", "Timing Constraints"); //$NON-NLS-1$ //$NON-NLS-2$

		m.put("safetyconstraints", "Safety Constraints"); //$NON-NLS-1$ //$NON-NLS-2$
		m.put("errormodel", "Error Model"); //$NON-NLS-1$ //$NON-NLS-2$
		m.put("safetyrequirement", "Safety Requirement"); //$NON-NLS-1$ //$NON-NLS-2$
		m.put("safetycase", "Safety Case"); //$NON-NLS-1$ //$NON-NLS-2$
		m.put("genericconstraints", "Generic Constraints"); //$NON-NLS-1$ //$NON-NLS-2$

		m.put("userattributes", "User Attributes"); //$NON-NLS-1$ //$NON-NLS-2$
		m.put("behaviordescription", "Behavior Description"); //$NON-NLS-1$ //$NON-NLS-2$

		m.put("attributequantificationconstraint", "Attribute Quantification Constraint"); //$NON-NLS-1$ //$NON-NLS-2$

		m.put("elements", "Packages and Comments"); //$NON-NLS-1$ //$NON-NLS-2$
		m.put("_instanceref", "Instance References"); //$NON-NLS-1$ //$NON-NLS-2$
		prettyPackageNames = Collections.unmodifiableMap(m);
	}

	/**
	 * Calculate the path of the given EObject
	 *
	 * @param e
	 *            The EObject to calculate the path for
	 * @return The path of the given EObject
	 */
	public static String getPath(EObject e) {
		EObject container = e.eContainer();
		if (e instanceof GIdentifiable) {
			return getPath(container) + "/" + ((GIdentifiable) e).gGetShortName(); //$NON-NLS-1$
		} else if (container != null) {
			return getPath(container);
		} else {
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * Searching for reference values referring to target. All resources in the resource set are searched.
	 *
	 * @param target
	 *            The object referred to.
	 * @return A list of all objects found.
	 */
	public static ArrayList<EObject> findReferences(EObject target) {
		Collection<Setting> newReferences = EObjectUtil.getInverseReferences(target, true);
		ArrayList<EObject> newRefs = new ArrayList<EObject>();
		for (Setting ref : newReferences) {
			EObject eo = ref.getEObject();
			if (isReference(target, eo)) {
				newRefs.add(eo);
			}
		}
		return newRefs;
	}

	private static boolean isReference(EObject target, EObject ref) {
		if (ref == target.eContainer() || target == ref.eContainer()) {
			return false;
		}

		if (isTypeOf(target, ref)) {
			return false;
		}

		if (ref.eClass().eContainer().getClass().getName().endsWith(INSTANCE_REF_PACK)) {
			return false;
		}

		return ref.eContents().contains(target) || ref.eCrossReferences().contains(target);
	}

	/**
	 * Searching for reference values referring to target. All resources in the resource set are searched.
	 *
	 * @param target
	 *            The object referred to.
	 * @return A list of all objects found.
	 */
	public static ArrayList<EObject> findInstanceReferences(EObject target) {
		Collection<Setting> newReferences = EObjectUtil.getInverseReferences(target, true);
		ArrayList<EObject> newRefs = new ArrayList<EObject>();
		for (Setting ref : newReferences) {
			EObject eo = ref.getEObject();
			if (isInstanceReference(target, eo)) {
				newRefs.add(eo);
			}
		}
		return newRefs;
	}

	public static boolean hasInstanceRefChild(EObject parent) {
		boolean result = false;

		for (EObject child : parent.eContents()) {
			result = isModelElementInInstanceRefPackage(child);
			if (result) {
				return result;
			}
		}
		return result;
	}

	public static ArrayList<EObject> getInstanceRefChildren(EObject parent) {
		ArrayList<EObject> children = new ArrayList<EObject>();

		for (EObject child : parent.eContents()) {
			if (isModelElementInInstanceRefPackage(child)) {
				children.add(child);
			}
		}

		return children;
	}

	public static List<EObject> getAssociationChildren(EObject parent) {
		List<EObject> children = new ArrayList<EObject>();
		for (EObject child : parent.eContents()) {
			if (isAssociationClassElement(child)) {
				children.add(child);
			}
		}
		return children;
	}

	private static boolean isAssociationClassElement(EObject child) {
		if (child.eClass().getName().equals("Satisfy") || child.eClass().getName().equals("Refine") || child.eClass().getName().equals("Extend") //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				|| child.eClass().getName().equals("Include") || child.eClass().getName().equals("VVCase") //$NON-NLS-1$ //$NON-NLS-2$
				|| child.eClass().getName().equals("VVTarget")) { //$NON-NLS-1$
			return true;
		}
		return false;
	}

	public static boolean canCreateInstanceRefChild(EObject target) {
		boolean result = false;

		for (EReference child : target.eClass().getEAllContainments()) {
			result = isModelElementInInstanceRefPackage(child);
			if (result) {
				return result;
			}
		}
		return result;
	}

	public static boolean isInstanceRef(EObject target) {
		return isModelElementInInstanceRefPackage(target);
	}

	public static boolean isModelElementInInstanceRefPackage(EObject target) {
		EStructuralFeature eStructuralFeature = target.eClass().eContainer().eClass().getEStructuralFeature("name"); //$NON-NLS-1$
		String packageName = target.eClass().eContainer().eGet(eStructuralFeature).toString();
		for (EAnnotation annotation : target.eClass().getEAnnotations()) {
			if (annotation.getSource().equals("Stereotype") && annotation.getDetails().get("Stereotype") != null) { //$NON-NLS-1$ //$NON-NLS-2$
				String str = annotation.getDetails().get("Stereotype"); //$NON-NLS-1$
				return str.equals("instanceRef"); //$NON-NLS-1$
			}
		}

		return packageName.contains(INSTANCE_REF);
	}

	private static boolean isModelElementInInstanceRefPackage(EReference target) {
		EStructuralFeature eStructuralFeature = target.getEType().eContainer().eClass().getEStructuralFeature("name"); //$NON-NLS-1$
		String packageName = target.getEType().eContainer().eGet(eStructuralFeature).toString();
		for (EAnnotation annotation : target.getEType().getEAnnotations()) {
			if (annotation.getSource().equals("Stereotype") && annotation.getDetails().get("Stereotype") != null) { //$NON-NLS-1$ //$NON-NLS-2$
				String str = annotation.getDetails().get("Stereotype"); //$NON-NLS-1$
				return str.equals("instanceRef"); //$NON-NLS-1$
			}
		}
		packageName = getOriginalMetamodelPackage(target.getEType());

		return packageName.contains(INSTANCE_REF);
	}

	private static boolean isInstanceReference(EObject target, EObject ref) {
		if (ref == target.eContainer() || target == ref.eContainer()) {
			return false;
		}

		if (isTypeOf(target, ref)) {
			return false;
		}

		return ref.eClass().eContainer().getClass().getName().endsWith(INSTANCE_REF_PACK)
				&& (ref.eContents().contains(target) || ref.eCrossReferences().contains(target));
	}

	public static boolean isTypeOf(EObject typeElement, EObject ref) {
		EStructuralFeature eStructuralFeature = ref.eClass().getEStructuralFeature("type"); //$NON-NLS-1$

		if (eStructuralFeature != null) {
			Object eGet = ref.eGet(eStructuralFeature);

			if (eGet != null && eGet instanceof EObject) {
				return (EObject) eGet == typeElement;
			}
		}

		return false;
	}

	/*
	 * Method to extract the name of an EObject in its parent
	 */
	public static String elementNameInParent(EObject target) {
		String name = target.eContainingFeature().getName();
		name = name.substring(0, 1).toUpperCase() + name.substring(1);

		return name;
	}

	/*
	 * Get string entire search path to a instance ref target (via whole context paths)
	 */
	public static String getInstanceRefPathString(EObject instanceRef) {
		try {
			EObject target = getInstanceRefTarget(instanceRef);
			InstanceRefTreeCompleteSearcher searcher = new InstanceRefTreeCompleteSearcher(target);
			searcher.inputChanged(null, null, EcoreUtil.getRootContainer(target));
			searcher.getChildren(EcoreUtil.getRootContainer(target));
			Deque<EObject> path = searcher.findPathToTarget();
			EObject eo;
			String s = "/"; //$NON-NLS-1$
			for (int count = path.size() - 1; count > 0; count--) {
				eo = path.pollLast();
				if (eo instanceof GReferrable) {
					s += ((GReferrable) eo).gGetShortName() + "/"; //$NON-NLS-1$
				}
			}
			if (target instanceof GReferrable) {
				s += ((GReferrable) target).gGetShortName();
			}

			return s;
		} catch (Exception ex) {
			return ""; //$NON-NLS-1$
		}
	}

	public static String getOriginalMetamodelPackage(EObject eo) {
		String annotation = EcoreUtil.getAnnotation((EModelElement) eo, "http://www.eclipse.org/emf/2002/GenModel", "documentation"); //$NON-NLS-1$ //$NON-NLS-2$
		if (annotation == null) {
			return ""; //$NON-NLS-1$
		}
		if (annotation.indexOf("<em><b>") == -1) { //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
		String qualifiedName = annotation.substring(annotation.indexOf("<em><b>") + "<em><b>".length(), annotation.lastIndexOf("</b></em>")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		String packageName = qualifiedName.substring(qualifiedName.indexOf("EAST-ADL.") + "EAST-ADL.".length()); //$NON-NLS-1$ //$NON-NLS-2$
		return packageName;
	}

	public static String getPrettyPackageName(String packageName) {
		if (prettyPackageNames.containsKey(packageName)) {
			return prettyPackageNames.get(packageName);
		}
		Character first = packageName.charAt(0);
		if (Character.isLowerCase(first)) {
			return Character.toUpperCase(first) + packageName.substring(1);
		}
		return packageName;
	}

	public static EObject getInstanceRefTarget(EObject instanceRef) {
		EObject target = null;
		for (EStructuralFeature feature : instanceRef.eClass().getEAllStructuralFeatures()) {
			EAnnotation annotation = feature.getEAnnotation("Stereotype"); //$NON-NLS-1$
			if (annotation != null && annotation.getDetails().containsValue("instanceRef.target")) { //$NON-NLS-1$
				target = (EObject) instanceRef.eGet(feature);
			}
		}
		return target;
	}

	/**
	 * Checks whether an object is the ancestor of another object, taking into account "virtual" containment caused by
	 * type-protoype relationships
	 *
	 * @param root
	 *            The root object from which the search begins
	 * @param target
	 *            The target for towards which a path is searched
	 * @return <code>true</code> if <code>root</code> is an ancestor of <code>target</code> by the way of either actual
	 *         or virtual containment, and <code>false</code> otherwise
	 */
	public static boolean isRealOrVirtualAncestor(EObject root, EObject target) {
		if (EcoreUtil.isAncestor(root, target)) {
			return true;
		}
		if (getEObjectType(root) != null) {
			if (isRealOrVirtualAncestor(getEObjectType(root), target)) {
				return true;
			}
		}
		for (EObject obj : root.eContents()) {
			if (isRealOrVirtualAncestor(obj, target)) {
				return true;
			}
		}
		return false;
	}

	public static boolean isVirtualAncestor(EObject root, EObject target) {
		if (EcoreUtil.isAncestor(root, target)) {
			return false;
		}
		if (getEObjectType(root) != null) {
			if (isRealOrVirtualAncestor(getEObjectType(root), target)) {
				return true;
			}
		}
		for (EObject obj : root.eContents()) {
			if (isVirtualAncestor(obj, target)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Checks whether an object is the ancestor, but not the direct parent, of another object, taking into account
	 * virtual containment
	 *
	 * @param root
	 *            The root object from which the search begins
	 * @param target
	 *            The target for towards which a path is searched
	 * @return <code>true</code> if <code>root</code> is an indirect ancestor of <code>target</code> by the way of
	 *         either actual or virtual containment, <code>false</code> if <code>root</code> contains
	 *         <code>target</code> directly or not at all
	 */
	public static boolean isIndirectRealOrVirtualAncestor(EObject root, EObject target) {
		if (root.eContents().contains(target)) {
			return false;
		}
		if (EcoreUtil.isAncestor(root, target)) {
			return true;
		}
		if (getEObjectType(root) != null) {
			if (isRealOrVirtualAncestor(getEObjectType(root), target)) {
				return true;
			}
		}
		for (EObject obj : root.eContents()) {
			if (isRealOrVirtualAncestor(obj, target)) {
				return true;
			}
		}
		return false;
	}

	public static boolean isVirtualAncestorOrEquals(EObject root, EObject target) {
		if (root.equals(target)) {
			return true;
		}
		if (getEObjectType(root) != null) {
			if (isRealOrVirtualAncestor(getEObjectType(root), target)) {
				return true;
			}
		}
		for (EObject obj : root.eContents()) {
			if (isVirtualAncestor(obj, target)) {
				return true;
			}
		}
		return false;
	}

	private static EObject getEObjectType(EObject parentElement) {
		EStructuralFeature eStructuralFeature = parentElement.eClass().getEStructuralFeature("type"); //$NON-NLS-1$

		if (eStructuralFeature != null) {
			Object eGet = parentElement.eGet(eStructuralFeature);

			if (eGet != null && eGet instanceof EObject) {
				return (EObject) eGet;
			}
		}

		return null;
	}

	// This searcher class skips direct parents of elements. That is, will only find virtual
	// paths to a parent and not ones with direct containment
	static class InstanceRefTreeSearcher implements ITreeContentProvider {

		private EObject target;

		public InstanceRefTreeSearcher(EObject target) {
			this.target = target;
		}

		@Override
		public void dispose() {
		}

		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}

		@Override
		public Object[] getElements(Object inputElement) {
			Set<EObject> elements = new HashSet<EObject>();
			for (Object o : (List<?>) inputElement) {
				if (o instanceof EObject) {
					elements.add(EcoreUtil.getRootContainer((EObject) o));
				}
			}
			return elements.toArray();
		}

		@SuppressWarnings("unchecked")
		@Override
		public Object[] getChildren(Object parentElement) {
			Set<EObject> children = new HashSet<EObject>();
			Object[] typeChildren = addTypeChildren((EObject) parentElement, new Object[] {});
			List<EObject> typeChildrenList = (List<EObject>) (List<?>) Arrays.asList(typeChildren);
			for (EObject child : ((EObject) parentElement).eContents()) {
				if (ModelSearcher.isVirtualAncestor(child, target)) {
					children.add(child);
				}
			}
			for (EObject eo : typeChildrenList) {
				if (ModelSearcher.isVirtualAncestor(eo, target)) {
					children.add(eo);
				}
			}
			if (((EObject) parentElement).eContents().contains(target)) {
				if (children.contains(target)) {
					children.remove(target);
				}
			}
			return children.toArray();
		}

		@Override
		public Object getParent(Object element) {
			if (element instanceof EObject) {
				return ((EObject) element).eContainer();
			}
			return null;
		}

		@Override
		public boolean hasChildren(Object element) {
			if (element != target && ModelSearcher.isRealOrVirtualAncestor((EObject) element, target)) {
				return true;
			}
			return false;
		}

		private Object[] addTypeChildren(EObject parentElement, Object[] children) {
			EObject typeEObject = getEObjectType(parentElement);

			if (typeEObject != null) {
				ArrayList<Object> childrenList = new ArrayList<Object>();

				if (children != null) {
					childrenList.addAll(Arrays.asList(children));
				}

				childrenList.addAll(typeEObject.eContents());
				return childrenList.toArray();
			}
			return children;
		}

		private EObject getEObjectType(EObject parentElement) {
			EStructuralFeature eStructuralFeature = parentElement.eClass().getEStructuralFeature("type"); //$NON-NLS-1$

			if (eStructuralFeature != null) {
				Object eGet = parentElement.eGet(eStructuralFeature);

				if (eGet != null && eGet instanceof EObject) {
					return (EObject) eGet;
				}
			}

			return null;
		}

		public Deque<EObject> findPathToTarget() {
			Deque<EObject> path = new ArrayDeque<EObject>();
			EObject root = EcoreUtil.getRootContainer(target);
			findNextPathSegment(root, path);
			return path;
		}

		private boolean findNextPathSegment(EObject root, Deque<EObject> d) {
			if (root.eContents().contains(target)) {
				return false;
			}
			if (isRealOrVirtualAncestor(root, target)) {
				d.addFirst(root);
				for (Object o : getChildren(root)) {
					if (findNextPathSegment((EObject) o, d)) {
						return true;
					}
				}
			}
			return root == target;
		}

	}

	// This class finds all paths unlike the previous one
	static class InstanceRefTreeCompleteSearcher implements ITreeContentProvider {

		private EObject target;

		public InstanceRefTreeCompleteSearcher(EObject target) {
			this.target = target;
		}

		@Override
		public void dispose() {
		}

		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}

		@Override
		public Object[] getElements(Object inputElement) {
			Set<EObject> elements = new HashSet<EObject>();
			for (Object o : (List<?>) inputElement) {
				if (o instanceof EObject) {
					elements.add(EcoreUtil.getRootContainer((EObject) o));
				}
			}
			return elements.toArray();
		}

		@SuppressWarnings("unchecked")
		@Override
		public Object[] getChildren(Object parentElement) {
			Set<EObject> children = new HashSet<EObject>();
			Object[] typeChildren = addTypeChildren((EObject) parentElement, new Object[] {});
			List<EObject> typeChildrenList = (List<EObject>) (List<?>) Arrays.asList(typeChildren);
			for (EObject child : ((EObject) parentElement).eContents()) {
				if (ModelSearcher.isRealOrVirtualAncestor(child, target)) {
					children.add(child);
				}
			}
			for (EObject eo : typeChildrenList) {
				if (ModelSearcher.isRealOrVirtualAncestor(eo, target)) {
					children.add(eo);
				}
			}
			if (((EObject) parentElement).eContents().contains(target)) {
				if (children.contains(target)) {
					children.remove(target);
				}
			}
			return children.toArray();
		}

		@Override
		public Object getParent(Object element) {
			if (element instanceof EObject) {
				return ((EObject) element).eContainer();
			}
			return null;
		}

		@Override
		public boolean hasChildren(Object element) {
			if (element != target && ModelSearcher.isRealOrVirtualAncestor((EObject) element, target)) {
				return true;
			}
			return false;
		}

		private Object[] addTypeChildren(EObject parentElement, Object[] children) {
			EObject typeEObject = getEObjectType(parentElement);

			if (typeEObject != null) {
				ArrayList<Object> childrenList = new ArrayList<Object>();

				if (children != null) {
					childrenList.addAll(Arrays.asList(children));
				}

				childrenList.addAll(typeEObject.eContents());
				return childrenList.toArray();
			}
			return children;
		}

		private EObject getEObjectType(EObject parentElement) {
			EStructuralFeature eStructuralFeature = parentElement.eClass().getEStructuralFeature("type"); //$NON-NLS-1$

			if (eStructuralFeature != null) {
				Object eGet = parentElement.eGet(eStructuralFeature);

				if (eGet != null && eGet instanceof EObject) {
					return (EObject) eGet;
				}
			}

			return null;
		}

		public Deque<EObject> findPathToTarget() {
			Deque<EObject> path = new ArrayDeque<EObject>();
			EObject root = EcoreUtil.getRootContainer(target);
			findNextPathSegment(root, path);
			return path;
		}

		private boolean findNextPathSegment(EObject root, Deque<EObject> d) {
			if (root.eContents().contains(target)) {
				return false;
			}
			if (isRealOrVirtualAncestor(root, target)) {
				d.addFirst(root);
				for (Object o : getChildren(root)) {
					if (findNextPathSegment((EObject) o, d)) {
						return true;
					}
				}
			}
			return root == target;
		}

	}
}
