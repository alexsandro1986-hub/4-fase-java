package com.example.tentativa.dtos.req;

// Classe que representa um DTO (Data Transfer Object) para criar um endereço
public class CreateEnderecoDTO {
    
    // Atributo que armazena o nome da rua
    private String rua;

    // Atributo que armazena o número da residência ou estabelecimento
    private String numero;

    // Atributo que armazena o nome da cidade
    private String cidade;

    // Método getter para obter o nome da rua
    public String getRua() {
        return rua;
    }

    // Método setter para definir o nome da rua
    public void setRua(String rua) {
        this.rua = rua;
    }

    // Método getter para obter o número da residência ou estabelecimento
    public String getNumero() {
        return numero;
    }

    // Método setter para definir o número da residência ou estabelecimento
    public void setNumero(String numero) {
        this.numero = numero;
    }

    // Método getter para obter o nome da cidade
    public String getCidade() {
        return cidade;
    }

    // Método setter para definir o nome da cidade
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
