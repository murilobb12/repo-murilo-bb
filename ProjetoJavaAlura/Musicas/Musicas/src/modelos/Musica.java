package modelos;


public class Musica extends Audio{

    private String album;
    private String artista;
    private String genero;

    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    @Override
    public String toString() {
        return "Musica [album=" + album + ", artista=" + artista + ", genero=" + genero + "]";
    }

    @Override
    public double getClassificacao(){
        if(this.getTotalCurtidas() > 500){
            return 10;
        }else{
            return 5;
        }

    }

    


    
}
