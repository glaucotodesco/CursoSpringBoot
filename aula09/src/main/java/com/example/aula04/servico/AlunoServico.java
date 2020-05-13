package com.example.aula04.servico;

import java.util.List;

import com.example.aula04.entidade.Aluno;
import com.example.aula04.repository.AlunoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoServico {

    @Autowired
    private AlunoRepository repository;
    
    public List<Aluno> getAlunos(){
        return repository.findAll();
    }

    public void salvar(Aluno aluno){
        repository.save(aluno);
    }

	public Aluno getAlunoById(Integer matricula) {
		return repository.findById(matricula).get();
	}

	public void remover(Aluno aluno) {
        repository.delete(aluno);
	}
}