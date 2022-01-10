package com.ista.springboot.di.app.Model.Domain;

public class ItemFactura {

	private Integer cantidad;
	private Utilidad utilidad;
	
	public ItemFactura( Utilidad utilidad,Integer cantidad) {
		this.cantidad = cantidad;
		this.utilidad = utilidad;
	}
	
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Utilidad getUtilidad() {
		return utilidad;
	}
	public void setUtilidad(Utilidad utilidad) {
		this.utilidad = utilidad;
	}
	
	
	
	
	
	

}
