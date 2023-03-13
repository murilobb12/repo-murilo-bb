package org.example.service;

import org.example.model.Desempenho;
import org.example.model.Funcionario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.InvalidParameterException;
import java.time.LocalDate;

public class FuncionarioServiceTest {

    FuncionarioService service = new FuncionarioService();

    @Test
    public void calcularBonusFuncionarioBonusMenorQueMilTest() {

        Funcionario funcionario = new Funcionario("Murilo", LocalDate.now(), new BigDecimal("5000"));

        BigDecimal bonus = service.calcularBonus(funcionario);

        Assertions.assertEquals(new BigDecimal("500.00"), bonus);


    }

    @Test
    public void calcularBonusFuncionarioBonusMaiorQueMilTest() {
        Funcionario funcionario = new Funcionario("Murilo", LocalDate.now(), new BigDecimal("50000"));

        BigDecimal bonus = service.calcularBonus(funcionario);

        Assertions.assertEquals(BigDecimal.ZERO.setScale(2, RoundingMode.HALF_UP), bonus);
    }

    @Test
    public void calcularBonusFuncionarioComSalarioExatamenteIgualAMargemDeBonificacaoTest() {
        Funcionario funcionario = new Funcionario("Murilo", LocalDate.now(), new BigDecimal("10000"));

        BigDecimal bonus = service.calcularBonus(funcionario);

        Assertions.assertEquals(new BigDecimal("1000.00"), bonus);

    }

    @Test
    public void reajusteSalarialDesempenhoADesejarTest() {

        Funcionario funcionario = new Funcionario("Murilo", LocalDate.now(), new BigDecimal("10000"));
        funcionario.setDesempenho(Desempenho.A_DESEJAR);

        BigDecimal reajuste = service.reajusteSalarial(funcionario);

        Assertions.assertEquals(new BigDecimal("300.00"), reajuste);

    }

    @Test
    public void reajusteSalarialDesempenhoBomTest() {

        Funcionario funcionario = new Funcionario("Murilo", LocalDate.now(), new BigDecimal("10000"));
        funcionario.setDesempenho(Desempenho.BOM);

        BigDecimal reajuste = service.reajusteSalarial(funcionario);

        Assertions.assertEquals(new BigDecimal("1500.00"), reajuste);

    }

    @Test
    public void reajusteSalarialDesempenhoOtimoTest() {

        Funcionario funcionario = new Funcionario("Murilo", LocalDate.now(), new BigDecimal("10000"));
        funcionario.setDesempenho(Desempenho.OTIMO);

        BigDecimal reajuste = service.reajusteSalarial(funcionario).setScale(2,RoundingMode.HALF_UP);

        Assertions.assertEquals(new BigDecimal("2000.00"), reajuste);

    }

    @Test
    public void reajusteSalarialFuncionarioSemDesempenho() {

        Funcionario funcionario = new Funcionario("Murilo", LocalDate.now(), new BigDecimal("100000"));
        funcionario.setDesempenho(null);

        Assertions.assertThrows(NullPointerException.class, ()-> service.reajusteSalarial(funcionario));
    }


}
