
package org.applause.applausedsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ApplauseDslStandaloneSetup extends ApplauseDslStandaloneSetupGenerated{

	public static void doSetup() {
		new ApplauseDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

