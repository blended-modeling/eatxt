package org.bumble.eastadl.simplified.common.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IResourceFactory;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class EatxtResourceFactory implements IResourceFactory {
	
	private Provider<EatxtResource> provider;

	@Inject
	public EatxtResourceFactory(Provider<EatxtResource> resourceProvider) {
		this.provider = resourceProvider;
	}

	@Override
	public Resource createResource(URI uri) {
		EatxtResource eatxtResource = provider.get();
		eatxtResource.setURI(uri);
		return eatxtResource;
	}

}
