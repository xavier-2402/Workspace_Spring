package com.ista.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.ista.springboot.di.app.Model.Domain.ItemFactura;
import com.ista.springboot.di.app.Model.Domain.Producto;
import com.ista.springboot.di.app.Model.Domain.Servicio;
import com.ista.springboot.di.app.Model.Domain.Utilidad;
import com.ista.springboot.di.app.Model.Service.IServicio;
import com.ista.springboot.di.app.Model.Service.MiServicio;
import com.ista.springboot.di.app.Model.Service.MiServicioComplejo;

import ch.qos.logback.core.net.LoginAuthenticator;

@Configuration
public class Appconfig {
	
	@Bean("MiServicioSimple")
	public IServicio registrarMiServicio() {
		return new MiServicio();
	}
	
	@Bean("MiServicioComplejo")
	@Primary
	public IServicio registrarMiServicioComplejo() {
		return new MiServicioComplejo();
	}
	
	@Bean("itemsFactura")
	public List<ItemFactura> registrarItems() {
		Utilidad producto1= new Producto("Celular", 270.50);
		Utilidad producto2= new Producto("Laptop", 1200.00);
		Utilidad producto3= new Producto("Impresora", 700.00);
		Utilidad servicio= new Servicio("Servicio de mantenimiento a laptop", 45.00);
		
		ItemFactura item1 = new ItemFactura(producto1, 2);
		ItemFactura item2 = new ItemFactura(producto2, 4);
		ItemFactura item3 = new ItemFactura(producto3, 1);
		ItemFactura item4 = new ItemFactura(servicio, 1);
		
		return Arrays.asList(item1,item2,item3,item4);
	}
	

}
