package com.example.aula04.controle;



import com.example.aula04.entidade.Aluno;
import com.example.aula04.servico.AlunoServico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AlunoControle {

    @Autowired
    private AlunoServico servico;
    
    @GetMapping("/alunos")
    public ModelAndView getAlunos(){
        ModelAndView mv = new ModelAndView("alunosTemplate");
        mv.addObject("alunos", servico.getAlunos());

        return mv;
    }

    @PostMapping("/salvarAluno")
    public String salvar(@ModelAttribute Aluno aluno){
        servico.salvar(aluno);
        return "redirect:/alunos";
    }
}








