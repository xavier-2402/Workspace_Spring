package com.ista.springboot.app.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="producto")
public class Producto implements Serializable {

	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	
	private String nombreproducto;
	private double costoproducto;
	private int stock;
	@Temporal(TemporalType.DATE)
	private Date fechaelaboracion;
	
	private static final long serialVersionUID = 6907404797383358968L;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreproducto() {
		return nombreproducto;
	}

	public void setNombreproducto(String nombreproducto) {
		this.nombreproducto = nombreproducto;
	}

	public double getCostoproducto() {
		return costoproducto;
	}

	public void setCostoproducto(double costoproducto) {
		this.costoproducto = costoproducto;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Date getFechaelaboracion() {
		return fechaelaboracion;
	}

	public void setFechaelaboracion(Date fechaelaboracion) {
		this.fechaelaboracion = fechaelaboracion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	
}
