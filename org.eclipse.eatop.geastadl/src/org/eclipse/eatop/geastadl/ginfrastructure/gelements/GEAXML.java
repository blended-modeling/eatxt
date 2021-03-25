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
package org.eclipse.eatop.geastadl.ginfrastructure.gelements;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>GEAXML</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.eatop.geastadl.ginfrastructure.gelements.GEAXML#getGTopLevelPackage <em>GTop Level Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.eatop.geastadl.ginfrastructure.gelements.GelementsPackage#getGEAXML()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface GEAXML extends EObject {

	/*
	 * TODO Modify model code generation of geastadl so that e.g. getGTopLevelPackage will be generated as
	 * gGetTopLevelPackage
	 */

	/**
	 * Returns the value of the '<em><b>GTop Level Package</b></em>' containment reference list. The list contents are
	 * of type {@link org.eclipse.eatop.geastadl.ginfrastructure.gelements.GEAPackage}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GTop Level Package</em>' containment reference list isn't clear, there really should
	 * be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>GTop Level Package</em>' containment reference list.
	 * @see org.eclipse.eatop.geastadl.ginfrastructure.gelements.GelementsPackage#getGEAXML_GTopLevelPackage()
	 * @model containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 */
	EList<GEAPackage> gGetTopLevelPackage();

} // GEAXML
