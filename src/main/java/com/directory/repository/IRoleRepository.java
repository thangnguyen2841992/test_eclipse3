package com.directory.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.directory.model.entity.Role;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findRolesByName(String name);
}
