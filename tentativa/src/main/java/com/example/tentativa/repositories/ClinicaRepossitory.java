package com.example.tentativa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tentativa.entities.ClinicaEntity;

@Repository
public interface ClinicaRepossitory  extends JpaRepository<ClinicaEntity, Long>{
    
}
