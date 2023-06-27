package AlbunsDC;

import java.util.ArrayList;

public class AlbumRegistro{
    public static ArrayList<Album> registrarAlbuns() {

        MusicasAutorais WTD = new MusicasAutorais("Welcome To Dream", 00, 41, null, false, false);
        MusicasAutorais CM = new MusicasAutorais("Chase Me", 3, 10, null, true, false);
        MusicasAutorais Emotion = new MusicasAutorais("Emotion (소원 하나)", 3, 44, null, false, false);
        MusicasAutorais CMI = new MusicasAutorais("Chase Me (Inst.)", 3, 10, null, false, false);
        ArrayList <MusicasAutorais> listaNightmare = new ArrayList<>();
        listaNightmare.add(WTD);
        listaNightmare.add(CM);
        listaNightmare.add(Emotion);
        listaNightmare.add(CMI);


        MusicasAutorais MT = new MusicasAutorais("My Toys", 1, 07, null, false, false);
        MusicasAutorais GN = new MusicasAutorais("Good Night", 2, 55, null, true, false);
        MusicasAutorais Lullaby = new MusicasAutorais("Lullaby", 3, 19, null, false, false);
        MusicasAutorais GNI = new MusicasAutorais("Good Night (Inst.)", 2, 55, null, false, false);
        ArrayList <MusicasAutorais> listaFAITM = new ArrayList<>();
        listaFAITM.add(MT);
        listaFAITM.add(GN);
        listaFAITM.add(Lullaby);
        listaFAITM.add(GNI);

        
        MusicasAutorais BAI = new MusicasAutorais("Before & After (Intro)", 1, 11, null, false, false);
        MusicasAutorais FH = new MusicasAutorais("날아올라 (Fly High)", 3, 32, null, true, false);
        MusicasAutorais WU = new MusicasAutorais("Wake Up", 3, 33, null, false, false);
        MusicasAutorais SW = new MusicasAutorais("Sleep-Walking", 3, 27, null, false, false);
        MusicasAutorais IO = new MusicasAutorais("It's Okay! (괜찮아!)", 3, 25, null, false, false);
        MusicasAutorais FHI = new MusicasAutorais("날아올라 (Fly High) Inst.", 3, 32, null, false, false);
        ArrayList <MusicasAutorais> listaPrequel = new ArrayList<>();
        listaPrequel.add(BAI);
        listaPrequel.add(FH);
        listaPrequel.add(WU);
        listaPrequel.add(SW);
        listaPrequel.add(IO);
        listaPrequel.add(FHI);

        
        MusicasAutorais FM = new MusicasAutorais("Full Moon", 3, 10, null, true, false);
        MusicasAutorais FMI = new MusicasAutorais("Full Moon (Inst.)", 3, 10, null, false, false);
        ArrayList <MusicasAutorais> listaFM = new ArrayList<>();
        listaFM.add(FM);
        listaFM.add(FMI);

        
        MusicasAutorais IOI = new MusicasAutorais("Inside - Outside (Intro)", 1, 24, null, false, false);
        MusicasAutorais YAI = new MusicasAutorais("You and I", 3, 16, null, true, false);
        MusicasAutorais Mayday = new MusicasAutorais("Mayday", 3, 05, null, false, false);
        MusicasAutorais WAS = new MusicasAutorais("어느 별 (Which A Star)", 4, 9, null, false, false);
        MusicasAutorais Scar = new MusicasAutorais("이 더럽고도 추한... (Scar)", 3, 17, null, false, false);
        MusicasAutorais YAII = new MusicasAutorais("You And I (Inst.)", 3, 16, null, false, false);
        ArrayList <MusicasAutorais> listaETE = new ArrayList<>();
        listaETE.add(IOI);
        listaETE.add(YAI);
        listaETE.add(Mayday);
        listaETE.add(WAS);
        listaETE.add(Scar);
        listaETE.add(YAII);

        
        MusicasAutorais Intro = new MusicasAutorais("Intro - Alone", 1, 07, null, false, false);
        MusicasAutorais What = new MusicasAutorais("What", 3, 26, null, true, false);
        MusicasAutorais Wonderland = new MusicasAutorais("Wonderland", 3, 12, null, false, false);
        MusicasAutorais Trap = new MusicasAutorais("Trap", 3, 11, null, false, false);
        MusicasAutorais J7 = new MusicasAutorais("약속해 우리 (July 7th)", 3, 15, null, false, false);
        MusicasAutorais WI = new MusicasAutorais("What (Inst.)", 3, 26, null, false, false);
        ArrayList <MusicasAutorais> listaAITC = new ArrayList<>();
        listaAITC.add(Intro);
        listaAITC.add(What);
        listaAITC.add(Wonderland);
        listaAITC.add(Trap);
        listaAITC.add(J7);
        listaAITC.add(WI);

      
        MusicasAutorais WJV = new MusicasAutorais("What Japanese Ver.", 3, 28, null, false, true);
        MusicasAutorais CMJV = new MusicasAutorais("Chase Me Japanese Ver.", 3, 12, null, false, true);
        MusicasAutorais IMY = new MusicasAutorais("I Miss You", 3, 9, null, false, true);
        ArrayList <MusicasAutorais> listaWJV = new ArrayList<>();
        listaWJV.add(WJV);
        listaWJV.add(CMJV);
        listaWJV.add(IMY);

        
        MusicasAutorais OTS = new MusicasAutorais("하늘을 넘어 (Over the Sky)", 3, 18, null, true, false);
        MusicasAutorais OTSI = new MusicasAutorais("하늘을 넘어 (Over the Sky) Inst.", 3, 18, null, false, false);
        ArrayList <MusicasAutorais> listaOTS = new ArrayList<>();
        listaOTS.add(OTS);
        listaOTS.add(OTSI);

        
        MusicasAutorais IntroN = new MusicasAutorais("Intro (Intro)", 1, 07, null, false, false);
        MusicasAutorais Piri = new MusicasAutorais("Piri", 3, 27, null, true, false);
        MusicasAutorais Diamond = new MusicasAutorais("Diamond", 3, 22, null, false, false);
        MusicasAutorais ATWNOL = new MusicasAutorais("그리고 아무도 없었다 (And There Was No One Left)", 2, 53, null, false, false);
        MusicasAutorais Daydream = new MusicasAutorais("Daydream (백일몽)", 3, 33, null, false, false);
        MusicasAutorais PI = new MusicasAutorais("Piri (Inst.)", 3, 27, null, false, false);
        ArrayList <MusicasAutorais> listaTEOTN = new ArrayList<>();
        listaTEOTN.add(IntroN);
        listaTEOTN.add(Piri);
        listaTEOTN.add(Diamond);
        listaTEOTN.add(ATWNOL);
        listaTEOTN.add(Daydream);
        listaTEOTN.add(PI);

        
        MusicasAutorais PFWFJV = new MusicasAutorais("Piri ~ Fue wo Fuke ~ -Japanese Ver.", 3, 29, null, false, true);
        MusicasAutorais GNJV = new MusicasAutorais("Good Night - Japanese Ver.", 2, 58, null, false, true);
        MusicasAutorais WoJV = new MusicasAutorais("Wonderland - Japanese Ver.", 3, 14, null, false, true);
        ArrayList <MusicasAutorais> listaPJV = new ArrayList<>();
        listaPJV.add(PFWFJV);
        listaPJV.add(GNJV);
        listaPJV.add(WoJV);


        MusicasAutorais IBO = new MusicasAutorais("Intro - Breaking", 1, 28, null, false, true);
        MusicasAutorais BO = new MusicasAutorais("Breaking Out", 3, 20, null, true, true);
        MusicasAutorais MW = new MusicasAutorais("My Way ~ Kono Michi No Sakie ~", 3, 25, null, false, true);
        MusicasAutorais CMJ = new MusicasAutorais("Chase Me - Japanese Ver.", 3, 12, null, false, true);
        MusicasAutorais GNJV2 = new MusicasAutorais("Good Night - Japanese Ver.", 2, 58, null, false, true);
        MusicasAutorais WoJV2 = new MusicasAutorais("Wonderland - Japanese Ver", 3, 14, null, false, true);
        MusicasAutorais PFWFJV2 = new MusicasAutorais("Piri ~ Fue wo Fuke ~ - Japanese Ver", 3, 29, null, false, true);
        MusicasAutorais WJV2 = new MusicasAutorais("What - Japanese Ver", 3, 28, null, false, true);
        MusicasAutorais IMY2 = new MusicasAutorais("I Miss You", 3, 9, null, false, true);
        MusicasAutorais MHNN = new MusicasAutorais("Mata Hitori Ni Natta - Japanese Ver", 2, 55, null, false, true);
        MusicasAutorais YAIJV = new MusicasAutorais("You And I - Japanese Ver", 3, 16, null, false, true);
        MusicasAutorais Outro = new MusicasAutorais("Outro", 1, 45, null, false, true);
        ArrayList <MusicasAutorais> listaTBOTE = new ArrayList<>();
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


        MusicasAutorais IROD = new MusicasAutorais("Intro - Deja Vu", 1, 32, null, false, false);
        MusicasAutorais DV = new MusicasAutorais("데자부 (Deja Vu)", 3, 45, null, true, false);
        MusicasAutorais TCOTS = new MusicasAutorais("거미의 저주 (The Curse Of The Spider)", 3, 11, null, false, false);
        MusicasAutorais SN = new MusicasAutorais("Silent Night", 3, 19, null, false, false);
        MusicasAutorais Polaris = new MusicasAutorais("북극성 (Polaris)", 3, 54, null, false, false);
        MusicasAutorais DVJV = new MusicasAutorais("Deja Vu (Japanese Ver.)", 3, 45, null, false, false);
        ArrayList <MusicasAutorais> listaROD = new ArrayList<>();
        listaROD.add(IROD);
        listaROD.add(DV);
        listaROD.add(TCOTS);
        listaROD.add(SN);
        listaROD.add(Polaris);
        listaROD.add(DVJV);


        MusicasAutorais ID = new MusicasAutorais("Intro - Scream", 1, 20, null, false, false);
        MusicasAutorais Scream = new MusicasAutorais("Scream", 3, 25, null, true, false);
        MusicasAutorais Tension = new MusicasAutorais("Tension", 3, 12, null, false, false);
        MusicasAutorais RS = new MusicasAutorais("Red Sun", 3, 06, null, false, false);
        MusicasAutorais BOW = new MusicasAutorais("Black Or White", 3, 25, null, false, false);
        MusicasAutorais JB = new MusicasAutorais("Jazz Bar", 3, 35, null, false, false);
        MusicasAutorais Sahara = new MusicasAutorais("SAHARA", 3, 11, null, false, false);
        MusicasAutorais ITF = new MusicasAutorais("In The Frozen", 3, 17, null, false, false);
        MusicasAutorais DB = new MusicasAutorais("Daybreak", 3, 04, null, false, false);
        MusicasAutorais FM2 = new MusicasAutorais("Full Moon", 3, 10, null, false, false);
        MusicasAutorais OTS2 = new MusicasAutorais("Over The Sky", 3, 18, null, false, false);
        MusicasAutorais Outro2 = new MusicasAutorais("Outro", 1, 04, null, false, false);
        MusicasAutorais SI = new MusicasAutorais("Scream (Inst.)", 3, 25, null, false, false);
        MusicasAutorais PSS = new MusicasAutorais("Paradise (Siyeon Solo)", 4, 04, null, false, false);
        ArrayList <MusicasAutorais> listaDTTOL = new ArrayList<>();
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


        MusicasAutorais EN = new MusicasAutorais("Endless Night", 3, 18, null, true, true);
        MusicasAutorais OTSJV = new MusicasAutorais("Over The Sky - Japanese Ver.", 3, 20, null, false, true);
        MusicasAutorais SNJV = new MusicasAutorais("Silent Night - Japanese Ver.", 3, 21, null, false, true);
        ArrayList <MusicasAutorais> listaEN = new ArrayList<>();
        listaEN.add(EN);
        listaEN.add(OTSJV);
        listaEN.add(SNJV);


        MusicasAutorais RB = new MusicasAutorais("R.o.S.E BLUE (Prod ESTi)", 4, 01, null, true, false);
        MusicasAutorais RBI = new MusicasAutorais("R.o.S.E BLUE (Prod ESTi) (Inst.)", 4, 01, null, false, false);
        ArrayList <MusicasAutorais> listaRB = new ArrayList<>();
        listaRB.add(RB);
        listaRB.add(RBI);


        MusicasAutorais ILM = new MusicasAutorais("Intro - Lose", 1, 40, null, false, false);
        MusicasAutorais BOCA = new MusicasAutorais("BOCA", 3, 10, null, true, false);
        MusicasAutorais BTW = new MusicasAutorais("Break The Wall", 3, 47, null, false, false);
        MusicasAutorais CGYOOMM = new MusicasAutorais("Can't Get You Out Of My Mind", 3, 44, null, false, false);
        MusicasAutorais Dear = new MusicasAutorais("Dear", 3, 49, null, false, false);
        MusicasAutorais BI = new MusicasAutorais("BOCA (Inst.)", 3, 10, null, false, false);
        ArrayList <MusicasAutorais> listaDLM = new ArrayList<>();
        listaDLM.add(ILM);
        listaDLM.add(BOCA);
        listaDLM.add(BTW);
        listaDLM.add(CGYOOMM);
        listaDLM.add(Dear);
        listaDLM.add(BI);


        MusicasAutorais NM = new MusicasAutorais("No More", 3, 17, null, true, true);
        ArrayList <MusicasAutorais> listaNM = new ArrayList<>();
        listaNM.add(NM);


        MusicasAutorais IRTU = new MusicasAutorais("Intro - ODD", 1, 32, null, false, false);
        MusicasAutorais OE = new MusicasAutorais("Odd Eye", 3, 05, null, true, false);
        MusicasAutorais WB = new MusicasAutorais("Wind Blows", 3, 18, null, false, false);
        MusicasAutorais PL = new MusicasAutorais("Poison Love", 3, 58, null, false, false);
        MusicasAutorais FourM = new MusicasAutorais("4 Memory", 3, 9, null, false, false);
        MusicasAutorais ND = new MusicasAutorais("New Days", 3, 32, null, false, false);
        MusicasAutorais OEI = new MusicasAutorais("Odd Eye (Inst.)", 3, 05, null, false, false);
        ArrayList <MusicasAutorais> listaDRTU = new ArrayList<>();
        listaDRTU.add(IRTU);
        listaDRTU.add(OE);
        listaDRTU.add(WB);
        listaDRTU.add(PL);
        listaDRTU.add(FourM);
        listaDRTU.add(ND);
        listaDRTU.add(OEI);


        MusicasAutorais Eclipse = new MusicasAutorais("Eclipse", 3, 24, null, true, true);
        MusicasAutorais NM2 = new MusicasAutorais("No More", 3, 17, null, true, true);
        MusicasAutorais DLMF = new MusicasAutorais("Don't Light My Fire", 3, 30, null, false, true);
        MusicasAutorais EI = new MusicasAutorais("Eclipse (Inst.)", 3, 23, null, false, true);
        MusicasAutorais NMI = new MusicasAutorais("No More (Inst.)", 3, 17, null, false, true);
        MusicasAutorais DLMFI = new MusicasAutorais("Don't Light My Fire (Inst.)", 3, 29, null, false, true);
        ArrayList <MusicasAutorais> listaEclipse = new ArrayList<>();
        listaEclipse.add(Eclipse);
        listaEclipse.add(NM2);
        listaEclipse.add(DLMF);
        listaEclipse.add(EI);
        listaEclipse.add(NMI);
        listaEclipse.add(DLMFI);


        MusicasAutorais ISH = new MusicasAutorais("Intro - Summer", 1, 16, null, false, false);
        MusicasAutorais BE = new MusicasAutorais("BEcause", 3, 12, null, true, false);
        MusicasAutorais Airplane = new MusicasAutorais("Airplane", 3, 01, null, false, false);
        MusicasAutorais Whistle = new MusicasAutorais("Whistle", 3, 30, null, false, false);
        MusicasAutorais ADL = new MusicasAutorais("Alldaylong", 3, 38, null, false, false);
        MusicasAutorais AHOS = new MusicasAutorais("A Heart Of Sunflower", 4, 18, null, false, false);
        ArrayList <MusicasAutorais> listaSH = new ArrayList<>();
        listaSH.add(ISH);
        listaSH.add(BE);
        listaSH.add(Airplane);
        listaSH.add(Whistle);
        listaSH.add(ADL);
        listaSH.add(AHOS);


        MusicasAutorais ISU = new MusicasAutorais("Intro: Save Us", 1, 02, null, false, false);
        MusicasAutorais LIAD = new MusicasAutorais("Locked Inside A Door", 3, 8, null, false, false);
        MusicasAutorais Maison = new MusicasAutorais("Maison", 3, 06, null, true, false);
        MusicasAutorais Starlight = new MusicasAutorais("Starlight", 3, 20, null, false, false);
        MusicasAutorais Together = new MusicasAutorais("Together", 3, 45, null, false, false);
        MusicasAutorais ANW = new MusicasAutorais("Always (널 위해)", 4, 30, null, false, false);
        MusicasAutorais STSD = new MusicasAutorais("Skit: The Seven Doors", 1, 46, null, false, false);
        MusicasAutorais CRMJ = new MusicasAutorais("Cherry (Real Miracle) - (JiU Solo)", 3, 16, null, true, false);
        MusicasAutorais NDS = new MusicasAutorais("No Dot (SuA Solo)", 3, 20, null, true, false);
        MusicasAutorais ES = new MusicasAutorais("Entrancing (황흘경 (极夜)) - (Siyeon Solo)", 3, 33, null, true, false);
        MusicasAutorais WH = new MusicasAutorais("Winter (한겨울 (寒冬)) - (Handong Solo)", 3, 52, null, true, false);
        MusicasAutorais FY = new MusicasAutorais("For - (Yoohyeon Solo)", 3, 45, null, true, false);
        MusicasAutorais BFD = new MusicasAutorais("Beauty Full - (Dami Solo)", 3, 04, null, true, false);
        MusicasAutorais PG = new MusicasAutorais("Playground - (Gahyeon Solo)", 3, 02, null, true, false);
        ArrayList <MusicasAutorais> listaASU = new ArrayList<>();
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


        MusicasAutorais ICX = new MusicasAutorais("Intro: Chaotical X", 1, 13, null, false, false);
        MusicasAutorais Vision = new MusicasAutorais("Vision", 3, 10, null, true, false);
        MusicasAutorais FT = new MusicasAutorais("Fairytale", 3, 52, null, false, false);
        MusicasAutorais SL = new MusicasAutorais("Some Love", 2, 53, null, false, false);
        MusicasAutorais RD = new MusicasAutorais("Rainy Day (이 비가 그칠 때면)", 3, 38, null, false, false);
        MusicasAutorais OMN = new MusicasAutorais("Outro: Mother Nature", 1, 12, null, false, false);
        ArrayList <MusicasAutorais> listaAFU = new ArrayList<>();
        listaAFU.add(ICX);
        listaAFU.add(Vision);
        listaAFU.add(FT);
        listaAFU.add(SL);
        listaAFU.add(RD);
        listaAFU.add(OMN);


        MusicasAutorais Reason = new MusicasAutorais("Reason", 3, 23, null, true, false);
        MusicasAutorais RI = new MusicasAutorais("Reason (Inst.)", 3, 23, null, false, false);
        ArrayList <MusicasAutorais> listaReason = new ArrayList<>();
        listaReason.add(Reason);
        listaReason.add(RI);


        MusicasAutorais IFU = new MusicasAutorais("Intro: From Us", 1, 9, null, false, false);
        MusicasAutorais BV = new MusicasAutorais("BONVOYAGE", 3, 34, null, true, false);
        MusicasAutorais Demian = new MusicasAutorais("DEMIAN", 3, 00, null, false, false);
        MusicasAutorais PP = new MusicasAutorais("Propose", 3, 13, null, false, false);
        MusicasAutorais TY = new MusicasAutorais("To. You", 3, 26, null, false, false);
        ArrayList <MusicasAutorais> listaAFrU = new ArrayList<>();
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