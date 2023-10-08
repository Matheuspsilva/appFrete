package com.matheussilvadev.appfrete.domain.repository;

import com.matheussilvadev.appfrete.domain.model.Rota;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RotaRepository extends CrudRepository<Rota, Integer> {
}
