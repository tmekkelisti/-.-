package javalabra;

import java.util.ArrayList;

public class Rata implements java.io.Serializable {

    private String nimi;
    private ArrayList<Integer> vaylat;

    public Rata(String nimi) {
        this.nimi = nimi;
    }

    public void setVaylat(ArrayList<Integer> vaylat) {
        this.vaylat = vaylat;
    }

    public ArrayList<Integer> getVaylat() {
        return vaylat;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getNimi() {
        return nimi;
    }

    @Override
    public String toString() {
        return this.nimi;
    }

    public void tulostaRadanNimi() {
        System.out.println(this.nimi);
    }

    public void tulostaVaylat() {
        for (int i : vaylat) {
            System.out.print(i + " ");
        }
    }
}
