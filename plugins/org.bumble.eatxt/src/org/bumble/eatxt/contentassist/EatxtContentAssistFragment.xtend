/*******************************************************************************
 * Copyright (c) 2015, 2020 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.bumble.eatxt.contentassist

import com.google.inject.Inject
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.AbstractRule
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.xtext.generator.model.FileAccessFactory
import org.eclipse.xtext.xtext.generator.model.GuiceModuleAccess
import org.eclipse.xtext.xtext.generator.model.TypeReference
import org.eclipse.xtext.xtext.generator.ui.contentAssist.ContentAssistFragment2

import static extension org.eclipse.xtext.GrammarUtil.*

/**
 * Custom extension of {@link ContentAssistFragment2} that generates
 * simple auto-completion methods for the short name of all meta-model elements. 
 * The short name content assist simply appends a random number to the name of
 * the model element to generate short names.
 * 
 * In comparison to {@code ContentAssistFragment2}, this implementation writes
 * the proposal provider to {@code src-gen} since it is not meant to be manually
 * extended.
 */
class EatxtContentAssistFragment extends ContentAssistFragment2 {

	@Inject
	FileAccessFactory fileAccessFactory

	override generate() {

		if (projectConfig.eclipsePlugin.manifest !== null) {
			projectConfig.eclipsePlugin.manifest.requiredBundles += "org.eclipse.xtext.ui"
		}

		new GuiceModuleAccess.BindingFactory().addTypeToType(
			new TypeReference("org.eclipse.xtext.ui.editor.contentassist.IContentProposalProvider"),
			grammar.getProposalProviderClass
		).contributeTo(language.eclipsePluginGenModule);

		if (projectConfig.eclipsePlugin.srcGen !== null) {
			// generate the 'Abstract...ProposalProvider'
			generateGenJavaProposalProvider
		}

		if (isGenerateStub && projectConfig.eclipsePlugin.src !== null) {
			if (generateXtendStub) {
				generateXtendProposalProviderStub

				if (projectConfig.eclipsePlugin.manifest !== null) {
					projectConfig.eclipsePlugin.manifest.requiredBundles +=
						'org.eclipse.xtext.xbase.lib;bundle-version="' +
							projectConfig.runtime.xbaseLibVersionLowerBound + '"'
					projectConfig.eclipsePlugin.manifest.requiredBundles += 'org.eclipse.xtend.lib;resolution:=optional'
				}
			} else {
				generateEatxtJavaProposalProvider
			}
		}

		if (projectConfig.eclipsePlugin.manifest !== null) {
			projectConfig.eclipsePlugin.manifest.exportedPackages += grammar.proposalProviderClass.packageName
		}
	}

	def void generateEatxtJavaProposalProvider() {
		// excluded features are those that stem from inherited grammars,
		// they are handled by the super grammars' proposal provider
		val excludedFqnFeatureNames = grammar.getFQFeatureNamesToExclude
		val processedNames = newHashSet()

		// We're only interested in short name assignments
		val assignments = getAssignments(processedNames, excludedFqnFeatureNames).filter[ feature.equals("shortName") ].toList
		val remainingRules = getRules(processedNames, excludedFqnFeatureNames)

		// take the non-abstract class signature for the src-gen class in case of !generateStub
		// as proposalProviders of sub languages refer to 'grammar.proposalProviderClass',
		// see 'getGenProposalProviderSuperClass(...)'
		generateEatxtJavaProposalProviderStub(assignments, remainingRules)
	}

	def generateEatxtJavaProposalProviderStub(List<Assignment> assignments, List<AbstractRule> rules) {
		fileAccessFactory.createJavaFile(grammar.proposalProviderClass, '''
			/**
			 * This content proposal class generates a simple random name suggestion for each model element.
			 */
			public class «grammar.proposalProviderClass.simpleName» extends «grammar.genProposalProviderClass» {
				
				«IF !assignments.empty»
					«FOR a : assignments»
						public void complete«a.FQFeatureName»(«EObject» model, «Assignment» assignment, «
											contentAssistContextClass» context, «ICompletionProposalAcceptorClass» acceptor) {
							super.complete«a.FQFeatureName»(model, assignment, context, acceptor);
							String proposal = "«a.suggestionPrefix»_" + Long.toString(Math.round(Math.random() * 1000));
							acceptor.accept(createCompletionProposal(proposal, context));
						}		
					«ENDFOR»
				«ENDIF»
				
			}
		''').writeTo(projectConfig.eclipsePlugin.srcGen)
	}
		
	/*
	 * We want to get rid of the "_Impl" that some model elements have...
	 */
	def private getSuggestionPrefix(Assignment a) {
		a.containingParserRule().name.toFirstUpper().replaceAll("_Impl", "")
	}
		
	private def getContentAssistContextClass() {
		new TypeReference("org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext")
	}

	private def getICompletionProposalAcceptorClass() {
		new TypeReference("org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor")
	}

	def private getFQFeatureName(Assignment a) {
		a.containingParserRule().name.toFirstUpper() + "_" + a.feature.toFirstUpper();
	}

}
