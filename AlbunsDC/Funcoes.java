package AlbunsDC;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Funcoes {
    public static int exibirMenu(Scanner scan) {

    System.out.println("----------------------------------MENU----------------------------------");
    System.out.println("0 - Encerrar o programa.");
    System.out.println("1 - Imprimir todos os álbuns.");
    System.out.println("2 - Imprimir todos os álbuns completamente.");
    System.out.println("3 - Imprimir todas as músicas.");
    System.out.println("4 - Criar uma playlist.");
    System.out.println("5 - Visualizar todas as playlists.");
    System.out.println("6 - Tocar a intro de um álbum.");
    System.out.print("\nInforme a opção desejada para prosseguir: ");
    int opcao = scan.nextInt();
    System.out.println("-----------------------\n\n");

    limpaTela();

    return opcao;
}

//limpa tudo o que veio antes
    public static void limpaTela(){
    System.out.print("\033[H\033[2J");
    System.out.flush();
}

//conta o tempo total da playlist
    public static void contaTempo(Playlist favs){
        int PMinutos = 0;
        int PSegundos = 0;
        int PHoras = 0;

        for (Musicas song : favs.getSongs()){
            PMinutos += song.minutos; 
            PSegundos += song.segundos;

            if (PMinutos > 60){
                int contaMin = PMinutos - 60;
                
                PHoras ++;
                PMinutos = contaMin;
            }
           
            if (PSegundos > 60){
                int contaSeg =  PSegundos - 60;
                
                PMinutos ++;
                PSegundos = contaSeg;
            }
            favs.setHoras(PHoras);
            favs.setMinutos(PMinutos);
            favs.setSegundos(PSegundos);
        }
    }


//toca intro do album
    public static void playSound(String caminhoAudio) {
    try {
        File arquivoAudio = new File(caminhoAudio);
        AudioInputStream tocarMusica = AudioSystem.getAudioInputStream(arquivoAudio);
        Clip song = AudioSystem.getClip();
        song.open(tocarMusica);
        song.start();
    } catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) {
        e.printStackTrace();
    }
}
}
