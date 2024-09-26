package com.senai.relacionamentos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.relacionamentos.dtos.res.BankAccountsByClientRES;
import com.senai.relacionamentos.entities.ClientEntity;
import com.senai.relacionamentos.services.BankAccountService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/api")
public class BankAccountController {

    @Autowired
    BankAccountService bankAccountService;

    @GetMapping("clients/{id}")
    public ResponseEntity<BankAccountsByClientRES> getAllContas(@PathVariable(value = "id") Long idClient) {

        ClientEntity entity = bankAccountService.getAllContasById(idClient);

        BankAccountsByClientRES dto = convertEntityToDto(entity);

        return ResponseEntity.status(200).body(dto);
    }

    public BankAccountsByClientRES convertEntityToDto(ClientEntity entity) {
        BankAccountsByClientRES dto = new BankAccountsByClientRES();
        dto.setName(entity.getName());

        List<String> numbers = entity.getBankAccounts()
                .stream()
                .map(account -> account.getNumber())
                .toList();

        dto.setNumbers(numbers);

        return dto;
    }
}
