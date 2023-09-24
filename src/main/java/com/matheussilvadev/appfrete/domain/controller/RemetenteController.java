package com.matheussilvadev.appfrete.domain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RemetenteController {

    @GetMapping("/remetente/lista")
    public String telaLista() {
        return "/remetente/lista";
    }
}
