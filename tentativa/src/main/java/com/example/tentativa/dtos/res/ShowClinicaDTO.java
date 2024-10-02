package com.example.tentativa.dtos.res;

import java.util.List;

// Classe que representa um DTO (Data Transfer Object) para mostrar informações de uma clínica
public class ShowClinicaDTO {
    // Atributo que armazena o identificador único da clínica
    private Long id;

    // Atributo que armazena o nome da clínica
    private String nome;

    // Atributo que armazena o endereço da clínica, representado por um objeto
    // ShowEnderecoDto
    private ShowEnderecoDto endereco;

    // Lista de clientes associados à clínica, representados por objetos
    // ShowClienteDTO
    private List<ShowClienteDTO> clientes;

    // Método getter para obter o ID da clínica
    public Long getId() {
        return id;
    }

    // Método setter para definir o ID da clínica
    public void setId(Long id) {
        this.id = id;
    }

    // Método getter para obter a lista de clientes da clínica
    public List<ShowClienteDTO> getClientes() {
        return clientes;
    }

    // Método setter para definir a lista de clientes da clínica
    public void setClientes(List<ShowClienteDTO> clientes) {
        this.clientes = clientes;
    }

    // Método getter para obter o endereço da clínica
    public ShowEnderecoDto getEndereco() {
        return endereco;
    }

    // Método setter para definir o endereço da clínica
    public void setEndereco(ShowEnderecoDto endereco) {
        this.endereco = endereco;
    }

    // Método getter para obter o nome da clínica
    public String getNome() {
        return nome;
    }

    // Método setter para definir o nome da clínica
    public void setNome(String nome) {
        this.nome = nome;
    }

//     Classe ShowClinicaDTO:
//     Esta classe
//     é um

//     DTO (Data Transfer Object) que encapsula os dados que representam uma clínica. É usado para transferir informações entre a camada de serviço e a camada de apresentação.

// Atributos:

// id: Um Long que armazena o identificador único da clínica.
// nome: Um String que armazena o nome da clínica.
// endereco: Um objeto do tipo ShowEnderecoDto que contém os detalhes do endereço da clínica.
// clientes: Uma lista de objetos ShowClienteDTO, que representa os clientes associados à clínica.
// Métodos Getter e Setter: Cada atributo tem métodos

//     para obter (getter)

//     e definir (setter) seus valores. Isso permite que a classe mantenha o encapsulamento, permitindo o acesso controlado às suas propriedades.

// Se você tiver mais perguntas ou precisar de mais informações, é só avisar!
}
