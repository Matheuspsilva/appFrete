package com.matheussilvadev.appfrete.domain.controller;

import com.matheussilvadev.appfrete.domain.model.Remetente;
import com.matheussilvadev.appfrete.domain.repository.RemetenteRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class RemetenteController {

    private final RemetenteRepository remetenteRepository;

    public RemetenteController(RemetenteRepository remetenteRepository) {
        this.remetenteRepository = remetenteRepository;
    }

    private List<Remetente> obterLista() {
        return remetenteRepository.findAll();
    }

    @GetMapping("/remetente/lista")
    public String telaLista(Model model) {

        List<Remetente> remetentes = obterLista();

        model.addAttribute("listaRemetentes", remetentes);

        return "remetente/lista";
    }

    @GetMapping("/remetente/cadastro")
    public String telaCadastro() {

        return "remetente/cadastro";
    }

    @PostMapping("/remetente/incluir")
    public String incluir(Remetente remetente) {

        remetenteRepository.save(remetente);

        return "redirect:/remetente/lista";
    }

    @GetMapping("/remetente/{id}/excluir")
    public String exclusao(@PathVariable Integer id){
        remetenteRepository.deleteById(id);

        return "redirect:/remetente/lista";
    }

}
