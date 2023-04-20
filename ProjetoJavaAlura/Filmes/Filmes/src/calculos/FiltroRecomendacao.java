package calculos;

import models.Titulo;

public class FiltroRecomendacao {

    private String recomendacao;

    public void filtra(Classificavel classificavel){
        if(classificavel.getClassificacao() >= 4){
            System.out.println("Está entre os preferidos");
        }else {
            System.out.printf("Assistir depois, abaixo de 3 estrelas");
        }
    }


}
