package model;

public class TagSumarization {
	
	private String tagName;
	private int tagCounter;
	
	public TagSumarization(String tagName, int tagCounter) {
		this.tagCounter = tagCounter;
		this.tagName = tagName;
	}
	public String getTagName() {
		return tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}
	public int getTagCounter() {
		return tagCounter;
	}
	public void setTagCounter(int tagCounter) {
		this.tagCounter = tagCounter;
	}
}
