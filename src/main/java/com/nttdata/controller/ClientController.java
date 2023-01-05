package com.nttdata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nttdata.persistence.Client;
import com.nttdata.service.ClientServiceI;


/**
 * Controlador Cliente
 * 
 * @author Christian
 *
 */

@Controller
@RequestMapping("/home/")
public class ClientController {
	@Autowired
	ClientServiceI service;
	
	/**
	 * Muestra todos los clientes
	 * 
	 * @return
	 */
	@RequestMapping("mostrarClientes")
	public @ResponseBody List<Client> showAll(){
		return service.finAll();
	}
	
	/**
	 * Añade el cliente
	 * 
	 * @param newClient
	 */
	@PostMapping("addCliente")
	public void addClient(@ModelAttribute("cliente")Client newClient) {
		service.addClient(newClient);
	}
	
	@RequestMapping("filtraClientes")
	public @ResponseBody List<Client> filterClients(@RequestParam String nombre, @RequestParam String apellidos) {
		return service.findClientByFullName(nombre, apellidos);
	}
	
	
}
