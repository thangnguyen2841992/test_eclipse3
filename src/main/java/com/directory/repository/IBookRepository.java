package com.directory.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.directory.model.entity.Book;

@Repository
public interface IBookRepository extends JpaRepository<Book, Long> {
    Optional<Book> findBooksByName(String name);

}
