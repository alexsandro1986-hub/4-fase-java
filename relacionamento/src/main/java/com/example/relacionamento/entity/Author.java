package com.example.relacionamento.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.Set;
import jakarta.persistence.Column;
import java.util.List;
import java.util.ArrayList;  



@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "id")
    private Long id;
    
    
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "author")
    private Set<Book> books;

    // Construtores, getters e setters
    public Author() {}

    public Author(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @SuppressWarnings("unchecked")
    public Set<Book> getBooks() {
        return (Set<Book>) books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}


