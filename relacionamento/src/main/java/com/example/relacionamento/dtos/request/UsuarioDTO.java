package com.example.relacionamento.dtos.request;

import com.example.relacionamento.entity.Author;

public class UsuarioDTO {
    
    private Long id;
    private String nome;
    private String title;

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
    
    
    public String getTitle() {
        return title;
    }
    
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    
    public UsuarioDTO(Long id, String nome, String title) {
        this.id = id;
        this.nome = nome;
        this.title = title;
    }


    public Author getAuthor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAuthor'");
    }
    
    
    
    
    
    
    
}
