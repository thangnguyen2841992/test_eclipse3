package com.directory.service.lesson;

import com.directory.IGeneralService;
import com.directory.model.entity.Book;
import com.directory.model.entity.Lesson;

public interface ILessonService extends IGeneralService<Lesson> {
    Iterable<Lesson> findLessonsByBook(Book book);
}
