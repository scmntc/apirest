package com.otavio.apirest.data;

import com.otavio.apirest.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsuarioData extends JpaRepository<Usuario, Long> {

    UserDetails findUsuarioByEmail(String email);
}
