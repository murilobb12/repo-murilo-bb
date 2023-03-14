package br.com.murilo.model;

import javax.persistence.*;

@Table(name = "FRUTA")
@Entity(name = "FRUTA")
public class Fruta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Long peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getPeso() {
        return peso;
    }

    public void setPeso(Long peso) {
        this.peso = peso;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Fruta(String nome, Long peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public Fruta(Long id, String nome, Long peso) {
        this.id = id;
        this.nome = nome;
        this.peso = peso;
    }

    public Fruta() {
    }


}
