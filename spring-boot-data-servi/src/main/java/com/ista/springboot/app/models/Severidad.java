package com.ista.springboot.app.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Severidad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codSeveridad;

	@Column(nullable = false, length = 20)
	private String nivelSeveridad;
	@Column(nullable = false, length = 300)
	private String descripcionSeveridad;

	@Column(nullable = false)
	private int valorSeveridad;

	public Severidad(Long codSeveridad, String nivelSeveridad, String descripcionSeveridad, int valorSeveridad) {
		this.codSeveridad = codSeveridad;
		this.nivelSeveridad = nivelSeveridad;
		this.descripcionSeveridad = descripcionSeveridad;
		this.valorSeveridad = valorSeveridad;
	}

	public Severidad() {
	}

	public int getValorSeveridad() {
		return valorSeveridad;
	}

	public void setValorSeveridad(int valorSeveridad) {
		this.valorSeveridad = valorSeveridad;
	}

	public Long getCodSeveridad() {
		return codSeveridad;
	}

	public void setCodSeveridad(Long codSeveridad) {
		this.codSeveridad = codSeveridad;
	}

	public String getNivelSeveridad() {
		return nivelSeveridad;
	}

	public void setNivelSeveridad(String nivelSeveridad) {
		this.nivelSeveridad = nivelSeveridad;
	}

	public String getDescripcionSeveridad() {
		return descripcionSeveridad;
	}

	public void setDescripcionSeveridad(String descripcionSeveridad) {
		this.descripcionSeveridad = descripcionSeveridad;
	}

}
