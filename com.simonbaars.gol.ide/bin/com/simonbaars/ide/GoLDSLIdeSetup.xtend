/*
 * generated by Xtext 2.19.0
 */
package com.simonbaars.ide

import com.google.inject.Guice
import com.simonbaars.GoLDSLRuntimeModule
import com.simonbaars.GoLDSLStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class GoLDSLIdeSetup extends GoLDSLStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new GoLDSLRuntimeModule, new GoLDSLIdeModule))
	}
	
}
