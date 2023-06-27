package AlbunsDC;

import java.util.ArrayList;

public class FullAlbum extends Album{
    public FullAlbum(String nome, String faixaTitle, int minutos, int segundos, int quantMusicas, String MesAnoLancamento, boolean trilogia, ArrayList <MusicasAutorais> faixas){
        super(nome, faixaTitle, minutos, segundos, quantMusicas, MesAnoLancamento, trilogia, faixas);
    }

    @Override
        public void descricao(){
            System.out.println("Um album possui a partir de 8 músicas.");
    }
}
