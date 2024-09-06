package com.example.acessodados.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.acessodados.services.TimeFutebolService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RestController

@RequestMapping("/time_futebol")

public class TimeFutebolController {

    @Autowired
    TimeFutebolService timeFutebolService;

    @GetMapping
    public ResponseEntity<?> getTimes() {

        var times = timeFutebolService;

        return ResponseEntity.ok(times);

    }

}
