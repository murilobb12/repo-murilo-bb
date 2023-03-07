package br.com.murilo.model.dto;

import br.com.murilo.pessoa.Pessoa;

public class IncluirPessoaDTO {


    private String nome;

    private Pessoa.Tipo tipo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa.Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Pessoa.Tipo tipo) {
        this.tipo = tipo;
    }
}
