package com.matheussilvadev.appfrete.domain.controller;

import com.matheussilvadev.appfrete.domain.model.Destinatario;
import com.matheussilvadev.appfrete.domain.repository.DestinatarioRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;

@Controller
public class DestinatarioController {

        private DestinatarioRepository destinatarioRepository;

        public DestinatarioController(DestinatarioRepository destinatarioRepository) {
            this.destinatarioRepository = destinatarioRepository;
        }

        private List<Destinatario> obterLista() {
            return destinatarioRepository.findAll();
        }

        @GetMapping("/destinatario/cadastro")
        public String telaCadastro() {
            return "destinatario/cadastro";
        }

        @GetMapping("/destinatario/lista")
        public String telaLista( Model model) {

            List<Destinatario> listaDestinatario = obterLista();
            model.addAttribute("listaDestinatario", listaDestinatario);

            return "destinatario/lista";
        }

        @PostMapping("/destinatario/incluir")
        public String incluir(Destinatario destinatario) {

            destinatarioRepository.save(destinatario);

            return "redirect:/destinatario/lista";
        }

        @GetMapping("/destinatario/{id}/excluir")
        public String exclusao(@PathVariable Integer id){
            destinatarioRepository.deleteById(id);

            return "redirect:/destinatario/lista";
        }

}
