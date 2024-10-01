package com.example.prova.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.prova.dtos.req.CreateProdutoDTO;
import com.example.prova.dtos.req.CreateVendedorDTO;
import com.example.prova.entities.EnderecoEntiti;
import com.example.prova.entities.ProdutoEntiti;
import com.example.prova.entities.VendedorEntiti;
import com.example.prova.repositories.EnderecoRepositori;
import com.example.prova.repositories.ProdutoRepositori;
import com.example.prova.repositories.VendedorRepositori;

@Service
public class Vendedorservice {
    
@Autowired
VendedorRepositori vendedorRepositori;

@Autowired
ProdutoRepositori produtoRepositori;

@Autowired
EnderecoRepositori enderecoRepositori;

public VendedorEntiti createVendedor(CreateVendedorDTO dto){
    VendedorEntiti vendedorEntiti = new VendedorEntiti();
    vendedorEntiti.setNome(dto.getNome());
    vendedorEntiti.setCpf(dto.getCpf());
    

    vendedorEntiti = vendedorRepositori.save(vendedorEntiti);

    EnderecoEntiti enderecoEntiti = new EnderecoEntiti();
    enderecoEntiti.setRua(dto.getEndereco().getRua());
    enderecoEntiti.setCidade(dto.getEndereco().getCidade());
    enderecoEntiti.setNumero(dto.getEndereco().getNumero());
    
    enderecoEntiti = enderecoRepositori.save(enderecoEntiti);
    vendedorEntiti.setEndereco(enderecoEntiti);

    List<ProdutoEntiti> produtosEntiti = new ArrayList<>();

    for (CreateProdutoDTO produtoDTO : dto.getProduto()){
        ProdutoEntiti produtoEntiti =new ProdutoEntiti();
        produtoEntiti.setNome(produtoDTO.getNome());
        produtoEntiti.setDescricao(produtoDTO.getDescricao());
        produtoEntiti.setPreco(produtoDTO.getPreco());

        produtoEntiti.setVendedor(vendedorEntiti);
        
        produtosEntiti.add(produtoEntiti);
    }

    produtoRepositori.saveAll(produtosEntiti);
    vendedorEntiti.setProdutos(produtosEntiti);

    return vendedorEntiti;
}

public List<VendedorEntiti> getAllVendedores() {
    
    return vendedorRepositori.findAll();
}

public EnderecoEntiti getEnderecoByVendedorId(Long vendedorId) {
    VendedorEntiti vendedor = vendedorRepositori.findById(vendedorId)
        .orElseThrow(() -> new RuntimeException("Vendedor não encontrado"));
    return vendedor.getEndereco(); 

}
public VendedorEntiti getVendedorById(Long vendedorId) {
    return vendedorRepositori.findById(vendedorId)
        .orElseThrow(() -> new RuntimeException("Vendedor não encontrado"));
}
}
