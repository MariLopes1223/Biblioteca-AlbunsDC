package AlbunsDC;

import java.util.ArrayList;

public class Single extends Album{
    public Single(String nome, String faixaTitle, int minutos, int segundos, int quantMusicas, String MesAnoLancamento, boolean trilogia, ArrayList <MusicasAutorais> faixas){
        super(nome, faixaTitle, minutos, segundos, quantMusicas, MesAnoLancamento, trilogia, faixas); 
    }

    public Single() {
    }

    @Override
    public void descreveTipoAlbum(){
        System.out.println("Um Single tem de 1 a 3 músicas.");
    }
}
