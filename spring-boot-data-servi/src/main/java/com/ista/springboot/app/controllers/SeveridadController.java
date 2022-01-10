package com.ista.springboot.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ista.springboot.app.models.Severidad;
import com.ista.springboot.app.service.SeveridadService;

@RestController
@RequestMapping("/severidad")
public class SeveridadController {
	@Autowired
	private SeveridadService severidadservice;

	@PostMapping("/agregar-severidad")
	public Severidad agregarSeveridad(@RequestBody Severidad severidad) {
		return severidadservice.agregarseveridad(severidad);

	}

	@GetMapping("/listar-severidades")
	public List<Severidad> listarSeveridades() {
		return severidadservice.recuperarSeveridades();
	}

	@GetMapping("/recuperar-severidad/{codSeveridad}")
	public Severidad recuperarSeveridad(@PathVariable Long codSeveridad) {
		return severidadservice.recuperarSeveridad(codSeveridad);
	}

	@PutMapping("/actualizar-severidad/{codSeveridad}")
	public Severidad actualizarSeveridad(@RequestBody Severidad severidad, @PathVariable Long codSeveridad) {
		return severidadservice.actualizarSeveridad(severidad, codSeveridad);
	}

	@DeleteMapping("/eliminar-severidad/{codSeveridad}")
	public String eliminarSeveridad(@PathVariable Long codSeveridad) {
		return severidadservice.eliminarSeveridad(codSeveridad);
	}


}
