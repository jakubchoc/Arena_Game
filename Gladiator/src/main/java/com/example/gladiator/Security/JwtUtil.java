package com.example.gladiator.Security;


import com.example.gladiator.Models.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JwtUtil extends WebSecurityConfigurerAdapter {
private String SECRET_KEY = "secret";

    public String generateToken(User user){
        Map<String, Object> claims = new HashMap<>();
        return createToken(claims, user.getUsername());

    }
    public String createToken(Map<String, Object> claims, String subject){
        return Jwts.builder().setClaims(claims).setSubject(subject).setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10))
                .signWith(SignatureAlgorithm.ES256, SECRET_KEY).compact();
    }
}
