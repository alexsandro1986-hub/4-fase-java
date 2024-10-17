package com.example.recuperacao.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.recuperacao.repositories.ProdutoRepository;

import jakarta.transaction.Transactional;

@Service
public class ProdutoService {
    
    @Autowired
    ProdutoRepository produtoRepository;
    




}
