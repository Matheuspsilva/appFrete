package com.matheussilvadev.appfrete;

import com.matheussilvadev.appfrete.domain.model.Rota;
import org.junit.jupiter.api.Test;

public class RotaTests {

    @Test
    public void run() {
        Rota rota1 = new Rota(100.5f);
        Rota rota2 = new Rota(200.3f);
        Rota rota3 = new Rota(300.1f);

        System.out.println("Inclusão da rota foi realizada com sucesso: \n" + rota1);
        System.out.println("Inclusão da rota foi realizada com sucesso: \n" + rota2);
        System.out.println("Inclusão da rota foi realizada com sucesso: \n" + rota3);
    }

}
