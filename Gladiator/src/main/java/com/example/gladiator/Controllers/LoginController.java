package com.example.gladiator.Controllers;

import com.example.gladiator.Models.DTOs.AuthenticationRequestDTO;
import com.example.gladiator.Models.DTOs.AuthenticationResponseDTO;
import com.example.gladiator.Models.ErrorMessage;
import com.example.gladiator.Models.User;
import com.example.gladiator.Repositories.UserRepository;
import com.example.gladiator.Security.JwtUtil;
import com.example.gladiator.Services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class LoginController {

    private JwtUtil jwtUtil;
    private UserService userService;
    private UserRepository userRepository;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody(required = false) AuthenticationRequestDTO authenticationRequestDTO){

        if(authenticationRequestDTO.equals(null)){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorMessage("Missing username or password"));
        }
        if(!userService.userExist(authenticationRequestDTO.loginUsername)){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorMessage("Invalid username or password"));
        }
        User loginUser = userRepository.findUserBy(authenticationRequestDTO.loginUsername);
        if(loginUser.getPassword() != authenticationRequestDTO.loginPassword){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorMessage("Invalid username or password"));
        }
        String token = jwtUtil.generateToken(loginUser);
        return ResponseEntity.status(HttpStatus.OK).body(new AuthenticationResponseDTO(token));
    }

}
