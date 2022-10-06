package com.directory.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "question1")
public class QuestionTest1 {
	  	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	  	
	  	private String question;
	  	
	  	private String correctAnswer;
	  	
	  	@ManyToOne
	  	private Test test;

	  	

		public QuestionTest1(Long id, String question, String correctAnswer, Test test) {
			super();
			this.id = id;
			this.question = question;
			this.correctAnswer = correctAnswer;
			this.test = test;
		}

		  

		public QuestionTest1(String question, String correctAnswer, Test test) {
			super();
			this.question = question;
			this.correctAnswer = correctAnswer;
			this.test = test;
		}



		public QuestionTest1() {
			super();
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



		public String getCorrectAnswer() {
			return correctAnswer;
		}



		public void setCorrectAnswer(String correctAnswer) {
			this.correctAnswer = correctAnswer;
		}



		public Test getTest() {
			return test;
		}



		public void setTest(Test test) {
			this.test = test;
		}

	  	
	  	
	  	
}
