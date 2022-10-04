package com.directory.model.dto;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class JwtResponse {
	 @SuppressWarnings("unused")
	private Long id;
	    @SuppressWarnings("unused")
		private String token;
	    @SuppressWarnings("unused")
		private String type = "Bearer";
	    @SuppressWarnings("unused")
		private String username;
	    @SuppressWarnings("unused")
		private Collection<? extends GrantedAuthority> roles;

	    public JwtResponse(String accessToken, Long id, String username, Collection<? extends GrantedAuthority> roles) {
	        this.token = accessToken;
	        this.username = username;
	        this.roles = roles;
	        this.id = id;
	    }

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getToken() {
			return token;
		}

		public void setToken(String token) {
			this.token = token;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public Collection<? extends GrantedAuthority> getRoles() {
			return roles;
		}

		public void setRoles(Collection<? extends GrantedAuthority> roles) {
			this.roles = roles;
		}
	    
}
