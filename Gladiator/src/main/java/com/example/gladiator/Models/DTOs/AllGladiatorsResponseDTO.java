package com.example.gladiator.Models.DTOs;

import java.util.List;

public class AllGladiatorsResponseDTO {

    public List<GladiatorResponseDTO> resultOfBattle;

    public AllGladiatorsResponseDTO(List<GladiatorResponseDTO> result){
        resultOfBattle = result;
    }
}
