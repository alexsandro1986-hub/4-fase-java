package com.example.prova.entities;

// Importação da anotação JsonIgnore do Jackson para controlar a serialização JSON.
import com.fasterxml.jackson.annotation.JsonIgnore;

// Importação das anotações do Jakarta Persistence para definir a entidade e o mapeamento ORM.
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

// Anotação que indica que esta classe é uma entidade que será mapeada para uma tabela no banco de dados.
@Entity
public class ProdutoEntiti {
    // Anotação que indica que este campo é a chave primária da entidade.
    @Id
    // Anotação que indica que o valor da chave primária será gerado automaticamente.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    // Mapeamento do campo "nome" para a coluna correspondente na tabela.
    @Column(name = "nome")
    private String nome;
    
    // Mapeamento do campo "preco" para a coluna correspondente na tabela.
    @Column(name = "preco")
    private Float preco;

    // Mapeamento do campo "descricao" para a coluna correspondente na tabela.
    @Column(name = "descricao")
    private String descricao;
    
    // Mapeamento de um relacionamento muitos-para-um com a entidade VendedorEntiti.
    @ManyToOne
    // Indica que a coluna "id_vendedor" na tabela será usada para este relacionamento.
    @JoinColumn(name = "id_vendedor")
    // Anotação que impede que o campo vendedor seja incluído na serialização JSON.
    @JsonIgnore
    private VendedorEntiti vendedor;

    // Métodos getters e setters para acessar e modificar os campos da classe.

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

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public VendedorEntiti getVendedor() {
        return vendedor;
    }

    public void setVendedor(VendedorEntiti vendedor) {
        this.vendedor = vendedor;
    }

}
