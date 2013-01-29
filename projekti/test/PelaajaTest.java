/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javalabra.Pelaaja;
import javalabra.Rata;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author teeyoshi
 */
public class PelaajaTest {
    
    Pelaaja p;
    
    public PelaajaTest() {
    }
       
    @Before
    public void setUp() {
        p = new Pelaaja("peluri");
    }
    
    @Test
    public void PelaajanKonstruktoriAsettaaOikeanNimen(){
        assertEquals("peluri", p.getNimi());
    }
    
    @Test
    public void toStringPalauttaaOikein(){
        //koska load/save toimii toStringin mukaan
        assertEquals("peluri", p.toString());
    }
    
    @Test
    public void kierroksenLisaysToimii(){
        Rata r = new Rata("testirata");
        int[] kierros = {2,3,1};
        p.lisaaUusiKierros(r, kierros);
        
        assertEquals(2, p.tulokset.get(r).get(0)[0]);
        assertEquals(3, p.tulokset.get(r).get(0)[1]);
        assertEquals(1, p.tulokset.get(r).get(0)[2]);
    }
    
}
