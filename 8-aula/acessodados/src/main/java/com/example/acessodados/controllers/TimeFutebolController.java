package com.example.acessodados.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.acessodados.repository.TimeFutebolRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController

@RequestMapping("/time_futebol")


public class TimeFutebolController {
    @Autowired
    TimeFutebolRepository timeFutebolRepository;
    
    
    @GetMapping
   
    
    public ResponseEntity getTimes(){

        timeFutebolRepository.findAll();

        return ResponseEntity.ok().build();


     
    }

}
