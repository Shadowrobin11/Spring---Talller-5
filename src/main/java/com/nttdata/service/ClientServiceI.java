package com.nttdata.service;

import java.sql.Date;
import java.util.List;

import com.nttdata.persistence.Client;

public interface ClientServiceI {

	/**
	 * Busca un cliente por el nombre completo y apellidos
	 * 
	 * @param name
	 * @param surname
	 * @return
	 */
	public List<Client> findClientByFullName(String name, String surname);
	
	/**
	 * Añade Cliente
	 * 
	 * @param client
	 */
	public void addClient(Client client);
	
	/**
	 * Lista todos los clientes 
	 * 
	 * @return
	 */
	public List<Client> finAll();
	
	/**
	 * Añade cliente con todos sus datos
	 * 
	 * @param name
	 * @param surname
	 * @param dni
	 * @param birthDate
	 */
	public void addClient(String name, String surname, String dni, Date birthDate);
}
