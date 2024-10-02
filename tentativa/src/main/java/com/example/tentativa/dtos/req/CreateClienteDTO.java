package com.example.tentativa.dtos.req;
import java.time.LocalDate;
public class CreateClienteDTO {
    
    private String nome;

    private LocalDate data;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

 

    
}
