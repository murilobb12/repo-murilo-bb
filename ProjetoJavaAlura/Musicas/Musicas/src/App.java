import modelos.Musica;
import modelos.Pordcast;

public class App {
    public static void main(String[] args) throws Exception {
        
        Musica audio = new Musica();

        audio.setTitulo("Blow!");

        for (int i = 0; i < 505; i++) {
            audio.reproduz();
        }

        for (int i = 0; i < 505; i++) {
            audio.curtir();
        }


        System.out.println(audio.getClassificacao());

        Pordcast pordcast = new Pordcast();

        pordcast.setTitulo("Blow!");

        for (int i = 0; i < 505; i++) {
            pordcast.reproduz();
        }

        for (int i = 0; i < 505; i++) {
            pordcast.curtir();
        }

        System.out.println(pordcast.getClassificacao());

    }
}
