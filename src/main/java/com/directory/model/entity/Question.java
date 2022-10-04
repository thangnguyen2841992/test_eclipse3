package com.directory.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "questions")
public class Question {
	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @SuppressWarnings("unused")
		private String question;

	    @SuppressWarnings("unused")
		private String answer;

	    @ManyToOne
	    private Excercise excercise;

		public Question(Long id, String question, String answer, Excercise excercise) {
			super();
			this.id = id;
			this.question = question;
			this.answer = answer;
			this.excercise = excercise;
		}

		public Question(String question, String answer, Excercise excercise) {
			super();
			this.question = question;
			this.answer = answer;
			this.excercise = excercise;
		}
		
		public Question() {
		
		}

		@Override
		public String toString() {
			return "Question []";
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getQuestion() {
			return question;
		}

		public void setQuestion(String question) {
			this.question = question;
		}

		public String getAnswer() {
			return answer;
		}

		public void setAnswer(String answer) {
			this.answer = answer;
		}

		public Excercise getExcercise() {
			return excercise;
		}

		public void setExcercise(Excercise excercise) {
			this.excercise = excercise;
		}
	    
	    
}
