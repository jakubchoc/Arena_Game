package com.example.gladiator.Services;

import com.example.gladiator.Models.DTOs.SignUpRequestDTO;
import com.example.gladiator.Models.User;
import com.example.gladiator.Repositories.UserRepository;

import java.util.UUID;

public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public Boolean userExist(String username){
        return userRepository.existsByUsername(username);
    }

  /* @Override
    public String signUp(SignUpRequestDTO request){
        boolean userExist = userRepository.existsByUsername(request.getUsername());
        if(!userExist){
            throw new IllegalStateException("username doesn't exist");
        }
        String token = getToken();
;

        return token;
    }

   */
    @Override
    public String getToken(){
        return UUID.randomUUID().toString();
    }
}
