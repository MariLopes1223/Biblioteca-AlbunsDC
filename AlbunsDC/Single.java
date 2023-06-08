package AlbunsDC;

import java.util.ArrayList;

public class Single extends Album{
    public Single(String nome, String faixaTitle, int minutos, int segundos, int quantMusicas, String MesAnoLancamento, boolean trilogia, ArrayList <Musica> faixas){
        super(nome, faixaTitle, minutos, segundos, quantMusicas, MesAnoLancamento, trilogia, faixas); 
    }
        @Override
        public void descricao(){
            System.out.println("Um album single é um album que possui de 1 a 3 músicas.");
    }
}
