package com.matheussilvadev.appfrete.domain.model.app;

import jakarta.persistence.*;

import java.util.List;

public class Classe {

    private Long id;

    private String nome;
    private List<Atributo> atributos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Classe() {
    }

    public Classe(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {

        return String.format("%s - %d", nome, atributos.size());
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Atributo> getAtributos() {
        return atributos;
    }
    public void setAtributos(List<Atributo> atributos) {
        this.atributos = atributos;
    }
}
