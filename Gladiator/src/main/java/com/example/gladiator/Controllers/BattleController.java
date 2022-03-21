package com.example.gladiator.Controllers;

import com.example.gladiator.Models.DTOs.BattleRequestDTO;
import com.example.gladiator.Models.DTOs.BattleResponseDTO;
import com.example.gladiator.Models.ErrorMessage;
import com.example.gladiator.Services.BattleService;
import com.example.gladiator.Services.BattleServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class BattleController {

    private final BattleService battleService;

    @GetMapping("/battle")
    public ResponseEntity<?> gladiatorBattle(@RequestBody(required = false)BattleRequestDTO battleRequestDTO){
        if(battleRequestDTO == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(new ErrorMessage("Missing gladiator id"));
        }else{
            BattleResponseDTO response = battleService.fight(battleRequestDTO);
            return ResponseEntity.status(HttpStatus.OK).body(response);
        }
    }
}
