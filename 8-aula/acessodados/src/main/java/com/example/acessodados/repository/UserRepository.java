package com.example.acessodados.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.acessodados.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
