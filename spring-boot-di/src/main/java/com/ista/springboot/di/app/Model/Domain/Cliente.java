package com.ista.springboot.di.app.Model.Domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cliente {

	@Value("${cliente.nombre}")
	private String Nombre;
	@Value("${cliente.apellido}")
	private String Apellido;
	
	
	public String getNombre() {
		return Nombre;
	}
	
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	
	
	
}
