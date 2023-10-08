package com.matheussilvadev.appfrete.domain.controller;

import com.matheussilvadev.appfrete.domain.model.*;
import com.matheussilvadev.appfrete.domain.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class FreteController {

        private final FreteService freteService;
        private final DestinatarioService destinatarioService;
        private final TransportadoraService transportadoraService;
        private final RotaService rotaService;
        private final RemetenteService remetenteService;


        public FreteController(FreteService freteService, DestinatarioService destinatarioService, TransportadoraService transportadoraService, RotaService rotaService, RemetenteService remetenteService) {
            this.freteService = freteService;
            this.destinatarioService = destinatarioService;
            this.transportadoraService = transportadoraService;
            this.rotaService = rotaService;
            this.remetenteService = remetenteService;
        }

        @GetMapping("/frete/cadastro")
        public String telaCadastro(Model model) {

            List<Remetente> listaRemetentes = remetenteService.obterLista();
            List<Destinatario> listaDestinatarios = destinatarioService.obterLista();
            List<Transportadora> listaTransportadoras = transportadoraService.obterLista();
            List<Rota> listaRotas = rotaService.obterLista();

            model.addAttribute("remetentes", listaRemetentes);
            model.addAttribute("destinatarios", listaDestinatarios);
            model.addAttribute("transportadoras", listaTransportadoras);
            model.addAttribute("rotas", listaRotas);

            return "/frete/cadastro";
        }

        @GetMapping("/frete/lista")
        public String telaLista(Model model){

            List<Frete> listaFretes = freteService.obterLista();
            model.addAttribute("listaFretes", listaFretes);

            return "/frete/lista";
        }

        @PostMapping("/frete/incluir")
        public String salvar(Frete frete) {

            freteService.salvar(frete);

            return "redirect:/frete/lista";
        }

        @GetMapping("/frete/{id}/excluir")
        public String exclusao(Integer id){
            freteService.excluir(id);

            return "redirect:/frete/lista";
        }



}
