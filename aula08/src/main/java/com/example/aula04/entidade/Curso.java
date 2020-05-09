package com.example.aula04.entidade;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.UniqueConstraint;

@Entity
public class Curso implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nome;
    private int cargaHoraria;

    @OneToMany
    @JoinColumn(name = "ID_CURSO")
    private List<Aluno> alunos;

    @ManyToMany
    @JoinTable(
        name="CursosProfessores", 
        uniqueConstraints = @UniqueConstraint(columnNames = { "codigo_professor", "id_curso" }),
        joinColumns        = @JoinColumn(name = "id_curso"), 
        inverseJoinColumns = @JoinColumn(name = "codigo_professor")
    )
    private List<Professor> professores;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    @Override
    public String toString() {
        return "nomeCurso [cargaHoraria=" + cargaHoraria + ", id=" + id + ", nomeCurso=" + nome + "]";
    }
}