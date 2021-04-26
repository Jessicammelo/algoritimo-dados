package core;

import lista05.Pilha;
import lista05.PilhaLista;

public class HTMLParser {
	
	public Pilha<String> getHTMLTags() {
		Pilha<String> tags = new PilhaLista<>();
		String html = "<html>"
				+ "<body>"
				+ "<h1>Aqui cabeçalho do arquivo</h1>"
				+ "<p>Meu parágrafo da página web.</p>"
				+ "<p>Meu segundo parágrafo.</p>"
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
