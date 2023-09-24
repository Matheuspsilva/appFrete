package com.matheussilvadev.appfrete.domain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RotaController {

    @GetMapping("/rota/lista")
    public String telaLista() {
        return "/rota/lista";
    }
}
