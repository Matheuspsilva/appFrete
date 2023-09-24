package com.matheussilvadev.appfrete.domain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DestinatarioController {

        @GetMapping("/destinatario/lista")
        public String telaLista() {
            return "destinatario/lista";
        }
}
