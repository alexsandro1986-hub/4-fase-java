package com.example.relacionamento.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Column;
import java.util.List;
import java.util.ArrayList; 


@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;
	
    
    @Column(name = "title")
    private String title;

    @ManyToOne
    @JoinColumn(name = "author_id") 
    private Author author;

    // Construtores, getters e setters
    public Book() {}

    // public Book(String title, Author author) {
    //     this.title = title;
    //     this.author = author;
    // }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}