package com.example.prova.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.prova.controllers.Vendedor;




@Repository
public interface VendedorRepositori extends JpaRepository<Vendedor,Long>{
    
}
