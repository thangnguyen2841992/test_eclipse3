package com.directory.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LoginForm {
	  @SuppressWarnings("unused")
	private String username;

	    @SuppressWarnings("unused")
		private String password;

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public LoginForm(String username, String password) {
			super();
			this.username = username;
			this.password = password;
		}

		public LoginForm() {
			super();
		}
	    
	    
}
