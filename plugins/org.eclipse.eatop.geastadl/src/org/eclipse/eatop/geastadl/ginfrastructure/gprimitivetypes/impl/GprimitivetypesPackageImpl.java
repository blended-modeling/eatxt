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
package org.eclipse.eatop.geastadl.ginfrastructure.gprimitivetypes.impl;

import org.eclipse.eatop.geastadl.ginfrastructure.gelements.GelementsPackage;
import org.eclipse.eatop.geastadl.ginfrastructure.gelements.impl.GelementsPackageImpl;
import org.eclipse.eatop.geastadl.ginfrastructure.gprimitivetypes.GprimitivetypesFactory;
import org.eclipse.eatop.geastadl.ginfrastructure.gprimitivetypes.GprimitivetypesPackage;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * @generated
 */
public class GprimitivetypesPackageImpl extends EPackageImpl implements GprimitivetypesPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType identifierEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
	 * EPackage.Registry} by the package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
	 * performs initialization of the package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.eatop.geastadl.ginfrastructure.gprimitivetypes.GprimitivetypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GprimitivetypesPackageImpl() {
		super(eNS_URI, GprimitivetypesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * <p>
	 * This method is used to initialize {@link GprimitivetypesPackage#eINSTANCE} when that field is accessed. Clients
	 * should not invoke it directly. Instead, they should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GprimitivetypesPackage init() {
		if (isInited) return (GprimitivetypesPackage)EPackage.Registry.INSTANCE.getEPackage(GprimitivetypesPackage.eNS_URI);

		// Obtain or create and register package
		GprimitivetypesPackageImpl theGprimitivetypesPackage = (GprimitivetypesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GprimitivetypesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GprimitivetypesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		GelementsPackageImpl theGelementsPackage = (GelementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GelementsPackage.eNS_URI) instanceof GelementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GelementsPackage.eNS_URI) : GelementsPackage.eINSTANCE);

		// Create package meta-data objects
		theGprimitivetypesPackage.createPackageContents();
		theGelementsPackage.createPackageContents();

		// Initialize created meta-data
		theGprimitivetypesPackage.initializePackageContents();
		theGelementsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGprimitivetypesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GprimitivetypesPackage.eNS_URI, theGprimitivetypesPackage);
		return theGprimitivetypesPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIdentifier() {
		return identifierEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GprimitivetypesFactory getGprimitivetypesFactory() {
		return (GprimitivetypesFactory)getEFactoryInstance();
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

		// Create data types
		identifierEDataType = createEDataType(IDENTIFIER);
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
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Initialize data types
		initEDataType(identifierEDataType, String.class, "Identifier", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} // GprimitivetypesPackageImpl
