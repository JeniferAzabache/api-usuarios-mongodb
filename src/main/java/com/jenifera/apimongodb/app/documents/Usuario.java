package com.jenifera.apimongodb.app.documents;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="usuarios")
public class Usuario {
	@Id
	@NotEmpty
	private String id;
	
	private String nombre;
	private String email;
	private Integer dni;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public Usuario(String nombre, String email, Integer dni) {
		this.nombre = nombre;
		this.email = email;
		this.dni = dni;
	}
	public Usuario() {
		
	}
	
	
	
	
}
