package com.example.aula04.repository;

import com.example.aula04.entidade.Aluno;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository <Aluno, Integer> {

}