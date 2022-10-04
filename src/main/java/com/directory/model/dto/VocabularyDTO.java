package com.directory.model.dto;

import java.util.List;

import com.directory.model.entity.Book;
import com.directory.model.entity.Lesson;
import com.directory.model.entity.User;

public class VocabularyDTO {
	@SuppressWarnings("unused")
	private User user;
    @SuppressWarnings("unused")
	private Book book;
    @SuppressWarnings("unused")
	private Lesson lesson;
    @SuppressWarnings("unused")
	private String vocabulary;
    @SuppressWarnings("unused")
	private String japanese;
    @SuppressWarnings("unused")
	private String kanji;
    @SuppressWarnings("unused")
	private String vietnameseChinese;
    @SuppressWarnings("unused")
	private List<String> translation;
    
    
	public VocabularyDTO() {
	
	}
	public VocabularyDTO(User user, Book book, Lesson lesson, String vocabulary, String japanese, String kanji,
			String vietnameseChinese, List<String> translation) {
		this.user = user;
		this.book = book;
		this.lesson = lesson;
		this.vocabulary = vocabulary;
		this.japanese = japanese;
		this.kanji = kanji;
		this.vietnameseChinese = vietnameseChinese;
		this.translation = translation;
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
	public String getVocabulary() {
		return vocabulary;
	}
	public void setVocabulary(String vocabulary) {
		this.vocabulary = vocabulary;
	}
	public String getJapanese() {
		return japanese;
	}
	public void setJapanese(String japanese) {
		this.japanese = japanese;
	}
	public String getKanji() {
		return kanji;
	}
	public void setKanji(String kanji) {
		this.kanji = kanji;
	}
	public String getVietnameseChinese() {
		return vietnameseChinese;
	}
	public void setVietnameseChinese(String vietnameseChinese) {
		this.vietnameseChinese = vietnameseChinese;
	}
	public List<String> getTranslation() {
		return translation;
	}
	public void setTranslation(List<String> translation) {
		this.translation = translation;
	}
    
    
}
