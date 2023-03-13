package org.example.model;

import org.example.service.FuncionarioService;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario extends FuncionarioService {


    private String nome;

    private LocalDate dataAdmissao;

    private BigDecimal salario;

    private Desempenho desempenho;

    public Funcionario(String nome, LocalDate dataAdmissao, BigDecimal salario) {
        this.nome = nome;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }

    public Desempenho getDesempenho() {
        return desempenho;
    }

    public void setDesempenho(Desempenho desempenho) {
        this.desempenho = desempenho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", dataAdmissao=" + dataAdmissao +
                ", salario=" + salario +
                '}';
    }


}
