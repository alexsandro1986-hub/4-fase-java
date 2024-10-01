package com.example.prova.repositories;

// Importação das classes necessárias do Spring Data JPA.
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Importação da entidade VendedorEntiti.
import com.example.prova.entities.VendedorEntiti;

// Anotação que indica que esta interface é um repositório Spring.
@Repository
// Interface que estende JpaRepository, permitindo operações CRUD para a entidade VendedorEntiti.
public interface VendedorRepositori extends JpaRepository<VendedorEntiti, Long> {
    // JpaRepository já fornece implementações padrão para métodos como save, findAll, findById, etc.
}
