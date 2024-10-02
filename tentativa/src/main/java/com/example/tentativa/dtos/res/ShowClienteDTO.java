package com.example.tentativa.dtos.res;

import java.time.LocalDate;

// Classe que representa um DTO (Data Transfer Object) para mostrar informações de um cliente
public class ShowClienteDTO {
    // Atributo que armazena o nome do cliente
    private String nome;

    // Atributo que armazena a data associada ao cliente (pode ser a data de
    // nascimento ou outra relevante)
    private LocalDate data;

    // Método getter para obter o nome do cliente
    public String getNome() {
        return nome;
    }

    // Método setter para definir o nome do cliente
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método getter para obter a data associada ao cliente
    public LocalDate getData() {
        return data;
    }

    // Método setter para definir a data associada ao cliente
    public void setData(LocalDate data) {
        this.data = data;
    }

//     Resumo dos
//     Componentes
// Classe ShowClienteDTO:
//     Esta classe
//     é um

//     DTO (Data Transfer Object) que encapsula os dados que serão enviados para o cliente, geralmente em respostas a requisições, permitindo que as informações do cliente sejam transmitidas de forma estruturada.

// Atributos:

// nome: Um String que armazena o nome do cliente.
// data: Um LocalDate que pode representar a data de nascimento do cliente ou outra data relevante.
// Métodos Getter e Setter: Cada atributo possui métodos

//     para obter (getter)

//     e definir (setter) seus valores. Isso permite que a classe mantenha o encapsulamento, garantindo que os dados sejam acessados e modificados de maneira controlada.

// Caso precise de mais detalhes ou tenha outras perguntas, é só avisar!
}
