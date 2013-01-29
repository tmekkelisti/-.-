package javalabra;

import java.util.ArrayList;

public class Logiikka {

    private Lukija lukija;
    private Tiedostonkasittelija tk;
    private ArrayList<Pelaaja> kierroksenPelaajat;

    public Logiikka() {
        this.lukija = new Lukija();
        this.tk = new Tiedostonkasittelija();
        this.kierroksenPelaajat = new ArrayList<Pelaaja>();        
    }
    public void uusiPelaaja(){
        System.out.print("Pelaajan nimi? ");
        String pelaajanNimi = lukija.lueMerkkijono();
        if(pelaajanNimi.isEmpty()){
            System.out.print("Syötä pelaajan nimi.");
            uusiPelaaja();
        }else {
            Pelaaja uusPelaaja = new Pelaaja(pelaajanNimi);
            tk.savePelaaja(uusPelaaja);
            System.out.println("Pelaaja " + pelaajanNimi + " on tallennettu.");
        }
        
        
        
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
        tk.saveRata(uusRata);
        System.out.println("Rata " + radanNimi + " on tallennettu.");
        System.out.println("Parit: "); 
        tk.loadRata(radanNimi).tulostaVaylat();
        }
    }
    
    
    
    public void radanTiedot(String radanNimi){
        tk.loadRata(radanNimi).tulostaRadanNimi();
        tk.loadRata(radanNimi).tulostaVaylat();
    }
    
    public void listaaRadat(){
        tk.listaa("radat");
    }
    
    public void listaaPelaajat(){
        tk.listaa("pelaajat");
    }
    
    public void lisaaPelaajaPeliin(String pelaajanNimi){
        kierroksenPelaajat.add(tk.loadPelaaja(pelaajanNimi));
    }
    
    public void tallennaKierros(Rata r, int[] kierros){
        for (Pelaaja p : kierroksenPelaajat) {
            p.lisaaUusiKierros(r, kierros);
            tk.savePelaaja(p);
        }
    }
}