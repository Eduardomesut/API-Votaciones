package com.example.Api_Votaciones.controller;

import com.example.Api_Votaciones.datos.Votaciones;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class votacionesController {

    private final Logger log = LoggerFactory.getLogger(votacionesController.class);
    private Votaciones votaciones;

    public votacionesController(Votaciones votaciones) {
        this.votaciones = votaciones;
    }

    //Revisar por que no me funciona con post
    @GetMapping("/voto/{nombre}")
    public void voto(@PathVariable String nombre){
        this.votaciones.addVoto(nombre);


    }

    @GetMapping("/votos")
    public void getVotos(){
        System.out.println(this.votaciones.toString());

    }

}
