package com.directory.service.lesson;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.directory.model.entity.Book;
import com.directory.model.entity.Lesson;
import com.directory.repository.ILessonRepository;

@Service
public class LessonService implements ILessonService{
    @Autowired
    private ILessonRepository lessonRepository;

	@Override
	public Iterable<Lesson> findAll() {
		// TODO Auto-generated method stub
		return this.lessonRepository.findAll();
	}

	@Override
	public Optional<Lesson> findById(Long id) {
		// TODO Auto-generated method stub
		return this.lessonRepository.findById(id);
	}

	@Override
	public Lesson save(Lesson t) {
		// TODO Auto-generated method stub
		return this.lessonRepository.save(t);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		this.lessonRepository.deleteById(id);
	}

	@Override
	public Iterable<Lesson> findLessonsByBook(Book book) {
		// TODO Auto-generated method stub
		return this.lessonRepository.findLessonsByBook(book);
	}
 
}
