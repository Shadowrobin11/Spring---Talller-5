package com.nttdata.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.nttdata.persistence.Client;
import com.nttdata.repository.ClientRepository;

/**
 * Implementacion del servicio cliente
 * 
 * @author Christian
 *
 */

@Service("ClientService")
@Primary
public class ClientServiceImpl implements ClientServiceI{

	@Autowired
	ClientRepository rep;
	
	
	@Override
	public List<Client> findClientByFullName(String name, String surname) {
		return rep.findByNameAndSurname(name, surname);
	}

	@Override
	public void addClient(Client client) {
		rep.save(client);
		
	}

	@Override
	public List<Client> finAll() {
		return rep.findAll();
	}

	@Override
	public void addClient(String name, String surname, String dni, Date birthDate) {
		Client newClient = new Client();
		newClient.setName(name);
		newClient.setSurname(surname);
		newClient.setDni(dni);
		newClient.setBirthDate(null);
		rep.save(newClient);
		
	}

	
}
