package com.example.tentativa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tentativa.entities.EnderecoEntity;

@Repository
public interface EnderecoRepository  extends JpaRepository<EnderecoEntity,Long>{
    
}
