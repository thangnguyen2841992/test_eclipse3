package com.directory.model.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.directory.model.entity.Role;
import com.directory.model.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@SuppressWarnings("serial")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserPrincipal implements UserDetails {
	   @SuppressWarnings("unused")
	private Long id;

	    @SuppressWarnings("unused")
		private String username;

	    @SuppressWarnings("unused")
		private String password;

	    @SuppressWarnings("unused")
		private List<? extends GrantedAuthority> roles;

		@Override
		public Collection<? extends GrantedAuthority> getAuthorities() {
			// TODO Auto-generated method stub
			return this.roles;
		}

		@Override
		public String getPassword() {
			// TODO Auto-generated method stub
			return this.password;
		}

		@Override
		public String getUsername() {
			// TODO Auto-generated method stub
			return this.username;
		}

		@Override
		public boolean isAccountNonExpired() {
			// TODO Auto-generated method stub
			return true;
		}

		@Override
		public boolean isAccountNonLocked() {
			// TODO Auto-generated method stub
			return true;
		}

		@Override
		public boolean isCredentialsNonExpired() {
			// TODO Auto-generated method stub
			return true;
		}

		@Override
		public boolean isEnabled() {
			// TODO Auto-generated method stub
			return true;
		}
		public UserPrincipal(Long id, String username, String password, List<? extends GrantedAuthority> roles) {
			super();
			this.id = id;
			this.username = username;
			this.password = password;
			this.roles = roles;
		}

		public static UserPrincipal build(User user) {
	        List<Role> roles = user.getRoles(); 
	        List<GrantedAuthority> authorities = new ArrayList<>(); 
	        for (Role role: roles) {
	            authorities.add(new SimpleGrantedAuthority(role.getName()));
	        }
	        return new UserPrincipal(
	                user.getId(),
	                user.getUsername(),
	                user.getPassword(),
	                authorities
	        );
	    }
}
