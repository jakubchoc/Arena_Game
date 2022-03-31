package com.example.gladiator.Models.Entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @NotNull
    @Column(nullable = false)
    public String name;

    @NotNull
    @Column(nullable = false)
    public int level;

    @NotNull
    @Column(nullable = false)
    public int HP;

    @NotNull
    @Column(nullable = false)
    public int demage;

    @Column
    public int gold;

    @NotNull
    @Column
    public int intelligence;

    @NotNull
    @Column
    public int lucky;

    @Column
    public int armor;

    public String typeOfCharacter;

}
