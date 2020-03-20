package com.example.poo2aula09032020.controller;

import com.example.poo2aula09032020.model.User;
import com.example.poo2aula09032020.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * UserController
 */
@Controller
@RequestMapping("/app")
public class UserController {

    @Autowired
    private UserService us;

    @GetMapping("/user/{login}/{pwd}")
    public ModelAndView getUser(
        @PathVariable("login") String login,
        @PathVariable("pwd") String pwd
        ) {
        ModelAndView mv = new ModelAndView("userView");

        User user = us.getUserByLogin(login, pwd);    
        
        mv.addObject("user", user);

        return mv;
    }

}


