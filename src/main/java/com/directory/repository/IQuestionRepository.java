package com.directory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.directory.model.entity.Question;

@Repository
public interface IQuestionRepository extends JpaRepository<Question, Long> {
    Iterable<Question> getQuestionsByExcercise_Id(Long excerciseId);

}
