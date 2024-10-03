package com.example.recuperacao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.recuperacao.entities.EnderecoEntity;
@Repository
public interface Enderecorepository extends JpaRepository<EnderecoEntity, Long>{
    
}
