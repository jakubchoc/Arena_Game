package com.example.gladiator.Services;

import com.example.gladiator.Models.DTOs.BattleRequestDTO;
import com.example.gladiator.Models.DTOs.BattleResponseDTO;

public interface BattleService {

    BattleResponseDTO fight(BattleRequestDTO battleRequestDTO);
}
