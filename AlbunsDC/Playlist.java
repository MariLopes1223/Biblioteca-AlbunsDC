package AlbunsDC;

import java.util.ArrayList;

public class Playlist {
    private String nome;
    private int minutos;
    private int segundos;
    private ArrayList <Musica> songs; 

    public Playlist(String nome, int minutos, int segundos, ArrayList<Musica> songs) {
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

    public ArrayList<Musica> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Musica> songs) {
        this.songs = songs;
    }
}
