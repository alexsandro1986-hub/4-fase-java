package com.example.recuperacao.dtos.res;

import java.util.List;




public class ShowVendedorDTO {
    
    private Long id; 
    private String nome;

    private String cpf;

    private ShowEnderecoDTO endereco;

    private List<ShowProdutoDTO> produtos;

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

    public ShowEnderecoDTO getEndereco() {
        return endereco;
    }

    public void setEndereco(ShowEnderecoDTO endereco) {
        this.endereco = endereco;
    }

    public List<ShowProdutoDTO> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ShowProdutoDTO> produtos) {
        this.produtos = produtos;
    }

   

   

    

    
}
