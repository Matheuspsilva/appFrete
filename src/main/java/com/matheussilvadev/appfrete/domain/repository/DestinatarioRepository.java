package com.matheussilvadev.appfrete.domain.repository;

import com.matheussilvadev.appfrete.domain.model.Destinatario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DestinatarioRepository extends JpaRepository<Destinatario, Integer> {
}
