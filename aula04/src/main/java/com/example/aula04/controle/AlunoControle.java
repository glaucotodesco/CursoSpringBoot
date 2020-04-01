package com.example.aula04.controle;

import java.util.List;

import com.example.aula04.entidade.Aluno;
import com.example.aula04.servico.AlunoServico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AlunoControle {

    @Autowired
    private AlunoServico servico;
    
    @GetMapping("/alunos")
    public ModelAndView getAlunos(){

        ModelAndView mv = new ModelAndView("alunos");
        List <Aluno> list = servico.getAlunos();
        System.out.println(list);
        
        mv.addObject("alunos", servico.getAlunos());

        return mv;
    }
}