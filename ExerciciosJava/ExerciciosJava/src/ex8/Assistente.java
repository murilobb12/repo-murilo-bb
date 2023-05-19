package ex8;

import java.math.BigDecimal;

public class Assistente extends Funcionario{

    private int numeroMatricula;

    void exibeDados(){
        super.exibeDados();
        System.out.println("Número matrícula: " + numeroMatricula);
    }
    

    public Assistente(String nome, BigDecimal salario, int numeroMatricula) {
        super(nome, salario);
        this.numeroMatricula = numeroMatricula;
        
    }



    public int getNumeroMatricula() {
        return numeroMatricula;
    }



    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }


    
}
