package com.example.aula04.controle;

import com.example.aula04.entidade.Curso;
import com.example.aula04.servico.CursoServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CursoControle {

    @Autowired
    private CursoServico servico;

    @GetMapping("/cursos")
    public ModelAndView getCursos() {
        ModelAndView mv = new ModelAndView("cursosTemplate");
        mv.addObject("cursos", servico.getCursos());

        return mv;
    }

    @GetMapping("/detalhesCurso/{id}")
    public ModelAndView getCursoDetalhes(@PathVariable(name = "id") Integer id) {
        
        Curso curso = servico.getCursoById(id);
        ModelAndView mv = new ModelAndView("detalhesCurso");
        mv.addObject("curso", curso);

        return mv;
    }

    @PostMapping("/salvarCurso")
    public String salvar(@ModelAttribute Curso curso) {
        servico.salvar(curso);
        return "redirect:/cursos";
    }

   
}
