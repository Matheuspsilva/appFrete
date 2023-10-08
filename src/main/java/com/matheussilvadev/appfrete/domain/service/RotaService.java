package com.matheussilvadev.appfrete.domain.service;

import com.matheussilvadev.appfrete.domain.model.Rota;
import com.matheussilvadev.appfrete.domain.repository.RotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RotaService {

    @Autowired
    private final RotaRepository rotaRepository;

    public RotaService(RotaRepository rotaRepository) {
        this.rotaRepository = rotaRepository;
    }

    public List<Rota> obterLista(){
        return (List<Rota>) rotaRepository.findAll();
    }

    public Rota salvar(Rota rota) {
        return rotaRepository.save(rota);
    }

    public void excluir(Integer id) {
        rotaRepository.deleteById(id);
    }

}
