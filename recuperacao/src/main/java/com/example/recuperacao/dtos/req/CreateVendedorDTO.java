package com.example.recuperacao.dtos.req;
import java.util.List;


public class CreateVendedorDTO {
    
    private Long id; 
    private String nome;

    private String cpf;

    private CreateEnderecoDTO endereco;

    private List<CreateProdutoDTO> produtos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public List<CreateProdutoDTO> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<CreateProdutoDTO> produtos) {
        this.produtos = produtos;
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

   

    

    

}
