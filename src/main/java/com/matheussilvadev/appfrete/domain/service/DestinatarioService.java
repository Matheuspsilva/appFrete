package com.matheussilvadev.appfrete.domain.service;

import com.matheussilvadev.appfrete.domain.model.Destinatario;
import com.matheussilvadev.appfrete.domain.repository.DestinatarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DestinatarioService {

    @Autowired
    private final DestinatarioRepository destinatarioRepository;

    public DestinatarioService(DestinatarioRepository destinatarioRepository) {
        this.destinatarioRepository = destinatarioRepository;
    }

    public List<Destinatario> obterLista() {
        return (List<Destinatario>) destinatarioRepository.findAll();
    }

    public Destinatario salvar(Destinatario destinatario) {
        return destinatarioRepository.save(destinatario);
    }

    public void excluir(Integer id) {
        destinatarioRepository.deleteById(id);
    }

}
