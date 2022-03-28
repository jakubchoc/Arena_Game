package com.example.gladiator.Utilities;

import org.springframework.stereotype.Service;

import java.util.function.Predicate;

@Service
public class EmailValidator implements Predicate<String> {

    public boolean test(String email){
        //TODO: Regex to validate
        return true;
    }
}
