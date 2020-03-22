package com.example.poo2aula09032020.service;

import com.example.poo2aula09032020.model.User;
import com.example.poo2aula09032020.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserService
 */
@Service
public class UserService {

    @Autowired
    private UserRepository ur;

    public User getUserByLogin(String login, String pwd)
    {
        User user = ur.getUserByLogin(login);
        
        if(user != null){
            if(!user.getPwd().equals(pwd)){
                user = null;
            }
        }
        
        return user;

    }


}