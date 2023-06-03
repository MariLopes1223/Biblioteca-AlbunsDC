package AlbunsDC;

import java.util.ArrayList;

public class AlbumRegistro{
    public static ArrayList<Album> registrarAlbuns() {
        MiniAlbum Nightmare = new MiniAlbum("Nightmare", "Chase Me", 
        10, 46, 4, "01/2017", true);

        MiniAlbum NFAITM = new MiniAlbum("Nightmare - Fall Asleep In The Mirror", "Good Night", 
        10, 28, 4, 
        "04/2017", true);

        MiniAlbum Prequel = new MiniAlbum("Prequel", "Fly High", 
        18, 40, 6, 
        "07/2017", false);

        Single FM = new Single("Full Moon", "Full Moon", 
        6, 20, 2, 
        "02/2018", false);

        MiniAlbum NETE = new MiniAlbum("Nightmare - Escape The ERA", "You And I", 
        18, 24, 6, 
        "05/2018", true);

        MiniAlbum AITC = new MiniAlbum("Alone In The City", "What", 
        17, 35, 6, 
        "09/2018", false);

        Single WJPVer = new Single("What (JP ver.)", "What (Japanese ver.)", 
        9, 45, 3, 
        "11/2018", false);

        Single OTS = new Single("Over The Sky", "Over The Sky", 
        6, 36, 2, 
        "01/2019", false);

        MiniAlbum NTEON = new MiniAlbum("Nightmare - The End Of The Nightmare", "Piri", 
        17, 48, 6, 
        "02/2019", true);

        Single PFWF = new Single("Piri ~Fue Wo Fuke~", "Piri (Japanese ver.)", 
        9, 40, 3, 
        "03/2019", false);

        FullAlbum TBOTE = new FullAlbum("The Beginning Of The End", "Breaking Out", 
        33, 28, 12, 
        "09/2019", false);

        MiniAlbum ROD = new MiniAlbum("Raid Of Dream", "Deja Vu", 
        14, 56, 6, 
        "09/2019", false);

        FullAlbum DTTOL = new FullAlbum("Dystopia: The Tree Of Language", "Scream", 
        42, 39, 14, 
        "02/2020", true);

        Single EN = new Single("Endless Night", "Endless Night", 
        9, 58, 3, 
        "03/2020", false);

        Single RB = new Single("R.o.S.E BLUE", "R.o.S.E BLUE", 
        8, 00, 2, 
        "07/2020", false);

        MiniAlbum DLM = new MiniAlbum("Dystopia: Lose Myself", "BOCA", 
        18, 9, 6, 
        "08/2020", true);

        Single NM = new Single("No More", "No More", 
        3, 15, 1, 
        "11/2020", false);

        MiniAlbum DRTU = new MiniAlbum("Dystopia: Road To Utopia", "Odd Eye", 
        21, 36, 7, 
        "01/2021", true);

        MiniAlbum Eclipse = new MiniAlbum("Eclipse", "Eclipse", 
        20, 17, 6, 
        "03/2021", false);

        MiniAlbum SH = new MiniAlbum("Summer Holiday", "BEcause", 
        18, 51, 6, 
        "07/2021", false);
    
        FullAlbum ASU = new FullAlbum("Apocalypse: Save Us", "Maison", 
        44, 22, 14, 
        "04/2022", true);

        MiniAlbum AFU = new MiniAlbum("Apocalypse: Follow Us", "Vision", 
        15, 52, 6, 
        "10/2022", true);

        Single Reason = new Single("Reason", "Reason", 
        6, 34, 2, 
        "01/2023", false);

        MiniAlbum AFrU = new MiniAlbum("Apocalypse: From Us", "Bon Voyage", 
        14, 20, 5, 
        "05/2023", true);

        ArrayList <Album> ListaAlbum = new ArrayList<>();

        ListaAlbum.add(Nightmare);
        ListaAlbum.add(NFAITM);
        ListaAlbum.add(Prequel);
        ListaAlbum.add(FM);
        ListaAlbum.add(NETE);
        ListaAlbum.add(AITC);
        ListaAlbum.add(WJPVer);
        ListaAlbum.add(OTS);
        ListaAlbum.add(NTEON);
        ListaAlbum.add(PFWF);
        ListaAlbum.add(TBOTE);
        ListaAlbum.add(ROD);
        ListaAlbum.add(DTTOL);
        ListaAlbum.add(EN);
        ListaAlbum.add(RB);
        ListaAlbum.add(DLM);
        ListaAlbum.add(NM);
        ListaAlbum.add(DRTU);
        ListaAlbum.add(Eclipse);
        ListaAlbum.add(SH);
        ListaAlbum.add(ASU);
        ListaAlbum.add(AFU);
        ListaAlbum.add(Reason);
        ListaAlbum.add(AFrU);

        return ListaAlbum;
    }
}