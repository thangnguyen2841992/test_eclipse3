package com.directory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.directory.model.entity.Book;
import com.directory.model.entity.Lesson;

@Repository
public interface ILessonRepository extends JpaRepository<Lesson, Long> {
    Iterable<Lesson> findLessonsByBook(Book book);

}
