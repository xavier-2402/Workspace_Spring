package com.ista.springboot.di.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ista.springboot.di.app.Model.Service.IServicio;

@Controller
@RequestMapping("/")
public class IndexController {

	 @Autowired
	 //@Qualifier("miServicioComplejo")
	private IServicio miservicio;

	/*
	@Autowired
	public IndexController(IServicio miservicio) {

		this.miservicio = miservicio;
	}*/

	@GetMapping("/index")
	public String index(Model model) {

		model.addAttribute("objeto", miservicio.operacion());
		return "index";
	}

	/*
	 * public IServicio getMiservicio() { return miservicio; }
	 * 
	 * @Autowired public void setMiservicio(IServicio miservicio) { this.miservicio
	 * = miservicio; }
	 */

}
