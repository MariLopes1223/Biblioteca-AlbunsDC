package AlbunsDC;

import java.util.ArrayList;

public class Playlist {
    private String nome;
    private int horas;
    private int minutos;
    private int segundos;
    private ArrayList <Musicas> songs; 

    public Playlist(String nome, int horas, int minutos, int segundos, ArrayList<Musicas> songs) {
        this.horas = horas;
        this.nome = nome;
        this.minutos = minutos;
        this.segundos = segundos;
        this.songs = songs;
    }

    public Playlist(){};

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public ArrayList<Musicas> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Musicas> songs) {
        this.songs = songs;
    }
}
