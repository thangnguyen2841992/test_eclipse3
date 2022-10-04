package com.directory.service.value;

import java.util.List;

import com.directory.IGeneralService;
import com.directory.model.dto.VocabularyDTO;
import com.directory.model.entity.Value;

public interface IValueService extends IGeneralService<Value> {
    List<String> findValuesByKey_Id(Long keyId);

    List<Value> findValuesByTranslationContaining(String translation);

    List<VocabularyDTO> findVocabularyDTOByListValue(List<Value> values);

}
