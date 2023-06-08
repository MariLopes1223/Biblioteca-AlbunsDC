package AlbunsDC;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String [] args){ 
       ArrayList <Album> ListaAlbum = AlbumRegistro.registrarAlbuns(); //Pega a lista de albuns a partir do arquivo "AlbumRegistro"

        Scanner scan = new Scanner(System.in);

        System.out.print("Bem-vindo(a) a biblioteca de albuns do Dreamcatcher. Faça seu cadastro para poder ter acesso. Clique em qualquer tecla para continuar.");
        scan.nextLine();

        //pegando as informações do usuário e fazendo o cadastro
        Usuario user = new Usuario();
        System.out.print("Informe seu nome: ");
        user.setNome(scan.nextLine());
        System.out.print("Informe sua bias no grupo: ");
        user.setBias(scan.nextLine());
        System.out.print("Sua title favorita: ");
        user.setTitleFav(scan.nextLine());
        System.out.print("Sua bside favorita: ");
        user.setBsideFav(scan.nextLine());
        System.out.print("Seu album preferido: ");
        user.setAlbumFav(scan.nextLine());

        System.out.println("\n");

        while (true){

            System.out.println("Para ver os álbuns e suas respectivas músicas digite 1, para ver apenas as músicas, digite 2. Para sair clique em qualquer tecla.");
            String opcao = scan.next();
            
            if (opcao.equals("1")){
                ImprimeAlbum.ImprimirAlbuns(); //imprime todos os albuns
            }
            else if (opcao.equals("2")){
                System.out.println("\n");
                ImprimeMusica.imprimirMusica(ListaAlbum); //imprime todas as músicas
            }
            else break;
        }

        System.out.println(user.getNome() + ", você deseja criar uma playlist? Clique 1 se sim, caso deseje encerrar o programa, clique em qualquer tecla.");
        String playlist = scan.nextLine();

            if (playlist.equals("1")){
                Playlist favs = new Playlist();
            }

        scan.close();
    }
}
    
        