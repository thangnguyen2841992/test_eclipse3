package com.directory.service.book;

import java.util.Optional;

import com.directory.IGeneralService;
import com.directory.model.entity.Book;

public interface IBookService extends IGeneralService<Book> {
    Optional<Book> findBooksByName(String name);


}
