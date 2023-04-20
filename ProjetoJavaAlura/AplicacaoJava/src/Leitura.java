import java.util.*;

public class Leitura {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double saldo = 0;

        double valorRecebido;

        double valorTransferencia;

        int opcao = -1;

        while (opcao != 4) {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Digite a opção desejada: ");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Receber Valor");
            System.out.println("3 - Transferir Valor");
            System.out.println("4 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo é de: " + saldo);
                    if (continuar()) {

                        break;
                    } else {
                        opcao = 4;
                        break;
                    }
                case 2:
                    System.out.println("Digite o valor recebido: ");
                    valorRecebido = sc.nextDouble();
                    saldo += valorRecebido;
                    System.out.println("Saldo atualizado: " + saldo);
                    if (continuar()) {
                        break;
                    } else {
                        opcao = 4;
                        break;
                    }
                case 3:
                    System.out.println("Digite o valor que irá transferir: ");
                    valorTransferencia = sc.nextDouble();
                    if (saldo > valorTransferencia) {
                        saldo -= valorTransferencia;
                        System.out.println("Saldo atualizado: " + saldo);
                    } else {
                        System.out.println("Valor para transferência maior que o seu saldo.");
                    }
                    if (continuar()) {
                        break;
                    } else {
                        opcao = 4;
                        break;
                    }
                case 4:
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;

            }

        }

    }

    public static Boolean continuar() {
        Scanner sc = new Scanner(System.in);
        String desejaContinuar;
        System.out.println("Deseja continuar? (s ou n) ");
        desejaContinuar = sc.next();
        switch (desejaContinuar.toLowerCase()) {
            case "s":
                return true;
            case "n":
                return false;
            default:
                System.out.println("Opção inválida!");
                return false;
        }
    }

}
