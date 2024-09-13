package com.example.testecrud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.testecrud.entity.Usuario;
import com.example.testecrud.service.UsuarioService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/usuario")
public class UsuarioControllers {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/todos")
    public ResponseEntity<List<Usuario>> getMethodName() {
        var todoUsuarios = usuarioService.getAllusuario();
        return ResponseEntity.ok(todoUsuarios);
    }

    // @PostMapping("/criar")
    // public String postMethodName(@RequestBody Usuario objEntreguePeloCliente) {
    //     //TODO: process POST request
    //     var novoUsuario = usuarioService.criarUsuario(objEntreguePeloCliente);
    //     return "Ok, usuario criado com sucesso";
    // }
    @PostMapping("/criar")
    public ResponseEntity<Usuario> postMethodName(@RequestBody Usuario objEntreguePeloCliente) {
        //TODO: process POST request
        var novoUsuario = usuarioService.criarUsuario(objEntreguePeloCliente);
        return ResponseEntity.ok(novoUsuario);
    }
    

}
