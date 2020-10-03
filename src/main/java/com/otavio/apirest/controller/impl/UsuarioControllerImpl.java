package com.otavio.apirest.controller.impl;

import com.otavio.apirest.controller.UsuarioController;
import com.otavio.apirest.framework.CrudController;
import com.otavio.apirest.framework.ICrudService;
import com.otavio.apirest.model.Usuario;
import com.otavio.apirest.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/usuario")
public class UsuarioControllerImpl extends CrudController<Usuario, Long> implements UsuarioController {

    @Autowired
    UsuarioService service;

    @Override
    protected ICrudService<Usuario, Long> service() {
        return service;
    }

}
