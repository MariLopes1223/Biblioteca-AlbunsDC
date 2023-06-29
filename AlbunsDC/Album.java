package AlbunsDC;

import java.util.ArrayList;

public abstract class Album implements TrilogiaOuEra, TocaIntro{
    public String nome;
    protected String faixaTitle;
    protected int minutos;
    protected int segundos;
    protected int quantMusicas;
    protected String MesAnoLancamento;
    protected boolean trilogia;
    protected ArrayList<MusicasAutorais> faixas;

    public Album (String nome, String faixaTitle, int minutos, int segundos, int quantMusicas, String MesAnoLancamento, boolean trilogia, ArrayList <MusicasAutorais> faixas){
        this.nome = nome;
        this.faixaTitle = faixaTitle;
        this.minutos = minutos;
        this.segundos = segundos;
        this.quantMusicas = quantMusicas;
        this.MesAnoLancamento = MesAnoLancamento;
        this.trilogia = trilogia;
        this.faixas = faixas;
    }

    public Album(){}

    public ArrayList <MusicasAutorais> getFaixas(){
        return this.faixas;
    }

    public abstract void descreveTipoAlbum();

    public ArrayList<Album> AdicionaTrilogia(ArrayList <Album> ListaAlbum){
        ArrayList<Album> Trilogias = new ArrayList<>();
        for (Album album: ListaAlbum){
        if (album.trilogia){
            Trilogias.add(album);
        }
    }
        return Trilogias;
    }
}
