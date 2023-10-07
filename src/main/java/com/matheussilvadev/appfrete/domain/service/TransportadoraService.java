package com.matheussilvadev.appfrete.domain.service;

import com.matheussilvadev.appfrete.domain.model.Transportadora;
import com.matheussilvadev.appfrete.domain.repository.TransportadoraRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransportadoraService {

    private final TransportadoraRepository transportadoraRepository;

    public TransportadoraService(TransportadoraRepository transportadoraRepository) {
        this.transportadoraRepository = transportadoraRepository;
    }

    public List<Transportadora> obterLista(){
        return transportadoraRepository.findAll();
    }

    public Transportadora salvar(Transportadora transportadora) {
        return transportadoraRepository.save(transportadora);
    }

    public void excluir(Integer id) {
        transportadoraRepository.deleteById(id);
    }


}
