package com.directory.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.directory.model.dto.VocabularyDTO;
import com.directory.model.entity.Value;
import com.directory.service.value.IValueService;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/values")
public class ValueRestController {
    @Autowired
    private IValueService valueService;

    @GetMapping("/searchByKey")
    public ResponseEntity<?> searchByKey(@RequestParam(value = "key") String key) {
        List<Value> values = this.valueService.findValuesByTranslationContaining(key);
        List<VocabularyDTO> vocabularyDTOS = this.valueService.findVocabularyDTOByListValue(values);
        return new ResponseEntity<>(vocabularyDTOS, HttpStatus.OK);
    }

}
