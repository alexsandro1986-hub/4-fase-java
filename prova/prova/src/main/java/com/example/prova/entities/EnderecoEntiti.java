package com.example.prova.entities;

import java.time.LocalDate;
import jakarta.persistence.Id;
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
    @Column(name = "id_endereco")
    private Long id;

    @Column(name = "nome")
    private String name;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "celular")
    private String phone;
    @Column(name = "email")
    private String email;

    @Column(name = "data_nascimento")
    private LocalDate birthDate;

    @OneToMany(mappedBy = "endereco")
    private List<VendedorEntiti> endereco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public List<VendedorEntiti> getEndereco() {
        return endereco;
    }

    public void setEndereco(List<VendedorEntiti> endereco) {
        this.endereco = endereco;
    }

    

}
