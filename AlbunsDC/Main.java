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
        scan.nextLine();

        Funcoes.limpaTela();

        ArrayList <Playlist> todasPlaylists = new ArrayList<>();

        while (true){

            int opcao = Funcoes.exibirMenu(scan);
            
            if (opcao == 1){
                ImprimeAlbum.ImprimirAlbuns(ListaAlbum); // imprime o nome de todos os albuns
            }
            else if (opcao == 2){
                ImprimeAlbum.ImprimirAlbuns(scan); //imprime todos os albuns
            }
            else if (opcao == 3){
                System.out.println("\n");
                ImprimeMusica.imprimirMusica(ListaAlbum, scan); //imprime todas as músicas
            }       
            else if (opcao == 4){
                todasPlaylists.add(CriarPlaylist.CriaPlaylist(user, scan)); //cria playlist
            }
            else if (opcao == 5){
                ImprimirPlaylist.imprimePlaylist(todasPlaylists); //imprime o nome e a duração de todas as playlists
            }
            else if (opcao == 6){
                TocaIntro.TocarIntro(ListaAlbum, scan); //toca intro escolhida pelo usuário
            }
            else {
                System.out.println("Programa encerrado.");
                System.exit(0);
            }
    }

}
}


    
        