package com.ista.springboot.web.app.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ista.springboot.web.app.Model.Usuario;


@Controller
@RequestMapping("/app")
public class IndexController {

	@Value("${texto.indexcontroller.index.titulo}")
	private String index;
	@Value("${texto.indexcontroller.perfil.titulo}")
	private String perfil;
	@Value("${texto.indexcontroller.listar.titulo}")
	private String listau;
	
	
	
	
	@GetMapping({"/index","/","home"})
	public String index(Model model) {
		model.addAttribute("titulo", index);
		model.addAttribute("autor", "Xavier");
		return "index";
	}
	
	@RequestMapping("/perfil")
		public String perfil (Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Xavier");
		usuario.setApellido("Yanza");
		usuario.setEdad(21);
		usuario.setEmail("pruebacorreo@gmail.com");
		model.addAttribute("perfil",usuario);
		model.addAttribute("titulo", perfil);
		return "perfil";
		}
	
	@RequestMapping("/listar")
	public String listar (Model model) {
		
	
	model.addAttribute("titulo", listau);
	return "listar";
	}
	
	
	@ModelAttribute("usuarios")
	public List<Usuario> probarUsuarios() {
	
	List<Usuario> usuarios = Arrays.asList(
	new Usuario("Juana","Monk",45,"juana@gmail.com"),
	new Usuario("Steph","Viteri",29,"steph@gmail.com"),
	new Usuario("Gabriel","Bauman",45,"gabrielb@gmail.com"),
	new Usuario("Luis","Vera",39,"luis@gmail.com"));
	
	return usuarios;
	}
	
	
}
