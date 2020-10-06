package com.otavio.apirest.config.security;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Otavio Soares
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class LoginForm {

    private String email;
    private String senha;

}
