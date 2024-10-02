package com.example.tentativa.dtos.res;




import java.util.List;

public class ShowClinicaDTO {
    private Long id;
    
    private String nome;
    private ShowEnderecoDto endereco;
    private List<ShowClienteDTO> clientes;

    public Long getId() {
        return id;
    }

    public List<ShowClienteDTO> getClientes() {
        return clientes;
    }

    public void setClientes(List<ShowClienteDTO> clientes) {
        this.clientes = clientes;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ShowEnderecoDto getEndereco() {
        return endereco;
    }

    public void setEndereco(ShowEnderecoDto endereco) {
        this.endereco = endereco;
    }

 


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
