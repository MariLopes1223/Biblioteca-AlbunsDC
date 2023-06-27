package AlbunsDC;

import java.util.ArrayList;

public class ImprimirPlaylist {
    public static void imprimePlaylist (ArrayList <Playlist> todasPlaylists){

        int contagem = 1;

        if (todasPlaylists.isEmpty()){
            System.out.println("Você ainda não criou nenhuma playlist.");
        }
        else System.out.println("A playlists criadas são: ");


        for (Playlist lista : todasPlaylists){
            System.out.println(contagem + " - " + lista.getNome());

            System.out.println("Duração - " + lista.getHoras() + ":" + lista.getMinutos() + ":" + lista.getSegundos());

            System.out.println("\nMúsicas: \n");

            int contMusica = 1;

            for (Musicas musica : lista.getSongs()){
            System.out.println(contMusica + " - " + musica.nome);
            contMusica ++;                
            }

            System.out.println("\n-----------------------\n");

            contagem ++;
        }
    }
}
