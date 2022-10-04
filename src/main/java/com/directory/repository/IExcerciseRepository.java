package com.directory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.directory.model.entity.Excercise;

@Repository
public interface IExcerciseRepository extends JpaRepository<Excercise, Long> {
    Iterable<Excercise> getExcercisesByBook_IdAndLesson_IdOrderById(Long bookId, Long lessonId);
}
