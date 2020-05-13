package com.example.aula04.servico;

import java.util.List;

import com.example.aula04.entidade.Professor;
import com.example.aula04.repository.ProfessorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessorServico {

    @Autowired
    private ProfessorRepository repository;
    
    public void salvar(Professor professor) {
        repository.save(professor);
    }

    public List<Professor> getProfessores() {
        return repository.findAll();
    }

    public Professor getProfessorById(int codigo) {
        return repository.findById(codigo).get();
    }


}