package com.example.gladiator.Models.Entity;

import com.example.gladiator.Models.Entity.Character;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter

public class Warrior extends Character {

    public Warrior(Long id, String name, int level, int HP, int demage, int gold, int intelligence, int lucky, int armor, String typeOfCharacter) {
        this.id = id;
        this.name = name;
        this.level = 1;
        this.HP = 10;
        this.demage = 10;
        this.gold = 100;
        this.intelligence = 2;
        this.lucky = 2;
        this.armor = 0;
        this.typeOfCharacter = "Warrior";
    }

    public Warrior() {

    }
}
