package com.directory.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.directory.model.dto.BookForm;
import com.directory.model.dto.ErrorMessage;
import com.directory.model.entity.Book;
import com.directory.model.entity.Lesson;
import com.directory.service.book.IBookService;
import com.directory.service.lesson.ILessonService;

import java.util.Iterator;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/books")
public class BookRestController {
    @Autowired
    private IBookService bookService;
    @Autowired
    private ILessonService lessonService;

    @GetMapping
    public ResponseEntity<?> getAllBooks() {
        Iterable<Book> books = this.bookService.findAll();
        if (!books.iterator().hasNext()) {
            return new ResponseEntity<>(new ErrorMessage("Không có cuốn sách nào"), HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(books, HttpStatus.OK);
    }
    @GetMapping("/book/{bookId}")
    public ResponseEntity<?> getBookByBookId(@PathVariable Long bookId) {
        Optional<Book> bookOptional = this.bookService.findById(bookId);
        if (!bookOptional.isPresent()) {
            return new ResponseEntity<>(new ErrorMessage("Sách không tồn tại!"), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(bookOptional.get(), HttpStatus.OK);
    }
//    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @PostMapping("/create")
    public  ResponseEntity<?> createNewBook(@RequestBody BookForm book) {
       Book newBook = new Book();
       newBook.setName(book.getName());
       newBook.setAuthor(book.getAuthor());
       this.bookService.save(newBook);
       for (int i = 0; i < book.getTotalLesson(); i++) {
    	   this.lessonService.save(new Lesson("" + (i + 1), newBook));
	}
        return new ResponseEntity<>(new ErrorMessage("Thêm sách thành công!"), HttpStatus.CREATED);
    }
}
