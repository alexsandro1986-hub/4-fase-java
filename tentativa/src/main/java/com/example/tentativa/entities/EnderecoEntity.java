package com.example.tentativa.entities;

// Importa as classes necessárias para a definição da entidade
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Id;

// Define a classe como uma entidade JPA e mapeia para a tabela "endereco"
@Entity(name = "endereco")
public class EnderecoEntity {

    // Define o identificador único do endereço (chave primária)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Geração automática do ID
    private Long id;

    // Mapeia a coluna "rua" na tabela "endereco"
    @Column(name = "rua")
    private String rua;

    // Mapeia a coluna "numero" na tabela "endereco"
    @Column(name = "numero")
    private String numero;

    // Mapeia a coluna "cidade" na tabela "endereco"
    @Column(name = "cidade")
    private String cidade;

    // Relacionamento um-para-um com ClinicaEntity
    // O ID da clínica associada será armazenado na coluna "id_clinica"
    @OneToOne
    @JoinColumn(name = "id_clinica") // Define a coluna que referencia a clínica
    private ClinicaEntity clinica;

    // Getter para a rua do endereço
    public String getRua() {
        return rua;
    }

    // Setter para a rua do endereço
    public void setRua(String rua) {
        this.rua = rua;
    }

    // Getter para o número do endereço
    public String getNumero() {
        return numero;
    }

    // Setter para o número do endereço
    public void setNumero(String numero) {
        this.numero = numero;
    }

    // Getter para a cidade do endereço
    public String getCidade() {
        return cidade;
    }

    // Setter para a cidade do endereço
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    // Getter para a clínica associada ao endereço
    public ClinicaEntity getClinica() {
        return clinica;
    }

    // Setter para a clínica associada ao endereço
    public void setClinica(ClinicaEntity clinica) {
        this.clinica = clinica;
    }

    // Getter para o ID do endereço
    public Long getId() {
        return id;
    }

    // Setter para o ID do endereço
    public void setId(Long id) {
        this.id = id;
    }
}
