package org.bumble.eastadl.simplified.sequencer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EAttributeImpl;
import org.eclipse.xtext.parsetree.reconstr.impl.DefaultTransientValueService;

public class EastAdlSimplifiedTransientValueService extends DefaultTransientValueService {

	@Override
	public boolean isTransient(EObject owner, EStructuralFeature feature, int index) {
		boolean isTransient = super.isTransient(owner, feature, index);
		if (!isTransient) {
			 if (feature instanceof EAttributeImpl) {
				 Object value = owner.eGet(feature);
				 isTransient = value == null || ("".equals(value));
			 }
		}
		return isTransient;
	}

}
