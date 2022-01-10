package com.ista.springboot.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ista.springboot.app.models.SLA;

@Repository
public interface SLARepository extends JpaRepository<SLA,Long> {
	
	SLA findByCodSLA(Long codSLA);

}
