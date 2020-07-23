package com.todoapp.entities;

public class ToDoList {

	private String title;
	private String description;

	public ToDoList() {
		super();
	}

	public ToDoList(String title, String description) {
		super();
		this.title = title;
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "ToDoList [title=" + title + ", description=" + description + "]";
	}
}
