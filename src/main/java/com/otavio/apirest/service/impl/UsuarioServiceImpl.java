package com.otavio.apirest.service.impl;

import com.otavio.apirest.data.UsuarioData;
import com.otavio.apirest.framework.CrudService;
import com.otavio.apirest.model.Usuario;
import com.otavio.apirest.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl extends CrudService<Usuario, Long> implements UsuarioService {

    @Autowired
    UsuarioData data;

    @Override
    protected JpaRepository<Usuario, Long> data() {
        return data;
    }
}
