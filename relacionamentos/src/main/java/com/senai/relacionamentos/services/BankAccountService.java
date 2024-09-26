package com.senai.relacionamentos.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.relacionamentos.entities.ClientEntity;
import com.senai.relacionamentos.repositories.ClientRepository;

@Service
public class BankAccountService {

    @Autowired
    ClientRepository clientRepository;

    public ClientEntity getAllContasById(Long idClient) {

        Optional<ClientEntity> optionalClient = clientRepository.findById(idClient);

        if (optionalClient.isPresent()) {
            ClientEntity client = optionalClient.get();
            return client;
        }
        
        return null;
    }

}
