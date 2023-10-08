package com.matheussilvadev.appfrete.domain.controller;

import com.matheussilvadev.appfrete.domain.model.Rota;
import com.matheussilvadev.appfrete.domain.service.RotaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class RotaController {


    public final RotaService rotaService;

    public RotaController(RotaService rotaService) {
        this.rotaService = rotaService;
    }

    @GetMapping("/rota/lista")
    public String telaLista(Model model) {
        List<Rota> rotas = rotaService.obterLista();

        model.addAttribute("listaRotas", rotas);

        return "/rota/lista";
    }

    @GetMapping(value = "/rota/cadastro")
    public String telaCadastro() {

        return "/rota/cadastro";
    }

    @PostMapping("/rota/incluir")
    public String incluir(Rota rota) {

        rotaService.salvar(rota);

        return "redirect:/rota/lista";
    }


    @GetMapping("/rota/{id}/excluir")
    public String exclusao(@PathVariable  Integer id){
        rotaService.excluir(id);

        return "redirect:/rota/lista";
    }


}
