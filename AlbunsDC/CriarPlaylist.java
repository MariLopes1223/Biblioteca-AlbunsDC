package AlbunsDC;

import java.util.ArrayList;
import java.util.Scanner;

public class CriarPlaylist {
    public static Playlist CriaPlaylist(Usuario user, Scanner scan){
        ArrayList <Album> ListaAlbum = AlbumRegistro.registrarAlbuns(); //Pega a lista de albuns a partir do arquivo "AlbumRegistro"
        Playlist favs = new Playlist();
        scan.nextLine();

        System.out.print("Informe como você gostaria de nomear sua playlist: ");
        favs.setNome(scan.nextLine());

        System.out.println("\n" + user.getNome() + ", o nome de sua playlist é " + favs.getNome() + ", no momento sua playlist está vazia. \n");
        
        ArrayList<MusicasAutorais> todasAsMusicasDC = AllSongsDC.TodaAsMusicas(ListaAlbum);
        ArrayList<Cover> TodosCovers = CoverRegistro.registraCover();
        ArrayList<Musicas> todasAsMusicas = new ArrayList<>();

        //adiciona musicas autorais
        for (Musicas musica : todasAsMusicasDC){
            todasAsMusicas.add(musica);
        }

        //adiciona covers
        for (Musicas musica : TodosCovers){
            todasAsMusicas.add(musica);
        }

        int numSong = 1;
        ArrayList<Musicas> Playlist = new ArrayList<>();
        
        System.out.println("-----------------------\n");

        System.out.println(user.getNome() + ", você deseja adicionar as músicas de seu álbum favorito à playlist? \n1 - Sim \n2 - Não \n");
        String resp = scan.nextLine();

        if(resp.equals("1")){
            boolean albumEncontrado = false;
            String albumFav = user.getAlbumFav();
            albumFav = albumFav.toLowerCase();
            
            //adiciona as músicas do album favorito
            for (Album album : ListaAlbum){
                String albumLC = album.nome.toLowerCase();
                
                if (albumLC.contains(albumFav)){
                    ArrayList <MusicasAutorais> faixas = album.getFaixas();
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
            
            //adiciona title e bside favorita
            if (add.equals("1")) {
                int tamAtual = Playlist.size();

                for (MusicasAutorais song : todasAsMusicasDC){
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

            //adiciona apenas title favorita
            else if (add.equals("2")) {
                for (MusicasAutorais song : todasAsMusicasDC){
                String musica = song.nome.toLowerCase();
                    if (musica.contains(titleFav) && song.MV){
                            Playlist.add(song);
                            System.out.println("\nApenas a title foi adicionada.");
                            titleEncontrada = true;
                            break;
                    }
                }
            }

            //adiciona apenas bside favorita
            else if (add.equals("3")){
                for (Musicas song : todasAsMusicas){
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
            System.out.println("Sua title favorita e bside não foram adicionadas à playlist " + favs.getNome());
        }
        System.out.println("-----------------------\n");

        System.out.println("Clique em qualquer tecla para ver quais músicas você pode adicionar à sua playlist.");
        scan.nextLine();
        Funcoes.limpaTela();
        
        ImprimeMusica.ImprimeNomeMus(ListaAlbum);

        int contagem = 1;

        while (numSong != 0){
            System.out.println("\nPara adicionar músicas a sua playlist, informe individualmente seu número de acordo com a lista.\nPara terminar sua playlist digite 0");
            numSong = scan.nextInt();

            //adiciona a música que o usuário escolhe 
            if (numSong != 0){
                contagem = 1;
                
                for (Musicas song : todasAsMusicas){
                    if (numSong == contagem){
                        Playlist.add(song);
                        break;
                    }
                    contagem ++;
                }
            }
        }
        favs.setSongs(Playlist);
        scan.nextLine();

        System.out.println("As músicas que vc adicionou em sua playlist foram: ");

        contagem = 1;

        for (Musicas song : favs.getSongs()){
            System.out.println(contagem + ". " + song.nome + " - " + song.minutos + ":" + song.segundos);
            contagem ++;
        }

        //conta o tempo total da playlist
        Funcoes.contaTempo(favs);

        System.out.println("Sua playlist possui " + favs.getHoras() + " horas " + favs.getMinutos() + " minutos e " + favs.getSegundos() + " segundos.");

        return favs;
    }

    public static Playlist AdicionaMus(Playlist favs, Scanner scan){

        ArrayList <Album> ListaAlbum = AlbumRegistro.registrarAlbuns();
        ArrayList<MusicasAutorais> todasAsMusicas = AllSongsDC.TodaAsMusicas(ListaAlbum);

        System.out.println("As músicas que você pode adicionar em sua playlist são: ");
        
        ImprimeMusica.ImprimeNomeMus(ListaAlbum);
        ArrayList<Musicas> Playlist = favs.getSongs();

        int contagem = 1;
        int numSong = 1;

        while (numSong != 0){
            System.out.println("\nPara adicionar músicas a sua playlist, informe individualmente seu número de acordo com a lista.\nPara terminar sua playlist digite 0");
            numSong = scan.nextInt();

            if (numSong != 0){
                contagem = 1;
                for (Musicas song : todasAsMusicas){
                    if (numSong == contagem){
                        Playlist.add(song);

                        System.out.println("A música " + song.nome + " foi adicionada à playlist.");
                        
                        break;
                    }
                    contagem ++;
                    
                }
            }
        }
        favs.setSongs(Playlist);

        Funcoes.contaTempo(favs);

        return favs;
    }
    
    public static ArrayList<Playlist> ApagaPlaylist(ArrayList <Playlist> todasPlaylists, Scanner scan){

        if (todasPlaylists.isEmpty()){
            System.out.println("Você não pode excluir playlist no momento porque você não possui nenhuma playlist criada.");
        }
        else{
        ImprimirPlaylist.imprimePlaylist(todasPlaylists);

        System.out.println("Informe qual playlist você deseja excluir:");
        int apaga = scan.nextInt();
        int contagem = 1;

        for (Playlist fav : todasPlaylists){
            if (apaga == contagem){
                todasPlaylists.remove(fav);
                break;
            }
            contagem ++;
        }
        System.out.println("A playlist foi excluída.\n");
        }

        return todasPlaylists;
    }
}


