package com.ista.springboot.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ista.springboot.app.models.dao.IProductoDao;

@Controller
public class ProductoController {
	
	@Autowired
	IProductoDao productodao;
	
	@RequestMapping(value="/listarproducto",method = RequestMethod.GET)
	public String listar(Model model) {
		model.addAttribute("titulo", "Lista de Productos");
		model.addAttribute("productos", productodao.findAll());
		return "listarproducto";
		
	}

}
