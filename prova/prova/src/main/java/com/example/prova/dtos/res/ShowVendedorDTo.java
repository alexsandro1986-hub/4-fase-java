package com.example.prova.dtos.res;

import java.util.List;

// Classe que representa o Data Transfer Object (DTO) para mostrar informações de vendedor
public class ShowVendedorDTo {
    
    // Atributo que representa o nome do vendedor
    private String nome;

    // Atributo que representa o CPF do vendedor
    private String cpf;

    // Atributo que representa o endereço do vendedor
    private ShowEnderecoDTO endereco;

    // Atributo que representa a lista de produtos do vendedor
    private List<ShowProdutoDTO> produto;

    // Método que retorna o nome do vendedor
    public String getNome() {
        return nome;
    }

    // Método que define o nome do vendedor
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método que retorna o CPF do vendedor
    public String getCpf() {
        return cpf;
    }

    // Método que define o CPF do vendedor
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Método que retorna o endereço do vendedor
    public ShowEnderecoDTO getEndereco() {
        return endereco;
    }

    // Método que define o endereço do vendedor
    public void setEndereco(ShowEnderecoDTO endereco) {
        this.endereco = endereco;
    }

    // Método que retorna a lista de produtos do vendedor
    public List<ShowProdutoDTO> getProduto() {
        return produto;
    }

    // Método que define a lista de produtos do vendedor
    public void setProduto(List<ShowProdutoDTO> produto) {
        this.produto = produto;
    }
}
