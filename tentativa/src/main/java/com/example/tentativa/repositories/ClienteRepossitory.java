package com.example.tentativa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tentativa.entities.ClienteEntity;

@Repository
public interface ClienteRepossitory  extends JpaRepository<ClienteEntity, Long>{
    
}
