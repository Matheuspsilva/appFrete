package com.matheussilvadev.appfrete.domain.controller;

import com.matheussilvadev.appfrete.domain.model.Transportadora;
import com.matheussilvadev.appfrete.domain.repository.TransportadoraRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class TransportadoraController {

    private final TransportadoraRepository transportadoraRepository;

    public TransportadoraController(TransportadoraRepository transportadoraRepository) {
        this.transportadoraRepository = transportadoraRepository;
    }


    private List<Transportadora> obterLista() {
        return transportadoraRepository.findAll();
    }

    @GetMapping("/transportadora/lista")
    public String telaLista(Model model) {

        List<Transportadora> listaTransportadoras = obterLista();

        model.addAttribute("listaTransportadoras", listaTransportadoras);

        return "/transportadora/lista";
    }

    @GetMapping("/transportadora/cadastro")
    public String telaCadastro() {
        return "/transportadora/cadastro";
    }

    @PostMapping("/transportadora/incluir")
    public String incluir(Transportadora transportadora) {
        transportadoraRepository.save(transportadora);
        return "redirect:/transportadora/lista";
    }

    @GetMapping("/transportadora/{id}/excluir")
    public String excluir(Transportadora transportadora) {
        transportadoraRepository.delete(transportadora);
        return "redirect:/transportadora/lista";
    }

}
