package com.example.prova.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.prova.entities.EnderecoEntiti;

@Repository
public interface EnderecoRepositori  extends JpaRepository<EnderecoEntiti, Long>{

    
} 
