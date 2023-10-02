package com.matheussilvadev.appfrete.domain.model;

public class Transportadora extends Empresa{

    public Transportadora() {
    }

    public Transportadora(Long id, String nome, String endereco, String telefone, String cnpj) {
        super(id, nome, endereco, telefone, cnpj);
    }

}
