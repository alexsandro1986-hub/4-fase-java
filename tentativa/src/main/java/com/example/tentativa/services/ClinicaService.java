package com.example.tentativa.services;

import java.util.ArrayList;
import java.util.List;

// Importações necessárias para injeção de dependências e anotações do Spring
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Importações dos DTOs e entidades
import com.example.tentativa.dtos.req.CreateClienteDTO;
import com.example.tentativa.dtos.req.CreateClinicaDTO;
import com.example.tentativa.dtos.res.ShowClienteDTO;
import com.example.tentativa.dtos.res.ShowClinicaDTO;
import com.example.tentativa.dtos.res.ShowEnderecoDto;
import com.example.tentativa.entities.ClienteEntity;
import com.example.tentativa.entities.ClinicaEntity;
import com.example.tentativa.entities.EnderecoEntity;
import com.example.tentativa.repositories.ClienteRepossitory;
import com.example.tentativa.repositories.ClinicaRepossitory;
import com.example.tentativa.repositories.EnderecoRepository;

// Anotação que indica que esta classe é um serviço do Spring
@Service
public class ClinicaService {

    // Injeção de dependências para os repositórios
    @Autowired
    ClienteRepossitory clienteRepossitory;

    @Autowired
    ClinicaRepossitory clinicaRepossitory;

    @Autowired
    EnderecoRepository enderecoRepository;

    // Método para criar uma nova clínica
    public void createclinica(CreateClinicaDTO dto) {
        // Criação da entidade Clinica a partir do DTO
        ClinicaEntity clinicaEntity = new ClinicaEntity();
        clinicaEntity.setNome(dto.getNome());

        // Salva a clínica no repositório
        clinicaEntity = clinicaRepossitory.save(clinicaEntity);

        // Criação e preenchimento da entidade Endereco
        EnderecoEntity enderecoEntity = new EnderecoEntity();
        enderecoEntity.setRua(dto.getEndereco().getRua());
        enderecoEntity.setNumero(dto.getEndereco().getNumero());
        enderecoEntity.setCidade(dto.getEndereco().getCidade());
        enderecoEntity.setClinica(clinicaEntity); // Associa o endereço à clínica

        // Salva o endereço no repositório
        enderecoRepository.save(enderecoEntity);

        // Criação de uma lista para armazenar clientes
        List<ClienteEntity> clientesEntity = new ArrayList<>();

        // Itera sobre os clientes recebidos no DTO
        for (CreateClienteDTO clienteDTO : dto.getCliente()) {
            ClienteEntity clienteEntity = new ClienteEntity();
            clienteEntity.setNome(clienteDTO.getNome());
            clienteEntity.setData(clienteDTO.getData());

            clienteEntity.setClinica(clinicaEntity); // Associa o cliente à clínica
            clientesEntity.add(clienteEntity); // Adiciona o cliente à lista
        }

        // Salva todos os clientes no repositório
        clienteRepossitory.saveAll(clientesEntity);
    }

    // Método para obter todas as clínicas
    public List<ShowClinicaDTO> getAllClinica() {
        // Busca todas as clínicas no repositório
        List<ClinicaEntity> clinicasEntity = clinicaRepossitory.findAll();

        return clinicasEntity
                .stream()
                .map(clinica -> {
                    // Cria DTO para a clínica
                    ShowClinicaDTO clinicaDTO = new ShowClinicaDTO();
                    ShowEnderecoDto enderecoDTO = new ShowEnderecoDto();
                    List<ShowClienteDTO> clientesDTO = new ArrayList<>();

                    // Verifica se a clínica possui clientes
                    if (clinica.getCliente() != null) {
                        for (ClienteEntity clienteEntity : clinica.getCliente()) {
                            ShowClienteDTO clienteDTO = new ShowClienteDTO();
                            clienteDTO.setNome(clienteEntity.getNome());
                            clienteDTO.setData(clienteEntity.getData());
                            clientesDTO.add(clienteDTO); // Adiciona o cliente ao DTO
                        }
                    }
        
                    // Verifica se a clínica possui endereço
                    if (clinica.getEndereco() != null) {
                        enderecoDTO.setRua(clinica.getEndereco().getRua());
                        enderecoDTO.setNumero(clinica.getEndereco().getNumero());
                        enderecoDTO.setCidade(clinica.getEndereco().getCidade());
                    }
        
                    // Preenche o DTO da clínica
                    clinicaDTO.setId(clinica.getId());
                    clinicaDTO.setNome(clinica.getNome());
                    clinicaDTO.setEndereco(enderecoDTO);
                    clinicaDTO.setClientes(clientesDTO);
        
                    return clinicaDTO; // Retorna o DTO da clínica
                }).toList(); // Converte para uma lista
    }
}
