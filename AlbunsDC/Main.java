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

            int opcao = exibirMenu(scan);
            
            if (opcao == 1){
                ImprimeAlbum.ImprimirAlbuns(); //imprime todos os albuns
            }
            else if (opcao == 2){
                System.out.println("\n");
                ImprimeMusica.imprimirMusica(ListaAlbum); //imprime todas as músicas
            }       
            else if (opcao == 3){
                CriarPlaylist.CriaPlaylist(user); //cria playlist
            }
            else {
                System.out.println("Programa encerrado.");
                System.exit(0);
            }
    }
}
    private static int exibirMenu(Scanner scan) {

    System.out.println("----------------------------------MENU----------------------------------");
    System.out.println("0 - Encerrar o programa.");
    System.out.println("1 - Imprimir todos os álbuns.");
    System.out.println("2 - Imprimir todas as músicas.");
    System.out.println("3 - Criar uma playlist.");
    System.out.println("4 - Visualizar todas as playlists. \n");
    System.out.print("Informe a opção desejada para prosseguir: ");
    int opcao = scan.nextInt();
    System.out.println("-----------------------\n\n");

    return opcao;
 }

}


    
        