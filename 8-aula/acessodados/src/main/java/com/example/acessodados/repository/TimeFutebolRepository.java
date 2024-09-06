package com.example.acessodados.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.acessodados.entities.TimeFutebol;


@Repository
public interface TimeFutebolRepository extends JpaRepository<TimeFutebol, Long>{
    
}
