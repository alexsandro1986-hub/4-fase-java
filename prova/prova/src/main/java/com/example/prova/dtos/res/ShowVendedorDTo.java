package com.example.prova.dtos.res;

import java.util.List;




public class ShowVendedorDTo {
   private String nome;
    private String cpf;
    
    private ShowEnderecoDTO endereco;
    private List<ShowProdutoDTO> produto;
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
    public List<ShowProdutoDTO> getProduto() {
        return produto;
    }
    public void setProduto(List<ShowProdutoDTO> produto) {
        this.produto = produto;
    }
    
 

}
