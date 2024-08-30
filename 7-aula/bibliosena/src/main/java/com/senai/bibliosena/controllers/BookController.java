package com.senai.bibliosena.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.bibliosena.dtos.request.CreateBookDto;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/books")
public class BookController {

    // books
    @PostMapping
    public ResponseEntity<?> postMethodName(@RequestBody CreateBookDto dto) {
        
        System.out.println(dto.getAuthor());

        return ResponseEntity.status(201).build();
    }

}
