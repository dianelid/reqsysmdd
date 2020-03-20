package reqsysmdd.actions;

import identificacao.MontarObj;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

import reqsysmdd.acceleo.xmi2plaovgraph.files.GeneratePLAOVgraph;
import reqsysmdd.actions.util.CreateProject;
import reqsysmdd.actions.util.FileOperations;
import reqsysmdd.crosscuttingconcernidentification.files.XMI2PL_AOVgraph;
import reqsysmdd.crosscuttingconcernidentification.files.Xtext_PLAOVgraph;

public class ActionCrosscuttingConcernIdentification implements	IWorkbenchWindowActionDelegate {
	public void run(IAction action) {
		File file_plaovgraph;
		FileOperations op= new FileOperations();		
		
		file_plaovgraph=op.selectFile("Want to select the file .plavograph", "Crosscutting Concern Identification");
		if(file_plaovgraph.getName().indexOf('.')>-1){
			if(file_plaovgraph.getName().substring(file_plaovgraph.getName().indexOf('.')+1, file_plaovgraph.getName().length()).equalsIgnoreCase("plaovgraph")){					
				String nome_saida=file_plaovgraph.getName().substring(0, file_plaovgraph.getName().indexOf('.')).trim();
				String[] args= {file_plaovgraph.getParent()+"\\"+nome_saida+"_plaovgraph.xmi",Platform.getLocation()+"\\PLAOVgraph_"+nome_saida};
				String qntMin;
				Matcher matcher;
				int valor=0;
				do{
					qntMin = JOptionPane.showInputDialog(null, "Qual a quantidade minima de relacionamentos de dependencia? ", "Pergunta", JOptionPane.PLAIN_MESSAGE);
					Pattern pattern = Pattern.compile("[0-9]*");
					matcher = pattern.matcher(qntMin);
					if(matcher.find())
						valor=Integer.parseInt(qntMin);
				}while (matcher.matches() && valor<=1);
				try {
					new MontarObj(file_plaovgraph.getParent(), nome_saida, valor);
					new Xtext_PLAOVgraph(file_plaovgraph.getPath(), file_plaovgraph.getParent()+"\\"+nome_saida+".xmi");

					new XMI2PL_AOVgraph(file_plaovgraph.getParent()+"\\"+nome_saida+".xmi", file_plaovgraph.getParent()+"\\"+nome_saida+"_plaovgraph.xmi");
					//new File(file_plaovgraph.getParent()+"\\"+nome_saida+".xmi").delete(); //deleta o xmi de pl-aovgraph
					

					new GeneratePLAOVgraph(args);
					
					new CreateProject();//cria um novo projeto Eclipse para colocar o arquivo plaovgraph
					CreateProject.createProject("PLAOVgraph_"+nome_saida, new java.net.URI("file:/"+Platform.getLocation()));
					System.out.println("Specification PL-AOVgraph generated with success!");
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
