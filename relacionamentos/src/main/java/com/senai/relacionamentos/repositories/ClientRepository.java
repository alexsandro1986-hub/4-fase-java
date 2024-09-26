package com.senai.relacionamentos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.relacionamentos.entities.ClientEntity;

@Repository
public interface ClientRepository extends JpaRepository<ClientEntity, Long> {
    
}
