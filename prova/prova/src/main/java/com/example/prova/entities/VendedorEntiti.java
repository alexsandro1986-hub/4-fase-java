package com.example.prova.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Column;
import jakarta.persistence.GenerationType;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class VendedorEntiti {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_conta")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cpf")
    private String cpf;

    @OneToOne
    @JoinColumn(name = "id_endereco")
    private EnderecoEntiti endereco;

    @OneToMany(mappedBy = "vendedor")
    @JsonManagedReference
    private List<ProdutoEntiti> produtos;

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

    public List<ProdutoEntiti> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ProdutoEntiti> produtos) {
        this.produtos = produtos;
    }

    

}
