package com.example.aula04.repository;

import com.example.aula04.entidade.Curso;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository  extends JpaRepository <Curso, Integer>{

}