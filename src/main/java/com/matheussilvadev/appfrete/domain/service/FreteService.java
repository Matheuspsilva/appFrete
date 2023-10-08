package com.matheussilvadev.appfrete.domain.service;

import com.matheussilvadev.appfrete.domain.model.Frete;
import com.matheussilvadev.appfrete.domain.repository.FreteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FreteService {

    @Autowired
    private final FreteRepository freteRepository;

    public FreteService(FreteRepository freteRepository) {
        this.freteRepository = freteRepository;
    }

    public List<Frete> obterLista() {
        return (List<Frete>) freteRepository.findAll();
    }

    public Frete salvar(Frete frete) {
        return freteRepository.save(frete);
    }

    public void excluir(Integer id) {
        freteRepository.deleteById(id);
    }


}
