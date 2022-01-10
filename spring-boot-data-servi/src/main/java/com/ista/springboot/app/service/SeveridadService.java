package com.ista.springboot.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ista.springboot.app.models.Severidad;
import com.ista.springboot.app.repository.SeveridadRepository;

@Service
public class SeveridadService {

	@Autowired
	private SeveridadRepository severidadrepository;

	public Severidad agregarseveridad(Severidad severidad) {

		if (severidadrepository.findByNivelSeveridad(severidad.getNivelSeveridad()) != null) {
			return new Severidad();
		}
		return severidadrepository.save(severidad);
	}

	public List<Severidad> recuperarSeveridades() {
		return severidadrepository.findAll();
	}

	public Severidad recuperarSeveridad(Long codSeveridad) {
		return severidadrepository.findByCodSeveridad(codSeveridad);
	}

	public Severidad actualizarSeveridad(Severidad severidad, Long codSeveridad) {
		if (severidadrepository.findByCodSeveridad(codSeveridad) != null) {
			if (severidadrepository.findByNivelSeveridad(severidad.getNivelSeveridad()) == null) {
				severidad.setCodSeveridad(codSeveridad);
				return severidadrepository.save(severidad);
			}
			return null;
		}
		return null;
	}

	public String eliminarSeveridad(Long codSeveridad) {
		if (severidadrepository.findByCodSeveridad(codSeveridad) != null) {
			severidadrepository.deleteById(codSeveridad);
			return "Severidad con  codigo: " + codSeveridad + " ha sido eliminado";
		}
		return "No se ha encontrado una severidad con el codigo ingresado";
	}

}
