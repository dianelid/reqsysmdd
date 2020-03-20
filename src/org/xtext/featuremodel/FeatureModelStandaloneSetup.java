
package org.xtext.featuremodel;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class FeatureModelStandaloneSetup extends FeatureModelStandaloneSetupGenerated{

	public static void doSetup() {
		new FeatureModelStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

