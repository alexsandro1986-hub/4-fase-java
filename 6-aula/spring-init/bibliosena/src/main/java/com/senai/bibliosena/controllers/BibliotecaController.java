package com.senai.bibliosena.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api")

public class BibliotecaController {

    @GetMapping("/biblioteca")
    public String findBiblioteca() {
        return "Teste";
    }

    @PostMapping("/livro")
    public String createBiblioteca() {
        return "Criado";
    }

    @DeleteMapping("/livros{id}")
    public String deleteLivroas(@PathVariable("id") int id) {
        return "Deletado";
    }

    @PatchMapping("/livros{id}")
    public String alterarcodigo(@PathVariable("id") int id) {
        return "codigo do livro alterado";
    }

    @PutMapping("/livros{id}")
    public String alteraObjetolivro(@PathVariable("id") int id) {
        return "Todos os campos alterados";
    }
}
