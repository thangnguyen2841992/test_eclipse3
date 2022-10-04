package com.directory.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.directory.model.entity.User;

public interface IUserRepository extends JpaRepository<User, Long> {
	 Optional<User> findByUsername(String username);
	 
	 Optional<User> findUsersByEmail(String email);

	    Optional<User> findUsersByPhone(String phone);
}
