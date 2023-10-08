package com.matheussilvadev.appfrete.domain.controller;

import com.matheussilvadev.appfrete.domain.model.Transportadora;
import com.matheussilvadev.appfrete.domain.service.TransportadoraService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class TransportadoraController {

    private final TransportadoraService transportadoraService;

    public TransportadoraController(TransportadoraService transportadoraService) {
        this.transportadoraService = transportadoraService;
    }


    @GetMapping("/transportadora/lista")
    public String telaLista(Model model) {

        List<Transportadora> listaTransportadoras = transportadoraService.obterLista();

        model.addAttribute("listaTransportadoras", listaTransportadoras);

        return "/transportadora/lista";
    }

    @GetMapping("/transportadora/cadastro")
    public String telaCadastro() {
        return "/transportadora/cadastro";
    }

    @PostMapping("/transportadora/incluir")
    public String incluir(Transportadora transportadora) {
        transportadoraService.salvar(transportadora);
        return "redirect:/transportadora/lista";
    }

    @GetMapping("/transportadora/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        transportadoraService.excluir(id);
        return "redirect:/transportadora/lista";
    }

}
