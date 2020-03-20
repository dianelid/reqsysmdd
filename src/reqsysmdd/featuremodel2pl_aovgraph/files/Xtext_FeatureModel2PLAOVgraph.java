package reqsysmdd.featuremodel2pl_aovgraph.files;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.xtext.featuremodel.FeatureModelStandaloneSetup;

import plaovgraph.PlaovgraphPackage;
import featuremodel.FeaturemodelPackage;

import com.google.inject.Injector;

public class Xtext_FeatureModel2PLAOVgraph {

    public Xtext_FeatureModel2PLAOVgraph(String inModelPath, String outModelPath) throws IOException {
    	
    	Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(PlaovgraphPackage.eNS_URI, PlaovgraphPackage.eINSTANCE);
    	Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(FeaturemodelPackage.eNS_URI, FeaturemodelPackage.eINSTANCE);
    	
    	Injector injector = new FeatureModelStandaloneSetup().createInjectorAndDoEMFRegistration();
		ResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		Resource xtextResource = resourceSet.getResource(URI.createURI("file:/"+inModelPath), true);
		xtextResource.load(null);
		EcoreUtil.resolveAll(xtextResource);
		Resource xmiResource = resourceSet.createResource(URI.createURI("file:/"+outModelPath));
		xmiResource.getContents().add(xtextResource.getContents().get(0));
		xmiResource.save(null);
    }
}