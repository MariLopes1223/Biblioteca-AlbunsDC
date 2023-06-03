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
            System.out.println("-----------------------\n");
        }
    }
}
