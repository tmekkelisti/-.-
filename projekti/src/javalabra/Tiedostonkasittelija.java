/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javalabra;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author tme
 */
public class Tiedostonkasittelija {

    public Tiedostonkasittelija() {
    }

//    public void save(Object o) {
//        try {
//
//            Pelaaja p = new Pelaaja("");
//            String tallennettava;
//            if (o.getClass().equals(p.getClass())) {
//                tallennettava = o.toString() + ".pel";
//            } else {
//                tallennettava = o.toString() + ".rat";
//            }
//
//
//
//            FileOutputStream fileOut = new FileOutputStream(tallennettava);
//            ObjectOutputStream out = new ObjectOutputStream(fileOut);
//            out.writeObject(o);
//
//            out.close();
//            fileOut.close();
//
//
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
    public void saveRata(Rata r) {
        try {
            String tallennettava = r.getNimi() + ".rat";
            FileOutputStream fileOut = new FileOutputStream(tallennettava);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(r);

            out.close();
            fileOut.close();



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void savePelaaja(Pelaaja p) {
        try {
            String tallennettava = p.getNimi() + ".pel";
            FileOutputStream fileOut = new FileOutputStream(tallennettava);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(p);

            out.close();
            fileOut.close();



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
    public Rata loadRata(String radanNimi) {
        try {
            String haettava = radanNimi + ".rat";
            FileInputStream saveFile = new FileInputStream(haettava);
            ObjectInputStream save = new ObjectInputStream(saveFile);

            Rata r = (Rata) save.readObject();
            save.close();
            return r;

        } catch (Exception exc) {
            exc.printStackTrace();
            return null;
        }

    }

    public Pelaaja loadPelaaja(String pelaajanNimi) {
        try {
            String haettava = pelaajanNimi + ".pel";
            FileInputStream saveFile = new FileInputStream(haettava);
            ObjectInputStream save = new ObjectInputStream(saveFile);

            Pelaaja p = (Pelaaja) save.readObject();
            save.close();
            return p;

        } catch (Exception exc) {
            exc.printStackTrace();
            return null;
        }

    }

    public void listaa(String komento) {
        String paate = "";
        if (komento.equals("radat")) {
            paate = ".rat";
            System.out.println("\nRadat:");
        } else {
            paate = ".pel";
            System.out.println("\nPelaajat:");
        }


        String tiedosto;
        File dummy = new File("");
        File kansio = new File(dummy.getAbsolutePath());
        File[] tiedostot = kansio.listFiles();

        for (int i = 0; i < tiedostot.length; i++) {
            if (tiedostot[i].isFile()) {
                tiedosto = tiedostot[i].getName();
                if (tiedosto.endsWith(paate)) {
                    System.out.println(tiedosto.substring(0, tiedosto.length() - 4));
                }
            }
        }
    }
}
