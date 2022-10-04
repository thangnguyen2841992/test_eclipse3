package com.directory.service.user;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.directory.IGeneralService;
import com.directory.model.entity.User;

public interface IUserService extends IGeneralService<User>, UserDetailsService {
	  User saveAdmin(User user);

	    User saveUser(User user);

	    Optional<User> findByUsername(String username);

	    Optional<User> findUsersByEmail(String email);

	    Optional<User> findUsersByPhone(String phone);
}
