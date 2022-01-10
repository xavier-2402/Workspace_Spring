package com.ista.springboot.card.app.mode.domain;

public class Empleado {
	
	private int id;
	private String nombre;
	private String horario;
	private String correo;
	private String celular;
	private String imagen;
	private double salario;
	private Designacion designacion;
	public Empleado(int id, String nombre, String horario, String correo, String celular, String imagen, double salario,  Designacion designacion) {
		this.id = id;
		this.nombre = nombre;
		this.horario = horario;
		this.correo = correo;
		this.celular = celular;
		this.imagen = imagen;
		this.salario = salario;
		this.designacion = designacion;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public Designacion getDesignacion() {
		return designacion;
	}
	public void setDesignacion(Designacion designacion) {
		this.designacion = designacion;
	}
	
	
	
	

}
