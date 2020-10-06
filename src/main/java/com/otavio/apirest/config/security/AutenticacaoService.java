package com.otavio.apirest.config.security;

import com.otavio.apirest.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author Otavio Soares
 */
@Service
public class AutenticacaoService implements UserDetailsService {

    @Autowired
    UsuarioService usuarioService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return usuarioService.findByUsername(s);
    }
}
