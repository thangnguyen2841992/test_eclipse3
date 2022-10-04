package com.directory.service.value;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.directory.model.dto.VocabularyDTO;
import com.directory.model.entity.Key;
import com.directory.model.entity.Value;
import com.directory.repository.IValueRepository;
import com.directory.service.vocabulary.IVocabularyService;

@Service
public class ValueService implements IValueService{
    @Autowired
    private IValueRepository valueRepository;
    @Autowired
    private IVocabularyService vocabularyService;
    

    @Override
    public List<String> findValuesByKey_Id(Long keyId) {
        return this.valueRepository.findValuesByKey_Id(keyId);
    }

    @Override
    public List<Value> findValuesByTranslationContaining(String translation) {
        return this.valueRepository.findValuesByTranslationContaining(translation);
    }

    @Override
    public List<VocabularyDTO> findVocabularyDTOByListValue(List<Value> values) {
        List<Key> keys = new ArrayList<>();
        for (int i = 0; i < values.size(); i++) {
            keys.add(this.vocabularyService.findById(values.get(i).getKey().getId()).get());
        }
        List<VocabularyDTO> vocabularyDTOS = this.vocabularyService.searchByKey(keys);
        return vocabularyDTOS;
    }

	@Override
	public Iterable<Value> findAll() {
		// TODO Auto-generated method stub
		return this.valueRepository.findAll();
	}

	@Override
	public Optional<Value> findById(Long id) {
		// TODO Auto-generated method stub
		return this.valueRepository.findById(id);
	}

	@Override
	public Value save(Value t) {
		// TODO Auto-generated method stub
		return this.valueRepository.save(t);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		this.valueRepository.deleteById(id);
	}
}
