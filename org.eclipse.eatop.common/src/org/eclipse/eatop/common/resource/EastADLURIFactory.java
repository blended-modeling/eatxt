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
package org.eclipse.eatop.common.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.eatop.common.internal.Activator;
import org.eclipse.eatop.common.internal.messages.Messages;
import org.eclipse.eatop.geastadl.ginfrastructure.gelements.GEAPackage;
import org.eclipse.eatop.geastadl.ginfrastructure.gelements.GEAPackageableElement;
import org.eclipse.eatop.geastadl.ginfrastructure.gelements.GEAXML;
import org.eclipse.eatop.geastadl.ginfrastructure.gelements.GReferrable;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.ProperContentIterator;
import org.eclipse.osgi.util.NLS;
import org.eclipse.sphinx.emf.util.EObjectUtil;
import org.eclipse.sphinx.platform.util.PlatformLogUtil;

/**
 * An utility class that provides methods for EAST-ADL specific URI handling.
 */
public final class EastADLURIFactory {

	/**
	 * Depth constant (value 2) indicating this resource and its direct and indirect members at any depth.
	 */
	public static final int DEPTH_INFINITE = 2;
	/**
	 * Depth constant (value 1) indicating this resource and its direct members.
	 */
	public static final int DEPTH_ONE = 1;
	/**
	 * Depth constant (value 0) indicating this resource, but not any of its members.
	 */
	public static final int DEPTH_ZERO = 0;

	/**
	 * Arbitrary scheme for EAST-ADL URIs enabling to reference EAST-ADL elements without having to precise the files in
	 * which they are located.
	 */
	public static final String EA_SCHEME = "ea"; //$NON-NLS-1$

	/**
	 * Separator separating the schema within an EAST-ADL URI.
	 */
	public static final String SCHEME_SEPARATOR = ":"; //$NON-NLS-1$

	/**
	 * Separator separating segments within an EAST-ADL URI.
	 */
	public static final String SEGMENT_SEPARATOR = "/"; //$NON-NLS-1$

	/**
	 * Separator separating a query within an EAST-ADL URI.
	 */
	public static final String QUERY_SEPARATOR = "?"; //$NON-NLS-1$

	/**
	 * Separator separating a fragments within an EAST-ADL URI.
	 */
	public static final String FRAGMENT_SEPARATOR = "#"; //$NON-NLS-1$

	/**
	 * Separator separating a keys from values within an EAST-ADL URI.
	 */
	public static final String KEY_VALUE_SEPARATOR = "="; //$NON-NLS-1$

	/**
	 * The name of the query string key used for encoding the destination type of referenced EAST-ADL elements in
	 * EAST-ADL URIs.
	 */
	public static final String DESTINATION_TYPE_KEY = "type"; //$NON-NLS-1$

	/**
	 * The prefix in absolute qualified name segments of EObjects which are no Identifiables and don't have a shortName.
	 */
	public static final String NON_IDENTIFIABLE_SEGMENT_PREFIX = "@"; //$NON-NLS-1$

	/**
	 * Type name of EAXML objects which are at the root of EAST-ADL resources.
	 */
	public static final String EAXML_TYPE_NAME = "EAXML"; //$NON-NLS-1$

	/**
	 * Absolute qualified name segment of EAXML objects which are at the root of EAST-ADL resources.
	 */
	public static final String EAXML_ABSOLUTE_QUALIFIED_NAME_SEGMENT = "/"; //$NON-NLS-1$

	private static String createDestinationTypeSpecifier(String destinationTypeName) {
		if (destinationTypeName != null && destinationTypeName.length() > 0) {
			return DESTINATION_TYPE_KEY + KEY_VALUE_SEPARATOR + destinationTypeName;
		}
		return ""; //$NON-NLS-1$
	}

	/**
	 * Creates an EAST-ADL URI fragment for the specified element.
	 * 
	 * @param absoluteQualifiedName
	 *            The absolute qualified EAST-ADL name of the element the fragment shall reference. A qualified name
	 *            within EAST-ADL is a path of short-names.
	 * @param destinationTypeName
	 *            The name of the referenced element's type.
	 * @return The created EAST-ADL URI fragment.
	 */
	public static String createURIFragment(String absoluteQualifiedName, String destinationTypeName) {
		String uriFragment = absoluteQualifiedName;
		String destinationTypeSpecifier = createDestinationTypeSpecifier(destinationTypeName);
		if (destinationTypeSpecifier.length() > 0) {
			uriFragment += QUERY_SEPARATOR + destinationTypeSpecifier;
		}
		return uriFragment;
	}

	/**
	 * Creates an EAST-ADL URI for the specified element.
	 * 
	 * @param absoluteQualifiedName
	 *            The absolute qualified EAST-ADL name of the element the fragment shall reference. A qualified name
	 *            within EAST-ADL is a path of short-names.
	 * @param destinationTypeName
	 *            The name of the referenced element's type.
	 * @return The created EAST-ADL URI.
	 */
	public static URI createEastADLURI(String absoluteQualifiedName, String destinationTypeName) {
		String uriFragment = createURIFragment(absoluteQualifiedName, destinationTypeName);
		return createEastADLURI(uriFragment);
	}

	/**
	 * Creates an EAST-ADL URI from the given URI fragment. The given URI is appended to the created URI. The provided
	 * URI fragment has to conform to the EAST-ADL URI specification. An EAST-ADL URI is made up of the absolute
	 * qualified name (path of short-names) of an element followed by the referenced element's type. The qualified name
	 * and the type are separated by a "?".
	 * 
	 * @param uriFragment
	 *            The EAST-ADL URI fragment to append to the URI.
	 * @return The created EAST-ADL URI.
	 */
	public static URI createEastADLURI(String uriFragment) {
		if (uriFragment != null && uriFragment.length() > 0) {
			return URI.createURI(EA_SCHEME + SCHEME_SEPARATOR + SEGMENT_SEPARATOR + FRAGMENT_SEPARATOR + uriFragment, true);
		}
		return null;
	}

	/**
	 * Returns the absolute qualified name of the given Identifiable. It starts with a "/" separated concatenation of
	 * the shortNames of the Identifiable(s) which contain the Identifiable in question. It ends with the shortName of
	 * the given object in case that this one is an Identifiable.
	 * 
	 * @param object
	 *            The Identifiable whose absolute qualified name is to be returned.
	 * @return The given Identifiable absolute qualified name or an empty string if no such could be established.
	 */
	public static String getAbsoluteQualifiedName(Object object) {
		return getAbsoluteQualifiedName(null, null, object);
	}

	/**
	 * Resolves the absolute qualified EAST-ADL name for a specified element.
	 * 
	 * @param owner
	 *            The parent of the <code>arObject</code>.
	 * @param feature
	 *            The EStructuralFeature connecting the <code>owner</code> with the <code>arObject</code>.
	 * @param object
	 *            The element for which the absolute qualified EAST-ADL name is to be resolved.
	 * @return The resolved absolute qualified EAST-ADL name.
	 */
	public static String getAbsoluteQualifiedName(Object owner, EStructuralFeature feature, Object object) {
		if (!(object instanceof EObject)) {
			return ""; //$NON-NLS-1$
		}
		InternalEObject internalObject = (InternalEObject) object;

		// Is given Oject a proxy?
		if (internalObject.eIsProxy()) {
			// Retrieve absolute qualified name of given Object from its proxy URI
			String uriFragment = internalObject.eProxyURI().fragment();
			if (uriFragment != null) {
				int queryStringIndex = uriFragment.indexOf(QUERY_SEPARATOR);
				return queryStringIndex != -1 ? uriFragment.substring(0, queryStringIndex) : uriFragment;
			}
			return ""; //$NON-NLS-1$
		}

		// Walk from given Object to all direct and indirect containers and collect their URI fragment segments
		List<String> segments = new ArrayList<String>();
		InternalEObject currentObject = internalObject;
		for (InternalEObject currentContainer = internalObject.eInternalContainer(); currentContainer != null; currentContainer = currentObject
				.eInternalContainer()) {

			addURIFragmentSegment(segments, currentContainer, currentObject);

			currentObject = currentContainer;
		}

		// Build prefix for absolute qualified name of given Object by evaluating outer most container of Object
		StringBuilder absoluteQualifiedName = new StringBuilder();
		// Is given Object directly or indirectly contained by a proxy?
		if (currentObject.eIsProxy()) {
			// Use the proxy's absolute qualified name as prefix for absolute qualified name of given Object
			absoluteQualifiedName.append(getAbsoluteQualifiedName(currentObject));
		} else {
			// Has an optional owner been specified for given Object?
			if (owner != null) {
				// Use the owner's absolute qualified name as prefix for absolute qualified name of given Object
				absoluteQualifiedName.append(getAbsoluteQualifiedName(owner));
			}

			// Add URI fragment segment for outer most container of Object
			addURIFragmentSegment(segments, (InternalEObject) owner, currentObject);
		}

		// Complete absolute qualified name of given Object by appending collected URI fragment segments
		Collections.reverse(segments);
		for (String segment : segments) {
			if (absoluteQualifiedName.length() > EAXML_ABSOLUTE_QUALIFIED_NAME_SEGMENT.length()) {
				absoluteQualifiedName.append(SEGMENT_SEPARATOR);
			} else if (absoluteQualifiedName.length() == EAXML_ABSOLUTE_QUALIFIED_NAME_SEGMENT.length()
					&& !absoluteQualifiedName.toString().equals(EAXML_ABSOLUTE_QUALIFIED_NAME_SEGMENT)) {
				absoluteQualifiedName.append(SEGMENT_SEPARATOR);
			} else if (absoluteQualifiedName.length() > 0 && absoluteQualifiedName.length() < EAXML_ABSOLUTE_QUALIFIED_NAME_SEGMENT.length()) {
				absoluteQualifiedName.append(SEGMENT_SEPARATOR);
			}
			absoluteQualifiedName.append(segment);
		}
		return absoluteQualifiedName.toString();
	}

	private static void addURIFragmentSegment(List<String> segments, InternalEObject owner, EObject object) {
		Assert.isNotNull(segments);
		Assert.isNotNull(object);

		if (object instanceof GReferrable) {
			String shortName = ((GReferrable) object).gGetShortName();
			// Add Identifiable segment
			// Adding "" if no shortName is set matters in order to resolve reference to referrables without short name.
			segments.add(shortName == null ? "" : shortName); //$NON-NLS-1$
		} else if (object instanceof GEAXML) {
			// Add EAXML object segment
			segments.add(EAXML_ABSOLUTE_QUALIFIED_NAME_SEGMENT);
		} else {
			if (owner != null) {
				// Add Object segment only if no Identifiable or EAXML object segments have been added so far (i.e. if
				// it belongs to the trailing segments of the resulting absolute qualified name)
				if (segments.size() == 0 || segments.get(segments.size() - 1).contains(NON_IDENTIFIABLE_SEGMENT_PREFIX)) {
					EStructuralFeature containingFeature;
					try {
						containingFeature = object.eContainingFeature();
					} catch (NullPointerException ex) {
						containingFeature = null;
						PlatformLogUtil.logAsError(Activator.getPlugin(), ex);
					}
					if (containingFeature != null) {
						segments.add(owner.eURIFragmentSegment(containingFeature, object));
					}
				}
			}
		}
	}

	/**
	 * Returns the destination type specifier for constructing URIs of the given Identifiable. It is a
	 * "type=ObjectTypeName" formated string indicating the actual concrete type of the Identifiable in question, e.g.
	 * <code>type=ModuleDef</code>, or <code>type=StringValue</code>.
	 * 
	 * @param object
	 *            The Identifiable whose destination type specifier is to be returned.
	 * @return The given Identifiable destination type specifier, or an empty string if no such could be established.
	 */
	private static String getDestinationTypeSpecifier(EObject object) {
		if (object != null) {
			return DESTINATION_TYPE_KEY + KEY_VALUE_SEPARATOR + object.eClass().getName();
		}
		return ""; //$NON-NLS-1$
	}

	/**
	 * Returns the fragment part for constructing URIs of the given Identifiable. It is composed of the absolute
	 * qualified name of the Identifiable in question followed by a "type=ObjectTypeName" formated query string
	 * indicating its destination type, e.g.
	 * 
	 * @param object
	 *            The Identifiable whose URI fragment is to be returned.
	 * @return The given Identifiable URI fragment, or an empty string if no such could be established.
	 */
	public static String getURIFragment(EObject object) {
		return getURIFragment(null, null, object);
	}

	/**
	 * Creates an EAST-ADL URI fragment for the specified element.
	 * 
	 * @param owner
	 *            The parent of the <code>arObject</code>.
	 * @param feature
	 *            The EStructuralFeature connecting the <code>owner</code> with the <code>object</code>.
	 * @param object
	 *            The element for which the absolute qualified EAST-ADL name is to be resolved.
	 * @return The created EAST-ADL URI fragment.
	 */
	public static String getURIFragment(EObject owner, EStructuralFeature feature, EObject object) {
		String absoluteQualifiedName = getAbsoluteQualifiedName(owner, feature, object);
		String destinationTypeSpecifier = getDestinationTypeSpecifier(object);
		if (destinationTypeSpecifier.length() > 0) {
			return absoluteQualifiedName + QUERY_SEPARATOR + destinationTypeSpecifier;
		}
		return ""; //$NON-NLS-1$
	}

	/**
	 * Returns an EAST-ADL URI of the given Identifiable. It starts with the <em>ea</em> scheme, has no segments but
	 * only a fragment composed of the absolute qualified name of the Identifiable in question and a
	 * "type=ObjectTypeName" formated query string indicating its destination type.
	 * 
	 * @param object
	 *            The Identifiable whose EAST-ADL URI is to be returned.
	 * @return The given Identifiable EAST-ADL URI, or <code>null</code> if no such could be established.
	 */
	public static URI getURI(EObject object) {
		return getURI(null, null, object);
	}

	/**
	 * Creates an EAST-ADL URI for the specified element.
	 * 
	 * @param owner
	 *            The parent of the <code>arObject</code>.
	 * @param feature
	 *            The EStructuralFeature connecting the <code>owner</code> with the <code>object</code>.
	 * @param object
	 *            The element for which the EAST-ADL URI is to be created.
	 * @return The created EAST-ADL URI.
	 */
	public static URI getURI(EObject owner, EStructuralFeature feature, EObject object) {
		String uriFragment = getURIFragment(owner, feature, object);
		return createEastADLURI(uriFragment);
	}

	/**
	 * Returns the Identifiable or {@link EObject} within or equal to given {@link EObject} which matches given URI
	 * fragment, or <code>null</code> if no such exists.
	 * <p>
	 * For the sake of performance optimization, the tree consisting of given {@link EObject} and its contained
	 * Identifiables and {@link EObject}s is traversed and searched for the given URI fragment according to the
	 * probability of occurrence in descending order as follows:
	 * <ul>
	 * <li>the EAXML object itself</li>
	 * <li>its contained top level packages</li>
	 * <li>all other contained Identifiables and {@link EObject}s</li>
	 * </ul>
	 * </p>
	 * 
	 * @param eObject
	 *            The {@link EObject} against which the given URI fragment is to be resolved (typically the EAXML
	 *            object).
	 * @param uriFragment
	 *            The URI fragment to be resolved starting from given {@link EObject}.
	 * @return The matching Identifiable or {@link EObject}, or <code>null</code> if no such exists.
	 * @see #getURIFragment(EObject)
	 */
	public static EObject getEObject(EObject eObject, String uriFragment) {
		if (eObject == null || uriFragment == null) {
			return null;
		}

		// Has URI fragment a leading segment for EAST-ADL object?
		if (uriFragment.startsWith(EAXML_ABSOLUTE_QUALIFIED_NAME_SEGMENT)) {
			// Given EObject must be an EAST-ADL object
			if (!(eObject instanceof GEAXML)) {
				return null;
			}

			GEAXML eaxmlObject = (GEAXML) eObject;

			String remainingSegments = uriFragment.substring(1);

			// Resolve against given EAXML object
			if (getLeadingAbsoluteQualifiedNameSegment(remainingSegments).length() == 0) {
				if (remainingSegments.indexOf(SEGMENT_SEPARATOR) == -1 && EAXML_TYPE_NAME.equals(getDestinationTypeName(remainingSegments))) {
					return eObject;
				}
			}

			// Resolve against topLevelPackages of given EAXML object as well as Identifiables and EObjects contained by
			// topLevelPackages
			EList<GEAPackage> eaPackages = eaxmlObject.gGetTopLevelPackage();
			for (GEAPackage eaPackage : eaPackages) {
				EObject resolvedEObject = resolveAgainstEAPackage(eaPackage, remainingSegments);
				if (resolvedEObject != null) {
					return resolvedEObject;
				}
			}
			// Resolve against Identifiables other than topLevelPackages and EObjects contained by given EAXML object
			for (EObject containedEObject : eObject.eContents()) {
				if (!(containedEObject instanceof GEAPackage)) {
					EObject resolvedEObject = resolveAgainstAnyObject(containedEObject, remainingSegments, DEPTH_INFINITE);
					if (resolvedEObject != null) {
						return resolvedEObject;
					}
				}
			}

			return null;
		} else {
			// Resolve against any Identifiable or EObject contained by given EObject
			return resolveAgainstAnyObject(eObject, uriFragment, DEPTH_INFINITE);
		}
	}

	/**
	 * Returns the Identifiable or {@link EObject} within or equal to given EAPackage which matches given URI fragment,
	 * or <code>null</code> if no such exists.
	 * <p>
	 * For the sake of performance optimization, the tree consisting of given EAPackage and its contained Identifiables
	 * and {@link EObject}s is traversed and searched for the given URI fragment according to the probability of
	 * occurrence in descending order as follows:
	 * <ul>
	 * <li>the EAPackage itself</li>
	 * <li>its contained packageable elements</li>
	 * <li>its contained sub packages</li>
	 * <li>all other contained Identifiables and {@link EObject}s</li>
	 * </ul>
	 * </p>
	 * 
	 * @param eaPackage
	 *            The EAPackage against which the given URI fragment is to be resolved.
	 * @param uriFragment
	 *            The URI fragment to be resolved starting from given ARPackage.
	 * @return The matching Identifiable or {@link EObject}, or <code>null</code> otherwise.
	 */
	private static EObject resolveAgainstEAPackage(GEAPackage eaPackage, String uriFragment) {
		Assert.isNotNull(eaPackage);
		Assert.isNotNull(uriFragment);

		// Given URI fragment matching given EAPackage?
		String eaPackageSegment = getAbsoluteQualifiedNameSegment((InternalEObject) eaPackage);
		String leadingSegment = getLeadingAbsoluteQualifiedNameSegment(uriFragment);
		if (matchesSegmentOf(leadingSegment, eaPackageSegment)) {
			// Resolve against given EAPackage itself
			EObject resolvedEObject = resolveAgainstAnyObject(eaPackage, uriFragment, DEPTH_ZERO);
			if (resolvedEObject != null) {
				return resolvedEObject;
			}

			int nextSeparatorIndex = uriFragment.indexOf(SEGMENT_SEPARATOR);
			String remainingSegments = uriFragment.substring(nextSeparatorIndex + 1);

			// Resolve against elements contained by given ARPackage
			EList<GEAPackageableElement> elements = eaPackage.gGetElement();
			for (EObject element : elements) {
				resolvedEObject = resolveAgainstAnyObject(element, remainingSegments, DEPTH_INFINITE);
				if (resolvedEObject != null) {
					return resolvedEObject;
				}
			}

			// Resolve against subPackages as well as Identifiables and EObjects contained by subPackages
			EList<GEAPackage> subPackages = eaPackage.gGetSubPackage();
			for (GEAPackage subPackage : subPackages) {
				resolvedEObject = resolveAgainstEAPackage(subPackage, remainingSegments);
				if (resolvedEObject != null) {
					return resolvedEObject;
				}
			}

			// Resolve against Identifiables other than elements and subPackages and EObjects contained by given
			// EAPackage
			EStructuralFeature elementsFeature = eaPackage.eClass().getEStructuralFeature("element"); //$NON-NLS-1$
			EStructuralFeature eaPackagePackagesFeature = eaPackage.eClass().getEStructuralFeature("subPackage"); //$NON-NLS-1$
			resolvedEObject = resolveAgainstAnyObject(eaPackage, uriFragment, DEPTH_INFINITE, new EStructuralFeature[] { elementsFeature,
					eaPackagePackagesFeature });
			if (resolvedEObject != null) {
				return resolvedEObject;
			}
		}
		return null;
	}

	/**
	 * Returns the Identifiable or {@link EObject} within or equal to given {@link EObject} which matches given URI
	 * fragment, or <code>null</code> if no such exists.
	 * 
	 * @param eObject
	 *            The {@link EObject} against which the given URI fragment is to be resolved.
	 * @param uriFragment
	 *            The URI fragment to be resolved starting from given {@link EObject}.
	 * @param depth
	 *            The depth of {@link EObject} tree traversal up to which URI fragment resolving has to be carried out
	 *            (EObjectUtil.DEPTH_ZERO, EObjectUtil.DEPTH_ONE, or EObjectUtil.DEPTH_INFINITE).
	 * @return The matching Identifiable or {@link EObject}, or <code>null</code> if no such exists or the specified
	 *         traversal depth has been reached.
	 */
	private static EObject resolveAgainstAnyObject(EObject object, String uriFragment, int depth) {
		return resolveAgainstAnyObject(object, uriFragment, depth, new EStructuralFeature[0]);
	}

	/**
	 * Returns the Identifiable or {@link EObject} within or equal to given {@link EObject} which matches given URI
	 * fragment, or <code>null</code> if no such exists.
	 * 
	 * @param eObject
	 *            The {@link EObject} against which the given URI fragment is to be resolved.
	 * @param uriFragment
	 *            The URI fragment to be resolved starting from given {@link EObject}.
	 * @param depth
	 *            The depth of {@link EObject} tree traversal up to which URI fragment resolving has to be carried out
	 *            (EObjectUtil.DEPTH_ZERO, EObjectUtil.DEPTH_ONE, or EObjectUtil.DEPTH_INFINITE).
	 * @param featuresToBeIgnored
	 *            The features of given {@link EObject} to be ignored for URI fragment resolving (only relevant if depth
	 *            is greater than IResource.DEPTH_ZERO).
	 * @return The matching Identifiable or {@link EObject}, or <code>null</code> if no such exists or the specified
	 *         traversal depth has been reached.
	 */
	private static EObject resolveAgainstAnyObject(EObject eObject, String uriFragment, int depth, EStructuralFeature[] featuresToBeIgnored) {
		Assert.isNotNull(eObject);
		Assert.isNotNull(uriFragment);

		// Given URI fragment matching given EObject?
		String eObjectSegment = getAbsoluteQualifiedNameSegment((InternalEObject) eObject);
		String leadingSegment = getLeadingAbsoluteQualifiedNameSegment(uriFragment);
		if (matchesSegmentOf(leadingSegment, eObjectSegment)) {
			// No more segments to deal with, last segment left equal to that of given EObject, and destination type
			// matching?
			int nextSeparatorIndex = uriFragment.indexOf(SEGMENT_SEPARATOR);
			if (nextSeparatorIndex == -1 && leadingSegment.equals(eObjectSegment)
					&& EObjectUtil.isAssignableFrom(eObject.eClass(), getDestinationTypeName(uriFragment))) {
				// Return given EObject
				return eObject;
			} else {
				if (depth == DEPTH_ZERO) {
					// Just indicate that given EObject is not the target, i.e. don't run do any recursions
					return null;
				} else if (depth == DEPTH_ONE) {
					// Seek within all directly contained EObjects only, i.e. abort recursion after first containment
					// level
					depth = DEPTH_ZERO;
				} else if (depth == DEPTH_INFINITE) {
					// Seek within all directly and indirectly contained EObjects, i.e. let recursion go through
				}

				String remainingSegments = uriFragment.substring(nextSeparatorIndex + 1);
				List<EStructuralFeature> featuresToBeIgnoredList = Arrays.asList(featuresToBeIgnored);

				// filter referenced EObjects that are contained in feature maps
				Iterator<EObject> contents = newNonResolvingContentsIterator(eObject);
				while (contents.hasNext()) {
					EObject containedEObject = contents.next();
					if (isProperContent(eObject, containedEObject)
							&& (featuresToBeIgnoredList.size() == 0 || !featuresToBeIgnoredList.contains(containedEObject.eContainingFeature()))) {
						EObject resolvedEObject = resolveAgainstAnyObject(containedEObject, remainingSegments, depth, featuresToBeIgnored);
						if (resolvedEObject != null) {
							return resolvedEObject;
						}
					}
				}
			}
		}

		return null;
	}

	private static boolean isProperContent(EObject eObject, EObject containedEObject) {
		return !containedEObject.eIsProxy() && containedEObject.eContainer() == eObject;
	}

	private static ProperContentIterator<EObject> newNonResolvingContentsIterator(EObject eObject) {
		return new EcoreUtil.ProperContentIterator<EObject>(eObject, false);
	}

	/**
	 * Retrieves the absolute qualified name segment of given {@link EObject} or "" if no shortName is set. Returning ""
	 * is essential for the proxy resolution mechanism. Noticeably, it makes it possible to resolve references to
	 * unnamed referrables.
	 */
	private static String getAbsoluteQualifiedNameSegment(InternalEObject eObject) {
		if (eObject != null) {
			if (eObject instanceof GReferrable) {
				String shortName = ((GReferrable) eObject).gGetShortName();
				if (shortName != null) {
					return shortName;
				}
			} else {
				if (eObject.eInternalContainer() != null) {
					return eObject.eInternalContainer().eURIFragmentSegment(eObject.eContainingFeature(), eObject);
				}
			}
		}
		return ""; //$NON-NLS-1$
	}

	/**
	 * Retrieves the given URI fragment's leading segment or "" if there is no proper leading fragment.
	 * 
	 * @see #getLeadingAbsoluteQualifiedNameSegment(String)
	 */
	private static String getLeadingAbsoluteQualifiedNameSegment(String uriFragment) {
		if (uriFragment != null) {
			int nextSeparatorIndex = uriFragment.indexOf(SEGMENT_SEPARATOR);
			if (nextSeparatorIndex != -1) {
				return uriFragment.substring(0, nextSeparatorIndex);
			} else {
				int queryStringIndex = uriFragment.indexOf(QUERY_SEPARATOR);
				return queryStringIndex != -1 ? uriFragment.substring(0, queryStringIndex) : uriFragment;
			}
		}
		return ""; //$NON-NLS-1$
	}

	/**
	 * Returns the trailing (i.e., last) segment of the given URI fragment. When referencing an EAST-ADL Identifiable
	 * object it corresponds to the short-name of that Identifiable object.
	 * 
	 * @param uriFragment
	 *            The URI fragment whose trailing segment is to be retrieved.
	 * @return The trailing segment of the given <code>uriFragment</code>, or an empty string if no such exists.
	 */
	public static String getTrailingAbsoluteQualifiedNameSegment(String uriFragment) {
		if (uriFragment != null) {
			String lastSegment = uriFragment;
			int lastSeparatorIndex = uriFragment.lastIndexOf(SEGMENT_SEPARATOR);
			if (lastSeparatorIndex != -1 && lastSeparatorIndex < uriFragment.length() - 1) {
				lastSegment = uriFragment.substring(lastSeparatorIndex + 1);
			}
			int queryStringIndex = lastSegment.indexOf(QUERY_SEPARATOR);
			return queryStringIndex != -1 ? lastSegment.substring(0, queryStringIndex) : lastSegment;
		}
		return ""; //$NON-NLS-1$
	}

	/**
	 * Tests if given absolute qualified name segment matches the absolute qualified name segment of the the given
	 * {@link EObject}.
	 */
	private static boolean matchesSegmentOf(String absoluteQualifiedNameSegment, String eObjectSegment) {
		Assert.isNotNull(eObjectSegment);
		Assert.isNotNull(absoluteQualifiedNameSegment);

		if (!absoluteQualifiedNameSegment.startsWith(NON_IDENTIFIABLE_SEGMENT_PREFIX) && eObjectSegment.startsWith(NON_IDENTIFIABLE_SEGMENT_PREFIX)) {
			return true;
		}
		return eObjectSegment.equals(absoluteQualifiedNameSegment);
	}

	/**
	 * Returns the given URI fragment's destination type name.
	 */
	private static String getDestinationTypeName(String uriFragment) {
		if (uriFragment != null) {
			int queryStringIndex = uriFragment.indexOf(QUERY_SEPARATOR);
			int queryStringValueOffset = KEY_VALUE_SEPARATOR.length() + DESTINATION_TYPE_KEY.length() + KEY_VALUE_SEPARATOR.length();
			if (queryStringIndex != -1 && queryStringIndex + queryStringValueOffset < uriFragment.length()) {
				return uriFragment.substring(queryStringIndex + queryStringValueOffset);
			}
		}
		return ""; //$NON-NLS-1$
	}

	/**
	 * Determines whether or not the given string represents a valid URI.
	 * 
	 * @param uri
	 *            The string to be validated.
	 * @return {@link Diagnostic#OK_INSTANCE} if given string is a valid URI or a {@link Diagnostic} with complementary
	 *         information on error otherwise.
	 */
	public static Diagnostic validateURI(String uri) {
		Diagnostic diagnostic = Diagnostic.OK_INSTANCE;
		String errorMessage = null;
		String scheme = EA_SCHEME + SCHEME_SEPARATOR + SEGMENT_SEPARATOR + EastADLURIFactory.FRAGMENT_SEPARATOR;
		String queryType = EastADLURIFactory.QUERY_SEPARATOR + EastADLURIFactory.DESTINATION_TYPE_KEY + EastADLURIFactory.KEY_VALUE_SEPARATOR;
		int lastIndexOf = uri.lastIndexOf(queryType);
		String destinationTypeName = null;
		if (lastIndexOf > 0) {
			destinationTypeName = uri.substring(lastIndexOf, uri.length());
		}

		if (!uri.startsWith(scheme)) {
			errorMessage = NLS.bind(Messages.error_invalidEastADLURIMustStartWithEastadlScheme, scheme);
		}

		else if (destinationTypeName != null) {
			if (destinationTypeName.contains(SCHEME_SEPARATOR)) {
				errorMessage = NLS.bind(Messages.error_invalidEastADLURIInvalideDestinationTypeSpecifier, new Object[] { destinationTypeName,
						SCHEME_SEPARATOR });

			} else if (destinationTypeName.contains(SEGMENT_SEPARATOR)) {
				errorMessage = NLS.bind(Messages.error_invalidEastADLURIInvalideDestinationTypeSpecifier, new Object[] { destinationTypeName,
						SEGMENT_SEPARATOR });
			} else if (destinationTypeName.contains(FRAGMENT_SEPARATOR)) {
				errorMessage = NLS.bind(Messages.error_invalidEastADLURIInvalideDestinationTypeSpecifier, new Object[] { destinationTypeName,
						FRAGMENT_SEPARATOR });
			}
		} else if (destinationTypeName == null) {
			errorMessage = NLS.bind(Messages.error_invalidEastADLURIMustContentQueryDestinationTypeSpecifier, QUERY_SEPARATOR + DESTINATION_TYPE_KEY
					+ KEY_VALUE_SEPARATOR);
		}

		if (errorMessage != null) {
			return new BasicDiagnostic(Activator.getPlugin().getSymbolicName(), Diagnostic.ERROR, errorMessage, new Object[] { uri });

		}

		return diagnostic;
	}
}
