/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javalabra;

/**
 *
 * @author tme
 */
public class Kayttoliittyma {

    private Lukija lukija;
    private Logiikka lg;

    public Kayttoliittyma() {
        this.lg = new Logiikka();
        this.lukija = new Lukija();
        alkuvalikko();
    }

    private void alkuvalikko() {
        System.out.println("");
        System.out.println("--- DISC-GOLF Statsit ---\n");

        System.out.println("1. Uusi peli");
        System.out.println("2. Lisää rata");
        System.out.println("3. Lisää pelaaja");
        System.out.println("4. Statsit");
        System.out.println("5. Poistu");
        System.out.println("6. TESTING");
        System.out.print("-- ");

//        int komentoInt = lukija.lueKokonaisluku();
//        Integer komento = komentoInt;

        String komento = lukija.lueMerkkijono();


        if (komento.equals("1")) {
//            uusiPeli();
        } else if (komento.equals("2")) {
            lisaaRata();
        } else if (komento.equals("3")) {
            lisaaPelaaja();
        } else if (komento.equals("4")) {
//            statsit();
        } else if (komento.equals("5")) {
//            poistu();
        } else if (komento.equals("6")) {
            testing();
        } else {
            alkuvalikko();
        }
    }

    private void uusiPeli() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private void lisaaRata() {
        lg.uusiRata();
        painaNappainta();
        alkuvalikko();
    }

    private void lisaaPelaaja() {
        lg.uusiPelaaja();
        painaNappainta();
        alkuvalikko();
    }

    private void statsit() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private void poistu() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private void painaNappainta() {
        String nappain = lukija.lueMerkkijono();
    }

    private void testing() {
        lg.listaaPelaajat();
        System.out.println("");
        lg.listaaRadat();
        
    }
}
