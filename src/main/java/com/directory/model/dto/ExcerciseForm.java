package com.directory.model.dto;

import com.directory.model.entity.Question;

public class ExcerciseForm {
	   private String name;

	    private String caption;

	    private String audioFile;

	    private Long userId;

	    private Long bookId;

	    private Long lessonId;

	    private Question[] questions;

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

		public Long getUserId() {
			return userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}

		public Long getBookId() {
			return bookId;
		}

		public void setBookId(Long bookId) {
			this.bookId = bookId;
		}

		public Long getLessonId() {
			return lessonId;
		}

		public void setLessonId(Long lessonId) {
			this.lessonId = lessonId;
		}

		public Question[] getQuestions() {
			return questions;
		}

		public void setQuestions(Question[] questions) {
			this.questions = questions;
		}
	    
	    
}
