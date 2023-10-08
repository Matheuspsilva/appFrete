package com.matheussilvadev.appfrete.domain.repository;

import com.matheussilvadev.appfrete.domain.model.Transportadora;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransportadoraRepository extends CrudRepository<Transportadora, Integer> {

}
