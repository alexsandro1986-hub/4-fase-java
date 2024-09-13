package com.example.testecrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.testecrud.entity.Usuario;
import com.example.testecrud.repository.UsuarioRepository;

@Service
public class UsuarioService {
    
    @Autowired
    UsuarioRepository usuarioRepository;

    public List <Usuario> getAllusuario() {

        return usuarioRepository.findAll();
    }

    public Usuario criarUsuario(Usuario objUsuario ) {

        return usuarioRepository.save(objUsuario);
    }


    // public Optional<Usuario> getOneUsuario(Long id){
    //     return usuarioRepository.findAllById(id);
    // }


}
