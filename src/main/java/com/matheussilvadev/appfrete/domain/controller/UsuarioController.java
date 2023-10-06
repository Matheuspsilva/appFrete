package com.matheussilvadev.appfrete.domain.controller;

import com.matheussilvadev.appfrete.domain.model.Usuario;
import com.matheussilvadev.appfrete.domain.repository.UsuarioRepository;
import com.matheussilvadev.appfrete.domain.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController( UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/usuario/lista")
    public String telaLista(Model model) {

        List<Usuario> listaUsuario = usuarioService.obterLista();
        model.addAttribute("listaUsuarios", listaUsuario);

        return "usuario/lista";
    }

    @GetMapping("/usuario/cadastro")
    public String telaCadastro() {
        return "usuario/cadastro";
    }

    @PostMapping("/usuario/incluir")
    public String incluir(Usuario usuario) {

        usuarioService.salvar(usuario);

        return "redirect:/login";
    }

    @GetMapping("/usuario/{id}/excluir")
    public String exclusao(@PathVariable Integer id){
        usuarioService.excluir(id);

        return "redirect:/usuario/lista";
    }
}
