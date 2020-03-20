
package org.xtext.plaovgraph;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class PLAOVgraphStandaloneSetup extends PLAOVgraphStandaloneSetupGenerated{

	public static void doSetup() {
		new PLAOVgraphStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

