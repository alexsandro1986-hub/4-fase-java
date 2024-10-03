package com.example.recuperacao.entities;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity(name ="endereco")
public class EnderecoEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "rua")
    private String rua;
    @Column(name = "numero")
    private String numero;
    @Column(name = "cidade")
    private String cidade;

   @OneToOne
   @JoinColumn(name = "id_vendedor")
   private VendedorEntity vendedor;

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

public VendedorEntity getVendedor() {
    return vendedor;
}

public void setVendedor(VendedorEntity vendedor) {
    this.vendedor = vendedor;
}

   


}
