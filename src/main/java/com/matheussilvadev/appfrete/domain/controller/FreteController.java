package com.matheussilvadev.appfrete.domain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FreteController {

        @GetMapping("/frete/lista")
        public String telaLista() {
            return "/frete/lista";
        }
}
