package com.directory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.directory.model.entity.TypeSearch;

@Repository
public interface ITypeSearchRepository extends JpaRepository<TypeSearch, Long> {

}
