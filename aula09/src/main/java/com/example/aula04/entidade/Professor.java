package com.example.aula04.entidade;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;
import javax.persistence.UniqueConstraint;

@Entity
public class Professor implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigo;
    private String nome;
  
    @ManyToMany
    @JoinTable(
        name="CursosProfessores", 
        uniqueConstraints = @UniqueConstraint(columnNames = { "codigo_professor", "id_curso" }),
        joinColumns        = @JoinColumn(name = "codigo_professor" ),
        inverseJoinColumns = @JoinColumn(name = "id_curso")
    )
    private List<Curso> cursos;
        

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    @Override
    public String toString() {
        return "Professor [codigo=" + codigo + ", nome=" + nome + "]";
    }  
}