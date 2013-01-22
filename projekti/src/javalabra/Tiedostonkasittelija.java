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

        System.out.println("Database ladattu");
    }

    public void save(Rata r) {
        try {
            String tallennettava = r.getNimi() + ".sav";
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

    public Rata load(String radanNimi) {
        try {
            String haettava = radanNimi + ".sav";
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

    public void listaaRadat() {
        String tiedosto;
        File dummy = new File("");
        File kansio = new File(dummy.getAbsolutePath());
        File[] tiedostot = kansio.listFiles();
        
        for (int i = 0; i < tiedostot.length; i++) {
            if(tiedostot[i].isFile()){
                tiedosto = tiedostot[i].getName();
                if(tiedosto.endsWith(".sav")){
                    System.out.println(tiedosto);
                }
            }
        }
    }
}
