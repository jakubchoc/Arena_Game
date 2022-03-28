package com.example.gladiator.Services;

import com.example.gladiator.Models.DTOs.BattleRequestDTO;
import com.example.gladiator.Models.DTOs.BattleResponseDTO;
import com.example.gladiator.Models.DTOs.GladiatorResponseDTO;
import com.example.gladiator.Models.Gladiator;
import com.example.gladiator.Repositories.GladiatorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


@Service
@AllArgsConstructor
public class BattleServiceImpl implements BattleService{

    private GladiatorRepository gladiatorRepository;

    @Override
    public BattleResponseDTO fight(BattleRequestDTO battleRequestDTO){

        Gladiator playerOne = gladiatorRepository.findById(battleRequestDTO.ownGladiator).get();
        Gladiator playerTwo = gladiatorRepository.findById(battleRequestDTO.oponentGladiator).get();
        // osetrit vstup
        List<GladiatorResponseDTO> resultList = new ArrayList<>();
        boolean i = true;
        do {
            playerOne.HP -= playerTwo.getDemage();
            gladiatorRepository.save(playerOne);
            if (playerOne.getHP() <= 0){
                break;
            }
            playerTwo.HP -= playerOne.getDemage();
            gladiatorRepository.save(playerTwo);
            if (playerTwo.getHP() <= 0){
                break;
            }
        }while (i != false);

        if(playerOne.getHP() <= 0 && playerTwo.getHP() <= 0){
            GladiatorResponseDTO responseTwo = new GladiatorResponseDTO(playerTwo);
            resultList.add(responseTwo);
            GladiatorResponseDTO responseOne = new GladiatorResponseDTO(playerOne);
            resultList.add(responseOne);
        }
        else if(playerOne.getHP() <= 0){
            GladiatorResponseDTO responseTwo = new GladiatorResponseDTO(playerTwo);
            resultList.add(responseTwo);
        }
        else if(playerTwo.getHP() <= 0){
            GladiatorResponseDTO responseOne = new GladiatorResponseDTO(playerOne);
            resultList.add(responseOne);
        }
        BattleResponseDTO battleResponseDTO = new BattleResponseDTO(resultList);
        return battleResponseDTO;
    }
}
