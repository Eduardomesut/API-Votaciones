package com.example.Api_Votaciones.datos;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class Votaciones {

    private HashMap<String, Integer> votaciones;

    public Votaciones() {
        this.votaciones = new HashMap<>();
    }

    public HashMap<String, Integer> getVotaciones() {
        return votaciones;
    }

    public void setVotaciones(HashMap<String, Integer> votaciones) {
        this.votaciones = votaciones;
    }
    public void addVoto(String nombre){
        if (this.votaciones.containsKey(nombre)){
            this.votaciones.put(nombre, votaciones.get(nombre)+1);
        }else {
            this.votaciones.put(nombre, 1);
        }
    }

    @Override
    public String toString() {
        return "Votaciones{" +
                "votaciones=" + votaciones +
                '}';
    }
}
