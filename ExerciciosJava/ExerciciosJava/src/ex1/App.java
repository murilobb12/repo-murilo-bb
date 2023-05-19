package ex1;
/*
 * Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int idadeEmDias = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade em ano, meses e dias, separada por virgulas");
        String idade = sc.next();
        String[] split = idade.split(",");

        int anos = Integer.parseInt(split[0]) * 365;
        int meses = Integer.parseInt(split[1]) * 30;
        int dias = Integer.parseInt(split[2]);

        idadeEmDias = anos + meses + dias;

        System.out.println(idadeEmDias);


        
    }
}
