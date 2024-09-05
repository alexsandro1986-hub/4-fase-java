package com.example.acessodados.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity(name = "time_futebol")
public class TimeFutebol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "i_uid")
    private Long id;

    @Column(name = "nome")
    private String nomeClube;
   
    @Column(name="divisao")
    private String divisao;
   
    @Column (name = "pais")
    private String pais;

    @Column(name ="tem_mundial")
    private Boolean temMundial;

}
