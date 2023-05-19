package ex5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        
        System.out.println("Digite os números que deseja somar, caso queira parar a soma, digite o sinal de igual(=)");
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        String saida = "!";
        while(!saida.equals("=")){

            System.out.println("Digite um número");
            int numero = sc.nextInt();
            if(numero < 0){
                saida = "=";
            }else{
                soma+=numero;
            }


        }




        System.out.println(soma);
        

    }

}
