package com.example.tentativa.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Id;

@Entity(name = "endereco")
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
        @JoinColumn(name = "id_clinica")
        private ClinicaEntity clinica;
        
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
        
        public ClinicaEntity getClinica() {
                return clinica;
        }
        
        public void setClinica(ClinicaEntity clinica) {
                this.clinica = clinica;
        }
        public Long getId() {
                return id;
        }
        
        public void setId(Long id) {
                this.id = id;
        }
        
}
