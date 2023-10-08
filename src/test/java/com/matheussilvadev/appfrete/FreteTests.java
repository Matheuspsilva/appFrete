package com.matheussilvadev.appfrete;

import com.matheussilvadev.appfrete.domain.model.*;

import org.junit.jupiter.api.Test;


import java.time.LocalDate;

public class FreteTests {

    @Test
    void run() {

        Remetente remetente1 = new Remetente(1L, "Remetente 1", "Rua 11", "117654321", "113456789");
        Destinatario destinatario1 = new Destinatario(1L, "Destinatario 1", "Rua 12", "127654321", "123456789");
        Transportadora transportadora1 = new Transportadora(1L, "Transportadora 1", "Rua 13", "137654321", "133456789");

        Remetente remetente2 = new Remetente(2L, "Remetente 2", "Rua 21", "217654321", "213456789");
        Destinatario destinatario2 = new Destinatario(2L, "Destinatario 2", "Rua 22", "227654321", "223456789");
        Transportadora transportadora2 = new Transportadora(2L, "Transportadora 2", "Rua 23", "237654321", "233456789");

        Remetente remetente3 = new Remetente(3L, "Remetente 3", "Rua 31", "317654321", "313456789");
        Destinatario destinatario3 = new Destinatario(3L, "Destinatario 3", "Rua 32", "327654321", "323456789");
        Transportadora transportadora3 = new Transportadora(3L, "Transportadora 3", "Rua 33", "337654321", "333456789");

        Rota rota1 = new Rota("Rota ABCD", 91.23F, "Avenida 23, Rua Zico, Cohab, Nº1, Rio de Janeio, RJ", "Rua das Margaridas, Avenida 45, Jardins, Nº 23, Belo Horizonte - MG");
        Rota rota2 = new Rota("Rota EFGH", 200.3F, "Avenida 1, Rua Principal, Parque Ambiental, Nº34, Belém, PA", "Rua 12, Avenida José Ferreira, Anl, Nº 1, São Luís - MA");
        Rota rota3 = new Rota("Rota XVBG", 300.1F, "Avenida 102, Rua 1, Centro, Nº 1, São Paulo, SP", "Rua 1, Avenida 2, Centro, Nº 1, Rio de Janeiro - RJ");

        // Na classe FreteTeste crie três variáveis, faça a inicialização e exiba uma mensagem com estas três informações separadas por ";".
        Frete frete1 = new Frete(1L, "Frete econômico", 100.0, LocalDate.now(), StatusFrete.PENDENTE, remetente1, destinatario1, transportadora1, rota1);
        Frete frete2 = new Frete(2L, "Frete rápido", 200.0, LocalDate.now(), StatusFrete.PENDENTE, remetente2, destinatario2, transportadora2, rota2);
        Frete frete3 = new Frete(3L, "Frete express", 300.0, LocalDate.now(), StatusFrete.PENDENTE, remetente3, destinatario3, transportadora3, rota3);


        System.out.println("Inclusão do frete foi realizada com sucesso: \n" + frete1);
        System.out.println("Inclusão do frete foi realizada com sucesso: \n" + frete2);
        System.out.println("Inclusão do frete foi realizada com sucesso: \n" + frete3);
    }


}
