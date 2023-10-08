package com.matheussilvadev.appfrete.domain.model.app;

import jakarta.persistence.*;

import java.util.List;

public class Projeto {

    private Long id;
    private String nome;
    private String descricao;
    private List<Classe> classes;

    public Projeto() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Projeto(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return String.format("%s - %s - %d", nome, descricao, classes.size());
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public List<Classe> getClasses() {
        return classes;
    }
    public void setClasses(List<Classe> classes) {
        this.classes = classes;
    }
}
