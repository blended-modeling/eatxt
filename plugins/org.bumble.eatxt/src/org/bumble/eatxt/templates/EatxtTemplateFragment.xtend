package org.bumble.eatxt.templates

import com.google.common.collect.LinkedHashMultimap
import com.google.common.collect.Multimap
import com.google.inject.Inject
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.xtext.generator.AbstractXtextGeneratorFragment
import org.eclipse.xtext.xtext.generator.model.FileAccessFactory

import static extension org.eclipse.xtext.GrammarUtil.*

class EatxtTemplateFragment extends AbstractXtextGeneratorFragment {

	@Inject
	FileAccessFactory fileAccessFactory

	override generate() {

		if (projectConfig.eclipsePlugin.manifest !== null) {
			projectConfig.eclipsePlugin.manifest.requiredBundles += "org.eclipse.xtext.ui"
		}
		
		val type2ref = LinkedHashMultimap.<EClass, EReference>create
			getLocallyAssignedContainmentReferences(language.grammar, type2ref)
		val types = type2ref.keySet
			

		if (!types.empty) {
			fileAccessFactory.createTextFile("templates/templates.xml", '''
				<?xml version="1.0" encoding="UTF-8" standalone="no"?>
				<templates>
				«FOR rule : types»
					<template autoinsert="true" context="«grammar.name».«rule.name»" deleted="false" description="Template for «rule.name»" enabled="true" name="«rule.name»" id="«rule.EPackage.name».«rule.name»">
						«rule.name» ${shortName} {&#13;
							«FOR attribute: rule.EAllAttributes»
								«IF attribute.lowerBound > 0 && !attribute.name.contains("hortName")»
									«IF attribute.EType.name.toLowerCase.contains("string")» ««« attributes with types EString or STRING have to get quotation marks 
						«attribute.name» "${«attribute.name»}";&#13;
									«ELSEIF attribute.EType.name.toLowerCase.contains("integer")» ««« attributes with types Integer should have an int value»
						«attribute.name» 0;&#13;
									«ELSEIF attribute.EType.name.toLowerCase.contains("float")» ««« attributes with types Float should have a float value»
						«attribute.name» 0.0;&#13;
									«ELSE»
						«attribute.name» ${«attribute.name»};&#13;
									«ENDIF»									
								«ENDIF»
							«ENDFOR»
							«FOR reference: rule.EAllReferences»
								«IF reference.lowerBound > 0»
									«IF reference.containment» ««« we have to go one level deeper and propose the nested creation of the containment itself
						«reference.EType.name» ${shortName} {&#13;
											«FOR containmentAttribute: reference.EReferenceType.EAllAttributes»
												«IF containmentAttribute.lowerBound > 0 && !containmentAttribute.name.contains("hortName")»
													«IF containmentAttribute.EType.name.toLowerCase.contains("string")» ««« attributes with types EString or STRING have to get quotation marks 
							«containmentAttribute.name» "${«containmentAttribute.name»}";&#13;
													«ELSEIF containmentAttribute.EType.name.toLowerCase.contains("integer")» ««« attributes with types Integer should have an int value»
							«containmentAttribute.name» 0;&#13;
													«ELSEIF containmentAttribute.EType.name.toLowerCase.contains("float")» ««« attributes with types Float should have a float value»
							«containmentAttribute.name» 0.0;&#13;
													«ELSE»
							«containmentAttribute.name» ${«containmentAttribute.name»};&#13;
													«ENDIF»															
												«ENDIF»
											«ENDFOR»
										}									
									«ELSE»««« cross references => Cross Reference Template Variable Resolver (https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#templates)
							«reference.name» «IF reference.upperBound < 0»(«ENDIF»${«reference.name»:CrossReference('«rule.name».«reference.name»')}«IF reference.upperBound < 0»)«ENDIF»&#13;
									«ENDIF»									
								«ENDIF»
							«ENDFOR»
						}
					</template>
				«ENDFOR»
				</templates>
			''').writeTo(projectConfig.eclipsePlugin.root)
		}
	}

	protected def void getLocallyAssignedContainmentReferences(Grammar grammar, Multimap<EClass, EReference> type2ref) {
		for (assignment : grammar.containedAssignments) {
			val type = assignment.findCurrentType
			if (type instanceof EClass) {
				val feature = type.getEStructuralFeature(assignment.feature)
				if (feature instanceof EReference && (feature as EReference).isContainment) {
					type2ref.put(type, feature as EReference)
				}
			}
		}
		for (action : grammar.containedActions) {
			val featureName = action.feature
			if (featureName !== null) {
				val type = action.type.classifier
				if (type instanceof EClass) {
					val feature = type.getEStructuralFeature(featureName)
					if (feature instanceof EReference && (feature as EReference).isContainment) {
						type2ref.put(type, feature as EReference)
					}
				}
			}
		}
	}

}
