package com.example.gladiator.Models.DTOs;

import com.example.gladiator.Models.Entity.Character;
import lombok.Data;

@Data
public class GladiatorResponseDTO {

    private String gladiatorName;
    private int actualHP;
    private int actualLevel;

    public GladiatorResponseDTO(Character character){
        gladiatorName = character.getName();
        actualHP = character.getHP();
        actualLevel = character.getLevel();
    }
}
