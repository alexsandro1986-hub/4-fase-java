package com.example.tentativa.entities;

// Importa as classes necessárias para a definição da entidade
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDate;

// Define a classe como uma entidade JPA e mapeia para a tabela "cliente"
@Entity(name = "cliente")
public class ClienteEntity {

    // Define o identificador único do cliente (chave primária)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Geração automática do ID
    private Long id;

    // Mapeia a coluna "nome" na tabela "cliente"
    @Column(name = "nome")
    private String nome;

    // Mapeia a coluna "data" como um campo LocalDate na tabela "cliente"
    @Column(name = "data")
    private LocalDate data;

    // Relacionamento muitos-para-um com ClinicaEntity
    // O ID da clínica associada será armazenado na coluna "id_clinica"
    @ManyToOne
    @JoinColumn(name = "id_clinica") // Define a coluna que referencia a clínica
    private ClinicaEntity clinica;

    // Getter para o ID do cliente
    public Long getId() {
        return id;
    }

    // Setter para o ID do cliente
    public void setId(Long id) {
        this.id = id;
    }

    // Getter para o nome do cliente
    public String getNome() {
        return nome;
    }

    // Setter para o nome do cliente
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para a clínica associada ao cliente
    public ClinicaEntity getClinica() {
        return clinica;
    }

    // Setter para a clínica associada ao cliente
    public void setClinica(ClinicaEntity clinica) {
        this.clinica = clinica;
    }

    // Getter para a data associada ao cliente
    public LocalDate getData() {
        return data;
    }

    // Setter para a data associada ao cliente
    public void setData(LocalDate data) {
        this.data = data;
    }

    // Abaixo estão as instruções SQL que criam as tabelas no banco de dados
    // Essas instruções estão comentadas e podem ser usadas para criar as tabelas
    
    // Configurações do banco de dados PostgreSQL
    // spring.datasource.url=jdbc:postgresql://localhost:5432/tentativa
    // spring.datasource.username=postgres
    // spring.datasource.password=vale02
    // spring.datasource.driver-class-name=org.postgresql.Driver

    // Criação da tabela clinica
    // create table clinica(
    //     id serial primary key,
    //     nome text not null
    // ) 

    // Criação da tabela endereco
    // create table endereco(
    //     id serial primary key,
    //     rua text not null,
    //     numero text not null,
    //     cidade text not null,
    //     id_clinica integer references clinica (id)
    // )

    // Consulta para visualizar os dados da tabela endereco
    // select * from endereco

    // Criação da tabela cliente
    // create table cliente(
    //     id serial primary key,
    //     nome text not null,
    //     data date not null,
    //     id_clinica integer references clinica (id)
    // )

    // Consulta para visualizar os dados da tabela cliente
    // select * from cliente
}
