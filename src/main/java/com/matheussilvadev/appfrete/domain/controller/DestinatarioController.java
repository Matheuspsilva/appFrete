package com.matheussilvadev.appfrete.domain.controller;

import com.matheussilvadev.appfrete.domain.model.Destinatario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.AttributedString;
import java.util.List;

@Controller
public class DestinatarioController {

        @GetMapping("/destinatario/lista")
        //Criar um model nos parametros do metodo
        public String telaLista( Model model) {
            Destinatario destinatario1 = new Destinatario( 1L, "Destinatario 1", "Rua 1", "999999991", "11111111111111" );
            Destinatario destinatario2 = new Destinatario( 2L, "Destinatario 2", "Rua 2", "999999992", "22222222222222" );
            Destinatario destinatario3 = new Destinatario( 3L, "Destinatario 3", "Rua 3", "999999993", "33333333333333" );

            List<Destinatario> listaDestinatario = List.of(destinatario1, destinatario2, destinatario3);
            model.addAttribute("listaDestinatario", listaDestinatario);

            return "destinatario/lista";
        }
}
