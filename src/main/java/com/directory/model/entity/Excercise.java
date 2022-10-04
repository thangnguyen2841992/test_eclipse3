package com.directory.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "excercises")
public class Excercise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @SuppressWarnings("unused")
	private String name;

    @SuppressWarnings("unused")
	private String caption;

    @SuppressWarnings("unused")
	private String audioFile;



    @ManyToOne
    private User user;

    @ManyToOne
    private Book book;

    @ManyToOne
    private Lesson lesson;

	public Excercise(Long id, String name, String caption, String audioFile, User user, Book book, Lesson lesson) {
		this.id = id;
		this.name = name;
		this.caption = caption;
		this.audioFile = audioFile;
		this.user = user;
		this.book = book;
		this.lesson = lesson;
	}

	public Excercise(String name, String caption, String audioFile, User user, Book book, Lesson lesson) {
		this.name = name;
		this.caption = caption;
		this.audioFile = audioFile;
		this.user = user;
		this.book = book;
		this.lesson = lesson;
	}

	public Excercise() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getAudioFile() {
		return audioFile;
	}

	public void setAudioFile(String audioFile) {
		this.audioFile = audioFile;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Lesson getLesson() {
		return lesson;
	}

	public void setLesson(Lesson lesson) {
		this.lesson = lesson;
	}
    
    
}
