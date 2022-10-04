package com.directory.service.vocabulary;

import java.util.List;

import com.directory.IGeneralService;
import com.directory.model.dto.VocabularyDTO;
import com.directory.model.entity.Key;

public interface IVocabularyService extends IGeneralService<Key> {
    List<VocabularyDTO> findAllKeyAndValue();

    List<Key> findByVocabularyContaining(String key);

    List<VocabularyDTO> searchByKey(List<Key> keys);

    List<Key> findByVocabularyContainingOrJapaneseContainingOrKanjiContaining(String key1, String key2, String key3);

    Iterable<Key> getAllVocabularyOfLessonOfBook(Long bookId, Long lessonId, Integer limit, Integer offset);

    Iterable<Key> getAllVocabularyOfLessonOfBook(Long bookId, Long lessonId);



}
