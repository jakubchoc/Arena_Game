package com.example.gladiator.Controllers;

import com.example.gladiator.Models.DTOs.AuthenticationRequestDTO;
import com.example.gladiator.Models.DTOs.AuthenticationResponseDTO;
import com.example.gladiator.Services.UserService;
import com.example.gladiator.Utility.JWTUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;


@RestController
public class LoginController {

    @Autowired
    private JWTUtility jwtUtility;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private UserService userService;


    @GetMapping("/")
    public String home(){
        return "Welcome";
    }

    @PostMapping("/login")
    public AuthenticationResponseDTO authenticate(@RequestBody  AuthenticationRequestDTO authenticationRequestDTO) throws Exception{

        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                    authenticationRequestDTO.getUsername(),
                    authenticationRequestDTO.getPassword()
            ));
        }catch(BadCredentialsException e){
            throw new Exception("INVALID_CREDENTIALS", e);
        }
        final UserDetails userDetails = userService.loadUserByUsername(authenticationRequestDTO.getUsername());
        final String token = jwtUtility.generateToken(userDetails);
        return new AuthenticationResponseDTO(token);
    }

}
