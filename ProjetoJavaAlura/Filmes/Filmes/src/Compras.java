public class Compras {
    
    private String produto;
    private int valor;
    public String getProduto() {
        return produto;
    }
    public void setProduto(String produto) {
        this.produto = produto;
    }
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    @Override
    public String toString() {
        return "Compras [produto=" + produto + ", valor=" + valor + "]";
    }


    

}
