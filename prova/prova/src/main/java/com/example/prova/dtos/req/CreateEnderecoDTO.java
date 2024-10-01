package com.example.prova.dtos.req;

// Classe que representa o Data Transfer Object (DTO) para criar um novo endereço
public class CreateEnderecoDTO {
    
    // Atributo que representa o ID do endereço
    private Long id;

    // Atributo que representa o nome (ou descrição) do endereço
    private String name;
    
    // Atributo que representa o número do endereço
    private String numero;
    
    // Atributo que representa a cidade do endereço
    private String cidade;

    // Atributo que representa a rua do endereço
    private String rua;

    // Método que retorna o ID do endereço
    public Long getId() {
        return id;
    }

    // Método que define o ID do endereço
    public void setId(Long id) {
        this.id = id;
    }

    // Método que retorna o nome do endereço
    public String getName() {
        return name;
    }

    // Método que define o nome do endereço
    public void setName(String name) {
        this.name = name;
    }

    // Método que retorna o número do endereço
    public String getNumero() {
        return numero;
    }

    // Método que define o número do endereço
    public void setNumero(String numero) {
        this.numero = numero;
    }

    // Método que retorna a cidade do endereço
    public String getCidade() {
        return cidade;
    }

    // Método que define a cidade do endereço
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    // Método que retorna a rua do endereço
    public String getRua() {
        return rua;
    }

    // Método que define a rua do endereço
    public void setRua(String rua) {
        this.rua = rua;
    }
}
