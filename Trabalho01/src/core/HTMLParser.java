package core;

import lista05.Pilha;
import lista05.PilhaLista;

public class HTMLParser {
	
	public Pilha<String> getHTMLTags() {
		Pilha<String> tags = new PilhaLista<>();
		String html = "<html>"
				+ "<body>"
				+ "<h1>Aqui cabe�alho do arquivo</h1>"
				+ "<p>Meu par�grafo da p�gina web.</p>"
				+ "<p>Meu segundo par�grafo.</p>"
				+ "</body>"
				+ "</html> ";
		String[] probabilityTags = html.split("<");
		for(String probabilityTag : probabilityTags) {
			String[] tagsStr = probabilityTag.split("\\>|\\/>");
			if (tagsStr.length > 0 && !"".equals(tagsStr[0])) {
				String[] tagScape = tagsStr[0].split(" ");
				String tag = tagScape[0];
				tags.push(tag);
			}
		}
		return tags;
	}

}
