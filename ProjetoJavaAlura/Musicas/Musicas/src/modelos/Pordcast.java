package modelos;
public class Pordcast extends Audio{

    private String host;
    private String descricao;
    public String getHost() {
        return host;
    }
    public void setHost(String host) {
        this.host = host;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    @Override
    public String toString() {
        return "Pordcast [host=" + host + ", descricao=" + descricao + "]";
    }
    
    @Override
    public double getClassificacao(){
        if (getTotalCurtidas() > 500){
            return 10;
        }else{
            return 5;
        }

    }
    
    
}
