package com.otavio.apirest.config.security;

import com.otavio.apirest.model.Usuario;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TokenService {

    @Value("${api.jwt.expiration}")
    private String expiration;

    @Value("${api.jwt.secret}")
    private String secret;

    public String gerarToken(Authentication authentication) {
        Usuario logado = (Usuario) authentication.getPrincipal();
        Date today = new Date();
        Date dateExpiration = new Date(today.getTime() + Long.parseLong(expiration));
        return Jwts.builder().setIssuer("Api do Otavio")
                .setSubject(logado.getIdusuario().toString())
                .setIssuedAt(today) // seta data de criacao
                .setExpiration(dateExpiration) // tempo de expiracao
                .signWith(SignatureAlgorithm.HS256, secret)
                .compact();
    }
}
