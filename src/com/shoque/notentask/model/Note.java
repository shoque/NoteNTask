package com.shoque.notentask.model;

import java.util.List;

public class Note {
	private String name;
	private String documentLink;
	private List<Note> noteList;
	private String text;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDocumentLink() {
		return documentLink;
	}
	public void setDocumentLink(String documentLink) {
		this.documentLink = documentLink;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}

}
