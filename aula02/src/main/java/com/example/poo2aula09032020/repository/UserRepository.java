package com.example.poo2aula09032020.repository;

import java.util.HashMap;

import com.example.poo2aula09032020.model.User;

import org.springframework.stereotype.Repository;

/**
 * UserRepository
 */
@Repository
public class UserRepository {

    public HashMap<String, User> hm = new HashMap<String,User>();

    public UserRepository()
    {
        hm.put("john",new User("john","John da Silva","123"));
    }

    public User getUserByLogin(String login)
    {
        return hm.get(login);
    }

}