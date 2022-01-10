package com.ista.springboot.web.app.Model;

public class Usuario {
	
	private String nombre;
	private String apellido;
	private int edad;
	private String email;
	
	
	public Usuario(String nombre, String apellido, int edad, String email) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.email = email;
	}
	

	public Usuario() {
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
