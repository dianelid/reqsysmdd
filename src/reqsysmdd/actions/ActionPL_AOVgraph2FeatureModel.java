package reqsysmdd.actions;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

import reqsysmdd.acceleo.xmi2xfm.files.GenerateFeatureModel;
import reqsysmdd.actions.util.*;
import reqsysmdd.pl_aovgraph2featuremodel.files.PL_AOVgraph2FeatureModel;
import reqsysmdd.pl_aovgraph2featuremodel.files.Xtext_PLAOVgraph2FeatureModel;

public class ActionPL_AOVgraph2FeatureModel implements IWorkbenchWindowActionDelegate{
	
	public void run(IAction action) {
		File file_plaovgraph, file_xfmm, file_xdm;
		FileOperations op= new FileOperations();		
		
		file_plaovgraph=op.selectFile("Want to select the file .plavograph", "PL-AOVgraph to Feature Model");
		if(file_plaovgraph.getName().indexOf('.')>-1){
			if(file_plaovgraph.getName().substring(file_plaovgraph.getName().indexOf('.')+1, file_plaovgraph.getName().length()).equalsIgnoreCase("plaovgraph")){					
				String nome_saida=file_plaovgraph.getName().substring(0, file_plaovgraph.getName().indexOf('.')).trim();
				String[] args= {file_plaovgraph.getParent()+"\\"+nome_saida+"_featuremodel.xmi",Platform.getLocation()+"\\FeatureModel_"+nome_saida};
				URL absolutePathPlugin = Platform.getBundle("ReqSysMDD").getEntry("/");
				try {
					file_xfmm = new File(URI.create(FileLocator.toFileURL(absolutePathPlugin).toString()+"src/reqsysmdd/resources/FMP.xfmm"));
					file_xdm =new File(URI.create(FileLocator.toFileURL(absolutePathPlugin).toString()+"src/reqsysmdd/resources/FMP.xdm"));
				
					new Xtext_PLAOVgraph2FeatureModel(file_plaovgraph.getPath(), file_plaovgraph.getParent()+"\\"+nome_saida+".xmi");

					new PL_AOVgraph2FeatureModel(file_plaovgraph.getParent()+"\\"+nome_saida+".xmi", file_plaovgraph.getParent()+"\\"+nome_saida+"_featuremodel.xmi");
					//new File(file_plaovgraph.getParent()+"\\"+nome_saida+".xmi").delete(); //deleta o xmi de pl-aovgraph
					
					new GenerateFeatureModel(args);//acceleo
					//new File(args[0]).delete(); //deleta o xmi do feature model
					op.includePathFileXfmm(args[1]);
					
					op.writeFile(op.readFile(file_xdm), args[1]+"\\FeatureModel.xdm");//copia o arquivo xdm para o local onde o arquivo xfm sera gerado, com o mesmo nome do xfm
					op.writeFile(op.readFile(file_xfmm), args[1]+"\\FeatureModel.xfmm");//copia o arquivo xfmm para o local onde o arquivo xfm sera gerado, com o mesmo nome do xfm

					new CreateProject();//cria um novo projeto Eclipse para colocar os arquivos xfm, xdm e xfmm
					CreateProject.createProject("FeatureModel_"+nome_saida, new java.net.URI("file:/"+Platform.getLocation()));
					System.out.println("Feature Model generated with success!");
				}  catch (IOException e) {
					e.printStackTrace();
				} catch (URISyntaxException e) {
					e.printStackTrace();
				} 						
			}
			else
				System.out.println("File without extension .plaovgraph");
		}
		else
			System.out.println("File without extension!");
	}
	
	public void dispose() {}

	public void init(IWorkbenchWindow window) {}

	public void selectionChanged(IAction action, ISelection selection) {}
}