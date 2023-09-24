package com.matheussilvadev.appfrete.domain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TransportadoraController {

    @GetMapping("/transportadora/lista")
    public String telaLista() {
        return "/transportadora/lista";
    }
}
