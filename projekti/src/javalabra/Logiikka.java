package javalabra;

import java.util.ArrayList;

public class Logiikka {

    private Lukija lukija;
    private Tiedostonkasittelija tk;

    public Logiikka() {
        this.lukija = new Lukija();
    }

    public void kaynnista() {
        tk = new Tiedostonkasittelija();
        System.out.println("-- DISC-GOLF Statsit --");
        
    }


    
    public void uusiRata(){
        System.out.print("Radan nimi? " );
        String radanNimi = lukija.lueMerkkijono();
        if(radanNimi.isEmpty()){
            System.out.print("Syötä radan nimi. ");
            uusiRata();
        }else{
        Rata uusRata = new Rata(radanNimi);
        
        System.out.print("Väylien lukumäärä? ");
        int vaylia = lukija.lueKokonaisluku();
        ArrayList<Integer> vaylat = new ArrayList<Integer>();
        for (int i = 0; i < vaylia; i++) {
            System.out.print((i+1) + ". väylän PAR? ");
            int par = lukija.lueKokonaisluku();
            vaylat.add(par);
        }
        uusRata.setVaylat(vaylat);
        tk.save(uusRata);
        }
    }
    
    
    
    public void radanTiedot(String radanNimi){
        tk.load(radanNimi).tulostaRadanNimi();
        tk.load(radanNimi).tulostaVaylat();
    }
    
    public void listaaRadat(){
        tk.listaaRadat();
    }
}