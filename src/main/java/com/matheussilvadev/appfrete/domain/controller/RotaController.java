package com.matheussilvadev.appfrete.domain.controller;

import com.matheussilvadev.appfrete.domain.model.Rota;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class RotaController {

    @GetMapping("/rota/lista")
    public String telaLista(Model model) {

        Rota rota1 = new Rota(100.5f);
        Rota rota2 = new Rota(200.3f);
        Rota rota3 = new Rota(300.1f);

        List<Rota> rotas = List.of(rota1, rota2, rota3);

        model.addAttribute("listaRotas", rotas);

        return "/rota/lista";
    }
}
