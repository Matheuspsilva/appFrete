package com.matheussilvadev.appfrete.domain.model;

public class Destinatario extends Empresa{

        public Destinatario( Long id, String nome, String endereco, String telefone, String cnpj) {
            super( id, nome, endereco, telefone, cnpj);
        }

    @Override
    public String impressao() {
        return this.getClass().getName() + " " + super.toString();
    }
}
