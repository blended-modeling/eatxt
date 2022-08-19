package org.eclipse.eatop.eatxt.ui;

import com.google.inject.Injector;
import org.bumble.eatxt.ui.internal.EatxtActivator;
import org.eclipse.core.runtime.IExecutableExtensionFactory;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * Custom {@link IExecutableExtensionFactory} that returns an injector which is both aware
 * of the Eatxt classes as well as the classes in this bundle.
 * <p>
 * See also: https://www.eclipse.org/forums/index.php/t/210407/
 */
public class EatxtChildExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(Activator.class);
	}
	
	@Override
	protected Injector getInjector() {
		EatxtActivator activator = EatxtActivator.getInstance();
		return activator != null ? activator.getInjector(EatxtActivator.ORG_BUMBLE_EATXT_EATXT).createChildInjector(new EatxtIntegrationModule()) : null;
	}

}
