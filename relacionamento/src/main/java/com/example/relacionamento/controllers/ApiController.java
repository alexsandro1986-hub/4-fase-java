package com.example.relacionamento.controllers;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.relacionamento.entity.Author;
import com.example.relacionamento.entity.Book;
import com.example.relacionamento.repository.AuthorRepository;
import com.example.relacionamento.repository.BookRepository;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private BookRepository bookRepository;

    @PostMapping("/authors")
    public Author createAuthor(@RequestBody Author author) {
        return authorRepository.save(author);
    }

    @PostMapping("/books")
    public Book createBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @GetMapping("/authors/{id}")
    public Author getAuthor(@PathVariable Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    @GetMapping("/authors/{id}/books")
    public Set<Book> getBooksByAuthor(@PathVariable Long id) {
        Author author = authorRepository.findById(id).orElse(null);
        return author != null ? author.getBooks() : null;
    }
}
