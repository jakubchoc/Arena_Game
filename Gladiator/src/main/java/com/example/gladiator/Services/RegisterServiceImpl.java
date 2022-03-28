package com.example.gladiator.Services;

import com.example.gladiator.Models.DTOs.SignUpRequestDTO;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService{

    private UserService userService;

   @Override
    public String register(SignUpRequestDTO request){

       String token = userService.getToken();
       return token;
    }

}
