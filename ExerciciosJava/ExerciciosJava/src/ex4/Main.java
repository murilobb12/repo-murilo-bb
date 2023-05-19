package ex4;

import java.util.Scanner;

/*
 * Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
antecessor e seu sucessor.
 */

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro:");
        int numero = sc.nextInt();

        System.out.println("O antecessor do número é: " + (numero-1));
        System.out.println("O sucessor do número é: " + (numero+1));



    }
}
