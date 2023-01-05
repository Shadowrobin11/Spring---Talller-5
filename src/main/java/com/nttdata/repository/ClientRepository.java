package com.nttdata.repository;

import org.springframework.stereotype.Repository;

import com.nttdata.persistence.Client;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositorio Cliente
 * 
 * @author Christian
 *
 */

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

	/**
	 * Busca un cliente por nombre completo
	 * 
	 * @param nombre
	 * @param apellidos
	 * @return
	 */
	public List<Client> findByNameAndSurname(String nombre, String apellidos);
}
