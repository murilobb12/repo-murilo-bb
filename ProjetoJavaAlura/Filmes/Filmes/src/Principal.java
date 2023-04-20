import calculos.Classificavel;
import calculos.FiltroRecomendacao;
import models.Filme;
import models.Serie;
import calculos.CalculadoraDeTempo;

public class Principal {

    public static void main(String[] args) {

        Filme filme = new Filme();
        Filme filme2 = new Filme();

        Serie serie = new Serie();
        Serie serie2 = new Serie();

        filme.avalia(10);

        System.out.println(filme.getClassificacao());

        FiltroRecomendacao filtro = new FiltroRecomendacao();

        filtro.filtra(filme);


    }

}