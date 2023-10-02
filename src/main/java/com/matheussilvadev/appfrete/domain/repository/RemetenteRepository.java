package com.matheussilvadev.appfrete.domain.repository;

import com.matheussilvadev.appfrete.domain.model.Remetente;
import com.matheussilvadev.appfrete.domain.model.Rota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RemetenteRepository extends JpaRepository<Remetente, Integer> {

}
