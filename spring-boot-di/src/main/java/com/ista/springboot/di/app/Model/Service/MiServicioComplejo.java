package com.ista.springboot.di.app.Model.Service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


//@Component("miServicioComplejo")
//@Qualifier


public class MiServicioComplejo implements IServicio{
	
	@Override
	public String operacion() {
		return "Ejecuta un proceso en miServicioComplejo";
	}

}
