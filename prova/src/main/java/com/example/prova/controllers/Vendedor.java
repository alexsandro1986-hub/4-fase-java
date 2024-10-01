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
import com.example.prova.entities.ProdutoEntiti;
import com.example.prova.entities.VendedorEntiti;
import java.util.ArrayList;
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

    

     @GetMapping("/{vendedorId}/endereco")
    public ResponseEntity<Map<String, Object>> getEnderecoByVendedorId(@PathVariable Long vendedorId) {
    // Recupera o vendedor pelo ID
    VendedorEntiti vendedor = vendedorservice.getVendedorById(vendedorId);
    
    // Cria um mapa para a resposta
    Map<String, Object> response = new HashMap<>();
    response.put("nome", vendedor.getNome());
    response.put("cpf", vendedor.getCpf());
    
    // Adiciona o endereço
    EnderecoEntiti endereco = vendedor.getEndereco();
    Map<String, Object> enderecoResponse = new HashMap<>();
    enderecoResponse.put("id", endereco.getId()); // Adiciona o ID do endereço
    enderecoResponse.put("rua", endereco.getRua());
    enderecoResponse.put("numero", endereco.getNumero());
    enderecoResponse.put("cidade", endereco.getCidade());
    response.put("endereco", enderecoResponse);
    
    // Adiciona os produtos
    List<ProdutoEntiti> produtos = vendedor.getProdutos();
    List<Map<String, Object>> produtosResponse = new ArrayList<>();
    
    for (ProdutoEntiti produto : produtos) {
        Map<String, Object> produtoResponse = new HashMap<>();
        produtoResponse.put("nome", produto.getNome());
        produtoResponse.put("preco", produto.getPreco());
        produtosResponse.add(produtoResponse);
    }
    
    response.put("produtos", produtosResponse);
    
    // Retorna a resposta com status 200
    return ResponseEntity.ok(response);
}
}
