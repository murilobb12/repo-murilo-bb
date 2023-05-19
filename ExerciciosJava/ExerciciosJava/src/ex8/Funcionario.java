package ex8;

import java.math.BigDecimal;

public class Funcionario {
    
    private String nome;
    private BigDecimal salario;

    

    public Funcionario(String nome, BigDecimal salario){
        this.nome = nome;
        this.salario = salario;
    }

    void addAumento(BigDecimal aumento){
        this.salario = this.salario.add(aumento);
    }

    BigDecimal ganhoAnual(){
        return this.salario.multiply(new BigDecimal(12));
    }

    void exibeDados(){
        System.out.println("_______________________");
        System.out.println("Nome: " + nome);
        System.out.println("Salario = " + salario);
        System.out.println("Ganho anual: " + ganhoAnual());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    

}
