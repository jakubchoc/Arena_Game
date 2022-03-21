package com.example.gladiator.Models.DTOs;

import com.example.gladiator.Models.Gladiator;
import lombok.Data;

import java.util.List;

@Data
public class BattleResponseDTO {

    public List<GladiatorResponseDTO> resultOfBattle;

    public BattleResponseDTO(List<GladiatorResponseDTO> result){
       resultOfBattle = result;
    }
}
