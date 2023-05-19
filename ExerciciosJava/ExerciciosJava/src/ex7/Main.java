package ex7;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws SaqueException {
        
        ContaCorrente contaMurilo = new ContaCorrente(new BigDecimal(100));

        contaMurilo.sacar(new BigDecimal(50));



        contaMurilo.mostraSaldo();
        
        

        

        // BigDecimal v1 = BigDecimal.ZERO;
        // BigDecimal v2 = new BigDecimal("100");
        // BigDecimal v2 = BigDecimal.ZERO;

        // System.out.println(v2.compareTo(v1));

    }

}
