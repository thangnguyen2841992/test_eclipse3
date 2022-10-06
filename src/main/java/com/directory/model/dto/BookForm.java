package com.directory.model.dto;

public class BookForm {
	@SuppressWarnings("unused")
	private String name;
	
	@SuppressWarnings("unused")
	private String author;
	
	@SuppressWarnings("unused")
	private Integer totalLesson;

	public BookForm(String name, String author, Integer totalLesson) {
		super();
		this.name = name;
		this.author = author;
		this.totalLesson = totalLesson;
	}

	public BookForm() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getTotalLesson() {
		return totalLesson;
	}

	public void setTotalLesson(Integer totalLesson) {
		this.totalLesson = totalLesson;
	}
	
	
}
