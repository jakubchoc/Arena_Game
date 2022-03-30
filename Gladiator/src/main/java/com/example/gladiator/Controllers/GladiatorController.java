package com.example.gladiator.Controllers;

import com.example.gladiator.Models.DTOs.AllGladiatorsResponseDTO;
import com.example.gladiator.Models.DTOs.GladiatorResponseDTO;
import com.example.gladiator.Services.GladiatorService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class GladiatorController {

    private final GladiatorService gladiatorService;

    @GetMapping("/gladiators")
    public ResponseEntity<?> allGladiators(){
        AllGladiatorsResponseDTO repsonse = new AllGladiatorsResponseDTO((List<GladiatorResponseDTO>) gladiatorService.getAllGladiators());
        return ResponseEntity.status(HttpStatus.OK)
                .body(repsonse);
    }

}
