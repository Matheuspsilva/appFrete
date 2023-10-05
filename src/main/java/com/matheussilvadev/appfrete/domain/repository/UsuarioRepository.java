package com.matheussilvadev.appfrete.domain.repository;

import com.matheussilvadev.appfrete.domain.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
