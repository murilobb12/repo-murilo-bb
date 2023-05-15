package models;

import calculos.Clasificavel;

public class Episodio implements Clasificavel{

    private int numero;

    private String nome;

    private Serie serie;

    private int totalVisualizacoes;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    @Override
    public int getClassificacao() {

        if (totalVisualizacoes > 100){
            return 4;
        }else{
            return 2;
        }

    }

    @Override
    public String toString() {
        return "Episodio [numero=" + numero + ", nome=" + nome + ", serie=" + serie + ", totalVisualizacoes="
                + totalVisualizacoes + "]";
    }

    
    

    
}
