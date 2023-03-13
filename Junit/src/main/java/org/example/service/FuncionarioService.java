package org.example.service;

import org.example.model.Desempenho;
import org.example.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FuncionarioService {

    public BigDecimal calcularBonus(Funcionario funcionario) {

        BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
        if (valor.compareTo(new BigDecimal("1000")) > 0) {
            valor = BigDecimal.ZERO;
        }
        return valor.setScale(2, RoundingMode.HALF_UP);

    }

    public BigDecimal reajusteSalarial(Funcionario funcionario) {

        return funcionario.getSalario().multiply(funcionario.getDesempenho().percentualReajuste());

    }

}
