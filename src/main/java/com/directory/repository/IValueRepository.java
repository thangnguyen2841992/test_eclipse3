package com.directory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.directory.model.entity.Value;

@Repository
public interface IValueRepository extends JpaRepository<Value, Long> {
	@Query(value = "select v.translation from _values as v where key_id = ?1", nativeQuery = true)
    List<String> findValuesByKey_Id(Long keyId);

    List<Value> findValuesByTranslationContaining(String translation);
}
