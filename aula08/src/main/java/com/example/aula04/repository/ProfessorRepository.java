package com.example.aula04.repository;

import com.example.aula04.entidade.Professor;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository <Professor, Integer> {
    
}