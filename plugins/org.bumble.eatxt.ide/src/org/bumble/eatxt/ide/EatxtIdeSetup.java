/*
 * generated by Xtext 2.25.0
 */
package org.bumble.eatxt.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.bumble.eatxt.EatxtRuntimeModule;
import org.bumble.eatxt.EatxtStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class EatxtIdeSetup extends EatxtStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new EatxtRuntimeModule(), new EatxtIdeModule()));
	}
	
}