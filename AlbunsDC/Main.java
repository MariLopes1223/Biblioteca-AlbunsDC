package AlbunsDC;

import java.util.ArrayList;

public class Main {
    public static void main (String [] args){
        ArrayList <Album> ListaAlbum = AlbumRegistro.registrarAlbuns();

        for (Album album : ListaAlbum) {
            System.out.println("Nome: " + album.nome);
            System.out.println("Faixa title: " + album.faixaTitle);
            System.out.println("O álbum possui " + album.minutos + " minutos e " + album.segundos + " segundos.");
            System.out.println("Quantidade de músicas: " + album.quantMusicas);
            System.out.println("Mês e ano de lançamento: " + album.MesAnoLancamento);
        
            switch(album.getClass().getSimpleName()){
                case "FullAlbum": 
                System.out.println("Tipo: Full Album");
                break;

                case "MiniAlbum":
                System.out.println("Tipo: Mini Album");
                break;

                case "Single":
                System.out.println("Tipo: Single");
                break;
            }

            System.out.println("\n");

            System.out.println("As músicas do álbum são: ");

        ArrayList<Musica> faixas = album.faixas;

        int contagem = 1;

            for (Musica song: faixas){
               System.out.println(contagem + " - " + song.nome);
               contagem ++;
        }
            
            System.out.println("-----------------------\n\n\n\n");
        }

        
        Album umAlbum = ListaAlbum.get(0);
        ArrayList <Album> erasAlbums = umAlbum.AdicionaTrilogia(ListaAlbum);

        System.out.println("\n\n\n\nOs álbuns pertencentes a uma era ou trilogia são:\n");

        for (Album eras : erasAlbums){
            System.out.println("Nome: " + eras.nome);

            switch(eras.getClass().getSimpleName()){
                case "FullAlbum": 
                System.out.println("Tipo: Full Album");
                break;

                case "MiniAlbum":
                System.out.println("Tipo: Mini Album");
                break;

                case "Single":
                System.out.println("Tipo: Single");
                break;
            }
            System.out.println("-----------------------\n");
        }
    }

}
    
        