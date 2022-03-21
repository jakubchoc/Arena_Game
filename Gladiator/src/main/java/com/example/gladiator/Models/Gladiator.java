package com.example.gladiator.Models;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Gladiator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    @NotNull
    @Column(nullable = false)
    public String name;

    @NotNull
    @Column(nullable = false)
    public int HP;

    @NotNull
    @Column(nullable = false)
    public int demage;

    @NotNull
    @Column(nullable = false)
    public int level;

}
