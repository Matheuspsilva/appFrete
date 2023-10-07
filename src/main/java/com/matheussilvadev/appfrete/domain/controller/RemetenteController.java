package com.matheussilvadev.appfrete.domain.controller;

import com.matheussilvadev.appfrete.domain.model.Remetente;
import com.matheussilvadev.appfrete.domain.service.RemetenteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class RemetenteController {

    private final RemetenteService remetenteService;

    public RemetenteController(RemetenteService remetenteService) {
        this.remetenteService = remetenteService;
    }

    @GetMapping("/remetente/lista")
    public String telaLista(Model model) {

        List<Remetente> remetentes = remetenteService.obterLista();

        model.addAttribute("listaRemetentes", remetentes);

        return "remetente/lista";
    }

    @GetMapping("/remetente/cadastro")
    public String telaCadastro() {

        return "remetente/cadastro";
    }

    @PostMapping("/remetente/incluir")
    public String incluir(Remetente remetente) {

        remetenteService.salvar(remetente);

        return "redirect:/remetente/lista";
    }

    @GetMapping("/remetente/{id}/excluir")
    public String exclusao(@PathVariable Integer id){
        remetenteService.excluir(id);

        return "redirect:/remetente/lista";
    }

}
