package com.ista.springboot.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ista.springboot.app.models.Severidad;

@Repository
public interface SeveridadRepository  extends JpaRepository<Severidad, Long>{

	Severidad findByNivelSeveridad(String nivelSeveridad);
	
	Severidad findByCodSeveridad(Long codSeveridad);
}
