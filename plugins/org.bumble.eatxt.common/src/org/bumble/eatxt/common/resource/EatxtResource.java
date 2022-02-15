package org.bumble.eatxt.common.resource;

import org.eclipse.eatop.common.resource.EastADLURIFactory;
import org.eclipse.eatop.common.resource.impl.ExtendedEastADLResourceAdapter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.XtextResource;

public class EatxtResource extends XtextResource {
	
	public EatxtResource() {
		super();
	}
	
	public EatxtResource(URI uri) {
		super(uri);

		// Install adapter providing EastADL-specific implementation of extended resource services
		eAdapters().add(new ExtendedEastADLResourceAdapter());
	}

	@Override
	public EObject getEObject(String uriFragment) {
		if (getContents().size() > 0) {
			return EastADLURIFactory.getEObject(getContents().get(0), uriFragment);
		}
		return null;
	}

	@Override
	public String getURIFragment(EObject object) {
		return EastADLURIFactory.getURIFragment(object);
	}

}
