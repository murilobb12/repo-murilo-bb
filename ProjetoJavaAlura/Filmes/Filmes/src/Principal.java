import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import calculos.Classificavel;
import calculos.FiltroRecomendacao;
import models.Filme;
import models.Serie;
import models.Titulo;

public class Principal {

    public static void main(String[] args) {

        Serie serie1 = new Serie("Naruto", 2005);
        serie1.avalia(5);
        serie1.avalia(1);


        Filme filme1 = new Filme("Avatar", 2010);
        filme1.avalia(10);
        filme1.avalia(8);

        Filme filme2 = new Filme("Poderoso Chefao", 1995);
        filme2.avalia(0);

        Filme filme3 = new Filme("Ragnarok", 2019);

        ArrayList<Filme> filmes = new ArrayList<>();
        filmes.add(filme1);
        filmes.add(filme2);
        filmes.add(filme3);

        ArrayList<Serie> series = new ArrayList<>();
        series.add(serie1);

        ArrayList<Titulo> titulos = new ArrayList<>();
        titulos.add(filme1);
        titulos.add(filme2);
        titulos.add(serie1);

        for (Titulo titulo : titulos) {
            if (titulo instanceof Filme) {
                Filme filme = (Filme) titulo;
                if(filme.getClassificacao() > 2){
                System.out.println(filme.getClassificacao());
                }
            }else{
                Serie serie = (Serie) titulo;
                System.out.println(serie.getClassificacao());
            }

        }

        ArrayList<String> listaNomes = new ArrayList<>();
        listaNomes.add("Murilo");
        listaNomes.add("Marcela");
        listaNomes.add("Nary");

        Collections.sort(titulos);
        titulos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));

    }


    


    

}