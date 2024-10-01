package com.example.prova.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.prova.entities.ProdutoEntiti;

@Repository
public interface ProdutoRepositori  extends JpaRepository<ProdutoEntiti, Long>{
    
}
