/*
 * generated by Xtext 2.19.0
 */
package com.simonbaars


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class GoLDSLStandaloneSetup extends GoLDSLStandaloneSetupGenerated {

	def static void doSetup() {
		new GoLDSLStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}