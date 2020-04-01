package com.example.aula04.entidade;

import java.io.Serializable;

import javax.persistence.Entity;
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
    private int matricula;
    private String nome;
    private String curso;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno [curso=" + curso + ", matricula=" + matricula + ", nome=" + nome + "]";
    }

    
}