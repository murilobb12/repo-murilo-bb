import java.text.CollationElementIterator;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UsandoHashMap {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        Cartao cartao = new Cartao(1000);

        

        int saida = 1;
        while(saida != 0){

            Compras compras = new Compras();

            System.out.println("Digite o produto que deseja comprar: ");
            compras.setProduto(sc.next());

            System.out.println("Digite o valor do produto que deseja comprar: ");
            compras.setValor(sc.nextInt());

            if(cartao.lancarCompra(compras)){
                System.out.println("Deseja adicionar mais itens? Digite 0 para sair");
                saida = sc.nextInt();

            }else{
                saida = 0;
            };





        }

        

        System.out.println(cartao.getListaCompras());

        

    }

}
