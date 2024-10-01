package com.example.prova.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.prova.dtos.req.CreateVendedorDTO;
import com.example.prova.entities.EnderecoEntiti;
import com.example.prova.entities.VendedorEntiti;

import com.example.prova.services.Vendedorservice;

import java.util.HashMap;  // Para usar HashMap
import java.util.Map;

@RestController
@RequestMapping("/api")
public class Vendedor {

  @Autowired
   private Vendedorservice vendedorservice;

  @GetMapping("/vendedores")
  public ResponseEntity<List<VendedorEntiti>> getAllVendedores() {
      List<VendedorEntiti> vendedores = vendedorservice.getAllVendedores();
      return ResponseEntity.ok(vendedores);
  }
    
   
    @PostMapping("/venda")
    public ResponseEntity<VendedorEntiti> createVendedor(@RequestBody CreateVendedorDTO dto) {
        System.out.println(dto.getNome());
        System.out.println("Rua: " + dto.getEndereco().getRua());
        System.out.println(dto.getEndereco().getName());
        System.out.println(dto.getProduto().get(0).getNome());
    
        VendedorEntiti vendedor = vendedorservice.createVendedor(dto); // Captura o vendedor criado
    
        return ResponseEntity.status(HttpStatus.CREATED).body(vendedor); // Retorna o vendedor criado
    }

    // @GetMapping("/vendedores/{id}/endereco")
    // public ResponseEntity<EnderecoEntiti> getEnderecoByVendedorId(@PathVariable Long id) {
    //     EnderecoEntiti endereco = vendedorservice.getEnderecoByVendedorId(id);
    //     return ResponseEntity.ok(endereco);
    // }

     @GetMapping("/{vendedorId}/endereco")
    public ResponseEntity<Map<String, Object>> getEnderecoByVendedorId(@PathVariable Long vendedorId) {
        VendedorEntiti vendedor = vendedorservice.getVendedorById(vendedorId);
        
        Map<String, Object> response = new HashMap<>();
        response.put("nome", vendedor.getNome());
        response.put("cpf", vendedor.getCpf());
        response.put("endereco", vendedor.getEndereco());
        
        return ResponseEntity.ok(response);
    }
}
