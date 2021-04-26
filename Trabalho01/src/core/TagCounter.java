package core;

import java.util.ArrayList;
import java.util.List;

import lista05.Pilha;
import lista05.PilhaVaziaException;
import model.TagSumarization;

public class TagCounter {

	public List<TagSumarization> sumarization = new ArrayList<TagSumarization>();

	private String firstTag = null;

	public String counter(Pilha<String> tags, String childTag) throws Exception {

		String tag = getTag(tags);
		if (firstTag == null) {
			firstTag = tag;
		}
		try {
			if (isSingletonTag(tag)) {
				childTag = tag;
			}
			if (childTag != null && tag.equals(childTag)) {
				firstTag = tag;
				boolean hasTag = false;
				for (int i = 0; i < sumarization.size(); i++) {
					if (sumarization.get(i).getTagName().equals(tag)) {
						sumarization.get(i).setTagCounter(sumarization.get(i).getTagCounter() + 1);
						hasTag = true;
					}
				}
				if (!hasTag) {
					sumarization.add(new TagSumarization(tag, 1));
				}
			}
			while (!tag.equals(childTag)) {
				childTag = counter(tags, tag);
			}
		} catch (PilhaVaziaException e) {
			if (!firstTag.equals(tag)) {
				throw new Exception("aguardava-se determinada tag " + firstTag + " mas foi encontrada outra");
			}
			return null;
		}
		return childTag;
	}

	private boolean isSingletonTag(String tag) {
		String[] singletons = { "meta", "base", "br", "col", "command", "embed", "hr", "img", "input", "link", "param",
				"source", "!DOCTYPE" };
		for (String singleton : singletons) {
			if (singleton.equals(tag)) {
				return true;
			}
		}
		return false;
	}

	private String getTag(Pilha<String> tags) {
		String[] tagsStr = tags.pop().split("/");
		String tag = "";
		if (tagsStr.length > 1) {
			tag = tagsStr[1];
		} else {
			tag = tagsStr[0];
		}
		return tag;
	}

}
