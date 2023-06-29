package AlbunsDC;

import java.util.ArrayList;

public class MiniAlbum extends Album{
    public MiniAlbum(String nome, String faixaTitle, int minutos, int segundos, int quantMusicas, String MesAnoLancamento, boolean trilogia, ArrayList <MusicasAutorais> faixas){
        super(nome, faixaTitle, minutos, segundos, quantMusicas, MesAnoLancamento, trilogia, faixas);
    }

    public MiniAlbum() {
    }

    @Override
    public void descreveTipoAlbum(){
        System.out.println("Um Mini Album tem de 4 a 9 músicas.");
    }
}
