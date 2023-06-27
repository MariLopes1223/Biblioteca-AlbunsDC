package AlbunsDC;

import java.util.ArrayList;
import java.util.Scanner;

public class ImprimeAlbum {
    public static void ImprimirAlbuns(Scanner scan){

        ArrayList <Album> ListaAlbum = AlbumRegistro.registrarAlbuns(); //Pega a lista de albuns a partir do arquivo "AlbumRegistro"

        int contagemAlbum = 1; //contagem para enumerar os álbuns

        System.out.println("Os álbuns são: \n\n");

        //imprime as características de cada álbum
        for (Album album : ListaAlbum) {

            ArrayList<MusicasAutorais> faixas = album.getFaixas();   //pega o Array de faixas do álbum atual
            
            System.out.println(contagemAlbum + " - " + album.nome);
            System.out.println("Faixa title: " + album.faixaTitle);
            System.out.println("O álbum possui " + album.minutos + " minutos e " + album.segundos + " segundos.");
            System.out.println("Quantidade de músicas: " + album.quantMusicas);
            System.out.println("Mês e ano de lançamento: " + album.MesAnoLancamento);
        
            //pega a classe do album atual e imprime o tipo dele
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

            contagemAlbum ++; //atualiza a contagem

            System.out.println();

            System.out.println("As músicas do álbum são: ");

        int contagemMus = 1; //contagem pra enumerar as músicas

            //imprime o nome de todas as músicas do álbum atual
            for (Musicas song: faixas){
               System.out.println(contagemMus + " - " + song.nome);
               contagemMus ++;
        }
            System.out.println("-----------------------\n\n\n\n");
        }

        Album umAlbum = ListaAlbum.get(0);   //pega o primeiro álbum do array
        ArrayList <Album> erasAlbums = umAlbum.AdicionaTrilogia(ListaAlbum);  //chama o método "AdicionaTrilogia" para descobrir quais álbuns fazem parte de uma Era ou Trilogia
        
        while (true){
            System.out.println("Digite '1' para ver quais álbuns fazem parte de uma trilogia ou era \nCaso queira encerrar a visualização de albuns, clique em qualquer tecla.");
            int opcao = scan.nextInt();

            if (opcao == 1){

                System.out.println("\n\n\n\nOs álbuns pertencentes a uma era ou trilogia são:\n");

                //imprime os nomes dos álbuns resultantes da chamada "AdicionaTrilogia"
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
                break;
            }
            else break;
        }

        System.out.println("Visualização de álbuns encerrada.");
        scan.nextLine();
    }

    //imprime somente o nome de todos os albuns
    public static void ImprimirAlbuns(ArrayList <Album> ListaAlbum){

        int contagem = 1;

        for (Album album : ListaAlbum){
            System.out.println(contagem + " - " + album.nome);
            contagem ++;
        }

    }
}
