package AlbunsDC;

public class Cover extends Musicas{
    protected static final String video = "Special Clip";
    protected String cantorOriginal;
    protected String integrantes;

    public Cover (String nome, int minutos, int segundos, String cantorOriginal, String integrantes){
        super(nome, minutos, segundos);
        this.cantorOriginal = cantorOriginal;
        this.integrantes = integrantes;
    }

}
