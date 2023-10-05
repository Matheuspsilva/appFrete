package com.matheussilvadev.appfrete.domain.controller;

import com.matheussilvadev.appfrete.domain.model.Usuario;
import com.matheussilvadev.appfrete.domain.repository.UsuarioRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UsuarioController {

    private UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    private List<Usuario> obterLista() {
        return usuarioRepository.findAll();
    }

    @GetMapping("/usuario/lista")
    public String telaLista(Model model) {

        List<Usuario> listaUsuario = obterLista();
        model.addAttribute("listaUsuarios", listaUsuario);

        return "usuario/lista";
    }

    @GetMapping("/usuario/cadastro")
    public String telaCadastro() {
        return "usuario/cadastro";
    }

    @PostMapping("/usuario/incluir")
    public String incluir(Usuario usuario) {

        usuarioRepository.save(usuario);

        return "redirect:/usuario/lista";
    }

    @GetMapping("/usuario/{id}/excluir")
    public String exclusao(@PathVariable Integer id){
        usuarioRepository.deleteById(id);

        return "redirect:/usuario/lista";
    }
}
