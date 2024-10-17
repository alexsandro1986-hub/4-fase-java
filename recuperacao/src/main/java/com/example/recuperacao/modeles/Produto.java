package com.example.recuperacao.modeles;

import com.example.recuperacao.interfaces.IProduto;

public abstract class Produto  implements IProduto {
    protected final double comissao = 10;
    
    
    private String nome;
    private String preco;
    
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getPreco() {
        return preco;
    }
    public void setPreco(String preco) {
        this.preco = preco;
    }


    
}
