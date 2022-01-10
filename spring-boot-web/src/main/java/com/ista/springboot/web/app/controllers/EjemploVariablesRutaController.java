package com.ista.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class EjemploVariablesRutaController {
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("titulo", "ENVIAR PARAMETROS A LA RUTA @pathvariable");
		return "variables/index";
	}
	@GetMapping("/string/{texto}")
	public String variables(@PathVariable String texto, Model model) {
		model.addAttribute("titulo", "RECIBIR PARAMETROS DE LA RUTA @pathvariable");
		model.addAttribute("resultado", "el texto enviado por la ruta @pathvariable es: "+texto);
		
		return "variables/ver";
	}
	
	@GetMapping("/string/{texto}/{numero}")
	public String variables(@PathVariable String texto,@PathVariable Integer numero, Model model) {
		model.addAttribute("titulo", "RECIBIR PARAMETROS DE LA RUTA @pathvariable");
		model.addAttribute("resultado", "el texto enviado por la ruta @pathvariable es: "+texto+" y el numero es: "+numero);
		
		return "variables/ver";
	}

}
