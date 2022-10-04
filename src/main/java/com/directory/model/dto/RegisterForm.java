package com.directory.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterForm {
	 @SuppressWarnings("unused")
	private String username;

	    @SuppressWarnings("unused")
		private String password;

	    @SuppressWarnings("unused")
		private String confirmPassword;

	    @SuppressWarnings("unused")
		private String email;

	    @SuppressWarnings("unused")
		private String phone;

		public RegisterForm(String username, String password, String confirmPassword, String email, String phone) {
			super();
			this.username = username;
			this.password = password;
			this.confirmPassword = confirmPassword;
			this.email = email;
			this.phone = phone;
		}

		public RegisterForm() {
			super();
		}

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

		public String getConfirmPassword() {
			return confirmPassword;
		}

		public void setConfirmPassword(String confirmPassword) {
			this.confirmPassword = confirmPassword;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}
	    
}
