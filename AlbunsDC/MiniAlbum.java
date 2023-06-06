package AlbunsDC;

import java.util.ArrayList;

public class MiniAlbum extends Album{
    public MiniAlbum(String nome, String faixaTitle, int minutos, int segundos, int quantMusicas, String MesAnoLancamento, boolean trilogia, ArrayList <Musica> faixas){
        super(nome, faixaTitle, minutos, segundos, quantMusicas, MesAnoLancamento, trilogia, faixas);
    }
    
    @Override
        public void descricao(){
            System.out.println("Um mini album possui de 3 a 7 músicas.");
    }
}
