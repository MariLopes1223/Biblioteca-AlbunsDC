package AlbunsDC;

import java.util.ArrayList;

public abstract class Album implements TrilogiaOuEra{
    public String nome;
    protected String faixaTitle;
    protected int minutos;
    protected int segundos;
    protected int quantMusicas;
    protected String MesAnoLancamento;
    protected boolean trilogia;

    public Album (String nome, String faixaTitle, int minutos, int segundos, int quantMusicas, String MesAnoLancamento, boolean trilogia){
        this.nome = nome;
        this.faixaTitle = faixaTitle;
        this.minutos = minutos;
        this.segundos = segundos;
        this.quantMusicas = quantMusicas;
        this.MesAnoLancamento = MesAnoLancamento;
        this.trilogia = trilogia;
    }

    @Override
    public ArrayList<Album> AdicionaTrilogia(ArrayList <Album> ListaAlbum){
        for (Album album: ListaAlbum){
        if (trilogia){
            ListaAlbum.add(album);
        }
    }
        return ListaAlbum;
    }
}
