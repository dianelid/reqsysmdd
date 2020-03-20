package reqsysmdd.actions.util;

import java.awt.Component;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class FileOperations {

	public File selectFile(String message, String title){
		File file=null;
		Object[] options = {"Yes", "Cancel"};
		Object frame = null;
		int option = JOptionPane.showOptionDialog((Component) frame, message, title,
			JOptionPane.YES_OPTION, JOptionPane.NO_OPTION, null, options, options[0]);

		if(option == JOptionPane.YES_OPTION){//usar arquivo de entrada
			final JFileChooser fc = new JFileChooser();
	        if(fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
	        	file = fc.getSelectedFile();  
	        else
	        	System.out.println("Voce nao selecionou nenhum arquivo.");
		}
		return file;
	}
		
	public String readFile(File file){
		String arquivo=null;
		try{
			FileInputStream fis=new FileInputStream(file);
			int i=fis.read();
			while(i!=-1){
			   if(arquivo==null)
				   arquivo=(char)i+"";
			   else
				   arquivo+=(char)i;
			   i=fis.read();	
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return arquivo;
	}
	
	public void writeFile(String file, String path){
		try{
			FileOutputStream fos=new FileOutputStream(path);
			for(int i=0;i<file.length();i++)
			   fos.write((int)file.charAt(i));
			fos.flush();
			fos.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	public void includePathFileXfmm(String path) {
		File file= new File(path+"\\FeatureModel.xfm");
		String lines[]=readFile(file).split("\n");
		lines[4]+=" ./FeatureModel.xfmm\">";
		StringBuffer str=new StringBuffer(lines[0]+"\n");
		for(int i=1;i<lines.length;i++){
			str.append(lines[i]+"\n");
		}
		file.delete();
		writeFile(str.toString(),path+"\\FeatureModel.xfm");
	}
}