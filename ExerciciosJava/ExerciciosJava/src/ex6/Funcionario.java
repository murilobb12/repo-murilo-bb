package ex6;

import java.math.RoundingMode;
import java.time.LocalDate;

public class Funcionario {

    String nome;
    double salario;
    LocalDate dataAdmissao;


    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return Math.round(salario);
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }
    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", salario=" + Math.round(salario) + ", dataAdmissao=" + dataAdmissao + "]";
    }

    


}