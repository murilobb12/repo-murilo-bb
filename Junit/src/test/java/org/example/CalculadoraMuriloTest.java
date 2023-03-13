package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalculadoraMuriloTest {


    @Test
    public void somarDoisNumerosPositivosTest(){

        CalculadoraMurilo calculadoraMurilo = new CalculadoraMurilo();

        int somar = calculadoraMurilo.somar(3, 7);

        Assertions.assertEquals(10, somar);

    }


}
