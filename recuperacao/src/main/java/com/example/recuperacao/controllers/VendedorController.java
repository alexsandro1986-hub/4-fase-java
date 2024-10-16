package com.example.recuperacao.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.example.recuperacao.dtos.req.CreateVendedorDTO;
import com.example.recuperacao.dtos.res.ShowVendedorDTO;
import com.example.recuperacao.services.VendedorService;

@RestController
@RequestMapping("/vendedor")
public class VendedorController {
    
    @Autowired
    VendedorService vendedorService;

    @PostMapping
    public ResponseEntity <?> createvendedor(@RequestBody CreateVendedorDTO dto) {

    System.out.println(dto.getNome());
    System.out.println(dto.getCpf());
    System.out.println(dto.getEndereco().getCidade());
    System.out.println(dto.getEndereco().getNumero());
    System.out.println(dto.getEndereco().getRua());
    System.out.println(dto.getProdutos().get(0).getNome());
    System.out.println(dto.getProdutos().get(0).getPreco());
    System.out.println(dto.getProdutos().get(1).getNome());
    System.out.println(dto.getProdutos().get(1).getPreco());

        vendedorService.createvendedor(dto);

        return ResponseEntity.status(201).build();
}

 @GetMapping
    public ResponseEntity<?> getAllVendedor() {
        // Obtém a lista de clínicas do serviço
        List<ShowVendedorDTO> vendedors = vendedorService.getAllVendedor();

        // Retorna uma resposta com status 200 (Ok) e a lista de clínicas
        return ResponseEntity.status(200).body(vendedors);
    }

}
