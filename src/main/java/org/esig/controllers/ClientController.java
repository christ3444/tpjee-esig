package org.esig.controllers;

import java.util.Optional;

import org.esig.models.Client;
import org.esig.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class ClientController {
	@Autowired
	private ClientService clientService;
	
	@GetMapping("/clients")
	public String findAllClient() {
		clientService.getAllClient();
		return "clients";
	}
	@GetMapping(value =  "/clients/{id}")
	public  Optional<Client> findClientById(@PathVariable Integer id) {
		return clientService.getClientById(id);
	}
	
	@PutMapping(value = "/clients")
	public void saveClient(Client client) {
		clientService.saveClient(client);
		
	}
	@DeleteMapping()
	public void deletClient(Client client) {
		clientService.deleteClient(client);
	}
	
	@PutMapping(value = "/clients{id}")
	public void updateClient(@PathVariable Integer id) {
		clientService.updateClient(id);
	}

}
