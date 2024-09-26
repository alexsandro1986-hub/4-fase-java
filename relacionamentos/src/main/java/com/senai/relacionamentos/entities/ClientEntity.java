package com.senai.relacionamentos.entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name = "clientes")
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
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

    @OneToMany(mappedBy = "client")
    private List<BankAccountEntity> bankAccounts;

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

    public List<BankAccountEntity> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(List<BankAccountEntity> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }
}
