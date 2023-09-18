package com.matheussilvadev.appfrete;

import com.matheussilvadev.appfrete.domain.model.Frete;
import com.matheussilvadev.appfrete.domain.model.StatusFrete;
import com.matheussilvadev.appfrete.domain.model.Destinatario;
import com.matheussilvadev.appfrete.domain.model.Remetente;
import com.matheussilvadev.appfrete.domain.model.Transportadora;

import org.junit.jupiter.api.Test;


import java.time.LocalDate;

public class FreteTeste {

    @Test
    void run() {

        Remetente remetente1 = new Remetente(1L, "Matheus", "Rua 1", "123456789", "123456789");
        Destinatario destinatario1 = new Destinatario(1L, "João", "Rua 2", "987654321", "987654321");
        Transportadora transportadora1 = new Transportadora(1L, "Transportadora 1", "Rua 3", "123456789", "123456789");

        // Na classe FreteTeste crie três variáveis, faça a inicialização e exiba uma mensagem com estas três informações separadas por ";".
        Frete frete1 = new Frete(1L, "Frete express", 100.0, LocalDate.now(), StatusFrete.PENDENTE, remetente1, destinatario1, transportadora1);

        System.out.println("Inclusão do pedido foi realizada com sucesso: \n" + frete1);
    }


}
