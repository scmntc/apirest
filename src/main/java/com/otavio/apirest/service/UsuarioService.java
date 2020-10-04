package com.otavio.apirest.service;

import com.otavio.apirest.framework.ICrudService;
import com.otavio.apirest.model.Usuario;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsuarioService extends ICrudService<Usuario, Long> {

    UserDetails findByUsername(String email);
}
