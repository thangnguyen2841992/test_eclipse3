package com.directory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.directory.model.entity.Test;

@Repository
public interface ITestRepository extends JpaRepository<Test, Long> {

}
