package com.example.prova;

// Importação das classes necessárias do Spring Boot
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Anotação que indica que esta é uma aplicação Spring Boot
@SpringBootApplication
public class ProvaApplication {

    // Método principal que inicia a aplicação
    public static void main(String[] args) {
        // Chama o método run da classe SpringApplication para iniciar a aplicação
        SpringApplication.run(ProvaApplication.class, args);
    }
}
