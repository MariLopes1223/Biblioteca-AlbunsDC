package AlbunsDC;

import java.util.ArrayList;

public class AlbumRegistro{
    public static ArrayList<Album> registrarAlbuns() {

        Musica WTD = new Musica("Welcome To Dream", 0, 41, null, false, false);
        Musica CM = new Musica("Chase Me", 3, 10, null, true, false);
        Musica Emotion = new Musica("Emotion (소원 하나)", 3, 44, null, false, false);
        Musica CMI = new Musica("Chase Me (Inst.)", 3, 10, null, false, false);
        ArrayList <Musica> listaNightmare = new ArrayList<>();
        listaNightmare.add(WTD);
        listaNightmare.add(CM);
        listaNightmare.add(Emotion);
        listaNightmare.add(CMI);


        Musica MT = new Musica("My Toys", 1, 07, null, false, false);
        Musica GN = new Musica("Good Night", 2, 55, null, true, false);
        Musica Lullaby = new Musica("Lullaby", 3, 19, null, false, false);
        Musica GNI = new Musica("Good Night (Inst.)", 2, 55, null, false, false);
        ArrayList <Musica> listaFAITM = new ArrayList<>();
        listaFAITM.add(MT);
        listaFAITM.add(GN);
        listaFAITM.add(Lullaby);
        listaFAITM.add(GNI);

        
        Musica BAI = new Musica("Before & After (Intro)", 1, 11, null, false, false);
        Musica FH = new Musica("날아올라 (Fly High)", 3, 32, null, true, false);
        Musica WU = new Musica("Wake Up", 3, 33, null, false, false);
        Musica SW = new Musica("Sleep-Walking", 3, 27, null, false, false);
        Musica IO = new Musica("It's Okay! (괜찮아!)", 3, 25, null, false, false);
        Musica FHI = new Musica("날아올라 (Fly High) Inst.", 3, 32, null, false, false);
        ArrayList <Musica> listaPrequel = new ArrayList<>();
        listaPrequel.add(BAI);
        listaPrequel.add(FH);
        listaPrequel.add(WU);
        listaPrequel.add(SW);
        listaPrequel.add(IO);
        listaPrequel.add(FHI);

        
        Musica FM = new Musica("Full Moon", 3, 10, null, true, false);
        Musica FMI = new Musica("Full Moon (Inst.)", 3, 10, null, false, false);
        ArrayList <Musica> listaFM = new ArrayList<>();
        listaFM.add(FM);
        listaFM.add(FMI);

        
        Musica IOI = new Musica("Inside - Outside (Intro)", 1, 24, null, false, false);
        Musica YAI = new Musica("You and I", 3, 16, null, true, false);
        Musica Mayday = new Musica("Mayday", 3, 05, null, false, false);
        Musica WAS = new Musica("어느 별 (Which A Star)", 4, 9, null, false, false);
        Musica Scar = new Musica("이 더럽고도 추한... (Scar)", 3, 17, null, false, false);
        Musica YAII = new Musica("You And I (Inst.)", 3, 16, null, false, false);
        ArrayList <Musica> listaETE = new ArrayList<>();
        listaETE.add(IOI);
        listaETE.add(YAI);
        listaETE.add(Mayday);
        listaETE.add(WAS);
        listaETE.add(Scar);
        listaETE.add(YAII);

        
        Musica Intro = new Musica("Intro", 1, 07, null, false, false);
        Musica What = new Musica("What", 3, 26, null, true, false);
        Musica Wonderland = new Musica("Wonderland", 3, 12, null, false, false);
        Musica Trap = new Musica("Trap", 3, 11, null, false, false);
        Musica J7 = new Musica("약속해 우리 (July 7th)", 3, 15, null, false, false);
        Musica WI = new Musica("What (Inst.)", 3, 26, null, false, false);
        ArrayList <Musica> listaAITC = new ArrayList<>();
        listaAITC.add(Intro);
        listaAITC.add(What);
        listaAITC.add(Wonderland);
        listaAITC.add(Trap);
        listaAITC.add(J7);
        listaAITC.add(WI);

      
        Musica WJV = new Musica("What Japanese Ver.", 3, 28, null, false, true);
        Musica CMJV = new Musica("Chase Me Japanese Ver.", 3, 12, null, false, true);
        Musica IMY = new Musica("I Miss You", 3, 9, null, false, true);
        ArrayList <Musica> listaWJV = new ArrayList<>();
        listaWJV.add(WJV);
        listaWJV.add(CMJV);
        listaWJV.add(IMY);

        
        Musica OTS = new Musica("하늘을 넘어 (Over the Sky)", 3, 18, null, true, false);
        Musica OTSI = new Musica("하늘을 넘어 (Over the Sky) Inst.", 3, 18, null, false, false);
        ArrayList <Musica> listaOTS = new ArrayList<>();
        listaOTS.add(OTS);
        listaOTS.add(OTSI);

        
        Musica IntroN = new Musica("Intro", 1, 07, null, false, false);
        Musica Piri = new Musica("Piri", 3, 27, null, true, false);
        Musica Diamond = new Musica("Diamond", 3, 22, null, false, false);
        Musica ATWNOL = new Musica("그리고 아무도 없었다 (And There Was No One Left)", 2, 53, null, false, false);
        Musica Daydream = new Musica("Daydream (백일몽)", 3, 33, null, false, false);
        Musica PI = new Musica("Piri (Inst.)", 3, 27, null, false, false);
        ArrayList <Musica> listaTEOTN = new ArrayList<>();
        listaTEOTN.add(IntroN);
        listaTEOTN.add(Piri);
        listaTEOTN.add(Diamond);
        listaTEOTN.add(ATWNOL);
        listaTEOTN.add(Daydream);
        listaTEOTN.add(PI);

        
        Musica PFWFJV = new Musica("Piri ~ Fue wo Fuke ~ -Japanese Ver.", 3, 29, null, false, true);
        Musica GNJV = new Musica("Good Night - Japanese Ver.", 2, 58, null, false, true);
        Musica WoJV = new Musica("Wonderland - Japanese Ver.", 3, 14, null, false, true);
        ArrayList <Musica> listaPJV = new ArrayList<>();
        listaPJV.add(PFWFJV);
        listaPJV.add(GNJV);
        listaPJV.add(WoJV);


        Musica IBO = new Musica("Intro", 1, 28, null, false, true);
        Musica BO = new Musica("Breaking Out", 3, 20, null, true, true);
        Musica MW = new Musica("My Way ~ Kono Michi No Sakie ~", 3, 25, null, false, true);
        Musica CMJ = new Musica("Chase Me - Japanese Ver.", 3, 12, null, false, true);
        Musica GNJV2 = new Musica("Good Night - Japanese Ver.", 2, 58, null, false, true);
        Musica WoJV2 = new Musica("Wonderland - Japanese Ver", 3, 14, null, false, true);
        Musica PFWFJV2 = new Musica("Piri ~ Fue wo Fuke ~ - Japanese Ver", 3, 29, null, false, true);
        Musica WJV2 = new Musica("What - Japanese Ver", 3, 28, null, false, true);
        Musica IMY2 = new Musica("I Miss You", 3, 9, null, false, true);
        Musica MHNN = new Musica("Mata Hitori Ni Natta - Japanese Ver", 2, 55, null, false, true);
        Musica YAIJV = new Musica("You And I - Japanese Ver", 3, 16, null, false, true);
        Musica Outro = new Musica("Outro", 1, 45, null, false, true);
        ArrayList <Musica> listaTBOTE = new ArrayList<>();
        listaTBOTE.add(IBO);
        listaTBOTE.add(BO);
        listaTBOTE.add(MW);
        listaTBOTE.add(CMJ);
        listaTBOTE.add(GNJV2);
        listaTBOTE.add(WoJV2);
        listaTBOTE.add(PFWFJV2);
        listaTBOTE.add(WJV2);
        listaTBOTE.add(IMY2);
        listaTBOTE.add(MHNN);
        listaTBOTE.add(YAIJV);
        listaTBOTE.add(Outro);


        Musica IROD = new Musica("Intro", 1, 32, null, false, false);
        Musica DV = new Musica("데자부 (Deja Vu)", 3, 45, null, true, false);
        Musica TCOTS = new Musica("거미의 저주 (The Curse Of The Spider)", 3, 11, null, false, false);
        Musica SN = new Musica("Silent Night", 3, 19, null, false, false);
        Musica Polaris = new Musica("북극성 (Polaris)", 3, 54, null, false, false);
        Musica DVJV = new Musica("Deja Vu (Japanese Ver.)", 3, 45, null, false, false);
        ArrayList <Musica> listaROD = new ArrayList<>();
        listaROD.add(IROD);
        listaROD.add(DV);
        listaROD.add(TCOTS);
        listaROD.add(SN);
        listaROD.add(Polaris);
        listaROD.add(DVJV);


        Musica ID = new Musica("Intro", 1, 20, null, false, false);
        Musica Scream = new Musica("Scream", 3, 25, null, true, false);
        Musica Tension = new Musica("Tension", 3, 12, null, false, false);
        Musica RS = new Musica("Red Sun", 3, 06, null, false, false);
        Musica BOW = new Musica("Black Or White", 3, 25, null, false, false);
        Musica JB = new Musica("Jazz Bar", 3, 35, null, false, false);
        Musica Sahara = new Musica("SAHARA", 3, 11, null, false, false);
        Musica ITF = new Musica("In The Frozen", 3, 17, null, false, false);
        Musica DB = new Musica("Daybreak", 3, 04, null, false, false);
        Musica FM2 = new Musica("Full Moon", 3, 10, null, false, false);
        Musica OTS2 = new Musica("Over The Sky", 3, 18, null, false, false);
        Musica Outro2 = new Musica("Outro", 1, 04, null, false, false);
        Musica SI = new Musica("Scream (Inst.)", 3, 25, null, false, false);
        Musica PSS = new Musica("Paradise (Siyeon Solo)", 4, 04, null, false, false);
        ArrayList <Musica> listaDTTOL = new ArrayList<>();
        listaDTTOL.add(ID);
        listaDTTOL.add(Scream);
        listaDTTOL.add(Tension);
        listaDTTOL.add(RS);
        listaDTTOL.add(BOW);
        listaDTTOL.add(JB);
        listaDTTOL.add(Sahara);
        listaDTTOL.add(ITF);
        listaDTTOL.add(DB);
        listaDTTOL.add(FM2);
        listaDTTOL.add(OTS2);
        listaDTTOL.add(Outro2);
        listaDTTOL.add(SI);
        listaDTTOL.add(PSS);


        Musica EN = new Musica("Endless Night", 3, 18, null, true, true);
        Musica OTSJV = new Musica("Over The Sky - Japanese Ver.", 3, 20, null, false, true);
        Musica SNJV = new Musica("Silent Night - Japanese Ver.", 3, 21, null, false, true);
        ArrayList <Musica> listaEN = new ArrayList<>();
        listaEN.add(EN);
        listaEN.add(OTSJV);
        listaEN.add(SNJV);


        Musica RB = new Musica("R.o.S.E BLUE (Prod ESTi)", 4, 01, null, true, false);
        Musica RBI = new Musica("R.o.S.E BLUE (Prod ESTi) (Inst.)", 4, 01, null, false, false);
        ArrayList <Musica> listaRB = new ArrayList<>();
        listaRB.add(RB);
        listaRB.add(RBI);


        Musica ILM = new Musica("Intro", 1, 40, null, false, false);
        Musica BOCA = new Musica("BOCA", 3, 10, null, true, false);
        Musica BTW = new Musica("Break The Wall", 3, 47, null, false, false);
        Musica CGYOOMM = new Musica("Can't Get You Out Of My Mind", 3, 44, null, false, false);
        Musica Dear = new Musica("Dear", 3, 49, null, false, false);
        Musica BI = new Musica("BOCA (Inst.)", 3, 10, null, false, false);
        ArrayList <Musica> listaDLM = new ArrayList<>();
        listaDLM.add(ILM);
        listaDLM.add(BOCA);
        listaDLM.add(BTW);
        listaDLM.add(CGYOOMM);
        listaDLM.add(Dear);
        listaDLM.add(BI);


        Musica NM = new Musica("No More", 3, 17, null, true, true);
        ArrayList <Musica> listaNM = new ArrayList<>();
        listaNM.add(NM);


        Musica IRTU = new Musica("Intro", 1, 32, null, false, false);
        Musica OE = new Musica("Odd Eye", 3, 05, null, true, false);
        Musica WB = new Musica("Wind Blows", 3, 18, null, false, false);
        Musica PL = new Musica("Poison Love", 3, 58, null, false, false);
        Musica FourM = new Musica("4 Memory", 3, 9, null, false, false);
        Musica ND = new Musica("New Days", 3, 32, null, false, false);
        Musica OEI = new Musica("Odd Eye (Inst.)", 3, 05, null, false, false);
        ArrayList <Musica> listaDRTU = new ArrayList<>();
        listaDRTU.add(IRTU);
        listaDRTU.add(OE);
        listaDRTU.add(WB);
        listaDRTU.add(PL);
        listaDRTU.add(FourM);
        listaDRTU.add(ND);
        listaDRTU.add(OEI);


        Musica Eclipse = new Musica("Eclipse", 3, 24, null, true, true);
        Musica NM2 = new Musica("No More", 3, 17, null, true, true);
        Musica DLMF = new Musica("Don't Light My Fire", 3, 30, null, false, true);
        Musica EI = new Musica("Eclipse (Inst.)", 3, 23, null, false, true);
        Musica NMI = new Musica("No More (Inst.)", 3, 17, null, false, true);
        Musica DLMFI = new Musica("Don't Light My Fire (Inst.)", 3, 29, null, false, true);
        ArrayList <Musica> listaEclipse = new ArrayList<>();
        listaEclipse.add(Eclipse);
        listaEclipse.add(NM2);
        listaEclipse.add(DLMF);
        listaEclipse.add(EI);
        listaEclipse.add(NMI);
        listaEclipse.add(DLMFI);


        Musica ISH = new Musica("Intro", 1, 16, null, false, false);
        Musica BE = new Musica("BEcause", 3, 12, null, true, false);
        Musica Airplane = new Musica("Airplane", 3, 01, null, false, false);
        Musica Whistle = new Musica("Whistle", 3, 30, null, false, false);
        Musica ADL = new Musica("Alldaylong", 3, 38, null, false, false);
        Musica AHOS = new Musica("A Heart Of Sunflower", 4, 18, null, false, false);
        ArrayList <Musica> listaSH = new ArrayList<>();
        listaSH.add(ISH);
        listaSH.add(BE);
        listaSH.add(Airplane);
        listaSH.add(Whistle);
        listaSH.add(ADL);
        listaSH.add(AHOS);


        Musica ISU = new Musica("Intro: Save Us", 1, 02, null, false, false);
        Musica LIAD = new Musica("Locked Inside A Door", 3, 8, null, false, false);
        Musica Maison = new Musica("Maison", 3, 06, null, true, false);
        Musica Starlight = new Musica("Starlight", 3, 20, null, false, false);
        Musica Together = new Musica("Together", 3, 45, null, false, false);
        Musica ANW = new Musica("Always (널 위해)", 4, 30, null, false, false);
        Musica STSD = new Musica("Skit: The Seven Doors", 1, 46, null, false, false);
        Musica CRMJ = new Musica("Cherry (Real Miracle) - (JiU Solo)", 3, 16, null, true, false);
        Musica NDS = new Musica("No Dot (SuA Solo)", 3, 20, null, true, false);
        Musica ES = new Musica("Entrancing (황흘경 (极夜)) - (Siyeon Solo)", 3, 33, null, true, false);
        Musica WH = new Musica("Winter (한겨울 (寒冬)) - (Handong Solo)", 3, 52, null, true, false);
        Musica FY = new Musica("For - (Yoohyeon Solo)", 3, 45, null, true, false);
        Musica BFD = new Musica("Beauty Full - (Dami Solo)", 3, 04, null, true, false);
        Musica PG = new Musica("Playground - (Gahyeon Solo)", 3, 02, null, true, false);
        ArrayList <Musica> listaASU = new ArrayList<>();
        listaASU.add(ISU);
        listaASU.add(LIAD);
        listaASU.add(Maison);
        listaASU.add(Starlight);
        listaASU.add(Together);
        listaASU.add(ANW);
        listaASU.add(STSD);
        listaASU.add(CRMJ);
        listaASU.add(NDS);
        listaASU.add(ES);
        listaASU.add(WH);
        listaASU.add(FY);
        listaASU.add(BFD);
        listaASU.add(PG);


        Musica ICX = new Musica("Intro: Chaotical X", 1, 13, null, false, false);
        Musica Vision = new Musica("Vision", 3, 10, null, true, false);
        Musica FT = new Musica("Fairytale", 3, 52, null, false, false);
        Musica SL = new Musica("Some Love", 2, 53, null, false, false);
        Musica RD = new Musica("Rainy Day (이 비가 그칠 때면)", 3, 38, null, false, false);
        Musica OMN = new Musica("Outro: Mother Nature", 1, 12, null, false, false);
        ArrayList <Musica> listaAFU = new ArrayList<>();
        listaAFU.add(ICX);
        listaAFU.add(Vision);
        listaAFU.add(FT);
        listaAFU.add(SL);
        listaAFU.add(RD);
        listaAFU.add(OMN);


        Musica Reason = new Musica("Reason", 3, 23, null, true, false);
        Musica RI = new Musica("Reason (Inst.)", 3, 23, null, false, false);
        ArrayList <Musica> listaReason = new ArrayList<>();
        listaReason.add(Reason);
        listaReason.add(RI);


        Musica IFU = new Musica("Intro: From Us", 1, 9, null, false, false);
        Musica BV = new Musica("BONVOYAGE", 3, 34, null, true, false);
        Musica Demian = new Musica("DEMIAN", 3, 00, null, false, false);
        Musica PP = new Musica("Propose", 3, 13, null, false, false);
        Musica TY = new Musica("To. You", 3, 26, null, false, false);
        ArrayList <Musica> listaAFrU = new ArrayList<>();
        listaAFrU.add(IFU);
        listaAFrU.add(BV);
        listaAFrU.add(Demian);
        listaAFrU.add(PP);
        listaAFrU.add(TY);




        MiniAlbum Nightmare = new MiniAlbum("Nightmare", "Chase Me", 
        10, 46, 4, "01/2017", true, listaNightmare);

        MiniAlbum NFAITM = new MiniAlbum("Nightmare - Fall Asleep In The Mirror", "Good Night", 
        10, 28, 4, 
        "04/2017", true, listaFAITM);

        MiniAlbum Prequel = new MiniAlbum("Prequel", "Fly High", 
        18, 40, 6, 
        "07/2017", false, listaPrequel);

        Single FMA = new Single("Full Moon", "Full Moon", 
        6, 20, 2, 
        "02/2018", false, listaFM);

        MiniAlbum NETE = new MiniAlbum("Nightmare - Escape The ERA", "You And I", 
        18, 24, 6, 
        "05/2018", true, listaETE);

        MiniAlbum AITC = new MiniAlbum("Alone In The City", "What", 
        17, 35, 6, 
        "09/2018", false, listaAITC);

        Single WJPVer = new Single("What (JP ver.)", "What (Japanese ver.)", 
        9, 45, 3, 
        "11/2018", false, listaWJV);

        Single OTSA = new Single("Over The Sky", "Over The Sky", 
        6, 36, 2, 
        "01/2019", false, listaOTS);

        MiniAlbum NTEON = new MiniAlbum("Nightmare - The End Of The Nightmare", "Piri", 
        17, 48, 6, 
        "02/2019", true, listaTEOTN);

        Single PFWF = new Single("Piri ~Fue Wo Fuke~", "Piri (Japanese ver.)", 
        9, 40, 3, 
        "03/2019", false, listaPJV);

        FullAlbum TBOTE = new FullAlbum("The Beginning Of The End", "Breaking Out", 
        33, 28, 12, 
        "09/2019", false, listaTBOTE);

        MiniAlbum ROD = new MiniAlbum("Raid Of Dream", "Deja Vu", 
        14, 56, 6, 
        "09/2019", false, listaROD);

        FullAlbum DTTOL = new FullAlbum("Dystopia: The Tree Of Language", "Scream", 
        42, 39, 14, 
        "02/2020", true, listaDTTOL);

        Single ENA = new Single("Endless Night", "Endless Night", 
        9, 58, 3, 
        "03/2020", false, listaEN);

        Single RBA = new Single("R.o.S.E BLUE", "R.o.S.E BLUE", 
        8, 00, 2, 
        "07/2020", false, listaRB);

        MiniAlbum DLM = new MiniAlbum("Dystopia: Lose Myself", "BOCA", 
        18, 9, 6, 
        "08/2020", true, listaDLM);

        Single NMA = new Single("No More", "No More", 
        3, 15, 1, 
        "11/2020", false, listaNM);

        MiniAlbum DRTU = new MiniAlbum("Dystopia: Road To Utopia", "Odd Eye", 
        21, 36, 7, 
        "01/2021", true, listaDRTU);

        MiniAlbum EclipseA = new MiniAlbum("Eclipse", "Eclipse", 
        20, 17, 6, 
        "03/2021", false, listaEclipse);

        MiniAlbum SH = new MiniAlbum("Summer Holiday", "BEcause", 
        18, 51, 6, 
        "07/2021", false, listaSH);
    
        FullAlbum ASU = new FullAlbum("Apocalypse: Save Us", "Maison", 
        44, 22, 14, 
        "04/2022", true, listaASU);

        MiniAlbum AFU = new MiniAlbum("Apocalypse: Follow Us", "Vision", 
        15, 52, 6, 
        "10/2022", true, listaAFU);

        Single ReasonA = new Single("Reason", "Reason", 
        6, 34, 2, 
        "01/2023", false, listaReason);

        MiniAlbum AFrU = new MiniAlbum("Apocalypse: From Us", "Bon Voyage", 
        14, 20, 5, 
        "05/2023", true, listaAFrU);

        ArrayList <Album> ListaAlbum = new ArrayList<>();

        ListaAlbum.add(Nightmare);
        ListaAlbum.add(NFAITM);
        ListaAlbum.add(Prequel);
        ListaAlbum.add(FMA);
        ListaAlbum.add(NETE);
        ListaAlbum.add(AITC);
        ListaAlbum.add(WJPVer);
        ListaAlbum.add(OTSA);
        ListaAlbum.add(NTEON);
        ListaAlbum.add(PFWF);
        ListaAlbum.add(TBOTE);
        ListaAlbum.add(ROD);
        ListaAlbum.add(DTTOL);
        ListaAlbum.add(ENA);
        ListaAlbum.add(RBA);
        ListaAlbum.add(DLM);
        ListaAlbum.add(NMA);
        ListaAlbum.add(DRTU);
        ListaAlbum.add(EclipseA);
        ListaAlbum.add(SH);
        ListaAlbum.add(ASU);
        ListaAlbum.add(AFU);
        ListaAlbum.add(ReasonA);
        ListaAlbum.add(AFrU);

        return ListaAlbum;
    }
}