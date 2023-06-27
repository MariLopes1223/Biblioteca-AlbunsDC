package AlbunsDC;

public abstract class Musicas {
    public String nome;
    public int minutos;
    public int segundos;

    public Musicas (String nome, int minutos, int segundos){
        this.nome = nome; 
        this.minutos = minutos;
        this.segundos = segundos;
    }
}
