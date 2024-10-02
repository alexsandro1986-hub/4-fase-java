package com.example.tentativa.entities;

// Importa classes necessárias para a definição da entidade
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

// Define a classe como uma entidade JPA e mapeia para a tabela "clinica"
@Entity(name ="clinica")
public class ClinicaEntity {
    
    // Define o identificador único da clínica (chave primária)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Geração automática do ID
    private Long id;

    // Mapeia a coluna "nome" na tabela "clinica"
    @Column(name = "nome")
    private String nome;

    // Relacionamento um-para-um com EnderecoEntity
    // O mapeamento é feito pela propriedade "clinica" em EnderecoEntity
    @OneToOne(mappedBy = "clinica")
    private EnderecoEntity endereco;

    // Relacionamento um-para-muitos com ClienteEntity
    // O mapeamento é feito pela propriedade "clinica" em ClienteEntity
    @OneToMany(mappedBy = "clinica")
    private List<ClienteEntity> cliente;

    // Getter para o ID da clínica
    public Long getId() {
        return id;
    }

    // Setter para o ID da clínica
    public void setId(Long id) {
        this.id = id;
    }

    // Getter para o nome da clínica
    public String getNome() {
        return nome;
    }

    // Setter para o nome da clínica
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para o endereço da clínica
    public EnderecoEntity getEndereco() {
        return endereco;
    }

    // Setter para o endereço da clínica
    public void setEndereco(EnderecoEntity endereco) {
        this.endereco = endereco;
    }

    // Getter para a lista de clientes da clínica
    public List<ClienteEntity> getCliente() {
        return cliente;
    }

    // Setter para a lista de clientes da clínica
    public void setCliente(List<ClienteEntity> cliente) {
        this.cliente = cliente;
    }
}
