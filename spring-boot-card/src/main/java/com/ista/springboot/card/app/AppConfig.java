package com.ista.springboot.card.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ista.springboot.card.app.mode.domain.Designacion;
import com.ista.springboot.card.app.mode.domain.Empleado;

@Configuration
public class AppConfig {
	
	@Bean("AgregarEmpleados")
	public List<Empleado> agregarEmpleado(){
		Designacion empleo1= new Designacion("Desarrollador",40);
		Designacion empleo2= new Designacion("Gerente de Compras",40);
		Designacion empleo3= new Designacion("Gerente General",40);
		Designacion empleo4= new Designacion("Presidente Ejecutivo",40);
		Designacion empleo5= new Designacion("Tester",40);
		Designacion empleo6= new Designacion("Gerente",40);
		
		
		Empleado empleado1 = new Empleado(1,"Xavier Yanza","Lunes a vienes (09:00-19:00)","xavier.y.2013@gmail.com","0960909098","/images/usuario.jpg",20,empleo1);
		Empleado empleado2 = new Empleado(2,"Jessica Alvarez","Lunes a vienes (06:00-14:00)","jessi.1998@gmail.com","0977684321","/images/avatarmujer.png",30,empleo2);
		Empleado empleado3 = new Empleado(3,"Juan Mendoza","Lunes a vienes (14:00-22:00)","juanm@gmail.com","0976543219","/images/avatarusuario.png",25,empleo1);
		Empleado empleado4 = new Empleado(4,"Pedro Cajamarca","Lunes a vienes (09:00-19:00)","pedro.c.3@gmail.com","0978287460","/images/usuario.jpg",15,empleo1);
		Empleado empleado5 = new Empleado(5,"Daniela Paucar","Lunes a vienes (06:00-14:00)","dani.p9@gmail.com","0977298467","/images/avatarmujer.png",30,empleo3);
		Empleado empleado6 = new Empleado(6,"Diego Vera","Lunes a vienes (14:00-22:00)","diegov@gmail.com","0976762451","/images/avatarusuario.png",25,empleo1);		
		Empleado empleado7 = new Empleado(7,"María Mejía","Lunes a vienes (09:00-19:00)","mary2002@gmail.com","0968634198","/images/usuario.jpg",35,empleo4);
		Empleado empleado8 = new Empleado(8,"Belen Heredia","Lunes a vienes (06:00-14:00)","belenh@gmail.com","0987451221","/images/avatarmujer.png",30,empleo1);
		Empleado empleado9 = new Empleado(9,"Jorge Narvaez","Lunes a vienes (14:00-22:00)","jorgen@gmail.com","0983514621","/images/avatarusuario.png",25,empleo1);		
		Empleado empleado10 = new Empleado(10,"Adriana Perez","Lunes a vienes (09:00-19:00)","adri.p.34@gmail.com","0984527184","/images/usuario.jpg",20,empleo5);
		Empleado empleado11 = new Empleado(11,"Diana Nieves","Lunes a vienes (06:00-14:00)","diana.n.8@gmail.com","0977721224","/images/avatarmujer.png",30,empleo6);
		Empleado empleado12= new Empleado(12,"Mariana Caja","Lunes a vienes (14:00-22:00)","mariana.13@gmail.com","0998305418","/images/avatarusuario.png",25,empleo1);		
		return Arrays.asList(empleado1,empleado2,empleado3,empleado4,empleado5,empleado6,empleado7,empleado8,empleado9,empleado10,empleado11,empleado12);
	}
}
