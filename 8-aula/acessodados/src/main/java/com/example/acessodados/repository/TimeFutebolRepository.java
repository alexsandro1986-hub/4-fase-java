package com.example.acessodados.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.acessodados.entities.TimeFutebol;

public interface TimeFutebolRepository extends JpaRepository<TimeFutebol, Long>{
    
}
