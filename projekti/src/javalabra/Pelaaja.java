package javalabra;

import java.util.ArrayList;
import java.util.HashMap;

public class Pelaaja implements java.io.Serializable{

    private String nimi;
    public HashMap<Rata, ArrayList<int[]>> tulokset;

    public Pelaaja(String nimi) {

        this.nimi = nimi;
        tulokset = new HashMap<Rata, ArrayList<int[]>>();
    }
    
    public int tulostenMaara(Rata r){
        return tulokset.get(r).size();
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    @Override
    public String toString() {
        return nimi;
    }

    public void lisaaUusiKierros(Rata rata, int[] kierros) {
        if (!tulokset.containsKey(rata)) {
            ArrayList<int[]> kierrokset = new ArrayList<int[]>();
            kierrokset.add(kierros);
            tulokset.put(rata, kierrokset);
        } else {
            tulokset.get(rata).add(kierros);
        }
    }

//    public void tulostaRadanTulokset(Rata r) {
//        int summa = 0;
//        for (int i = 0; i < tulokset.size(); i++) {
//            for (int j = 0; j < tulokset.get(r).size(); j++) {
//                summa += tulokset.get(r).get(i)[j];
//                System.out.print(tulokset.get(r).get(i)[j] + " ");
//            }
//            System.out.println("");
//        }
//    }
    
    public void tulostaRadanStatsit(Rata rata) {
        System.out.print("Rata: " + rata);
        if (!tulokset.containsKey(rata)) {
            System.out.println("\nEi tuloksia.");
        } else {
            
            for (int i = 0; i < tulokset.get(rata).size(); i++) {
//                System.out.println(tulokset.get(rata).get(i));
                System.out.print("\nKierros " + (i+1) + ". " );
                for (int j = 0; j < tulokset.get(rata).get(i).length; j++) {
                    System.out.print(tulokset.get(rata).get(i)[j] + " ");
                }
            }
            System.out.println("");
        }
    }
}
