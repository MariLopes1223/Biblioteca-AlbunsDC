package AlbunsDC;

import java.util.ArrayList;
import java.util.Scanner;

public class ImprimeMusica {
    public static void imprimirMusica (ArrayList <Album> ListaAlbum, Scanner scan){

        int contagem = 1;
        
        ArrayList<MusicasAutorais> todasAsMusicas = AllSongsDC.TodaAsMusicas(ListaAlbum);

        //imprime todas as musicas autorais
        for (MusicasAutorais song : todasAsMusicas){

            System.out.println(contagem + " - " + song.nome);
            System.out.println("A música possui " + song.minutos + " minutos e " + song.segundos + " segundos.");

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
        
            System.out.println("-----------------------\n\n");

            contagem ++;
    
        }

        System.out.println("As músicas autorais foram imprimidas.\n");
        scan.nextLine();
        System.out.println("-----------------------\n\n\n");

        ArrayList<Cover> TodosCovers = CoverRegistro.registraCover();

        contagem = 1;

        //imprime todos os covers
        for (Cover cover : TodosCovers){
            System.out.println(contagem + " - " + cover.nome);
            System.out.println("O cover possui " + cover.minutos + " minutos e " + cover.segundos + " segundos.");
            System.out.println("O cover foi feito por " + cover.integrantes);
            System.out.println("A música original é cantada por " + cover.cantorOriginal + "\n");
            System.out.println("-----------------------\n\n");

            contagem ++;
        }
        
        
        System.out.println("Os covers foram imprimidos.\n");

        System.out.println("Todas as músicas foram imprimidas.");
        scan.nextLine();
        Funcoes.limpaTela();
    }

    //imprime somente o nome de todas as musicas autorais e covers
    public static void ImprimeNomeMus (ArrayList <Album> ListaAlbum){
        int contagem = 1;
        
        ArrayList <MusicasAutorais> todasAsMusicas = AllSongsDC.TodaAsMusicas(ListaAlbum);
        ArrayList <Cover> todosCovers = CoverRegistro.registraCover();

        for (Musicas song : todasAsMusicas){
            System.out.println(contagem + " - " + song.nome);
            contagem ++;  
        }

        for (Cover cover : todosCovers){
            System.out.println(contagem + " - " + cover.nome);
            contagem ++;
        }
    }
}
