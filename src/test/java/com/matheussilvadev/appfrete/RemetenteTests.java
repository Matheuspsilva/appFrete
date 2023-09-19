package com.matheussilvadev.appfrete;

import com.matheussilvadev.appfrete.domain.model.Remetente;
import org.junit.jupiter.api.Test;

public class RemetenteTests {

    @Test
    void run() {

        Remetente remetente1 = new Remetente( 1L, "Remetente 1", "Rua 1", "999999999", "11111111111111" );
        Remetente remetente2 = new Remetente( 2L, "Remetente 2", "Rua 2", "999999998", "22222222222222" );
        Remetente remetente3 = new Remetente( 3L, "Remetente 3", "Rua 3", "999999997", "33333333333333" );

        System.out.println( "Inclusão do remetente foi realizada com sucesso: \n" + remetente1 );
        System.out.println( "Inclusão do remetente foi realizada com sucesso: \n" + remetente2 );
        System.out.println( "Inclusão do remetente foi realizada com sucesso: \n" + remetente3 );
    }

}