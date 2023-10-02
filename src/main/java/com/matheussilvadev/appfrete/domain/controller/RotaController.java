package com.matheussilvadev.appfrete.domain.controller;

import com.matheussilvadev.appfrete.domain.model.Rota;
import com.matheussilvadev.appfrete.domain.repository.RotaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class RotaController {

    private final RotaRepository rotaRepository;

    public RotaController(RotaRepository rotaRepository) {
        this.rotaRepository = rotaRepository;
    }


    public List<Rota> obterLista() {
        return rotaRepository.findAll();
    }

    @GetMapping("/rota/lista")
    public String telaLista(Model model) {
        List<Rota> rotas = obterLista();

        model.addAttribute("listaRotas", rotas);

        return "/rota/lista";
    }

    @GetMapping(value = "/rota/cadastro")
    public String telaCadastro() {

        return "/rota/cadastro";
    }

    @PostMapping("/rota/incluir")
    public String incluir(Rota rota) {

        rotaRepository.save(rota);

        return "redirect:/rota/lista";
    }


    @GetMapping("/rota/{id}/excluir")
    public String exclusao(@PathVariable  Integer id){
        rotaRepository.deleteById(id);

        return "redirect:/rota/lista";
    }


}
