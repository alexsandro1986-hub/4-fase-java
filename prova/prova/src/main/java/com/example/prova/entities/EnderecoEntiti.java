package com.example.prova.entities;

import java.time.LocalDate;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Entity;
import java.util.List;

@Entity(name = "endereco")
public class EnderecoEntiti {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "rua")
    private String name;
    @Column(name = "numero")
    private String numero;
    @Column(name = "cidade")
    private String cidade;
    
    

    @OneToMany
    @JoinColumn(name = "id_vendedor")
    private List<VendedorEntiti> vendedor;



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
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

    public List<VendedorEntiti> getVendedor() {
        return vendedor;
    }



    public void setVendedor(List<VendedorEntiti> vendedor) {
        this.vendedor = vendedor;
    }

    

    

   



//     create table "vendedor" (
// 	"id" serial primary key,
// 	"nome" text not null,
// 	"cpf" text not null
// );

// select * from vendedor;

// create table "endereco" (
// 	"rua" text not null,
// 	"numero" text not null,
// 	"cidade" text not null,
// 	"id_vendedor" integer unique references vendedor(id)
// );

// select * from endereco;

// create table "produto" (
// 	"id" serial primary key,
// 	"nome" text not null,
// 	"descricao" text not null,
// 	"id_produto" integer references vendedor(id)
// );

// select * from produto;

//alter table projetos rename to produto
    

}
