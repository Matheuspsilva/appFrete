package com.matheussilvadev.appfrete.domain.service;

import com.matheussilvadev.appfrete.domain.model.Usuario;
import com.matheussilvadev.appfrete.domain.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
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

    @Autowired
    public List<Usuario> obterLista() {
        return (List<Usuario>) usuarioRepository.findAll();
    }

    public Usuario salvar(Usuario usuario) {
    	return usuarioRepository.save(usuario);
    }

    public void excluir(Integer id) {
        usuarioRepository.deleteById(id);
    }
}
