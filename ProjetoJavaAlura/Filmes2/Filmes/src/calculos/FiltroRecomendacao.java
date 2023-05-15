package calculos;

public class FiltroRecomendacao {

    private String recomendacao;

    public void filtra(Clasificavel clasificavel){
        if(clasificavel.getClassificacao() >= 4){
            System.out.println("Está entre os preferidos!");
        }else{
            System.out.println("Assistir depois, abaixo de 3 estrelas");
        }
    }
    
}
