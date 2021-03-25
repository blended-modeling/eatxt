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
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import javax.xml.XMLConstants;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;

import org.apache.xerces.impl.Constants;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.xmi.XMLDefaultHandler;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLParserPool;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.sphinx.emf.Activator;
import org.eclipse.sphinx.emf.resource.ExtendedErrorHandlerWrapper;
import org.eclipse.sphinx.emf.resource.ExtendedResource;
import org.eclipse.sphinx.emf.resource.IModelConverter;
import org.eclipse.sphinx.emf.resource.ModelConverterRegistry;
import org.eclipse.sphinx.emf.serialization.internal.XMLPersistenceMappingLoadImpl;
import org.eclipse.sphinx.emf.util.EcoreResourceUtil;
import org.eclipse.sphinx.platform.util.PlatformLogUtil;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ExtendedXMLPersistenceMappingLoadImpl extends XMLPersistenceMappingLoadImpl {

	protected boolean enableSchemaValidation;
	protected SAXParser parser = null;
	protected IModelConverter converter = null;
	protected boolean didConvert = false;

	public ExtendedXMLPersistenceMappingLoadImpl(XMLHelper helper) {
		super(helper);
	}

	// ==== The following are copied from org.eclipse.sphinx.emf.resource.ExtendedXMLLoadImpl

	/*
	 * @see org.eclipse.emf.ecore.xmi.impl.XMLLoadImpl#load(org.eclipse.emf.ecore.xmi.XMLResource, java.io.InputStream,
	 * java.util.Map)
	 */
	@SuppressWarnings("deprecation")
	@Override
	public void load(XMLResource resource, InputStream inputStream, Map<?, ?> options) throws IOException {
		if (inputStream instanceof URIConverter.Readable) {
			URIConverter.Readable readable = (URIConverter.Readable) inputStream;
			resource.setEncoding(readable.getEncoding());

			InputSource inputSource = new InputSource(readable.asReader());
			if (resource.getURI() != null) {
				String resourceURI = resource.getURI().toString();
				inputSource.setPublicId(resourceURI);
				inputSource.setSystemId(resourceURI);
				inputSource.setEncoding(resource.getEncoding());
			}
			load(resource, inputSource, options);
			return;
		}

		this.resource = resource;
		is = inputStream;
		this.options = options;
		enableSchemaValidation = Boolean.TRUE.equals(options.get(ExtendedResource.OPTION_ENABLE_SCHEMA_VALIDATION));

		// HACK: reading encoding
		String encoding = null;
		if (!Boolean.FALSE.equals(options.get(XMLResource.OPTION_USE_DEPRECATED_METHODS))) {
			encoding = getEncoding();
			resource.setEncoding(encoding);
		}

		// If an applicable model converter is around let it migrate the document prior to parsing it
		InputSource inputSource = null;
		boolean closeIs = false;
		converter = ModelConverterRegistry.INSTANCE.getLoadConverter(resource, options);
		didConvert = false;
		if (converter != null) {
			try {
				inputSource = converter.convertLoad(resource, is, options);
				didConvert = true;
			} catch (Exception ex) {
				PlatformLogUtil.logAsError(Activator.getDefault(), ex);
				// Renew input stream as current one has been consumed by the model converter
				URIConverter uriConverter = EcoreResourceUtil.getURIConverter(resource.getResourceSet());
				is = uriConverter.createInputStream(resource.getURI(), options);
				closeIs = true;
			} finally {
				converter.dispose();
			}
		}

		if (inputSource == null) {
			inputSource = new InputSource(is);
		}
		if (resource.getURI() != null) {
			String resourceURI = resource.getURI().toString();
			inputSource.setPublicId(resourceURI);
			inputSource.setSystemId(resourceURI);
			inputSource.setEncoding(encoding);
		}

		// Retrieve application-defined XMLReader features (see http://xerces.apache.org/xerces2-j/features.html for
		// available features and their details)
		@SuppressWarnings("unchecked")
		Map<String, Boolean> parserFeatures = (Map<String, Boolean>) options.get(XMLResource.OPTION_PARSER_FEATURES);
		parserFeatures = parserFeatures == null ? new HashMap<String, Boolean>() : parserFeatures;

		// Retrieve application-defined XMLReader properties (see http://xerces.apache.org/xerces2-j/properties.html
		// for available properties and their details)
		@SuppressWarnings("unchecked")
		Map<String, Object> parserProperties = (Map<String, Object>) options.get(XMLResource.OPTION_PARSER_PROPERTIES);
		parserProperties = parserProperties == null ? new HashMap<String, Object>() : parserProperties;

		// Perform namespace processing (prefixes will be stripped off element and attribute names and replaced with the
		// corresponding namespace URIs) but do not report attributes used for namespace declarations, and do not report
		// original prefixed names
		parserFeatures.put(Constants.SAX_FEATURE_PREFIX + Constants.NAMESPACES_FEATURE, true);
		parserFeatures.put(Constants.SAX_FEATURE_PREFIX + Constants.NAMESPACE_PREFIXES_FEATURE, false);

		// Optionally enable schema validation unless document has been migrated before; in this case schema validation
		// is subject to the applicable model converter
		if (enableSchemaValidation && !didConvert) {
			parserFeatures.put(Constants.SAX_FEATURE_PREFIX + Constants.VALIDATION_FEATURE, true);
			parserFeatures.put(Constants.XERCES_FEATURE_PREFIX + Constants.SCHEMA_VALIDATION_FEATURE, true);
			parserProperties.put(Constants.JAXP_PROPERTY_PREFIX + Constants.SCHEMA_LANGUAGE, XMLConstants.W3C_XML_SCHEMA_NS_URI);
		}

		// Use custom extended error handler wrapper enabling concise distinction between well-formedness, validity and
		// integrity problems
		/*
		 * !! Important Note !! Requires org.apache.xerces parser (but not com.sun.org.apache.xerces parser) to be used.
		 */
		parserProperties.put(Constants.XERCES_PROPERTY_PREFIX + Constants.ERROR_HANDLER_PROPERTY, new ExtendedErrorHandlerWrapper());

		DefaultHandler handler = null;
		XMLParserPool pool = (XMLParserPool) options.get(XMLResource.OPTION_USE_PARSER_POOL);
		try {
			if (pool != null) {
				// Use the pool to retrieve the parser
				parser = pool.get(parserFeatures, parserProperties, Boolean.TRUE.equals(options.get(XMLResource.OPTION_USE_LEXICAL_HANDLER)));
				handler = (DefaultHandler) pool.getDefaultHandler(resource, this, helper, options);
			} else {
				parser = makeParser();
				handler = makeDefaultHandler();

				// Set features and properties
				if (parserFeatures != null) {
					for (String feature : parserFeatures.keySet()) {
						parser.getXMLReader().setFeature(feature, parserFeatures.get(feature).booleanValue());
					}
				}
				if (parserProperties != null) {
					for (String property : parserProperties.keySet()) {
						parser.getXMLReader().setProperty(property, parserProperties.get(property));
					}
				}
			}

			// Set lexical handler
			if (Boolean.TRUE.equals(options.get(XMLResource.OPTION_USE_LEXICAL_HANDLER))) {
				if (parserProperties == null || parserProperties.get(SAX_LEXICAL_PROPERTY) == null) {
					parser.setProperty(SAX_LEXICAL_PROPERTY, handler);
				}
			}

			parser.parse(inputSource, handler);
		} catch (SAXException exception) {
			if (exception.getException() != null) {
				throw new Resource.IOWrappedException(exception.getException());
			} else {
				throw new Resource.IOWrappedException(exception);
			}
		} catch (ParserConfigurationException exception) {
			throw new Resource.IOWrappedException(exception);
		} finally {
			// Release parser back to the pool
			if (pool != null) {
				if (parser != null) {
					pool.release(parser, parserFeatures, parserProperties, Boolean.TRUE.equals(options.get(XMLResource.OPTION_USE_LEXICAL_HANDLER)));
				}
				if (handler != null) {
					pool.releaseDefaultHandler((XMLDefaultHandler) handler, options);
				}
			}
			if (closeIs) {
				is.close();
			}

			helper = null;
			parser = null;
			converter = null;
			handleErrors();
		}
	}
}
