package models;

import java.security.InvalidParameterException;

public class Titulo {
    
private String nome;
private int anoDeLancamento;
private Boolean incluidoNoPlano;
private double somaDasAvaliacoes;
private int totalDeAvaliacoes;
private int duracaoEmMinutos;

public void exibeFichaTecnica(){
    System.out.println(nome);
    System.out.println(anoDeLancamento);
    System.out.println(pegaMedia());
}


public double pegaMedia() {
    return (somaDasAvaliacoes / totalDeAvaliacoes) / 2 ;
}

public void avalia(double nota){
    if (nota > 10){
        System.out.println("Informe uma nota menor do que 10");
        throw new InvalidParameterException();
    }
    somaDasAvaliacoes+= nota;
    totalDeAvaliacoes++;


}


public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public int getAnoDeLancamento() {
    return anoDeLancamento;
}
public void setAnoDeLancamento(int anoDeLancamento) {
    this.anoDeLancamento = anoDeLancamento;
}
public Boolean getIncluidoNoPlano() {
    return incluidoNoPlano;
}
public void setIncluidoNoPlano(Boolean incluidoNoPlano) {
    this.incluidoNoPlano = incluidoNoPlano;
}
public double getSomaDasAvaliacoes() {
    return somaDasAvaliacoes;
}

public int getTotalDeAvaliacoes() {
    return totalDeAvaliacoes;
}

public int getDuracaoEmMinutos() {
    return duracaoEmMinutos;
}
public void setDuracaoEmMinutos(int duracaoEmMinutos) {
    this.duracaoEmMinutos = duracaoEmMinutos;
}
@Override
public String toString() {
    return "Titulo [nome=" + nome + ", anoDeLancamento=" + anoDeLancamento + ", incluidoNoPlano=" + incluidoNoPlano
            + ", somaDasAvaliacoes=" + somaDasAvaliacoes + ", totalDeAvaliacoes=" + totalDeAvaliacoes
            + ", duracaoEmMinutos=" + duracaoEmMinutos + "]";
}




}
