package com.matheussilvadev.appfrete.domain.model;

import jakarta.persistence.*;

@Entity
public class Rota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Float distancia;

    public Rota( Float distancia) {
        this.distancia = distancia;
    }

    public Rota() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getDistancia() {
        return distancia;
    }

    public void setDistancia(Float distancia) {
        this.distancia = distancia;
    }

    public String toString() {
        return "distancia: " + distancia ;
    }

    public String impressao() {
        return this.getClass().getName() + " " + super.toString();
    }
}
