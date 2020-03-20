package com.example.poo2aula02032020.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * MeuControle
 */
@Controller
public class MeuControle {

        @GetMapping("/hello")
        public String hello()
        {
            return "myView";
        }

    
}