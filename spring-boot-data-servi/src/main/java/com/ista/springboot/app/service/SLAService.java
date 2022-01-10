package com.ista.springboot.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.ista.springboot.app.models.SLA;
import com.ista.springboot.app.repository.SLARepository;

@Service
public class SLAService {
	
	@Autowired 
	private SLARepository slarepository;
	
	public SLA agregarSLA(SLA sla) {
		return slarepository.save(sla);
		
	}
	
	public SLA recuperarSLA(Long codSLA) {
		return slarepository.findByCodSLA(codSLA);
	}

	public List<SLA> listarSLA(){
		return slarepository.findAll();
	}

}
