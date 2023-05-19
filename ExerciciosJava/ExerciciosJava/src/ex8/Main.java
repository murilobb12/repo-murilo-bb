package ex8;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        
        Funcionario murilo = new Funcionario("Murilo",new BigDecimal("7350.00"));

        murilo.exibeDados();

        Assistente anaryel = new Assistente("Anaryel", new BigDecimal(2000), 1);

        anaryel.exibeDados();

        Tecnico gilson = new Tecnico("Gilson", new BigDecimal("7350.00"), 2);

        gilson.exibeDados();


    }
}
