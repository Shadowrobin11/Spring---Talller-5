package com.nttdata.persistence;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase Cliente
 * 
 * @author Christian
 *
 */


@Entity
@Table (name = "CLIENT")
public class Client implements Serializable{

	/**
	 * Serial version 
	 */
	private static final long serialVersionUID = 1L;

	/** ID */
	private Long id;
	
	/** Nombre */
	private String name;
	
	/** Apellidos */
	private String surname;
	
	/** Fecha de nacimiento */
	private Date birthDate;
	
	/** dni */
	private String dni;
	
	
	
	
	
	/**
	 * Devuelve la id del cliente
	 * 
	 * @return
	 */
	@Id
	@Column(name="CLIENT_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	/**
	 * Inserta la id del cliente
	 * 
	 * @param id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Devuelve el nombre del cliente
	 * 
	 * @return name
	 */
	@Column(name="CLIENT_NAME")
	public String getName() {
		return name;
	}

	/**
	 * Inserta el nombre del cliente
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Devuelve los apellidos del cliente
	 * 
	 * @return surname
	 */
	@Column(name = "CLIENT_SURNAME")
	public String getSurname() {
		return surname;
	}

	/**
	 * Inserta los apellidos del cliente
	 * 
	 * @param surname
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * Devuelve la fecha de nacimiento del cliente
	 * 
	 * @return birthDate
	 */
	@Column(name = "CLIENT_BIRTHDATE")
	public Date getBirthDate() {
		return birthDate;
	}
	/**
	 * Inserta la fecha de nacimiento del cliente
	 * 
	 * @param birthDate
	 */
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * Devuelve el dni del cliente
	 * 
	 * @return dni
	 */
	@Column(name = "CLIENT_DNI")
	public String getDni() {
		return dni;
	}
	
	/**
	 * Inserta el dni del cliente
	 * 
	 * @param dni
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", surname=" + surname + ", birthDate=" + birthDate + ", dni="
				+ dni + "]";
	}
	
	
	
}
