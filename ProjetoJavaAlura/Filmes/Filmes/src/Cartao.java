import java.util.ArrayList;
import java.util.List;

public class Cartao {
    
    private int limite;
    private int saldo;
    private List<Compras> listaCompras;

    public boolean lancarCompra(Compras compra){
        if(this.saldo > compra.getValor()){
            this.saldo-=compra.getValor();
            this.listaCompras.add(compra);

            return true;
        }else{
            System.out.println("Seu saldo é menor que o disponivel");
            return false;
        }
    }
    
    
    public Cartao(int limite) {
        this.limite = limite;
        this.saldo = limite;
        this.listaCompras = new ArrayList<>();
    }
    public int getLimite() {
        return limite;
    }
    public void setLimite(int limite) {
        this.limite = limite;
    }
    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public List<Compras> getListaCompras() {
        return listaCompras;
    }
    public void setListaCompras(List<Compras> listaCompras) {
        this.listaCompras = listaCompras;
    }

    



}
