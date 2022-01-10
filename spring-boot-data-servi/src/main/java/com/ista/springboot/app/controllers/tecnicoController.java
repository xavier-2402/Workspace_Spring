package com.ista.springboot.app.controllers;

import java.util.List;

import com.ista.springboot.app.models.tecnico;
import com.ista.springboot.app.service.tecnicoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tecnico")
public class tecnicoController {
    @Autowired
    private tecnicoService tecnicoservice;

    @PostMapping("/guardar-tecnico")
    public tecnico guardarTecnico(@RequestBody tecnico tecnico) {
        return tecnicoservice.guardarTecnico(tecnico);
    }

    @GetMapping("/listar-tecnicos")
    public List<tecnico> listarTecnicos() {
        return tecnicoservice.listarTecnicos();
    }

    @PutMapping("/actualizar-tecnico/{codTecnico}")
    public tecnico actualizarTecnico(@RequestBody tecnico tecnico, @PathVariable Long codTecnico) {
        return tecnicoservice.actualizarTecnico(tecnico, codTecnico);
    }

    @DeleteMapping("/eliminar-tecnico/{codTecnico}")
    public String eliminarTecnico(@PathVariable Long codTecnico) {
        return tecnicoservice.eliminarTecnico(codTecnico);
    }

}
