package calculos;

import models.Filme;
import models.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public void inclui(Titulo titulo){
        tempoTotal += titulo.getDuracaoEmMinutos();
    }

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void setTempoTotal(int tempoTotal) {
        this.tempoTotal = tempoTotal;
    }
}
