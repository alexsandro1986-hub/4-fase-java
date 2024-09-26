package com.senai.relacionamentos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.relacionamentos.entities.BankAccountEntity;

@Repository
public interface BankAccountRepository extends JpaRepository<BankAccountEntity, Long> {
    
}
