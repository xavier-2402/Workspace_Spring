package com.ista.springboot.app.repository;

import com.ista.springboot.app.models.tecnico;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface tecnicoRepository extends JpaRepository<tecnico,Long> {
    tecnico findByCodTecnico(Long codTecnico);

    tecnico findByUsername(String username);
    
    tecnico findByUsernameAndPassword(String username,String password);
}
