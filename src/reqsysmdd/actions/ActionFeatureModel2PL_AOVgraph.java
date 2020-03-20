package reqsysmdd.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Vector;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

import reqsysmdd.acceleo.xmi2plaovgraph.files.GeneratePLAOVgraph;
import reqsysmdd.actions.util.CreateProject;
import reqsysmdd.actions.util.FileOperations;
import reqsysmdd.featuremodel2pl_aovgraph.files.FeatureModel2PL_AOVgraph;
import reqsysmdd.featuremodel2pl_aovgraph.files.ParserXFM2Xtext;
import reqsysmdd.featuremodel2pl_aovgraph.files.Xtext_FeatureModel2PLAOVgraph;

public class ActionFeatureModel2PL_AOVgraph implements IWorkbenchWindowActionDelegate{
		
	public void run(IAction action) {
		FileOperations op= new FileOperations();
		File file_featuremodel=op.selectFile("Want to select the input file?", "Feature Model to PL-AOVgraph");
		String nome_saida=file_featuremodel.getName().substring(0, file_featuremodel.getName().indexOf('.')).trim();
		String[] args= {file_featuremodel.getParent()+"\\"+nome_saida+"_plaovgraph.xmi", Platform.getLocation()+"\\PLAOVgraph_"+nome_saida};
		try {
			new ParserXFM2Xtext(readFile(file_featuremodel), file_featuremodel.getParent()+"\\"+nome_saida+"_parsead.xfm");
			new Xtext_FeatureModel2PLAOVgraph(file_featuremodel.getParent()+"\\"+nome_saida+"_parsead.xfm", file_featuremodel.getParent()+"\\"+nome_saida+".xmi");
			new File(file_featuremodel.getParent()+"\\"+nome_saida+"_parsead.xfm").delete(); //deleta o arquivo gerado pelo parser
			
			new FeatureModel2PL_AOVgraph(file_featuremodel.getParent()+"\\"+nome_saida+".xmi", file_featuremodel.getParent()+"\\"+nome_saida+"_plaovgraph.xmi");
			//new File(file_featuremodel.getParent()+"\\"+nome_saida+".xmi").delete(); //deleta o xmi do feature model
			
			new GeneratePLAOVgraph(args);
			//new File(args[0]).delete(); //deleta o xmi do plaovgraph
			
			new CreateProject();//cria um novo projeto Eclipse para colocar o arquivo plaovgraph
			CreateProject.createProject("PLAOVgraph_"+nome_saida, new java.net.URI("file:/"+Platform.getLocation()));
			System.out.println("Specification PL-AOVgraph generated with success!");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}
	
	public Vector<String> readFile(File file_featuremodel) {
		StringBuffer file_featuremodelChar = new StringBuffer();
		try {
			FileInputStream fis = new FileInputStream(file_featuremodel.getPath());
			int i=fis.read();
			while(i!=-1){
			   file_featuremodelChar.append((char)i);
			   i=fis.read();	
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		Vector<String> composicao = new Vector<String>();
		String[] text=file_featuremodelChar.toString().split("\n");
		for (int i = 0; i < text.length; i++) {
			composicao.add(text[i]);	
		}
		return composicao;
	}
	
	public void dispose() {}

	public void init(IWorkbenchWindow window) {}

	public void selectionChanged(IAction action, ISelection selection) {}
}