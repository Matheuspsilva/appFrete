package com.matheussilvadev.appfrete;

import com.matheussilvadev.appfrete.domain.model.Rota;
import org.junit.jupiter.api.Test;

public class RotaTests {

    @Test
    public void run() {
        Rota rota1 = new Rota("Rota ABCD", 91.23F, "Avenida 23, Rua Zico, Cohab, Nº1, Rio de Janeio, RJ", "Rua das Margaridas, Avenida 45, Jardins, Nº 23, Belo Horizonte - MG");
        Rota rota2 = new Rota("Rota EFGH", 200.3F, "Avenida 1, Rua Principal, Parque Ambiental, Nº34, Belém, PA", "Rua 12, Avenida José Ferreira, Anl, Nº 1, São Luís - MA");
        Rota rota3 = new Rota("Rota XVBG", 300.1F, "Avenida 102, Rua 1, Centro, Nº 1, São Paulo, SP", "Rua 1, Avenida 2, Centro, Nº 1, Rio de Janeiro - RJ");

        System.out.println("Inclusão da rota foi realizada com sucesso: \n" + rota1);
        System.out.println("Inclusão da rota foi realizada com sucesso: \n" + rota2);
        System.out.println("Inclusão da rota foi realizada com sucesso: \n" + rota3);
    }

}
