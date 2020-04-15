package com.example.aula04.servico;

import java.util.List;

import com.example.aula04.entidade.Aluno;
import com.example.aula04.entidade.Curso;
import com.example.aula04.repository.CursoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService {

    @Autowired
    private CursoRepository repository;
    
    public void salvar(Curso curso) {
        repository.save(curso);
    }

    public List<Curso> getCursos() {
        return repository.findAll();
    }

    public Curso getCursoById(int id){
        return repository.getOne(id);
    }

    public Curso matricularAluno(Curso curso, Aluno aluno){
        curso = getCursoById(curso.getId());
        curso.getAlunos().add(aluno);
        return repository.save(curso);
    }
}