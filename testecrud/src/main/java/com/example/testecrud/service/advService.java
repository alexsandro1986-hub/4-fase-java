package com.example.testecrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.testecrud.entity.Usuario;
import com.example.testecrud.entity.advEntity;
import com.example.testecrud.repository.advRepository;

@ Service
public class advService {
    @Autowired
    advRepository advRepository;

    public List <advEntity> getAlladv() {

        return advRepository.findAll();
    }

    public advEntity criaradv(advEntity objAdv ) {

        return advRepository.save(objAdv);
    }
}
