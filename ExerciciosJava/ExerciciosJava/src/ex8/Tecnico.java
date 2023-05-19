package ex8;

import java.math.BigDecimal;

public class Tecnico extends Assistente{
    
    public Tecnico(String nome, BigDecimal salario, int numeroMatricula) {
        super(nome, salario, numeroMatricula);
        
    }

    BigDecimal ganhoAnual(){
        return this.getSalario().add(new BigDecimal(200).multiply(new BigDecimal(12)));
        // return this.getSalario().add(new BigDecimal(200)).multiply(new BigDecimal(12));
    }

}
