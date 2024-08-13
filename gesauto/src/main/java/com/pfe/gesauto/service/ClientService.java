package com.pfe.gesauto.service;

import com.pfe.gesauto.model.Client;
import com.pfe.gesauto.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository ClientRepository;

    public Client addClient(Client client) {
        return ClientRepository.save(client);
    }
    public List<Client> getAllClients() {
        return ClientRepository.findAll();
    }
    public Optional<Client> getClientById(int id) {return ClientRepository.findById(id);}
    public void deleteClientById(int idClient) {
        ClientRepository.deleteById(idClient);
    }
}
