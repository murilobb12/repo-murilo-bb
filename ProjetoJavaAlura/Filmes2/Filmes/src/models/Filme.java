package models;

import calculos.Clasificavel;


public class Filme extends Titulo implements Clasificavel{

    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public String toString() {
        return "Filme [diretor=" + diretor + "]";
    }

    @Override
    public int getClassificacao() {
        
    return (int) pegaMedia() / 2;
        
    }

    


}
