package AlbunsDC;

public class Musica {
    public String nome;
    public int minutos;
    public int segundos;
    public String estilo;
    public boolean MV;
    public boolean japonesa;

    public Musica (String nome, int minutos, int segundos, String estilo, boolean MV, boolean japonesa){
        this.nome = nome; 
        this.minutos = minutos;
        this.segundos = segundos;
        this.estilo = estilo;
        this.MV = MV;
        this.japonesa = japonesa;
    }
}
