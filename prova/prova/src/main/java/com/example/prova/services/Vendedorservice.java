package com.example.prova.services;

// Importação das classes necessárias
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Importação dos DTOs e entidades necessárias
import com.example.prova.dtos.req.CreateProdutoDTO;
import com.example.prova.dtos.req.CreateVendedorDTO;
import com.example.prova.entities.EnderecoEntiti;
import com.example.prova.entities.ProdutoEntiti;
import com.example.prova.entities.VendedorEntiti;
import com.example.prova.repositories.EnderecoRepositori;
import com.example.prova.repositories.ProdutoRepositori;
import com.example.prova.repositories.VendedorRepositori;

// Anotação que indica que esta classe é um serviço Spring
@Service
public class Vendedorservice {

    // Injeção das dependências dos repositórios
    @Autowired
    VendedorRepositori vendedorRepositori;

    @Autowired
    ProdutoRepositori produtoRepositori;

    @Autowired
    EnderecoRepositori enderecoRepositori;

    // Método para criar um novo vendedor
    public VendedorEntiti createVendedor(CreateVendedorDTO dto) {
        // Criação de uma nova entidade Vendedor
        VendedorEntiti vendedorEntiti = new VendedorEntiti();
        vendedorEntiti.setNome(dto.getNome());
        vendedorEntiti.setCpf(dto.getCpf());

        // Salvando o vendedor no repositório
        vendedorEntiti = vendedorRepositori.save(vendedorEntiti);

        // Criação e configuração do endereço associado ao vendedor
        EnderecoEntiti enderecoEntiti = new EnderecoEntiti();
        enderecoEntiti.setRua(dto.getEndereco().getRua());
        enderecoEntiti.setCidade(dto.getEndereco().getCidade());
        enderecoEntiti.setNumero(dto.getEndereco().getNumero());

        // Salvando o endereço no repositório
        enderecoEntiti = enderecoRepositori.save(enderecoEntiti);
        vendedorEntiti.setEndereco(enderecoEntiti);

        // Lista para armazenar os produtos
        List<ProdutoEntiti> produtosEntiti = new ArrayList<>();

        // Iterando sobre os produtos do DTO e criando entidades de produto
        for (CreateProdutoDTO produtoDTO : dto.getProduto()) {
            ProdutoEntiti produtoEntiti = new ProdutoEntiti();
            produtoEntiti.setNome(produtoDTO.getNome());
            produtoEntiti.setDescricao(produtoDTO.getDescricao());
            produtoEntiti.setPreco(produtoDTO.getPreco());

            // Associando o vendedor ao produto
            produtoEntiti.setVendedor(vendedorEntiti);
            
            // Adicionando o produto à lista
            produtosEntiti.add(produtoEntiti);
        }

        // Salvando todos os produtos no repositório
        produtoRepositori.saveAll(produtosEntiti);
        vendedorEntiti.setProdutos(produtosEntiti); // Associando a lista de produtos ao vendedor

        // Retornando o vendedor criado
        return vendedorEntiti;
    }

    // Método para recuperar todos os vendedores
    public List<VendedorEntiti> getAllVendedores() {
        return vendedorRepositori.findAll(); // Retorna a lista de todos os vendedores
    }

    // Método para recuperar o endereço de um vendedor pelo ID
    public EnderecoEntiti getEnderecoByVendedorId(Long vendedorId) {
        // Busca o vendedor pelo ID e lança uma exceção se não encontrado
        VendedorEntiti vendedor = vendedorRepositori.findById(vendedorId)
            .orElseThrow(() -> new RuntimeException("Vendedor não encontrado"));
        return vendedor.getEndereco(); // Retorna o endereço do vendedor
    }

    // Método para recuperar um vendedor pelo ID
    public VendedorEntiti getVendedorById(Long vendedorId) {
        // Busca o vendedor pelo ID e lança uma exceção se não encontrado
        return vendedorRepositori.findById(vendedorId)
            .orElseThrow(() -> new RuntimeException("Vendedor não encontrado"));
    }
}
