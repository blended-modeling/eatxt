/**
 * <copyright>
 * 
 * Copyright (c) 2014 itemis and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *     itemis - Initial API and implementation
 * 
 * </copyright>
 */
package org.eclipse.eatop.common.util;

import java.util.List;

import org.eclipse.eatop.geastadl.ginfrastructure.gelements.GIdentifiable;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sphinx.emf.util.EObjectUtil;
import org.eclipse.sphinx.emf.util.WorkspaceEditingDomainUtil;
import org.eclipse.sphinx.emf.util.WorkspaceTransactionUtil;

/**
 * A utility class to get and set short names of Identifiable with no dependency on any Identifiable. This is used to
 * remove dependencies from the various model plug-ins to this plug-in.
 */
public final class IdentifiableUtil {

	public static final String L_FOR_ALL = "FOR-ALL"; //$NON-NLS-1$
	public static final String L_FR = "FR"; //$NON-NLS-1$
	public static final String L_EN = "EN"; //$NON-NLS-1$

	/**
	 * Tests if the given <code>object</code> is an Identifiable.
	 * 
	 * @param object
	 *            The object to be tested.
	 * @return true if given object is an Identifiable, false otherwise.
	 */
	public static boolean isIdentifiable(Object object) {
		return object instanceof GIdentifiable;
	}

	/**
	 * Tests if the given <code>type</code> is an Identifiable, i.e. has a <code>getShortName()</code> and a
	 * <code>setShortName(String)</code> method
	 * 
	 * @param type
	 *            The type to be tested.
	 * @return true if given type is an Identifiable, false otherwise.
	 */
	public static boolean isIdentifiable(Class<?> type) {
		return GIdentifiable.class.isAssignableFrom(type);
	}

	/**
	 * Invokes getShortName() on given identifiable if it exists.
	 * 
	 * @param identifiable
	 *            The Object from which the short name will be retrieved.
	 * @return The identifiable's shortName if it exists, or an empty string otherwise.
	 * @see #setShortName
	 */
	public static String getShortName(Object identifiable) {
		if (identifiable instanceof GIdentifiable) {
			return ((GIdentifiable) identifiable).gGetShortName();
		}
		return ""; //$NON-NLS-1$
	}

	/**
	 * Sets the short name of given identifiable.
	 * 
	 * @param identifiable
	 *            The identifiable the short name of which will be set.
	 * @param shortName
	 *            The short name to set.
	 * @see #getShortName
	 */
	public static void setShortName(final Object identifiable, final String shortName) {
		if (identifiable instanceof GIdentifiable) {
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					((GIdentifiable) identifiable).gSetShortName(shortName);
				}
			};

			TransactionalEditingDomain editingDomain = WorkspaceEditingDomainUtil.getEditingDomain(identifiable);
			if (editingDomain != null) {
				try {
					WorkspaceTransactionUtil.executeInWriteTransaction(editingDomain, runnable, "setShortName"); //$NON-NLS-1$
				} catch (Exception ex) {
					// Ignore exception
				}
			} else {
				runnable.run();
			}
		}
	}

	/**
	 * Returns a new generated UUID.
	 * 
	 * @return A new generated UUID.
	 */
	public static String generateUUID() {
		return java.util.UUID.randomUUID().toString();
	}

	/**
	 * Get Long name of the given Object
	 * 
	 * @param identifiable
	 *            the given object which the long name will be retrieved
	 * @return Long name of the given Object for the language field "FOR-ALL"
	 */
	public static String getLongName(Object identifiable) {
		return getLongName(identifiable, L_FOR_ALL);
	}

	/**
	 * Get Long name of the given Object
	 * 
	 * @param identifiable
	 *            the given object which the long name will be retrieved
	 * @param language
	 *            The language of the long name to get, can be "FR" , "EN" or "FOR-ALL"
	 * @return Long name of the given Object, if language do not exist return ""
	 */
	public static String getLongName(Object identifiable, String language) {
		String longNameValue = ""; //$NON-NLS-1$
		EStructuralFeature longNameFeature = EObjectUtil.getEStructuralFeature(identifiable, "longName"); //$NON-NLS-1$
		if (longNameFeature != null) {
			EObject longNameObject = (EObject) ((EObject) identifiable).eGet(longNameFeature);
			if (longNameObject != null) {
				EStructuralFeature mixedFeature = EObjectUtil.getEStructuralFeature(longNameObject, "mixed"); //$NON-NLS-1$
				if (mixedFeature != null) {
					FeatureMap mixed = (FeatureMap) longNameObject.eGet(mixedFeature);
					longNameValue += EObjectUtil.getMixedText(mixed);
				}

				EStructuralFeature l4sFeature = EObjectUtil.getEStructuralFeature(longNameObject, "l4s"); //$NON-NLS-1$
				@SuppressWarnings("unchecked")
				List<EObject> l4s = (List<EObject>) longNameObject.eGet(l4sFeature);
				EObject matchingL4 = null;
				EObject forAll = null;
				for (EObject l4 : l4s) {
					EStructuralFeature lFeature = EObjectUtil.getEStructuralFeature(l4, "l"); //$NON-NLS-1$
					if (lFeature != null) {
						Enumerator l = (Enumerator) l4.eGet(lFeature);
						if (l != null && l.toString().equals(language)) {
							matchingL4 = l4;
							break;
						}
						if (l != null && l.toString().equals(L_FOR_ALL)) {
							forAll = l4;
						}
					}
				}

				if (matchingL4 == null && !l4s.isEmpty()) {
					if (forAll != null) {
						matchingL4 = forAll;
					}
				}

				if (matchingL4 != null) {
					mixedFeature = EObjectUtil.getEStructuralFeature(matchingL4, "mixed"); //$NON-NLS-1$
					if (mixedFeature != null) {
						FeatureMap mixed = (FeatureMap) matchingL4.eGet(mixedFeature);
						longNameValue += EObjectUtil.getMixedText(mixed);
					}
				}
			}
		}
		return longNameValue;
	}

	/**
	 * Set long name for an identifiable object
	 * 
	 * @param identifiable
	 *            Object to set long name
	 * @param longName
	 *            The new long name to set for language "FOR-ALL".
	 */
	public static void setLongName(final Object identifiable, final String longName) {
		setLongName(identifiable, longName, IdentifiableUtil.L_FOR_ALL);
	}

	/**
	 * Set long name for an identifiable object
	 * 
	 * @param identifiable
	 *            Object to set long name
	 * @param longName
	 *            The new long name to set
	 * @param language
	 *            The language of the long name to set, can be "FR" , "EN" or "FOR-ALL"
	 */
	public static void setLongName(final Object identifiable, final String longName, String language) {
		if (language == null) {
			language = IdentifiableUtil.L_FOR_ALL;
		}
		final String fLanguage = language;
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				EStructuralFeature longNameFeature = EObjectUtil.getEStructuralFeature(identifiable, "longName"); //$NON-NLS-1$
				if (longNameFeature != null) {
					EObject longNameObject = (EObject) ((EObject) identifiable).eGet(longNameFeature);
					if (longNameObject == null) {
						EClassifier longNameType = longNameFeature.getEType();
						longNameObject = longNameType.getEPackage().getEFactoryInstance().create((EClass) longNameType);
						((EObject) identifiable).eSet(longNameFeature, longNameObject);
					} else {
						EStructuralFeature mixedFeature = EObjectUtil.getEStructuralFeature(longNameObject, "mixed"); //$NON-NLS-1$
						if (mixedFeature != null) {
							FeatureMap mixed = (FeatureMap) longNameObject.eGet(mixedFeature);
							mixed.clear();
						}
					}

					EObject matchingL4 = null;
					EStructuralFeature l4sFeature = EObjectUtil.getEStructuralFeature(longNameObject, "l4s"); //$NON-NLS-1$
					@SuppressWarnings("unchecked")
					List<EObject> l4s = (List<EObject>) longNameObject.eGet(l4sFeature);
					for (EObject l4 : l4s) {
						EStructuralFeature lFeature = EObjectUtil.getEStructuralFeature(l4, "l"); //$NON-NLS-1$
						if (lFeature != null) {
							Enumerator l = (Enumerator) l4.eGet(lFeature);
							if (l != null && l.toString().equals(fLanguage)) {
								matchingL4 = l4;
								break;
							}
						}
					}

					if (matchingL4 == null) {
						EClassifier l4Type = l4sFeature.getEType();
						matchingL4 = l4Type.getEPackage().getEFactoryInstance().create((EClass) l4Type);
						EStructuralFeature lFeature = EObjectUtil.getEStructuralFeature(matchingL4, "l"); //$NON-NLS-1$
						if (lFeature != null) {
							EClassifier lType = lFeature.getEType();
							Enumerator lValue = (Enumerator) lType.getEPackage().getEFactoryInstance().createFromString((EDataType) lType, fLanguage);
							if (lValue != null) {
								matchingL4.eSet(lFeature, lValue);
							}
						}
						l4s.add(matchingL4);
					}

					EStructuralFeature mixedFeature = EObjectUtil.getEStructuralFeature(matchingL4, "mixed"); //$NON-NLS-1$
					if (mixedFeature != null) {
						FeatureMap mixed = (FeatureMap) matchingL4.eGet(mixedFeature);
						EObjectUtil.setMixedText(mixed, longName);
					}
				}
			}
		};

		TransactionalEditingDomain editingDomain = WorkspaceEditingDomainUtil.getEditingDomain(identifiable);
		if (editingDomain != null) {
			try {
				WorkspaceTransactionUtil.executeInWriteTransaction(editingDomain, runnable, "setLongName"); //$NON-NLS-1$
			} catch (Exception ex) {
				// Ignore exception
			}
		} else {
			runnable.run();
		}
	}

	/**
	 * Get Description of the given object
	 * 
	 * @param identifiable
	 *            The given Object which the description will be retrieved
	 * @return String contains description of the given object in language field "FOR-ALL"
	 */
	public static String getDesc(Object identifiable) {
		return getDesc(identifiable, L_FOR_ALL);
	}

	/**
	 * Set description for the given object. The new description will replace the first description of the given object
	 * 
	 * @param identifiable
	 *            the given object
	 * @param desc
	 *            New description to set for the given object
	 * @param language
	 *            The language of the description to get, can be "FR" , "EN" or "FOR-ALL"
	 * @return String contains description of the given object for the selected language, if language do not exist
	 *         return ""
	 */
	public static String getDesc(Object identifiable, String language) {
		String descValue = ""; //$NON-NLS-1$
		EStructuralFeature descFeature = EObjectUtil.getEStructuralFeature(identifiable, "desc"); //$NON-NLS-1$
		if (descFeature != null) {
			EObject descObject = (EObject) ((EObject) identifiable).eGet(descFeature);
			if (descObject != null) {
				EStructuralFeature mixedFeature = EObjectUtil.getEStructuralFeature(descObject, "mixed"); //$NON-NLS-1$
				if (mixedFeature != null) {
					FeatureMap mixed = (FeatureMap) descObject.eGet(mixedFeature);
					descValue += EObjectUtil.getMixedText(mixed);
				}

				EStructuralFeature l2sFeature = EObjectUtil.getEStructuralFeature(descObject, "l2s"); //$NON-NLS-1$
				@SuppressWarnings("unchecked")
				List<EObject> l2s = (List<EObject>) descObject.eGet(l2sFeature);
				EObject matchingL2 = null;
				EObject forAll = null;
				for (EObject l2 : l2s) {
					EStructuralFeature lFeature = EObjectUtil.getEStructuralFeature(l2, "l"); //$NON-NLS-1$
					if (lFeature != null) {
						Enumerator l = (Enumerator) l2.eGet(lFeature);
						if (l != null && l.toString().equals(language)) {
							matchingL2 = l2;
							break;
						}
						if (l != null && l.toString().equals(L_FOR_ALL)) {
							forAll = l2;
						}
					}
				}

				if (matchingL2 == null && !l2s.isEmpty()) {
					if (forAll != null) {
						matchingL2 = forAll;
					}
				}

				if (matchingL2 != null) {
					mixedFeature = EObjectUtil.getEStructuralFeature(matchingL2, "mixed"); //$NON-NLS-1$
					if (mixedFeature != null) {
						FeatureMap mixed = (FeatureMap) matchingL2.eGet(mixedFeature);
						descValue += EObjectUtil.getMixedText(mixed);
					}
				}
			}
		}
		return descValue;
	}

	/**
	 * Set description for the given object. The new description will replace the first description of the given object
	 * 
	 * @param identifiable
	 *            the given object
	 * @param desc
	 *            New description to set for the given object and for language "FOR-ALL"
	 */
	public static void setDesc(Object identifiable, String desc) {
		setDesc(identifiable, desc, IdentifiableUtil.L_FOR_ALL);
	}

	/**
	 * Set description for the given object. The new description will replace the first description of the given object
	 * 
	 * @param identifiable
	 *            the given object
	 * @param desc
	 *            New description to set for the given object
	 * @param language
	 *            The language of the description to set, can be "FR" , "EN" or "FOR-ALL"
	 */
	public static void setDesc(final Object identifiable, final String desc, String language) {
		if (language == null) {
			language = IdentifiableUtil.L_FOR_ALL;
		}
		final String fLanguage = language;
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				EStructuralFeature descFeature = EObjectUtil.getEStructuralFeature(identifiable, "desc"); //$NON-NLS-1$
				if (descFeature != null) {
					EObject descObject = (EObject) ((EObject) identifiable).eGet(descFeature);
					if (descObject == null) {
						EClassifier descType = descFeature.getEType();
						descObject = descType.getEPackage().getEFactoryInstance().create((EClass) descType);
						((EObject) identifiable).eSet(descFeature, descObject);
					} else {
						EStructuralFeature mixedFeature = EObjectUtil.getEStructuralFeature(descObject, "mixed"); //$NON-NLS-1$
						if (mixedFeature != null) {
							FeatureMap mixed = (FeatureMap) descObject.eGet(mixedFeature);
							mixed.clear();
						}
					}

					EObject matchingL2 = null;
					EStructuralFeature l2sFeature = EObjectUtil.getEStructuralFeature(descObject, "l2s"); //$NON-NLS-1$
					@SuppressWarnings("unchecked")
					List<EObject> l2s = (List<EObject>) descObject.eGet(l2sFeature);
					for (EObject l2 : l2s) {
						EStructuralFeature lFeature = EObjectUtil.getEStructuralFeature(l2, "l"); //$NON-NLS-1$
						if (lFeature != null) {
							Enumerator lValue = (Enumerator) l2.eGet(lFeature);
							if (lValue != null && lValue.toString().equals(fLanguage)) {
								matchingL2 = l2;
								break;
							}
						}
					}

					if (matchingL2 == null) {
						EClassifier l2Type = l2sFeature.getEType();
						matchingL2 = l2Type.getEPackage().getEFactoryInstance().create((EClass) l2Type);
						EStructuralFeature lFeature = EObjectUtil.getEStructuralFeature(matchingL2, "l"); //$NON-NLS-1$
						if (lFeature != null) {
							EClassifier lType = lFeature.getEType();
							Enumerator lValue = (Enumerator) lType.getEPackage().getEFactoryInstance().createFromString((EDataType) lType, fLanguage);
							if (lValue != null) {
								matchingL2.eSet(lFeature, lValue);
							}
						}
						l2s.add(matchingL2);
					}

					EStructuralFeature mixedFeature = EObjectUtil.getEStructuralFeature(matchingL2, "mixed"); //$NON-NLS-1$
					if (mixedFeature != null) {
						FeatureMap mixed = (FeatureMap) matchingL2.eGet(mixedFeature);
						EObjectUtil.setMixedText(mixed, desc);
					}
				}
			}
		};

		TransactionalEditingDomain editingDomain = WorkspaceEditingDomainUtil.getEditingDomain(identifiable);
		if (editingDomain != null) {
			try {
				WorkspaceTransactionUtil.executeInWriteTransaction(editingDomain, runnable, "setDesc"); //$NON-NLS-1$
			} catch (Exception ex) {
				// Ignore exception
			}
		} else {
			runnable.run();
		}
	}
}
