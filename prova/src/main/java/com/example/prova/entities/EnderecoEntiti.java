package com.example.prova.entities;

// Importando anotações do Jakarta Persistence para a definição da entidade e mapeamento ORM.
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Entity;
import java.util.List;

// Anotação que indica que esta classe é uma entidade e será mapeada para a tabela "endereco".
@Entity(name = "endereco")
public class EnderecoEntiti {

    // Anotação que indica que este campo é a chave primária da entidade.
    @Id
    // Anotação que indica que o valor da chave primária será gerado automaticamente.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Anotação que mapeia este campo para a coluna "id" na tabela.
    @Column(name = "id")
    private Long id;

    // Mapeamento do campo "rua" para a coluna correspondente na tabela "endereco".
    @Column(name = "rua")
    private String rua;

    // Mapeamento do campo "numero" para a coluna correspondente na tabela "endereco".
    @Column(name = "numero")
    private String numero;

    // Mapeamento do campo "cidade" para a coluna correspondente na tabela "endereco".
    @Column(name = "cidade")
    private String cidade;

    // Métodos getters e setters para acessar e modificar os campos da classe.

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    // Comentários de SQL para a criação das tabelas no banco de dados.
    // CREATE TABLE endereco (
    //     id SERIAL PRIMARY KEY,
    //     rua TEXT NOT NULL,
    //     numero TEXT NOT NULL,
    //     cidade TEXT NOT NULL
    // );
    // CREATE TABLE vendedor (
    //     id SERIAL PRIMARY KEY,
    //     nome TEXT NOT NULL,
    //     cpf TEXT NOT NULL,
    //     id_endereco INTEGER REFERENCES endereco(id)
    // );
    
    // CREATE TABLE produto (
    //     id SERIAL PRIMARY KEY,
    //     nome TEXT NOT NULL,
    //     descricao TEXT NOT NULL,
    //     preco FLOAT,
    //     id_vendedor INTEGER REFERENCES vendedor(id)
    // );

}
