package com.matheussilvadev.appfrete.domain.service;

import com.matheussilvadev.appfrete.domain.model.Remetente;
import com.matheussilvadev.appfrete.domain.repository.RemetenteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RemetenteService {

    private final RemetenteRepository remetenteRepository;

    public RemetenteService(RemetenteRepository remetenteRepository) {
        this.remetenteRepository = remetenteRepository;
    }

    public List<Remetente> obterLista() {
        return remetenteRepository.findAll();
    }

    public Remetente salvar(Remetente remetente) {
        return remetenteRepository.save(remetente);
    }

    public void excluir(Integer id) {
        remetenteRepository.deleteById(id);
    }
}
