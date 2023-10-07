package com.matheussilvadev.appfrete.domain.service;

import com.matheussilvadev.appfrete.domain.model.Frete;
import com.matheussilvadev.appfrete.domain.repository.FreteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FreteService {

    private final FreteRepository freteRepository;

    public FreteService(FreteRepository freteRepository) {
        this.freteRepository = freteRepository;
    }

    public List<Frete> obterLista() {
        return freteRepository.findAll();
    }

    public Frete salvar(Frete frete) {
        return freteRepository.save(frete);
    }

    public void excluir(Integer id) {
        freteRepository.deleteById(id);
    }


}
