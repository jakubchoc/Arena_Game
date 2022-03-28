package com.example.gladiator.Services;

import com.example.gladiator.Models.DTOs.GladiatorResponseDTO;
import com.example.gladiator.Models.Gladiator;
import com.example.gladiator.Repositories.GladiatorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


@Service
@AllArgsConstructor
public class GladiatorServiceImpl implements GladiatorService{

    public GladiatorRepository gladiatorRepository;

    @Override
    public List<GladiatorResponseDTO> getAllGladiators(){
        List<Gladiator> allGladiators = gladiatorRepository.findAll();
        List<GladiatorResponseDTO> result = new ArrayList<>();
        for(Gladiator gladiator : allGladiators){
            GladiatorResponseDTO gladiatorResponseDTO = new GladiatorResponseDTO(gladiator);
            result.add(gladiatorResponseDTO);
        }
        return result;
    }


}
