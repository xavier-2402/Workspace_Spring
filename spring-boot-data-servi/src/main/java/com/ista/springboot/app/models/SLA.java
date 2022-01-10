package com.ista.springboot.app.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity

public class SLA {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codSLA;
	
	private Double gradoImportancia;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Severidad severidad;

	public SLA(Long codSLA, Double gradoImportancia, Severidad severidad) {
		this.codSLA = codSLA;
		this.gradoImportancia = gradoImportancia;
		this.severidad = severidad;
	}

	public SLA() {
	}

	public Long getCodSLA() {
		return codSLA;
	}

	public void setCodSLA(Long codSLA) {
		this.codSLA = codSLA;
	}

	public Double getGradoImportancia() {
		return gradoImportancia;
	}

	public void setGradoImportancia(Double gradoImportancia) {
		this.gradoImportancia = gradoImportancia;
	}

	public Severidad getSeveridad() {
		return severidad;
	}

	public void setSeveridad(Severidad severidad) {
		this.severidad = severidad;
	}
	
	
	

}
