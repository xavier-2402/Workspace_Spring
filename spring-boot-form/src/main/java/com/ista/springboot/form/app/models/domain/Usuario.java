package com.ista.springboot.form.app.models.domain;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.ista.springboot.form.app.validation.Requerido;


public class Usuario {
	
	@Pattern(regexp = "[0-9]{2}[.][0-9]{6}[.][0-9]{5}")
	private String identificador;
	
	@NotEmpty
	@NotBlank
	private String nombre;
	@NotEmpty
	@Requerido
	private String apellido;
	@NotEmpty
	@Size(min=3,max=8)
	private String usuario;
	@NotEmpty
	@Email
	private String correo;
	@NotEmpty
	private String contrasenia;
	@NotNull(message = "Debe ingresar un número")
	@Min(5)
	@Max(500)
	private Integer cuenta;
	@NotNull
	@DateTimeFormat(pattern="yyyy/MM/dd")
	private Date fecha;
	
	
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
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
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	public Integer getCuenta() {
		return cuenta;
	}
	public void setCuenta(Integer cuenta) {
		this.cuenta = cuenta;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
	
	

}
