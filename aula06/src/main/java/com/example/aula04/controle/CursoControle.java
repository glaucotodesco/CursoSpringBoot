package com.example.aula04.controle;

import com.example.aula04.entidade.Curso;
import com.example.aula04.servico.CursoService;
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
    private CursoService servico;

    @GetMapping("/cursos")
    public ModelAndView getAlunos() {
        ModelAndView mv = new ModelAndView("cursoTemplate");
        mv.addObject("cursos", servico.getCursos());

        return mv;
    }

    @PostMapping("/salvarCurso")
    public String salvar(@ModelAttribute Curso curso) {
        servico.salvar(curso);

        return "redirect:/cursos";
    }

    @GetMapping("/detalhesCurso/{idCurso}")
    public ModelAndView getDetalhesCurso(@PathVariable int idCurso) {
        Curso curso = servico.getCursoById(idCurso);

        ModelAndView mv = new ModelAndView("detalhesCursoTemplate");
        mv.addObject("curso", curso);

        return mv;
    }
}
