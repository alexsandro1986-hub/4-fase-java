package com.example.recuperacao.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity(name ="vendedor")
public class VendedorEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 

    @Column(name ="nome")
    private String nome;

    @Column(name ="cpf")
    private String cpf;
    
    @OneToOne(mappedBy = "vendedor")
    private EnderecoEntity endereco;

    @OneToMany(mappedBy = "vendedor")
    private List<ProdutoEntity> produto;

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

    public EnderecoEntity getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoEntity endereco) {
        this.endereco = endereco;
    }

    public List<ProdutoEntity> getProduto() {
        return produto;
    }

    public void setProduto(List<ProdutoEntity> produto) {
        this.produto = produto;
    }

   


    
}
