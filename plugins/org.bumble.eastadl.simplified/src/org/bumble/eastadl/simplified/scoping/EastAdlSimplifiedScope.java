package org.bumble.eastadl.simplified.scoping;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.SimpleScope;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

/**
 * Provides an extension of the {@link SimpleScope} class that also uses the URI
 * fragment of an "ea" URI to identify relevant matches within the scope. This
 * provides support for East-ADL's global scopes and provides issues when
 * comparing {@code EObject}s that have a full file URL with elements from the
 * scope that are identified using an East-ADL-specific URL.
 * 
 * @author janste
 *
 */
public class EastAdlSimplifiedScope extends SimpleScope {

	public EastAdlSimplifiedScope(IScope parent, Iterable<IEObjectDescription> descriptions) {
		super(parent, descriptions);
	}

	@Override
	protected Iterable<IEObjectDescription> getLocalElementsByEObject(final EObject object, final URI uri) {
		Iterable<IEObjectDescription> localElements = getAllLocalElements();
		Iterable<IEObjectDescription> result = Iterables.filter(localElements, new Predicate<IEObjectDescription>() {
			@Override
			public boolean apply(IEObjectDescription input) {
				if (input.getEObjectOrProxy() == object) {
					return canBeFoundByNameAndShadowingKey(input);
				}
				if (uri.equals(input.getEObjectURI())) {
					return canBeFoundByNameAndShadowingKey(input);
				}
				// This is the hack that allows us to find elements based on the "ea:/" URI
				if (uri.scheme().equals("ea") && uri.fragment().equals(input.getEObjectURI().fragment())) {
					return canBeFoundByNameAndShadowingKey(input);
				}
				return false;
			}

			public boolean canBeFoundByNameAndShadowingKey(IEObjectDescription input) {
				Iterable<IEObjectDescription> lookUp = getLocalElementsByName(input.getName());
				Object myShadowingKey = getShadowingKey(input);
				for (IEObjectDescription other : lookUp) {
					if (myShadowingKey.equals(getShadowingKey(other))) {
						if (other == input)
							return true;
						if (other.getEObjectOrProxy() == object)
							return true;
						if (uri.equals(other.getEObjectURI()))
							return true;
						if (uri.scheme().equals("ea") && uri.fragment().equals(input.getEObjectURI().fragment()))
							return true;
						return false;
					}
				}
				return false;
			}
		});
		return result;
	}

}
