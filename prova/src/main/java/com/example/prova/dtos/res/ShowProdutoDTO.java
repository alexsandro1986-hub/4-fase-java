package com.example.prova.dtos.res;

// Classe que representa o Data Transfer Object (DTO) para mostrar informações de produto
public class ShowProdutoDTO {

    // Atributo que representa o nome do produto
    private String nome;

    // Atributo que representa o preço do produto
    private Float preco;

    // Atributo que representa a descrição do produto
    private String descricao;

    // Método que retorna o nome do produto
    public String getNome() {
        return nome;
    }

    // Método que define o nome do produto
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método que retorna o preço do produto
    public Float getPreco() {
        return preco;
    }

    // Método que define o preço do produto
    public void setPreco(Float preco) {
        this.preco = preco;
    }

    // Método que retorna a descrição do produto
    public String getDescricao() {
        return descricao;
    }

    // Método que define a descrição do produto
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
