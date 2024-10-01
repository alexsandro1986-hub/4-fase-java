package com.example.prova.entities;

// Importação das anotações do Jakarta Persistence para definir a entidade e o mapeamento ORM.
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Column;
import jakarta.persistence.GenerationType;
import java.util.List;

// Importação da anotação JsonManagedReference do Jackson para controle de serialização JSON.
import com.fasterxml.jackson.annotation.JsonManagedReference;

// Anotação que indica que esta classe é uma entidade que será mapeada para uma tabela no banco de dados.
@Entity
public class VendedorEntiti {

    // Anotação que indica que este campo é a chave primária da entidade.
    @Id
    // Anotação que indica que o valor da chave primária será gerado automaticamente.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Mapeamento do campo "id_conta" para a coluna correspondente na tabela.
    @Column(name = "id_conta")
    private Long id;

    // Mapeamento do campo "nome" para a coluna correspondente na tabela.
    @Column(name = "nome")
    private String nome;

    // Mapeamento do campo "cpf" para a coluna correspondente na tabela.
    @Column(name = "cpf")
    private String cpf;

    // Relacionamento um-para-um com a entidade EnderecoEntiti.
    @OneToOne
    // Indica que a coluna "id_endereco" na tabela será usada para este relacionamento.
    @JoinColumn(name = "id_endereco")
    private EnderecoEntiti endereco;

    // Relacionamento um-para-muitos com a entidade ProdutoEntiti.
    @OneToMany(mappedBy = "vendedor")
    // Anotação que gerencia a referência do lado "um" do relacionamento na serialização JSON.
    @JsonManagedReference
    private List<ProdutoEntiti> produtos;

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public EnderecoEntiti getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoEntiti endereco) {
        this.endereco = endereco;
    }

    public List<ProdutoEntiti> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ProdutoEntiti> produtos) {
        this.produtos = produtos;
    }

}
