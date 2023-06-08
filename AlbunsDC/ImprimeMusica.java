package AlbunsDC;

import java.util.ArrayList;

public class ImprimeMusica {
    public static void imprimirMusica (ArrayList <Album> ListaAlbum){

        int contagem = 1;
        ArrayList<Musica> todasAsMusicas = new ArrayList<>();

        for (Album album : ListaAlbum){
        ArrayList <Musica> faixas = album.getFaixas();
        todasAsMusicas.addAll(faixas);
        }

        for (Musica song : todasAsMusicas){

            System.out.println(contagem + " - " + song.nome);
            System.out.println("O música possui " + song.minutos + " minutos e " + song.segundos + " segundos.");

            System.out.print("A música possui MV?: ");
            if (song.MV){
                System.out.println("Sim");
            }
            else{
                System.out.println("Não");
            }
            System.out.print("A música é japonesa?: ");
            if (song.japonesa){
                System.out.println("Sim");
            }
            else{
                System.out.println("Não");
            }
        
            System.out.println("-----------------------\n");

            contagem ++;
    
        }
    }
}
