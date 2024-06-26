/*
 * generated by Xtext 2.19.0
 */
package com.simonbaars.ui;

import com.google.inject.Injector;
import com.simonbaars.gol.ui.internal.GolActivator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class GoLDSLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(GolActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		GolActivator activator = GolActivator.getInstance();
		return activator != null ? activator.getInjector(GolActivator.COM_SIMONBAARS_GOLDSL) : null;
	}

}
