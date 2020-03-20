package reqsysmdd.featuremodel2pl_aovgraph.files;

import java.io.FileOutputStream;
import java.util.Vector;

public class ParserXFM2Xtext {
	StringBuffer composicaoFinal = new StringBuffer();
	int i;
	
	public ParserXFM2Xtext(Vector<String> composicao, String path) {
		for (i = 0; i < composicao.size(); i++) {
			generateFile(composicao);
		}
		writeFile(composicaoFinal.toString(),path);
	}
	
	public void generateFile(Vector<String> composicao) {//corrige o problema da diferenca de hierarquia nos agrupamentos entre o modelo de features em xmi e o modelo de features produzido por XFeature
			if (composicao.elementAt(i).contains("<fm:FeatureGroup fm:value=\"FeatureGroup\">")) {
				i++;
				if (composicao.elementAt(i).contains("<fm:Cardinality fm:cardMax=\"n\" fm:cardMin=\"1\"/>") || composicao.elementAt(i).contains("<fm:Cardinality fm:cardMax=\"*\" fm:cardMin=\"1\"/>")) {
					i++;
					while (!composicao.elementAt(i).contains("</fm:FeatureGroup>")) {
						if (composicao.elementAt(i).contains("<fm:GroupedFeature") || composicao.elementAt(i).contains("<fm:GroupedReference")) {
							if (composicao.elementAt(i).charAt(composicao.elementAt(i).length()-2)=='/'){
								composicaoFinal.append(composicao.elementAt(i).substring(0, composicao.elementAt(i).length()-2)+">\n");
								composicaoFinal.append("<fm:CardinalityInclusiveOr fm:cardMax=\"n\" fm:cardMin=\"1\"/>\n");
								if(composicao.elementAt(i).contains("<fm:GroupedFeature"))
									composicaoFinal.append("</fm:GroupedFeature>\n");
								else
									composicaoFinal.append("</fm:GroupedReference>\n");
							}
							else{
								excludeQuotes (composicao,i);
								composicaoFinal.append("<fm:CardinalityInclusiveOr fm:cardMax=\"n\" fm:cardMin=\"1\"/>\n");
							}
						}
						else
							if (composicao.elementAt(i).contains("<fm:FeatureGroup fm:value=\"FeatureGroup\">")) {
								generateFile(composicao);
								excludeQuotes (composicao,i);
							}
							else
								excludeQuotes (composicao,i);
						i++;
					}
				}
				else if(composicao.elementAt(i).contains("<fm:Cardinality fm:cardMax=\"1\" fm:cardMin=\"1\"/>")) {
					i++;
					while (!composicao.elementAt(i).contains("</fm:FeatureGroup>")) {
						if (composicao.elementAt(i).contains("<fm:GroupedFeature") || composicao.elementAt(i).contains("<fm:GroupedReference")) {
							if (composicao.elementAt(i).charAt(composicao.elementAt(i).length()-2)=='/'){
								composicaoFinal.append(composicao.elementAt(i).substring(0, composicao.elementAt(i).length()-2)+">\n");
								composicaoFinal.append("<fm:CardinalityAlternative fm:cardMax=\"1\" fm:cardMin=\"1\"/>\n");
								if(composicao.elementAt(i).contains("<fm:GroupedFeature"))
									composicaoFinal.append("</fm:GroupedFeature>\n");
								else
									composicaoFinal.append("</fm:GroupedReference>\n");
							}
							else{
								excludeQuotes (composicao,i);
								composicaoFinal.append("<fm:CardinalityAlternative fm:cardMax=\"1\" fm:cardMin=\"1\"/>\n");
							}
						}
						else
							if (composicao.elementAt(i).contains("<fm:FeatureGroup fm:value=\"FeatureGroup\">")) {
								generateFile(composicao);
								excludeQuotes (composicao,i);
							}
							else
								excludeQuotes (composicao,i);
						i++;
					}
				}
				else {
					composicaoFinal.append(composicao.elementAt(i-1)+"\n");
					composicaoFinal.append(composicao.elementAt(i)+"\n");
					
					String group=null;
					int k=i+1;
					while (!composicao.elementAt(k).contains("</fm:FeatureGroup>")) {
						if (composicao.elementAt(k).contains("<fm:GroupedFeature") || composicao.elementAt(k).contains("<fm:GroupedReference")) {
							if (group==null)
								group="\""+composicao.elementAt(k).substring(composicao.elementAt(k).indexOf('"')+1, composicao.elementAt(k).indexOf('>')-1)+"\"";
							else
								group=group+", "+"\""+composicao.elementAt(k).substring(composicao.elementAt(k).indexOf('"')+1, composicao.elementAt(k).indexOf('>')-1)+"\"";
						}
						else
							if (composicao.elementAt(k).contains("<fm:FeatureGroup fm:value=\"FeatureGroup\">")) {
								generateFile(composicao);
							}
						k++;
					}
					composicaoFinal.append("<fm:GroupedFeatures fm:value="+group+"/>\n");
				}
			}
			else
				excludeQuotes (composicao,i);
	}
	
	public void excludeQuotes(Vector<String> composicao, int i){//retira as aspas da cardinalidade minima no caso de features solitarias com cardinalidade (necessario para Xtext nao apresentar erro sintatico)
		if ((composicao.elementAt(i).contains("<fm:Cardinality fm:cardMax=\"n\"") || composicao.elementAt(i).contains("<fm:Cardinality fm:cardMax=\"*\"")) && (!composicao.elementAt(i-1).contains("<fm:FeatureGroup fm:value=\"FeatureGroup\">"))) {
			composicaoFinal.append("<fm:Cardinality fm:cardMax=\"n\" fm:cardMin="+composicao.elementAt(i).substring(composicao.elementAt(i).length()-4, composicao.elementAt(i).length()-3)+"/>\n");
		}
		else
			composicaoFinal.append(composicao.elementAt(i)+"\n");
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
}
