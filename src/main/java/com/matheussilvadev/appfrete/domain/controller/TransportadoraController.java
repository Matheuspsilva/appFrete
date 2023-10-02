package com.matheussilvadev.appfrete.domain.controller;

import com.matheussilvadev.appfrete.domain.model.Transportadora;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TransportadoraController {

    @GetMapping("/transportadora/lista")
    public String telaLista(Model model) {

        Transportadora transportadora1 = new Transportadora( 1L, "Transportadora 1", "Rua 1", "999999999", "11111111111111" );
        Transportadora transportadora2 = new Transportadora( 2L, "Transportadora 2", "Rua 2", "999999998", "22222222222222" );
        Transportadora transportadora3 = new Transportadora( 3L, "Transportadora 3", "Rua 3", "999999997", "33333333333333" );

        List<Transportadora> listaTransportadoras = List.of(transportadora1, transportadora2, transportadora3);

        model.addAttribute("listaTransportadoras", listaTransportadoras);

        return "/transportadora/lista";
    }
}
