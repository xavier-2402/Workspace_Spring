package com.ista.springboot.di.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ista.springboot.di.app.Model.Domain.Factura;

@Controller
@RequestMapping("/factura")
public class FacturaController {
	
	@Autowired
	private Factura factura;
	
	@GetMapping("/ver")
	public String ver(Model model) {
		model.addAttribute("titulo", "Ejemplo Factura");
		model.addAttribute("factura", factura);
		double total=0;
		for(int i=0;i<factura.getItems().size();i++) {
			total+=factura.getItems().get(i).getCantidad()*factura.getItems().get(i).getUtilidad().getPrecio();
		}
		model.addAttribute("total", total);
		return "factura/ver";
	}

}
