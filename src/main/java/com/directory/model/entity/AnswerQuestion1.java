package com.directory.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "answer_question1s")
public class AnswerQuestion1 {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String answer;
	
	@ManyToOne
	private QuestionTest1 questionTest1;

	public AnswerQuestion1(Long id, String answer, QuestionTest1 questionTest1) {
		super();
		this.id = id;
		this.answer = answer;
		this.questionTest1 = questionTest1;
	}

	public AnswerQuestion1(String answer, QuestionTest1 questionTest1) {
		super();
		this.answer = answer;
		this.questionTest1 = questionTest1;
	}

	public AnswerQuestion1() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public QuestionTest1 getQuestionTest1() {
		return questionTest1;
	}

	public void setQuestionTest1(QuestionTest1 questionTest1) {
		this.questionTest1 = questionTest1;
	}
	
	
	
}
