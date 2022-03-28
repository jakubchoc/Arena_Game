package com.example.gladiator.Services;

import com.example.gladiator.Models.User;

public interface UserService {

    Boolean userExist(String username);

    //String signUp(User user);

    String getToken();

}
