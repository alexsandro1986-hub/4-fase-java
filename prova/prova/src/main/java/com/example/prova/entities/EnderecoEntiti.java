package com.example.prova.entities;

import jakarta.persistence.Id;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Entity;
import java.util.List;

@Entity(name = "endereco")
public class EnderecoEntiti {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;

    @Column(name = "rua")
    private String rua;

    @Column(name = "numero")
    private String numero;

    @Column(name = "cidade")
    private String cidade;

    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

   

    
    // CREATE TABLE endereco (
    //     id SERIAL PRIMARY KEY,
    //     rua TEXT NOT NULL,
    //     numero TEXT NOT NULL,
    //     cidade TEXT NOT NULL
    // );
    // CREATE TABLE vendedor (
    //     id SERIAL PRIMARY KEY,
    //     nome TEXT NOT NULL,
    //     cpf TEXT NOT NULL,
    //     id_endereco INTEGER REFERENCES endereco(id)
    // );
    
    
    // CREATE TABLE produto (
    //     id SERIAL PRIMARY KEY,
    //     nome TEXT NOT NULL,
    //     descricao TEXT NOT NULL,
    //     preco FLOAT,
    //     id_vendedor INTEGER REFERENCES vendedor(id)
    // );

}
