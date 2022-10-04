package com.directory.model.dto;

import com.directory.model.entity.Question;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ExcerciseDTO {
    @SuppressWarnings("unused")
	private Long id;

    @SuppressWarnings("unused")
	private String name;

    @SuppressWarnings("unused")
	private String caption;

    @SuppressWarnings("unused")
	private String audioFile;

    @SuppressWarnings("unused")
	private Iterable<Question> questions;

	public ExcerciseDTO(Long id, String name, String caption, String audioFile, Iterable<Question> questions) {
		this.id = id;
		this.name = name;
		this.caption = caption;
		this.audioFile = audioFile;
		this.questions = questions;
	}

	public ExcerciseDTO() {
		
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

	public Iterable<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(Iterable<Question> questions) {
		this.questions = questions;
	}
    
    
}
