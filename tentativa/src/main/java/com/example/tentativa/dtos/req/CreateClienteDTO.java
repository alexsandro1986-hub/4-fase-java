package com.example.tentativa.dtos.req;

// Importação da classe LocalDate para trabalhar com datas
import java.time.LocalDate;

// Classe que representa um DTO (Data Transfer Object) para criar um cliente
public class CreateClienteDTO {
    
    // Atributo que armazena o nome do cliente
    private String nome;

    // Atributo que armazena a data associada ao cliente
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
}
