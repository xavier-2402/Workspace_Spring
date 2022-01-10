package com.ista.springboot.app.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ista.springboot.app.models.dao.IClienteDao;
import com.ista.springboot.app.models.entity.Cliente;

@Controller
public class ClienteController {
	
	@Autowired
	private IClienteDao clientedao;
	
	@RequestMapping(value="/listar",method = RequestMethod.GET)
	public String listar(Model model) {
		model.addAttribute("titulo", "Lista de Clientes");
		model.addAttribute("clientes", clientedao.findAll());
		return "listar";
		
	}
	
	@RequestMapping(value="/form")
	public String crear(Map<String, Object> model) {
		Cliente cliente = new Cliente();
		model.put("titulo","Formulario del cliente");
		model.put("cliente", cliente);
		return "form";
	}
	
	@RequestMapping(value="/form",method = RequestMethod.POST)
	public String guardar(Cliente cliente) {
		clientedao.save(cliente);
		return "redirect:listar";
		
	}
	
	@RequestMapping(value="/form/{id}")
	public String editar(@PathVariable(value="id")Long id,Map<String, Object> model) {
		Cliente cliente=null;
		if(id>0) {
			cliente=clientedao.findOne(id);
		}else {
			return "redirect:/listar";
		}
		model.put("cliente", cliente);
		model.put("titulo", "Editar cliente");
		
		return "form";
	}

}
