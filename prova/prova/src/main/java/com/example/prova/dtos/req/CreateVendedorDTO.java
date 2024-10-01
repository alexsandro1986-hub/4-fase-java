package com.example.prova.dtos.req;

import java.util.List;

// Classe que representa o Data Transfer Object (DTO) para criar um novo vendedor
public class CreateVendedorDTO {

    // Atributo que representa o nome do vendedor
    private String nome;

    // Atributo que representa o CPF do vendedor
    private String cpf;

    // Atributo que representa o endereço do vendedor
    private CreateEnderecoDTO endereco;

    // Atributo que representa a lista de produtos do vendedor
    private List<CreateProdutoDTO> produto;

    // Método que retorna o nome do vendedor
    public String getNome() {
        return nome;
    }

    // Método que define o nome do vendedor
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método que retorna o endereço do vendedor
    public CreateEnderecoDTO getEndereco() {
        return endereco;
    }

    // Método que define o endereço do vendedor
    public void setEndereco(CreateEnderecoDTO endereco) {
        this.endereco = endereco;
    }

    // Método que retorna a lista de produtos do vendedor
    public List<CreateProdutoDTO> getProduto() {
        return produto;
    }

    // Método que define a lista de produtos do vendedor
    public void setProduto(List<CreateProdutoDTO> produto) {
        this.produto = produto;
    }

    // Método que retorna o CPF do vendedor
    public String getCpf() {
        return cpf;
    }

    // Método que define o CPF do vendedor
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
