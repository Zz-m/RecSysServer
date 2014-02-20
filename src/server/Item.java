package server;

import java.io.Serializable;

import util.JsonHelper;

public class Item {
	private String id;
	private String name;
	private String summary;
	private String imageUri;

	public Item(){}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getImageUri() {
		return imageUri;
	}

	public void setImageUri(String image) {
		this.imageUri = image;
	}

}
