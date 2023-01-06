package com.example.stademaladie.controllers;

import com.example.stademaladie.beans.User;
import com.example.stademaladie.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/login")
    public String gg(@RequestParam("email") String email, @RequestParam("password")String password){
        List<User> tab = userRepository.findAll();
        String alo="nono";
        for(User user: tab){
            System.out.println((user.getEmail()).equals(email) && (user.getPassword()).equals(password));
            if((user.getEmail()).equals(email) && (user.getPassword()).equals(password)){
                alo = "done";
            }
        }
        return alo;
    }

}
