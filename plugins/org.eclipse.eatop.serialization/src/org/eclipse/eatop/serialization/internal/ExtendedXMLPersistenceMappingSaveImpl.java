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

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;
import org.eclipse.sphinx.emf.Activator;
import org.eclipse.sphinx.emf.metamodel.IMetaModelDescriptor;
import org.eclipse.sphinx.emf.metamodel.MetaModelDescriptorRegistry;
import org.eclipse.sphinx.emf.resource.ExtendedResource;
import org.eclipse.sphinx.emf.resource.ExtendedResourceConstants;
import org.eclipse.sphinx.emf.resource.IModelConverter;
import org.eclipse.sphinx.emf.resource.ModelConverterRegistry;
import org.eclipse.sphinx.emf.serialization.internal.XMLPersistenceMappingSaveImpl;
import org.eclipse.sphinx.platform.util.PlatformLogUtil;
import org.eclipse.sphinx.platform.util.ReflectUtil;
import org.w3c.dom.Element;

@SuppressWarnings("restriction")
public class ExtendedXMLPersistenceMappingSaveImpl extends XMLPersistenceMappingSaveImpl {

	protected static final String TYPE_NS = "TYPE"; //XMLResource.XSI_NS + ":" + XMLResource.TYPE; //"TYPE"; //$NON-NLS-1$

	/**
	 * The save options.
	 */
	protected Map<?, ?> options;

	protected IModelConverter converter;

	public ExtendedXMLPersistenceMappingSaveImpl(XMLHelper helper) {
		super(helper);
	}

	// ==========The following are copied from org.eclipse.sphinx.emf.resource.ExtendedXMLSaveImpl

	/*
	 * @see org.eclipse.emf.ecore.xmi.impl.XMLSaveImpl#save(org.eclipse.emf.ecore.xmi.XMLResource, java.io.Writer,
	 * java.util.Map)
	 */
	@Override
	public void save(XMLResource resource, Writer writer, Map<?, ?> options) throws IOException {
		this.options = options;
		super.save(resource, writer, options);
	}

	/*
	 * @see org.eclipse.emf.ecore.xmi.impl.XMLSaveImpl#save(org.eclipse.emf.ecore.xmi.XMLResource, java.io.OutputStream,
	 * java.util.Map)
	 */
	@Override
	public void save(XMLResource resource, OutputStream outputStream, Map<?, ?> options) throws IOException {
		this.options = options;

		if (outputStream instanceof URIConverter.Writeable) {
			URIConverter.Writeable writeable = (URIConverter.Writeable) outputStream;
			resource.setEncoding(writeable.getEncoding());
			save(resource, writeable.asWriter(), options);
			return;
		}
		xmlResource = resource;
		init(resource, options);
		converter = ModelConverterRegistry.INSTANCE.getSaveConverter(xmlResource, options);

		@SuppressWarnings("unchecked")
		List<? extends EObject> contents = roots = (List<? extends EObject>) options.get(XMLResource.OPTION_ROOT_OBJECTS);
		if (contents == null) {
			contents = resource.getContents();
		}
		// TODO File bug to EMF: NPE is raised when contents is empty
		if (contents.size() > 0) {
			traverse(contents);
		}

		// If an applicable model converter is around let it migrate and save the document
		boolean didConvert = false;
		if (converter != null) {
			try {
				converter.convertSave(doc, flushThreshold, xmlResource.getURI(), outputStream, encoding, helper, options);
				didConvert = true;
			} catch (Exception ex) {
				PlatformLogUtil.logAsError(Activator.getDefault(), ex);
			} finally {
				converter.dispose();
			}
		}

		if (!didConvert) {
			if ("US-ASCII".equals(encoding) || "ASCII".equals(encoding)) { //$NON-NLS-1$//$NON-NLS-2$
				writeAscii(outputStream);
				outputStream.flush();
			} else {
				OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, helper.getJavaEncoding(encoding));
				write((Writer) outputStreamWriter);
				outputStreamWriter.flush();
			}
		}

		endSave(contents);
		xmlResource = null;
	}

	/*
	 * @see org.eclipse.emf.ecore.xmi.impl.XMLSaveImpl#traverse(java.util.List)
	 */
	@Override
	public void traverse(List<? extends EObject> contents) {
		super.traverse(contents);

		// If an applicable model converter is around let it complement the root element attributes
		if (converter != null) {
			try {
				converter.addExtraAttributesToSavedRootElement(doc, options);
			} catch (Exception ex) {
				PlatformLogUtil.logAsError(Activator.getDefault(), ex);
			}
		}
	}

	/*
	 * @see org.eclipse.emf.ecore.xmi.impl.XMLSaveImpl#addNamespaceDeclarations()
	 */
	@Override
	protected void addNamespaceDeclarations() {
		EPackage noNamespacePackage = helper.getNoNamespacePackage();
		EPackage[] packages = helper.packages();
		StringBuffer buffer = getBuffer();
		if (buffer == null) {
			buffer = new StringBuffer();
		}
		buffer.setLength(0);
		StringBuffer xsiSchemaLocation = buffer;
		String xsiNoNamespaceSchemaLocation = null;
		if (declareSchemaLocation) {
			Map<String, String> handledBySchemaLocationMap = new HashMap<String, String>();
			@SuppressWarnings("unchecked")
			Map<String, String> schemaLocationCatalog = (Map<String, String>) options.get(ExtendedResource.OPTION_SCHEMA_LOCATION_CATALOG);

			if (extendedMetaData != null) {
				Resource resource = helper.getResource();
				if (resource != null && resource.getContents().size() >= 1) {
					EObject schemaLocationRoot = getSchemaLocationRoot(resource.getContents().get(0));

					EReference xsiSchemaLocationMapFeature = extendedMetaData.getXSISchemaLocationMapFeature(schemaLocationRoot.eClass());
					if (xsiSchemaLocationMapFeature != null) {
						@SuppressWarnings("unchecked")
						EMap<String, String> xsiSchemaLocationMap = (EMap<String, String>) schemaLocationRoot.eGet(xsiSchemaLocationMapFeature);
						if (!xsiSchemaLocationMap.isEmpty()) {
							// Write schema location value string from recorded schema location entries
							handledBySchemaLocationMap = new HashMap<String, String>(xsiSchemaLocationMap.map());
							for (Map.Entry<String, String> entry : xsiSchemaLocationMap.entrySet()) {
								String namespace = entry.getKey();
								String location = entry.getValue();
								URI locationURI = URI.createURI(location);
								if (namespace == null) {
									declareXSI = true;

									xsiNoNamespaceSchemaLocation = helper.deresolve(locationURI).toString();
								} else {
									// Need to adjust current schema namespace according to applicable model converter?
									if (converter != null) {
										String mmBaseNsURI = converter.getMetaModelVersionDescriptor().getNamespace();
										String resourceBaseNsURI = converter.getResourceVersionDescriptor().getNamespace();
										if (mmBaseNsURI != null && resourceBaseNsURI != null && namespace.startsWith(mmBaseNsURI)) {
											// Substitute metamodel version in current schema namespace with
											// resource version of applicable model converter
											namespace = namespace.replace(mmBaseNsURI, resourceBaseNsURI);

											// Retrieve schema location corresponding to adjusted schema namespace
											// from schema location catalog
											locationURI = null;
											if (schemaLocationCatalog != null) {
												location = schemaLocationCatalog.get(namespace);
												if (location != null) {
													locationURI = URI.createURI(location);
												} else {
													PlatformLogUtil.logAsWarning(Activator.getPlugin(), new RuntimeException(
															"Schema location catalog entry for namespace '" + namespace + "' is missing")); //$NON-NLS-1$ //$NON-NLS-2$
												}
											} else {
												PlatformLogUtil.logAsWarning(Activator.getPlugin(), new RuntimeException(
														"Schema location catalog is missing")); //$NON-NLS-1$
											}
										}
									} else {
										// Current schema namespace corresponding to a metamodel version that is an
										// older version of the metamodel behind schema location root?
										IMetaModelDescriptor mmDescriptor = MetaModelDescriptorRegistry.INSTANCE.getDescriptor(schemaLocationRoot);
										if (mmDescriptor != null) {
											boolean compatible = false;
											for (java.net.URI compatibleNsURI : mmDescriptor.getCompatibleNamespaceURIs()) {
												if (namespace.startsWith(compatibleNsURI.toString())) {
													compatible = true;
													break;
												}
											}
											if (compatible) {
												// Ignore corresponding recorded schema location entry; as no model
												// converter is available the model will be serialized using the most
												// recent metamodel namespace; we therefore must not write a schema
												// location entry for the original old namespace but the most recent
												// one; this is done below anyway, so we can simply skip the rest right
												// here
												continue;
											}
										}
									}

									if (locationURI != null) {
										declareXSI = true;

										if (xsiSchemaLocation.length() > 0) {
											xsiSchemaLocation.append(' ');
										}
										xsiSchemaLocation.append(namespace);
										xsiSchemaLocation.append(' ');
										xsiSchemaLocation.append(helper.deresolve(locationURI).toString());
									}
								}
							}
						}
					}
				}
			}

			// Complete schema location value string with calculated schema location entries
			for (EPackage ePackage : packages) {
				String javaImplementationLocation = null;
				if (declareSchemaLocationImplementation) {
					// First try to see if this package's implementation class has an eInstance.
					//
					try {
						Field field = ePackage.getClass().getField("eINSTANCE"); //$NON-NLS-1$
						javaImplementationLocation = "java://" + field.getDeclaringClass().getName(); //$NON-NLS-1$
					} catch (Exception exception) {
						// If there is no field, then we can't do this.
					}
				}

				if (noNamespacePackage == ePackage) {
					if (ePackage.eResource() != null && !handledBySchemaLocationMap.containsKey(null)) {
						if (javaImplementationLocation != null) {
							xsiNoNamespaceSchemaLocation = javaImplementationLocation;
						} else if (schemaLocationCatalog != null) {
							// Retrieve schema location corresponding to no namespace from schema location catalog
							xsiNoNamespaceSchemaLocation = schemaLocationCatalog.get(null);
							if (xsiNoNamespaceSchemaLocation == null) {
								PlatformLogUtil.logAsWarning(Activator.getPlugin(), new RuntimeException(
										"Schema location catalog entry for no namespace (null) is missing")); //$NON-NLS-1$
							}
						} else {
							xsiNoNamespaceSchemaLocation = helper.getHREF(ePackage);
							if (xsiNoNamespaceSchemaLocation != null && xsiNoNamespaceSchemaLocation.endsWith("#/")) { //$NON-NLS-1$
								xsiNoNamespaceSchemaLocation = xsiNoNamespaceSchemaLocation.substring(0, xsiNoNamespaceSchemaLocation.length() - 2);
							}
						}

						declareXSI = xsiNoNamespaceSchemaLocation != null;
					}
				} else {
					String namespace = extendedMetaData == null ? ePackage.getNsURI() : extendedMetaData.getNamespace(ePackage);

					// Need to adjust schema namespace according to applicable model converter?
					if (converter != null) {
						String mmBaseNsURI = converter.getMetaModelVersionDescriptor().getNamespace();
						String resourceBaseNsURI = converter.getResourceVersionDescriptor().getNamespace();
						if (mmBaseNsURI != null && resourceBaseNsURI != null && namespace.startsWith(mmBaseNsURI)) {
							// Substitute metamodel version in schema namespace with resource
							// version of applicable model converter
							namespace = namespace.replace(mmBaseNsURI, resourceBaseNsURI);
						}
					}

					if (!handledBySchemaLocationMap.containsKey(namespace)) {
						if (javaImplementationLocation != null || namespace != null) {
							String location = null;
							if (javaImplementationLocation != null) {
								location = javaImplementationLocation;
							} else if (schemaLocationCatalog != null) {
								// Retrieve schema location corresponding to schema namespace from schema location
								// catalog
								location = schemaLocationCatalog.get(namespace);
								if (location == null) {
									PlatformLogUtil.logAsWarning(Activator.getPlugin(), new RuntimeException(
											"Schema location catalog entry for namespace '" + namespace + "' is missing")); //$NON-NLS-1$ //$NON-NLS-2$
								}
							} else {
								location = helper.getHREF(ePackage);
								location = convertURI(location);
								if (location.endsWith("#/")) { //$NON-NLS-1$
									location = location.substring(0, location.length() - 2);
									URI uri = ePackage.eResource().getURI();
									if (uri != null && uri.hasFragment()) {
										location += "#" + uri.fragment(); //$NON-NLS-1$
									}
								}
							}

							if (location != null) {
								declareXSI = true;

								if (xsiSchemaLocation.length() > 0) {
									xsiSchemaLocation.append(' ');
								}
								xsiSchemaLocation.append(namespace);
								xsiSchemaLocation.append(' ');
								xsiSchemaLocation.append(location);
							}

							// Avoid duplicate schema location entries
							handledBySchemaLocationMap.put(namespace, location);
						}
					}
				}
			}
		}

		for (EPackage ePackage : packages) {
			if (ePackage != noNamespacePackage && ePackage != XMLNamespacePackage.eINSTANCE
					&& !ExtendedMetaData.XMLNS_URI.equals(ePackage.getNsURI())) {
				String nsURI = extendedMetaData == null ? ePackage.getNsURI() : extendedMetaData.getNamespace(ePackage);

				if (ePackage == xmlSchemaTypePackage) {
					nsURI = XMLResource.XML_SCHEMA_URI;
				}
				if (nsURI != null && !isDuplicateURI(nsURI)) {
					// Need to adjust EPackage namespace according to applicable model converter?
					if (converter != null) {
						String mmBaseNsURI = converter.getMetaModelVersionDescriptor().getNamespace();
						String resourceBaseNsURI = converter.getResourceVersionDescriptor().getNamespace();
						if (mmBaseNsURI != null && resourceBaseNsURI != null && nsURI.startsWith(mmBaseNsURI)) {
							// Substitute metamodel version in EPackage namespace with resource version of applicable
							// model converter
							nsURI = nsURI.replace(mmBaseNsURI, resourceBaseNsURI);
						}
					}

					List<String> nsPrefixes = helper.getPrefixes(ePackage);
					for (String nsPrefix : nsPrefixes) {
						if (!toDOM) {
							if (nsPrefix != null && nsPrefix.length() > 0) {
								if (!declareXSI || !"xsi".equals(nsPrefix)) { //$NON-NLS-1$
									doc.addAttributeNS(XMLResource.XML_NS, nsPrefix, nsURI);
								}
							} else {
								doc.addAttribute(XMLResource.XML_NS, nsURI);
							}
						} else {
							if (nsPrefix != null && nsPrefix.length() > 0) {
								if (!declareXSI || !"xsi".equals(nsPrefix)) { //$NON-NLS-1$
									((Element) currentNode).setAttributeNS(ExtendedMetaData.XMLNS_URI, XMLResource.XML_NS + ":" + nsPrefix, nsURI); //$NON-NLS-1$
								}
							} else {
								((Element) currentNode).setAttributeNS(ExtendedMetaData.XMLNS_URI, XMLResource.XML_NS, nsURI);
							}
						}
					}
				}
			}
		}

		if (declareXSI) {
			if (!toDOM) {
				doc.addAttribute(XSI_XMLNS, XMLResource.XSI_URI);
			} else {
				((Element) currentNode).setAttributeNS(ExtendedMetaData.XMLNS_URI, XSI_XMLNS, XMLResource.XSI_URI);
			}
		}

		if (xsiSchemaLocation.length() > 0) {
			if (!toDOM) {
				doc.addAttribute(XSI_SCHEMA_LOCATION, xsiSchemaLocation.toString());
			} else {
				((Element) currentNode).setAttributeNS(XMLResource.XSI_URI, XSI_SCHEMA_LOCATION, xsiSchemaLocation.toString());
			}
		}

		if (xsiNoNamespaceSchemaLocation != null) {
			if (!toDOM) {
				doc.addAttribute(XSI_NO_NAMESPACE_SCHEMA_LOCATION, xsiNoNamespaceSchemaLocation);
			} else {
				((Element) currentNode).setAttributeNS(XMLResource.XSI_URI, XSI_NO_NAMESPACE_SCHEMA_LOCATION, xsiNoNamespaceSchemaLocation);
			}
		}
	}

	protected StringBuffer getBuffer() {
		try {
			return (StringBuffer) ReflectUtil.getInvisibleFieldValue(this, "buffer"); //$NON-NLS-1$
		} catch (Exception ex) {
			PlatformLogUtil.logAsError(Activator.getPlugin(), ex);
		}
		return null;
	}

	/*
	 * @see org.eclipse.emf.ecore.xmi.impl.XMLSaveImpl#writeTopObject(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	protected Object writeTopObject(EObject top) {
		// Make sure that comments, text, CDATA and processing instructions get added BEFORE the
		// root element
		saveOuterContent(top);

		return super.writeTopObject(top);
	}

	/**
	 * Writes out the contents of the special feature ExtendedResourceConstants.OUTER_CONTENT_ATTRIBUTE_NAME of the
	 * passed in object. This method is used to write out such comment before the starting tag of the actual root
	 * element.
	 *
	 * @param top
	 *            The {@link EObject root object} whose mixed outer content (text, comments, CDATA and processing
	 *            instructions) is to be saved.
	 */
	protected void saveOuterContent(EObject top) {
		EList<EAttribute> allAttributes = top.eClass().getEAllAttributes();
		for (Object element : allAttributes) {
			EAttribute attribute = (EAttribute) element;
			if (ExtendedResourceConstants.OUTER_CONTENT_ATTRIBUTE_NAME.equals(attribute.getName())) {
				saveElementFeatureMap(top, attribute);
			}
		}
	}

	@Override
	protected boolean saveFeatures(EObject o, SerializationType serializationType, boolean suppressClosingElement) {
		EClass eClass = o.eClass();
		int contentKind = extendedMetaData.getContentKind(eClass);
		if (!toDOM) {
			switch (contentKind) {
			case ExtendedMetaData.MIXED_CONTENT:
			case ExtendedMetaData.SIMPLE_CONTENT: {
				doc.setMixed(true);
				break;
			}
			}
		}

		if (o == root) {
			writeTopAttributes(root);
		}

		EStructuralFeature[] features = featureTable.getFeatures(eClass);
		int[] featureKinds = featureTable.getKinds(eClass, features);
		int[] elementFeatures = null;
		int elementCount = 0;

		String content = null;

		// Process XML attributes
		if (SerializationType.elementsOnly == serializationType) {
			LOOP:
			for (int i = 0; i < features.length; i++) {

				if (elementFeatures == null) {
					elementFeatures = new int[features.length];
				}
				elementFeatures[elementCount++] = i;

				int kind = featureKinds[i];
				EStructuralFeature f = features[i];
				if (kind != TRANSIENT && shouldSaveFeature(o, f)) {
					switch (kind) {
					case DATATYPE_ELEMENT_SINGLE: {
						if (contentKind == ExtendedMetaData.SIMPLE_CONTENT) {
							content = getDataTypeElementSingleSimple(o, f);
							continue LOOP; // next feature, no element required
						}
						break;
					}
					case DATATYPE_SINGLE: {
						continue LOOP; // next feature, no element required
					}
					case DATATYPE_SINGLE_NILLABLE: {
						if (!isNil(o, f)) {
							continue LOOP; // next feature, no element required
						}
						break;
					}
					case OBJECT_ATTRIBUTE_SINGLE: {
						continue LOOP; // next feature, no element required
					}
					case OBJECT_ATTRIBUTE_MANY: {
						continue LOOP; // next feature, no element required
					}
					case OBJECT_ATTRIBUTE_IDREF_SINGLE: {
						continue LOOP; // next feature, no element required
					}
					case OBJECT_ATTRIBUTE_IDREF_MANY: {
						continue LOOP; // next feature, no element required
					}
					case OBJECT_HREF_SINGLE_UNSETTABLE: {
						if (isNil(o, f)) {
							break;
						}
						// it's intentional to keep going
					}
					case OBJECT_HREF_SINGLE: {
						if (useEncodedAttributeStyle) {
							continue LOOP; // next feature, no element required
						} else {
							switch (sameDocSingle(o, f)) {
							case SAME_DOC: {
								continue LOOP; // next feature, no element required
							}
							case CROSS_DOC: {
								break;
							}
							default: {
								continue LOOP; // next feature, no element required
							}
							}
						}
						break;
					}
					case OBJECT_HREF_MANY_UNSETTABLE: {
						if (isEmpty(o, f) && !isXMLPersistenceMappingEnabled(f)) {
							continue LOOP; // next feature, no element required
						}
						// It's intentional to keep going.
					}
					case OBJECT_HREF_MANY: {
						if (useEncodedAttributeStyle) {
							continue LOOP; // next feature, no element required
						} else {
							switch (sameDocMany(o, f)) {
							case SAME_DOC: {
								continue LOOP; // next feature, no element required
							}
							case CROSS_DOC: {
								break;
							}
							default: {
								continue LOOP; // next feature, no element required
							}
							}
						}
						break;
					}
					case OBJECT_ELEMENT_SINGLE_UNSETTABLE:
					case OBJECT_ELEMENT_SINGLE: {
						if (contentKind == ExtendedMetaData.SIMPLE_CONTENT) {
							content = getElementReferenceSingleSimple(o, f);
							continue LOOP; // next feature, no element required
						}
						break;
					}
					case OBJECT_ELEMENT_MANY: {
						if (contentKind == ExtendedMetaData.SIMPLE_CONTENT) {
							content = getElementReferenceManySimple(o, f);
							continue LOOP; // next feature, no element required
						}
						break;
					}
					case OBJECT_ELEMENT_IDREF_SINGLE_UNSETTABLE:
					case OBJECT_ELEMENT_IDREF_SINGLE: {
						if (contentKind == ExtendedMetaData.SIMPLE_CONTENT) {
							content = getElementIDRefSingleSimple(o, f);
							continue LOOP; // next feature, no element required
						}
						break;
					}
					case OBJECT_ELEMENT_IDREF_MANY: {
						if (contentKind == ExtendedMetaData.SIMPLE_CONTENT) {
							content = getElementIDRefManySimple(o, f);
							continue LOOP; // next feature, no element required
						}
						break;
					}
					case DATATYPE_ATTRIBUTE_MANY: {
						break;
					}
					case OBJECT_CONTAIN_MANY_UNSETTABLE:
					case DATATYPE_MANY: {
						if (isEmpty(o, f) && !isXMLPersistenceMappingEnabled(f)) {
							continue LOOP; // next feature, no element required
						}
						break;
					}
					case OBJECT_CONTAIN_SINGLE_UNSETTABLE:
					case OBJECT_CONTAIN_SINGLE:
					case OBJECT_CONTAIN_MANY:
					case ELEMENT_FEATURE_MAP: {
						break;
					}
					case ATTRIBUTE_FEATURE_MAP: {
						continue LOOP; // next feature, no element required
					}
					default: {
						continue LOOP; // next feature, no element required
					}

					} // end switch
				} // end if
			} // end for
		} else {

			LOOP:
			for (int i = 0; i < features.length; i++) {
				// store body of comment - BUG FIXED
				if (elementFeatures == null) {
					elementFeatures = new int[features.length];
				}
				elementFeatures[elementCount++] = i;

				int kind = featureKinds[i];
				EStructuralFeature f = features[i];
				if (kind != TRANSIENT && shouldSaveFeature(o, f)) {
					switch (kind) {
					case DATATYPE_ELEMENT_SINGLE: {
						if (contentKind == ExtendedMetaData.SIMPLE_CONTENT) {
							content = getDataTypeElementSingleSimple(o, f);
							continue LOOP; // next feature, no element required
						}
						break;
					}
					case DATATYPE_SINGLE: {
						saveDataTypeSingle(o, f);
						continue LOOP; // next feature, no element required
					}
					case DATATYPE_SINGLE_NILLABLE: {
						if (!isNil(o, f)) {
							saveDataTypeSingle(o, f);
							continue LOOP; // next feature, no element required
						}
						break;
					}
					case OBJECT_ATTRIBUTE_SINGLE: {
						saveEObjectSingle(o, f);
						continue LOOP; // next feature, no element required
					}
					case OBJECT_ATTRIBUTE_MANY: {
						saveEObjectMany(o, f);
						continue LOOP; // next feature, no element required
					}
					case OBJECT_ATTRIBUTE_IDREF_SINGLE: {
						saveIDRefSingle(o, f);
						continue LOOP; // next feature, no element required
					}
					case OBJECT_ATTRIBUTE_IDREF_MANY: {
						saveIDRefMany(o, f);
						continue LOOP; // next feature, no element required
					}
					case OBJECT_HREF_SINGLE_UNSETTABLE: {
						if (isNil(o, f)) {
							break;
						}
						// it's intentional to keep going
					}
					case OBJECT_HREF_SINGLE: {
						if (useEncodedAttributeStyle) {
							saveEObjectSingle(o, f);
							continue LOOP; // next feature, no element required
						} else {
							switch (sameDocSingle(o, f)) {
							case SAME_DOC: {
								saveIDRefSingle(o, f);
								continue LOOP; // next feature, no element required
							}
							case CROSS_DOC: {
								break;
							}
							default: {
								continue LOOP; // next feature, no element required
							}
							}
						}
						break;
					}
					case OBJECT_HREF_MANY_UNSETTABLE: {
						if (isEmpty(o, f) && !isXMLPersistenceMappingEnabled(f)) {
							saveManyEmpty(o, f);
							continue LOOP; // next feature, no element required
						}
						// It's intentional to keep going.
					}
					case OBJECT_HREF_MANY: {
						if (useEncodedAttributeStyle) {
							saveEObjectMany(o, f);
							continue LOOP; // next feature, no element required
						} else {
							switch (sameDocMany(o, f)) {
							case SAME_DOC: {
								saveIDRefMany(o, f);
								continue LOOP; // next feature, no element required
							}
							case CROSS_DOC: {
								break;
							}
							default: {
								continue LOOP; // next feature, no element required
							}
							}
						}
						break;
					}
					case OBJECT_ELEMENT_SINGLE_UNSETTABLE:
					case OBJECT_ELEMENT_SINGLE: {
						if (contentKind == ExtendedMetaData.SIMPLE_CONTENT) {
							content = getElementReferenceSingleSimple(o, f);
							continue LOOP; // next feature, no element required
						}
						break;
					}
					case OBJECT_ELEMENT_MANY: {
						if (contentKind == ExtendedMetaData.SIMPLE_CONTENT) {
							content = getElementReferenceManySimple(o, f);
							continue LOOP; // next feature, no element required
						}
						break;
					}
					case OBJECT_ELEMENT_IDREF_SINGLE_UNSETTABLE:
					case OBJECT_ELEMENT_IDREF_SINGLE: {
						if (contentKind == ExtendedMetaData.SIMPLE_CONTENT) {
							content = getElementIDRefSingleSimple(o, f);
							continue LOOP; // next feature, no element required
						}
						break;
					}
					case OBJECT_ELEMENT_IDREF_MANY: {
						if (contentKind == ExtendedMetaData.SIMPLE_CONTENT) {
							content = getElementIDRefManySimple(o, f);
							continue LOOP; // next feature, no element required
						}
						break;
					}
					case DATATYPE_ATTRIBUTE_MANY: {
						break;
					}
					case OBJECT_CONTAIN_MANY_UNSETTABLE:
					case DATATYPE_MANY: {
						if (isEmpty(o, f) && !isXMLPersistenceMappingEnabled(f)) {
							saveManyEmpty(o, f);
							continue LOOP; // next feature, no element required
						}
						break;
					}
					case OBJECT_CONTAIN_SINGLE_UNSETTABLE:
					case OBJECT_CONTAIN_SINGLE:
					case OBJECT_CONTAIN_MANY:
					case ELEMENT_FEATURE_MAP: {
						break;
					}
					case ATTRIBUTE_FEATURE_MAP: {
						saveAttributeFeatureMap(o, f);
						continue LOOP; // next feature, no element required
					}
					default: {
						continue LOOP; // next feature, no element required
					}
					}

					if (SerializationType.attributesOnly == serializationType) {
						continue LOOP; // next feature, no element required
					}

				}
			}
			processAttributeExtensions(o);
			if (elementFeatures == null) {
				if (content == null) {
					content = getContent(o, features);
				}

				if (content == null) {
					if (o == root && writeTopElements(root)) {
						endSaveFeatures(o, 0, null);
						return true;
					} else {
						endSaveFeatures(o, EMPTY_ELEMENT, null);
						return false;
					}
				} else {
					endSaveFeatures(o, CONTENT_ELEMENT, content);
					return true;
				}
			}
		}

		if (o == root) {
			writeTopElements(root);
		}

		// Process XML elements
		for (int i = 0; i < elementCount; i++) {
			int kind = featureKinds[elementFeatures[i]];
			EStructuralFeature f = features[elementFeatures[i]];
			switch (kind) {
			case DATATYPE_SINGLE_NILLABLE: {
				saveNil(o, f);
				break;
			}
			case ELEMENT_FEATURE_MAP: {
				saveElementFeatureMap(o, f);
				break;
			}
			case DATATYPE_MANY: {
				saveDataTypeMany(o, f);
				break;
			}
			case DATATYPE_ATTRIBUTE_MANY: {
				saveDataTypeAttributeMany(o, f);
				break;
			}
			case DATATYPE_ELEMENT_SINGLE: {
				saveDataTypeElementSingle(o, f);
				break;
			}
			case OBJECT_CONTAIN_SINGLE_UNSETTABLE: {
				if (isNil(o, f)) {
					saveNil(o, f);
					break;
				}
				// it's intentional to keep going
			}
			case OBJECT_CONTAIN_SINGLE: {
				saveContainedSingle(o, f);
				break;
			}
			case OBJECT_CONTAIN_MANY_UNSETTABLE:
			case OBJECT_CONTAIN_MANY: {
				saveContainedMany(o, f);
				break;
			}
			case OBJECT_HREF_SINGLE_UNSETTABLE: {
				if (isNil(o, f)) {
					saveNil(o, f);
					break;
				}
				// it's intentional to keep going
			}
			case OBJECT_HREF_SINGLE: {
				saveHRefSingle(o, f);
				break;
			}
			case OBJECT_HREF_MANY_UNSETTABLE:
			case OBJECT_HREF_MANY: {
				saveHRefMany(o, f);
				break;
			}
			case OBJECT_ELEMENT_SINGLE_UNSETTABLE: {
				if (isNil(o, f)) {
					saveNil(o, f);
					break;
				}
				// it's intentional to keep going
			}
			case OBJECT_ELEMENT_SINGLE: {
				saveElementReferenceSingle(o, f);
				break;
			}
			case OBJECT_ELEMENT_MANY: {
				saveElementReferenceMany(o, f);
				break;
			}
			case OBJECT_ELEMENT_IDREF_SINGLE_UNSETTABLE: {
				if (isNil(o, f)) {
					saveNil(o, f);
					break;
				}
				// it's intentional to keep going
			}
			case OBJECT_ELEMENT_IDREF_SINGLE: {
				saveElementIDRefSingle(o, f);
				break;
			}
			case OBJECT_ELEMENT_IDREF_MANY: {
				saveElementIDRefMany(o, f);
				break;
			}
			} // end switch
		} // end for
		if (!suppressClosingElement) {
			endSaveFeatures(o, 0, null);
		}
		return true;
	}

}
