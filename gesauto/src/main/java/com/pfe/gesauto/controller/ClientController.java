package com.pfe.gesauto.controller;

import com.pfe.gesauto.model.Client;
import com.pfe.gesauto.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("Api/Client")

public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping
    public Client saveClient(@RequestBody Client client) {
        return clientService.addClient(client);
    }
    @GetMapping
    public List<Client> ListClients() {
        return clientService.getAllClients();
    }
    @GetMapping("{id}")
    public Optional<Client> ClientById(@PathVariable int id) { return clientService.getClientById(id);}
    @DeleteMapping("/{id}")
    public String deleteClient(@PathVariable("id") int id) {
        clientService.deleteClientById(id);
        return "Client deleted";
    }
}
