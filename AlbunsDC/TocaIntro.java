package AlbunsDC;

import java.util.ArrayList;
import java.util.Scanner;


public class TocaIntro {
    public static void TocarIntro(ArrayList <Album> ListaAlbum, Scanner scan){

        ArrayList <Album> albumComIntro = new ArrayList<>();
        ArrayList <MusicasAutorais> Intros = new ArrayList<>();

        System.out.println("\nOs álbuns que possuem intro são:");

        int contagem = 1;
        for (Album album : ListaAlbum){
            ArrayList <MusicasAutorais> faixas = album.getFaixas();
                if (faixas.get(0).minutos < 2){
                    System.out.println("\n" + contagem + " - " + album.nome);
                    albumComIntro.add(album);
                    Intros.add(faixas.get(0));
                    contagem++;
                }
                
        }

        System.out.println("\nInforme o álbum que você deseja escutar a intro:");
        int escolhaAlbum = scan.nextInt();
        String nomeIntro;
        contagem = 1;

        for (Album albumIntro : albumComIntro){

            if (escolhaAlbum == contagem){
                ArrayList <MusicasAutorais> faixas = albumIntro.getFaixas();
                nomeIntro = faixas.get(0).nome;
                switch (nomeIntro){
                    case "Welcome To Dream":
                    String caminhoNM = "AlbunsDC\\Intros\\Nightmare-Intro.wav";
                    Funcoes.playSound(caminhoNM);
                    break;

                    case "My Toys":
                    String caminhoFAITM = "AlbunsDC\\Intros\\FAITM-Intro.wav";
                    Funcoes.playSound(caminhoFAITM);
                    break;

                    case "Before & After (Intro)":
                    String caminhoPrequel = "AlbunsDC\\Intros\\Prequel-Intro.wav";
                    Funcoes.playSound(caminhoPrequel);
                    break;

                    case "Inside - Outside (Intro)":
                    String caminhoETE = "AlbunsDC\\Intros\\ETE-Intro.wav";
                    Funcoes.playSound(caminhoETE);
                    break;

                    case "Intro - Alone":
                    String caminhoAITC = "AlbunsDC\\Intros\\AITC-Intro.wav";
                    Funcoes.playSound(caminhoAITC);
                    break;

                    case "Intro (Intro)":
                    String caminhoTEOTN = "AlbunsDC\\Intros\\TEOTN-Intro.wav";
                    Funcoes.playSound(caminhoTEOTN);
                    break;

                    case "Intro - Breaking":
                    String caminhoTBOTE = "AlbunsDC\\Intros\\TBOTE-Intro.wav";
                    Funcoes.playSound(caminhoTBOTE);
                    break;

                    case "Intro - Deja Vu":
                    String caminhoROD = "AlbunsDC\\Intros\\ROD-Intro.wav";
                    Funcoes.playSound(caminhoROD);
                    break;

                    case "Intro - Scream":
                    String caminhoDTTOL = "AlbunsDC\\Intros\\DTTOL-Intro.wav";
                    Funcoes.playSound(caminhoDTTOL);
                    break;

                    case "Intro - Lose":
                    String caminhoDLM = "AlbunsDC\\Intros\\DLM-Intro.wav";
                    Funcoes.playSound(caminhoDLM);
                    break;

                    case "Intro - ODD":
                    String caminhoDRTU = "AlbunsDC\\Intros\\DRTU-Intro.wav";
                    Funcoes.playSound(caminhoDRTU);
                    break;

                    case "Intro - Summer":
                    String caminhoSH = "AlbunsDC\\Intros\\SH-Intro.wav";
                    Funcoes.playSound(caminhoSH);
                    break;

                    case "Intro: Save Us":
                    String caminhoASU = "AlbunsDC\\Intros\\ASU-Intro.wav";
                    Funcoes.playSound(caminhoASU);
                    break;

                    case "Intro: Chaotical X":
                    String caminhoAFU = "AlbunsDC\\Intros\\AFU-Intro.wav";
                    Funcoes.playSound(caminhoAFU);
                    break;

                    case "Intro: From Us":
                    String caminhoAFrU = "AlbunsDC\\Intros\\AFrU-Intro.wav";
                    Funcoes.playSound(caminhoAFrU);
                    break;

                }
            }
            contagem++;
        }
    }
}
