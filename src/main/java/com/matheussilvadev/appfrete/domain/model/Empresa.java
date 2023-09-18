package com.matheussilvadev.appfrete.domain.model;

public class Empresa {

    private Long id;
    private String nome;
    private String endereco;
    private String telefone;
    private String cnpj;

    public Empresa() {
    }

    public Empresa(Long id, String nome, String endereco, String telefone, String cnpj) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cnpj = cnpj;
    }
    @Override
    public String toString() {
        return  "id: " + id + "; " + "nome: " + nome + "; " + "endereco: " + endereco + "; "
                + "telefone: " + telefone + "; " + "cnpj: " + cnpj;
    }

}
