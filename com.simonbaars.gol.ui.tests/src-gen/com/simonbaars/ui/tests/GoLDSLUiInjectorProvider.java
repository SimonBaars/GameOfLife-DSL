/*
 * generated by Xtext 2.19.0
 */
package com.simonbaars.ui.tests;

import com.google.inject.Injector;
import com.simonbaars.gol.ui.internal.GolActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class GoLDSLUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return GolActivator.getInstance().getInjector("com.simonbaars.GoLDSL");
	}

}
