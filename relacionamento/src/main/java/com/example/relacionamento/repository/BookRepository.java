package com.example.relacionamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.relacionamento.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}