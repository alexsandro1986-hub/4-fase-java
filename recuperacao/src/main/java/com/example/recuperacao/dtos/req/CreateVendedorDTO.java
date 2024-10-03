package com.example.recuperacao.dtos.req;
import java.util.List;


public class CreateVendedorDTO {
    
    private Long id; 
    private String nome;

    private String cpf;

    private CreateEnderecoDTO endereco;

    private List<CreateProdutoDTO> produto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public CreateEnderecoDTO getEndereco() {
        return endereco;
    }

    public void setEndereco(CreateEnderecoDTO endereco) {
        this.endereco = endereco;
    }

    public List<CreateProdutoDTO> getProduto() {
        return produto;
    }

    public void setProduto(List<CreateProdutoDTO> produto) {
        this.produto = produto;
    }

    

    

}
