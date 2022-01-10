package com.ista.springboot.form.app.controllers;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.ista.springboot.form.app.models.domain.Usuario;

@Controller
@SessionAttributes("usuario")
public class FormController {

	@GetMapping("/form")
	public String form(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Xavier");
		usuario.setApellido("Yanza");
		usuario.setIdentificador("19.324554.21334");
		model.addAttribute("titulo", "Registrar Usuario");
		model.addAttribute("usuario", usuario);
		return "form";
	}
	
	@PostMapping("/form")
	public String procesar( @Valid Usuario usuario,BindingResult result, Model model,SessionStatus status) {
				
		model.addAttribute("titulo", "Fomulario Usuario");
		
		if(result.hasErrors()) {
			return "form";
		}
	    model.addAttribute("usuario", usuario);
	    status.setComplete();
		return "resultado";
	}
}
