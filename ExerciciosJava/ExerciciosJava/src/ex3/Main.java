package ex3;

import java.util.Scanner;

/*
 * Informar um saldo e imprimir o saldo com reajuste de 1%.
 */
public class Main {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu salário: ");
        double salario = sc.nextDouble();

        double salarioReajuste = salario * 1.01;

        System.out.println("Seu salário com reajuste de 1% é de: " + salarioReajuste);
        

    }

}