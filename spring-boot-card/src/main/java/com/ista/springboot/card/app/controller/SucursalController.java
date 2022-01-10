package com.ista.springboot.card.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ista.springboot.card.app.mode.domain.Sucursal;

@Controller
@RequestMapping("/empleado")
public class SucursalController {
	
	@Autowired
	private Sucursal sucursal;
	
	@GetMapping("/ver")
	public String verEmpleados(Model model) {
		
		model.addAttribute("titulo","Información de Empleados");
		model.addAttribute("sucursal",sucursal);
		return "ver";
		
	}
	
	@GetMapping("/listar")
	public String listarEmpleados(Model model) {
		double total=0;
		for(int i=0;i<sucursal.getEmpleados().size();i++) {
			total += sucursal.getEmpleados().get(i).getDesignacion().getHoras()*sucursal.getEmpleados().get(i).getSalario();
		}
		model.addAttribute("titulo","Lista Empleados");
		model.addAttribute("sucursal",sucursal);
		model.addAttribute("total", total);
		return "listar";
		
	}
	
	

}
