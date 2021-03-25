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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.sphinx.platform.util.PlatformLogUtil;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 */
public class GEastadlPackage extends EPackageImpl {
	public static final String eNAME = "geastadl"; //$NON-NLS-1$

	public static final String eNS_URI = "http://east-adl.info/geastadl"; //$NON-NLS-1$

	public static final GEastadlPackage eINSTANCE = init();

	protected EList<EClassifier> eClassifiers = new BasicEList<EClassifier>();

	protected EList<EPackage> eSubPackages = new BasicEList<EPackage>();

	protected Map<Class<?>, EClass> javaClass2eClass = null;

	private Map<String, EClass> name2eClass = null;

	private Map<EClass, List<EClass>> eSubClasses = null;

	static GEastadlPackage init() {
		GEastadlPackage theGEastadlPackage = (GEastadlPackage) (EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof GEastadlPackage ? EPackage.Registry.INSTANCE
				.getEPackage(eNS_URI) : new GEastadlPackage());

		// Initialize package
		theGEastadlPackage.setNsURI(eNS_URI);
		theGEastadlPackage.setName(eNAME);

		// Create resource
		theGEastadlPackage.createResource(eNS_URI);

		return theGEastadlPackage;
	}

	/**
	 * 
	 */
	private GEastadlPackage() {
		super(eNS_URI, GEastadlFactory.eINSTANCE);
		EAnnotation annotation = EcoreFactory.eINSTANCE.createEAnnotation();
		annotation.getDetails().put("name", name); //$NON-NLS-1$
		annotation.setSource(ExtendedMetaData.ANNOTATION_URI);
		getEAnnotations().add(annotation);
	}

	/**
	 * Returns the EClass corresponding to the simpleName or null if no such class exists.
	 */
	@SuppressWarnings("nls")
	public EClass getEClass(String simpleName) {
		if (name2eClass == null) {
			final String DOT = ".";
			name2eClass = new HashMap<String, EClass>();
			for (EClassifier ecls : getEClassifiers()) {
				if (ecls instanceof EClass) {
					String name = ecls.getName();
					if (name2eClass.containsKey(name)) {
						PlatformLogUtil.logAsWarning(org.eclipse.eatop.geastadl.internal.Activator.getPlugin(),
								"getEClass(): name collision with" + name //$NON-NLS-1$
										+ "fully qualified name will be required)");
						// remap old ref with fully qualified name
						name2eClass.put(name2eClass.get(name).getInstanceClass().getPackage().getName() + DOT + name, name2eClass.get(name));
						name = ecls.getInstanceClass().getPackage().getName() + DOT + name;
					}
					name2eClass.put(name, (EClass) ecls);
					if (!name.equals(ecls.getInstanceClassName())) {
						name2eClass.put(ecls.getInstanceClassName(), (EClass) ecls);
					}
				}
			}
		}
		return name2eClass.get(simpleName);
	}

	/**
	 * Returns the EClass corresponding to the instanceClass or null if no such instanceClass exists.
	 */
	public EClass getEClass(Class<?> instanceClass) {
		if (javaClass2eClass == null) {
			javaClass2eClass = new HashMap<Class<?>, EClass>();
			for (EClassifier ecls : getEClassifiers()) {
				if (ecls instanceof EClass) {
					javaClass2eClass.put(ecls.getInstanceClass(), (EClass) ecls);
				}
			}
		}
		return javaClass2eClass.get(instanceClass);
	}

	/**
	 * Returns the EClass that are direct children of the EClass.
	 */
	public Collection<EClass> getESubClasses(EClass ecls) {
		if (eSubClasses == null) {
			eSubClasses = new HashMap<EClass, List<EClass>>();
			for (EClassifier cls : getEClassifiers()) {
				if (cls instanceof EClass) {
					EClass eclz = (EClass) cls;
					for (EClass parent : eclz.getESuperTypes()) {
						List<EClass> list = eSubClasses.get(parent);
						if (list == null) {
							eSubClasses.put(parent, list = new ArrayList<EClass>());
						}
						list.add(eclz);
					}
				}
			}
			for (List<EClass> list : eSubClasses.values()) {
				((ArrayList<?>) list).trimToSize();
			}
		}
		List<EClass> list = eSubClasses.get(ecls);
		if (list == null) {
			list = Collections.emptyList();
		}
		return Collections.unmodifiableCollection(list);
	}

	/**
	 * Returns all EClasses that are children of the EClass
	 */
	public Collection<EClass> getEAllSubClasses(EClass ecls) {
		Set<EClass> ret = new HashSet<EClass>();
		LinkedList<EClass> toProcess = new LinkedList<EClass>(getESubClasses(ecls));
		while (!toProcess.isEmpty()) {
			EClass cls = toProcess.removeFirst();
			if (ret.add(cls)) {
				toProcess.addAll(getESubClasses(cls));
			}
		}
		return ret;
	}

	@Override
	public EList<EClassifier> getEClassifiers() {
		synchronized (this) {
			if (eClassifiers.size() == 0) {
				eClassifiers.addAll(org.eclipse.eatop.geastadl.ginfrastructure.gelements.GelementsPackage.eINSTANCE.getEClassifiers());
				eClassifiers.addAll(org.eclipse.eatop.geastadl.ginfrastructure.gprimitivetypes.GprimitivetypesPackage.eINSTANCE.getEClassifiers());
			}
			return eClassifiers;
		}
	}
}
