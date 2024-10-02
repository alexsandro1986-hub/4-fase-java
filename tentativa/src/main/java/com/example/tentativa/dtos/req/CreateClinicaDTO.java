package com.example.tentativa.dtos.req;

// Importação da lista para manipulação de coleções
import java.util.List;

// Classe que representa um DTO (Data Transfer Object) para criar uma clínica
public class CreateClinicaDTO {
    
    // Atributo que armazena o ID da clínica
    private Long id;

    // Atributo que armazena o nome da clínica
    private String nome;

    // Atributo que representa o endereço da clínica, encapsulado em um DTO
    private CreateEnderecoDTO endereco;

    // Atributo que representa uma lista de clientes, cada um encapsulado em um DTO
    private List<CreateClienteDTO> cliente;

    // Método getter para obter o ID da clínica
    public Long getId() {
        return id;
    }

    // Método setter para definir o ID da clínica
    public void setId(Long id) {
        this.id = id;
    }

    // Método getter para obter o nome da clínica
    public String getNome() {
        return nome;
    }

    // Método setter para definir o nome da clínica
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método getter para obter o endereço da clínica
    public CreateEnderecoDTO getEndereco() {
        return endereco;
    }

    // Método setter para definir o endereço da clínica
    public void setEndereco(CreateEnderecoDTO endereco) {
        this.endereco = endereco;
    }

    // Método getter para obter a lista de clientes da clínica
    public List<CreateClienteDTO> getCliente() {
        return cliente;
    }

    // Método setter para definir a lista de clientes da clínica
    public void setCliente(List<CreateClienteDTO> cliente) {
        this.cliente = cliente;
    }
}
