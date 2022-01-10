package com.ista.springboot.card.app.mode.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ciudad {
	
	@Value("${texto.codCiudad}")
	private String codCiudad;
	@Value("${texto.nombreCiudad}")
	private String nombreCiudad;
	
	
	public String getCodCiudad() {
		return codCiudad;
	}
	public void setCodCiudad(String codCiudad) {
		this.codCiudad = codCiudad;
	}
	public String getNombreCiudad() {
		return nombreCiudad;
	}
	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}
	
	

}
