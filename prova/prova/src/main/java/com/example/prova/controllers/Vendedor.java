package com.example.prova.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.prova.entities.EnderecoEntiti;
import com.example.prova.repositories.EnderecoRepositori;
import com.example.prova.repositories.VendedorRepositori;

@RestController
@RequestMapping("/api")
public class Vendedor {

    @Autowired
    private EnderecoRepositori enderecoRepositori;

    @Autowired
    private VendedorRepositori vendedorRepositori;

     @PostMapping("/venda")
    public Vendedor createVendedor(@RequestBody Vendedor vendedor) {
        return vendedorRepositori.save(vendedor);
    }

    // @PostMapping("/endereco")
    // public Endereco createEndereco(@RequestBody Endereco endereco) {
    //     return enderecoRepositori.save(endereco);
    // }

    // @GetMapping("/persons/{id}")
    // public Person getPerson(@PathVariable Long id) {
    //     return personRepository.findById(id).orElse(null);
    // }

    // @GetMapping("/addresses/{id}")
    // public Address getAddress(@PathVariable Long id) {
    //     return addressRepository.findById(id).orElse(null);
    // }
}
