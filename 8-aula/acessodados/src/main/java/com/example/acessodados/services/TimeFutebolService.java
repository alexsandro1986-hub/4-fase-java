package com.example.acessodados.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.acessodados.entities.TimeFutebol;
import com.example.acessodados.repository.TimeFutebolRepository;

@Service
public class TimeFutebolService {
    
    @Autowired
    TimeFutebolRepository timeFutebolRepository;

    public List<TimeFutebol> getAllTimes(){
        
        return timeFutebolRepository.findAll();
    }
    
}
