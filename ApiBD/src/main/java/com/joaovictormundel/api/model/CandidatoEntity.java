package com.joaovictormundel.api.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "candidato")
public class CandidatoEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "partido")
    private String partido;
    @Column(name = "idade")
    private Integer idade;
    @Column(name = "nota")
    private float nota;

    public CandidatoEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "CandidatoEntity{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", partido='" + partido + '\'' +
                ", idade=" + idade +
                ", nota=" + nota +
                '}';
    }
}
