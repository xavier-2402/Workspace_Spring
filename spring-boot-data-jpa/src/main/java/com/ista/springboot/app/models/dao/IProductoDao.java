package com.ista.springboot.app.models.dao;

import java.util.List;

import com.ista.springboot.app.models.entity.Producto;

public interface IProductoDao {

	public List<Producto> findAll();
}
