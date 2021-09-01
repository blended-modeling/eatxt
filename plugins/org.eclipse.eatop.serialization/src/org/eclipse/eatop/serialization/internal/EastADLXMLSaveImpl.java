/**
 * <copyright>
 *  
 * Copyright (c) 2014 itemis and others.
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 
 * which accompanies this distribution, and is
 * available at http://www.eclipse.org/org/documents/epl-v10.php
 *  
 * Contributors: 
 *     itemis - Initial API and implementation
 *  
 * </copyright>
 * 
 */
package org.eclipse.eatop.serialization.internal;

import org.eclipse.eatop.common.metamodel.EastADLMetaModelVersionData;
import org.eclipse.eatop.common.metamodel.EastADLReleaseDescriptor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.xmi.XMLHelper;

/**
 * An XMLSaveImpl that is specially designed to load EAST-ADL resources.
 */
public class EastADLXMLSaveImpl extends ExtendedXMLPersistenceMappingSaveImpl {

	private static final String SCHEMA_BASE = "eastadl"; //$NON-NLS-1$
	private static final String SCHEMA_EXTENSION = "xsd"; //$NON-NLS-1$

	/**
	 * Creates a new XMLSaveImpl associated with given helper.
	 * 
	 * @param helper
	 *            The helper that provides info about the way serialization should be performed.
	 */
	public EastADLXMLSaveImpl(XMLHelper helper) {
		super(helper);
	}

	// ===================
	@SuppressWarnings("restriction")
	protected void saveReferencedHREFWithTypeSaved(EStructuralFeature f, EObject remote, String qname, boolean doSaveType) {
		{
			String href = helper.getHREF(remote);
			if (href != null) {
				href = convertURI(href);
				EClass eClass = remote.eClass();
				doc.startElement(qname);
				saveTypeAttribute(f, eClass);
				doc.endContentElement(href);
			}
		}
	}

	// TODO TO BE CHECKED
	/**
	 * Save EReference Referenced 1100 many. The type attribute is always saved instead of saved depends on the
	 * conditions which is the default case.
	 * 
	 * @param values
	 * @param f
	 */
	@SuppressWarnings("restriction")
	@Override
	protected void saveEReferenceReferenced1100Many(InternalEList<? extends EObject> values, EStructuralFeature f) {
		int size = values.size();
		String qname;
		EObject value;
		doc.startElement(getFeatureWrapperQName(f));
		for (int i = 0; i < size; i++) {
			value = values.basicGet(i);
			qname = getFeatureQName(f);
			saveReferencedHREFWithTypeSaved(f, value, qname, true);
		}
		doc.endElement();
	}

	// TODO TO BE CHECKED
	@SuppressWarnings("restriction")
	@Override
	/**
	 * Save EReference Referenced 0100 single. The type attribute is always saved instead of saving depending on the
	 * conditions (remote.eClass() != (EClass) f.getEType()) which is the default case.
	 *
	 * @param values
	 * @param f
	 */
	protected void saveEReferenceReferenced0100Single(EObject remote, EStructuralFeature f) {
		String qname = getFeatureQName(f);
		saveReferencedHREFWithTypeSaved(f, remote, qname, true);
	}

	public String getSchemaLocation(EastADLReleaseDescriptor revision) {
		return SCHEMA_BASE + "_" + getSchemaReleaseNumber(revision) + "." + SCHEMA_EXTENSION; //$NON-NLS-1$//$NON-NLS-2$
	}

	private String getSchemaReleaseNumber(EastADLReleaseDescriptor revision) {
		final String separator = "-"; //$NON-NLS-1$
		EastADLMetaModelVersionData avd = revision.getEastADLVersionData();
		return avd.getMajor() + separator + avd.getMinor() + separator + avd.getRevision();
	}
}