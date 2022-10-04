package com.directory.service.book;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.directory.model.entity.Book;
import com.directory.repository.IBookRepository;

@Service
public class BookService implements IBookService {
	@SuppressWarnings("unused")
	@Autowired
	private IBookRepository bookRepository;
	
	@Override
	public Iterable<Book> findAll() {
		// TODO Auto-generated method stub
		return this.bookRepository.findAll();
	}

	@Override
	public Optional<Book> findById(Long id) {
		// TODO Auto-generated method stub
		return this.bookRepository.findById(id);
	}

	@Override
	public Book save(Book t) {
		// TODO Auto-generated method stub
		return this.bookRepository.save(t);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		this.bookRepository.deleteById(id);
	}

	@Override
	public Optional<Book> findBooksByName(String name) {
		// TODO Auto-generated method stub
		return this.bookRepository.findBooksByName(name);
	}

}
