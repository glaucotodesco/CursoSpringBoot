package com.example.aula04.entidade;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


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

    @ManyToOne
    @JoinColumn(name="ID_CURSO")
    private Curso curso;

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

   
    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    
    @Override
    public String toString() {
        return "Aluno [curso=" + curso.getNome() + ", matricula=" + matricula + ", nome=" + nome + "]";
    }

    
    
}