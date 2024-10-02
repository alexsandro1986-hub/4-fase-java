package com.example.tentativa.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tentativa.dtos.req.CreateClinicaDTO;
import com.example.tentativa.dtos.res.ShowClinicaDTO;
import com.example.tentativa.services.ClinicaService;



@RestController
@RequestMapping("/clinica")
public class ClinicaController {
    
    @Autowired
    ClinicaService clinicaService;

 @PostMapping
    public ResponseEntity<?> createclinica(@RequestBody CreateClinicaDTO dto) {

        System.out.println(dto.getNome());
        System.out.println(dto.getEndereco().getCidade());
        System.out.println(dto.getCliente().get(0).getNome());
        System.out.println(dto.getCliente().get(0).getData());

        clinicaService.createclinica(dto);

        return ResponseEntity.status(201).build();
    }

@GetMapping
    public ResponseEntity<?> getAllclinica() {

        List<ShowClinicaDTO> clinicas = clinicaService.getAllClinica();

        return ResponseEntity.status(200).body(clinicas);
    }






}
