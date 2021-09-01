package org.bumble.eastadl.simplified.naming;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.util.SimpleAttributeResolver;

import com.google.common.base.Function;

public class EastAdlQualifiedShortnameProvider extends DefaultDeclarativeQualifiedNameProvider {
	
	private Function<EObject, String> shortnameResolver = SimpleAttributeResolver.newResolver(String.class, "shortName");

	@Override
	protected Function<EObject, String> getResolver() {
		return shortnameResolver;
	}
}
