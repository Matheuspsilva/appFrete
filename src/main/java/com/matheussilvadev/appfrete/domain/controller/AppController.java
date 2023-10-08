package com.matheussilvadev.appfrete.domain.controller;

import com.matheussilvadev.appfrete.domain.model.Usuario;
import com.matheussilvadev.appfrete.domain.service.IncluirProjetosService;
import com.matheussilvadev.appfrete.domain.service.UsuarioService;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@SessionAttributes("usuario")
@Controller
public class AppController {

    private final UsuarioService usuarioService;

    private final IncluirProjetosService incluirProjetosService;

    public AppController(UsuarioService usuarioService, IncluirProjetosService incluirProjetosService) {
        this.usuarioService = usuarioService;
        this.incluirProjetosService = incluirProjetosService;
    }

    @GetMapping("/")
    public String telaHome(Model model) {
        return "home";
    }

    @GetMapping("/sobre")
    public String telaSobre(Model model) {

        model.addAttribute("projeto", incluirProjetosService.obterProjeto());
        return "sobre";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String doLogin(@RequestParam String email, @RequestParam String senha, HttpSession session) {
        Usuario usuario = usuarioService.authenticate(email, senha);
        if (usuario != null) {
            session.setAttribute("usuario", usuario);
            return "redirect:/";
        } else {
            return "redirect:/login?error=true";
        }
    }

    @PostMapping("/logout")
    public String logout(HttpSession session, SessionStatus status) {
        status.setComplete();
        session.removeAttribute("usuario");
        return "redirect:/login";
    }



}
