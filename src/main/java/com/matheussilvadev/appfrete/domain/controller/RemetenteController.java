package com.matheussilvadev.appfrete.domain.controller;

import com.matheussilvadev.appfrete.domain.model.Remetente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class RemetenteController {

    @GetMapping("/remetente/lista")
    public String telaLista(Model model) {

        Remetente remetente1 = new Remetente( 1L, "Remetente 1", "Rua 1", "999999999", "11111111111111" );
        Remetente remetente2 = new Remetente( 2L, "Remetente 2", "Rua 2", "999999998", "22222222222222" );
        Remetente remetente3 = new Remetente( 3L, "Remetente 3", "Rua 3", "999999997", "33333333333333" );

        List<Remetente> remetentes = List.of(remetente1, remetente2, remetente3);

        model.addAttribute("listaRemetentes", remetentes);

        return "remetente/lista";
    }
}
