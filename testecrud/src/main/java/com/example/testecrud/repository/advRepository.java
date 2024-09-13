package com.example.testecrud.repository;

import com.example.testecrud.entity.advEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface advRepository extends JpaRepository<advEntity,Long> {
    
}
