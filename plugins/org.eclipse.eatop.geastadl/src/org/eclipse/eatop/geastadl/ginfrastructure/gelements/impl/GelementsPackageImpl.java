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
package org.eclipse.eatop.geastadl.ginfrastructure.gelements.impl;

import org.eclipse.eatop.geastadl.ginfrastructure.gelements.GEAPackage;
import org.eclipse.eatop.geastadl.ginfrastructure.gelements.GEAPackageableElement;
import org.eclipse.eatop.geastadl.ginfrastructure.gelements.GIdentifiable;
import org.eclipse.eatop.geastadl.ginfrastructure.gelements.GReferrable;
import org.eclipse.eatop.geastadl.ginfrastructure.gelements.GelementsFactory;
import org.eclipse.eatop.geastadl.ginfrastructure.gelements.GelementsPackage;
import org.eclipse.eatop.geastadl.ginfrastructure.gprimitivetypes.GprimitivetypesPackage;
import org.eclipse.eatop.geastadl.ginfrastructure.gprimitivetypes.impl.GprimitivetypesPackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * @generated
 */
public class GelementsPackageImpl extends EPackageImpl implements GelementsPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geaPackageEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geaxmlEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gIdentifiableEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geaPackageableElementEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gReferrableEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
	 * EPackage.Registry} by the package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
	 * performs initialization of the package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.eatop.geastadl.ginfrastructure.gelements.GelementsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GelementsPackageImpl() {
		super(eNS_URI, GelementsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GelementsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GelementsPackage init() {
		if (isInited) return (GelementsPackage)EPackage.Registry.INSTANCE.getEPackage(GelementsPackage.eNS_URI);

		// Obtain or create and register package
		GelementsPackageImpl theGelementsPackage = (GelementsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GelementsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GelementsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		GprimitivetypesPackageImpl theGprimitivetypesPackage = (GprimitivetypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GprimitivetypesPackage.eNS_URI) instanceof GprimitivetypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GprimitivetypesPackage.eNS_URI) : GprimitivetypesPackage.eINSTANCE);

		// Create package meta-data objects
		theGelementsPackage.createPackageContents();
		theGprimitivetypesPackage.createPackageContents();

		// Initialize created meta-data
		theGelementsPackage.initializePackageContents();
		theGprimitivetypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGelementsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GelementsPackage.eNS_URI, theGelementsPackage);
		return theGelementsPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGEAPackage() {
		return geaPackageEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGEAPackage_GElement() {
		return (EReference)geaPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGEAPackage_GSubPackage() {
		return (EReference)geaPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGEAXML() {
		return geaxmlEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGEAXML_GTopLevelPackage() {
		return (EReference)geaxmlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGIdentifiable() {
		return gIdentifiableEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGEAPackageableElement() {
		return geaPackageableElementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGEAPackageableElement_GEAPackage_element() {
		return (EReference)geaPackageableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGReferrable() {
		return gReferrableEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGReferrable_GShortName() {
		return (EAttribute)gReferrableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GelementsFactory getGelementsFactory() {
		return (GelementsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		geaPackageEClass = createEClass(GEA_PACKAGE);
		createEReference(geaPackageEClass, GEA_PACKAGE__GELEMENT);
		createEReference(geaPackageEClass, GEA_PACKAGE__GSUB_PACKAGE);

		geaxmlEClass = createEClass(GEAXML);
		createEReference(geaxmlEClass, GEAXML__GTOP_LEVEL_PACKAGE);

		gIdentifiableEClass = createEClass(GIDENTIFIABLE);

		geaPackageableElementEClass = createEClass(GEA_PACKAGEABLE_ELEMENT);
		createEReference(geaPackageableElementEClass, GEA_PACKAGEABLE_ELEMENT__GEA_PACKAGE_ELEMENT);

		gReferrableEClass = createEClass(GREFERRABLE);
		createEAttribute(gReferrableEClass, GREFERRABLE__GSHORT_NAME);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("nls")
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		GprimitivetypesPackage theGprimitivetypesPackage = (GprimitivetypesPackage)EPackage.Registry.INSTANCE.getEPackage(GprimitivetypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		geaPackageEClass.getESuperTypes().add(this.getGIdentifiable());
		gIdentifiableEClass.getESuperTypes().add(this.getGReferrable());
		geaPackageableElementEClass.getESuperTypes().add(this.getGIdentifiable());

		// Initialize classes and features; add operations and parameters
		initEClass(geaPackageEClass, GEAPackage.class, "GEAPackage", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGEAPackage_GElement(), this.getGEAPackageableElement(), null, "gElement", null, 0, -1, GEAPackage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGEAPackage_GSubPackage(), this.getGEAPackage(), null, "gSubPackage", null, 0, -1, GEAPackage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(geaxmlEClass, org.eclipse.eatop.geastadl.ginfrastructure.gelements.GEAXML.class, "GEAXML", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGEAXML_GTopLevelPackage(), this.getGEAPackage(), null, "gTopLevelPackage", null, 0, -1, org.eclipse.eatop.geastadl.ginfrastructure.gelements.GEAXML.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(gIdentifiableEClass, GIdentifiable.class, "GIdentifiable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(geaPackageableElementEClass, GEAPackageableElement.class, "GEAPackageableElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGEAPackageableElement_GEAPackage_element(), this.getGEAPackage(), null, "gEAPackage_element", null, 0, 1, GEAPackageableElement.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(gReferrableEClass, GReferrable.class, "GReferrable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGReferrable_GShortName(), theGprimitivetypesPackage.getIdentifier(), "gShortName", null, 1, 1, GReferrable.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// feature.mapping
		createFeatureAnnotations();
	}

	/**
	 * Initializes the annotations for <b>feature.mapping</b>.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("nls")
	protected void createFeatureAnnotations() {
		String source = "feature.mapping";		
		addAnnotation
		  (getGEAPackageableElement_GEAPackage_element(), 
		   source, 
		   new String[] {
			 "eastadl", "EAPackage_element"
		   });
	}

} // GelementsPackageImpl
