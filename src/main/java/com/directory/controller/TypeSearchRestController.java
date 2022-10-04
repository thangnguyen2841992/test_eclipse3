package com.directory.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.directory.model.dto.ErrorMessage;
import com.directory.service.typeSearch.ITypeSearchService;

@RestController
@RequestMapping("/typeSearchs")
@CrossOrigin("*")
public class TypeSearchRestController {
    @Autowired
    private ITypeSearchService typeSearchService;

    @GetMapping
    public ResponseEntity<?> getAllTypeSearch() {
        if (!this.typeSearchService.findAll().iterator().hasNext()) {
            return new ResponseEntity<>(new ErrorMessage("Chưa có kiểu tra cứu"), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(typeSearchService.findAll(), HttpStatus.OK);
    }
}
