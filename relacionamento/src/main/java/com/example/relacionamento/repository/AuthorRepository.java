package com.example.relacionamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.relacionamento.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
