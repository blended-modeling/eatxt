package org.bumble.eatxt.ui;

import java.util.List;

import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.AliasedEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.ui.editor.templates.CrossReferenceTemplateVariableResolver;

import com.google.common.collect.Lists;

/**
 * This class might be a workaround / symptom fixing to a misuse of
 * {@link org.eclipse.xtext.scoping.impl.ImportScope} in the context of EATXT,
 * where {@link org.eclipse.xtext.scoping.impl.ImportScope#getAllElements()}
 * (calling
 * {@link org.eclipse.xtext.scoping.impl.ImportScope#getAllLocalElements()})
 * returns not only the FQN's of elements to be referenced but also so-called
 * <i>aliases</i>. These aliases represent shorter and incomplete paths to
 * cross-reference targets (e.g., "DataTypes.Boolean",
 * "DesignPkg.DataTypes.Boolean" etc. instead of
 * "CoreFcnHw.Structure.DesignPkg.DataTypes.Boolean"). Thus, we might also
 * override
 * {@link org.eclipse.xtext.scoping.impl.ImportScope#getAllLocalElements()}, but
 * this might be a strong intervention into the Xtext internals causing other
 * side effects.
 * <p>
 * Thus, I opted to overwrite {@link CrossReferenceTemplateVariableResolver}, in
 * which the symptoms occur when resolving cross-reference template variables.
 * It simply removes the aliases after getting all cross-reference descriptions
 * from the methods mentioned above.
 * 
 * @author Joerg Holtmann
 */
public class NonAliasedCrossReferenceTemplateVariableResolver extends CrossReferenceTemplateVariableResolver {

	/**
	 * Filters {@link AliasedEObjectDescription}s from overriden super-class method.
	 * 
	 * @return Only FQN descriptions without any {@link AliasedEObjectDescription}s.
	 */
	@Override
	protected Iterable<IEObjectDescription> queryScope(IScope scope) {
		// get cross-reference descriptions including FQN ones and incomplete alias ones
		Iterable<IEObjectDescription> initialScope = super.queryScope(scope);

		List<IEObjectDescription> initialScopeList = Lists.newArrayList(initialScope);

		// remove all aliases
		initialScopeList.removeIf(element -> element instanceof AliasedEObjectDescription);

		return initialScopeList;
	}
}
