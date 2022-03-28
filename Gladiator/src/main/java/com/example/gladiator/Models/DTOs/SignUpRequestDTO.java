package com.example.gladiator.Models.DTOs;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class SignUpRequestDTO {
    private final String username;
    private final String email;
    private final String password;
    private final String registrationToken;
}
