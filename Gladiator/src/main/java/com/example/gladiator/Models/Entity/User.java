package com.example.gladiator.Models.Entity;

import com.example.gladiator.Models.Entity.Character;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @NotNull
    @Column(nullable = false)
    public String username;

    @NotNull
    @Column(nullable = false)
    public String email;

    @NotNull
    @Column(nullable = false)
    public String password;

    @OneToMany
    public List<Character> characterList;
}
