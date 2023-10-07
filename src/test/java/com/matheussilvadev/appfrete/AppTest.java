package com.matheussilvadev.appfrete;

import com.matheussilvadev.appfrete.domain.model.app.Atributo;
import com.matheussilvadev.appfrete.domain.model.app.Classe;
import com.matheussilvadev.appfrete.domain.model.app.Projeto;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class AppTest {

    @Test
    void run(){

        Atributo nomeDestinatario = new Atributo("nome", "String", "Nome do destinatario");
        Atributo emailDestinatario = new Atributo("email", "String", "Email do destinatario");
        Atributo cpfDestinatario = new Atributo("cpf", "String", "CPF do destinatario");

        Classe destinatario = new Classe("Destinatario");
        destinatario.setAtributos(List.of(nomeDestinatario, emailDestinatario, cpfDestinatario));

        Atributo nomeRemetente = new Atributo("nome", "String", "Nome do remetente");
        Atributo emailRemetente = new Atributo("email", "String", "Email do remetente");
        Atributo cpfRemetente = new Atributo("cpf", "String", "CPF do remetente");

        Classe remetente = new Classe("Remetente");
        remetente.setAtributos(List.of(nomeRemetente, emailRemetente, cpfRemetente));

        Atributo nomeTransportadora = new Atributo("nome", "String", "Nome da transportadora");
        Atributo emailTransportadora = new Atributo("email", "String", "Email da transportadora");
        Atributo cnpjTransportadora = new Atributo("cnpj", "String", "CNPJ da transportadora");

        Classe transportadora = new Classe("Transportadora");
        transportadora.setAtributos(List.of(nomeTransportadora, emailTransportadora, cnpjTransportadora));

        Atributo distancia = new Atributo("distancia", "Double", "Distancia em KM");

        Classe rota = new Classe("Rota");
        rota.setAtributos(List.of(distancia));

        Atributo descricaoFrete = new Atributo("descricao", "String", "Descrição do frete");
        Atributo valorFrete = new Atributo("valor", "Double", "Valor do frete");
        Atributo dataFrete = new Atributo("dataEntrega", "Date", "Data de entrega do frete");
        Atributo statusFrete = new Atributo("status", "String", "Status do frete");
        Atributo remetenteFrete = new Atributo("remetente", "Remetente", "Remetente do frete");
        Atributo destinatarioFrete = new Atributo("destinatario", "Destinatario", "Destinatario do frete");
        Atributo transportadoraFrete = new Atributo("transportadora", "Transportadora", "Transportadora do frete");
        Atributo rotaFrete = new Atributo("rota", "Rota", "Rota do frete");

        Classe frete = new Classe("Frete");
        frete.setAtributos(List.of(descricaoFrete, valorFrete, dataFrete, statusFrete, remetenteFrete, destinatarioFrete, transportadoraFrete, rotaFrete));

        Projeto projeto = new Projeto("AppFrete", "Projeto de gestão de fretes");
        projeto.setDescricao("Projeto de gestão de fretes");
        projeto.setClasses(List.of(destinatario, remetente, transportadora, rota, frete));



    }
}
