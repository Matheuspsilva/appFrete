package com.matheussilvadev.appfrete;

import com.matheussilvadev.appfrete.domain.model.Destinatario;
import org.junit.jupiter.api.Test;

public class DestinatarioTests {

    @Test
    void run(){
        Destinatario destinatario1 = new Destinatario( 1L, "Destinatario 1", "Rua 1", "999999991", "11111111111111" );
        Destinatario destinatario2 = new Destinatario( 2L, "Destinatario 2", "Rua 2", "999999992", "22222222222222" );
        Destinatario destinatario3 = new Destinatario( 3L, "Destinatario 3", "Rua 3", "999999993", "33333333333333" );

        System.out.println( "Inclusão do destinatario foi realizada com sucesso: \n" + destinatario1 );
        System.out.println( "Inclusão do destinatario foi realizada com sucesso: \n" + destinatario2 );
        System.out.println( "Inclusão do destinatario foi realizada com sucesso: \n" + destinatario3 );
    }
}
