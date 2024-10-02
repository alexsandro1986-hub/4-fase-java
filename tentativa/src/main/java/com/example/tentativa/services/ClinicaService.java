package com.example.tentativa.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

@Service
public class ClinicaService {

    @Autowired
    ClienteRepossitory clienteRepossitory;

    @Autowired
    ClinicaRepossitory clinicaRepossitory;

    @Autowired
    EnderecoRepository enderecoRepository;

    public void createclinica(CreateClinicaDTO dto) {

        ClinicaEntity clinicaEntity = new ClinicaEntity();
        clinicaEntity.setNome(dto.getNome());

        clinicaEntity = clinicaRepossitory.save(clinicaEntity);

        EnderecoEntity enderecoEntity = new EnderecoEntity();
        enderecoEntity.setRua(dto.getEndereco().getRua());
        enderecoEntity.setNumero(dto.getEndereco().getNumero());
        enderecoEntity.setCidade(dto.getEndereco().getCidade());
        enderecoEntity.setClinica(clinicaEntity);

        enderecoRepository.save(enderecoEntity);

        List<ClienteEntity> clientesEntity = new ArrayList<>();

        for (CreateClienteDTO clienteDTO : dto.getCliente()) {
            ClienteEntity clienteEntity = new ClienteEntity();
            clienteEntity.setNome(clienteDTO.getNome());
            clienteEntity.setData(clienteDTO.getData());

            clienteEntity.setClinica(clinicaEntity);
            clientesEntity.add(clienteEntity);
        }

        clienteRepossitory.saveAll(clientesEntity);

    }

    public List<ShowClinicaDTO> getAllClinica() {
        List<ClinicaEntity> clinicasEntity = clinicaRepossitory.findAll();

        return clinicasEntity
                .stream()
                .map(clinica -> {
                    ShowClinicaDTO clinicaDTO = new ShowClinicaDTO();
                    ShowEnderecoDto enderecoDTO = new ShowEnderecoDto();
                    List<ShowClienteDTO> clientesDTO = new ArrayList<>();

                    if (clinica.getCliente() != null) {
                        for (ClienteEntity clienteEntity : clinica.getCliente()) {
                            ShowClienteDTO clienteDTO = new ShowClienteDTO();
                            clienteDTO.setNome(clienteEntity.getNome());
                            clienteDTO.setData(clienteEntity.getData());
                            clientesDTO.add(clienteDTO);
                        }
                    }
        
                    // Verificar se a clínica possui endereço
                    if (clinica.getEndereco() != null) {
                        enderecoDTO.setRua(clinica.getEndereco().getRua());
                        enderecoDTO.setNumero(clinica.getEndereco().getNumero());
                        enderecoDTO.setCidade(clinica.getEndereco().getCidade());
                    }
        
                    clinicaDTO.setId(clinica.getId());
                    clinicaDTO.setNome(clinica.getNome());
                    clinicaDTO.setEndereco(enderecoDTO);
                    clinicaDTO.setClientes(clientesDTO);
        
                    return clinicaDTO;
                }).toList();
    }

}
