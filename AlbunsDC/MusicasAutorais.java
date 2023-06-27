package AlbunsDC;

public class MusicasAutorais extends Musicas{
    public String estilo;
    public boolean MV;
    public boolean japonesa;

    public MusicasAutorais (String nome, int minutos, int segundos, String estilo, boolean MV, boolean japonesa){
        super (nome, minutos, segundos);
        this.estilo = estilo;
        this.MV = MV;
        this.japonesa = japonesa;
    }
    
}
