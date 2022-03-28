package com.example.gladiator.Models.DTOs;

import lombok.Data;

@Data
public class AuthenticationResponseDTO {
    public String token;

    public AuthenticationResponseDTO(String token) {
        this.token = token;
    }
}
