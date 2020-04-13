package com.example.aula04.entidade;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Aluno
 */
@Entity
public class Aluno implements Serializable {
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int matricula;
    private String nome;
    private String curso;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(final int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(final String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno [curso=" + curso + ", matricula=" + matricula + ", nome=" + nome + "]";
    }

    
}