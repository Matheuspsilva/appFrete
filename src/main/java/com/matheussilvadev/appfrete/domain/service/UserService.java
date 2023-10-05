package com.matheussilvadev.appfrete.domain.service;

import com.matheussilvadev.appfrete.domain.model.Usuario;
import com.matheussilvadev.appfrete.domain.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService{

    @Autowired
    private UsuarioRepository usuarioRepository;

    public UserService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario authenticate(String email, String senha) {
        Usuario usuario = usuarioRepository.findByEmail(email);
        if (usuario != null && usuario.getSenha().equals(senha)) {
            return usuario;
        } else {
            return null;
        }
    }
}
