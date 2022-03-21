package com.example.gladiator.Models;

import com.sun.istack.NotNull;

import javax.persistence.Id;

public class User {

    @Id
    private Long id;

    @NotNull
    private String username;

    @NotNull
    private String email;

}
