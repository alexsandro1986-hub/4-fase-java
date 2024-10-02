package com.example.tentativa.entities;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDate;

@Entity(name = "cliente")
public class ClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;


    @Column(name = "data")
    private LocalDate data;

    @ManyToOne
    @JoinColumn(name = "id_clinica")
    private ClinicaEntity clinica;

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

   

    public ClinicaEntity getClinica() {
        return clinica;
    }

    public void setClinica(ClinicaEntity clinica) {
        this.clinica = clinica;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    // spring.datasource.url=jdbc:postgresql://localhost:5432/tentativa
    // spring.datasource.username=postgres
    // spring.datasource.password=vale02
    
    // spring.datasource.driver-class-name=org.postgresql.Driver

//     create table clinica(
// id serial primary key,
// nome text not null
// )

// create table endereco(
// id serial primary key
// rua  text not null,
// numero text not null,
// cidade text not null,
// id_clinica integer references clinica (id)
// )

// select * from endereco



// create table cliente(
// id serial primary key,
// nome text not null,
// data date not null,
// id_clinica integer references clinica (id)
// )

// select * from cliente


}
