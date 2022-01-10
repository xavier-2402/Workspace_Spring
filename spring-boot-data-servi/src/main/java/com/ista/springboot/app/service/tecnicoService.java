package com.ista.springboot.app.service;

import java.util.List;

import com.ista.springboot.app.models.tecnico;
import com.ista.springboot.app.repository.tecnicoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class tecnicoService {

    @Autowired
    private tecnicoRepository tecnicorepository;

    public tecnico guardarTecnico(tecnico tecnico){
        if(tecnicorepository.findByUsername(tecnico.getUsername())!=null){
            return new tecnico();
        }
        return tecnicorepository.save(tecnico);
    }

    public List<tecnico> listarTecnicos(){
        return tecnicorepository.findAll();
    }

    public tecnico actualizarTecnico(tecnico tecnico,Long codTecnico){
        if(tecnicorepository.findByCodTecnico(codTecnico)!=null){
            tecnico.setCodTecnico(codTecnico);
            return tecnicorepository.save(tecnico);
        }
        return null;
    }

    public String eliminarTecnico(Long codTecnico){
        if(tecnicorepository.findByCodTecnico(codTecnico)!=null){
            tecnicorepository.deleteById(codTecnico);
            return "Tecnico con código: "+codTecnico+" ha sido eliminado exitosamente";
        }
        return "No existe un técnico con el código ingresado";
    }
    
}
