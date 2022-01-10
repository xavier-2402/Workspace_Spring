package com.ista.springboot.app.controllers;

import java.util.List;

import com.ista.springboot.app.models.SLA;
import com.ista.springboot.app.repository.SLARepository;
import com.ista.springboot.app.service.SLAService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sla")
public class slaController {

    @Autowired
    private SLAService slaService;

    @PostMapping("/guardar-sla")
    public SLA guardarSla(@RequestBody SLA sla){
       return  slaService.agregarSLA(sla);
    }

    @GetMapping("/listar-sla")
    public List<SLA> recuperarSla(){
        return slaService.listarSLA();
    }
    
}
