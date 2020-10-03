package com.otavio.apirest.data;

import com.otavio.apirest.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioData extends JpaRepository<Usuario, Long> {
}
