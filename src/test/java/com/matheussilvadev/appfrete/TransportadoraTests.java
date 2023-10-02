package com.matheussilvadev.appfrete;

import com.matheussilvadev.appfrete.domain.model.Transportadora;
import org.junit.jupiter.api.Test;

public class TransportadoraTests {

    @Test
    void run() {

        Transportadora transportadora1 = new Transportadora( 1L, "Transportadora 1", "Rua 1", "999999999", "11111111111111" );
        Transportadora transportadora2 = new Transportadora( 2L, "Transportadora 2", "Rua 2", "999999998", "22222222222222" );
        Transportadora transportadora3 = new Transportadora( 3L, "Transportadora 3", "Rua 3", "999999997", "33333333333333" );

        System.out.println( "Inclusão da transportadora foi realizada com sucesso: \n" + transportadora1);
        System.out.println( "Inclusão da transportadora foi realizada com sucesso: \n" + transportadora2);
        System.out.println( "Inclusão da transportadora foi realizada com sucesso: \n" + transportadora3);

    }

}
