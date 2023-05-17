package modelos;
public class Audio {
    
    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private double classificacao;
    
    public void curtir(){
        totalCurtidas++;
    }

    public void reproduz(){
        totalReproducoes++;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getTotalReproducoes() {
        return totalReproducoes;
    }
    public void setTotalReproducoes(int totalReproducoes) {
        this.totalReproducoes = totalReproducoes;
    }
    public int getTotalCurtidas() {
        return totalCurtidas;
    }
    public void setTotalCurtidas(int totalCurtidas) {
        this.totalCurtidas = totalCurtidas;
    }
    public double getClassificacao() {
        return classificacao;
    }
    public void setClassificacao(double classificacao) {
        this.classificacao = classificacao;
    }
    @Override
    public String toString() {
        return "Audio [titulo=" + titulo + ", duracaoMinutos=" + duracaoMinutos + ", totalReproducoes="
                + totalReproducoes + ", totalCurtidas=" + totalCurtidas + ", classificacao=" + classificacao + "]";
    }

    



}
