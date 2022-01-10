package com.ista.springboot.card.app.mode.domain;

public class Designacion {
	private String cargo;
	private int horas;
	
	
	public Designacion(String cargo, int horas) {
		this.cargo = cargo;
		this.horas = horas;
	}
	
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	

}
