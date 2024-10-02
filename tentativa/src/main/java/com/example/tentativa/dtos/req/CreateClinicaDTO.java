package com.example.tentativa.dtos.req;
import java.util.List;


public class CreateClinicaDTO {
    
    private String nome;
    private CreateEnderecoDTO endereco;
    private List<CreateClienteDTO> cliente;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CreateEnderecoDTO getEndereco() {
        return endereco;
    }

    public void setEndereco(CreateEnderecoDTO endereco) {
        this.endereco = endereco;
    }

    public List<CreateClienteDTO> getCliente() {
        return cliente;
    }

    public void setCliente(List<CreateClienteDTO> cliente) {
        this.cliente = cliente;
    }

   
    
}
