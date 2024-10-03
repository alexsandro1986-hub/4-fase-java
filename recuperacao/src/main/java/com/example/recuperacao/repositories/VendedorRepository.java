package com.example.recuperacao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.recuperacao.entities.VendedorEntity;

@Repository
public interface VendedorRepository extends JpaRepository<VendedorEntity, Long>{
    
}
