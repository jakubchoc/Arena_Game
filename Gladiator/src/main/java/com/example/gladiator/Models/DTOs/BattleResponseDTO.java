package com.example.gladiator.Models.DTOs;

import lombok.Data;

import java.util.List;

@Data
public class BattleResponseDTO {

    public List<GladiatorResponseDTO> resultOfBattle;

    public BattleResponseDTO(List<GladiatorResponseDTO> result){
       resultOfBattle = result;
    }
}
