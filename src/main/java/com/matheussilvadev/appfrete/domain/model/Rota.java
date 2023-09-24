package com.matheussilvadev.appfrete.domain.model;

public class Rota {

    private Float distancia;

    public Rota( Float distancia) {
        this.distancia = distancia;
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
