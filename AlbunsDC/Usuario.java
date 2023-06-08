package AlbunsDC;

public class Usuario {
    private String nome;
    private String bias;
    private String TitleFav;
    private String BsideFav;
    private String AlbumFav;

    public Usuario(String nome, String bias, String TitleFav, String BsideFav, String AlbumFav){
        this.nome = nome;
        this.bias = bias;
        this.TitleFav = TitleFav;
        this.BsideFav = BsideFav;
        this.AlbumFav = AlbumFav;
    }

    public Usuario() {
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    public String getNome () {
        return nome;
    }


    public void setBias (String bias) {
        this.bias = bias;
    }

    public String getBias () {
        return bias;
    }


    public void setTitleFav (String TitleFav) {
        this.TitleFav = TitleFav;
    }

    public String getTitleFav () {
        return TitleFav;
    }


    public void setBsideFav (String BsideFav) {
        this.BsideFav = BsideFav;
    }

    public String getBsideFav () {
        return BsideFav;
    }


    public void setAlbumFav (String AlbumFav) {
        this.AlbumFav = AlbumFav;
    }

    public String getAlbumFav () {
        return AlbumFav;
    }
}
