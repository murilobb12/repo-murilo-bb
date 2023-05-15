import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.sql.rowset.serial.SerialArray;

import models.Episodio;
import models.Filme;
import models.Serie;
import models.Titulo;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite o valor que deseja passar, para realizar a validação: ");
        int num = sc.nextInt();

        if(num <= 0){
            System.out.println("Por favor informar um número maior que 0! ");
            throw new MyException(null);
        }


        if(num%2==0){
            System.out.println("O número é par, e ele elevado ao quadrado é: " +  Math.pow(num, 2));
        }else{
            System.out.println("O número é impar, e ele elevado ao cubo é: " + Math.pow(num, 3));
        }




    }
}
