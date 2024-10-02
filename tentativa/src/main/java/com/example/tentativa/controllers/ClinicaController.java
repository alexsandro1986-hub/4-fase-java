package com.example.tentativa.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tentativa.dtos.req.CreateClinicaDTO;
import com.example.tentativa.dtos.res.ShowClinicaDTO;
import com.example.tentativa.services.ClinicaService;

@RestController // Indica que esta classe é um controlador REST
@RequestMapping("/clinica") // Define o caminho base para as requisições
public class ClinicaController {
    
    @Autowired // Injeta a dependência da classe ClinicaService
    ClinicaService clinicaService;

    // Método que trata a requisição POST para criar uma nova clínica
    @PostMapping
    public ResponseEntity<?> createclinica(@RequestBody CreateClinicaDTO dto) {
        // Exibe informações do DTO no console (apenas para fins de depuração)
        System.out.println(dto.getNome());
        System.out.println(dto.getEndereco().getCidade());
        System.out.println(dto.getCliente().get(0).getNome());
        System.out.println(dto.getCliente().get(0).getData());

        // Chama o serviço para criar a clínica
        clinicaService.createclinica(dto);

        // Retorna uma resposta com status 201 (Criado)
        return ResponseEntity.status(201).build();
    }

    // Método que trata a requisição GET para obter todas as clínicas
    @GetMapping
    public ResponseEntity<?> getAllclinica() {
        // Obtém a lista de clínicas do serviço
        List<ShowClinicaDTO> clinicas = clinicaService.getAllClinica();

        // Retorna uma resposta com status 200 (Ok) e a lista de clínicas
        return ResponseEntity.status(200).body(clinicas);
    }



//     Resumo dos Componentes
// Classe ClinicaController: Esta classe é um controlador REST que gerencia as requisições HTTP relacionadas às clínicas.

// Anotações:

// @RestController: Indica que a classe é um controlador que retorna dados no formato JSON.
// @RequestMapping("/clinica"): Define a rota base para todas as requisições feitas a este controlador.
// Método createclinica:

// @PostMapping: Indica que este método lida com requisições HTTP POST.
// Recebe um objeto CreateClinicaDTO como entrada, que é enviado no corpo da requisição.
// Exibe no console alguns detalhes da clínica sendo criada (para fins de depuração).
// Chama o método createclinica do serviço para criar a clínica.
// Retorna uma resposta com o código de status 201 (Criado) após a criação.
// Método getAllclinica:

// @GetMapping: Indica que este método lida com requisições HTTP GET.
// Chama o método getAllClinica do serviço para obter todas as clínicas.
// Retorna uma resposta com o código de status 200 (Ok) e a lista de clínicas no corpo da resposta.
// Se você tiver mais perguntas ou precisar de mais detalhes sobre qualquer parte do código, é só avisar!
}
