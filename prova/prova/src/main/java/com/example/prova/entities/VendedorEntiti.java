package com.example.prova.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Column;
import jakarta.persistence.GenerationType;

@Entity
public class VendedorEntiti {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_conta")
    private Long id;

    
    @Column(name = "nomecompleto")
    private String nome;
    
    private String cpf;

    @JoinColumn(name = "fk_endereco_id")
    @ManyToOne
    private EnderecoEntiti endereco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public EnderecoEntiti getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoEntiti endereco) {
        this.endereco = endereco;
    }


    

}
