package com.directory.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ErrorMessage {
	@SuppressWarnings("unused")
	private String name;

	public ErrorMessage(String name) {
		super();
		this.name = name;
	}

	public ErrorMessage() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
