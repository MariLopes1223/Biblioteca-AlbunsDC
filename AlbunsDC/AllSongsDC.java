package AlbunsDC;

import java.util.ArrayList;

public class AllSongsDC {
    public static ArrayList <MusicasAutorais> TodaAsMusicas (ArrayList <Album> ListaAlbum){
        
        ArrayList<MusicasAutorais> allSongs = new ArrayList<>();

        //adiciona todas as faixas de todos os albuns a um único arraylist
        for (Album album : ListaAlbum){
        ArrayList <MusicasAutorais> faixas = album.getFaixas();
        allSongs.addAll(faixas);
        }

        return allSongs;
    }
}
