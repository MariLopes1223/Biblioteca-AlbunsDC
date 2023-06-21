package AlbunsDC;

import java.util.ArrayList;
import java.util.Scanner;

public class CriarPlaylist {
    public static Playlist CriaPlaylist(Usuario user){
        ArrayList <Album> ListaAlbum = AlbumRegistro.registrarAlbuns(); //Pega a lista de albuns a partir do arquivo "AlbumRegistro"
        Playlist favs = new Playlist();
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe como você gostaria de nomear sua playlist: ");
        favs.setNome(scan.nextLine());

        System.out.println("\n" + user.getNome() + "o nome de sua playlist é " + favs.getNome() + ", no momento sua playlist está vazia. \n");
        
        ArrayList<Musica> todasAsMusicas = AllSongs.TodaAsMusicas(ListaAlbum);
        ImprimeMusica.ImprimeNomeMus(ListaAlbum);

        int numSong = 1;
        ArrayList<Musica> Playlist = new ArrayList<>();
        
        System.out.println("-----------------------\n");

        System.out.println(user.getNome() + ", você deseja adicionar as músicas de seu álbum favorito à playlist? \n1 - Sim \n2 - Não \n");
        String resp = scan.nextLine();

        if(resp.equals("1")){
            boolean albumEncontrado = false;
            String albumFav = user.getAlbumFav();
            albumFav = albumFav.toLowerCase();
            
            for (Album album : ListaAlbum){
                String albumLC = album.nome.toLowerCase();
                
                if (albumLC.contains(albumFav)){
                    ArrayList <Musica> faixas = album.getFaixas();
                    Playlist.addAll(faixas);
                    System.out.println("As músicas do álbum " + album.nome + " foram adicionadas à playlist.");
                    albumEncontrado = true;
                    break;
                }
            }
            if (!albumEncontrado) {
                System.out.println("O álbum " + albumFav + " não foi encontrado.");
            }
        }
        else {
            System.out.println("O álbum não foi adicionado");
        }

        System.out.println("\nDeseja adicionar sua title e bside favorita? \n1 - Adiciona ambos \n2 - Adiciona apenas a title \n3 - Adiciona apenas a bside \n4 - Não adiciona nenhuma\n");
        String add = scan.nextLine();

        if (!add.equals("4")){

            boolean titleEncontrada = false;
            boolean bsideEncontrada = false;

            String titleFav = user.getTitleFav();
            titleFav = titleFav.toLowerCase();
            String bsideFav = user.getBsideFav();
            bsideFav = bsideFav.toLowerCase();
            
            if (add.equals("1")) {
                int tamAtual = Playlist.size();

                for (Musica song : todasAsMusicas){
                    int tamApos = Playlist.size();

                    String musica = song.nome.toLowerCase();
                        
                        if (musica.contains(titleFav) || musica.contains(bsideFav)){
                            
                            if (musica.contains(titleFav) && song.MV){
                                Playlist.add(song);
                                titleEncontrada = true;
                                System.out.println("\nA title foi adicionada.");
                            }
                            else if(musica.contains(bsideFav)) {
                                Playlist.add(song);
                                bsideEncontrada = true;
                                System.out.println("\nA bside foi adicionada.");
                            }
                            if (tamAtual + 2 == tamApos){
                                break;
                            }
                            
                        }  
                }
            }

            else if (add.equals("2")) {
                for (Musica song : todasAsMusicas){
                String musica = song.nome.toLowerCase();
                    if (musica.contains(titleFav) && song.MV){
                            Playlist.add(song);
                            System.out.println("\nApenas a title foi adicionada.");
                            titleEncontrada = true;
                            break;
                    }
                }
            }
            else if (add.equals("3")){
                for (Musica song : todasAsMusicas){
                String musica = song.nome.toLowerCase();
                    if (musica.contains(bsideFav)){
                            Playlist.add(song);
                            System.out.println("\nApenas a bside foi adicionada.");
                            bsideEncontrada = true;
                            break;
                    }
                }
            }

        if (!titleEncontrada && add.equals("1")) {
                System.out.println("A title " + titleFav + " não foi encontrada.");
            }
            else if (!bsideEncontrada && add.equals("1")) {
                System.out.println("A bside " + bsideFav + " não foi encontrada.");
            }

        }
        else {
            System.out.println("Sua title favorita e bsside não foram adicionadas à playlist " + favs.getNome());
        }
        System.out.println("-----------------------\n");
        
        int contagem = 1;

        while (numSong != 0){
            System.out.println("\nPara adicionar músicas a sua playlist, informe individualmente seu número de acordo com a lista.\nPara terminar sua playlist digite 0");
            numSong = scan.nextInt();

            if (numSong != 0){
                contagem = 1;
                
                for (Musica song : todasAsMusicas){
                    if (numSong == contagem){
                        Playlist.add(song);
                        break;
                    }
                    contagem ++;
                }
            }
        }
        favs.setSongs(Playlist);

        System.out.println("As músicas que vc adicionou em sua playlist foram: ");

        int PMinutos = 0;
        int PSegundos = 0;
        int PHoras = 0;

        for (Musica song : favs.getSongs()){
            System.out.println(song.nome + " - " + song.minutos + ":" + song.segundos);

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
        }

        System.out.println("Sua playlist possui " + PHoras + " horas " + PMinutos + " minutos e " + PSegundos + " segundos.");

        return favs;
    }
}


