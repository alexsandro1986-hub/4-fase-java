package com.example.recuperacao.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.recuperacao.dtos.req.CreateProdutoDTO;
import com.example.recuperacao.dtos.req.CreateVendedorDTO;
import com.example.recuperacao.dtos.res.ShowEnderecoDTO;
import com.example.recuperacao.dtos.res.ShowProdutoDTO;
import com.example.recuperacao.dtos.res.ShowVendedorDTO;
import com.example.recuperacao.entities.EnderecoEntity;
import com.example.recuperacao.entities.ProdutoEntity;
import com.example.recuperacao.entities.VendedorEntity;
import com.example.recuperacao.repositories.Enderecorepository;
import com.example.recuperacao.repositories.ProdutoRepository;
import com.example.recuperacao.repositories.VendedorRepository;

@Service

public class VendedorService {
    
    @Autowired
    Enderecorepository enderecorepository;

    @Autowired
    ProdutoRepository produtoRepository;

    @Autowired
    VendedorRepository vendedorRepository;

    public void createvendedor(CreateVendedorDTO dto){
       
        VendedorEntity vendedorEntity = new VendedorEntity();
        vendedorEntity.setNome(dto.getNome());
        vendedorEntity.setCpf(dto.getCpf());

        vendedorEntity= vendedorRepository.save(vendedorEntity);


        EnderecoEntity enderecoEntity = new EnderecoEntity();
        enderecoEntity.setRua(dto.getEndereco().getRua());
        enderecoEntity.setCidade(dto.getEndereco().getCidade());
        enderecoEntity.setNumero(dto.getEndereco().getNumero());
        enderecoEntity.setVendedor(vendedorEntity);

        enderecorepository.save(enderecoEntity);

        List<ProdutoEntity> produtosEntity = new ArrayList<>();

        for (CreateProdutoDTO produtoDTO : dto.getProdutos()){
            ProdutoEntity produtoEntity = new ProdutoEntity();
            produtoEntity.setNome(produtoDTO.getNome());
            produtoEntity.setPreco(produtoDTO.getPreco());
            
           
            produtoEntity.setVendedor(vendedorEntity);
            produtosEntity.add(produtoEntity);
        }
            produtoRepository.saveAll(produtosEntity);

    }

    public List<ShowVendedorDTO> getAllVendedor(){
        List<VendedorEntity> vendedoresEntity = vendedorRepository.findAll();

        return vendedoresEntity
        .stream()
        .map(vendedor -> {
            ShowVendedorDTO vendedorDTO =new ShowVendedorDTO();
            ShowEnderecoDTO enderecoDTO = new ShowEnderecoDTO();
            List<ShowProdutoDTO> produtosDTO = new ArrayList<>();


            if (vendedor.getProduto() != null) {
                for (ProdutoEntity produtoEntity : vendedor.getProduto()) {
                    ShowProdutoDTO produtoDTO = new ShowProdutoDTO();
                    produtoDTO.setNome(produtoEntity.getNome());
                    produtoDTO.setPreco(produtoEntity.getPreco());
                    produtosDTO.add(produtoDTO); // Adiciona o cliente ao DTO
                }
            }


            if (vendedor.getEndereco() != null) {
                enderecoDTO.setRua(vendedor.getEndereco().getRua());
                enderecoDTO.setNumero(vendedor.getEndereco().getNumero());
                enderecoDTO.setCidade(vendedor.getEndereco().getCidade());
            }

            vendedorDTO.setId(vendedor.getId());
            vendedorDTO.setNome(vendedor.getNome());
            vendedorDTO.setCpf(vendedor.getCpf());
            vendedorDTO.setEndereco(enderecoDTO);
            vendedorDTO.setProdutos(produtosDTO);

            return vendedorDTO;
        }).toList();
    }

}
