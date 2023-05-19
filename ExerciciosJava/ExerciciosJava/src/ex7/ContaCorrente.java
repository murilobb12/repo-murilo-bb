package ex7;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ContaCorrente {

    private BigDecimal saldo;

    public ContaCorrente(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public ContaCorrente(){
        
    }

    public void depositar(BigDecimal valorDeposito) {
        saldo = saldo.add(valorDeposito);
    }

    public void sacar(BigDecimal valorSaque) throws SaqueException {
        BigDecimal taxa = new BigDecimal(1.01);

        if (valorSaque.compareTo(saldo)>=0) {
            System.out.println("Impossível realizar o saque. Valor de saque é maior que o saldo da conta.");
        } else {
            valorSaque = valorSaque.multiply(taxa);
            saldo = saldo.subtract(valorSaque);

        }
    }

    public void mostraSaldo(){
        System.out.println(saldo.setScale(2, RoundingMode.HALF_UP));
    }

    @Override
    public String toString() {
        return "ContaCorrente [saldo=" + saldo + "]";
    }

}
