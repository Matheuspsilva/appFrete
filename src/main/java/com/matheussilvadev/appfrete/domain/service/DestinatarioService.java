package com.matheussilvadev.appfrete.domain.service;

import com.matheussilvadev.appfrete.domain.model.Destinatario;
import com.matheussilvadev.appfrete.domain.repository.DestinatarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DestinatarioService {

    private final DestinatarioRepository destinatarioRepository;

    public DestinatarioService(DestinatarioRepository destinatarioRepository) {
        this.destinatarioRepository = destinatarioRepository;
    }

    public List<Destinatario> obterLista() {
        return destinatarioRepository.findAll();
    }

    public Destinatario salvar(Destinatario destinatario) {
        return destinatarioRepository.save(destinatario);
    }

    public void excluir(Integer id) {
        destinatarioRepository.deleteById(id);
    }

}
