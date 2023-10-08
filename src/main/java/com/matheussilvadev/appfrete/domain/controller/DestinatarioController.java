package com.matheussilvadev.appfrete.domain.controller;

import com.matheussilvadev.appfrete.domain.model.Destinatario;
import com.matheussilvadev.appfrete.domain.service.DestinatarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class DestinatarioController {

        private DestinatarioService destinatarioService;

        public DestinatarioController(DestinatarioService destinatarioService) {
            this.destinatarioService = destinatarioService;
        }

        @GetMapping("/destinatario/cadastro")
        public String telaCadastro() {
            return "destinatario/cadastro";
        }

        @GetMapping("/destinatario/lista")
        public String telaLista( Model model) {

            List<Destinatario> listaDestinatario = destinatarioService.obterLista();
            model.addAttribute("listaDestinatario", listaDestinatario);

            return "destinatario/lista";
        }

        @PostMapping("/destinatario/incluir")
        public String incluir(Destinatario destinatario) {

            destinatarioService.salvar(destinatario);

            return "redirect:/destinatario/lista";
        }

        @GetMapping("/destinatario/{id}/excluir")
        public String exclusao(@PathVariable Integer id){
            destinatarioService.excluir(id);

            return "redirect:/destinatario/lista";
        }

}
