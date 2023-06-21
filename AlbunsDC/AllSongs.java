package AlbunsDC;

import java.util.ArrayList;

public class AllSongs {
    public static ArrayList <Musica> TodaAsMusicas (ArrayList <Album> ListaAlbum){
        
        ArrayList<Musica> allSongs = new ArrayList<>();

        for (Album album : ListaAlbum){
        ArrayList <Musica> faixas = album.getFaixas();
        allSongs.addAll(faixas);
        }

        return allSongs;
    }
}
