package org.esig.services;

import java.util.List;
import java.util.Optional;

import org.esig.dao.ClientRepository;
import org.esig.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
	@Autowired
	private ClientRepository clientRepository;
	
	public List<Client> getAllClient(){
		return clientRepository.findAll();
	}
	
	public Optional<Client> getClientById(Integer id) {
		return clientRepository.findById(id);
	}
	
	public Client saveClient(Client client) {
		clientRepository.save(client);
		return client;
	}
	 public Client deleteClient(Client client) {
		 clientRepository.delete(client);
		 return client;
		 
	 }
	 public Client updateClient(Integer id) {
		 Client client = new  Client();
		client = clientRepository.getOne(id);
		client.setId(client.getId());
		client.setName(client.getName());
		client.setAdresse(client.getAdresse());
		client.setState(client.getState());
		client.setTelephone(client.getTelephone());
		client.setVehicules(client.getVehicules());
		clientRepository.save(client);
		return client;
	 }

}
