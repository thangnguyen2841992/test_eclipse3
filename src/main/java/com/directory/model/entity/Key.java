package com.directory.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "_keys")
public class Key {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;


	    @SuppressWarnings("unused")
		private String vocabulary;

	    @SuppressWarnings("unused")
		private String japanese;

	    @SuppressWarnings("unused")
		private String katakana;

	    @SuppressWarnings("unused")
		private String kanji;

	    @SuppressWarnings("unused")
		private String vietnameseChinese;

	    @ManyToOne
	    private User user;
	    @ManyToOne
	    private Book book;
	    @ManyToOne
	    private Lesson lesson;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
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
		public String getKatakana() {
			return katakana;
		}
		public void setKatakana(String katakana) {
			this.katakana = katakana;
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
